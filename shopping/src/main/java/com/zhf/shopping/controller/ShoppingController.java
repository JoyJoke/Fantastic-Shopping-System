package com.zhf.shopping.controller;

import com.github.pagehelper.PageInfo;
import com.zhf.shopping.entity.Items;
import com.zhf.shopping.entity.OrderDetail;
import com.zhf.shopping.entity.Orders;
import com.zhf.shopping.rabbitmq.annotation.SysLogger;
import com.zhf.shopping.service.ItemsService;
import com.zhf.shopping.service.OrderDetailService;
import com.zhf.shopping.service.OrdersService;
import com.zhf.shopping.service.UserService;
import com.zhf.shopping.util.UserUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.stream.Collectors;

@Controller
public class ShoppingController {

    @Autowired
    private UserService userService;
    @Autowired
    private OrdersService ordersService;
    @Autowired
    private OrderDetailService detailService;
    @Autowired
    private ItemsService itemsService;

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login")
    @SysLogger("/login")
    public String login() {
        return "login";
    }

    @RequestMapping("/home")
    public String homePage(Model model) {
        model.addAttribute("user", getUsername());
        model.addAttribute("role", getAuthority());
        return "home";
    }

    @RequestMapping(value = "/admin")
    public String adminPage(Model model) {
        model.addAttribute("user", getUsername());
        model.addAttribute("role", getAuthority());
        return "admin";
    }

    @RequestMapping(value = "/dba")
    public String dbaPage(Model model) {
        model.addAttribute("user", getUsername());
        model.addAttribute("role", getAuthority());
        return "dba";
    }

    @RequestMapping(value = "/accessDenied")
    public String accessDeniedPage(Model model) {
        model.addAttribute("user", getUsername());
        model.addAttribute("role", getAuthority());
        return "accessDenied";
    }


    @RequestMapping(value = "/logout")
    public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
        // Authentication是一个接口，表示用户认证信息
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        // 如果用户认知信息不为空，注销
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        // 重定向到login页面
        return "redirect:/login?logout";
    }

    /**
     * 获得当前用户名称
     */
    private String getUsername() {
        // 从SecurityContex中获得Authentication对象代表当前用户的信息
        String username = UserUtils.getCurrentAuthentication().getName();
        System.out.println("username = " + username);
        return username;
    }

    /**
     * 获得当前用户权限
     */
    private String getAuthority() {

        return UserUtils.getCurrentAuthentication().getAuthorities().stream().map(a -> a.getAuthority()).collect(Collectors.joining());

    }

//    @ResponseBody
//    @GetMapping("orders/get")
//    public User getOrdersByUserId(@RequestParam("userId") Integer userId) {
//        //stringRedisTemplate.opsForValue().set("orders", userService.findOrdersByUserId(userId).toString());
//        return userService.findOrdersByUserId(userId);
//    }

    @ResponseBody
    @GetMapping("user/orders")
    public PageInfo<Orders> getOrdersByUserId(@RequestParam("userId") Integer userId, @RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize) {
        //stringRedisTemplate.opsForValue().set("orders", userService.findOrdersByUserId(userId).toString());
        return userService.findOrdersByUserId(userId, page, pageSize);
    }

    @PreAuthorize("hasAuthority('ROLE_ADMIN')")
    @ResponseBody
    @GetMapping("user/items")
    public PageInfo<Items> getItemsByUserId(@RequestParam("userId") Integer userId, @RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize) {
        return userService.findItemsByUserId(userId, page, pageSize);
    }

    @ResponseBody
    @GetMapping("order/details")
    public PageInfo<OrderDetail> findOrderDetailsByOrderId(@RequestParam("orderId") Integer orderId, @RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize) {
        return ordersService.findOrderDetailsByOrderId(orderId, page, pageSize);
    }

}

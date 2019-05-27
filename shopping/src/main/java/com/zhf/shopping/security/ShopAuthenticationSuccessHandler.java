package com.zhf.shopping.security;

import com.zhf.shopping.util.UserUtils;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Component
public class ShopAuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {
    // Spring Security 通过RedirectStrategy对象负责所有重定向事务
    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    /*
     * 重写handle方法，方法中通过RedirectStrategy对象重定向到指定的url
     * */
    @Override
    protected void handle(HttpServletRequest request, HttpServletResponse response,
                          Authentication authentication)
            throws IOException {
        // 通过determineTargetUrl方法返回需要跳转的url
        String targetUrl = "";
        if (UserUtils.hasRole("ROLE_ADMIN")) {
            targetUrl = "/admin";
        } else if (UserUtils.hasRole("ROLE_USER")) {
            targetUrl = "/home";
        } else targetUrl = "/accessDenied";
        // 重定向请求到指定的url
        redirectStrategy.sendRedirect(request, response, targetUrl);
    }


}



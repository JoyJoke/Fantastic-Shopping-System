package com.zhf.shopping;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ShoppingApplicationTests {

    @Test
    public void encodePassword() {
        String password = new BCryptPasswordEncoder().encode("12345");
        System.out.println("##############" + password);
    }

}

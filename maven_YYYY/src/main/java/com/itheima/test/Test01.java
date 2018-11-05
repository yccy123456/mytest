package com.itheima.test;

import com.itheima.domain.Account;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {

    @Test
    public void testFindAll(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        Account accountDao = ac.getBean("accountDao", Account.class);

    }
}

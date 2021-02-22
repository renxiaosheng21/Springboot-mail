package com.mail.test.demo.service;


import com.mail.test.demo.MailTestApplication;
import com.mail.test.demo.mail.MailService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MailTestApplication.class)
public class MailTests {
    @Resource
    MailService mailService;

    @Test
    public void sayHelloTest() {
        mailService.sayHello();
    }

    @Test
    public void sendSimpleMailTest() {
        mailService.sendSimpleMail("17839944341@163.com","这是第一封邮件","Java Springboot测试的邮件");
    }
}

package com.example.jishixingle.ctrl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.mail.MessagingException;
import java.util.Date;
import java.util.Random;

@Controller
@RequestMapping("/email")
public class EmailController {

//    注入邮件工具类
    @Autowired
    private JavaMailSenderImpl javaMailSender;

    @Value("${spring.mail.username}")
    private String sendMailer;

//     发送邮件
//     title 标题 （字符串）
//     text 主题内容（字符串）
//     receive 邮件的接受人（字符串）
    @RequestMapping("setEmail")
    public String sendEmail() {
//    public void sendEmail(String title,String text,String receive) {

        Random random = new Random();
        int yzm = random.nextInt(8999) + 1000;

        String title = "验证码";
        String text = String.valueOf(yzm);
        String receive = "484425684@qq.com";
        try {
            //true 代表支持复杂的类型
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(javaMailSender.createMimeMessage(),true);
            //邮件发信人
            mimeMessageHelper.setFrom(sendMailer);
            //邮件收信人
            mimeMessageHelper.setTo(receive);
            //邮件主题
            mimeMessageHelper.setSubject(title);
            //邮件内容
            mimeMessageHelper.setText(text);
            //邮件发送时间
            mimeMessageHelper.setSentDate(new Date());
            //发送邮件
            javaMailSender.send(mimeMessageHelper.getMimeMessage());
            System.out.println("发送邮件成功：" +sendMailer+"--->"+receive);

        } catch (MessagingException e) {
            e.printStackTrace();
            System.out.println("发送邮件失败："+e.getMessage());
        }

        return "register";

    }

}

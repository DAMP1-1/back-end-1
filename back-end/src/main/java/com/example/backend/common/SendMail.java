//package com.example.backend.common;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.mail.SimpleMailMessage;
//import org.springframework.mail.javamail.JavaMailSender;
//import org.springframework.stereotype.Service;
//
//@Service
//public class SendMail {
//
//    @Autowired
//    private JavaMailSender mailSender;
//
//    public void sendMail(String toMail, String subject, String body){
//        SimpleMailMessage message = new SimpleMailMessage();
//        message.setFrom("tuan94pth@gmail.com");
//        message.setTo(toMail);
//        message.setText(body);
//        message.setSubject(subject);
//
//        mailSender.send(message);
//
//        System.out.println("Send success!!");
//    }
//}

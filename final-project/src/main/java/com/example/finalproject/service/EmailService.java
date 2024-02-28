package com.example.finalproject.service;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.File;

@Service
public class EmailService {
    private JavaMailSender javaMailSender;

    public EmailService(JavaMailSender javaMailSender) {
        this.javaMailSender = javaMailSender;
    }

    @Value("${spring.mail.username}")
    private String sender;

    public void sendAttachedMail(String receiver) throws MessagingException {
        // Creating a mime message
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        MimeMessageHelper mimeMessageHelper;
        // Setting multipart as true for attachments to
        // be send
        mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
        mimeMessageHelper.setFrom(sender);
        mimeMessageHelper.setTo(receiver);
        mimeMessageHelper.setText("Email có đính kèm file");
        mimeMessageHelper.setSubject("[DEMO MAIL] Gửi mail kèm file");

        // Adding the attachment
        FileSystemResource file = new FileSystemResource(new File("data/1.jpg"));
        mimeMessageHelper.addAttachment(file.getFilename(), file);

        // Sending the mail
        javaMailSender.send(mimeMessage);
    }

        @Async
        public void verifyAccount (Long id, String name, String receiver) throws MessagingException {
            // Creating a mime message
            MimeMessage mimeMessage = javaMailSender.createMimeMessage();
            MimeMessageHelper mimeMessageHelper;
            // Setting multipart as true for attachments to be send
            mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            mimeMessageHelper.setFrom(sender);
            mimeMessageHelper.setTo(receiver);
            mimeMessageHelper.setSubject("[Rạp Chiếu Phim] Kích hoạt tài khoản");

            String emailContent = "Xin chào <b>" + name + "</b>,<br>" +
                    "Chúc mừng bạn đã đăng ký thành công tài khoản với username " + receiver +
                    ".<br> Vui lòng click vào liên kết sau để kích hoạt tài khoản: <br><br>" +
                    "<a class=\"btn btn-primary f-500\" target=\"_blank\" " +
                    "href=\"http://localhost:8080/accounts/" + id + "/activation\">Kích hoạt tài khoản</a>";
            mimeMessageHelper.setText(emailContent, true);

            // Sending the mail
            javaMailSender.send(mimeMessage);
        }

}

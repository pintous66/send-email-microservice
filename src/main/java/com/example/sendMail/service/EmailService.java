package com.example.sendMail.service;

import com.example.sendMail.domain.Email;
import com.example.sendMail.enums.StatusEmail;
import com.example.sendMail.repository.EmailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailException;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class EmailService {
    @Autowired
    EmailRepository emailRepository;
    @Autowired
    JavaMailSender javaMailSender;

    public Email sendEmail(Email email) {
        email.setSendDateEmail(LocalDateTime.now());
        try{
            SimpleMailMessage message = new SimpleMailMessage();
            message.setFrom(email.getEmailFrom());
            message.setTo(email.getEmailTo());
            message.setSubject(email.getSubject());
            message.setText(email.getText());
            javaMailSender.send(message);

            email.setStatusEmail(StatusEmail.SENT);
        }catch (MailException e){
            email.setStatusEmail(StatusEmail.ERROR);
        }finally {
            return emailRepository.save(email);
        }
    }
}

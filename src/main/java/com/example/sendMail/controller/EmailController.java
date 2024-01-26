package com.example.sendMail.controller;

import com.example.sendMail.domain.Email;
import com.example.sendMail.dto.EmailDto;
import com.example.sendMail.service.EmailService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    EmailService emailService;

    @PostMapping("/sendemail")
    public ResponseEntity<Email> sendEmail(@RequestBody @Valid EmailDto data){
        Email email = new Email();
        BeanUtils.copyProperties(data,email);
        return  new ResponseEntity<>( emailService.sendEmail(email), HttpStatus.ACCEPTED);
    }

}

package com.example.sendMail.domain;

import com.example.sendMail.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "email")
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emailid")
    private Long emailId;

    @Column(name = "ownerref")
    private String ownerRef;
    @Column(name = "emailfrom")
    private String emailFrom;
    @Column(name = "emailto")
    private String emailTo;
    @Column(name = "subject")
    private String subject;
    @Column(name = "text")
    private String text;
    @Column(name = "senddateemail")
    private LocalDateTime sendDateEmail;
    @Column(name = "statusemail")
    private StatusEmail statusEmail;

}

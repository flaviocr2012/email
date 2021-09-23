package com.ms.email.model;

import com.ms.email.enums.StatusEmail;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "TB_EMAIL")
public class EmailModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long emailId;
    private String ownerRef;
    private String emailFrom;
    private String emailTo;
    private String subject;
    // Com a propriedade columnDefinition é possível aumentar a quantidade de caracteres
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sendDateTime;
    private StatusEmail statusEmail;

}

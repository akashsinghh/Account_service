package com.Account.Account_service.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.persistence.*;
import javax.validation.constraints.*;



@Data

@Entity


public class Bank_Service {
    @Id
    @GeneratedValue
    Long id;

    private   String name;
    @NotNull
    private String accountno;
    @Size(max=10)
    private String phoneno;
    private String permanent_address;

    @Pattern(regexp =  "[A-Z]{5}[0-9]{4}[A-Z]{1}",message="length must be 10")

    @Size(max = 10)
    @Column(name = "pan_Number", nullable = false)
    private String pan_Number;
    //    @Pattern(regexp =  "^[2-9]{1}[0-9]{3}\\s[0-9]{4}\\s[0-9]{4}$",message = "Length must be 12")
    @Size(max = 12)
    @Column(name = "adhar_Number", nullable = false)
    private String adhar_Number;
    private String amount;

    public Bank_Service() {
    }



}


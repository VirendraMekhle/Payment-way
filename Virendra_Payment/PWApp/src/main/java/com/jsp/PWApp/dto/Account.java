package com.jsp.PWApp.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @OneToOne
    @JsonIgnore
    @JoinColumn(name = "user_id", unique = true)
    private User user;

    private long accountNo;
    private double minBal, balance, initialAmount;
    private String password;
}

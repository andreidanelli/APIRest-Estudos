package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.demo.utils.EnumSituacao;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Cargo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 3)
    @Enumerated(EnumType.STRING)
    private EnumSituacao situacao;
}

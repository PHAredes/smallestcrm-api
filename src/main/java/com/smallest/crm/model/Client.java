package com.smallest.crm.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;
@Data
@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

}

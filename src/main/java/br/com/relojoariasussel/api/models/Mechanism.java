package br.com.relojoariasussel.api.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Mechanism {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "mechanism")
    private List<Watch> watches;
}

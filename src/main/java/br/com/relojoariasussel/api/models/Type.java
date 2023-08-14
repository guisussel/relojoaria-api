package br.com.relojoariasussel.api.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "types")
public class Type {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "type")
    private List<Watch> watches;
}

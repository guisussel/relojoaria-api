package br.com.relojoariasussel.api.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "materials")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "caseMaterial")
    private List<Watch> watchesCaseMaterial;

    @OneToMany(mappedBy = "strapMaterial")
    private List<Watch> watchesStrapMaterial;
}

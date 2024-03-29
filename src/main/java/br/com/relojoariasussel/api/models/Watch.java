package br.com.relojoariasussel.api.models;

import jakarta.persistence.*;

@Entity
@Table(name = "watches")
public class Watch {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String reference;
    private Float value;

    @ManyToOne
    @JoinColumn(name = "case_material_id")
    private Material caseMaterial;

    @ManyToOne
    @JoinColumn(name = "strap_material_id")
    private Material strapMaterial;

    @ManyToOne
    @JoinColumn(name = "type_id")
    private Type type;

    @ManyToOne
    @JoinColumn(name = "mechanism_id")
    private Mechanism mechanism;

    private String caseColor;
    private String strapColor;
    private String dialColor;
    private String dial;
    private String description;
    private String gemstone;
    private String brand;

    @Lob
    private byte[] picture;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public Float getValue() {
        return value;
    }

    public void setValue(Float value) {
        this.value = value;
    }

    public Material getCaseMaterial() {
        return caseMaterial;
    }

    public void setCaseMaterial(Material caseMaterial) {
        this.caseMaterial = caseMaterial;
    }

    public Material getStrapMaterial() {
        return strapMaterial;
    }

    public void setStrapMaterial(Material strapMaterial) {
        this.strapMaterial = strapMaterial;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Mechanism getMechanism() {
        return mechanism;
    }

    public void setMechanism(Mechanism mechanism) {
        this.mechanism = mechanism;
    }

    public String getCaseColor() {
        return caseColor;
    }

    public void setCaseColor(String caseColor) {
        this.caseColor = caseColor;
    }

    public String getStrapColor() {
        return strapColor;
    }

    public void setStrapColor(String strapColor) {
        this.strapColor = strapColor;
    }

    public String getDialColor() {
        return dialColor;
    }

    public void setDialColor(String dialColor) {
        this.dialColor = dialColor;
    }

    public String getDial() {
        return dial;
    }

    public void setDial(String dial) {
        this.dial = dial;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGemstone() {
        return gemstone;
    }

    public void setGemstone(String gemstone) {
        this.gemstone = gemstone;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }
}

package com.example.demo.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "product")
@NamedQueries({
        @NamedQuery(name = "Product.retrieveAll", query = "SELECT DISTINCT c FROM Product c"),
})
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "standard_unit", nullable = false)
    private String standardUnit;

    @Column(name = "energy")
    private Double energy;

    @OneToMany(mappedBy = "product")
    private Set<Ingredient> ingredients;

    public Product() {}

    public Product(String name, String standardUnit) {
        this.name = name;
        this.standardUnit = standardUnit;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getStandardUnit() {
        return standardUnit;
    }
    public void setStandardUnit(String unit) {
        this.standardUnit = unit;
    }

    public Double getEnergy() {
        return energy;
    }

    public void setEnergy(Double energy) {
        this.energy = energy;
    }

    @Override
    public String toString() {
        return "Product [id=" + id + ", name=" + name + ", unit=" + standardUnit + "]";
    }

}
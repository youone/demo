package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredient")
public class Ingredient {

    private long id;
    private Product product;
    private Double amount;
    private String unit;
    public Ingredient() {

    }

    public Ingredient(Product product, Double amount, String unit) {
        this.product = product;
        this.amount = amount;
        this.unit = unit;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    @OneToOne()
    @JoinColumn(name = "id", columnDefinition = "product", nullable = false)
    public Product getProduct() {
            return product;
        }
    public void setProduct(Product product) {
        this.product = product;
    }

    @Column(name = "unit", nullable = false)
    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }

    @Column(name = "amount", nullable = false)
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", amount=" + amount + ", unit=" + unit + "]";
    }

}
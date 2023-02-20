package com.example.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "ingredient")
public class Ingredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "amount", nullable = false)
    private Double amount;

    @Column(name = "unit", nullable = false)
    private String unit;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private Product product;

    public Ingredient() {}

    public Ingredient(Product product, Double amount, String unit) {
        this.product = product;
        this.amount = amount;
        this.unit = unit;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public Product getProduct() {
            return product;
        }
    public void setProduct(Product product) {
        this.product = product;
    }

    public String getUnit() {
        return unit;
    }
    public void setUnit(String unit) {
        this.unit = unit;
    }

    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Ingredient [id=" + id + ", amount=" + amount + ", unit=" + unit + "]";
    }

}
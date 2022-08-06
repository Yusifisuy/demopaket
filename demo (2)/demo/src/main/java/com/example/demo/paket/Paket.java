package com.example.demo.paket;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table

public class Paket {
    @Id
    @SequenceGenerator(
            name = "paket_sequence",
            sequenceName = "paket_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "paket_sequence"
    )
    private Long id;
    private int b;
    private String a;

    public Paket() {
    }

    public Paket(Long id, int b, String a) {
        this.id = id;
        this.b = b;
        this.a = a;
    }

    public Paket(@JsonProperty("b") int b,@JsonProperty("a") String a) {
        this.b = b;
        this.a = a;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    @Override
    public String toString() {
        return "Paket{" +
                "id=" + id +
                ", b=" + b +
                ", a='" + a + '\'' +
                '}';
    }
}

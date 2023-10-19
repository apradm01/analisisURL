package com.analizarurl.demo.model;

import jakarta.persistence.*;

@Entity
@Table(name = "keyword")
public class Keyword {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int keyword_id;
    @ManyToOne
    @JoinColumn (name="direccion_id")
    private Direccion direccion;
    private String key;

    public Keyword() {

    }

    public Keyword(String key) {
        this.key = key;
    }


    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}

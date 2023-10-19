package com.analizarurl.demo.model;

import jakarta.persistence.*;

@Entity
@Table (name = "titulos")
public class Titulo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int titulo_id;
    private int h1;
    private int h2;
    private int h3;
    private int h4;
    @ManyToOne
    @JoinColumn(name="direccion_id")
    private Direccion direccion;

    public Titulo() {

    }

    public Titulo(int h1, int h2, int h3, int h4) {
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        this.h4 = h4;
    }

    public int getH1() {
        return h1;
    }

    public void setH1(int h1) {
        this.h1 = h1;
    }

    public int getH2() {
        return h2;
    }

    public void setH2(int h2) {
        this.h2 = h2;
    }

    public int getH3() {
        return h3;
    }

    public void setH3(int h3) {
        this.h3 = h3;
    }

    public int getH4() {
        return h4;
    }

    public void setH4(int h4) {
        this.h4 = h4;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}

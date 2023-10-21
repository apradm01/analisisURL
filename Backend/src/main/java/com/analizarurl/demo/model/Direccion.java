package com.analizarurl.demo.model;

import jakarta.persistence.*;

@Entity
@Table (name = "direccion")
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int direccion_id;
    private String url;
    private String title;
    private String description;
    private boolean html5;
    private int images;
    private String createdAt;
    private String keywords;
    private int h1;
    private int h2;
    private int h3;
    private int h4;

    public Direccion() {

    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
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

    public Direccion(String url, String title, String description, boolean html5, int images, String createdAt, String keywords, int h1, int h2, int h3, int h4) {
        this.url = url;
        this.title = title;
        this.description = description;
        this.html5 = html5;
        this.images = images;
        this.createdAt = createdAt;
        this.keywords = keywords;
        this.h1 = h1;
        this.h2 = h2;
        this.h3 = h3;
        this.h4 = h4;
    }

    public int getDireccion_id() {
        return direccion_id;
    }

    public void setDireccion_id(int direccion_id) {
        this.direccion_id = direccion_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHtml5() {
        return html5;
    }

    public void setHtml5(boolean html5) {
        this.html5 = html5;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }
}

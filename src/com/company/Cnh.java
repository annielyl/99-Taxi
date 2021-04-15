package com.company;

public class Cnh {

    private String id;
    private String category;
    private String validity ;

    public Cnh(String id, String category, String validity ) {
        this.id=id;
        this.category=category;
        this.validity =validity;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getValidity() {
        return validity;
    }

    public void setValidity(String validity) {
        this.validity = validity;
    }
}

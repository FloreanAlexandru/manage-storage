package com.example.trutziwms;

import com.google.gson.annotations.SerializedName;

public class Item {

    @SerializedName("codGestiune")
    private String codGest;
    private String denGest;
    private String stoc;

    public Item(String codGest, String denGest, String stoc) {
        this.codGest = codGest;
        this.denGest = denGest;
        this.stoc = stoc;
    }

    public String getCodGest() {
        return codGest;
    }

    public void setCodGest(String codGest) {
        this.codGest = codGest;
    }

    public String getDenGest() {
        return denGest;
    }

    public void setDenGest(String denGest) {
        this.denGest = denGest;
    }

    public String getStoc() {
        return stoc;
    }

    public void setStoc(String stoc) {
        this.stoc = stoc;
    }

    @Override
    public String toString() {
        return "Item{" +
                "codGest='" + codGest + '\'' +
                ", denGest='" + denGest + '\'' +
                ", stoc='" + stoc + '\'' +
                '}';
    }
}

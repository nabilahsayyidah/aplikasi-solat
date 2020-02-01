package com.example.aplikasi_sholat.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResponseItem {
    @SerializedName("items")
    private List<Item> event;

    public List<Item> getItem() {
        return event;
    }

    public void setItemt(List<Item> event) {
        this.event = event;
    }
}

package com.example.aplikasi_sholat.api;

import com.example.aplikasi_sholat.model.Item;
import com.example.aplikasi_sholat.model.Modul;
import com.example.aplikasi_sholat.model.ResponseItem;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {

    @GET("padang.json")
    Call<Modul> getJadwal();
}

package com.example.aplikasi_sholat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.                      TextView;
import android.widget.Toast;


import com.example.aplikasi_sholat.api.ApiService;
import com.example.aplikasi_sholat.api.ApiUrl;
import com.example.aplikasi_sholat.model.Item;
import com.example.aplikasi_sholat.model.Modul;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JadwalSholat extends AppCompatActivity {

    private TextView tv_lokasi_tempat, tv_matahari, tv_subuh, tv_zuhur, tv_ashar,
            tv_maghrib, tv_isya;
    private FloatingActionButton fab_refresh;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jadwal_sholat);

        tv_lokasi_tempat = findViewById(R.id.tv_lokasi_tempat);
        tv_matahari = findViewById(R.id.tv_matahari);
        tv_subuh = findViewById(R.id.tv_subuh);
        tv_ashar = findViewById(R.id.tv_ashar);
        tv_maghrib = findViewById(R.id.tv_maghrib);
        tv_isya = findViewById(R.id.tv_isya);
        fab_refresh = findViewById(R.id.fab_refresh);

        getJadwal();

        fab_refresh.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                getJadwal();
            }
        });
    }

    private void getJadwal (){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiUrl.URL_ROOT_HTTP)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        ApiService apiService = retrofit.create(ApiService.class);
        Call<ResponseBody> call = apiService.getJadwal();

        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (response.isSuccessful()){

                    try{
                        JSONObject jsonRESULTS = new JSONObject(response.body().string());

                        tv_subuh.setText(jsonRESULTS.getJSONObject("items").getString("fajr"));
                        tv_zuhur.setText(jsonRESULTS.getJSONObject("items").getString("dhuhr"));
                        tv_ashar.setText(jsonRESULTS.getJSONObject("items").getString("asr"));
                        tv_maghrib.setText(jsonRESULTS.getJSONObject("items").getString("maghrib"));
                        tv_isya.setText(jsonRESULTS.getJSONObject("items").getString("isha"));
                    } catch (JSONException e){
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                } else {

                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable throwable) {
                Toast.makeText(getApplicationContext(), "No Internet Connection"+ throwable, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

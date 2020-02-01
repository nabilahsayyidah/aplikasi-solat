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
import com.example.aplikasi_sholat.model.ResponseItem;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.List;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class JadwalSholat extends AppCompatActivity {

    TextView tv_lokasi_tempat, tv_matahari, tv_subuh, tv_zuhur, tv_ashar, tv_maghrib, tv_isya;
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
        tv_zuhur = findViewById(R.id.tv_zuhur);
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
        Call<Modul> call = apiService.getJadwal();

        call.enqueue(new Callback<Modul>() {
            @Override
            public void onResponse(Call<Modul> call, Response<Modul> response) {
                if (response.isSuccessful()){
                    tv_lokasi_tempat.setText(response.body().getState());
                    final List<Item> items = response.body().getItems();
                    tv_matahari.setText(items.get(0).getShurooq());
                    tv_subuh.setText(items.get(0).getFajr());
                    tv_zuhur.setText(items.get(0).getDhuhr());
                    tv_ashar.setText(items.get(0).getAsr());
                    tv_matahari.setText(items.get(0).getMaghrib());
                    tv_isya.setText(items.get(0).getIsha());
                } else {

                }
            }

            @Override
            public void onFailure(Call<Modul> call, Throwable throwable) {
                Toast.makeText(getApplicationContext(), "No Internet Connection"+ throwable, Toast.LENGTH_SHORT).show();
            }
        });
    }
}

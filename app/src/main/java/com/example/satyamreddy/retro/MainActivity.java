/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.satyamreddy.retro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    String BASE_URL = "https://api.mlab.com/api/1/databases/mydbdata/collections/";
    RetroInter apis;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

apis=RetrofitServer.getUrl().create(RetroInter.class);
Call<List<Student>> ss=apis.getStudents();
ss.enqueue(new Callback<List<Student>>() {
    @Override
    public void onResponse(Call<List<Student>> call, Response<List<Student>> response) {
        Toast.makeText(MainActivity.this,"Hi",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onFailure(Call<List<Student>> call, Throwable t) {
        Toast.makeText(MainActivity.this,"Hihi",Toast.LENGTH_LONG).show();

    }
});


    }
}

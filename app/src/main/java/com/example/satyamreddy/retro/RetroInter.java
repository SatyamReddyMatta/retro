/*
 * Copyright (c) 2018. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.example.satyamreddy.retro;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetroInter {

    @GET("reddy?apiKey=hnsZ29Zxk4z5M3TJ6DB4zQotj4CZaBF-")
    Call<List<Student>> getStudents();
}

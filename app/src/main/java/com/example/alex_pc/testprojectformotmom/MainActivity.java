package com.example.alex_pc.testprojectformotmom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.Toast;

import com.example.alex_pc.testprojectformotmom.api.Api;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    public static final String BASE_URL = "http://ovz1.j285275.6okmz.vps.myjino.ru:49319/";
    public static final String TAG = "MyLogger";
    private Api api;
    private RecyclerView recyclerView;
    public static List<OfficesList> post;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(Api.class);

        post = new ArrayList<>();

        recyclerView = findViewById(R.id.recycler_view);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);

        RecyclerAdapter adapter = new RecyclerAdapter(post, recyclerView);
        recyclerView.setAdapter(adapter);

        api.getMyThing().enqueue(new Callback<List<OfficesList>>() {
            @Override
            public void onResponse(Call<List<OfficesList>> call, Response<List<OfficesList>> response) {
                post.addAll(response.body());
                recyclerView.getAdapter().notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<List<OfficesList>> call, Throwable t) {
                Log.d(TAG,"no ok "+t.toString());
                Toast.makeText(MainActivity.this, "Нет удолось загрузить данные", Toast.LENGTH_SHORT).show();
            }

        });
    }
}

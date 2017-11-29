package com.example.alex_pc.testprojectformotmom.api;

import com.example.alex_pc.testprojectformotmom.OfficesList;
import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Alex-PC on 28.11.2017.
 */

public interface Api {
    @GET("/posts")
    Call<List<OfficesList>> getMyThing();
}

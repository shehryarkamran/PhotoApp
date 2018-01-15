package com.shehryarkamran.photoapp.api

import com.shehryarkamran.photoapp.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET


interface PhotoAPI {
    @GET("?key=6688462-e18f7792aa03358793d007ae2&q=nature&image_type=photo" )
    fun getPhotos(): Call<PhotoList>
}
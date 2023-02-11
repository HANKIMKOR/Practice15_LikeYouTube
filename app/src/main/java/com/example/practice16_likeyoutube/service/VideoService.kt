package com.example.practice16_likeyoutube.service

import com.example.practice16_likeyoutube.dto.VideoDto
import retrofit2.Call
import retrofit2.http.GET

interface VideoService {

    @GET("v3/d289e604-92bc-42b8-b9e7-a3602d1cbaae")
    fun listVideos(): Call<VideoDto>

}
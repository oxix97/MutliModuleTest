package com.example.data.api

import com.example.data.model.response.tour.ResponseTourData
import retrofit2.http.GET

interface TourService {
    @GET("tour/tourinfo.do")
    suspend fun getTourInformation() : ResponseTourData
}
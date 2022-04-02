package com.example.data.datasource.tour

import com.example.data.model.response.tour.ResponseTourData

interface TourDataSource {
    suspend fun getTourData(): ResponseTourData
}
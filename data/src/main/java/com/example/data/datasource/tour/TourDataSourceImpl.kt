package com.example.data.datasource.tour

import com.example.data.api.TourService
import com.example.data.model.response.tour.ResponseTourData

class TourDataSourceImpl(private val service: TourService) : TourDataSource {
    override suspend fun getTourData(): ResponseTourData {
        return service.getTourInformation()
    }
}
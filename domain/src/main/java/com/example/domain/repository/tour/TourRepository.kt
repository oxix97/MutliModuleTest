package com.example.domain.repository.tour

import com.example.domain.model.tour.TourInformationData

interface TourRepository {
    suspend fun getInformation() : TourInformationData
}
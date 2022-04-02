package com.example.domain.usecase.tour

import com.example.domain.model.tour.TourInformationData
import com.example.domain.repository.tour.TourRepository

class GetTourInformationUseCase(private val repository: TourRepository) {
    suspend operator fun invoke(): TourInformationData {
        return repository.getInformation()
    }
}
package com.example.data.mapper.tour

import com.example.data.model.response.tour.ResponseTourData
import com.example.domain.model.tour.TourInformationData

object TourMapper {
    fun mapperToInformation(tourData: ResponseTourData): TourInformationData {
        return TourInformationData(
            data = tourData.results.map {
                TourInformationData.Data(
                    name = it.name,
                    address = it.address,
                    homepage = it.homepage
                )
            }
        )
    }
}
package com.example.data.repositoryimpl.tour

import com.example.data.datasource.tour.TourDataSource
import com.example.data.mapper.tour.TourMapper
import com.example.domain.model.tour.TourInformationData
import com.example.domain.repository.tour.TourRepository

class TourRepositoryImpl(private val dataSource: TourDataSource) : TourRepository {
    override suspend fun getInformation(): TourInformationData {
        return TourMapper.mapperToInformation(dataSource.getTourData())
    }
}
package com.example.myapplication.di

import com.example.data.datasource.sign.SignDataSource
import com.example.data.datasource.sign.SignDataSourceImpl
import com.example.data.datasource.test.TestDataSource
import com.example.data.datasource.test.TestDataSourceImpl
import com.example.data.datasource.tour.TourDataSource
import com.example.data.datasource.tour.TourDataSourceImpl
import com.example.domain.model.test.TestData
import org.koin.dsl.module

val dataSourceModule = module {
    single<SignDataSource> { SignDataSourceImpl(get()) }
    single<TestDataSource> { TestDataSourceImpl(get()) }
    single<TourDataSource> { TourDataSourceImpl(get()) }
}

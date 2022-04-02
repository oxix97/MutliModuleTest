package com.example.myapplication.di

import com.example.data.repositoryimpl.sign.SignRepositoryImpl
import com.example.data.repositoryimpl.test.TestRepositoryImpl
import com.example.data.repositoryimpl.tour.TourRepositoryImpl
import com.example.domain.repository.sign.SignRepository
import com.example.domain.repository.test.TestRepository
import com.example.domain.repository.tour.TourRepository
import org.koin.dsl.module

val repositoryModule = module {

    single<SignRepository> { SignRepositoryImpl(get()) }
    single<TestRepository> { TestRepositoryImpl(get()) }
    single<TourRepository> { TourRepositoryImpl(get()) }

}

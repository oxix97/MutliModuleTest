package com.example.myapplication.di

import com.google.gson.GsonBuilder
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//private const val BASE_URL ="http://smartcity.gimhae.go.kr/smart_tour/dashboard/api/"
private const val BASE_URL = "http://www.gimhae.go.kr/openapi/"
val apiModule = module {

    single<Retrofit> {
        Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create(GsonBuilder().setLenient().create()))
            .baseUrl(BASE_URL)
            .client(get<OkHttpClient>())
            .build()
    }

    single<OkHttpClient> {
        OkHttpClient.Builder()
            .run {
                HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
                build()
            }

    }
}

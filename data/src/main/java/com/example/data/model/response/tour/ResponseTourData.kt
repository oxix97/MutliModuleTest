package com.example.data.model.response.tour


import com.google.gson.annotations.SerializedName

data class ResponseTourData(
    val address: String,
    val name: String,
    val page: Int,
    @SerializedName("page_count")
    val pageCount: Int,
    val pageunit: Int,
    @SerializedName("record_count")
    val recordCount: Int,
    val results: List<Result>,
    val status: String
){
    data class Result(
        val address: String,
        val area: String,
        val category: String,
        val content: String,
        val copy: String,
        val fee: String,
        val homepage: String,
        val idx: Int,
        val images: List<String>,
        val manage: String,
        val name: String,
        val parking: String,
        val phone: String,
        val usehour: String,
        val xposition: String,
        val yposition: String
    )
}
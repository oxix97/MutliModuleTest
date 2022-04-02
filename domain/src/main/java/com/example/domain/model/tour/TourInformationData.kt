package com.example.domain.model.tour

data class TourInformationData(
    val data: List<Data>
) {
    data class Data(
        val name: String,
        val address: String,
        val homepage: String
    )
}

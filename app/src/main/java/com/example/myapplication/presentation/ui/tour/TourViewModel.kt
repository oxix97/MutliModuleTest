package com.example.myapplication.presentation.ui.tour

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.tour.TourInformationData
import com.example.domain.usecase.tour.GetTourInformationUseCase
import kotlinx.coroutines.launch
import timber.log.Timber

class TourViewModel(
    val getTourInformationUseCase: GetTourInformationUseCase
) : ViewModel() {
    val tourInfo = MutableLiveData<List<TourInformationData.Data>>()

    fun getInformation() {
        viewModelScope.launch {
            kotlin.runCatching { getTourInformationUseCase() }
                .onSuccess {
                    tourInfo.value = it.data
                    Timber.d("서버통신 성공!!!")
                }
                .onFailure {
                    it.printStackTrace()
                    Timber.e("서버통신 실패!!!")
                }
        }
    }
}
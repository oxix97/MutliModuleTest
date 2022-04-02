package com.example.myapplication.presentation.ui.tour

import android.os.Bundle
import com.example.myapplication.R
import com.example.myapplication.databinding.ActivityTourBinding
import com.nadosunbae_android.app.presentation.base.BaseActivity
import org.koin.androidx.viewmodel.ext.android.viewModel


class TourActivity : BaseActivity<ActivityTourBinding>(R.layout.activity_tour) {
    private val tourViewModel: TourViewModel by viewModel()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
    }

    private fun initView() {
        tourViewModel.getInformation()
        tourViewModel.tourInfo.observe(this) {
            binding.tourData = it[0]
        }
    }
}
package com.example.bochackathon_android.ui.onboarding_info

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bochackathon_android.R
import com.example.bochackathon_android.base.BaseFragment
import com.example.bochackathon_android.databinding.FragmentOnBoardingInfoBinding
import com.example.bochackathon_android.databinding.FragmentOnboardingWelcomeBinding

class OnBoardingInfoFragment : BaseFragment(R.layout.fragment_on_boarding_info) {
    private val binding: FragmentOnBoardingInfoBinding by viewBinding(
        FragmentOnBoardingInfoBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        binding.continueBtn.setOnClickListener {
            findNavController().navigate(R.id.action_onBoardingInfoFragment_to_onboardingFindCompany)
        }
    }
}
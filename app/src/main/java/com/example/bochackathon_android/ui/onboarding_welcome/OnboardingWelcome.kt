package com.example.bochackathon_android.ui.onboarding_welcome

import android.os.Bundle
import android.view.View
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bochackathon_android.R
import com.example.bochackathon_android.base.BaseFragment
import com.example.bochackathon_android.databinding.FragmentOnboardingWelcomeBinding

class OnboardingWelcome : BaseFragment(R.layout.fragment_onboarding_welcome) {

    private val binding: FragmentOnboardingWelcomeBinding by viewBinding(
        FragmentOnboardingWelcomeBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews() {
        navigateToOnBoardingInfo()
    }

    private fun navigateToOnBoardingInfo() {
        binding.continueBtn.setOnClickListener {
            findNavController().navigate(R.id.action_OnboardingWelcomeFragment_to_onBoardingInfoFragment)
        }
    }
}
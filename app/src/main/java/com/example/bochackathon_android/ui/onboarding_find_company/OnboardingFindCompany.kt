package com.example.bochackathon_android.ui.onboarding_find_company

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bochackathon_android.R
import com.example.bochackathon_android.base.BaseFragment
import com.example.bochackathon_android.databinding.FragmentOnboardingFindCompanyBinding

class OnboardingFindCompany : BaseFragment(R.layout.fragment_onboarding_find_company) {
    private val binding: FragmentOnboardingFindCompanyBinding by viewBinding(
        FragmentOnboardingFindCompanyBinding::bind
    )

    private val viewModel: OnboardingFindCompanyViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }

}
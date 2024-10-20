package com.example.bochackathon_android.ui.onboarding_find_company

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bochackathon_android.R
import com.example.bochackathon_android.base.BaseFragment
import com.example.bochackathon_android.base.MainActivity
import com.example.bochackathon_android.databinding.FragmentOnboardingFindCompanyBinding
import com.example.bochackathon_android.network.models.request_models.FoundCompanyRequest

class OnboardingFindCompany : BaseFragment(R.layout.fragment_onboarding_find_company) {
    private val binding: FragmentOnboardingFindCompanyBinding by viewBinding(
        FragmentOnboardingFindCompanyBinding::bind
    )

    private val viewModel: OnboardingFindCompanyViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()

    }

    private fun initViews() {
        initNextBtn()
    }

    private fun initNextBtn() {
        binding.nextBtn.setOnClickListener {
            if (binding.nextBtn.text == "Find") {
                binding.foundCompanyCv.visibility = View.VISIBLE
                onFindClick()
            } else {
                onContinueClick()
            }
        }
    }

    private fun onFindClick() {
        binding.nextBtn.setText(R.string.continue_lbl)
    }

    private fun onContinueClick() {
        findNavController().navigate(R.id.action_onboardingFindCompany_to_companyInformationFragment)
    }


}
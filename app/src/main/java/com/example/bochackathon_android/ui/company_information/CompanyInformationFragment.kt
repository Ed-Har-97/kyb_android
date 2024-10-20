package com.example.bochackathon_android.ui.company_information

import android.os.Bundle
import android.view.View
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.bochackathon_android.R
import com.example.bochackathon_android.base.BaseFragment
import com.example.bochackathon_android.databinding.FragmentCompanyInformationBinding

class CompanyInformationFragment : BaseFragment(R.layout.fragment_company_information) {
    private val binding: FragmentCompanyInformationBinding by viewBinding(
        FragmentCompanyInformationBinding::bind
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initViews()
    }

    private fun initViews(){
        binding.nextBtn.isEnabled=false // incompleted flow
    }
}
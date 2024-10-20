package com.example.bochackathon_android.base

import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.fragment.app.Fragment

private const val CURRENT_FRAGMENT_TAG = "#FragmentName"

abstract class BaseFragment(layoutId: Int) : Fragment(layoutId) {

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.i(
            CURRENT_FRAGMENT_TAG,
            (this.javaClass.`package`?.name
                ?: "Undefined Fragment") + "." + this.javaClass.simpleName
        )
    }
}
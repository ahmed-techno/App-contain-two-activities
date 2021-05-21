package com.ahmedtechno93.app_contain_two_activities.ui

import android.os.Bundle
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

 abstract class BaseActivity<VB: ViewBinding>: AppCompatActivity() {
    abstract val LOG_TAG: String
    abstract val bindingInflater:(LayoutInflater) -> VB
    private var _binding : ViewBinding? = null

    protected val binding = _binding as VB
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding=bindingInflater(layoutInflater)
        setContentView(requireNotNull(_binding).root)
        addCallbacks()
    }
    abstract fun addCallbacks()

    }
}
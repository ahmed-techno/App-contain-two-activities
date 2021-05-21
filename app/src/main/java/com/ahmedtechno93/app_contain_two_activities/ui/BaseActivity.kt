package com.ahmedtechno93.app_contain_two_activities.ui

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding
import com.ahmedtechno93.app_contain_two_activities.data.Constant
import com.ahmedtechno93.app_contain_two_activities.data.User

abstract class BaseActivity<VB: ViewBinding>: AppCompatActivity() {
    abstract val LOG_TAG: String
    abstract val bindingInflater:(LayoutInflater) -> VB
    var _binding: ViewBinding? = null
    protected var binding : VB?
        get() = _binding as VB?
        set(value)=TODO()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding=bindingInflater(layoutInflater)
        setContentView(requireNotNull(_binding).root)
        addCallbacks()
    }
    abstract fun addCallbacks()
    protected fun log(value: Any){
        Log.v(LOG_TAG, value.toString())
    }
    }

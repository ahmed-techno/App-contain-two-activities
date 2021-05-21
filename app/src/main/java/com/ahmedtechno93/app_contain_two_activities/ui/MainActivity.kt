package com.ahmedtechno93.app_contain_two_activities.ui

import android.content.Intent
import android.view.LayoutInflater
import com.ahmedtechno93.app_contain_two_activities.data.Constant
import com.ahmedtechno93.app_contain_two_activities.data.User
import com.ahmedtechno93.app_contain_two_activities.databinding.ActivityMainBinding

class MainActivity:BaseActivity<ActivityMainBinding>() {
    override val LOG_TAG: String="MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding =ActivityMainBinding::inflate

    override fun addCallbacks() {
        binding?.apply {  }
        binding?.button?.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            val user = User(binding!!!!.textName.text.toString(), 27)
            intent.putExtra(Constant.user, user)
            startActivity(intent)
        }
    }

}
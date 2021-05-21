package com.ahmedtechno93.app_contain_two_activities.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmedtechno93.app_contain_two_activities.data.Constant
import com.ahmedtechno93.app_contain_two_activities.data.User
import com.ahmedtechno93.app_contain_two_activities.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val user: User? = intent.getParcelableExtra<User>(Constant.user)
        binding.textData.text=user?.name

        addCallbacks()
    }

    private fun addCallbacks() {
        binding.buttonClose.setOnClickListener {
            finish()
        }    }
}
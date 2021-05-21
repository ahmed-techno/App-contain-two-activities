package com.ahmedtechno93.app_contain_two_activities.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahmedtechno93.app_contain_two_activities.data.Constant
import com.ahmedtechno93.app_contain_two_activities.data.User
import com.ahmedtechno93.app_contain_two_activities.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addCallbacks()
    }

    private fun addCallbacks() {
        binding.button.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)

            val user = User(binding.textName.text.toString(), 27)
            intent.putExtra(Constant.user, user)
            startActivity(intent)
        }
    }

}
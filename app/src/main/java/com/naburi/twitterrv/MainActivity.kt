package com.naburi.twitterrv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.naburi.twitterrv.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displayAccounts()

    }
    fun displayAccounts(){
        var account = Account(" ", "Austine,", "@Austine", "Finish everyday and be done with it", " ",""," ", " ")
        var account1 = Account(" ", "Stephen,", "@Stephen", "Finish everyday and be done with it", " ",""," ", " ")
        var account2 = Account(" ", "Saul Malo,", "@SaulMalo", "Finish everyday and be done with it", " ",""," ", " ")
        var account3 = Account(" ", "Jay Nandwa,", "@JayNandwa", "Finish everyday and be done with it", " ",""," ", " ")

        var accountList = listOf(account, account1, account2, account3)

        var accountAdapter = AccountRVAdapter(accountList)
        binding.rvAccounts.layoutManager = LinearLayoutManager(this)
        binding.rvAccounts.adapter = accountAdapter

    }




    }



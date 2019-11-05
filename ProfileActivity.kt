package com.lucas.lib_parcelerexemplo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_profile.*
import org.parceler.Parcels

class ProfileActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val users = Parcels.unwrap<ArrayList<User>?>(intent.getParcelableExtra("users"))

        textView4.text = users?.get(3)!!.name
        textView6.text = users?.get(3)!!.country
        textView5.text = users?.get(3)!!.lastanem
    }
}


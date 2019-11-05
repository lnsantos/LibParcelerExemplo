package com.lucas.lib_parcelerexemplo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.parceler.Parcels

class MainActivity : AppCompatActivity() {

    lateinit var user_1 : User
    lateinit var user_2 : User
    lateinit var user_3 : User
    lateinit var user_4 : User
    lateinit var users : ArrayList<User>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        users = ArrayList()

        user_1 = User()
        user_2 = User(name = "Lucas")
        user_3 = User("Pedro", country = "Brazil")
        user_4 = User(country = "Chile", name = "Angela", lastanem = "Francoal")

        users.add(user_1)
        users.add(user_2)
        users.add(user_3)
        users.add(user_4)

        val screen = Intent(this, ProfileActivity::class.java)

        txtButton.setOnClickListener {

            if(users != null){
                screen.putExtra("users", Parcels.wrap(users))
            }

            startActivity(screen)
        }

    }
}

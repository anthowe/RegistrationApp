package com.anthonyh.registrationapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.android.gms.tasks.OnCompleteListener
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.login_activity.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        login_btn.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }

//        btn_reset.setOnClickListener {
//
//            setContentView(R.layout.signup_activity)
//        }
//
//        btn_submit.setOnClickListener {
//
//            Toast.makeText(this@MainActivity, user_name,  Toast.LENGTH_LONG).show()
//            Toast.makeText(this@MainActivity, password,  Toast.LENGTH_LONG).show()
//        }
    }



}
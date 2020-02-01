package com.example.aplikasi_sholat

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_registeryes.*

class RegisterActivity2 : AppCompatActivity() {

    val auth = FirebaseAuth.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registeryes)
        initView()
    }

    private fun initView() {
        btn_register_user.setOnClickListener{

            registerUserToFirebase()
    }}

    private fun registerUserToFirebase(){
        auth.createUserWithEmailAndPassword(txt_email.text.toString(), txt_password.text.toString())
                .addOnCompleteListener {

                    if(it.isSuccessful){
                        Toast.makeText(this, "user berhasil dicreate", Toast.LENGTH_LONG).show()
                        startActivity(Intent(this,MainActivity::class.java))

                    }
                }
    }


}

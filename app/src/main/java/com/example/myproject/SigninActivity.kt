package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SigninActivity : AppCompatActivity() {
    private lateinit var mSignin: TextView
    private lateinit var mUsername: EditText
    private lateinit var mPassword: EditText
    private lateinit var mButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        mSignin = findViewById(R.id.mTvSignin)
        mUsername = findViewById(R.id.mEdtUsername)
        mPassword = findViewById(R.id.mEdtPasswordw)
        mButton = findViewById(R.id.mBtnSignin)

        mButton.setOnClickListener {
            performSignIn()
        }
    }

    private fun performSignIn() {
        val mUsernameInput = mUsername.text.toString()
        val mPasswordInput = mPassword.text.toString()

        if (mUsernameInput.isEmpty() || mPasswordInput.isEmpty()) {
            Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            return
        }

        // Assuming `auth` is an instance of the appropriate authentication class
        // auth.signUpWithEmailAndPassword(mEmailInput, mPasswordInput, mPhoneInput, mNameInput)
        //     .addOnCompleteListener(this) { //task ->
        //         if (task.isSuccessful) {
        val signin = Intent(this@SigninActivity, QueryActivity::class.java)
        startActivity(signin)
        Toast.makeText(baseContext, "Success", Toast.LENGTH_SHORT).show()
        //     } else {
        //         Toast.makeText(baseContext, "Authentication failed", Toast.LENGTH_SHORT).show()
        //     }
        // }
    }
}

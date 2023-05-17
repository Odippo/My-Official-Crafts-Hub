package com.example.myproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SignupActivity : AppCompatActivity() {
    // Initiate the elements on the user interface as variables
    lateinit var mSignup: TextView
    lateinit var mCreate: TextView
    lateinit var mEmail: EditText
    lateinit var mPhone: EditText
    lateinit var mName: EditText
    lateinit var mPassword: EditText
    lateinit var mbLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        // Find views by ID's
        mSignup = findViewById(R.id.mTvSignUp)
        mCreate = findViewById(R.id.mTvcreate)
        mEmail = findViewById(R.id.mEdtEmail)
        mPhone = findViewById(R.id.mEdtPhonnumber)
        mName = findViewById(R.id.mEdtName)
        mPassword = findViewById(R.id.mEdtPassword)
        mbLogin = findViewById(R.id.mBtnLogin)

        // Set OnClickListener for the Signup button
        mbLogin.setOnClickListener {
            performSignup()
        }
    }

    private fun performSignup() {
        val mEmailInput = mEmail.text.toString()
        val mPhoneInput = mPhone.text.toString()
        val mNameInput = mName.text.toString()
        val mPasswordInput = mPassword.text.toString()

        if (mEmailInput.isEmpty() || mPhoneInput.isEmpty() || mNameInput.isEmpty() || mPasswordInput.isEmpty()) {
            Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            return
        }

        // Assuming `auth` is an instance of the appropriate authentication class
        //auth.signUpWithEmailAndPassword(mEmailInput, mPasswordInput, mPhoneInput, mNameInput)
            //.addOnCompleteListener(this) { //task ->
                //if (task.isSuccessful) {
                    val login = Intent(this@SignupActivity, QueryActivity::class.java)
                    startActivity(login)
                    Toast.makeText(baseContext, "Success", Toast.LENGTH_SHORT).show()
                } //else {
                    //Toast.makeText(baseContext, "Authentication failed", Toast.LENGTH_SHORT).show()
                }




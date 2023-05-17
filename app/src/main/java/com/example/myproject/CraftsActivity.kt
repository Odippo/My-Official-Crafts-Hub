package com.example.myproject

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.myproject.databinding.ActivityCraftsBinding

class CraftsActivity : AppCompatActivity() {
    lateinit var mRegister: TextView
    lateinit var mInfo: TextView
    lateinit var mPhone: EditText
    lateinit var mName: EditText
    lateinit var mPassword: EditText
    lateinit var mbRegister: Button
    lateinit var mId: EditText
    private lateinit var binding: ActivityCraftsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCraftsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        mRegister = findViewById(R.id.mTvRegister)
        mInfo = findViewById(R.id.mTvinfo)
        mPhone = findViewById(R.id.mEdtMyPhoneNumber)
        mName = findViewById(R.id.mEdtMyName)
        mPassword = findViewById(R.id.mEdtMyPassword)
        mbRegister = findViewById(R.id.btnRegister)
        mId = findViewById(R.id.mEdtId)

        mbRegister.setOnClickListener {
            performRegister()
        }
    }

    private fun performRegister() {
        val mIdInput = mId.text.toString()
        val mPhoneInput = mPhone.text.toString()
        val mNameInput = mName.text.toString()
        val mPasswordInput = mPassword.text.toString()

        if (mIdInput.isEmpty() || mPhoneInput.isEmpty() || mNameInput.isEmpty() || mPasswordInput.isEmpty()) {
            Toast.makeText(this, "Please fill all the fields", Toast.LENGTH_SHORT).show()
            return
        }

        val login = Intent(this@CraftsActivity, MenuActivity::class.java)
        startActivity(login)
        Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show()
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_crafts, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_s1 -> {
                Toast.makeText(this, "S1 clicked", Toast.LENGTH_LONG).show()
                true
            }
            R.id.action_s2 -> {
                Toast.makeText(this, "S2 clicked", Toast.LENGTH_LONG).show()
                true

            }
            R.id.action_s3 -> {
                Toast.makeText(this, "S3 clicked", Toast.LENGTH_LONG).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}

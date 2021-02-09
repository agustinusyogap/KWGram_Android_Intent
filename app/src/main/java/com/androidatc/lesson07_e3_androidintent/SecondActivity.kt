package com.androidatc.lesson07_e3_androidintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var message = intent.getStringExtra("name")
        HelloMessage_ID.text = message
    }
    fun go2dmActivity(view: View) {
        var intent = Intent(this,DMActivity::class.java)
        startActivity(intent)
    }

    fun go2searchActivity(view: View){
        var intent = Intent(this,SearchActivity::class.java)
        startActivity(intent)
    }

    fun go2uploadActivity(view: View){
        var intent = Intent(this,UploadActivity::class.java)
        startActivity(intent)
    }
}

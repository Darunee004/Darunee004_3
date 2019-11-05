package com.example.week3

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_scond.*

class SecondAcitivity :AppCompatActivity (){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scond)
        setTitle("ข้อมูลส่วนตัว")

        var fname = intent.extras?.getString(MainActivity().TAG_FNAME)
        var lname = intent.extras?.getString(MainActivity().TAG_LNAME)
        var nname = intent.extras?.getString(MainActivity().TAG_NNAME)
        var age = intent.extras?.getString(MainActivity().TAG_AGE)
        var tel = intent.extras?.getString(MainActivity().TAG_TEL)

        tv_res_fname.setText(fname)
        tv_res_lname.setText(lname)
        tv_res_nname.setText(nname)
        tv_res_age.setText(age)
        tv_res_tel.setText(tel)

        btn_back.setOnClickListener {
            finish()
        }
    }
}
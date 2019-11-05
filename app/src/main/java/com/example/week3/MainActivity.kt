package com.example.week3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    public final var TAG_FNAME="FNAME"
    public final var TAG_LNAME="LNAME"
    public final var TAG_NNAME="NNAME"
    public final var TAG_AGE="AGE"
    public final var TAG_TEL="TEL"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("Information")
        btn_sender.setOnClickListener {
            //ดึงค่า
            var fname = et_fname.text.toString()
            var lname = et_lname.text.toString()
            var nname = et_nname.text.toString()
            var age = et_age.text.toString()
            var tel = et_tel.text.toString()

            senderFun(fname,lname,nname,age,tel)
        }
        btn_clear.setOnClickListener {
            //ล้างข้อมูล
            et_fname.setText("")
            et_lname.setText("")
            et_nname.setText("")
            et_age.setText("")
            et_tel.setText("")
        }
        btn_close_app.setOnClickListener {
        finish()
        }
    }
    fun senderFun(str1 : String,str2: String, str3: String, str4: String, str5: String){
      var goPageSecond = Intent(this,SecondAcitivity ::class.java)


        goPageSecond.putExtra(TAG_FNAME,str1)
        goPageSecond.putExtra(TAG_LNAME,str2)
        goPageSecond.putExtra(TAG_NNAME,str3)
        goPageSecond.putExtra(TAG_AGE,str4)
        goPageSecond.putExtra(TAG_TEL,str5)

        startActivity(goPageSecond)
    }
}

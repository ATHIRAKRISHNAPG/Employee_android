package com.example.employeeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun Event(view: View) {

        var getempcode= findViewById<EditText>(R.id.empcode)
        var getempname= findViewById<EditText>(R.id.empname)
        var getdesig= findViewById<EditText>(R.id.desig)
        var getcmpname= findViewById<EditText>(R.id.cmpname)
        var getplace= findViewById<EditText>(R.id.place)
        Toast.makeText(this,getempcode.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getempname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getdesig.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getcmpname.text.toString(),Toast.LENGTH_LONG).show()
        Toast.makeText(this,getplace.text.toString(),Toast.LENGTH_LONG).show()

    }
}
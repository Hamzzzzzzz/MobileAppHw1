package com.example.myapplication
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.FrameLayout
import android.widget.Spinner
import android.widget.Button

var flag : String = "1"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val spinny: Spinner = findViewById(R.id.Rating)
        var options = arrayOf("1","2","3","4","5")
        val btn: Button = findViewById(R.id.Submit)
        spinny.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        val elFrame : FrameLayout = findViewById(R.id.FRAMO)
        val fragment1 = Frag1()
        val fragment2 = Frag2()
        val fragment3 = Frag3()

        spinny.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                flag = options.get(p2)
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {
                TODO("Not yet implemented")
            }
        }

        btn.setOnClickListener{view->
            when(flag){
                "1" -> supportFragmentManager.beginTransaction().apply{
                    replace(R.id.FRAMO , fragment1)
                    commit()
                }
                "2" -> supportFragmentManager.beginTransaction().apply{
                    replace(R.id.FRAMO , fragment1)
                    commit()
                }
                "3" -> supportFragmentManager.beginTransaction().apply{
                    replace(R.id.FRAMO , fragment2)
                    commit()
                }
                "4" -> supportFragmentManager.beginTransaction().apply{
                    replace(R.id.FRAMO , fragment3)
                    commit()
                }
                "5" -> supportFragmentManager.beginTransaction().apply{
                    replace(R.id.FRAMO , fragment3)
                    commit()
                }
            }
        }


    }
}
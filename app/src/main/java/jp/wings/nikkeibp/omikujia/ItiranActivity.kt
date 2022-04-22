package jp.wings.nikkeibp.omikujia

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ItiranActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.itiran)

        val btn = findViewById<Button>(R.id.button2)
        btn.setOnClickListener {
            val i = Intent(this, ProfileActivity::class.java)
            startActivity(i)
        }

        val bt = findViewById<Button>(R.id.button3)
        bt.setOnClickListener {
            val i = Intent(this, SkillActivity::class.java)
            startActivity(i)
        }
        val b = findViewById<Button>(R.id.button5)
        b.setOnClickListener {
            val i = Intent(this, WorkActivity::class.java)
            startActivity(i)
        }
        val btn3 = findViewById<Button>(R.id.button4)
        btn3.setOnClickListener {
            val i = Intent(this, ContactActivity::class.java)
            startActivity(i)
        }

    }

}
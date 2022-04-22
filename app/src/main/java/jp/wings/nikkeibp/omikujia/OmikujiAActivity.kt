package jp.wings.nikkeibp.omikujia

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import jp.wings.nikkeibp.omikujia.databinding.OmikujiBinding

class OmikujiAActivity : AppCompatActivity() {

    val omikujiBox = OmikujiBox()

    lateinit var binding: OmikujiBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = OmikujiBinding.inflate(layoutInflater)
        setContentView(binding.root)

        omikujiBox.omikujiView = binding.imageView

        val btn = findViewById<Button>(R.id.button)
        btn.setOnClickListener {
            val i = Intent(this, ItiranActivity::class.java)
            startActivity(i)
        }




        //文字を表示する
    /*
        val rnd = Random()
        val number = rnd.nextInt(20)

        val omikujiShelf = Array<String>(20) {"吉"}
        omikujiShelf[0] = "大吉"
        omikujiShelf[19] = "凶"　　　　　　　　　　　　　

        val str = omikujiShelf[number]
        binding.helloView.text = str

     */
    }
    fun onButtonClick(v: View) {

        omikujiBox.shake()

    /*
        val translate = TranslateAnimation(0f, 0f, 0f, -200f)
        translate.repeatMode = Animation.REVERSE
        translate.repeatCount = 5
        translate.duration = 100

        val rotate = RotateAnimation(0f, -36f, binding.imageView.width/2f, binding.imageView.height/2f)
        rotate.duration = 200

        val set = AnimationSet(true)
        set.addAnimation(rotate)
        set.addAnimation(translate)

        binding.imageView.startAnimation(set)
    */
    //    binding.imageView.setImageResource(R.drawable.result1)
    }
}
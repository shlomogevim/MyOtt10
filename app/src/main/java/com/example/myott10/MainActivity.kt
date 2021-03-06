package com.example.myott10

import android.animation.AnimatorInflater
import android.content.res.Resources
import android.graphics.drawable.AnimatedVectorDrawable
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.word1_layout.*
import kotlinx.android.synthetic.main.word2_layout.*
import kotlinx.android.synthetic.main.word3_layout.*
import kotlinx.android.synthetic.main.word4_layout.*
import kotlinx.coroutines.*

class MainActivity : AppCompatActivity() {

    var contor = 0
    lateinit var helper: Helper
    var AnimtinoMode = true


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        helper = Helper(this)
        mainLayout.setOnClickListener {
            CoroutineScope(Dispatchers.Main).launch {
                if (AnimtinoMode) {
                    firstWord()
                    secondWord()
                    thirdWord()
                    fourthWord()
                } else {
                    firstWord1()
                    secondWord1()
                    thirdWord1()
                    fourthWord1()
                }
                lastApizode()
            }

        }


    }

    private suspend fun lastApizode() {
        delay(2000)
        val anim = AnimatorInflater.loadAnimator(this, R.animator.set1)
        anim?.apply {
            setTarget(worldLayout3)
            start()
        }
        val anim2 = AnimatorInflater.loadAnimator(this, R.animator.set2)
        anim2?.apply {
            setTarget(worldLayout4)
            start()
        }
        val anim3 = AnimatorInflater.loadAnimator(this, R.animator.alpha)
        anim3?.apply {
            setTarget(mainLayout)
            //   start()
        }
        val anim4 = AnimatorInflater.loadAnimator(this, R.animator.alpha1)
        iv_sea.visibility=View.VISIBLE
        anim4?.apply {
            setTarget(iv_sea)
            start()
        }

    }

    fun click_Button(view: View) {
        val anim = AnimatorInflater.loadAnimator(this, R.animator.set1)
        anim?.apply {
            setTarget(worldLayout3)
            start()
        }
        val anim2 = AnimatorInflater.loadAnimator(this, R.animator.set2)
        anim2?.apply {
            setTarget(worldLayout4)
            start()
        }
        val anim3 = AnimatorInflater.loadAnimator(this, R.animator.alpha)
        anim3?.apply {
            setTarget(mainLayout)
         //   start()
        }
        val anim4 = AnimatorInflater.loadAnimator(this, R.animator.alpha1)
        iv_sea.visibility=View.VISIBLE
        anim4?.apply {
            setTarget(iv_sea)
            start()
        }
    }




    private fun firstWord1() {

        setParams(worldLayout1, 250, 380, 0, 0, 0, 500)
        //  worldLayout1.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)

        CoroutineScope(Dispatchers.IO).launch {
            creadAVD1(1, "ה")
            creadAVD1(2, "א")
            creadAVD1(3, "ו")
            creadAVD1(4, "ר")
        }

    }

    private suspend fun secondWord1() {
        delay(200)
        contor = 4
        setParams(worldLayout2, 150, 380, 0, 0, 0, 300)

        //  worldLayout2.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)

        CoroutineScope(Dispatchers.IO).launch {
            creadAVD1(5, "ה")
            creadAVD1(6, "ו")
            creadAVD1(7, "א")

            creadAVD1(8, "מ")
            creadAVD1(9, "ע")
            creadAVD1(10, "ש")
            creadAVD1(11, "ה")

            creadAVD1(12, "ב")
            creadAVD1(13, "ר")
            creadAVD1(14, "א")
            creadAVD1(15, "ש")
            creadAVD1(16, "י")
            creadAVD1(17, "ת")

        }
    }

    private suspend fun thirdWord1() {
        delay(100)
        contor = 17
        setParams(worldLayout3, 150, 360, 0, 350, 0, 0)
        //  worldLayout3.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)

        CoroutineScope(Dispatchers.IO).launch {
            creadAVD1(18, "ה")
            creadAVD1(19, "ח")
            creadAVD1(20, "ו")
            creadAVD1(21, "ש")
            creadAVD1(22, "ך")
        }
    }

    private suspend fun creadAVD1(index: Int, letter: String) {
        contor++
        val view = helper.getView(index) as ImageView
        val address = Helper(this).getAnimation0(letter)
        individiualPatam(view)
        withContext(Dispatchers.Main) {
            view.setImageResource(address)
        }
    }

    private fun firstWord() {
        setParams(worldLayout1, 250, 380, 0, 0, 0, 500)
        //  worldLayout1.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)
        CoroutineScope(Dispatchers.IO).launch {
            creadAVD(1, "ה")
            creadAVD(2, "א")
            creadAVD(3, "ו")
            creadAVD(4, "ר")
        }
    }

    private suspend fun secondWord() {
        delay(4000)
        contor = 4
        setParams(worldLayout2, 150, 380, 0, 0, 0, 300)

        //  worldLayout2.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)

        CoroutineScope(Dispatchers.IO).launch {
            creadAVD(5, "ה")
            creadAVD(6, "ו")
            creadAVD(7, "א")

            creadAVD(8, "מ")
            creadAVD(9, "ע")
            creadAVD(10, "ש")
            creadAVD(11, "ה")

            creadAVD(12, "ב")
            creadAVD(13, "ר")
            creadAVD(14, "א")
            creadAVD(15, "ש")
            creadAVD(16, "י")
            creadAVD(17, "ת")
        }
    }

    private suspend fun thirdWord() {
        delay(13000)

        contor = 17
        setParams(worldLayout3, 150, 360, 0, 350, 0, 0)
        //  worldLayout3.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)

        CoroutineScope(Dispatchers.IO).launch {
            creadAVD(18, "ה")
            creadAVD(19, "ח")
            creadAVD(20, "ו")
            creadAVD(21, "ש")
            creadAVD(22, "ך")
        }
    }

    private suspend fun fourthWord() {
        delay(5000)
        contor = 22

        setParams(worldLayout4, 150, 340, 0, 500, 0, 0)
        // worldLayout4.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)
        creadAVD(23, "ה")
        creadAVD(24, "ו")
        creadAVD(25, "א")

        creadAVD(26, "מ")
        creadAVD(27, "מ")
        creadAVD(28, "ל")
        creadAVD(29, "א")

        creadAVD(30, "מ")
        creadAVD(31, "ק")
        creadAVD(32, "ו")
        creadAVD(33, "ם")


     /*   setParams(worldLayout4, 150, 320, 0, 530, 0, 0)
        //      worldLayout4.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)

        creadAVD(23, "ק")
        creadAVD(24, "ו")
        creadAVD(25, "ר")
        creadAVD(26, "ה")

        creadAVD(27, "ש")
        creadAVD(28, "א")
        creadAVD(29, "י")
        creadAVD(30, "ן")

        creadAVD(31, "א")
        creadAVD(32, "ו")
        creadAVD(33, "ר")*/
    }

    private fun individiualPatam(view: View) {
        when (contor) {
            1 -> setParams(view, 150, 150, 0, 0, 15, 35)
            2 -> setParams(view, 180, 180, 0, 0, 110, 55)
            3 -> setParams(view, 170, 170, 0, 0, 170, 50)
            4 -> setParams(view, 160, 160, 0, 0, 230, 10)

            5 -> setParams(view, 50, 50, 0, 0, 10, 10)
            6 -> setParams(view, 50, 50, 0, 0, 30, 10)
            7 -> setParams(view, 55, 55, 0, 0, 50, 15)

            8 -> setParams(view, 50, 50, 0, 0, 90, 10)
            9 -> setParams(view, 40, 40, 0, 0, 120, 15)
            10 -> setParams(view, 40, 40, 0, 0, 137, 10)
            11 -> setParams(view, 50, 50, 0, 0, 155, 10)

            12 -> setParams(view, 50, 50, 0, 0, 205, 15)
            13 -> setParams(view, 50, 50, 0, 0, 230, 5)
            14 -> setParams(view, 55, 55, 0, 0, 260, 15)
            15 -> setParams(view, 45, 45, 0, 0, 290, 8)
            16 -> setParams(view, 50, 50, 0, 0, 307, 10)
            17 -> setParams(view, 50, 50, 0, 0, 330, 5)

            18 -> setParams(view, 120, 120, 0, 0, 15, 35)
            19 -> setParams(view, 140, 140, 0, 0, 75, 20)
            20 -> setParams(view, 120, 120, 0, 0, 135, 38)
            21 -> setParams(view, 110, 110, 0, 0, 175, 25)
            22 -> setParams(view, 120, 120, 0, 15, 230, 0)


            23 -> setParams(view, 50, 50, 0, 0, 0, 50)
            24 -> setParams(view, 50, 50, 0, 0, 20, 50)
            25 -> setParams(view, 50, 50, 0, 0, 40, 50)
            26 -> setParams(view, 48, 48, 0, 0, 80, 50)
            27 -> setParams(view, 50, 50, 0, 0, 105, 50)
            28 -> setParams(view, 50, 50, 0, 0, 130, 50)
            29 -> setParams(view, 50, 50, 0, 0, 163, 50)
            30 -> setParams(view, 50, 50, 0, 0, 200, 50)
            31 -> setParams(view, 50, 50, 0, 0, 230, 40)
            32 -> setParams(view, 50, 50, 0, 0, 248, 50)

            33 -> setParams(view, 45, 45, 0, 0, 272, 50)

//            34 -> setParams(view, 50, 50, 0, 0, 305, 20)
//            35 -> setParams(view, 50, 50, 0, 0, 323, 12)
        }
    }
    private suspend fun fourthWord1() {
        delay(100)
        contor = 22
        setParams(worldLayout4, 150, 340, 0, 500, 0, 0)
     // worldLayout4.background = ContextCompat.getDrawable(this, R.drawable.ic_launcher_background)
        creadAVD1(23, "ה")
        creadAVD1(24, "ו")
        creadAVD1(25, "א")

        creadAVD1(26, "מ")
        creadAVD1(27, "מ")
        creadAVD1(28, "ל")
        creadAVD1(29, "א")

       creadAVD1(30, "מ")
       creadAVD1(31, "ק")
       creadAVD1(32, "ו")
       creadAVD1(33, "ם")
//        creadAVD1(34, "ק")
//        creadAVD1(35, "ו")
//        creadAVD1(36, "ם")
    }

    private fun setParams(
        view: View,
        scaleX: Int,
        scaleY: Int,
        mLeft: Int,
        mTop: Int,
        mRight: Int,
        mBottom: Int
    ) {
        if (scaleX > 0) {
            view.layoutParams.height = scaleX.toPx()
            view.layoutParams.width = scaleY.toPx()
        }
        val param = view.layoutParams as ConstraintLayout.LayoutParams
        param.setMargins(mLeft.toPx(), mTop.toPx(), mRight.toPx(), mBottom.toPx())
        view.layoutParams = param
        view.requestLayout()
    }


    private suspend fun creadAVD(index: Int, letter: String) {
        contor++
        val view = helper.getView(index) as ImageView
        val address = Helper(this).getAnimation(letter)
        individiualPatam(view)



        withContext(Dispatchers.Main) {

            delay(1000)

            view.setImageResource(address)
            val avd = view.drawable as AnimatedVectorDrawable
            avd.start()
        }

    }

    fun Int.toPx(): Int = (this * Resources.getSystem().displayMetrics.density).toInt()


    private fun setWordLayout(worldLayout: ConstraintLayout?, mTop: Int) {
        setParams(worldLayout1, 0, 0, 0, mTop, 0, 0)

    }


    /* fun getView(index: Int): View {
         var view: View
         when (index) {
             1 -> view = imageView1
             2 -> view = imageView2
             3 -> view = imageView3
             4 -> view = imageView4

             5 -> view = imageView10
             6 -> view = imageView11
             7 -> view = imageView12
             8 -> view = imageView13
             9 -> view = imageView14
             10 -> view = imageView15
             11 -> view = imageView16
             12 -> view = imageView17
             13 -> view = imageView18
             14 -> view = imageView19
             15 -> view = imageView20
             16 -> view = imageView21
             17 -> view = imageView22

             18 -> view = imageView30
             19 -> view = imageView31
             20 -> view = imageView32
             21 -> view = imageView33
             22 -> view = imageView34

             23 -> view = imageView40
             24 -> view = imageView41
             25 -> view = imageView42
             26 -> view = imageView43
             27 -> view = imageView44
             28 -> view = imageView45
             29 -> view = imageView46
             30 -> view = imageView47
             31 -> view = imageView48
             32 -> view = imageView49
             33 -> view = imageView491
             34 -> view = imageView492
             35 -> view = imageView493

             else -> view = imageView1
         }
         return view
     }*/
}

package com.example.myott10

import android.app.Activity
import android.content.Context
import android.view.View
import kotlinx.android.synthetic.main.word1_layout.*
import kotlinx.android.synthetic.main.word2_layout.*
import kotlinx.android.synthetic.main.word3_layout.*
import kotlinx.android.synthetic.main.word4_layout.*

class Helper(val context: Context) {

    fun getView(index: Int): View? {
        var view: View? = null
        val activity=context as Activity
        with(activity) {
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

        }



        return view
    }


    /*
    *  fun getView(index: Int): View {
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


    fun getAnimation(st: String) = when (st) {
        "א" -> R.drawable.l2_101_allef
        "ב" -> R.drawable.l2_102_bet;
        "ג" -> R.drawable.l2_103_gimel
        "ד" -> R.drawable.l2_104_daled
        "ה" -> R.drawable.l2_105_haii
        "ו" -> R.drawable.l2_106_vav
        "ז" -> R.drawable.l2_107_zain
        "ח" -> R.drawable.l2_108_kait
        "ט" -> R.drawable.l2_109_tet
        "י" -> R.drawable.l2_110_yod
        "כ" -> R.drawable.l2_111_kaaf
        "ל" -> R.drawable.l2_112_lamed
        "מ" -> R.drawable.l2_113_mem
        "נ" -> R.drawable.l2_114_non
        "ס" -> R.drawable.l2_115_shamech
        "ע" -> R.drawable.l2_116_aahin
        "פ" -> R.drawable.l2_117_phaii
        "צ" -> R.drawable.l2_118_zadik
        "ק" -> R.drawable.l2_119_koof;
        "ר" -> R.drawable.l2_120_reash
        "ש" -> R.drawable.l2_121_sheen
        "ת" -> R.drawable.l2_122_taf
        "ם" -> R.drawable.l2_123_mem_shofit
        "ן" -> R.drawable.l2_124_non_shofit
        "ץ" -> R.drawable.l2_125_zhadik_shofit
        "ף" -> R.drawable.l2_126_pai_shofit
        "ך" -> R.drawable.l2_127_chaff_sofit

        else -> R.drawable.l2_101_allef
    }
    fun getAnimation0(st: String) = when (st) {
        "א" -> R.drawable.l0_101_allef
        "ב" -> R.drawable.l0_102_bet;
        "ג" -> R.drawable.l0_103_gimel
        "ד" -> R.drawable.l0_104_daled
        "ה" -> R.drawable.l0_105_haii
        "ו" -> R.drawable.l0_106_vav
        "ז" -> R.drawable.l0_107_zain
        "ח" -> R.drawable.l0_108_kait
        "ט" -> R.drawable.l0_109_tet
        "י" -> R.drawable.l0_110_yod
        "כ" -> R.drawable.l0_111_kaaf
        "ל" -> R.drawable.l0_112_lamed
        "מ" -> R.drawable.l0_113_mem
        "נ" -> R.drawable.l0_114_non
        "ס" -> R.drawable.l0_115_shamech
        "ע" -> R.drawable.l0_116_aahin
        "פ" -> R.drawable.l0_117_phaii
        "צ" -> R.drawable.l0_118_zadik
        "ק" -> R.drawable.l0_119_koof;
        "ר" -> R.drawable.l0_120_reash
        "ש" -> R.drawable.l0_121_sheen
        "ת" -> R.drawable.l0_122_taf
        "ם" -> R.drawable.l0_123_mem_shofit
        "ן" -> R.drawable.l0_124_non_shofit
        "ץ" -> R.drawable.l0_125_zhadik_shofit
        "ף" -> R.drawable.l0_126_pai_shofit
        "ך" -> R.drawable.l0_127_chaff_sofit

        else -> R.drawable.l0_101_allef
    }
}



/*fun getAnimation(st: String): Int {
    var re = 0
    if (st.equals("א")) re = R.drawable.l2_1_allef
    if (st.equals("ב")) re = R.drawable.l2_2_bet;
    if (st.equals("ג")) re = R.drawable.l2_3_gimel
    if (st.equals("ד")) re = R.drawable.l2_4_daled
    if (st.equals("ה")) re = R.drawable.hai0
    if (st.equals("ו")) re = R.drawable.vav0
    if (st.equals("ז")) re = R.drawable.zain0
    if (st.equals("ח")) re = R.drawable.kait0
    if (st.equals("ט")) re = R.drawable.tet0
    if (st.equals("י")) re = R.drawable.yod0

    if (st.equals("ל")) re = R.drawable.lamed0


    if (st.equals("נ")) re = R.drawable.non0



    if (st.equals("ר")) re = R.drawable.reash0

    return re;
}*/

/*  if (st.equals("ז")) re = R.drawable.zain;
  if (st.equals("ח")) re = R.drawable.kait;
  if (st.equals("ט")) re = R.drawable.tet;
  if (st.equals("י")) re = R.drawable.yod;
  if (st.equals("כ")) re = R.drawable.kaaf;
  if (st.equals("ל")) re = R.drawable.lamed;
  if (st.equals("מ")) re = R.drawable.mem;
  if (st.equals("נ")) re = R.drawable.non;
  if (st.equals("ס")) re = R.drawable.shmech;
  if (st.equals("ע")) re = R.drawable.aahin;
  if (st.equals("פ")) re = R.drawable.phaii;
  if (st.equals("צ")) re = R.drawable.zadik;
  if (st.equals("ק")) re = R.drawable.koof;
  if (st.equals("ר")) re = R.drawable.reash;
  if (st.equals("ש")) re = R.drawable.sheen;
  if (st.equals("ת")) re = R.drawable.taf;
  if (st.equals("ם")) re = R.drawable.mem_shofit;
  if (st.equals("ן")) re = R.drawable.non_shofit;
  if (st.equals("ץ")) re = R.drawable.zhadik_shofit;
  if (st.equals("ף")) re = R.drawable.pai_shofit;
  if (st.equals("ך")) re = R.drawable.chaff_sofit;*/
//}


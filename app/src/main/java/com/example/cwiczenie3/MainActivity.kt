package com.example.cwiczenie3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity()
//    ,StaticFragment.OnSelectListener
{
//    private var frag1: Fragment1? = null
//    private var frag2: Fragment2? = null
//    private var myTrans: FragmentTransaction? = null
//
////    brak utraty danych przy rotacji 1.1.4
//    private val TAG_F1 = "Fragment1"
//    private val TAG_F2 = "Fragment2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

////    brak utraty danych przy rotacji 1.1.4
//        if(savedInstanceState == null){
//            frag1 = Fragment1().newInstance()
//            frag2 = Fragment2().newInstance()
//
//            myTrans = supportFragmentManager.beginTransaction()
//            myTrans!!.add(R.id. dfcontainer, frag1!!, this.TAG_F1)
//            myTrans!!.detach(frag1!!)
//            myTrans!!.add(R.id. dfcontainer, frag2!!, this.TAG_F2)
//            myTrans!!.detach(frag2!!)
//            myTrans!!.commit()
//        }else{
//            frag1 = supportFragmentManager.findFragmentByTag(this.TAG_F1) as Fragment1?
//            frag2 = supportFragmentManager.findFragmentByTag(this.TAG_F2) as Fragment2?
//        }
    }
//    override fun onSelect(option: Int) {
//        val myTrans = supportFragmentManager.beginTransaction();
//        Log.d("myTag", "onSelect: option = $option")
////    brak utraty danych przy rotacji 1.1.4
//        when (option) {
//            1 -> {
//                myTrans.detach(frag2!!);
//                myTrans.attach(frag1!!);
//            }
//            2 -> {
//                myTrans.detach(frag1!!);
//                myTrans.attach(frag2!!);
//            }
//        }
//        myTrans.commit()
//        this.myTrans = myTrans
//    }
}
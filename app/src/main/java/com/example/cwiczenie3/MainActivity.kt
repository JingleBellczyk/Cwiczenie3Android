package com.example.cwiczenie3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.NavHostFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

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

        val navHostFragment = supportFragmentManager.findFragmentById(R.id.dfContainer) as NavHostFragment
        val navController = navHostFragment.navController
        val bottomNavigationView : BottomNavigationView = findViewById(R.id.bottom_navigation)

        // Ustaw nasłuchiwanie zdarzeń dla BottomNavigationView
        bottomNavigationView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.fragment_left -> {
                    Log.d("mTag","fragmentLeeeeeft")
                    navController.navigate(R.id.action_global_to_fragLeft)
                    true
                }
                R.id.fragment_center -> {
                    Log.d("mTag","fragmentCenter")
                    navController.navigate(R.id.action_global_to_fragCenter)
                    true
                }
                R.id.fragment_right -> {
                    Log.d("mTag","fragmentRight")
                    navController.navigate(R.id.action_global_to_fragRight)
                    true
                }
                else -> false
            }
        }
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
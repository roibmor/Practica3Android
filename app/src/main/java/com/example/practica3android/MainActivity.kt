package com.example.practica3android

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import android.support.v4.app.ListFragment
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast

class MainActivity: FragmentActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fragment1 = PrimerFragment()

        //guarda el fragmento de forma programática en un ViewGroup existente.
        val frag: FragmentManager = supportFragmentManager
        frag.beginTransaction().add(R.id.fragmentContainerView, fragment1).commit()



        /*
          boton2.setOnClickListener {
              val transaction = supportFragmentManager.beginTransaction()
              val fragmento = fragment3()
              transaction.replace(R.id.fragmentContainerView2, fragmento)
              transaction.addToBackStack(null)
              transaction.commit()
          }
          boton3.setOnClickListener {
              val transaction = supportFragmentManager.beginTransaction()
              val fragmento = fragment4()
              transaction.replace(R.id.fragmentContainerView2, fragmento)
              transaction.addToBackStack(null)
              transaction.commit()
          }
        */


    }


}
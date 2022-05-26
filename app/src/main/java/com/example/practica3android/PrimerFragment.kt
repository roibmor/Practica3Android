package com.example.practica3android

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentTransaction
import android.support.v4.app.ListFragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [PrimerFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PrimerFragment : Fragment() {
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    @SuppressLint("UseRequireInsteadOfGet")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val x = inflater.inflate(R.layout.fragment_primer, container, false)

        val boton = x.findViewById<Button>(R.id.button)
        val boton2 = x.findViewById<Button>(R.id.button2)
        val boton3 = x.findViewById<Button>(R.id.button3)

        boton.setOnClickListener {
            // Toast: para el "Cartel" que aparece en la parte inferior de la pantalla, por ese tiempo establecido
            // Para mostrar el aviso, llama al método show()
            Toast.makeText(activity, "Nuestro equipo", Toast.LENGTH_LONG).show()

            val fragmento = SegundoFragment()
            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()

            transaction.replace(R.id.fragmentContainerView2, fragmento)
            transaction.addToBackStack(null)
            transaction.commit()
        }

        boton2.setOnClickListener {
            // Toast: para el "Cartel" que aparece en la parte inferior de la pantalla, por ese tiempo establecido
            // Para mostrar el aviso, llama al método show()
            Toast.makeText(activity, "Inmuebles", Toast.LENGTH_LONG).show()

            val fragmento = TercerFragment()
            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()

            transaction.replace(R.id.fragmentContainerView2, fragmento)

            //agregar la transacción a una pila de retroceso de transacciones de fragmentos
            transaction.addToBackStack(null)
            transaction.commit()
        }

        boton3.setOnClickListener {
            // Toast: para el "Cartel" que aparece en la parte inferior de la pantalla, por ese tiempo establecido
            // Para mostrar el aviso, llama al método show()
            Toast.makeText(activity, "GoogleMaps", Toast.LENGTH_LONG).show()

            val fragmento = CuartoFragment()
            val transaction : FragmentTransaction = requireFragmentManager().beginTransaction()

            transaction.replace(R.id.fragmentContainerView2, fragmento)
            transaction.addToBackStack(null)
            transaction.commit()
        }


        return  x
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragment1.
         */

        fun newInstance(param1: String, param2: String) =
            PrimerFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}
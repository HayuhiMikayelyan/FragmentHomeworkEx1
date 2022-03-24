package com.example.fragmentex1

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FirstFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_first, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val edt_message = view.findViewById<EditText>(R.id.edt_message)
        val btn_send = view.findViewById<Button>(R.id.btn_send)

        btn_send.setOnClickListener {
            val bundle = Bundle()
            bundle.putString("m", edt_message.text.toString())

            val fragment = SecondFragment()
            fragment.arguments = bundle
            requireFragmentManager().beginTransaction()
                .replace(R.id.container,fragment,"SecondFragment")
                .commit()

        }
    }

}


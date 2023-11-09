package com.example.bottomaa

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.bottomaa.R
import com.example.bottomaa.databinding.FragmentFMoneyBinding

class FMoney : Fragment() {
    private lateinit var binding:FragmentFMoneyBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFMoneyBinding.inflate(inflater,container,false)
        val view = binding.root
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        var pilihan = 0

        var input = binding.bilangan1
        var v_Spin = binding.proses
        var v_Output = binding.output


        binding.hitung.setOnClickListener {
            var nilai1 = input.text.toString().toDouble()
            var hasil = 0.0

            if (pilihan.equals(0)){
                hasil = nilai1 / 14000
            }
            if (pilihan.equals(1)){
                hasil = nilai1 / 3339.09
            }
            if (pilihan.equals(2)){
                hasil = nilai1 / 188.11
            }
            if (pilihan.equals(3)){
                hasil = nilai1 / 16000
            }

            v_Output.text = hasil.toString()
        }



    }

}
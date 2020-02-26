package com.example.praassesment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.praassesment.databinding.FragmentMainBinding
import com.example.praassesment.databinding.FragmentPersegiPanjangBinding

/**
 * A simple [Fragment] subclass.
 */
class Persegi_Panjang : Fragment() {
    private var Panjang=0
    private var Lebar=0
    private var Luas=0
    private var Keliling =0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentPersegiPanjangBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_persegi__panjang,container,false)
        binding.apply {
            btnHitung1.setOnClickListener{
                Panjang=etPanjang.text.toString().toInt()
                Lebar=etLebar.text.toString().toInt()
                Luas = Panjang * Lebar
                Keliling= 2 * (Panjang + Lebar)
                tvLp.text="$Luas"
                tvKp.text="$Keliling"
            }
            btnS1.setOnClickListener{
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.setType("text/plan").putExtra(Intent.EXTRA_TEXT,"${tvLp.text}, ${tvKp.text}")
                startActivity(shareIntent)
            }

        }
        setHasOptionsMenu(true)
        return binding.root
    }


}

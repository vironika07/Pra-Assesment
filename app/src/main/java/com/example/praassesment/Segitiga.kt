package com.example.praassesment


import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.praassesment.databinding.FragmentPersegiPanjangBinding
import com.example.praassesment.databinding.FragmentSegitigaBinding
import kotlinx.android.synthetic.main.fragment_segitiga.*
import kotlin.math.pow
import kotlin.math.sqrt

/**
 * A simple [Fragment] subclass.
 */
class Segitiga : Fragment() {
    private var alas=0
    private var tinggi=0
    private var luas=0.0
    private var keliling =0.0

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentSegitigaBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_segitiga,container,false)
        binding.apply {
            btnHitung2.setOnClickListener{
                alas=etAlas.text.toString().toInt()
                tinggi=etTinggi.text.toString().toInt()
                luas = 0.5 * alas * tinggi
                keliling= alas + tinggi + (sqrt((alas.toDouble().pow(2) + tinggi.toDouble().pow(2))))
                tvLuassegitiga.text="$luas"
                tvKelilingpersegi.text="$keliling"
            }
            btnS2.setOnClickListener{
                val shareIntent = Intent(Intent.ACTION_SEND)
                shareIntent.setType("text/plain").putExtra(Intent.EXTRA_TEXT,"${tvLuassegitiga.text}, ${tvKelilingpersegi.text}")
                startActivity(shareIntent)
            }


        }
        setHasOptionsMenu(true)
        return binding.root
    }


}

package com.example.praassesment


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.example.praassesment.databinding.FragmentMainBinding
import kotlinx.android.synthetic.main.fragment_main.view.*

/**
 * A simple [Fragment] subclass.
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentMainBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_main,container,false)
        binding.apply {
            btnPersegipanjang.setOnClickListener{v: View ->
                v.findNavController().navigate(MainFragmentDirections.actionMainFragmentToPersegiPanjang2())
            }
            btnSegitiga.setOnClickListener{v: View ->
                v.findNavController().navigate(MainFragmentDirections.actionMainFragmentToSegitiga2())
            }
        }
        setHasOptionsMenu(true)
        return binding.root


    }




}

package com.fatihden.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fatihden.fragments.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {

    private var _binding : FragmentSecondBinding? = null
    private val binding = _binding!!
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        /*return inflater.inflate(R.layout.fragment_second, container, false)*/
        _binding =  FragmentSecondBinding.inflate(inflater,container,false)
        val view = binding.root
        return view


    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        arguments?.let {
            val userName = SecondFragmentArgs.fromBundle(it).userName
            binding.textView2.text =binding.textView2.text.toString() + "   " + userName
        }

    }

    override fun onDestroy() {
        super.onDestroy()

        _binding = null
    }

}
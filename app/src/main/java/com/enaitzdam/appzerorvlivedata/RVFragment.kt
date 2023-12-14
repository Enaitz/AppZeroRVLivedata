package com.enaitzdam.appzerorvlivedata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.enaitzdam.appzerorvlivedata.databinding.FragmentRVBinding


class RVFragment : Fragment() {
    private val viewModel: RVViewModel by viewModels()
    private lateinit var binding: FragmentRVBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        binding = FragmentRVBinding.inflate(inflater)


        val recyclerViewAlumnes = binding.recyclerView
        val alumnes : List<Alumne> = AlumneProvider.loadAlumnes()
        val alumAdapter = context?.let { AlumAdapter(it,alumnes) }

        recyclerViewAlumnes.adapter = alumAdapter
        recyclerViewAlumnes.layoutManager=LinearLayoutManager(context)
        recyclerViewAlumnes.setHasFixedSize(true)

        return binding.root
    }
}
package com.enaitzdam.appzerorvlivedata

import android.view.LayoutInflater
import android.content.Context
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.enaitzdam.appzerorvlivedata.databinding.ItemAlumneBinding

class AlumAdapter(val context: Context, val dataset: List<Alumne>) :
    RecyclerView.Adapter<AlumAdapter.AlumneViewHolder>() {

    private lateinit var binding: ItemAlumneBinding

    inner class AlumneViewHolder(var view: ItemAlumneBinding) :
        RecyclerView.ViewHolder(view.root) {
        fun bind(alumne: Alumne) {

            binding.textViewNomAlumne.text = alumne.nom
            binding.textViewEdatAlumne.text= alumne.edat.toString()
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlumneViewHolder {
        binding = ItemAlumneBinding.inflate(LayoutInflater.from(context), parent, false)
        return AlumneViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataset.size
    }

    override fun onBindViewHolder(holder: AlumneViewHolder, position: Int) {
        val alumne = dataset[position]
        holder.bind(alumne)
    }
}
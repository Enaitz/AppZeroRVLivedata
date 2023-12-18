package com.enaitzdam.appzerorvlivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class RVViewModel:ViewModel() {

    private val _alumnes = MutableLiveData<List<Alumne>>()
    val alumnes: LiveData<List<Alumne>> = _alumnes

    fun getAlumnes(){
        _alumnes.value=AlumneProvider.loadAlumnes()
    }
}
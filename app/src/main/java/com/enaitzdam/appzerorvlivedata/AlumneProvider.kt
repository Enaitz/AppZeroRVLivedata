package com.enaitzdam.appzerorvlivedata

public class AlumneProvider {
    companion object {
        fun loadAlumnes(): List<Alumne> {
            return listOf<Alumne>(
                Alumne("Piter", 22),
                Alumne("Rita", 16),
                Alumne("Txus", 25),
                Alumne("Lauri", 18),
                Alumne("McPato", 19)
            )
        }
    }
}
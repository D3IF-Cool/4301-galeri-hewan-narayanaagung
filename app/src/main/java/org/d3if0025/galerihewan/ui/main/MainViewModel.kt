package org.d3if0025.galerihewan.ui.main

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import org.d3if0025.galerihewan.Hewan
import org.d3if0025.galerihewan.R

class MainViewModel : ViewModel() {
    private val data = MutableLiveData<List<Hewan>>()
    init {
        data.value = initData()
    }
    private fun initData():List<Hewan> {
        return listOf(
            Hewan("Angsa", "Cygnus olor", R.drawable.angsa,"THIS IS TENDO MAYA !"),
            Hewan("Ayam", "Gallus gallus", R.drawable.ayam,"Winner winner chicken dinner"),
            Hewan("Bebek", "Cairina moschata", R.drawable.bebek,"PANGKAT KAU BEBEK"),
            Hewan("Domba", "Ovis ammon", R.drawable.domba,"Domba antaris dan domba tersesat"),
            Hewan("Kalkun", "Meleagris gallopavo", R.drawable.kalkun,"Turkey"),
            Hewan("Kambing", "Capricornis sumatrensis", R.drawable.kambing,"Messi is the GOAT"),
            Hewan("Kelinci", "Oryctolagus cuniculus", R.drawable.kelinci,"RABBIT ! TANK ! BEST MATCH !"),
            Hewan("Kerbau", "Bubalus bubalis", R.drawable.kerbau,"Barathrum"),
            Hewan("Kuda", "Equus caballus", R.drawable.kuda,"RIP JEAN BOY,MALAH JADI TITAN"),
            Hewan("Sapi", "Bos taurus", R.drawable.sapi,"EI EI OH !")
        )
    }
    fun getData(): LiveData<List<Hewan>> = data
}
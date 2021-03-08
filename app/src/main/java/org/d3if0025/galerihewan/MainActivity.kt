package org.d3if0025.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import org.d3if0025.galerihewan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d("MainActivity", "Jumlah data: " + getData().size)
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context, RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
    }
    private fun getData(): List<Hewan> {
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

}
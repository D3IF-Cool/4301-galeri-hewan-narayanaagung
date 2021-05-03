package org.d3if0025.galerihewan.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import org.d3if0025.galerihewan.Hewan
import org.d3if0025.galerihewan.R
import org.d3if0025.galerihewan.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    private lateinit var binding: FragmentMainBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(layoutInflater, container, false)
        with(binding.recyclerView) {
            addItemDecoration(DividerItemDecoration(context,
                    RecyclerView.VERTICAL))
            adapter = MainAdapter(getData())
            setHasFixedSize(true)
        }
        return binding.root

    }
    // Biasanya kita mengambil data dari database, atau server.
    // Tapi karena materi belum sampai, kita buat dummy saja.
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
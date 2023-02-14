package com.generamobile.head.frjrfjirfjirffrhfrhy

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.head.R
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.juok
import com.generamobile.head.glgtkogtkotgk.Nfirjirf.gtgt2gtgt8
import com.generamobile.head.gthyhyyhkohyko.Ojfirjifrjirfjirfijrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class SeeeecccmainFragment : Fragment() {


    override fun onAttach(context: Context) {
        super.onAttach(context)
        g2gt26gt62 = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        hy2.gtgtkngtkngtk.observe(viewLifecycleOwner) {
            if (it != null) {
                val frdegdefeded = it.toString()
                gtjotgjiogtjigt.edit().putString("mainId", frdegdefeded).apply()
            }
        }

        hy2.gtfrededed.observe(viewLifecycleOwner) {
            if (it != null) {

                gjgtjihgtjtggt = it.gtugthgthutgut
                h2hy55hy = it.gtjigtjijtgijtg
                nigtntguigtgt = it.bvhgtbgtgtgt

                gtjotgjiogtjigt.edit().putString(gtgt2gtgt8, gjgtjihgtjtggt).apply()
                gtjotgjiogtjigt.edit().putString(Coooooooooonnsst.vfbrfgy, h2hy55hy).apply()
                gtjotgjiogtjigt.edit().putString(juok, nigtntguigtgt).apply()

                findNavController().navigate(R.id.action_seeeecccmainFragment_to_beefooooreFragment)
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seeeecccmain, container, false)
    }

    val hy2 by activityViewModel<Ojfirjifrjirfjirfijrf>(named("MainModel"))
    lateinit var gjgtjihgtjtggt: String
    lateinit var nigtntguigtgt: String
    lateinit var h2hy55hy: String
    private lateinit var g2gt26gt62: Context

    val gtjotgjiogtjigt: SharedPreferences by inject(named("SharedPreferences"))
}
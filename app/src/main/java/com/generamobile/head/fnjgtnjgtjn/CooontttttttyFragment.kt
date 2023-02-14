package com.generamobile.head.fnjgtnjgtjn

import android.content.Context
import android.content.SharedPreferences
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.head.R
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.g2gt5gt5gt5
import com.generamobile.head.gthyhyyhkohyko.Ojfirjifrjirfjirfijrf
import org.koin.android.ext.android.inject
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class CooontttttttyFragment : Fragment() {
    private lateinit var gtjtghgthu: Context


    val gngtnhgthgt: SharedPreferences by inject(named("SharedPreferences"))
    val vngtuhgtugt by activityViewModel<Ojfirjifrjirfjirfijrf>(named("MainModel"))

    lateinit var gvbngtuihgthgt: String

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cooonttttttty, container, false)
    }
    override fun onAttach(context: Context) {
        super.onAttach(context)
        gtjtghgthu = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        vngtuhgtugt.frededed.observe(viewLifecycleOwner) {
            if (it!=null) {
                gvbngtuihgthgt = it.gthtghgthugt
                gngtnhgthgt.edit().putString(g2gt5gt5gt5, gvbngtuihgthgt).apply()
                igthgtihugtihgtutg()
            }
        }
    }

    private fun igthgtihugtihgtutg() {
        findNavController().navigate(R.id.action_cooontttttttyFragment_to_seeeecccmainFragment)
    }
}
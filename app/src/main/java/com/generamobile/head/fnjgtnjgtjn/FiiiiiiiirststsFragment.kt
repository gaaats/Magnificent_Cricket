package com.generamobile.head.fnjgtnjgtjn

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.generamobile.head.R
import com.generamobile.head.gthyhyyhkohyko.Ojfirjifrjirfjirfijrf
import org.koin.androidx.viewmodel.ext.android.activityViewModel
import org.koin.core.qualifier.named


class FiiiiiiiirststsFragment : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        hykoyhkohykohy=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        vfbgfgfrgyrf.juikklolool(hykoyhkohykohy)

        findNavController().navigate(R.id.action_fiiiiiiiirststsFragment_to_cooontttttttyFragment)

    }

    private lateinit var hykoyhkohykohy: Context

    val vfbgfgfrgyrf by activityViewModel<Ojfirjifrjirfjirfijrf>(named("MainModel"))

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_fiiiiiiiirststs, container, false)
    }



}
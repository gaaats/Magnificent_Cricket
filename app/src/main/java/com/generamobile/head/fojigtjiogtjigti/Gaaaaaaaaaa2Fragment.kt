package com.generamobile.head.fojigtjiogtjigti

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.lifecycle.lifecycleScope
import androidx.navigation.fragment.findNavController
import com.generamobile.head.R
import com.generamobile.head.databinding.FragmentGaaaaaaaaaa2Binding
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch


class Gaaaaaaaaaa2Fragment : Fragment() {

    override fun onDestroy() {
        fragmentGaaaaaaaaaa2Binding = null
        super.onDestroy()
    }

    private fun hy2hyhy6hy2hy() {
        Toast.makeText(
            requireContext(),
            "I have error, try again",
            Toast.LENGTH_SHORT
        ).show()
    }


    override fun onPause() {
        onDestroy()
        super.onPause()
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        try {

            lifecycleScope.launch {
                delay(2000)
                findNavController().navigate(R.id.action_gaaaaaaaaaa2Fragment_to_gaaaaaaaa1Fragment)
            }



        } catch (e: Exception) {
            hy2hyhy6hy2hy()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaaaaaaaaa2Binding = FragmentGaaaaaaaaaa2Binding.inflate(inflater, container, false)
        return binding.root
    }


    private var fragmentGaaaaaaaaaa2Binding: FragmentGaaaaaaaaaa2Binding? = null
    private val binding
        get() = fragmentGaaaaaaaaaa2Binding
            ?: throw RuntimeException("FragmentGaaaaaaaaaa2Binding = null")
}
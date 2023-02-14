package com.generamobile.head.fojigtjiogtjigti

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.generamobile.head.R
import com.generamobile.head.databinding.FragmentGaaaaaaaa1Binding
import kotlin.random.Random


class Gaaaaaaaa1Fragment : Fragment() {

    private val gtktgktgkok by lazy {
        listOf(
            binding.cennttt,
            binding.doovn,
            binding.lefyyyy,
        )
    }

    private fun hy2uj2uj(): Boolean {
        gtktgktgkok.forEach {
            if (it.visibility == View.VISIBLE) return false
        }
        return true
    }

    override fun onDestroy() {
        fragmentGaaaaaaaa1Binding = null
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

            gtjtgjiogtigt()
            gtkgtkgtkogtkogt()
            gtgtjigtjitgjigt()


        } catch (e: Exception) {
            hy2hyhy6hy2hy()
        }

        super.onViewCreated(view, savedInstanceState)
    }

    private fun gtgtjigtjitgjigt() {
        binding.doovn.setOnClickListener {
            val hyhy626hy = Random.nextInt(from = 100, until = 500)
            it.visibility = View.INVISIBLE
            val hyhyujik2iik2 = "Points ${hyhy626hy}"
            Toast.makeText(requireContext(), "${hyhyujik2iik2}", Toast.LENGTH_SHORT).show()
            if (hy2uj2uj()) {
                Toast.makeText(requireContext(), "Game over", Toast.LENGTH_SHORT).show()
                gtjojgtjijiogt()
            }
        }
    }

    private fun gtkgtkgtkogtkogt() {
        binding.cennttt.setOnClickListener {
            val h25hju5uj5uj = Random.nextInt(from = 100, until = 500)
            it.visibility = View.INVISIBLE
            val hynhuujujuj = "Points ${h25hju5uj5uj}"
            Toast.makeText(requireContext(), "${hynhuujujuj}", Toast.LENGTH_SHORT).show()
            if (hy2uj2uj()) {
                Toast.makeText(requireContext(), "Game over", Toast.LENGTH_SHORT).show()
                gtjojgtjijiogt()
            }
        }
    }

    private fun gtjtgjiogtigt() {
        binding.lefyyyy.setOnClickListener {
            val hyhyyhhy = Random.nextInt(from = 100, until = 500)
            it.visibility = View.INVISIBLE
            val hy2hy26hy26hy = "Points ${hyhyyhhy}"
            Toast.makeText(requireContext(), "${hy2hy26hy26hy}", Toast.LENGTH_SHORT).show()
            if (hy2uj2uj()) {
                Toast.makeText(requireContext(), "Game over", Toast.LENGTH_SHORT).show()
                gtjojgtjijiogt()
            }
        }
    }

    private fun gtjojgtjijiogt() {
        findNavController().navigate(R.id.action_gaaaaaaaa1Fragment_to_gaaaaaaaaaa2Fragment)
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentGaaaaaaaa1Binding = FragmentGaaaaaaaa1Binding.inflate(inflater, container, false)
        return binding.root
    }


    private var fragmentGaaaaaaaa1Binding: FragmentGaaaaaaaa1Binding? = null
    private val binding
        get() = fragmentGaaaaaaaa1Binding
            ?: throw RuntimeException("FragmentGaaaaaaaa1Binding = null")
}
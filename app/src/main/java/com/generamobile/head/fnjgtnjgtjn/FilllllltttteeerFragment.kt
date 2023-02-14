package com.generamobile.head.fnjgtnjgtjn

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Build
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.appsflyer.AppsFlyerLib
import com.generamobile.head.fojigtjiogtjigti.GaaaammmyActivity2
import com.generamobile.head.R
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.aps_id
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.bng
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.gt2gt26gt62gt
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.gthtghugt
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.g2gt5gt5gt5
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.juok
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.keyVAl
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.hhyjuujuj
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.vfbrfgy
import com.generamobile.head.glgtkogtkotgk.Nfirjirf.gtgt2gtgt8
import com.generamobile.head.glgtkogtkotgk.Nfirjirf.gtjitgji
import com.generamobile.head.glgtkogtkotgk.Nfirjirf.hkkhykyh
import com.generamobile.head.glgtkogtkotgk.Nfirjirf.vbrfyrfy
import com.generamobile.head.glgtkogtkotgk.Nfirjirf.vfbfedgfgr
import com.generamobile.head.glgtkogtkotgk.Nfirjirf.vfbfgfr
import com.generamobile.head.glgtkogtkotgk.Nfirjirf.vfbfgfrg
import com.generamobile.head.glgtkogtkotgk.Nfirjirf.gtgt2t66
import com.generamobile.head.glgtkogtkotgk.Nfirjirf.ghy2hy26
import com.generamobile.head.fuyrfhurfuhyrf.veebliiinknnkActivity2
import org.koin.android.ext.android.inject
import org.koin.core.qualifier.named


class FilllllltttteeerFragment : Fragment() {
    private lateinit var vfbcgfrfrgrf: Context
    val vnkgtjjhyi: SharedPreferences by inject(named("SharedPreferences"))

    override fun onAttach(context: Context) {
        super.onAttach(context)
        vfbcgfrfrgrf = context
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_filllllltttteeer, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val gthgthu = vnkgtjjhyi.getString(g2gt5gt5gt5, null)
        val hyhyhy3 = vnkgtjjhyi.getString("appCamp", null)
        val vbjfrfygfdgedftedt = vnkgtjjhyi.getString("deepSt", null)
        val hyhhyhy3 = vnkgtjjhyi.getString(gtgt2gtgt8, null)
        val appsgthyhyhy = vnkgtjjhyi.getString(vfbrfgy, null)
        val bdetdetyfed = vnkgtjjhyi.getString(juok, null)
        val hyhykhkph = vnkgtjjhyi.getString("mainId", null)
        val edjhedyudegfed = hhyjuujuj
        val hy2hyh = Build.VERSION.RELEASE
        val frjorfhfhr = vnkgtjjhyi.getString(gthtghugt, null)
        val hhy5hy5hy5hy: String? = vnkgtjjhyi.getString(bng, null)

        val vfbcddefde = Intent(activity, veebliiinknnkActivity2::class.java)
        val hyhy25ujuju8j = Intent(activity, GaaaammmyActivity2::class.java)

        val frpokgtkphyjihyji = AppsFlyerLib.getInstance().getAppsFlyerUID(vfbcgfrfrgrf)
        AppsFlyerLib.getInstance().setCollectAndroidID(true)

        vnkgtjjhyi.edit().putString(aps_id, frpokgtkphyjihyji).apply()

        val degyedged = "$bdetdetyfed$hkkhykyh$hyhyhy3&$vfbfgfr$frpokgtkphyjihyji&$vfbfedgfgr$hyhykhkph&$ghy2hy26$edjhedyudegfed&$vfbfgfrg$hy2hyh&$vbrfyrfy$gtgt2t66"
        val hy5yh8hy8hy = "$bdetdetyfed$vfbfgfr$frjorfhfhr&$vfbfedgfgr$hhy5hy5hy5hy&$ghy2hy26$edjhedyudegfed&$vfbfgfrg$hy2hyh&$vbrfyrfy$gtgt2t66"
        val gjogtgth = "$bdetdetyfed$hkkhykyh$vbjfrfygfdgedftedt&$vfbfgfr$frpokgtkphyjihyji&$vfbfedgfgr$hyhykhkph&$ghy2hy26$edjhedyudegfed&$vfbfgfrg$hy2hyh&$vbrfyrfy$gtjitgji"
        val rfjdehdeged = "$bdetdetyfed$hkkhykyh$vbjfrfygfdgedftedt&$vfbfgfr$frjorfhfhr&$vfbfedgfgr$hhy5hy5hy5hy&$ghy2hy26$edjhedyudegfed&$vfbfgfrg$hy2hyh&$vbrfyrfy$gtjitgji"

        when(appsgthyhyhy) {
            "1" ->
                if(hyhyhy3!!.contains(keyVAl)) {
                    vnkgtjjhyi.edit().putString(gt2gt26gt62gt, degyedged).apply()
                    vnkgtjjhyi.edit().putString("WebInt", "campaign").apply()
                    startActivity(vfbcddefde)
                    activity?.finish()
                } else if (vbjfrfygfdgedftedt!=null||hyhhyhy3!!.contains(gthgthu.toString())) {
                    vnkgtjjhyi.edit().putString(gt2gt26gt62gt, gjogtgth).apply()
                    vnkgtjjhyi.edit().putString("WebInt", "deepLink").apply()
                    startActivity(vfbcddefde)
                    activity?.finish()
                } else {
                    startActivity(hyhy25ujuju8j)
                    activity?.finish()
                }
            "0" ->
                if(vbjfrfygfdgedftedt!=null) {
                    vnkgtjjhyi.edit().putString(gt2gt26gt62gt, rfjdehdeged).apply()
                    vnkgtjjhyi.edit().putString("WebInt", "deepLinkNOApps").apply()
                    startActivity(vfbcddefde)
                    activity?.finish()
                } else if (hyhhyhy3!!.contains(gthgthu.toString())) {
                    vnkgtjjhyi.edit().putString(gt2gt26gt62gt, hy5yh8hy8hy).apply()
                    vnkgtjjhyi.edit().putString("WebInt", "geo").apply()
                    startActivity(vfbcddefde)
                    activity?.finish()
                } else {
                    startActivity(hyhy25ujuju8j)
                    activity?.finish()
                }
        }
    }
}
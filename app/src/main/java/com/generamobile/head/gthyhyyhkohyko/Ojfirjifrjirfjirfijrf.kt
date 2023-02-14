package com.generamobile.head.gthyhyyhkohyko

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.appsflyer.AppsFlyerConversionListener
import com.appsflyer.AppsFlyerLib
import com.facebook.applinks.AppLinkData
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.apappspspspsp
import com.generamobile.head.gtkogtkogtk.GeoDev
import com.generamobile.head.gtkogtkogtk.Ifruihfrhuhrf
import com.generamobile.head.gtkogtkogtk.HIufhrrfhrfhhrf
import com.generamobile.head.gtkogtkogtk.HUfrhuhrfhrfhhrf
import com.google.android.gms.ads.identifier.AdvertisingIdClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class Ojfirjifrjirfjirfijrf(
    private val gtgtkgtkkgt: HIufhrrfhrfhhrf,
    private val gthyujujuj: HUfrhuhrfhrfhhrf,
    private val frjrfjirfjifrji: SharedPreferences,
    val vffrrfgthy: Application
) : ViewModel() {



    private val hyhyhyujjujuki = MutableLiveData<Ifruihfrhuhrf>()
    val frededed: LiveData<Ifruihfrhuhrf>
        get() = hyhyhyujjujuki

    private val juiikikikik = MutableLiveData<GeoDev>()
    val gtfrededed: LiveData<GeoDev>
        get() = juiikikikik

    private val gtgthyhyhy = MutableLiveData<String>()
    val jukihygtftrfr: LiveData<String>
        get() = gtgthyhyhy

    init {
        viewModelScope.launch(Dispatchers.IO) {
            hhykohykohykohy()
        }
        viewModelScope.launch(Dispatchers.Main) {
            hyjuikkioolol()
        }
    }

    private val vbgbgbg = MutableLiveData<String?>()
    val gtgtkngtkngtk: LiveData<String?>
        get() = vbgbgbg


    suspend fun hyjuikkioolol() {
        hyhyhyujjujuki.postValue(gtgtkgtkkgt.ugtihgtuhgt().body())
        hyjujukiikikik()
    }

    suspend fun hyjujukiikikik() {
        juiikikikik.postValue(gthyujujuj.hy2hy2hy2().body())
    }

    fun vffrfgtgt(cont: Context) {
        AppsFlyerLib.getInstance()
            .init(apappspspspsp, nhjujkiol, vffrrfgthy)
        AppsFlyerLib.getInstance().start(cont)
    }

    fun juikklolool(cont: Context) {
        AppLinkData.fetchDeferredAppLinkData(
            cont
        ) { data: AppLinkData? ->
            data?.let {
                val deepData = data.targetUri?.host.toString()
                frjrfjirfjifrji.edit().putString("deepSt", deepData).apply()
            }
        }
    }

    private val nhjujkiol = object : AppsFlyerConversionListener {
        override fun onConversionDataSuccess(data: MutableMap<String, Any>?) {
            val dataGotten = data?.get("campaign").toString()
            gtgthyhyhy.postValue(dataGotten)
        }

        override fun onConversionDataFail(error: String?) {
        }

        override fun onAppOpenAttribution(data: MutableMap<String, String>?) {
        }

        override fun onAttributionFailure(error: String?) {
        }
    }


    fun hhykohykohykohy() {
        val advertisingIdClient = AdvertisingIdClient(vffrrfgthy)
        advertisingIdClient.start()
        val idUserAdvertising = advertisingIdClient.info.id.toString()
        vbgbgbg.postValue(idUserAdvertising)
    }

}
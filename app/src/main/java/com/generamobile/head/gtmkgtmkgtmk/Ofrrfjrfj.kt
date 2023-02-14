package com.generamobile.head.gtmkgtmkgtmk

import android.app.Application
import android.content.Context
import android.content.SharedPreferences
import com.generamobile.head.gthyhyyhkohyko.Ojfirjifrjirfjirfijrf
import com.generamobile.head.gtkogtkogtk.HIufhrrfhrfhhrf
import com.generamobile.head.gtkogtkogtk.HUfrhuhrfhrfhhrf
import com.generamobile.head.gtkogtkogtk.HUfryfrfygrfygrfrf
import com.generamobile.head.gtkogtkogtk.HUhfrgrfygrfrfy
import com.generamobile.head.gtkotgkogtk.Jfrhhurfgfryrfyg
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.qualifier.named
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val hyujjuujuj = module {

    single  <HUhfrgrfygrfrfy> (named("HostInter")){
        get<Retrofit>(named("RetroDev"))
            .create(HUhfrgrfygrfrfy::class.java)
    }

    single <HUfryfrfygrfygrfrf> (named("ApiInter")) {
        get<Retrofit>(named("RetroCountry"))
            .create(HUfryfrfygrfygrfrf::class.java)
    }
    single<Retrofit>(named("RetroCountry")) {
        Retrofit.Builder()
            .baseUrl("http://pro.ip-api.com/")
            .addConverterFactory(GsonConverterFactory.create(get()))
            .build()
    }
    single <Retrofit>(named("RetroDev")){
        Retrofit.Builder()
            .baseUrl("http://supremeelectrum.ink/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    factory (named("CountryRep")) {
        HIufhrrfhrfhhrf(get(named("ApiInter")))
    }

    factory  (named("DevRep")){
        HUfrhuhrfhrfhhrf(get(named("HostInter")))
    }
    single{
        bgvdeedde()
    }
    single (named("SharedPreferences")) {
        gbgnhnhhnjuuj(androidApplication())
    }
}

val hykoyhkohykohy = module {
    viewModel (named("MainModel")){
        Ojfirjifrjirfjirfijrf((get(named("CountryRep"))), get(named("DevRep")), get(named("SharedPreferences")), get())
    }
    viewModel(named("BeamModel")) {
        Jfrhhurfgfryrfyg(get())
    }
}

fun gbgnhnhhnjuuj(hyujjuuj: Application): SharedPreferences {
    return hyujjuuj.applicationContext.getSharedPreferences(
        "SHARED_PREF",
        Context.MODE_PRIVATE
    )
}

fun bgvdeedde(): Gson {
    return GsonBuilder().create()
}


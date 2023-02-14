package com.generamobile.head.frlrfpgtkotgko

import android.app.Application
import android.content.Context
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.bng
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.hy2hy8hy
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.g26tg6
import com.generamobile.head.frplrflrfplrf.Coooooooooonnsst.gthtghugt
import com.generamobile.head.gtmkgtmkgtmk.hyujjuujuj
import com.generamobile.head.gtmkgtmkgtmk.hykoyhkohykohy
import com.my.tracker.MyTracker
import com.onesignal.OneSignal
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.GlobalContext
import org.koin.core.logger.Level
import java.util.*

class BaaaaaabababaClass:Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this)
        OneSignal.setAppId(g26tg6)

        val gtutghugthugt = getSharedPreferences("SHARED_PREF", Context.MODE_PRIVATE)
        val gtiutguhgthg = getSharedPreferences("PREFS_NAME", 0)

        val hyhyhy3hy33yh = MyTracker.getTrackerParams()
        val bgntihu = MyTracker.getTrackerConfig()
        val gt26g6gt = MyTracker.getInstanceId(this)
        bgntihu.isTrackingLaunchEnabled = true
        val bnggtugthugt = UUID.randomUUID().toString()

        if (gtiutguhgthg.getBoolean("my_first_time", true)) {
            hyhyhy3hy33yh.setCustomUserId(bnggtugthugt)
            gtutghugthugt.edit().putString(gthtghugt, bnggtugthugt).apply()
            gtutghugthugt.edit().putString(bng, gt26g6gt).apply()
            gtiutguhgthg.edit().putBoolean("my_first_time", false).apply()
        } else {
            val gtigtuhgtfff = gtutghugthugt.getString(gthtghugt, bnggtugthugt)
            hyhyhy3hy33yh.setCustomUserId(gtigtuhgtfff)
        }
        MyTracker.initTracker(hy2hy8hy, this)

        GlobalContext.startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@BaaaaaabababaClass)
            modules(
                listOf(
                    hykoyhkohykohy, hyujjuujuj
                )
            )
        }
    }

}
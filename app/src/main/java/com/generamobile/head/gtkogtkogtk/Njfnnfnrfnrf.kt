package com.generamobile.head.gtkogtkogtk

import androidx.annotation.Keep
import com.google.gson.annotations.SerializedName
import retrofit2.Response
import retrofit2.http.GET


@Keep
data class GeoDev(
    @SerializedName("gao")
    val gtugthgthutgut: String,
    @SerializedName("linki")
    val bvhgtbgtgtgt: String,
    @SerializedName("numero")
    val gtjigtjijtgijtg: String,
)



interface HUhfrgrfygrfrfy {
    @GET("tutushka.json")
    suspend fun gtntguhgtuhgthgt(): Response<GeoDev>
}

class HIufhrrfhrfhhrf(private val y6hyhy: HUfryfrfygrfygrfrf) {
    suspend fun ugtihgtuhgt() = y6hyhy.gtiutghtghugt()
}
class HUfrhuhrfhrfhhrf(private val HUIhfrrfhhfruhrf: HUhfrgrfygrfrfy) {
    suspend fun hy2hy2hy2() = HUIhfrrfhhfruhrf.gtntguhgtuhgthgt()
}



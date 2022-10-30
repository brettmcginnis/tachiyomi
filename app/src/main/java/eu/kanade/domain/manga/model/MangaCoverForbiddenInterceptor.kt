package eu.kanade.domain.manga.model

import kotlinx.serialization.json.Json
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import uy.kohesive.injekt.injectLazy

class MangaCoverForbiddenInterceptor (
    private val client: OkHttpClient,
) : Interceptor{
    private val json: Json by injectLazy()

    override fun intercept(chain: Interceptor.Chain): Response {
        val request = chain.request().newBuilder()

        // on 403 / forbidden
        // see if we can get a new url with MangaCover
        // try at least once

        return chain.proceed(chain.request())
    }
}

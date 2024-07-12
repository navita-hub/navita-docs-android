package com.navita.navitadocs.config.core

import okhttp3.Interceptor
import okhttp3.OkHttpClient

object OkHttp3 {

    operator fun invoke(interceptor: Interceptor): OkHttpClient {
        return OkHttpClient()
            .newBuilder()
            .addInterceptor(interceptor)
            .build()
    }
}
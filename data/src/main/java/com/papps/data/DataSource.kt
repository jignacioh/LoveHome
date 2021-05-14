package com.papps.data

import com.papps.cache.CacheSource
import com.papps.remote.RemoteSource


interface DataSource {
    fun remote(): RemoteSource
    fun cache(): CacheSource
}
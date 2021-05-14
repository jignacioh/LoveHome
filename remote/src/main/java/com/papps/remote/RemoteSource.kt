package com.papps.remote

interface RemoteSource {
    fun handler(): ApiHandler
}
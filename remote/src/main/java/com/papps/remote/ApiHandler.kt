package com.papps.remote

import io.reactivex.Single

interface ApiHandler {
    fun getContactList(): Single<List<Response>>
}
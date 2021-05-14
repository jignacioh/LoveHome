package com.papps.remote

class ApiHandlerImpl(private val restApi: RestApi) : ApiHandler {
    override fun getContactList() = restApi.getContactList()
}
package com.papps.domain

import io.reactivex.Single

interface Repository {
    fun getContactList(): Single<ContactListUsecase.ResponseValues>
}
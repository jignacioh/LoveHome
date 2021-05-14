package com.papps.lovehome

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.papps.domain.ContactListUsecase
import com.papps.domain.UseCaseHandler
import io.reactivex.observers.DisposableSingleObserver
import javax.inject.Inject

class StuffsViewModel @Inject constructor(
    private val handler: UseCaseHandler,
    private val contactListUsecase: ContactListUsecase
) : ViewModel() {

    private val mutableLiveData = MutableLiveData<Boolean>()

    fun contactList(): MutableLiveData<Boolean> {

        val disposableSingleObserver = object :
            DisposableSingleObserver<ContactListUsecase.ResponseValues>() {
            override fun onSuccess(responseValues: ContactListUsecase.ResponseValues) {
                mutableLiveData.postValue(responseValues.isSuccess)
            }

            override fun onError(e: Throwable) {
                mutableLiveData.postValue(false)
            }
        }
        handler.execute(
            contactListUsecase,
            ContactListUsecase.RequestValues(),
            disposableSingleObserver
        )

        return mutableLiveData
    }

}
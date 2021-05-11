package com.aditprayogo.mycleanarchitecture.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.aditprayogo.mycleanarchitecture.domain.MessageEntity
import com.aditprayogo.mycleanarchitecture.domain.MessageUseCase

/**
 * Created by Aditiya Prayogo.
 */
class MainViewModel(private val messageUseCase: MessageUseCase) : ViewModel() {

    private val _message = MutableLiveData<MessageEntity>()
    val message: LiveData<MessageEntity>
        get() = _message

    fun setName(name: String) {
        _message.value = messageUseCase.getMessage(name)
    }
}
package com.aditprayogo.mycleanarchitecture.domain

/**
 * Created by Aditiya Prayogo.
 */
interface MessageUseCase {
    fun getMessage(name: String): MessageEntity
}
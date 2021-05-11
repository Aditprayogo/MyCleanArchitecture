package com.aditprayogo.mycleanarchitecture.domain

/**
 * Created by Aditiya Prayogo.
 */
interface IMessageRepository {
    fun getWelcomeMessage(name : String) : MessageEntity
}
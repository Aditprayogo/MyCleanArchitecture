package com.aditprayogo.mycleanarchitecture.data

import com.aditprayogo.mycleanarchitecture.domain.MessageEntity

/**
 * Created by Aditiya Prayogo.
 */
interface IMessageDataSource {
    fun getMessageFromSource(name: String): MessageEntity
}
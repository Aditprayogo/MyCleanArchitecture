package com.aditprayogo.mycleanarchitecture.data

import com.aditprayogo.mycleanarchitecture.domain.MessageEntity

/**
 * Created by Aditiya Prayogo.
 */
class MessageDataSource : IMessageDataSource {
    override fun getMessageFromSource(name: String) =
        MessageEntity("Hello $name! Welcome to Clean Architecture")
}
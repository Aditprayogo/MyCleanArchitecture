package com.aditprayogo.mycleanarchitecture.data

import com.aditprayogo.mycleanarchitecture.domain.IMessageRepository

/**
 * Created by Aditiya Prayogo.
 */
class MessageRepository(private val messageDataSource: IMessageDataSource) : IMessageRepository {
    override fun getWelcomeMessage(name: String) = messageDataSource.getMessageFromSource(name)
}
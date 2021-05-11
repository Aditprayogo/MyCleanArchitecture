package com.aditprayogo.mycleanarchitecture.di

import com.aditprayogo.mycleanarchitecture.data.IMessageDataSource
import com.aditprayogo.mycleanarchitecture.data.MessageDataSource
import com.aditprayogo.mycleanarchitecture.data.MessageRepository
import com.aditprayogo.mycleanarchitecture.domain.IMessageRepository
import com.aditprayogo.mycleanarchitecture.domain.MessageInteractor
import com.aditprayogo.mycleanarchitecture.domain.MessageUseCase

/**
 * Created by Aditiya Prayogo.
 */
object Injection {
    fun provideUseCase(): MessageUseCase {
        val messageRepository = provideRepository()
        return MessageInteractor(messageRepository)
    }

    private fun provideRepository(): IMessageRepository {
        val messageDataSource = provideDataSource()
        return MessageRepository(messageDataSource)
    }

    private fun provideDataSource(): IMessageDataSource {
        return MessageDataSource()
    }
}
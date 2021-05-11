package com.aditprayogo.mycleanarchitecture.domain

/**
 * Created by Aditiya Prayogo.
 */
class MessageInteractor(
    private val messageRepository: IMessageRepository
) : MessageUseCase {

    override fun getMessage(name: String): MessageEntity {
        return messageRepository.getWelcomeMessage(name)
    }
}
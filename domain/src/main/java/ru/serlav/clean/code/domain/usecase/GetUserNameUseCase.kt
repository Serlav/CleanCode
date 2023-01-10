package ru.serlav.clean.code.domain.usecase

import ru.serlav.clean.code.domain.models.UserName
import ru.serlav.clean.code.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }
}
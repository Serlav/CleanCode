package ru.serlav.cleancode.domain.usecase

import ru.serlav.cleancode.domain.models.UserName
import ru.serlav.cleancode.domain.repository.UserRepository

class GetUserNameUseCase(private val userRepository: UserRepository) {

    fun execute(): UserName {
        return userRepository.getName()
    }
}
package ru.serlav.cleancode.domain.usecase

import ru.serlav.cleencode.domain.models.SaveUserNameParam
import ru.serlav.cleancode.domain.repository.UserRepository

class SaveUserNameUseCase (private val userRepository: UserRepository) {
    fun execute(param: SaveUserNameParam): Boolean {
        val result : Boolean = userRepository.saveName(saveParam = param)
        return result

    }
}
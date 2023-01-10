package ru.serlav.cleancode.data.repository

import ru.serlav.cleancode.data.storage.models.User
import ru.serlav.cleancode.data.storage.UserStorage
import ru.serlav.cleencode.domain.models.SaveUserNameParam
import ru.serlav.cleancode.domain.models.UserName
import ru.serlav.cleancode.domain.repository.UserRepository

class UserRepositoryImpl(private val userStorage: UserStorage) : UserRepository {

    override fun saveName(saveParam: SaveUserNameParam): Boolean {
        val user = mapToStorage(saveParam)
        return userStorage.save(user)
    }

    override fun getName(): UserName {
        val user = userStorage.get()
        return mapToDomain(user)
    }

    private fun mapToStorage(saveParam: SaveUserNameParam): User {
        return User(firstName = saveParam.name, lastName = "")
    }

    private fun mapToDomain(user: User): UserName {
        return UserName(firstName = user.firstName, lastName = user.lastName)
    }
}
package ru.serlav.cleancode.data.storage

import ru.serlav.cleancode.data.storage.models.User

interface UserStorage {

    fun save(user: User): Boolean

    fun get(): User
}
package ru.serlav.cleancode.domain.repository

import ru.serlav.cleencode.domain.models.SaveUserNameParam
import ru.serlav.cleancode.domain.models.UserName

interface UserRepository {
    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}
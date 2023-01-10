package ru.serlav.clean.code.domain.repository

import ru.serlav.cleencode.domain.models.SaveUserNameParam
import ru.serlav.clean.code.domain.models.UserName

interface UserRepository {
    fun saveName(saveParam: SaveUserNameParam): Boolean

    fun getName(): UserName
}
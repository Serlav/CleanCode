package ru.serlav.cleancode.di

import org.koin.dsl.module
import ru.serlav.clean.code.domain.repository.UserRepository
import ru.serlav.cleancode.data.repository.UserRepositoryImpl
import ru.serlav.cleancode.data.storage.UserStorage
import ru.serlav.cleancode.data.storage.sharedPref.SharedPrefUserStorage

val dataModule = module {

    single<UserStorage> {
        SharedPrefUserStorage(context = get())
    }

    single<UserRepository> {
        UserRepositoryImpl(userStorage = get())
    }
}
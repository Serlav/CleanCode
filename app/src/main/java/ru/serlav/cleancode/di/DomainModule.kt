package ru.serlav.cleancode.di

import org.koin.dsl.module
import ru.serlav.clean.code.domain.usecase.GetUserNameUseCase
import ru.serlav.clean.code.domain.usecase.SaveUserNameUseCase


val domainModule = module {

    factory<GetUserNameUseCase> {
        GetUserNameUseCase(userRepository = get())
    }

    factory<SaveUserNameUseCase> {
        SaveUserNameUseCase(userRepository = get())
    }
}
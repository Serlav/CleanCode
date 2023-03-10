package ru.serlav.cleancode.di

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import ru.serlav.cleancode.presentation.MainViewModel

val appModule = module {

    viewModel<MainViewModel> {
        MainViewModel(
            getUserNameUseCase = get(),
            saveUserNameUseCase = get()
        )
    }
}
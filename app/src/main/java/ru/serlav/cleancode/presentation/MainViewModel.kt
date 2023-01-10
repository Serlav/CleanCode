package ru.serlav.cleancode.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import ru.serlav.clean.code.domain.models.UserName
import ru.serlav.clean.code.domain.usecase.GetUserNameUseCase
import ru.serlav.clean.code.domain.usecase.SaveUserNameUseCase
import ru.serlav.cleencode.domain.models.SaveUserNameParam

class MainViewModel(
    private val getUserNameUseCase: GetUserNameUseCase,
    private val saveUserNameUseCase: SaveUserNameUseCase
) : ViewModel() {

    private val resultLiveData = MutableLiveData<String>()
    val resultLive: LiveData<String> = resultLiveData

    fun save(text: String) {
        val params = SaveUserNameParam(name = text)
        val result: Boolean = saveUserNameUseCase.execute(param = params)
        resultLiveData.value = "Save result = $result"
    }

    fun load() {
        val userName: UserName = getUserNameUseCase.execute()
        resultLiveData.value = "${userName.firstName} ${userName.lastName}"

    }
}
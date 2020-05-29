package com.ferbajoo.whatsappclone.core.koin

import androidx.lifecycle.ViewModel

class HomeViewModel(useCase: HomeUseCase) : ViewModel() {

    val mjs = useCase.mgs

}

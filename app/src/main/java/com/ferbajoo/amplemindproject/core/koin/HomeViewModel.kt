package com.ferbajoo.amplemindproject.core.koin

import androidx.lifecycle.ViewModel

class HomeViewModel(useCase: HomeUseCase) : ViewModel() {

    val mjs = useCase.mgs

}

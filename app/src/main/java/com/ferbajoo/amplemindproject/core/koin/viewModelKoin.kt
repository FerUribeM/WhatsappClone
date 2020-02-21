package com.ferbajoo.amplemindproject.core.koin

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.module.Module
import org.koin.dsl.module

/**
 * Created by Fernando U on 2020-02-21.
 */

val viewModelModules: Module = module {
    viewModel { HomeViewModel() }
}
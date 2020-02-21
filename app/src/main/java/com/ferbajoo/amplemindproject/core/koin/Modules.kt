package com.ferbajoo.amplemindproject.core.koin

import org.koin.core.context.loadKoinModules

/**
 * Created by Fernando U on 2020-02-21.
 */

fun injectFeature() = loadFeature

private val loadFeature by lazy {
    loadKoinModules(
        viewModelModules,
        useCaseModule,
        networkModule,
        handleErrorModule
    )
}


package com.ferbajoo.whatsappclone.core.base

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

/**
 * Created by Fernando U on 2020-02-21.
 */
open class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin { androidContext(this@MyApp) }

    }

}
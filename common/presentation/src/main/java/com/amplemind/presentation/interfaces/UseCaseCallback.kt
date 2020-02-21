package com.amplemind.presentation.interfaces

/**
 * Created by Fernando U on 2019-11-11.
 */
interface UseCaseCallback<T> {
    fun mapEvent() {}
    fun setLoading() {}
    fun setError(error: String)
    fun setData(result: T)
}
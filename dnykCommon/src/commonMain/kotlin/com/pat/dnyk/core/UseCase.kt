package com.pat.dnyk.core

internal interface UseCase<DS : DataSource, P, R> {
    val dataSource: DS
    suspend fun execute(params: P): R
}

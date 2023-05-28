package com.pat.dnyk.usecases.authorize

import com.pat.dnyk.core.DataSource

internal interface AuthorizeDataSource : DataSource {
    suspend fun authorize()
}

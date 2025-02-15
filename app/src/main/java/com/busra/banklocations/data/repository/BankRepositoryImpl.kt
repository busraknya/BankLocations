package com.busra.banklocations.data.repository

import com.busra.banklocations.data.repository.datasource.RemoteDataSource
import javax.inject.Inject

class BankRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) {
}
package com.busra.banklocations.data.repository.datasource

import com.busra.banklocations.data.model.BankData

interface RemoteDataSource {
    suspend fun getBankDataSource() : BankData
}
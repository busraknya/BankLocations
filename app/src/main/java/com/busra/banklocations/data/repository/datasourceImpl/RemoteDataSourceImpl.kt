package com.busra.banklocations.data.repository.datasourceImpl

import com.busra.banklocations.data.model.BankData
import com.busra.banklocations.data.network.BankAPIService
import com.busra.banklocations.data.repository.datasource.RemoteDataSource
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor(
    private val bankAPIService: BankAPIService
): RemoteDataSource {

    override suspend fun getBankDataSource(): BankData {
        return bankAPIService.getBankDataNetwork()
    }

}
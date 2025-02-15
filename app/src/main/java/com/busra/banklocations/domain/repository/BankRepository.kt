package com.busra.banklocations.domain.repository

import com.busra.banklocations.common.Resource
import com.busra.banklocations.data.model.BankData
import kotlinx.coroutines.flow.Flow

interface BankRepository {

    fun getBankDataRepository() : Flow<Resource<BankData>>
}
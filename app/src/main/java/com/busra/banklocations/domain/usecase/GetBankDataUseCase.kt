package com.busra.banklocations.domain.usecase

import com.busra.banklocations.domain.repository.BankRepository
import javax.inject.Inject

class GetBankDataUseCase @Inject constructor(
    private val bankRepository: BankRepository
) {

    fun invoke() = bankRepository.getBankDataRepository()
}
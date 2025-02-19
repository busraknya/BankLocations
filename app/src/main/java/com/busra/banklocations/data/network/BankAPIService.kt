package com.busra.banklocations.data.network

import com.busra.banklocations.data.model.BankData
import retrofit2.http.GET

interface BankAPIService {
    @GET("bankdata")
    suspend fun getBankDataNetwork() : BankData
}
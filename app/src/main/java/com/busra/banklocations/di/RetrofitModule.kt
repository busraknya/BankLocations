package com.busra.banklocations.di

import com.busra.banklocations.common.Constans
import com.busra.banklocations.data.network.BankAPIService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RetrofitModule {
    //Creates the BankAPIService interface using the Retrofit object.
    @Provides
    @Singleton
    fun provideBankService(retrofit: Retrofit) : BankAPIService {
        return retrofit.create(BankAPIService::class.java)
    }

    //creates the retrofit object
    @Provides
    @Singleton
    fun provideRetrofit() : Retrofit {
        return Retrofit.Builder()
            .baseUrl(Constans.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

}
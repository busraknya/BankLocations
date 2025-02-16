package com.busra.banklocations.di

import com.busra.banklocations.data.network.BankAPIService
import com.busra.banklocations.data.repository.datasource.RemoteDataSource
import com.busra.banklocations.data.repository.datasourceImpl.RemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    @Singleton
    fun provideRemoteDataSource(bankAPIService: BankAPIService) : RemoteDataSource {
        return RemoteDataSourceImpl(bankAPIService)
    }
}
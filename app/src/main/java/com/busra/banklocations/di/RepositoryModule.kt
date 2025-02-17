package com.busra.banklocations.di

import com.busra.banklocations.data.repository.BankRepositoryImpl
import com.busra.banklocations.data.repository.datasource.RemoteDataSource
import com.busra.banklocations.domain.repository.BankRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideBankRepository(remoteDataSource: RemoteDataSource) : BankRepository {
        return BankRepositoryImpl(remoteDataSource)
    }
}
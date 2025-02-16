package com.busra.banklocations.ui.view.home

import com.busra.banklocations.data.model.BankDataItem

data class HomeScreenState(
    val isLoading : Boolean = false,
    val bankData : ArrayList<BankDataItem>? = null,
    val errorMessage : String? = null
)
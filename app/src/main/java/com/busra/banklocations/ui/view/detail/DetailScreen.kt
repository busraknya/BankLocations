package com.busra.banklocations.ui.view.detail

import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import com.busra.banklocations.data.model.BankDataItem
import com.google.gson.Gson
import java.net.URLEncoder
import java.nio.charset.StandardCharsets

@Composable
fun DetailScreen(
    bankDataJson: String
) {
    val context = LocalContext.current

    val gson = Gson()
    val _bankJson = URLEncoder.encode(bankDataJson, StandardCharsets.UTF_8.toString())
    val bankData =gson.fromJson(_bankJson, BankDataItem::class.java)


}
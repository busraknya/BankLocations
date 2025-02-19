package com.busra.banklocations.ui.component

import android.util.Log
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import com.busra.banklocations.R
import com.busra.banklocations.common.network.isNetworkAvailable
import kotlinx.coroutines.flow.Flow

@Composable
fun NoInternetDialog(callbackFlow: Flow<Boolean>) {
    val context = LocalContext.current
    val isConnected by callbackFlow.collectAsState(initial = isNetworkAvailable(context))

    val showDialog = remember { mutableStateOf(!isConnected) } // İnternet yoksa göster

    if (showDialog.value) {
        AlertDialog(
            title = {
                Text(stringResource(R.string.no_internet_connection))
            },
            text = {
                Text(stringResource(R.string.no_internet_connection_description))
            },
            onDismissRequest = {
                showDialog.value = false
            },
            confirmButton = {
                TextButton(
                    onClick = {
                        if (isNetworkAvailable(context)) {
                            showDialog.value = false // İnternet varsa dialog kapansın
                        } else {
                            Log.e("TAG", "Still no internet")
                        }
                    }
                ) {
                    Text(text = stringResource(R.string.try_again))
                }
            }
        )
    }
}

package com.spinoza.featuremain.presentation.home.team

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState
import com.spinoza.featuremain.R

@Composable
fun TeamUi(component: Team, modifier: Modifier = Modifier) {
    val model by component.models.subscribeAsState()

    Column(modifier = modifier) {
        Text(stringResource(R.string.team), fontWeight = FontWeight.Bold)
        LazyColumn(modifier = modifier) {
            items(model.team, key = { it.hashCode() }) {
                Text(it.fullName)
            }
        }
    }
}
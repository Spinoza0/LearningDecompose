package com.spinoza.learningdecompose.main.presentation.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState
import com.spinoza.learningdecompose.main.R

@Composable
fun ProfileUi(component: Profile, modifier: Modifier = Modifier) {
    val model by component.models.subscribeAsState()
    Column(modifier = modifier) {
        Text(stringResource(R.string.profile), fontWeight = FontWeight.Bold)
        Text(model.person.fullName)
    }
}
package com.spinoza.learningdecompose.presentation.feature.main.home.tasks

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.spinoza.learningdecompose.R

@Composable
fun ButtonOpenTeamUi(component: ButtonOpenTeam, modifier: Modifier = Modifier) {
    Button(
        onClick = component::onButtonClick,
        modifier = modifier.fillMaxWidth()
    ) {
        Row {
            val text = stringResource(R.string.show_team)
            Icon(imageVector = Icons.Default.AccountCircle, contentDescription = text)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text)
        }
    }
}
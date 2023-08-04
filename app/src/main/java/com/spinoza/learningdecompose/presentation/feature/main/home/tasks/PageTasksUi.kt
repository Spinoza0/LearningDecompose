package com.spinoza.learningdecompose.presentation.feature.main.home.tasks

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.arkivanov.decompose.extensions.compose.jetpack.subscribeAsState
import com.spinoza.learningdecompose.R

@Composable
fun PageTasksUi(component: PageTasks, modifier: Modifier = Modifier) {
    val model by component.tasks.models.subscribeAsState()
    Column(
        modifier = modifier.padding(8.dp)
    ) {
        Button(
            onClick = component::onTeamClicked,
            modifier = Modifier.fillMaxWidth()
        ) {
            Row {
                val text = stringResource(R.string.show_team)
                Icon(imageVector = Icons.Default.AccountCircle, contentDescription = text)
                Spacer(modifier = Modifier.width(8.dp))
                Text(text)
            }
        }
        LazyColumn(modifier = modifier) {
            items(model.tasks, key = { it }) {
                Text(it, modifier = Modifier
                    .clickable { }
                    .fillMaxWidth()
                )
            }
        }
    }
}
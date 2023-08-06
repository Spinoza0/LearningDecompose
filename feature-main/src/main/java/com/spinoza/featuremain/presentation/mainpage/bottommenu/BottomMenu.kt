package com.spinoza.featuremain.presentation.mainpage.bottommenu

import com.arkivanov.decompose.value.Value
import com.arkivanov.essenty.parcelable.Parcelable
import com.arkivanov.essenty.parcelable.Parcelize

interface BottomMenu {

    val models: Value<Model>

    fun onHomeClicked()

    fun onProfileClicked()

    @Parcelize
    data class Model(val isHomeScreen: Boolean) : Parcelable
}
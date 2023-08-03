package com.spinoza.learningdecompose.presentation.feature.main.mainpage

import com.arkivanov.decompose.ComponentContext
import com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu.BottomMenu
import com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu.BottomMenuComponent

class PageMainComponent(
    componentContext: ComponentContext,
    onHomeClick: () -> Unit,
    onProfileClick: () -> Unit,
) : PageMain, ComponentContext by componentContext {

    override val mainRoot: MainRoot = MainRootComponent(componentContext)

    override val bottomMenu: BottomMenu = BottomMenuComponent(onHomeClick, onProfileClick)
}
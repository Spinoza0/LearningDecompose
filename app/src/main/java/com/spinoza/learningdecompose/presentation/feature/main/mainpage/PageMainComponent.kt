package com.spinoza.learningdecompose.presentation.feature.main.mainpage

import com.arkivanov.decompose.ComponentContext
import com.arkivanov.decompose.childContext
import com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu.BottomMenu
import com.spinoza.learningdecompose.presentation.feature.main.mainpage.bottommenu.BottomMenuComponent

class PageMainComponent(
    componentContext: ComponentContext,
    onTaskClick: (String) -> Unit,
) : PageMain, ComponentContext by componentContext {

    override val pageMainRoot: PageMainRoot = PageMainRootComponent(componentContext, onTaskClick)

    override val bottomMenu: BottomMenu = BottomMenuComponent(
        childContext(BOTTOM_MENU_CONTEXT),
        pageMainRoot::onHomeClicked,
        pageMainRoot::onProfileClicked
    )

    private companion object {

        const val BOTTOM_MENU_CONTEXT = "bottom menu"
    }
}
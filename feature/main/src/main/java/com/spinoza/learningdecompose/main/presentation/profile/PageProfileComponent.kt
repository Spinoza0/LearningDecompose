package com.spinoza.learningdecompose.main.presentation.profile

import com.arkivanov.decompose.ComponentContext

class PageProfileComponent(componentContext: ComponentContext) : PageProfile,
    ComponentContext by componentContext {

    override val profile: Profile = ProfileComponent()
}
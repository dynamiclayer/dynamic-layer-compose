package com.dynamiclayer.components.exampleView.destinations

import kotlinx.serialization.Serializable

sealed class Destinations {
    @Serializable
    data object MainScreen : Destinations()
    @Serializable
    data object HomeScreen : Destinations()
    @Serializable
    data object SettingScreen : Destinations()
    @Serializable
    data object TemplatesScreen : Destinations()


    @Serializable
    data object BottomNavigation : Destinations()



    @Serializable
    data object ButtonIcon : Destinations()

    @Serializable
    data object Buttons : Destinations()

    @Serializable
    data object ButtonsDock : Destinations()


    @Serializable
    data object Card : Destinations()




    @Serializable
    data object Inputs : Destinations()



    @Serializable
    data object BadgeNotification : Destinations()



    @Serializable
    data object TopNavigation : Destinations()


}

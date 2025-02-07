package com.dynamiclayer.components.exampleView.navigation

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dynamiclayer.components.ButtonIcon.IconButtonSample
import com.dynamiclayer.components.bottomNavigation.BottomNavigationSample
import com.dynamiclayer.components.buttonDock.ButtonsDockSample
import com.dynamiclayer.components.button.ButtonsSample
import com.dynamiclayer.components.card.CardSample
import com.dynamiclayer.components.exampleView.destinations.Destinations
import com.dynamiclayer.components.exampleView.screens.MainScreen
import com.dynamiclayer.components.inputField.InputFieldsSample
import com.dynamiclayer.components.badgeNotification.BadgeNotificationSample
import com.dynamiclayer.components.topNavigation.TopNavigationSample

@OptIn(ExperimentalMaterial3Api::class, ExperimentalFoundationApi::class)
@Composable
fun MainNavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Destinations.MainScreen) {
        composable<Destinations.MainScreen> {
            MainScreen(navController = navController)
        }

        composable<Destinations.BottomNavigation> {
            BottomNavigationSample(navController)
        }

        composable<Destinations.ButtonIcon> {
            IconButtonSample(coroutineScope = rememberCoroutineScope())
        }
        composable<Destinations.Buttons> {
            ButtonsSample(navController)
        }
        composable<Destinations.ButtonsDock> {
            ButtonsDockSample(navController)
        }

        composable<Destinations.Card> {
            CardSample()
        }


        composable<Destinations.Inputs> {
            InputFieldsSample(navController)
        }

        composable<Destinations.BadgeNotification> {
            BadgeNotificationSample()
        }


        composable<Destinations.TopNavigation> {
            TopNavigationSample(navController)
        }


    }
}
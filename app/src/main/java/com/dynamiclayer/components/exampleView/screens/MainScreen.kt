package com.dynamiclayer.components.exampleView.screens

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.dynamiclayer.components.R
import com.dynamiclayer.components.bottomNavigation.BottomNavigation
import com.dynamiclayer.components.bottomNavigation.models.BottomNavigationIconType
import com.dynamiclayer.components.exampleView.destinations.Destinations


@Composable
fun MainScreen(navController: NavController?) {
    val bottomNavController = rememberNavController()
    val currentDestination = bottomNavController.currentBackStackEntryAsState()
    Scaffold(modifier = Modifier.fillMaxSize(), bottomBar = {
        BottomNavigation(modifier = Modifier.fillMaxWidth(), content = {
            item(currentDestination.value?.destination?.route == Destinations.HomeScreen::class.qualifiedName,
                icon = BottomNavigationIconType.Drawable(R.drawable.ic_dynamiclayer),
                onClick = {
                    bottomNavController.navigate(Destinations.HomeScreen) {
                        popUpTo(bottomNavController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                },
                label = {
                    Text(text = "Home")
                })
            item(
                currentDestination.value?.destination?.route == Destinations.TemplatesScreen::class.qualifiedName,
                icon = BottomNavigationIconType.Drawable(R.drawable.ic_mailbox),
                onClick = {
                    bottomNavController.navigate(Destinations.TemplatesScreen) {
                        popUpTo(bottomNavController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                },
                label = {
                    Text(text = "Template")
                }
            )
            item(currentDestination.value?.destination?.route == Destinations.SettingScreen::class.qualifiedName,
                icon = BottomNavigationIconType.Drawable(R.drawable.ic_settings),
                onClick = {
                    bottomNavController.navigate(Destinations.SettingScreen) {
                        popUpTo(bottomNavController.graph.startDestinationId)
                        launchSingleTop = true
                    }
                },
                label = {
                    Text(text = "Settings")
                })
        })
    }, containerColor = Color.White) { innerPadding ->
        NavHost(
            navController = bottomNavController,
            startDestination = Destinations.HomeScreen,
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {
            composable<Destinations.HomeScreen> {
                HomeScreen(homeNavController = navController)
            }
            composable<Destinations.TemplatesScreen> {
                TemplateScreen(homeNavController = navController)
            }
            composable<Destinations.SettingScreen> {
                SettingScreen(homeNavController = navController)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewContent() {
    MainScreen(navController = null)
}
package com.dynamiclayer.components.exampleView.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dynamiclayer.components.R
import com.dynamiclayer.components.card.Card
import com.dynamiclayer.components.card.util.models.CardSize
import com.dynamiclayer.components.exampleView.destinations.Destinations
import com.dynamiclayer.components.topNavigation.TopNavigation
import com.dynamiclayer.components.topNavigation.utils.TopNavigationSize
import com.dynamiclayer.components.topNavigation.utils.models.TopNavigationIconType
import com.dynamiclayer.components.ui.theme.GeneralSpacing

@Immutable
data class HomeCard(val title: String, val icon: Int, val destination: Destinations)

@Composable
fun HomeScreen(homeNavController: NavController?) {
    val homeCards = remember {
        listOf(
            HomeCard(
                "Badge Notification", R.drawable.ic_input_success, Destinations.BadgeNotification
            ),
            HomeCard(
                "Bottom Navigation", R.drawable.ic_input_success, Destinations.BottomNavigation
            ),
            HomeCard("Button Icon", R.drawable.ic_input_success, Destinations.ButtonIcon),
            HomeCard("Button", R.drawable.ic_input_success, Destinations.Buttons),
            HomeCard("Button Dock", R.drawable.ic_input_success, Destinations.ButtonsDock),
            HomeCard("Card", R.drawable.ic_input_success, Destinations.Card),
            HomeCard("Inputs", R.drawable.ic_input_success, Destinations.Inputs),
            HomeCard("Top Navigation", R.drawable.ic_input_success, Destinations.TopNavigation),

            )
    }

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) {

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                contentPadding = PaddingValues(bottom = 12.dp),
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                horizontalArrangement = Arrangement.spacedBy(GeneralSpacing.p_16),
                verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_16)
            ) {
                item(span = {
                    GridItemSpan(2)
                }) {
                    TopNavigation(
                        title = "Home",
                        iconLeft = null,
                        iconRight = TopNavigationIconType.Drawable(drawable = R.drawable.dark_mode),
                        size = TopNavigationSize.lg,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
                itemsIndexed(homeCards, key = { _, it ->
                    it.hashCode()
                }) { index, it ->
                    Card(
                        title = it.title,
                        icon = it.icon,
                        description = "Component",
                        size = CardSize.lg,
                        onClick = {
                            homeNavController?.navigate(it.destination)
                        },
                        modifier = Modifier
                            .then(
                                if (index % 2 == 0) {
                                    Modifier.padding(start = GeneralSpacing.p_12)
                                } else {
                                    Modifier.padding(end = GeneralSpacing.p_12)
                                }
                            )
                            .fillMaxWidth()
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewContent() {
    HomeScreen(homeNavController = null)
}
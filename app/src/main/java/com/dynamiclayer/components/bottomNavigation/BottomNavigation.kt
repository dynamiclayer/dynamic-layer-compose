package com.dynamiclayer.components.bottomNavigation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.NavigationBarDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.dynamiclayer.components.R
import com.dynamiclayer.components.bottomNavigation.models.BottomNavigationIconType
import com.dynamiclayer.components.bottomNavigation.util.components.BottomNavigationScope
import com.dynamiclayer.components.exampleView.components.DetailContainer
import com.dynamiclayer.components.badgeNotification.util.BadgeNotificationSize
import com.dynamiclayer.components.topNavigation.TopNavigation
import com.dynamiclayer.components.topNavigation.utils.TopNavigationSize
import com.dynamiclayer.components.topNavigation.utils.models.TopNavigationIconType
import com.dynamiclayer.components.ui.theme.ColorPalette
import com.dynamiclayer.components.ui.theme.GeneralSpacing

@Immutable
data class BottomBarBadge(val badgeSize: BadgeNotificationSize, val number: Int = 0)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
fun BottomNavigationPreview() {
    BottomNavigationSample(null)
}

@ExperimentalMaterial3Api
@Composable
fun BottomNavigationSample(navController: NavHostController?) {

    val icon = remember {
        BottomNavigationIconType.Drawable(R.drawable.ic_dynamiclayer)
    }
    val label = remember {
        "Label"
    }
    Scaffold(containerColor = Color.White,
        snackbarHost = {},
        topBar = {
            TopNavigation(
                title = "bottom Navigation",
                size = TopNavigationSize.md,
                iconLeft = TopNavigationIconType.Vector(
                    imageVector = Icons.Outlined.KeyboardArrowLeft,
                    onClick = {
                        navController?.popBackStack()
                    }),
                iconRight = TopNavigationIconType.Drawable(
                    drawable = R.drawable.dark_mode,
                    onClick = {})
            )
        },
        content = { paddingValues ->
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentPadding = PaddingValues(15.dp),
                verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_32)
            ) {
                item {
                    DetailContainer(
                        title = "Count",
                        description = "You can edit the count with 2, 3, 4 or 5 parameter.",
                        content = {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = GeneralSpacing.p_16),
                                verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_16)
                            ) {
                                var selectedItemQuintuple2 by remember { mutableIntStateOf(0) }
                                BottomNavigation {
                                    repeat(2) { index ->
                                        item(
                                            selected = index == selectedItemQuintuple2,
                                            icon = icon,
                                            label = { Text(label) },
                                            onClick = {
                                                selectedItemQuintuple2 = index
                                            })
                                    }
                                }

                                var selectedItemQuintuple3 by remember { mutableIntStateOf(0) }
                                BottomNavigation {
                                    repeat(3) { index ->
                                        item(
                                            selected = index == selectedItemQuintuple3,
                                            icon = icon,
                                            label = { Text(label) },
                                            onClick = {
                                                selectedItemQuintuple3 = index
                                            })
                                    }
                                }
                                var selectedItemQuintuple4 by remember { mutableIntStateOf(0) }
                                BottomNavigation {
                                    repeat(4) { index ->
                                        item(
                                            selected = index == selectedItemQuintuple4,
                                            icon = icon,
                                            label = { Text(label) },
                                            onClick = {
                                                selectedItemQuintuple4 = index
                                            })
                                    }
                                }
                                var selectedItemQuintuple5 by remember { mutableIntStateOf(0) }
                                BottomNavigation {
                                    repeat(5) { index ->
                                        item(
                                            selected = index == selectedItemQuintuple5,
                                            icon = icon,
                                            label = { Text(label) },
                                            onClick = {
                                                selectedItemQuintuple5 = index
                                            })
                                    }
                                }

                            }

                        })

                }
                item {
                    DetailContainer(
                        title = "Label",
                        description = "You can edit the label with true or false parameter.",
                        content = {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = GeneralSpacing.p_16),
                                verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_16)
                            ) {
                                var selectedItemQuintuple2 by remember { mutableIntStateOf(0) }
                                BottomNavigation {
                                    repeat(2) { index ->
                                        item(
                                            selected = index == selectedItemQuintuple2,
                                            icon = icon,
                                            onClick = {
                                                selectedItemQuintuple2 = index
                                            })
                                    }
                                }



                            }

                        })

                }
                item {
                    DetailContainer(
                        title = "Badge",
                        description = "You can edit the badge with none, sm or md parameter.",
                        content = {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = GeneralSpacing.p_16),
                                verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_16)
                            ) {
                                var selectedItemQuintuple2 by remember { mutableIntStateOf(0) }
                                BottomNavigation {
                                    repeat(3) { index ->
                                        item(
                                            selected = index == selectedItemQuintuple2,
                                            icon = icon,
                                            label = {
                                                Text(text = label)
                                            },
                                            onClick = {
                                                selectedItemQuintuple2 = index
                                            }, badge = if(index==1) BottomBarBadge(BadgeNotificationSize.sm) else null)
                                    }
                                }
                                var selectedItemQuintuple3 by remember { mutableIntStateOf(0) }
                                BottomNavigation {
                                    repeat(3) { index ->
                                        item(
                                            selected = index == selectedItemQuintuple3,
                                            icon = icon,
                                            label = {
                                                Text(text =label)
                                            },
                                            onClick = {
                                                selectedItemQuintuple3 = index
                                            }, badge = if(index==1) BottomBarBadge(BadgeNotificationSize.md,5) else null)
                                    }
                                }



                            }

                        })

                }
            }
        })
}

@Composable
fun BottomNavigation(
    modifier: Modifier = Modifier,
    windowInsets: WindowInsets = NavigationBarDefaults.windowInsets,
    content: BottomNavigationScope.() -> Unit
) {
    val items = mutableListOf<@Composable RowScope.() -> Unit>()
    BottomNavigationScope(items).apply(content)

    when {
        items.size < 2 -> {
            Log.w(
                "BottomNavigation",
                "BottomNavigation requires at least 2 items. Currently: ${items.size}"
            )
        }

        items.size > 5 -> {
            Log.w(
                "BottomNavigation",
                "BottomNavigation supports up to 5 items. Extra items will be ignored."
            )
            RenderBottomNavigationBar(items.take(5), modifier, windowInsets)
        }

        else -> {
            RenderBottomNavigationBar(items, modifier, windowInsets)
        }
    }
}

@Composable
private fun RenderBottomNavigationBar(
    items: List<@Composable RowScope.() -> Unit>,
    modifier: Modifier,
    windowInsets: WindowInsets
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .windowInsetsPadding(windowInsets),
        color = Color.White
    ) {
        Row(
            modifier = Modifier
                .drawWithContent {
                    drawContent()
                    drawLine(
                        color = ColorPalette.Grey.grey300,
                        strokeWidth = 2.dp.value,
                        start = Offset(x = 0f, y = 0f),
                        end = Offset(x = size.width, y = 0f)
                    )
                }
                .fillMaxWidth()
                .padding(horizontal = GeneralSpacing.p_16)
                .height(64.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            items.forEach { it.invoke(this) }
        }
    }
}
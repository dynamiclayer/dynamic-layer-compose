package com.dynamiclayer.components.card

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.sizeIn
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dynamiclayer.components.R
import com.dynamiclayer.components.card.util.models.CardSize
import com.dynamiclayer.components.card.util.models.CardState
import com.dynamiclayer.components.ui.theme.AppRadius
import com.dynamiclayer.components.ui.theme.ColorPalette
import com.dynamiclayer.components.ui.theme.GeneralPaddings
import com.dynamiclayer.components.ui.theme.GeneralSpacing


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
private fun CardPreview() {
    CardSample()
}

@ExperimentalMaterial3Api
@Composable
fun CardSample() {
    Scaffold(containerColor = Color.White,
        snackbarHost = {},
        topBar = {},
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center,
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(horizontal = 12.dp),
                    horizontalArrangement = Arrangement.spacedBy(15.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        val cardState = remember {
                            mutableStateOf(CardState.Default)
                        }
                        Card(
                            title = "title",
                            descriptionEnable = false,
                            description = "Description",
                            icon = R.drawable.ic_dynamiclayer,
                            size = CardSize.md,
                            state = cardState.value,
                            onClick = {
                                if (cardState.value == CardState.Active) {
                                    cardState.value = CardState.Default
                                } else {
                                    cardState.value = CardState.Active
                                }
                            },
                            modifier = Modifier.fillMaxWidth(),
                        )
                        val cardState1 = remember {
                            mutableStateOf(CardState.Default)
                        }
                        Card(
                            title = "title",
                            description = "Description",
                            size = CardSize.md,
                            icon = R.drawable.ic_dynamiclayer,
                            state = cardState1.value, onClick = {
                                if (cardState1.value == CardState.Active) {
                                    cardState1.value = CardState.Default
                                } else {
                                    cardState1.value = CardState.Active
                                }
                            }, modifier = Modifier.fillMaxWidth()
                        )
                        val cardState2 = remember {
                            mutableStateOf(CardState.Active)
                        }
                        Card(
                            title = "title",
                            description = "Description",
                            size = CardSize.md,
                            icon = R.drawable.ic_dynamiclayer,
                            state = cardState2.value, onClick = {
                                if (cardState2.value == CardState.Active) {
                                    cardState2.value = CardState.Default
                                } else {
                                    cardState2.value = CardState.Active
                                }
                            }, modifier = Modifier.fillMaxWidth()
                        )
                        Card(
                            title = "title",
                            description = "Description",
                            size = CardSize.md,
                            icon = R.drawable.ic_dynamiclayer,
                            state = CardState.disabled, onClick = {

                            }, modifier = Modifier.fillMaxWidth()
                        )
                    }

                    Column(
                        modifier = Modifier
                            .weight(1f)
                            .fillMaxHeight(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.SpaceEvenly
                    ) {
                        val cardState = remember {
                            mutableStateOf(CardState.Default)
                        }
                        Card(
                            title = "title",
                            descriptionEnable = false,
                            description = "Description",
                            size = CardSize.lg,
                            icon = R.drawable.ic_crop,
                            state = cardState.value, onClick = {
                                if (cardState.value == CardState.Active) {
                                    cardState.value = CardState.Default
                                } else {
                                    cardState.value = CardState.Active
                                }
                            }, modifier = Modifier.fillMaxWidth()
                        )
                        val cardState1 = remember {
                            mutableStateOf(CardState.Default)
                        }
                        Card(
                            title = "title",
                            description = "Description Description Description Description",
                            size = CardSize.lg,
                            icon = R.drawable.ic_crop,
                            state = cardState1.value, onClick = {
                                if (cardState1.value == CardState.Active) {
                                    cardState1.value = CardState.Default
                                } else {
                                    cardState1.value = CardState.Active
                                }
                            }, modifier = Modifier.fillMaxWidth()
                        )
                        val cardState2 = remember {
                            mutableStateOf(CardState.Active)
                        }
                        Card(
                            title = "title",
                            description = "Description",
                            size = CardSize.lg,
                            icon = R.drawable.ic_crop,
                            state = cardState2.value, onClick = {
                                if (cardState2.value == CardState.Active) {
                                    cardState2.value = CardState.Default
                                } else {
                                    cardState2.value = CardState.Active
                                }
                            }, modifier = Modifier.fillMaxWidth()
                        )

                        Card(
                            title = "title",
                            description = "Description",
                            size = CardSize.lg,
                            icon = R.drawable.ic_crop,
                            state = CardState.disabled, onClick = {

                            }, modifier = Modifier.fillMaxWidth()
                        )
                    }

                }
            }
        },
        bottomBar = {

        })
}

@Composable
fun Card(
    modifier: Modifier = Modifier,
    title: String,
    @DrawableRes
    icon: Int,
    descriptionEnable: Boolean = true,
    description: String,
    size: CardSize,
    state: CardState=CardState.Default,
    onClick: () -> Unit
) {
    when (size) {
        CardSize.md -> MdCard(
            modifier = modifier,
            title = title,
            descriptionEnable = descriptionEnable,
            description = description,
            state = state, onClick = onClick, icon = icon
        )

        CardSize.lg -> LgCard(
            modifier = modifier,
            title = title,
            descriptionEnable = descriptionEnable,
            description = description,
            state = state, onClick = onClick, icon = icon
        )
    }
}

@Composable
private fun MdCard(
    modifier: Modifier = Modifier,
    title: String,
    @DrawableRes
    icon: Int,
    descriptionEnable: Boolean,
    description: String,
    state: CardState,
    onClick: () -> Unit
) {
    val titleTextStyle = state.titleStyle
    val descriptionTextStyle = state.descriptionStyle
    CardLayout(
        modifier = modifier,
        size = CardSize.md,
        state = state
    ) {
        Row(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .clickable(enabled = state != CardState.disabled, interactionSource = remember {
                    MutableInteractionSource()
                }, indication = null) { onClick() }
                .padding(GeneralPaddings.p_12),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(GeneralSpacing.p_12)
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = "",
                modifier = Modifier.size(24.dp),
                colorFilter = if (state == CardState.disabled) ColorFilter.tint(ColorPalette.Grey.grey500) else null

            )

            Column(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = title,
                    style = titleTextStyle, maxLines = 1, overflow = TextOverflow.Ellipsis
                )
                if (descriptionEnable) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = description,
                        style = descriptionTextStyle, maxLines = 1, overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }

}


@Composable
private fun LgCard(
    modifier: Modifier = Modifier,
    title: String,
    @DrawableRes
    icon: Int,
    descriptionEnable: Boolean,
    description: String,
    state: CardState,
    onClick: () -> Unit,
) {
    val titleTextStyle = state.titleStyle
    val descriptionTextStyle = state.descriptionStyle
    CardLayout(
        modifier = modifier,
        size = CardSize.lg,
        state = state
    ) {
        Column(
            modifier = Modifier
                .wrapContentHeight()
                .fillMaxWidth()
                .clickable(enabled = state != CardState.disabled, interactionSource = remember {
                    MutableInteractionSource()
                }, indication = null) { onClick() }
                .padding(GeneralPaddings.p_16),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_16)
        ) {
            Image(
                painter = painterResource(id = icon),
                contentDescription = "",
                modifier = Modifier.size(24.dp),
                colorFilter = if (state == CardState.disabled) ColorFilter.tint(ColorPalette.Grey.grey500) else null
            )
            Column(
                modifier = Modifier
                    .wrapContentHeight()
                    .fillMaxWidth()
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = title,
                    style = titleTextStyle, maxLines = 1, overflow = TextOverflow.Ellipsis
                )
                if (descriptionEnable) {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = description,
                        style = descriptionTextStyle, maxLines = 1, overflow = TextOverflow.Ellipsis
                    )
                }
            }
        }
    }
}

@Composable
private fun CardLayout(
    modifier: Modifier = Modifier,
    size: CardSize,
    state: CardState,
    content: @Composable () -> Unit
) {
    val cardHeight = size.height

    val cardBorder = state.cardBorder


    Box(
        modifier = modifier
            .sizeIn(maxHeight = cardHeight)
            .wrapContentHeight()
            .wrapContentWidth()
            .border(
                border = cardBorder,
                shape = RoundedCornerShape(AppRadius.rounded_lg)
            )
            .background(
                color = ColorPalette.White,
                shape = RoundedCornerShape(AppRadius.rounded_lg)
            )
    ) {
        content()
    }

}
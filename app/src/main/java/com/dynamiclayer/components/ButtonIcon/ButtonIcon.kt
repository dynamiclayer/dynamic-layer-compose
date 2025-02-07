package com.dynamiclayer.components.ButtonIcon

import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.dynamiclayer.components.R
import com.dynamiclayer.components.buttonIcon.util.components.IconButtonLayout
import com.dynamiclayer.components.buttonIcon.util.models.IconButtonIconType
import com.dynamiclayer.components.buttonIcon.util.models.IconButtonSize
import com.dynamiclayer.components.buttonIcon.util.models.IconButtonType
import com.dynamiclayer.components.ui.theme.ColorPalette
import com.dynamiclayer.components.ui.theme.styles.DefaultIconButtonStyles
import kotlinx.coroutines.CoroutineScope

@Preview(showBackground = true)
@Composable
private fun IconButtonPreview() {
    IconButtonSample(coroutineScope = rememberCoroutineScope())
}


@Composable
fun IconButtonSample(coroutineScope: CoroutineScope) {
    val snackBarHostState = remember { SnackbarHostState() }
    val selectedIcon = remember { IconButtonIconType.Drawable(R.drawable.ic_crop) }

    Scaffold(containerColor = Color.White, snackbarHost = {
        SnackbarHost(hostState = snackBarHostState) { data ->
            Snackbar(
                snackbarData = data,
                containerColor = ColorPalette.White,
                contentColor = ColorPalette.Black
            )
        }
    }, content = { paddingValues ->
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.spacedBy(20.dp),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            contentPadding = PaddingValues(vertical = 15.dp)
        ) {
            item {
                Column(
                    Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                )  {
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.lg, type = IconButtonType.Secondary)
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.lg, type = IconButtonType.Primary)
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.lg, type = IconButtonType.Tertiary)
                }


            }
            item {
                Column(
                    Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                )  {
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.md, type = IconButtonType.Secondary)
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.md, type = IconButtonType.Primary)
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.md, type = IconButtonType.Tertiary)
                }
            }
            item {
                Column(
                    Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                )  {
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.sm, type = IconButtonType.Secondary)
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.sm, type = IconButtonType.Primary)
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.sm, type = IconButtonType.Tertiary)
                }
            }
            item {
                Column(
                    Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.spacedBy(10.dp)
                )  {
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.xs, type = IconButtonType.Secondary)
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.xs, type = IconButtonType.Primary)
                    ButtonIcon(icon = selectedIcon, onClick = {}, size = IconButtonSize.xs, type = IconButtonType.Tertiary)
                }

            }
        }

    })
}

@Composable
fun ButtonIcon(
    modifier: Modifier = Modifier,
    onClick: () -> Unit,
    size: IconButtonSize,
    type: IconButtonType,
    enabled: Boolean = true,
    icon: IconButtonIconType
) {
    val interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
    val style = remember {

        when (type) {
            IconButtonType.Primary -> {
                when (size) {
                    IconButtonSize.lg -> DefaultIconButtonStyles.PrimaryIconButton.lgStyle
                    IconButtonSize.md -> DefaultIconButtonStyles.PrimaryIconButton.mdStyle
                    IconButtonSize.sm -> DefaultIconButtonStyles.PrimaryIconButton.smStyle
                    IconButtonSize.xs -> DefaultIconButtonStyles.PrimaryIconButton.xsStyle
                }
            }

            IconButtonType.Secondary -> {
                when (size) {
                    IconButtonSize.lg -> DefaultIconButtonStyles.SecondaryIconButton.lgStyle
                    IconButtonSize.md -> DefaultIconButtonStyles.SecondaryIconButton.mdStyle
                    IconButtonSize.sm -> DefaultIconButtonStyles.SecondaryIconButton.smStyle
                    IconButtonSize.xs -> DefaultIconButtonStyles.SecondaryIconButton.xsStyle
                }
            }

            IconButtonType.Tertiary -> {
                when (size) {
                    IconButtonSize.lg -> DefaultIconButtonStyles.TertiaryIconButton.lgStyle
                    IconButtonSize.md -> DefaultIconButtonStyles.TertiaryIconButton.mdStyle
                    IconButtonSize.sm -> DefaultIconButtonStyles.TertiaryIconButton.smStyle
                    IconButtonSize.xs -> DefaultIconButtonStyles.TertiaryIconButton.xsStyle
                }
            }
        }
    }
    IconButtonLayout(
        modifier = modifier,
        onClick = onClick,
        enabled = enabled,
        icon = icon,
        style = style,
        interactionSource = interactionSource
    )
}



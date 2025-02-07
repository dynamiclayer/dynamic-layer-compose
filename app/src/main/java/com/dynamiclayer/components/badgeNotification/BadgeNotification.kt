package com.dynamiclayer.components.badgeNotification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.dynamiclayer.components.badgeNotification.util.BadgeNotificationSize
import com.dynamiclayer.components.ui.theme.AppRadius
import com.dynamiclayer.components.ui.theme.AppTextWeight
import com.dynamiclayer.components.ui.theme.ColorPalette
import com.dynamiclayer.components.ui.theme.GeneralSpacing


@Composable
private fun BadgeNotificationLarge(
    modifier: Modifier = Modifier,
    text: String,
) {
    BadgeNotification(
        modifier = modifier,
        content = {
            Text(
                modifier = Modifier.padding(horizontal = GeneralSpacing.p_8),
                text = text,
                style = AppTextWeight.text_xs_semibold.copy(
                    color = ColorPalette.White,
                    textAlign = TextAlign.Center
                ), maxLines = 1
            )
        }
    )
}

@Composable
private fun BadgeNotificationSmall(
    modifier: Modifier = Modifier
) {
    BadgeNotification(
        modifier = modifier.size(GeneralSpacing.p_8),
    )
}

@Composable
fun BadgeNotification(
    modifier: Modifier = Modifier,
    size: BadgeNotificationSize,
    text: String = ""
) {
    when (size) {
        BadgeNotificationSize.sm -> {
            BadgeNotificationSmall(
                modifier = modifier
            )
        }

        BadgeNotificationSize.md -> {
            BadgeNotificationLarge(
                modifier = modifier,
                text = text
            )
        }
    }
}

@Composable
private fun BadgeNotification(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit = {}
) {
    Box(
        modifier = modifier
            .clip(CircleShape)
            .background(ColorPalette.Red.color500, RoundedCornerShape(AppRadius.rounded_full)),
        contentAlignment = Alignment.Center
    ) {
        content()
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
fun PreviewComponents() {
    BadgeNotificationSample()
}

@ExperimentalMaterial3Api
@Composable
fun BadgeNotificationSample() {
    Scaffold(containerColor = Color(0xFF404040),
        snackbarHost = {},
        topBar = {},
        content = { paddingValues ->
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
                contentAlignment = Alignment.Center,
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.SpaceEvenly,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    BadgeNotification(size = BadgeNotificationSize.sm)
                    BadgeNotification(size = BadgeNotificationSize.md, text = "5")
                }
            }
        },
        bottomBar = {

        })
}


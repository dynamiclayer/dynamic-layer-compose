package com.dynamiclayer.components.ui.theme.styles

import androidx.compose.foundation.BorderStroke
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.dynamiclayer.components.button.util.models.ButtonSize
import com.dynamiclayer.components.buttonIcon.util.models.IconButtonSize
import com.dynamiclayer.components.ui.theme.AppTextLinks
import com.dynamiclayer.components.ui.theme.AppTextWeight
import com.dynamiclayer.components.ui.theme.ButtonBorders
import com.dynamiclayer.components.ui.theme.ButtonColors
import com.dynamiclayer.components.ui.theme.ColorPalette
import com.dynamiclayer.components.ui.theme.styles.button.buttonStyle
import com.dynamiclayer.components.ui.theme.styles.iconButton.iconButtonStyle

object DefaultButtonStyles {
    object PrimaryButtons {
        val lgStyle = buttonStyle(
            ButtonSize.lg,
            ButtonColors.primaryBackground,
            ColorPalette.Grey.grey200,
            ColorPalette.Grey.grey600,
            ColorPalette.Voilet.color700,
            ButtonColors.primaryText,
            AppTextWeight.text_base_bold,
            ButtonBorders.primaryButtonBorder
        )
        val mdStyle = buttonStyle(
            ButtonSize.md,
            ButtonColors.primaryBackground,
            ColorPalette.Grey.grey200,
            ColorPalette.Grey.grey600,
            ColorPalette.Voilet.color700,
            ButtonColors.primaryText,
            AppTextWeight.text_base_bold,
            ButtonBorders.primaryButtonBorder
        )
        val smStyle = buttonStyle(
            ButtonSize.sm,
            ButtonColors.primaryBackground,
            ColorPalette.Grey.grey200,
            ColorPalette.Grey.grey600,
            ColorPalette.Voilet.color700,

            ButtonColors.primaryText,
            AppTextWeight.text_base_bold,
            ButtonBorders.primaryButtonBorder
        )
        val xsStyle = buttonStyle(
            ButtonSize.xs,
            ButtonColors.primaryBackground,
            ColorPalette.Grey.grey200,
            ColorPalette.Grey.grey600,
            ColorPalette.Voilet.color700,
            ButtonColors.primaryText,
            AppTextWeight.text_sm_bold,
            ButtonBorders.primaryButtonBorder
        )
    }

    object SecondaryButtons {
        val lgStyle = buttonStyle(
            ButtonSize.lg,
            ButtonColors.secondaryBackground,
            ColorPalette.Grey.grey100,
            ColorPalette.Grey.grey600,
            ColorPalette.Black,
            ButtonColors.secondaryText,
            AppTextWeight.text_base_bold,
            ButtonBorders.secondaryButtonBorder
        )
        val mdStyle = buttonStyle(
            ButtonSize.md,
            ButtonColors.secondaryBackground,
            ColorPalette.Grey.grey100,
            ColorPalette.Grey.grey600,
            ColorPalette.Black,

            ButtonColors.secondaryText,
            AppTextWeight.text_base_bold,
            ButtonBorders.secondaryButtonBorder
        )
        val smStyle = buttonStyle(
            ButtonSize.sm,
            ButtonColors.secondaryBackground,
            ColorPalette.Grey.grey100,
            ColorPalette.Grey.grey600,
            ColorPalette.Black,
            ButtonColors.secondaryText,
            AppTextWeight.text_base_bold,
            ButtonBorders.secondaryButtonBorder
        )
        val xsStyle = buttonStyle(
            ButtonSize.xs,
            ButtonColors.secondaryBackground,
            ColorPalette.Grey.grey100,
            ColorPalette.Grey.grey600,
            ColorPalette.Black,
            ButtonColors.secondaryText,
            AppTextWeight.text_sm_bold,
            ButtonBorders.secondaryButtonBorder
        )
    }

    object TertiaryButtons {
        val lgStyle = buttonStyle(
            ButtonSize.lg,
            ButtonColors.tertiaryBackground,
            ColorPalette.White,
            ColorPalette.Grey.grey500,
            ColorPalette.Grey.grey100,
            ButtonColors.tertiaryText,
            AppTextWeight.text_base_bold,
            ButtonBorders.tertiaryButtonBorder
        )
        val mdStyle = buttonStyle(
            ButtonSize.md,
            ButtonColors.tertiaryBackground,
            ColorPalette.White,
            ColorPalette.Grey.grey500,
            ColorPalette.Grey.grey100,
            ButtonColors.tertiaryText,
            AppTextWeight.text_base_bold,
            ButtonBorders.tertiaryButtonBorder
        )
        val smStyle = buttonStyle(
            ButtonSize.sm,
            ButtonColors.tertiaryBackground,
            ColorPalette.White,
            ColorPalette.Grey.grey500,
            ColorPalette.Grey.grey100,
            ButtonColors.tertiaryText,
            AppTextWeight.text_base_bold,
            ButtonBorders.tertiaryButtonBorder
        )
        val xsStyle = buttonStyle(
            ButtonSize.xs,
            ButtonColors.tertiaryBackground,
            ColorPalette.White,
            ColorPalette.Grey.grey500,
            ColorPalette.Grey.grey100,
            ButtonColors.tertiaryText,
            AppTextWeight.text_sm_bold,
            ButtonBorders.tertiaryButtonBorder
        )
    }

    object GhostButtons {
        val lgStyle = buttonStyle(
            ButtonSize.lg,
            ButtonColors.ghostBackground,
            Color.Transparent,
            ColorPalette.Grey.grey500,
            Color.Unspecified,
            ButtonColors.ghostText,
            AppTextLinks.text_base,
            ButtonBorders.ghostButtonBorder
        )
        val mdStyle = buttonStyle(
            ButtonSize.md,
            ButtonColors.ghostBackground,
            Color.Transparent,
            ColorPalette.Grey.grey500,
            Color.Unspecified,

            ButtonColors.ghostText,
            AppTextLinks.text_base,
            ButtonBorders.ghostButtonBorder
        )
        val smStyle = buttonStyle(
            ButtonSize.sm,
            ButtonColors.ghostBackground,
            Color.Transparent,
            ColorPalette.Grey.grey500,
            Color.Unspecified,
            ButtonColors.ghostText,
            AppTextLinks.text_base,
            ButtonBorders.ghostButtonBorder
        )
        val xsStyle = buttonStyle(
            ButtonSize.xs,
            ButtonColors.ghostBackground,
            Color.Transparent,
            ColorPalette.Grey.grey500,
            Color.Unspecified,
            ButtonColors.ghostText,
            AppTextLinks.text_sm,
            ButtonBorders.ghostButtonBorder
        )
    }
}

object DefaultIconButtonStyles {
    object PrimaryIconButton {
        val lgStyle = iconButtonStyle(
            size = IconButtonSize.lg,
            backgroundColor = ColorPalette.Voilet.color500,
            iconColor = ColorPalette.White,
            rippleColor = ColorPalette.Voilet.color700,
            border = BorderStroke(0.dp, Color.Transparent)
        )
        val mdStyle = iconButtonStyle(
            size = IconButtonSize.md,
            backgroundColor = ColorPalette.Voilet.color500,
            iconColor = ColorPalette.White,
            rippleColor = ColorPalette.Voilet.color700,
            border = BorderStroke(0.dp, Color.Transparent)

        )
        val smStyle = iconButtonStyle(
            size = IconButtonSize.sm,
            backgroundColor = ColorPalette.Voilet.color500,
            iconColor = ColorPalette.White,
            rippleColor = ColorPalette.Voilet.color700,
            border = BorderStroke(0.dp, Color.Transparent)

        )
        val xsStyle = iconButtonStyle(
            size = IconButtonSize.xs,
            backgroundColor = ColorPalette.Voilet.color500,
            iconColor = ColorPalette.White,
            rippleColor = ColorPalette.Voilet.color700,
            border = BorderStroke(0.dp, Color.Transparent)

        )
    }

    object SecondaryIconButton {
        val lgStyle = iconButtonStyle(
            size = IconButtonSize.lg,
            backgroundColor = ColorPalette.Grey.grey800,
            iconColor = ColorPalette.White,
            rippleColor = ColorPalette.Black,
            border = BorderStroke(0.dp, Color.Transparent)
        )
        val mdStyle = iconButtonStyle(
            size = IconButtonSize.md,
            backgroundColor = ColorPalette.Grey.grey800,
            iconColor = ColorPalette.White,
            rippleColor = ColorPalette.Black,
            border = BorderStroke(0.dp, Color.Transparent)
        )
        val smStyle = iconButtonStyle(
            size = IconButtonSize.sm,
            backgroundColor = ColorPalette.Grey.grey800,
            iconColor = ColorPalette.White,
            rippleColor = ColorPalette.Black,
            border = BorderStroke(0.dp, Color.Transparent)
        )
        val xsStyle = iconButtonStyle(
            size = IconButtonSize.xs,
            backgroundColor = ColorPalette.Grey.grey800,
            iconColor = ColorPalette.White,
            rippleColor = ColorPalette.Black,
            border = BorderStroke(0.dp, Color.Transparent)
        )
    }

    object TertiaryIconButton {
        val lgStyle = iconButtonStyle(
            size = IconButtonSize.lg,
            backgroundColor = ColorPalette.White,
            iconColor = ColorPalette.Black,
            rippleColor = ColorPalette.Grey.grey200,
            border = BorderStroke(1.dp, ColorPalette.Grey.grey200)
        )
        val mdStyle = iconButtonStyle(
            size = IconButtonSize.md,
            backgroundColor = ColorPalette.White,
            iconColor = ColorPalette.Black,
            rippleColor = ColorPalette.Grey.grey200,
            border = BorderStroke(1.dp, ColorPalette.Grey.grey200)
        )
        val smStyle = iconButtonStyle(
            size = IconButtonSize.sm,
            backgroundColor = ColorPalette.White,
            iconColor = ColorPalette.Black,
            rippleColor = ColorPalette.Grey.grey200,
            border = BorderStroke(1.dp, ColorPalette.Grey.grey200)
        )
        val xsStyle = iconButtonStyle(
            size = IconButtonSize.xs,
            backgroundColor = ColorPalette.White,
            iconColor = ColorPalette.Black,
            rippleColor = ColorPalette.Grey.grey200,
            border = BorderStroke(1.dp, ColorPalette.Grey.grey200)
        )
    }
}



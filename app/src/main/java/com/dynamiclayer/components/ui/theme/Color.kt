package com.dynamiclayer.components.ui.theme

import androidx.compose.foundation.interaction.InteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberUpdatedState
import androidx.compose.ui.graphics.Color
import com.dynamiclayer.components.ui.theme.ColorPalette.Black
import com.dynamiclayer.components.ui.theme.ColorPalette.Grey
import com.dynamiclayer.components.ui.theme.ColorPalette.Red
import com.dynamiclayer.components.ui.theme.ColorPalette.Transparent
import com.dynamiclayer.components.ui.theme.ColorPalette.Voilet
import com.dynamiclayer.components.ui.theme.ColorPalette.White

data class GreyScale(
    val grey50: Color,
    val grey100: Color,
    val grey200: Color,
    val grey300: Color,
    val grey400: Color,
    val grey500: Color,
    val grey600: Color,
    val grey700: Color,
    val grey800: Color,
    val grey900: Color
)

data class ColorScale(
    val color50: Color,
    val color100: Color,
    val color200: Color,
    val color300: Color,
    val color400: Color,
    val color500: Color,
    val color600: Color,
    val color700: Color,
    val color800: Color,
    val color900: Color,
    val color950: Color
)

object ColorPalette {

    val Platinum = ColorScale(
        color50 = Color(0xFFF8FAFC),
        color100 = Color(0xFFF1F5F9),
        color200 = Color(0xFFE2E8F0),
        color300 = Color(0xFFCBD5E1),
        color400 = Color(0xFF94A3B8),
        color500 = Color(0xFF64748B),
        color600 = Color(0xFF475569),
        color700 = Color(0xFF334155),
        color800 = Color(0xFF1E293B),
        color900 = Color(0xFF0F172A),
        color950 = Color(0xFF020617),
    )

    val Purple = ColorScale(
        color50 = Color(0xFFF5F2FF),
        color100 = Color(0xFFECE8FF),
        color200 = Color(0xFFDAD4FF),
        color300 = Color(0xFFC1B1FF),
        color400 = Color(0xFFA285FF),
        color500 = Color(0xFF7E49FF),
        color600 = Color(0xFF7630F7),
        color700 = Color(0xFF681EE3),
        color800 = Color(0xFF5718BF),
        color900 = Color(0xFF48169C),
        color950 = Color(0xFF2C0B6A),
    )

    val Green = ColorScale(
        color50 = Color(0xFFE8FFE4),
        color100 = Color(0xFFCBFFC5),
        color200 = Color(0xFF9AFF92),
        color300 = Color(0xFF5BFF53),
        color400 = Color(0xFF24FB20),
        color500 = Color(0xFF00DD00),
        color600 = Color(0xFF00B505),
        color700 = Color(0xFF028907),
        color800 = Color(0xFF086C0C),
        color900 = Color(0xFF0C5B11),
        color950 = Color(0xFF003305),
    )

    val Red = ColorScale(
        color50 = Color(0xFFFFF2F1),
        color100 = Color(0xFFFFE1DF),
        color200 = Color(0xFFFFC8C5),
        color300 = Color(0xFFFFA29D),
        color400 = Color(0xFFFF6C64),
        color500 = Color(0xFFFF2C20),
        color600 = Color(0xFFED2115),
        color700 = Color(0xFFC8170D),
        color800 = Color(0xFFA5170F),
        color900 = Color(0xFFA5170F),
        color950 = Color(0xFF4B0804),
    )

    val Voilet = ColorScale(
        color50 = Color(0xFFF5F2FF),
        color100 = Color(0xFFECE8FF),
        color200 = Color(0xFFDAD4FF),
        color300 = Color(0xFFC1B1FF),
        color400 = Color(0xFFA285FF),
        color500 = Color(0xFF7E49FF),
        color600 = Color(0xFF7630F7),
        color700 = Color(0xFF681EE3),
        color800 = Color(0xFF5718BF),
        color900 = Color(0xFF48169C),
        color950 = Color(0xFF2C0B6A)
    )

    val Blue = ColorScale(
        color50 = Color(0xFFEDFAFF),
        color100 = Color(0xFFD6F1FF),
        color200 = Color(0xFFB5E9FF),
        color300 = Color(0xFF83DCFF),
        color400 = Color(0xFF48C7FF),
        color500 = Color(0xFF1EA7FF),
        color600 = Color(0xFF0689FF),
        color700 = Color(0xFF0075FF),
        color800 = Color(0xFF0859C5),
        color900 = Color(0xFF0D4E9B),
        color950 = Color(0xFF0E305D)
    )

    val Yellow = ColorScale(
        color50 = Color(0xFFFFFFE7),
        color100 = Color(0xFFFEFFC1),
        color200 = Color(0xFFFFFD86),
        color300 = Color(0xFFFFF441),
        color400 = Color(0xFFFFE50D),
        color500 = Color(0xFFFFD600),
        color600 = Color(0xFFD19D00),
        color700 = Color(0xFFA67102),
        color800 = Color(0xFF89570A),
        color900 = Color(0xFF74470F),
        color950 = Color(0xFF442504),
    )

    val Grey = GreyScale(
        grey50 = Color(0xFFF6F6F6),
        grey100 = Color(0xFFEEEEEE),
        grey200 = Color(0xFFE2E2E2),
        grey300 = Color(0xFFCBCBCB),
        grey400 = Color(0xFFAFAFAF),
        grey500 = Color(0xFF757575),
        grey600 = Color(0xFF545454),
        grey700 = Color(0xFF333333),
        grey800 = Color(0xFF1F1F1F),
        grey900 = Color(0xFF141414)
    )

    val GreyDark = GreyScale(
        grey50 = Color(0xFF1F1F1F),
        grey100 = Color(0xFF333333),
        grey200 = Color(0xFF545454),
        grey300 = Color(0xFF757575),
        grey400 = Color(0xFFAFAFAF),
        grey500 = Color(0xFFCBCBCB),
        grey600 = Color(0xFFE2E2E2),
        grey700 = Color(0xFFEEEEEE),
        grey800 = Color(0xFFF6F6F6),
        grey900 = Color(0xFFFFFFFF)
    )

    val Black = Color(0xFF000000)
    val BlackDark = Color(0xFFFFFFFF)
    val White = Color(0xFFFFFFFF)
    val WhiteDark = Color(0xFF141414)
    val Transparent = Color(0x00000000)

}

object ButtonColors {
    val primaryBackground = Voilet.color500
    val primaryText = White

    val secondaryBackground = Grey.grey800
    val secondaryText = White

    val tertiaryBackground = White
    val tertiaryBorder = Grey.grey200
    val tertiaryText = Black

    val ghostBackground = Transparent
    val ghostText = Voilet.color500
}


object InputFieldColors {


    val inputColor = Black
    val errorTextColor = Red.color500
    val disabledTextColor = Grey.grey500
    val supportingErrorColor = Red.color500

    val cursorColor = Grey.grey500
    val errorCursorColor = Red.color500

    val placeholderColor = Grey.grey500
    val errorPlaceholderColor = Red.color500
    val disabledPlaceholderColor = Grey.grey500

    val labelColor = Grey.grey500
    val errorLabelColor = Red.color500
    val disabledLabelColor = Grey.grey500


    val textColor = Black

    @Composable
    internal fun textColor(
        enabled: Boolean,
        isSuccess: Boolean,
        isEmpty: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> Grey.grey500
            isSuccess -> Black
            focused || !isEmpty -> Black
            else -> Black
        }
        return rememberUpdatedState(targetValue)
    }

    @Composable
    internal fun cursorColor(isError: Boolean): State<Color> {
        return rememberUpdatedState(if (isError) errorCursorColor else cursorColor)
    }


    @Composable
    internal fun borderColor(
        isNotEmpty: Boolean,
        enabled: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> Grey.grey200
            focused || isNotEmpty -> Black
            else -> Grey.grey200
        }
        return rememberUpdatedState(targetValue)
    }

    @Composable
    fun textSelectionColors(
        enabled: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): TextSelectionColors {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledTextColor
            isError -> errorTextColor
            focused -> inputColor
            else -> textColor
        }
        return TextSelectionColors(
            handleColor = targetValue,
            backgroundColor = targetValue.copy(alpha = 0.12f)
        )
    }

    @Composable
    fun placeHolderColor(
        enabled: Boolean,
        isError: Boolean,
        interactionSource: InteractionSource
    ): State<Color> {
        val focused by interactionSource.collectIsFocusedAsState()

        val targetValue = when {
            !enabled -> disabledPlaceholderColor
            isError -> errorPlaceholderColor
            focused -> inputColor
            else -> placeholderColor
        }
        return rememberUpdatedState(targetValue)
    }


    @Composable
    fun labelColor(
        isError: Boolean,
        enabled: Boolean
    ): State<Color> {
        val targetValue = when {
            !enabled -> disabledLabelColor
            isError -> errorLabelColor
            else -> labelColor
        }
        return rememberUpdatedState(targetValue)
    }


    @Composable
    fun customInputFieldColors(
        enabled: Boolean,
        isError: Boolean,
        isSuccess: Boolean,
        isEmpty: Boolean,
        interactionSource: InteractionSource
    ): TextFieldColors {
        return TextFieldDefaults.colors(
            focusedTextColor = textColor(enabled, isSuccess, isEmpty, interactionSource).value,
            unfocusedTextColor = textColor(enabled, isSuccess, isEmpty, interactionSource).value,
            disabledTextColor = textColor(enabled, isSuccess, isEmpty, interactionSource).value,
            errorTextColor = textColor(enabled, isSuccess, isEmpty, interactionSource).value,
            cursorColor = cursorColor(isError).value,
            errorCursorColor = cursorColor(isError).value,
            selectionColors = textSelectionColors(enabled, isError, interactionSource),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            focusedLabelColor = labelColor(isError, enabled).value,
            unfocusedLabelColor = labelColor(isError, enabled).value,
            disabledLabelColor = labelColor(isError, enabled).value,
            errorLabelColor = labelColor(isError, enabled).value,
            focusedPlaceholderColor = placeHolderColor(
                enabled,
                isError,
                interactionSource
            ).value,
            unfocusedPlaceholderColor = placeHolderColor(
                enabled,
                isError,
                interactionSource
            ).value,
            disabledPlaceholderColor = placeHolderColor(
                enabled,
                isError,
                interactionSource
            ).value,
            errorPlaceholderColor = placeHolderColor(enabled, isError, interactionSource).value,
            focusedSupportingTextColor = errorTextColor,
            unfocusedSupportingTextColor = errorTextColor,
            disabledSupportingTextColor = errorTextColor,
            errorSupportingTextColor = errorTextColor,
        )
    }




}
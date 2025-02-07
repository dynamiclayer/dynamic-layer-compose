package com.dynamiclayer.components.inputField

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.text.selection.LocalTextSelectionColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.dynamiclayer.components.R
import com.dynamiclayer.components.exampleView.components.DetailContainer
import com.dynamiclayer.components.inputField.util.InputFieldIconType
import com.dynamiclayer.components.inputField.util.InputFieldState
import com.dynamiclayer.components.topNavigation.TopNavigation
import com.dynamiclayer.components.topNavigation.utils.TopNavigationSize
import com.dynamiclayer.components.topNavigation.utils.models.TopNavigationIconType
import com.dynamiclayer.components.ui.theme.AppRadius
import com.dynamiclayer.components.ui.theme.AppTextStrike
import com.dynamiclayer.components.ui.theme.AppTextWeight
import com.dynamiclayer.components.ui.theme.ColorPalette
import com.dynamiclayer.components.ui.theme.GeneralSpacing
import com.dynamiclayer.components.ui.theme.InputFieldColors
import com.dynamiclayer.components.ui.theme.InputFieldColors.customInputFieldColors
import com.dynamiclayer.components.ui.theme.InputFieldDimensions
import com.dynamiclayer.components.ui.theme.InputFieldDimensions.InputFieldSize
import com.dynamiclayer.components.ui.theme.InputFieldDimensions.dimensionsHeight
import com.dynamiclayer.components.ui.theme.InputFieldPaddings


@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Preview(showBackground = true)
private fun InputPreview() {
    InputFieldsSample(null)
}

@ExperimentalMaterial3Api
@Composable
fun InputFieldsSample(navController: NavController?) {
    Scaffold(containerColor = Color.White,
        snackbarHost = {},
        topBar = {
            TopNavigation(
                title = "Input Field",
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
                        title = stringResource(R.string.type),
                        description = "You can edit the type with default, success, disabled or error parameter.",
                        content = {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = GeneralSpacing.p_16),
                                verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_16)
                            ) {
                                val normalText = remember {
                                    mutableStateOf(TextFieldValue(""))
                                }
                                InputField(
                                    size = InputFieldSize.lg,
                                    placeholder = stringResource(R.string.input_field),
                                    text = normalText.value,
                                    onValueChange = {
                                        normalText.value = it
                                    }
                                )

                                val successText = remember {
                                    mutableStateOf(TextFieldValue(""))
                                }
                                InputField(
                                    size = InputFieldSize.lg,
                                    text = successText.value,
                                    onValueChange = {
                                        successText.value = it
                                    },
                                    isSuccess = true,
                                    placeholder = stringResource(R.string.input_field)
                                )

                                val disableText = remember {
                                    mutableStateOf(TextFieldValue(""))
                                }
                                InputField(
                                    size = InputFieldSize.lg,
                                    state = InputFieldState.disabled,
                                    text = disableText.value,
                                    onValueChange = {
                                        disableText.value = it
                                    },
                                    placeholder = stringResource(R.string.input_field)
                                )

                                val errorText = remember {
                                    mutableStateOf(TextFieldValue(""))
                                }
                                InputField(
                                    size = InputFieldSize.lg,
                                    text = errorText.value,
                                    onValueChange = {
                                        errorText.value = it
                                    },
                                    isError = true,
                                    errorText = "* Description",
                                    placeholder = stringResource(R.string.input_field)
                                )

                            }

                        })

                }
                item {
                    DetailContainer(
                        title = "Size",
                        description = "You can edit the size with sm, md or lg parameter.",
                        content = {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = GeneralSpacing.p_16),
                                verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_16)
                            ) {
                                val normalTextLg = remember {
                                    mutableStateOf(TextFieldValue(""))
                                }
                                InputField(
                                    size = InputFieldSize.lg,
                                    text = normalTextLg.value,
                                    onValueChange = {
                                        normalTextLg.value = it
                                    }, placeholder = stringResource(R.string.input_field)
                                )

                                val normalTextMd = remember {
                                    mutableStateOf(TextFieldValue(""))
                                }
                                InputField(
                                    size = InputFieldSize.md,
                                    text = normalTextMd.value,
                                    onValueChange = {
                                        normalTextMd.value = it
                                    }, placeholder = stringResource(R.string.input_field)
                                )

                                val normalTextSm = remember {
                                    mutableStateOf(TextFieldValue(""))
                                }
                                InputField(
                                    size = InputFieldSize.sm,
                                    text = normalTextSm.value,
                                    onValueChange = {
                                        normalTextSm.value = it
                                    }, placeholder = stringResource(R.string.input_field)
                                )


                            }

                        })

                }
                item {
                    DetailContainer(
                        title = stringResource(R.string.state),
                        description = "You can edit the state with default, active or filled parameter.",
                        content = {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = GeneralSpacing.p_16),
                                verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_16)
                            ) {
                                val normalTextDefault = remember {
                                    mutableStateOf(TextFieldValue(""))
                                }
                                InputField(
                                    size = InputFieldSize.lg,
                                    text = normalTextDefault.value,
                                    onValueChange = {
                                        normalTextDefault.value = it
                                    },
                                    placeholder = stringResource(R.string.input_field)
                                )


                                val normalTextActive = remember {
                                    mutableStateOf(TextFieldValue("Input Field"))
                                }
                                InputField(
                                    size = InputFieldSize.lg,
                                    text = normalTextActive.value,
                                    onValueChange = {
                                        normalTextActive.value = it
                                    },
                                    placeholder = stringResource(R.string.input_field)
                                )

                                val normalTextFilled = remember {
                                    mutableStateOf(TextFieldValue(""))
                                }
                                InputField(
                                    size = InputFieldSize.lg,
                                    text = normalTextFilled.value,
                                    onValueChange = {
                                        normalTextFilled.value = it
                                    },
                                    placeholder = stringResource(R.string.input_field)
                                )


                            }

                        })

                }
                item {
                    DetailContainer(
                        title = stringResource(R.string.iconleft),
                        description = "You can edit the iconLeft with true or false parameter.",
                        content = {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = GeneralSpacing.p_16),
                                verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_16)
                            ) {
                                val normalTextDefault = remember {
                                    mutableStateOf(TextFieldValue(""))
                                }
                                InputField(
                                    size = InputFieldSize.lg,
                                    text = normalTextDefault.value,
                                    onValueChange = {
                                        normalTextDefault.value = it
                                    },
                                    placeholder = stringResource(R.string.input_field),
                                    iconLeft = true,
                                    leftIcon = InputFieldIconType.Drawable(drawable = R.drawable.ic_crop)
                                )


                            }

                        })

                }

                item {
                    DetailContainer(
                        title = stringResource(R.string.iconRight),
                        description = "You can edit the iconRight with true or false parameter.",
                        content = {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = GeneralSpacing.p_16),
                                verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_16)
                            ) {
                                val normalTextDefault = remember {
                                    mutableStateOf(TextFieldValue(""))
                                }
                                InputField(
                                    size = InputFieldSize.lg,
                                    text = normalTextDefault.value,
                                    onValueChange = {
                                        normalTextDefault.value = it
                                    },
                                    placeholder = stringResource(R.string.input_field),
                                    iconRight = true,
                                    rightIcon = InputFieldIconType.Drawable(drawable = R.drawable.ic_crop)
                                )


                            }

                        })

                }

            }
        })


}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun InputField(
    size: InputFieldSize,
    state: InputFieldState = InputFieldState.default,
    placeholder: String? = null,
    text: TextFieldValue,
    errorText: String? = "Error",
    iconRight: Boolean = true,
    rightIcon: InputFieldIconType? = null,
    iconLeft: Boolean = false,
    leftIcon: InputFieldIconType? = null,
    onValueChange: (TextFieldValue) -> Unit,
    isError: Boolean = false,
    isSuccess: Boolean = false,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    keyboardActions: KeyboardActions = KeyboardActions.Default,
    singleLine: Boolean = false,
    maxLines: Int = if (singleLine) 1 else Int.MAX_VALUE,
    minLines: Int = 1,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() }
) {
    val isFocused = interactionSource.collectIsFocusedAsState().value

    val padding = InputFieldPaddings.inputFieldPadding(
        isFocused = isFocused || text.text.isNotEmpty(),
        size = size
    )
    val enabled = remember {
        state == InputFieldState.default
    }
    val textColor = InputFieldColors.textColor(
        enabled,
        isSuccess,
        text.text.isEmpty(),
        interactionSource
    ).value
    val selectionColors = InputFieldColors.textSelectionColors(enabled, isError, interactionSource)

    CompositionLocalProvider(LocalTextSelectionColors provides selectionColors) {
        Column(
            modifier = Modifier
                .wrapContentSize(), verticalArrangement = Arrangement.spacedBy(GeneralSpacing.p_8)
        ) {
            BasicTextField(
                value = text,
                modifier = Modifier
                    .fillMaxWidth()
                    .border(
                        width = if (isFocused || text.text.isNotEmpty()) 2.dp else 1.dp,
                        color = InputFieldColors.borderColor(
                            text.text.isNotEmpty(),
                            enabled, interactionSource
                        ).value,
                        shape = RoundedCornerShape(AppRadius.rounded_md)
                    )
                    .background(
                        color = ColorPalette.White,
                        shape = RoundedCornerShape(AppRadius.rounded_md)
                    )
                    .height(dimensionsHeight(size = size).value),
                onValueChange = onValueChange,
                enabled = enabled,
                readOnly = false,
                textStyle = AppTextWeight.text_base_regular.merge(color = textColor),
                cursorBrush = SolidColor(InputFieldColors.cursorColor(isError).value),
                visualTransformation = visualTransformation,
                keyboardOptions = keyboardOptions,
                keyboardActions = keyboardActions,
                interactionSource = interactionSource,
                singleLine = singleLine,
                maxLines = maxLines,
                minLines = minLines,
                decorationBox = @Composable { innerTextField ->
                    TextFieldDefaults.DecorationBox(
                        value = text.text,
                        visualTransformation = visualTransformation,
                        innerTextField = innerTextField,
                        label = placeholder?.let {
                            {
                                Label(
                                    label = placeholder,
                                    isNotEmpty = isFocused || text.text.isNotEmpty(),
                                    isError = isError,
                                    enabled = enabled
                                )
                            }
                        },
                        trailingIcon = if (iconRight &&
                            (rightIcon != null ||
                                    isError ||
                                    isSuccess ||
                                    !enabled)
                        ) {
                            {
                                TrailingIcon(
                                    trailingIcon = rightIcon,
                                    isEnabled = enabled,
                                    isError = isError,
                                    isSuccess = isSuccess
                                )
                            }
                        } else null,
                        leadingIcon = if (iconLeft &&
                            (leftIcon != null ||
                                    isError ||
                                    isSuccess ||
                                    !enabled)
                        ) {
                            {
                                LeadingIcon(
                                    leadingIcon = leftIcon,
                                    isEnabled = enabled,
                                    isError = isError,
                                    isSuccess = isSuccess
                                )
                            }
                        } else null,
                        supportingText = null,
                        singleLine = singleLine,
                        enabled = enabled,
                        isError = isError,
                        contentPadding = padding,
                        interactionSource = interactionSource,
                        colors = customInputFieldColors(
                            enabled = enabled,
                            isError = isError,
                            isSuccess = isSuccess,
                            isEmpty = text.text.isEmpty(),
                            interactionSource = interactionSource
                        ),
                        container = {
                            Box(
                                modifier = Modifier
                            )
                        }
                    )
                }
            )
            if (isError) {
                SupportingText(
                    supportingText = errorText ?: "Error",
                    size = size
                )
            }
        }
    }
}

@Composable
fun SupportingText(
    supportingText: String,
    size: InputFieldSize
) {
    val color = InputFieldColors.supportingErrorColor
    val mergedTextStyle = AppTextWeight.text_sm_medium.merge(color = color)

    Text(
        modifier = Modifier
            .wrapContentSize(),
        text = supportingText,
        style = mergedTextStyle, maxLines = 1, overflow = TextOverflow.Ellipsis
    )
}

@Composable
fun Label(
    label: String,
    isNotEmpty: Boolean,
    isError: Boolean,
    enabled: Boolean
) {
    val color = InputFieldColors.labelColor(isError, enabled).value

    val mergedTextStyle = if (isNotEmpty) {
        AppTextWeight.text_xs_regular.copy(color = color)
    } else {
        if (enabled) {
            AppTextWeight.text_base_regular.merge(color = color)
        } else {
            AppTextStrike.text_base
        }
    }

    Text(
        text = label,
        style = mergedTextStyle, maxLines = 1, overflow = TextOverflow.Ellipsis
    )
}


@Composable
fun TrailingIcon(
    trailingIcon: InputFieldIconType? = null,
    isEnabled: Boolean,
    isError: Boolean,
    isSuccess: Boolean
) {

    val icon = if (!isEnabled) InputFieldIconType.Drawable(drawable = R.drawable.ic_input_disabled)
    else if (isError) InputFieldIconType.Drawable(drawable = R.drawable.ic_error)
    else if (isSuccess) InputFieldIconType.Drawable(drawable = R.drawable.ic_input_success)
    else trailingIcon

    InputFieldIcon(
        icon = icon
    )
}

@Composable
fun LeadingIcon(
    leadingIcon: InputFieldIconType? = null,
    isEnabled: Boolean,
    isError: Boolean,
    isSuccess: Boolean
) {

    val icon = if (!isEnabled) InputFieldIconType.Drawable(drawable = R.drawable.ic_input_disabled)
    else if (isError) InputFieldIconType.Drawable(drawable = R.drawable.ic_error)
    else if (isSuccess) InputFieldIconType.Drawable(drawable = R.drawable.ic_input_success)
    else leadingIcon

    InputFieldIcon(
        icon = icon
    )
}

@Composable
fun InputFieldIcon(
    modifier: Modifier = Modifier,
    icon: InputFieldIconType? = InputFieldIconType.Drawable(drawable = R.drawable.ic_default),
    contentDescription: String? = null
) {
    when (icon) {
        is InputFieldIconType.Vector -> IconButton(modifier = modifier.size(
            InputFieldDimensions.inputFieldIconsSize
        ),
            onClick = { icon.onClick?.invoke() }) {
            Icon(
                imageVector = icon.imageVector,
                contentDescription = contentDescription
            )
        }

        is InputFieldIconType.Drawable -> IconButton(modifier = modifier.size(
            InputFieldDimensions.inputFieldIconsSize
        ),
            onClick = { icon.onClick?.invoke() }) {
            Image(
                painter = painterResource(icon.drawable),
                contentDescription = contentDescription
            )
        }

        else -> {}
    }

}



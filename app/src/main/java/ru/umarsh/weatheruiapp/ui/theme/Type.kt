package ru.umarsh.weatheruiapp.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ru.umarsh.weatheruiapp.R

val CustomFont = FontFamily(
    Font(R.font.futura_normal),
    Font(R.font.futura_bold, FontWeight.Bold),
    Font(R.font.futura_medium, FontWeight.Medium)
)
// Set of Material typography styles to start with
val Typography = Typography(
    defaultFontFamily = CustomFont
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)
package com.example.myapplication.ui.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.ui.graphics.Color

// 简化的颜色值定义（足够满足Lab8需求，无冗余）
private val LightPrimary = Color(0xFF6200EE)
private val LightSecondary = Color(0xFF03DAC6)
private val LightBackground = Color(0xFFFFFFFF)
private val LightSurface = Color(0xFFFFFBFE)
private val LightOnPrimary = Color.White
private val LightOnSecondary = Color.Black
private val LightOnBackground = Color.Black
private val LightOnSurface = Color.Black

private val DarkPrimary = Color(0xFFBB86FC)
private val DarkSecondary = Color(0xFF03DAC6)
private val DarkBackground = Color(0xFF121212)
private val DarkSurface = Color(0xFF1E1E1E)
private val DarkOnPrimary = Color.Black
private val DarkOnSecondary = Color.Black
private val DarkOnBackground = Color.White
private val DarkOnSurface = Color.White

// 新版正确写法：用lightColorScheme函数（自动补全所有必填参数，无标红）
val LightColorScheme = lightColorScheme(
    primary = LightPrimary,
    secondary = LightSecondary,
    background = LightBackground,
    surface = LightSurface,
    onPrimary = LightOnPrimary,
    onSecondary = LightOnSecondary,
    onBackground = LightOnBackground,
    onSurface = LightOnSurface,
    // 如需自定义error颜色，添加这两行即可（可选）
    error = Color(0xFFB00020),
    onError = Color.White
)

// 新版正确写法：用darkColorScheme函数
val DarkColorScheme = darkColorScheme(
    primary = DarkPrimary,
    secondary = DarkSecondary,
    background = DarkBackground,
    surface = DarkSurface,
    onPrimary = DarkOnPrimary,
    onSecondary = DarkOnSecondary,
    onBackground = DarkOnBackground,
    onSurface = DarkOnSurface,
    error = Color(0xFFCF6679),
    onError = Color.Black
)
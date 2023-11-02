package com.example.dota2app.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.google.accompanist.systemuicontroller.rememberSystemUiController

@Composable
fun TransparentStatusBar() {
    // Используйте системный UiController для изменения внешнего вида прозрачной строки состояния
    val systemUiController = rememberSystemUiController()
    systemUiController.setStatusBarColor(Color.Transparent) // Сделайте строку состояния прозрачной
    systemUiController.setNavigationBarColor(Color.Transparent) // Опционально: сделайте панель навигации прозрачной


}
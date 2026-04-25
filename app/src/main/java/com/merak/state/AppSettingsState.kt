package com.merak.state

import androidx.compose.runtime.mutableIntStateOf

object AppSettingsState {
    val language = mutableIntStateOf(0) // 0=简体中文, 1=繁体中文, 2=English
    val colorMode = mutableIntStateOf(0) // 0=跟随系统, 1=浅色, 2=深色
}


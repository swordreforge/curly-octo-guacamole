package com.merak.ui

import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.merak.ui.page.AboutPage
import com.merak.ui.page.FilePickerPage
import com.merak.ui.page.LogPage
import com.merak.ui.page.MainPage
import com.merak.ui.page.ThemeInstallPage
import com.merak.ui.page.welcome.WelcomePage
import com.merak.utils.PreferenceUtil
import top.yukonga.miuix.kmp.utils.getWindowSize
import android.widget.Toast
import androidx.compose.ui.platform.LocalContext
import com.merak.utils.ThemeInstaller
import kotlinx.coroutines.launch
import androidx.compose.runtime.rememberCoroutineScope

@Composable
fun App() {
    val navController = rememberNavController()
    val easing = FastOutSlowInEasing
    val windowWidth = getWindowSize().width
    
    // 检查是否首次启动
    val isFirstLaunch = !PreferenceUtil.getBoolean("first_launch", false)
    val showWelcome = remember { mutableStateOf(isFirstLaunch) }
    
    // 保存并恢复欢迎页面的当前页码
    val savedWelcomePage = PreferenceUtil.getInt("welcome_page_index", 0)
    val welcomePagerState = rememberPagerState(
        initialPage = if (isFirstLaunch) savedWelcomePage else 0, 
        pageCount = { 5 }
    )

    if (showWelcome.value) {
        // 显示欢迎页面
        WelcomePage(show = showWelcome, pagerState = welcomePagerState)
    } else {
        // 显示主应用
        NavHost(
            navController = navController,
            modifier = Modifier.fillMaxSize(),
            startDestination = Route.MAIN,
            enterTransition = {
                slideInHorizontally(
                    initialOffsetX = { windowWidth },
                    animationSpec = tween(durationMillis = 500, easing = easing)
                )
            },
            exitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { -windowWidth / 5 },
                    animationSpec = tween(durationMillis = 500, easing = easing)
                )
            },
            popEnterTransition = {
                slideInHorizontally(
                    initialOffsetX = { -windowWidth / 5 },
                    animationSpec = tween(durationMillis = 500, easing = easing)
                )
            },
            popExitTransition = {
                slideOutHorizontally(
                    targetOffsetX = { windowWidth },
                    animationSpec = tween(durationMillis = 500, easing = easing)
                )
            }
        ) {
            composable(Route.MAIN) {
                MainPage(navController)
            }
            composable(Route.THEME_INSTALL) {
                ThemeInstallPage(
                    onBack = { navController.popBackStack() },
                    onNavigateToFilePicker = { navController.navigate(Route.FILE_PICKER) }
                )
            }
            composable(Route.FILE_PICKER) {
                val context = LocalContext.current
                val coroutineScope = rememberCoroutineScope()
                
                FilePickerPage(
                    onBack = { navController.popBackStack() },
                    onFileSelected = { file ->
                        coroutineScope.launch {
                            try {
                                Toast.makeText(
                                    context,
                                    context.getString(com.merak.R.string.copying_theme),
                                    Toast.LENGTH_SHORT
                                ).show()
                                
                                // 一键安装主题
                                val result = ThemeInstaller.quickInstall(context, file.absolutePath)
                                
                                result.fold(
                                    onSuccess = {
                                        com.merak.utils.LogManager.log(
                                            context,
                                            com.merak.utils.LogManager.LogType.THEME_INSTALL,
                                            context.getString(com.merak.R.string.log_theme_install_success),
                                            "${context.getString(com.merak.R.string.log_file)} ${file.name}, ${context.getString(com.merak.R.string.log_size)} ${file.length()} bytes"
                                        )
                                        
                                        Toast.makeText(
                                            context,
                                            context.getString(com.merak.R.string.theme_copied),
                                            Toast.LENGTH_SHORT
                                        ).show()
                                        navController.popBackStack()
                                    },
                                    onFailure = { error ->
                                        com.merak.utils.LogManager.log(
                                            context,
                                            com.merak.utils.LogManager.LogType.ERROR,
                                            context.getString(com.merak.R.string.log_theme_install_failed),
                                            error.message
                                        )
                                        
                                        Toast.makeText(
                                            context,
                                            "${context.getString(com.merak.R.string.copy_failed)}: ${error.message}",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }
                                )
                            } catch (e: Exception) {
                                Toast.makeText(
                                    context,
                                    "${context.getString(com.merak.R.string.copy_failed)}: ${e.message}",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }
                    }
                )
            }
            composable(Route.LOG) {
                LogPage(
                    onBack = { navController.popBackStack() }
                )
            }
            composable(Route.ABOUT) {
                AboutPage(
                    onBack = { navController.popBackStack() }
                )
            }
        }
    }
}


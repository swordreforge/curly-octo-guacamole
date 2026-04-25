package com.merak.ui.page

import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.merak.R
import kotlinx.coroutines.launch
import top.yukonga.miuix.kmp.basic.NavigationBar
import top.yukonga.miuix.kmp.basic.NavigationItem
import top.yukonga.miuix.kmp.basic.Scaffold
import top.yukonga.miuix.kmp.icon.MiuixIcons
import top.yukonga.miuix.kmp.icon.icons.useful.NavigatorSwitch
import top.yukonga.miuix.kmp.icon.icons.useful.Settings

@Composable
fun MainPage(navController: NavController) {
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { 2 })
    val coroutineScope = rememberCoroutineScope()
    val items = listOf(
        NavigationItem(stringResource(R.string.title_home), MiuixIcons.Useful.NavigatorSwitch),
        NavigationItem(stringResource(R.string.title_settings), MiuixIcons.Useful.Settings)
    )

    Scaffold(
        bottomBar = {
            NavigationBar(
                items = items,
                selected = pagerState.currentPage,
                onClick = { index ->
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(index)
                    }
                }
            )
        }
    ) { _ ->
        HorizontalPager(
            state = pagerState,
            pageContent = { page ->
                when (page) {
                    0 -> HomePage(navController)
                    1 -> SettingsPage(
                        onNavigateToAbout = {
                            navController.navigate(com.merak.ui.Route.ABOUT)
                        }
                    )
                }
            }
        )
    }
}

package com.merak.ui.page

import android.widget.Toast
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.merak.R
import com.merak.utils.ThemeInstaller
import kotlinx.coroutines.launch
import top.yukonga.miuix.kmp.basic.ButtonDefaults
import top.yukonga.miuix.kmp.basic.Card
import top.yukonga.miuix.kmp.basic.CircularProgressIndicator
import top.yukonga.miuix.kmp.basic.MiuixScrollBehavior
import top.yukonga.miuix.kmp.basic.Scaffold
import top.yukonga.miuix.kmp.basic.TabRow
import top.yukonga.miuix.kmp.basic.Text
import top.yukonga.miuix.kmp.basic.TextButton
import top.yukonga.miuix.kmp.basic.TextField
import top.yukonga.miuix.kmp.basic.TopAppBar
import top.yukonga.miuix.kmp.basic.rememberTopAppBarState
import top.yukonga.miuix.kmp.basic.Icon
import top.yukonga.miuix.kmp.basic.IconButton
import top.yukonga.miuix.kmp.icon.MiuixIcons
import top.yukonga.miuix.kmp.icon.icons.useful.Back
import top.yukonga.miuix.kmp.utils.overScrollVertical

@Composable
fun ThemeInstallPage(
    onBack: () -> Unit,
    onNavigateToFilePicker: () -> Unit = {}
) {
    val scrollBehavior = MiuixScrollBehavior(rememberTopAppBarState())
    val coroutineScope = rememberCoroutineScope()
    val tabs = listOf(
        stringResource(R.string.tab_local),
        stringResource(R.string.tab_online)
    )
    val pagerState = rememberPagerState(initialPage = 0, pageCount = { tabs.size })
    val selectedTabIndex by remember { derivedStateOf { pagerState.currentPage } }

    Scaffold(
        topBar = {
            TopAppBar(
                title = stringResource(R.string.home_install_title),
                scrollBehavior = scrollBehavior,
                navigationIcon = {
                    IconButton(
                        onClick = onBack,
                        modifier = Modifier.padding(start = 18.dp)
                    ) {
                        Icon(
                            imageVector = MiuixIcons.Useful.Back,
                            contentDescription = "返回"
                        )
                    }
                }
            )
        }
    ) { innerPadding ->
        LazyColumn(
            modifier = Modifier
                .padding(innerPadding)
                .nestedScroll(scrollBehavior.nestedScrollConnection)
                .overScrollVertical()
                .fillMaxSize()
        ) {
            stickyHeader {
                TabRow(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 12.dp),
                    tabs = tabs,
                    selectedTabIndex = selectedTabIndex,
                    onTabSelected = { index ->
                        coroutineScope.launch {
                            pagerState.animateScrollToPage(index)
                        }
                    }
                )
            }
            item {
                HorizontalPager(
                    state = pagerState,
                    userScrollEnabled = false,
                    modifier = Modifier.fillMaxSize()
                ) { page ->
                    when (page) {
                        0 -> LocalInstallView(onNavigateToFilePicker)
                        1 -> OnlineInstallView()
                    }
                }
            }
        }
    }
}

@Composable
fun LocalInstallView(onNavigateToFilePicker: () -> Unit) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text(
                text = stringResource(R.string.local_install_desc),
                modifier = Modifier.padding(16.dp)
            )
        }
        
        TextButton(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            colors = ButtonDefaults.textButtonColorsPrimary(),
            text = stringResource(R.string.select_theme_file),
            onClick = onNavigateToFilePicker
        )
    }
}

@Composable
fun OnlineInstallView() {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    var url by remember { mutableStateOf("") }
    var isDownloading by remember { mutableStateOf(false) }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 12.dp)
    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp)
        ) {
            Text(
                text = stringResource(R.string.online_install_desc),
                modifier = Modifier.padding(16.dp)
            )
        }
        
        TextField(
            value = url,
            onValueChange = { url = it },
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 8.dp),
            label = stringResource(R.string.theme_url_label),
            singleLine = true,
            enabled = !isDownloading
        )
        
        if (isDownloading) {
            CircularProgressIndicator(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 16.dp)
            )
        } else {
            TextButton(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                colors = ButtonDefaults.textButtonColorsPrimary(),
                text = stringResource(R.string.download_install),
                onClick = {
                    if (url.isBlank()) {
                        Toast.makeText(
                            context,
                            context.getString(R.string.input_url_hint),
                            Toast.LENGTH_SHORT
                        ).show()
                        return@TextButton
                    }
                    
                    coroutineScope.launch {
                        isDownloading = true
                        try {
                            Toast.makeText(
                                context,
                                context.getString(R.string.download_started),
                                Toast.LENGTH_SHORT
                            ).show()
                            
                            val result = ThemeInstaller.installThemeFromUrl(url)
                            
                            result.fold(
                                onSuccess = { file ->
                                    com.merak.utils.LogManager.log(
                                        context,
                                        com.merak.utils.LogManager.LogType.THEME_INSTALL,
                                        context.getString(com.merak.R.string.log_theme_install_success),
                                        "${context.getString(com.merak.R.string.log_file)} ${file.name}, ${context.getString(com.merak.R.string.log_size)} ${file.length()} bytes"
                                    )
                                    
                                    Toast.makeText(
                                        context,
                                        context.getString(R.string.download_complete),
                                        Toast.LENGTH_SHORT
                                    ).show()
                                    ThemeInstaller.applyTheme(context)
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
                                        "${context.getString(R.string.download_failed)}: ${error.message}",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            )
                        } finally {
                            isDownloading = false
                        }
                    }
                }
            )
        }
    }
}


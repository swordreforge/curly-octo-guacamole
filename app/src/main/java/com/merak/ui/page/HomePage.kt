package com.merak.ui.page

import android.content.Intent
import android.provider.Settings
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.Alignment
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import androidx.navigation.NavController
import com.merak.R
import com.merak.service.ThemeInstallAccessibilityService
import com.merak.ui.Route
import top.yukonga.miuix.kmp.basic.Card
import top.yukonga.miuix.kmp.basic.MiuixScrollBehavior
import top.yukonga.miuix.kmp.basic.Scaffold
import top.yukonga.miuix.kmp.basic.SmallTitle
import top.yukonga.miuix.kmp.basic.TopAppBar
import top.yukonga.miuix.kmp.basic.rememberTopAppBarState
import top.yukonga.miuix.kmp.extra.SuperArrow
import top.yukonga.miuix.kmp.utils.overScrollVertical
import top.yukonga.miuix.kmp.theme.MiuixTheme

@Composable
fun HomePage(navController: NavController) {
    val scrollBehavior = MiuixScrollBehavior(rememberTopAppBarState())
    val context = LocalContext.current
    val lifecycleOwner = LocalLifecycleOwner.current

    var accessibilityEnabled by remember {
        mutableStateOf(
            ThemeInstallAccessibilityService.isAccessibilityServiceEnabled(
                context,
                ThemeInstallAccessibilityService::class.java
            )
        )
    }

    val openFailedText = stringResource(R.string.about_open_failed)

    DisposableEffect(lifecycleOwner, context) {
        val observer = LifecycleEventObserver { _, event ->
            if (event == Lifecycle.Event.ON_RESUME) {
                accessibilityEnabled = ThemeInstallAccessibilityService
                    .isAccessibilityServiceEnabled(
                        context,
                        ThemeInstallAccessibilityService::class.java
                    )
            }
        }
        lifecycleOwner.lifecycle.addObserver(observer)
        onDispose { lifecycleOwner.lifecycle.removeObserver(observer) }
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = stringResource(R.string.title_home),
                scrollBehavior = scrollBehavior
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
            item {
                AccessibilityStatusCard(
                    enabled = accessibilityEnabled,
                    onRequestSettings = {
                        val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
                        try {
                            context.startActivity(intent)
                        } catch (e: Exception) {
                            Toast.makeText(
                                context,
                                openFailedText,
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    }
                )
            }

            item {
                SmallTitle(stringResource(R.string.home_install_title))
            }
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)
                        .padding(bottom = 6.dp)
                ) {
                    SuperArrow(
                        title = stringResource(R.string.home_install_title),
                        summary = stringResource(R.string.home_install_summary),
                        onClick = { navController.navigate(Route.THEME_INSTALL) }
                    )
                }
            }

            item {
                SmallTitle(stringResource(R.string.home_tools_title))
            }
            item {
                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp)
                        .padding(bottom = 6.dp)
                ) {
                    SuperArrow(
                        title = stringResource(R.string.log_title),
                        summary = stringResource(R.string.log_summary),
                        onClick = { navController.navigate(Route.LOG) }
                    )
                }
            }
        }
    }
}

@Composable
private fun AccessibilityStatusCard(
    enabled: Boolean,
    onRequestSettings: () -> Unit
) {
    val title = stringResource(R.string.home_accessibility_title)
    val summary = if (enabled) {
        stringResource(R.string.home_accessibility_enabled_summary)
    } else {
        stringResource(R.string.home_accessibility_disabled_summary)
    }
    val statusLabel = if (enabled) {
        stringResource(R.string.home_accessibility_status_on)
    } else {
        stringResource(R.string.home_accessibility_status_off)
    }
    val statusColor = if (enabled) {
        Color(0xFF2E7D32) // green
    } else {
        Color(0xFFD32F2F) // red
    }
    val cardBackgroundColor = if (enabled) {
        Color(0xFF2E7D32).copy(alpha = 0.12f) // 绿色背景
    } else {
        Color(0xFFD32F2F).copy(alpha = 0.12f) // 红色背景
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp)
            .padding(bottom = 6.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(cardBackgroundColor)
                .clickable(onClick = onRequestSettings)
                .padding(horizontal = 20.dp, vertical = 18.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = title,
                    color = MiuixTheme.colorScheme.onSurface,
                    fontWeight = FontWeight.SemiBold
                )
                Spacer(modifier = Modifier.weight(1f))
                Box(
                    modifier = Modifier
                        .background(
                            color = statusColor.copy(alpha = 0.12f),
                            shape = RoundedCornerShape(999.dp)
                        )
                        .padding(horizontal = 10.dp, vertical = 4.dp)
                ) {
                    Text(
                        text = statusLabel,
                        color = statusColor,
                        fontWeight = FontWeight.Medium,
                        fontSize = 12.sp
                    )
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = summary,
                color = statusColor,
                fontWeight = FontWeight.Medium,
                fontSize = 14.sp
            )
        }
    }
}

package com.merak.ui.page.welcome

import android.Manifest
import android.app.Activity
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.Settings
import android.view.HapticFeedbackConstants
import android.widget.Toast
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import androidx.core.net.toUri
import com.merak.R
import kotlinx.coroutines.launch
import top.yukonga.miuix.kmp.basic.ButtonDefaults
import top.yukonga.miuix.kmp.basic.Card
import top.yukonga.miuix.kmp.basic.Checkbox
import top.yukonga.miuix.kmp.basic.Icon
import top.yukonga.miuix.kmp.basic.Text
import top.yukonga.miuix.kmp.basic.TextButton

@Composable
fun PermissionPage(pagerState: PagerState) {
    val context = LocalContext.current
    val view = LocalView.current
    val coroutineScope = rememberCoroutineScope()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Icon(
            painter = painterResource(R.drawable.ic_security),
            contentDescription = "Permission",
            tint = Color(0xFF3482FF),
            modifier = Modifier.size(90.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.permission_title),
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = stringResource(R.string.permission_desc),
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(24.dp))

        // 文件管理权限
        PermissionItem(
            icon = painterResource(R.drawable.ic_folder),
            title = stringResource(R.string.permission_storage_title),
            description = stringResource(R.string.permission_storage_desc),
            checkPermission = { 
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
                    Environment.isExternalStorageManager()
                } else {
                    ContextCompat.checkSelfPermission(
                        context,
                        Manifest.permission.WRITE_EXTERNAL_STORAGE
                    ) == PackageManager.PERMISSION_GRANTED
                }
            },
            requestPermission = { requestStoragePermission(context) }
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 无障碍权限
        PermissionItem(
            icon = painterResource(R.drawable.ic_accessibility),
            title = stringResource(R.string.permission_accessibility_title),
            description = stringResource(R.string.permission_accessibility_desc),
            checkPermission = { isAccessibilityServiceEnabled(context) },
            requestPermission = { requestAccessibilityPermission(context) }
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 通知权限
        PermissionItem(
            icon = painterResource(R.drawable.ic_notification),
            title = stringResource(R.string.permission_notification_title),
            description = stringResource(R.string.permission_notification_desc),
            checkPermission = {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
                    ContextCompat.checkSelfPermission(
                        context,
                        Manifest.permission.POST_NOTIFICATIONS
                    ) == PackageManager.PERMISSION_GRANTED
                } else {
                    NotificationManagerCompat.from(context).areNotificationsEnabled()
                }
            },
            requestPermission = { requestNotification(context) }
        )

        Spacer(modifier = Modifier.weight(1f))

        TextButton(
            text = stringResource(R.string.next_step),
            onClick = {
                view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
                coroutineScope.launch {
                    pagerState.animateScrollToPage(3)
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.textButtonColorsPrimary()
        )

        Spacer(modifier = Modifier.height(16.dp))
    }
}

@Composable
fun PermissionItem(
    icon: Painter,
    title: String,
    description: String,
    checkPermission: () -> Boolean,
    requestPermission: () -> Unit
) {
    val haptic = LocalHapticFeedback.current
    var checked by remember { mutableStateOf(false) }

    LaunchedEffect(key1 = Unit) {
        checked = checkPermission()
    }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(
                onClick = {
                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                    requestPermission()
                    checked = checkPermission()
                },
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            )
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 12.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                painter = icon,
                contentDescription = title,
                tint = Color(0xFF3482FF),
                modifier = Modifier.size(28.dp)
            )

            Spacer(modifier = Modifier.width(16.dp))

            Column {
                Text(
                    text = title,
                    fontWeight = FontWeight.Medium
                )
                Text(
                    text = description,
                    fontSize = 13.sp,
                    color = Color.Gray
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Checkbox(checked = checked, onCheckedChange = null)
        }
    }
}

// 文件管理权限
fun requestStoragePermission(context: Context) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
        if (!Environment.isExternalStorageManager()) {
            val intent = Intent(Settings.ACTION_MANAGE_APP_ALL_FILES_ACCESS_PERMISSION)
            intent.data = "package:${context.packageName}".toUri()
            context.startActivity(intent)
        } else {
            Toast.makeText(context, context.getString(R.string.permission_already_granted), Toast.LENGTH_SHORT).show()
        }
    } else {
        ActivityCompat.requestPermissions(
            context as Activity,
            arrayOf(
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.READ_EXTERNAL_STORAGE
            ),
            100
        )
    }
}

// 无障碍权限
fun isAccessibilityServiceEnabled(context: Context): Boolean {
    val accessibilityEnabled = try {
        Settings.Secure.getInt(
            context.contentResolver,
            Settings.Secure.ACCESSIBILITY_ENABLED
        )
    } catch (e: Settings.SettingNotFoundException) {
        0
    }
    
    if (accessibilityEnabled == 1) {
        val services = Settings.Secure.getString(
            context.contentResolver,
            Settings.Secure.ENABLED_ACCESSIBILITY_SERVICES
        )
        // 检查我们的特定服务是否已启用
        val serviceName = "${context.packageName}/com.merak.service.ThemeInstallAccessibilityService"
        return services?.contains(serviceName) == true
    }
    return false
}

fun requestAccessibilityPermission(context: Context) {
    if (!isAccessibilityServiceEnabled(context)) {
        val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
        context.startActivity(intent)
    } else {
        Toast.makeText(context, context.getString(R.string.permission_already_granted), Toast.LENGTH_SHORT).show()
    }
}

// 通知权限
fun requestNotification(context: Context) {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
        val granted = ContextCompat.checkSelfPermission(
            context,
            Manifest.permission.POST_NOTIFICATIONS
        ) == PackageManager.PERMISSION_GRANTED

        if (granted) {
            Toast.makeText(context, context.getString(R.string.permission_already_granted), Toast.LENGTH_SHORT).show()
        } else {
            ActivityCompat.requestPermissions(
                context as Activity,
                arrayOf(Manifest.permission.POST_NOTIFICATIONS),
                1001
            )
        }
    } else {
        val areNotificationsEnabled =
            NotificationManagerCompat.from(context).areNotificationsEnabled()
        if (areNotificationsEnabled) {
            Toast.makeText(context, context.getString(R.string.permission_already_granted), Toast.LENGTH_SHORT).show()
        } else {
            val intent = Intent().apply {
                action = Settings.ACTION_APP_NOTIFICATION_SETTINGS
                putExtra(Settings.EXTRA_APP_PACKAGE, context.packageName)
                putExtra("app_package", context.packageName)
                putExtra("app_uid", context.applicationInfo.uid)
            }
            context.startActivity(intent)
        }
    }
}


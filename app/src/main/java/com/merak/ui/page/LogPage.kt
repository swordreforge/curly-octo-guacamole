package com.merak.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.merak.R
import com.merak.utils.LogManager
import kotlinx.coroutines.launch
import top.yukonga.miuix.kmp.basic.*
import top.yukonga.miuix.kmp.extra.SuperArrow
import top.yukonga.miuix.kmp.extra.SuperDialog
import top.yukonga.miuix.kmp.icon.MiuixIcons
import top.yukonga.miuix.kmp.icon.icons.useful.Back
import top.yukonga.miuix.kmp.icon.icons.useful.Delete
import top.yukonga.miuix.kmp.theme.MiuixTheme
import top.yukonga.miuix.kmp.utils.overScrollVertical
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun LogPage(onBack: () -> Unit) {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val scrollBehavior = MiuixScrollBehavior(rememberTopAppBarState())
    
    var logs by remember { mutableStateOf<List<LogManager.LogEntry>>(emptyList()) }
    var statistics by remember { mutableStateOf<LogManager.Statistics?>(null) }
    var isLoading by remember { mutableStateOf(true) }
    val showClearDialog = remember { mutableStateOf(false) }
    
    // 刷新函数
    suspend fun refreshLogs() {
        logs = LogManager.getAllLogs(context)
        statistics = LogManager.getStatistics(context)
    }
    
    // 初次加载日志
    LaunchedEffect(Unit) {
        isLoading = true
        refreshLogs()
        isLoading = false
    }
    
    // 每3秒自动刷新
    LaunchedEffect(Unit) {
        while (true) {
            kotlinx.coroutines.delay(3000)
            refreshLogs()
        }
    }
    
    // 清空日志对话框（使用 Miuix SuperDialog）
    SuperDialog(
        title = stringResource(R.string.log_clear_confirm_title),
        summary = stringResource(R.string.log_clear_confirm_message),
        show = showClearDialog,
        onDismissRequest = { showClearDialog.value = false }
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            TextButton(
                text = stringResource(R.string.cancel),
                onClick = { showClearDialog.value = false },
                modifier = Modifier.weight(1f)
            )
            Spacer(Modifier.width(12.dp))
            TextButton(
                text = stringResource(R.string.confirm),
                onClick = {
                           coroutineScope.launch {
                               LogManager.clearAllLogs(context)
                               refreshLogs()
                               showClearDialog.value = false
                           }
                },
                modifier = Modifier.weight(1f),
                colors = ButtonDefaults.textButtonColorsPrimary()
            )
        }
    }
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = stringResource(R.string.log_title),
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
                },
                actions = {
                    IconButton(
                        onClick = { showClearDialog.value = true },
                        modifier = Modifier.padding(end = 18.dp)
                    ) {
                        Icon(
                            imageVector = MiuixIcons.Useful.Delete,
                            contentDescription = "清空日志"
                        )
                    }
                }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .nestedScroll(scrollBehavior.nestedScrollConnection)
                .overScrollVertical()
        ) {
                   // 统计信息
                   if (statistics != null) {
                       item {
                           SmallTitle(stringResource(R.string.log_statistics_title))
                       }
                       
                       item {
                           Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        // 统计卡片标题
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Column {
                                Text(
                                    text = stringResource(R.string.log_statistics_card_title),
                                    fontSize = 16.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = MiuixTheme.colorScheme.onSurface
                                )
                                Text(
                                    text = stringResource(R.string.log_total_count, logs.size),
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                            }
                            
                            // 日志文件大小
                            Column(horizontalAlignment = Alignment.End) {
                                Text(
                                    text = formatFileSize(statistics!!.totalLogSize),
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color(0xFF3482FF)
                                )
                                Text(
                                    text = stringResource(R.string.log_file_size_label),
                                    fontSize = 11.sp,
                                    color = Color.Gray
                                )
                            }
                        }
                        
                        Spacer(modifier = Modifier.height(16.dp))
                        
                        // 分隔线
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(1.dp)
                                .background(Color.Gray.copy(alpha = 0.2f))
                        )
                        
                        Spacer(modifier = Modifier.height(16.dp))
                        
                        // 统计数据行
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceAround
                        ) {
                            StatisticsCard(
                                label = stringResource(R.string.log_label_theme_install),
                                count = statistics!!.themeInstallCount,
                                lastTime = if (statistics!!.lastThemeInstallTime > 0) 
                                    formatTime(statistics!!.lastThemeInstallTime) 
                                else stringResource(R.string.log_stat_never),
                                color = Color(0xFF4CAF50),
                                modifier = Modifier.weight(1f)
                            )
                            
                            Spacer(modifier = Modifier.width(12.dp))
                            
                            StatisticsCard(
                                label = stringResource(R.string.log_label_alarm_intercept),
                                count = statistics!!.alarmInterceptCount,
                                lastTime = if (statistics!!.lastAlarmInterceptTime > 0) 
                                    formatTime(statistics!!.lastAlarmInterceptTime) 
                                else stringResource(R.string.log_stat_never),
                                color = Color(0xFFFF9800),
                                modifier = Modifier.weight(1f)
                            )
                        }
                    }
                }
            }
            }
            
            // 日志列表
            item {
                SmallTitle(stringResource(R.string.log_list_title))
            }
            
            if (isLoading) {
                item {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(32.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        CircularProgressIndicator()
                    }
                }
            } else if (logs.isEmpty()) {
                item {
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(horizontal = 12.dp, vertical = 6.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(32.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                text = stringResource(R.string.log_empty),
                                color = Color.Gray
                            )
                        }
                    }
                }
            } else {
                items(logs, key = { it.timestamp }) { log ->
                    LogEntryItem(log)
                }
            }
        }
    }
}

@Composable
fun StatisticsCard(
    label: String,
    count: Int,
    lastTime: String,
    color: Color,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(color.copy(alpha = 0.1f))
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = label,
                fontSize = 12.sp,
                color = Color.Gray
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Text(
                text = "$count",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                color = color
            )
            
            Spacer(modifier = Modifier.height(4.dp))
            
            Text(
                text = stringResource(R.string.log_count_unit),
                fontSize = 11.sp,
                color = Color.Gray
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Text(
                text = lastTime,
                fontSize = 10.sp,
                color = Color.Gray,
                maxLines = 1
            )
        }
    }
}

@Composable
fun LogEntryItem(log: LogManager.LogEntry) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 4.dp)
    ) {
        Column(modifier = Modifier.padding(12.dp)) {
            // 时间和类型
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = formatDateTime(log.timestamp),
                    fontSize = 12.sp,
                    color = Color.Gray,
                    fontFamily = FontFamily.Monospace
                )
                
                Text(
                    text = log.type.name,
                    fontSize = 10.sp,
                    color = Color.White,
                    modifier = Modifier
                        .background(
                            color = getLogTypeColor(log.type),
                            shape = RoundedCornerShape(4.dp)
                        )
                        .padding(horizontal = 6.dp, vertical = 2.dp)
                )
            }
            
            Spacer(modifier = Modifier.height(6.dp))
            
            // 消息
            Text(
                text = log.message,
                fontSize = 14.sp,
                color = MiuixTheme.colorScheme.onSurface
            )
            
            // 详情
            if (log.details != null) {
                Spacer(modifier = Modifier.height(4.dp))
                
                val fileSizeLabel = stringResource(R.string.log_detail_file_size)
                val sizeLabel = stringResource(R.string.log_detail_size)
                val detailsWithSize = formatDetailsWithFileSize(log.details, fileSizeLabel, sizeLabel)
                
                Text(
                    text = detailsWithSize,
                    fontSize = 12.sp,
                    color = Color.Gray,
                    fontFamily = FontFamily.Monospace
                )
            }
        }
    }
}

private fun getLogTypeColor(type: LogManager.LogType): Color {
    return when (type) {
        LogManager.LogType.INFO -> Color(0xFF2196F3)
        LogManager.LogType.THEME_INSTALL -> Color(0xFF4CAF50)
        LogManager.LogType.ALARM_INTERCEPT -> Color(0xFFFF9800)
        LogManager.LogType.ERROR -> Color(0xFFF44336)
        LogManager.LogType.WARNING -> Color(0xFFFF9800)
        LogManager.LogType.DEBUG -> Color(0xFF9E9E9E)
    }
}

private fun formatDateTime(timestamp: Long): String {
    val sdf = SimpleDateFormat("MM-dd HH:mm:ss", Locale.getDefault())
    return sdf.format(Date(timestamp))
}

private fun formatTime(timestamp: Long): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
    return sdf.format(Date(timestamp))
}

private fun formatFileSize(size: Long): String {
    return when {
        size < 1024 -> "$size B"
        size < 1024 * 1024 -> "${size / 1024} KB"
        else -> "${size / (1024 * 1024)} MB"
    }
}

private fun formatDetailsWithFileSize(details: String, fileSizeLabel: String, sizeLabel: String): String {
    val pattern = "(${Regex.escape(fileSizeLabel)}|${Regex.escape(sizeLabel)}):\\s*(\\d+)\\s*bytes"
    val regex = Regex(pattern)
    return regex.replace(details) { matchResult ->
        val label = matchResult.groupValues[1]
        val bytes = matchResult.groupValues[2].toLongOrNull() ?: 0L
        val sizeStr = when {
            bytes < 1024 -> "$bytes B"
            bytes < 1024 * 1024 -> String.format("%.1f KB", bytes / 1024.0)
            else -> String.format("%.1f MB", bytes / (1024.0 * 1024.0))
        }
        "$label: ${matchResult.groupValues[2]} bytes ($sizeStr)"
    }
}





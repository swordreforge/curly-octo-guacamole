package com.merak.ui.page

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.merak.utils.ThemeRotationManager
import kotlinx.coroutines.delay
import top.yukonga.miuix.kmp.basic.Card
import top.yukonga.miuix.kmp.theme.MiuixTheme

@Composable
fun RotationProgressCard() {
    val context = LocalContext.current
    var progress by remember { mutableFloatStateOf(0f) }
    var elapsedText by remember { mutableStateOf("0m") }
    var remainingText by remember { mutableStateOf("") }
    var currentTheme by remember { mutableStateOf("") }

    LaunchedEffect(Unit) {
        while (true) {
            val intervalMinutes = ThemeRotationManager.getIntervalMinutes()
            val lastTime = ThemeRotationManager.getLastRotationTime()
            val now = System.currentTimeMillis()

            if (lastTime > 0) {
                val elapsedMs = now - lastTime
                val intervalMs = intervalMinutes * 60_000L
                val remainingMs = (intervalMs - elapsedMs).coerceAtLeast(0)
                progress = (elapsedMs.toFloat() / intervalMs).coerceIn(0f, 1f)
                val elapsedMin = (elapsedMs / 60_000).toInt()
                val remainingMin = (remainingMs / 60_000).toInt()
                elapsedText = "${elapsedMin / 60}h ${elapsedMin % 60}m"
                remainingText = "${remainingMin / 60}h ${remainingMin % 60}m"
            } else {
                progress = 0f
                elapsedText = "0m"
                remainingText = "${intervalMinutes}m"
            }

            currentTheme = ThemeRotationManager.getCurrentFileName()
            if (currentTheme.isEmpty()) {
                currentTheme = "等待轮换"
            }
            delay(1000)
        }
    }

    Card(modifier = Modifier.fillMaxWidth().padding(horizontal = 12.dp, vertical = 6.dp)) {
        Column(modifier = Modifier.padding(16.dp)) {
            Row(modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                Text(text = "自动轮换", color = MiuixTheme.colorScheme.onSurface, fontWeight = FontWeight.SemiBold)
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "${(progress * 100).toInt()}%", color = MiuixTheme.colorScheme.primary, fontWeight = FontWeight.Medium)
            }
            Spacer(modifier = Modifier.height(8.dp))
            LinearProgressIndicator(progress = { progress }, modifier = Modifier.fillMaxWidth().height(8.dp), color = MiuixTheme.colorScheme.primary)
            Spacer(modifier = Modifier.height(8.dp))
            Row(modifier = Modifier.fillMaxWidth()) {
                Text(text = "已用: $elapsedText", color = MiuixTheme.colorScheme.onSurface, fontSize = 12.sp)
                Spacer(modifier = Modifier.weight(1f))
                Text(text = "剩余: $remainingText", color = MiuixTheme.colorScheme.onSurface, fontSize = 12.sp)
            }
            Spacer(modifier = Modifier.height(4.dp))
            Text(text = "当前: $currentTheme", color = MiuixTheme.colorScheme.primary, fontWeight = FontWeight.Medium, fontSize = 14.sp)
        }
    }
}
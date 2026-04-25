package com.merak.utils

import android.content.Context
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * 日志管理器
 * 用于记录应用运行日志和统计信息
 */
object LogManager {
    
    private const val LOG_FILE_NAME = "app_logs.txt"
    private const val MAX_LOG_SIZE = 1024 * 1024 // 1MB
    private const val MAX_LOG_LINES = 1000
    
    private val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
    
    enum class LogType {
        INFO,           // 一般信息
        THEME_INSTALL,  // 主题安装
        ALARM_INTERCEPT, // 闹钟拦截
        ERROR,          // 错误
        WARNING,        // 警告
        DEBUG           // 调试
    }
    
    data class LogEntry(
        val timestamp: Long,
        val type: LogType,
        val message: String,
        val details: String? = null
    ) {
        fun toFormattedString(): String {
            val time = dateFormat.format(Date(timestamp))
            val typeTag = "[${type.name}]"
            return if (details != null) {
                "$time $typeTag $message\n  → $details"
            } else {
                "$time $typeTag $message"
            }
        }
    }
    
    /**
     * 获取日志文件
     */
    private fun getLogFile(context: Context): File {
        return File(context.filesDir, LOG_FILE_NAME)
    }
    
    /**
     * 写入日志
     */
    suspend fun log(
        context: Context,
        type: LogType,
        message: String,
        details: String? = null
    ) = withContext(Dispatchers.IO) {
        try {
            val entry = LogEntry(
                timestamp = System.currentTimeMillis(),
                type = type,
                message = message,
                details = details
            )
            
            val logFile = getLogFile(context)
            val content = entry.toFormattedString() + "\n"
            
            // 如果文件过大，清理旧日志
            if (logFile.exists() && logFile.length() > MAX_LOG_SIZE) {
                cleanOldLogs(logFile)
            }
            
            logFile.appendText(content)
            
            // 同时记录到 PreferenceUtil 用于统计
            updateStatistics(context, type)
            
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    
    /**
     * 清理旧日志，保留最新的日志
     */
    private fun cleanOldLogs(logFile: File) {
        try {
            val lines = logFile.readLines()
            if (lines.size > MAX_LOG_LINES) {
                val keepLines = lines.takeLast(MAX_LOG_LINES)
                logFile.writeText(keepLines.joinToString("\n") + "\n")
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    
    private fun updateStatistics(context: Context, type: LogType) {
        try {
            val currentTimeSeconds = (System.currentTimeMillis() / 1000).toInt()
            
            when (type) {
                LogType.THEME_INSTALL -> {
                    PreferenceUtil.setInt("stat_last_theme_install", currentTimeSeconds)
                }
                LogType.ALARM_INTERCEPT -> {
                    PreferenceUtil.setInt("stat_last_alarm_intercept", currentTimeSeconds)
                }
                else -> {}
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    
    /**
     * 读取所有日志
     */
    suspend fun getAllLogs(context: Context): List<LogEntry> = withContext(Dispatchers.IO) {
        try {
            val logFile = getLogFile(context)
            if (!logFile.exists()) {
                return@withContext emptyList()
            }
            
            val logs = mutableListOf<LogEntry>()
            val lines = logFile.readLines()
            
            var i = 0
            while (i < lines.size) {
                val line = lines[i].trim()
                if (line.isEmpty()) {
                    i++
                    continue
                }
                
                try {
                    // 解析日志行
                    // 格式: "2024-01-01 12:00:00 [TYPE] message"
                    val parts = line.split(" ", limit = 4)
                    if (parts.size >= 4) {
                        val dateTime = "${parts[0]} ${parts[1]}"
                        val timestamp = dateFormat.parse(dateTime)?.time ?: 0L
                        val typeStr = parts[2].removeSurrounding("[", "]")
                        val type = try { LogType.valueOf(typeStr) } catch (e: Exception) { LogType.INFO }
                        val message = parts[3]
                        
                        // 检查下一行是否是详情
                        var details: String? = null
                        if (i + 1 < lines.size && lines[i + 1].startsWith("  → ")) {
                            details = lines[i + 1].substring(4)
                            i++
                        }
                        
                        logs.add(LogEntry(timestamp, type, message, details))
                    }
                } catch (e: Exception) {
                    e.printStackTrace()
                }
                
                i++
            }
            
            logs.reversed() // 最新的在前面
        } catch (e: Exception) {
            e.printStackTrace()
            emptyList()
        }
    }
    
    /**
     * 获取统计信息
     */
    data class Statistics(
        val themeInstallCount: Int,
        val alarmInterceptCount: Int,
        val lastThemeInstallTime: Long,
        val lastAlarmInterceptTime: Long,
        val totalLogSize: Long
    )
    
    suspend fun getStatistics(context: Context): Statistics = withContext(Dispatchers.IO) {
        val logFile = getLogFile(context)
        val logs = getAllLogs(context)
        
        val themeCount = logs.count { it.type == LogType.THEME_INSTALL }
        val alarmCount = logs.count { it.type == LogType.ALARM_INTERCEPT }
        val lastThemeTime = PreferenceUtil.getInt("stat_last_theme_install", 0).toLong() * 1000
        val lastAlarmTime = PreferenceUtil.getInt("stat_last_alarm_intercept", 0).toLong() * 1000
        
        Statistics(
            themeInstallCount = themeCount,
            alarmInterceptCount = alarmCount,
            lastThemeInstallTime = lastThemeTime,
            lastAlarmInterceptTime = lastAlarmTime,
            totalLogSize = if (logFile.exists()) logFile.length() else 0L
        )
    }
    
    suspend fun clearAllLogs(context: Context) = withContext(Dispatchers.IO) {
        try {
            val logFile = getLogFile(context)
            if (logFile.exists()) logFile.delete()
            
            PreferenceUtil.setInt("stat_last_theme_install", 0)
            PreferenceUtil.setInt("stat_last_alarm_intercept", 0)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }
    
    /**
     * 导出日志到外部存储
     */
    suspend fun exportLogs(context: Context, targetFile: File): Result<File> = withContext(Dispatchers.IO) {
        try {
            val logFile = getLogFile(context)
            if (!logFile.exists()) {
                val errorMsg = context.getString(com.merak.R.string.log_file_not_found)
                return@withContext Result.failure(Exception(errorMsg))
            }
            
            logFile.copyTo(targetFile, overwrite = true)
            Result.success(targetFile)
        } catch (e: Exception) {
            Result.failure(e)
        }
    }
}





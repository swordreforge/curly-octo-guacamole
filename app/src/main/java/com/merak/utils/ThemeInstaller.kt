package com.merak.utils

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.util.Log
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileOutputStream
import java.net.URL
import java.security.MessageDigest
import java.util.zip.ZipFile

import com.merak.utils.ThemeHistory

object ThemeInstaller {

    private fun getReviseFile(file: File): File {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.R) return file
        
        val androidPath = Environment.getExternalStorageDirectory()?.path + "/Android/"
        val canonicalPath = try {
            file.canonicalPath
        } catch (e: Exception) {
            file.absolutePath
        }
        
        if (canonicalPath.length > androidPath.length && 
            canonicalPath.startsWith(androidPath, ignoreCase = true)) {
            val revisedPath = androidPath + "\u200b" + canonicalPath.substring(androidPath.length)
            return File(revisedPath)
        }
        
        return file
    }

    private fun findFile(path: String): File? {
        val originalFile = File(path)
        if (originalFile.exists()) return originalFile

        val storagePath = Environment.getExternalStorageDirectory()?.canonicalPath
            ?: Environment.getExternalStorageDirectory()?.absolutePath
            ?: "/storage/emulated/0"

        val fileName = originalFile.name

        val possiblePaths = listOf(
            "$storagePath/$fileName",
            "$storagePath/Download/$fileName",
            "$storagePath/Download/ThemeStore/$fileName",
            "/sdcard/$fileName",
            "/sdcard/Download/$fileName",
            "/sdcard/Download/ThemeStore/$fileName",
            "/data/media/0/$fileName",
            "/data/media/0/Download/$fileName",
        )

        for (possiblePath in possiblePaths) {
            val file = File(possiblePath)
            if (file.exists()) return file
        }

        return null
    }
    
    private fun getThemeDirectory(): File {
        val themeManagerDir = File(
            Environment.getExternalStorageDirectory(), 
            "Android/data/com.android.thememanager/files/theme"
        )
        
        val revisedDir = getReviseFile(themeManagerDir)
        if (!revisedDir.exists()) revisedDir.mkdirs()
        
        return revisedDir
    }
    
    fun getThemeInstallFile(): File {
        val themeDir = getThemeDirectory()
        return File(themeDir, "安装主题.mtz")
    }
    
    suspend fun installThemeFromPath(sourcePath: String): Result<File> {
        return withContext(Dispatchers.IO) {
            try {
                var sourceFile = findFile(sourcePath)

                if (sourceFile == null || !sourceFile.exists()) {
                    return@withContext Result.failure(Exception("源文件不存在"))
                }

                if (!sourceFile.canRead()) {
                    return@withContext Result.failure(Exception("源文件无法读取"))
                }
                
                val targetFile = getThemeInstallFile()
                if (targetFile.exists()) targetFile.delete()
                
                sourceFile.inputStream().use { input ->
                    targetFile.outputStream().use { output ->
                        val buffer = ByteArray(8192)
                        var bytes = input.read(buffer)
                        while (bytes >= 0) {
                            output.write(buffer, 0, bytes)
                            bytes = input.read(buffer)
                        }
                    }
                }
                
                if (!targetFile.exists() || targetFile.length() == 0L) {
                    return@withContext Result.failure(Exception("文件复制失败"))
                }
                
                Result.success(targetFile)
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
    }
    
    suspend fun installThemeFromUri(context: Context, sourceUri: Uri): Result<File> {
        return withContext(Dispatchers.IO) {
            try {
                val targetFile = getThemeInstallFile()
                if (targetFile.exists()) targetFile.delete()
                
                context.contentResolver.openInputStream(sourceUri)?.use { input ->
                    targetFile.outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
                
                if (!targetFile.exists() || targetFile.length() == 0L) {
                    return@withContext Result.failure(Exception("文件复制失败"))
                }
                
                Result.success(targetFile)
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
    }
    
    suspend fun installThemeFromUrl(url: String): Result<File> {
        return withContext(Dispatchers.IO) {
            try {
                val targetFile = getThemeInstallFile()
                if (targetFile.exists()) targetFile.delete()
                
                URL(url).openStream().use { input ->
                    targetFile.outputStream().use { output ->
                        input.copyTo(output)
                    }
                }
                
                if (!targetFile.exists() || targetFile.length() == 0L) {
                    return@withContext Result.failure(Exception("文件下载失败"))
                }
                
                Result.success(targetFile)
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
    }
    
    fun applyTheme(context: Context): Boolean {
        return try {
            val themeFile = getThemeInstallFile()
            if (!themeFile.exists()) return false

            val originalPath = "/sdcard/Android/data/com.android.thememanager/files/theme/安装主题.mtz"

            val intent = Intent().apply {
                action = Intent.ACTION_MAIN
                setClassName(
                    "com.android.thememanager",
                    "com.android.thememanager.ApplyThemeForScreenshot"
                )
                putExtra("theme_file_path", originalPath)
                putExtra("api_called_from", "ThemeEditor")
                putExtra("ver2_step", "ver2_step_apply")
                addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            }

            // Android 10+ 限制后台启动 Activity
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q && !isAppInForeground(context)) {
                Log.w("ThemeInstaller", "应用处于后台，尝试发送全屏通知触发主题应用")
                sendApplyThemeNotification(context, intent)
                return true
            }

            context.startActivity(intent)
            true
        } catch (e: Exception) {
            Log.e("ThemeInstaller", "启动失败", e)
            false
        }
    }

    private fun isAppInForeground(context: Context): Boolean {
        val am = context.getSystemService(Context.ACTIVITY_SERVICE) as android.app.ActivityManager
        return am.runningAppProcesses?.any {
            it.processName == context.packageName &&
                    it.importance == android.app.ActivityManager.RunningAppProcessInfo.IMPORTANCE_FOREGROUND
        } ?: false
    }

    private fun sendApplyThemeNotification(context: Context, themeIntent: Intent) {
        val channelId = "theme_apply_fallback"
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as android.app.NotificationManager
            if (nm.getNotificationChannel(channelId) == null) {
                val channel = android.app.NotificationChannel(
                    channelId,
                    "主题应用提醒",
                    android.app.NotificationManager.IMPORTANCE_HIGH
                ).apply {
                    description = "当后台自动轮换无法直接弹出界面时，通过通知提醒您手动确认"
                    enableLights(true)
                    enableVibration(true)
                }
                nm.createNotificationChannel(channel)
            }
        }

        val pendingIntent = android.app.PendingIntent.getActivity(
            context,
            0,
            themeIntent,
            android.app.PendingIntent.FLAG_UPDATE_CURRENT or android.app.PendingIntent.FLAG_IMMUTABLE
        )

        val notification = androidx.core.app.NotificationCompat.Builder(context, channelId)
            .setContentTitle("主题轮换已就绪")
            .setContentText("点击以应用新主题")
            .setSmallIcon(android.R.drawable.ic_menu_gallery)
            .setContentIntent(pendingIntent)
            .setAutoCancel(true)
            .setPriority(androidx.core.app.NotificationCompat.PRIORITY_HIGH)
            .setCategory(androidx.core.app.NotificationCompat.CATEGORY_ALARM)
            .setFullScreenIntent(pendingIntent, true)
            .build()

        val nm = context.getSystemService(Context.NOTIFICATION_SERVICE) as android.app.NotificationManager
        nm.notify(2002, notification)
    }
    
    suspend fun quickInstall(context: Context, sourcePath: String): Result<Boolean> {
        return try {
            val result = installThemeFromPath(sourcePath)

            result.fold(
                onSuccess = {
                    val applied = applyTheme(context)
                    if (applied) {
                        val fileName = File(sourcePath).name
                        ThemeHistory.add(
                            ThemeHistory.HistoryItem(
                                fileName = fileName,
                                sourcePath = sourcePath,
                                installTime = System.currentTimeMillis()
                            )
                        )
                        Result.success(true)
                    } else {
                        Result.failure(Exception("启动主题管理器失败"))
                    }
                },
                onFailure = { error ->
                    Result.failure(error)
                }
            )
        } catch (e: Exception) {
            Result.failure(e)
        }
    }

    /**
     * 批量导入主题到历史记录，但不应用（不启动主题管理器）。
     * 适用于一次性导入多个主题文件到历史列表。
     *
     * @param sourcePaths 主题文件路径列表
     * @return Pair<成功数, 失败数>
     */
    suspend fun batchImportWithoutApply(sourcePaths: List<String>): Pair<Int, Int> {
        return withContext(Dispatchers.IO) {
            var successCount = 0
            var failCount = 0

            for (sourcePath in sourcePaths) {
                try {
                    val sourceFile = findFile(sourcePath)
                    if (sourceFile == null || !sourceFile.exists()) {
                        failCount++
                        continue
                    }

                    // 只添加到历史记录，不复制到主题目录，也不启动主题管理器
                    val fileName = sourceFile.name
                    ThemeHistory.add(
                        ThemeHistory.HistoryItem(
                            fileName = fileName,
                            sourcePath = sourcePath,
                            installTime = System.currentTimeMillis()
                        )
                    )
                    successCount++
                } catch (e: Exception) {
                    Log.e("ThemeInstaller", "批量导入失败: $sourcePath", e)
                    failCount++
                }
            }

            successCount to failCount
        }
    }

    suspend fun extractCover(context: Context, sourcePath: String): String? {
        return withContext(Dispatchers.IO) {
            try {
                val sourceFile = File(sourcePath)
                if (!sourceFile.exists()) return@withContext null

                val thumbnailsDir = File(context.cacheDir, "thumbnails")
                if (!thumbnailsDir.exists()) thumbnailsDir.mkdirs()

                val md5Name = md5(sourcePath + System.currentTimeMillis())
                val coverFile = File(thumbnailsDir, "$md5Name.jpg")

                ZipFile(sourceFile).use { zip ->
                    val defaultEntry = zip.getEntry("wallpaper/default_lock_wallpaper.jpg")
                    if (defaultEntry != null) {
                        zip.getInputStream(defaultEntry).use { input ->
                            coverFile.outputStream().use { output ->
                                input.copyTo(output)
                            }
                        }
                        return@withContext coverFile.absolutePath
                    }

                    val lockEntry = zip.getEntry("wallpaper/default_wallpaper.jpg")
                    if (lockEntry != null) {
                        zip.getInputStream(lockEntry).use { input ->
                            coverFile.outputStream().use { output ->
                                input.copyTo(output)
                            }
                        }
                        return@withContext coverFile.absolutePath
                    }

                    val wallpaperEntries = zip.entries().asSequence()
                        .filter { it.name.startsWith("wallpaper/") && !it.isDirectory && (it.name.endsWith(".jpg") || it.name.endsWith(".png")) }
                        .toList()

                    if (wallpaperEntries.isNotEmpty()) {
                        val randomEntry = wallpaperEntries.random()
                        zip.getInputStream(randomEntry).use { input ->
                            coverFile.outputStream().use { output ->
                                input.copyTo(output)
                            }
                        }
                        return@withContext coverFile.absolutePath
                    }
                }

                null
            } catch (e: Exception) {
                Log.e("ThemeInstaller", "提取封面失败", e)
                null
            }
        }
    }

    private fun md5(input: String): String {
        val md = MessageDigest.getInstance("MD5")
        val digest = md.digest(input.toByteArray())
        return digest.joinToString("") { "%02x".format(it) }
    }
}


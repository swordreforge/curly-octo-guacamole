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
                val sourceFile = File(sourcePath)
                
                if (!sourceFile.exists()) {
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
            
            context.startActivity(intent)
            true
        } catch (e: Exception) {
            Log.e("ThemeInstaller", "启动失败", e)
            false
        }
    }
    
    suspend fun quickInstall(context: Context, sourcePath: String): Result<Boolean> {
        return try {
            val result = installThemeFromPath(sourcePath)
            
            result.fold(
                onSuccess = {
                    val applied = applyTheme(context)
                    if (applied) {
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
}


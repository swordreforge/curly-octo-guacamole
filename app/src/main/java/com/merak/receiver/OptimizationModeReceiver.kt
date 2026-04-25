package com.merak.receiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.merak.MainActivity
import com.merak.service.KeepAliveService
import com.merak.utils.PreferenceUtil

/**
 * 优化模式广播接收器
 * 处理通知栏"退出优化"按钮点击事件
 */
class OptimizationModeReceiver : BroadcastReceiver() {
    
    companion object {
        const val ACTION_EXIT_OPTIMIZATION = "com.merak.ACTION_EXIT_OPTIMIZATION"
    }
    
    override fun onReceive(context: Context?, intent: Intent?) {
        if (context == null || intent == null) return
        
        if (intent.action == ACTION_EXIT_OPTIMIZATION) {
            // 关闭优化模式
            PreferenceUtil.setBoolean("optimization_mode_enabled", false)
            
            // 设置标记，表示是从"退出优化"启动的
            PreferenceUtil.setBoolean("optimization_mode_just_exited", true)
            
            // 发送广播刷新通知（移除"退出优化"按钮）
            val refreshIntent = Intent("com.merak.ACTION_REFRESH_NOTIFICATION").apply {
                setPackage(context.packageName)
            }
            context.sendBroadcast(refreshIntent)
            KeepAliveService.requestRefresh(
                context.applicationContext,
                keepAliveState = PreferenceUtil.getBoolean("keep_alive_enabled", false),
                optimizationState = false
            )
            
            // 重新启动主进程
            val mainIntent = Intent(context, MainActivity::class.java).apply {
                flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
            }
            context.startActivity(mainIntent)
        }
    }
}



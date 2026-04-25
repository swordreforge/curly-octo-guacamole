package com.merak.service

import android.accessibilityservice.AccessibilityService
import android.accessibilityservice.AccessibilityServiceInfo
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import android.util.Base64
import android.util.Log
import android.view.accessibility.AccessibilityEvent
import android.view.accessibility.AccessibilityManager
import com.merak.R
import com.merak.utils.LogManager
import com.merak.service.KeepAliveService
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.cancel
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

/**
 * 广播拦截服务
 * 动态注册接收器拦截 MIUI 定时广播
 */
class ThemeInstallAccessibilityService : AccessibilityService() {

    companion object {
        private const val ACTION_SERVICE_UP = "com.merak.action_Service_UP"
        private val ALARM_ACTION = String(
            Base64.decode("bWl1aS5pbnRlbnQuYWN0aW9uLkNIRUNLX1RJTUVfVVA=", Base64.DEFAULT)
        )
        @Volatile private var isApplyUserTheme = false
        @Volatile private var isConnected = false
        @Volatile private var lastEventTime = 0L
        @Volatile private var st_connectedTime = ""
        @Volatile private var st_currentTime = ""
        @Volatile private var st_receiveTime = ""
        
        @JvmStatic
        fun isAccessibilityServiceEnabled(
            context: Context,
            clazz: Class<out AccessibilityService>
        ): Boolean {
            val accessibilityManager = context.getSystemService(Context.ACCESSIBILITY_SERVICE) 
                as? AccessibilityManager ?: return false
            
            val enabledServices = accessibilityManager.getEnabledAccessibilityServiceList(
                AccessibilityServiceInfo.FEEDBACK_ALL_MASK
            )
            
            for (serviceInfo in enabledServices) {
                val serviceInfoDetail = serviceInfo.resolveInfo.serviceInfo
                if (serviceInfoDetail.packageName == context.packageName &&
                    serviceInfoDetail.name == clazz.name) {
                    return true
                }
            }
            return false
        }
        
        @JvmStatic
        fun isConnected(): Boolean = isConnected
        
        @JvmStatic
        fun getConnectedTime(): String = st_connectedTime
        
        @JvmStatic
        fun getReceiveTime(): String = st_receiveTime
        
        // 触发通知更新的 Action
        const val ACTION_UPDATE_NOTIFICATION = "com.merak.ACTION_UPDATE_NOTIFICATION"
        const val ACTION_REFRESH_NOTIFICATION = "com.merak.ACTION_REFRESH_NOTIFICATION"
    }

    private val dateFormat = SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒", Locale.getDefault())
    private val dateFormat_u = SimpleDateFormat("yyyy/MM/dd HH:mm:ss", Locale.getDefault())
    private val serviceScope = CoroutineScope(SupervisorJob() + Dispatchers.Main)
    
    private val mBroadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context?, intent: Intent?) {
            if (intent == null || context == null) return
            
            when (intent.action) {
                ALARM_ACTION -> {
                    abortBroadcast()
                    
                    val currentTime = System.currentTimeMillis()
                    st_receiveTime = getRst() + dateFormat.format(Date(currentTime))
                    lastEventTime = currentTime

                    serviceScope.launch(Dispatchers.IO) {
                        try {
                            com.merak.utils.LogManager.log(
                                context,
                                com.merak.utils.LogManager.LogType.ALARM_INTERCEPT,
                                context.getString(com.merak.R.string.log_alarm_intercepted),
                                buildString {
                                    append(context.getString(com.merak.R.string.log_broadcast_action))
                                    append(" $ALARM_ACTION\n")
                                    append(context.getString(com.merak.R.string.receive_time_st))
                                    append(" $st_receiveTime\n")
                                    append(context.getString(com.merak.R.string.log_intercept_status))
                                    append(" ")
                                    append(context.getString(com.merak.R.string.log_status_success))
                                }
                            )
                        } catch (e: Exception) {
                            Log.e("HyperThemeService", "记录日志失败", e)
                        } finally {
                            KeepAliveService.requestRefresh(applicationContext)
                        }
                    }
                }
                ACTION_UPDATE_NOTIFICATION, ACTION_REFRESH_NOTIFICATION -> {
                    Log.d("HyperThemeService", "收到通知更新广播: ${intent.action}")
                    KeepAliveService.requestRefresh(context.applicationContext)
                }
            }
        }
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent?) {}

    override fun onInterrupt() {}

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int = START_STICKY

    override fun onServiceConnected() {
        Log.d("HyperThemeService", "===== 无障碍服务已连接 onServiceConnected() =====")
        
        KeepAliveService.requestRefresh(applicationContext)
        
        Intent(ACTION_SERVICE_UP).apply {
            setPackage("com.merak")
            sendBroadcast(this)
        }
        super.onServiceConnected()
    }

    override fun onUnbind(intent: Intent?): Boolean = super.onUnbind(intent)

    override fun onCreate() {
        Log.d("HyperThemeService", "===== 无障碍服务 onCreate() =====")
        if (isConnected) {
            Log.w("HyperThemeService", "服务已连接，onCreate() 跳过")
            return
        }
        
        Intent(ACTION_SERVICE_UP).apply {
            setPackage("com.merak")
            sendBroadcast(this)
        }
        
        st_connectedTime = dateFormat_u.format(Date(System.currentTimeMillis()))
        
        val intentFilter = IntentFilter().apply {
            addAction(ALARM_ACTION)
            addAction(Intent.ACTION_SCREEN_OFF)
            addAction(ACTION_UPDATE_NOTIFICATION)
            addAction(ACTION_REFRESH_NOTIFICATION)
            priority = 1000
        }
        
        if (Build.VERSION.SDK_INT >= 33) {
            registerReceiver(mBroadcastReceiver, intentFilter, Context.RECEIVER_NOT_EXPORTED)
        } else {
            try {
                Context::class.java.getMethod(
                    "registerReceiver",
                    BroadcastReceiver::class.java,
                    IntentFilter::class.java
                ).invoke(this, mBroadcastReceiver, intentFilter)
            } catch (e: Exception) {
                throw RuntimeException(e)
            }
        }
        
        isConnected = true
        super.onCreate()
    }

    override fun onDestroy() {
        if (isConnected) {
            unregisterReceiver(mBroadcastReceiver)
            isConnected = false
        }

        serviceScope.cancel()
        
        Intent(ACTION_SERVICE_UP).apply {
            setPackage("io.vi.hypertheme")
            sendBroadcast(this)
        }
        
        super.onDestroy()
    }

    override fun onTaskRemoved(rootIntent: Intent?) {
        super.onTaskRemoved(rootIntent)
    }

    private fun getRst(): String {
        return try {
            resources.getString(com.merak.R.string.receive_time_st) + " "
        } catch (e: Exception) {
            ""
        }
    }
}

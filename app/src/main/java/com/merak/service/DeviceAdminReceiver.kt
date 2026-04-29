package com.merak.service

import android.app.admin.DeviceAdminReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast

class DeviceAdminReceiver : DeviceAdminReceiver() {

    companion object {
        /**
         * 检查当前应用是否已是 Device Owner（设备所有者）
         */
        fun isDeviceOwner(context: Context): Boolean {
            return try {
                val dpm = context.getSystemService(Context.DEVICE_POLICY_SERVICE) as android.app.admin.DevicePolicyManager
                dpm.isDeviceOwnerApp(context.packageName)
            } catch (e: Exception) {
                false
            }
        }

        /**
         * 检查当前应用是否已是普通 Device Admin（设备管理员）
         */
        fun isDeviceAdminActive(context: Context): Boolean {
            return try {
                val dpm = context.getSystemService(Context.DEVICE_POLICY_SERVICE) as android.app.admin.DevicePolicyManager
                val admin = android.content.ComponentName(context, DeviceAdminReceiver::class.java)
                dpm.isAdminActive(admin)
            } catch (e: Exception) {
                false
            }
        }

        /**
         * 使用 Device Owner 权限阻止/允许卸载本应用。
         * 仅在 isDeviceOwner() 为 true 时有效。
         */
        fun setUninstallBlocked(context: Context, blocked: Boolean): Boolean {
            return try {
                val dpm = context.getSystemService(Context.DEVICE_POLICY_SERVICE) as android.app.admin.DevicePolicyManager
                val admin = android.content.ComponentName(context, DeviceAdminReceiver::class.java)
                dpm.setUninstallBlocked(admin, context.packageName, blocked)
                Log.d("DeviceAdmin", "setUninstallBlocked=$blocked 成功")
                true
            } catch (e: Exception) {
                Log.e("DeviceAdmin", "setUninstallBlocked=$blocked 失败", e)
                false
            }
        }
    }

    override fun onEnabled(context: Context, intent: Intent) {
        super.onEnabled(context, intent)
        Log.d("DeviceAdmin", "已激活为设备管理器")
        Toast.makeText(context, "设备管理器已激活", Toast.LENGTH_SHORT).show()

        // 如果同时是 Device Owner，自动启用卸载阻止
        if (isDeviceOwner(context)) {
            setUninstallBlocked(context, true)
        }
    }

    override fun onDisabled(context: Context, intent: Intent) {
        super.onDisabled(context, intent)
        Log.d("DeviceAdmin", "已禁用设备管理器")
        Toast.makeText(context, "设备管理器已禁用", Toast.LENGTH_SHORT).show()
    }

    /**
     * 当用户尝试在系统设置中取消激活设备管理器时触发。
     * 返回的字符串会显示在系统确认对话框中，用于警告用户。
     * 注意：这只是一个劝阻性提示，用户仍然可以选择继续取消激活。
     */
    override fun onDisableRequested(context: Context, intent: Intent): CharSequence {
        return "⚠️ 警告：取消激活设备管理器后，主题轮换、卸载保护等功能将全部失效。" +
                "如果取消激活是为了卸载本应用，请先关闭「防止卸载保护」和「优化模式」后再操作。"
    }
}
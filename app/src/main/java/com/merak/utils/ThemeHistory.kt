package com.merak.utils

import android.content.Context
import android.content.SharedPreferences
import org.json.JSONArray
import org.json.JSONObject

object ThemeHistory {

    private const val KEY_HISTORY = "theme_history"
    private const val PREFS_NAME = "themestore_prefs"
    
    data class HistoryItem(
        val fileName: String,
        val sourcePath: String,
        val installTime: Long,
        val coverPath: String? = null
    )

    private lateinit var prefs: SharedPreferences

    fun init(context: Context) {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun add(item: HistoryItem) {
        val list = getAll().toMutableList()

        val existingIndex = list.indexOfFirst { it.fileName == item.fileName }
        if (existingIndex >= 0) {
            list[existingIndex] = item.copy(installTime = System.currentTimeMillis())
        } else {
            list.add(0, item)
        }

        save(list)
    }

    fun getAll(): List<HistoryItem> {
        val json = prefs.getString(KEY_HISTORY, null) ?: return emptyList()
        return try {
            val array = JSONArray(json)
            val list = mutableListOf<HistoryItem>()
            for (i in 0 until array.length()) {
                val obj = array.getJSONObject(i)
                list.add(
                    HistoryItem(
                        fileName = obj.getString("fileName"),
                        sourcePath = obj.getString("sourcePath"),
                        installTime = obj.getLong("installTime"),
                        coverPath = obj.optString("coverPath").takeIf { it.isNotEmpty() }
                    )
                )
            }
            list
        } catch (e: Exception) {
            emptyList()
        }
    }

    fun remove(index: Int) {
        val list = getAll().toMutableList()
        if (index in list.indices) {
            list.removeAt(index)
            save(list)
        }
    }

    fun updateCoverPath(index: Int, coverPath: String) {
        val list = getAll().toMutableList()
        if (index in list.indices) {
            list[index] = list[index].copy(coverPath = coverPath)
            save(list)
        }
    }

    fun clear() {
        prefs.edit().remove(KEY_HISTORY).apply()
    }

    private fun save(list: List<HistoryItem>) {
        val array = JSONArray()
        list.forEach { item ->
            val obj = JSONObject().apply {
                put("fileName", item.fileName)
                put("sourcePath", item.sourcePath)
                put("installTime", item.installTime)
                item.coverPath?.let { put("coverPath", it) }
            }
            array.put(obj)
        }
        prefs.edit().putString(KEY_HISTORY, array.toString()).apply()
    }
}
package com.merak.utils

import android.app.Activity
import android.content.Context
import android.content.ContextWrapper
import android.content.res.Configuration
import java.util.Locale

class LanguageHelper {

    companion object {
        fun getIndexLanguage(index: Int): Locale {
            return when (index) {
                0 -> Locale("zh", "CN") // 简体中文
                1 -> Locale("zh", "TW") // 繁体中文
                2 -> Locale("en")       // English
                else -> Locale("zh", "CN")
            }
        }

        fun wrap(context: Context): ContextWrapper {
            val resources = context.resources
            val config = Configuration(resources.configuration)
            val index = PreferenceUtil.getInt("app_language", 0)
            val locale = getIndexLanguage(index)

            config.setLocale(locale)
            Locale.setDefault(locale)

            val newContext = context.createConfigurationContext(config)
            return ContextWrapper(newContext)
        }

        fun Activity.setLocale(index: Int = PreferenceUtil.getInt("app_language", 0)) {
            val res = this.resources
            val metrics = res.displayMetrics
            val configuration = res.configuration.apply {
                setLocale(getIndexLanguage(index))
            }
            res.updateConfiguration(configuration, metrics)
        }
    }
}


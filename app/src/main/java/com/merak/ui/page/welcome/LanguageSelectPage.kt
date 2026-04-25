package com.merak.ui.page.welcome

import android.app.Activity
import android.view.HapticFeedbackConstants
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.PagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.hapticfeedback.HapticFeedbackType
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalHapticFeedback
import androidx.compose.ui.platform.LocalView
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.merak.R
import com.merak.state.AppSettingsState
import com.merak.utils.LanguageHelper.Companion.setLocale
import com.merak.utils.PreferenceUtil
import kotlinx.coroutines.launch
import top.yukonga.miuix.kmp.basic.ButtonDefaults
import top.yukonga.miuix.kmp.basic.Card
import top.yukonga.miuix.kmp.basic.Checkbox
import top.yukonga.miuix.kmp.basic.Icon
import top.yukonga.miuix.kmp.basic.Text
import top.yukonga.miuix.kmp.basic.TextButton

@Composable
fun LanguageSelectPage(pagerState: PagerState) {
    val context = LocalContext.current
    val activity = context as Activity
    val view = LocalView.current
    val coroutineScope = rememberCoroutineScope()
    val language = AppSettingsState.language

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(horizontal = 24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Spacer(modifier = Modifier.height(40.dp))

        Icon(
            painter = painterResource(R.drawable.ic_language),
            contentDescription = "Language",
            tint = Color(0xFF3482FF),
            modifier = Modifier.size(90.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = stringResource(R.string.welcome_language_title),
            fontSize = 20.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            text = stringResource(R.string.welcome_language_desc),
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(24.dp))

        // 简体中文
        LanguageOption(
            title = stringResource(R.string.lang_zh_cn),
            selected = language.intValue == 0,
            onClick = {
                if (language.intValue != 0) {
                    PreferenceUtil.setInt("app_language", 0)
                    PreferenceUtil.setInt("welcome_page_index", pagerState.currentPage)
                    activity.recreate()
                }
            }
        )

        Spacer(modifier = Modifier.height(12.dp))

        // 繁体中文
        LanguageOption(
            title = stringResource(R.string.lang_zh_tw),
            selected = language.intValue == 1,
            onClick = {
                if (language.intValue != 1) {
                    PreferenceUtil.setInt("app_language", 1)
                    PreferenceUtil.setInt("welcome_page_index", pagerState.currentPage)
                    activity.recreate()
                }
            }
        )

        Spacer(modifier = Modifier.height(12.dp))

        // English
        LanguageOption(
            title = stringResource(R.string.lang_en),
            selected = language.intValue == 2,
            onClick = {
                if (language.intValue != 2) {
                    PreferenceUtil.setInt("app_language", 2)
                    PreferenceUtil.setInt("welcome_page_index", pagerState.currentPage)
                    activity.recreate()
                }
            }
        )

        Spacer(modifier = Modifier.weight(1f))

        TextButton(
            text = stringResource(R.string.next_step),
            onClick = {
                view.performHapticFeedback(HapticFeedbackConstants.KEYBOARD_TAP)
                coroutineScope.launch {
                    pagerState.animateScrollToPage(2)
                }
            },
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.textButtonColorsPrimary()
        )

        Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
fun LanguageOption(
    title: String,
    selected: Boolean,
    onClick: () -> Unit
) {
    val haptic = LocalHapticFeedback.current

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable(
                onClick = {
                    haptic.performHapticFeedback(HapticFeedbackType.TextHandleMove)
                    onClick()
                },
                indication = null,
                interactionSource = remember { MutableInteractionSource() }
            )
    ) {
        Row(
            modifier = Modifier
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = title,
                fontSize = 16.sp,
                fontWeight = if (selected) FontWeight.Bold else FontWeight.Normal,
                color = if (selected) Color(0xFF3482FF) else Color.Unspecified
            )

            if (selected) {
                Icon(
                    painter = painterResource(R.drawable.ic_check),
                    contentDescription = "Selected",
                    tint = Color(0xFF3482FF),
                    modifier = Modifier.size(24.dp)
                )
            }
        }
    }
}


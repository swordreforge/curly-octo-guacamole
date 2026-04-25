package com.merak.ui.page

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.input.nestedscroll.nestedScroll
import coil.compose.AsyncImage
import com.merak.BuildConfig
import com.merak.R
import top.yukonga.miuix.kmp.basic.*
import top.yukonga.miuix.kmp.extra.SuperArrow
import top.yukonga.miuix.kmp.icon.MiuixIcons
import top.yukonga.miuix.kmp.icon.icons.useful.Back
import top.yukonga.miuix.kmp.theme.MiuixTheme
import top.yukonga.miuix.kmp.utils.overScrollVertical
import java.text.SimpleDateFormat
import java.util.*

/**
 * 加入QQ群
 */
private fun joinQQGroup(context: Context, key: String): Boolean {
    val intent = Intent().apply {
        data = Uri.parse("mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26jump_from%3Dwebapi%26k%3D$key")
    }
    
    return try {
        context.startActivity(intent)
        true
    } catch (e: Exception) {
        Toast.makeText(context, context.getString(R.string.about_qq_not_installed), Toast.LENGTH_SHORT).show()
        false
    }
}

/**
 * 打开B站空间
 */
private fun openBiliBiliSpace(context: Context, uid: String): Boolean {
    return try {
        val clientIntent = Intent().apply {
            action = Intent.ACTION_VIEW
            data = Uri.parse("bilibili://space/$uid")
        }
        
        if (clientIntent.resolveActivity(context.packageManager) != null) {
            context.startActivity(clientIntent)
            true
        } else {
            openWebFallback(context, uid)
            false
        }
    } catch (e: Exception) {
        openWebFallback(context, uid)
        false
    }
}

private fun openWebFallback(context: Context, uid: String): Boolean {
    return try {
        val webIntent = Intent().apply {
            action = Intent.ACTION_VIEW
            data = Uri.parse("https://space.bilibili.com/$uid")
        }
        context.startActivity(webIntent)
        true
    } catch (e: Exception) {
        Toast.makeText(context, context.getString(R.string.about_open_bilibili_failed), Toast.LENGTH_SHORT).show()
        false
    }
}

/**
 * 应用信息卡片
 */
@Composable
private fun AppInfoCard() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 6.dp)
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.app_name),
                fontSize = 28.sp,
                style = TextStyle(
                    brush = Brush.linearGradient(
                        colors = listOf(
                            MiuixTheme.colorScheme.primary,
                            MiuixTheme.colorScheme.secondary
                        )
                    ),
                    fontWeight = FontWeight.Bold
                ),
                textAlign = TextAlign.Center
            )
            
            Spacer(modifier = Modifier.height(8.dp))
            
            Text(
                text = "${stringResource(R.string.about_version_label)} ${BuildConfig.VERSION_NAME}(${BuildConfig.VERSION_CODE})",
                fontSize = 15.sp,
                fontWeight = FontWeight.Medium,
                color = MiuixTheme.colorScheme.onSurface.copy(alpha = 0.6f),
                textAlign = TextAlign.Center
            )
            
            Spacer(modifier = Modifier.height(4.dp))
            
            Text(
                text = "${stringResource(R.string.about_build_time_label)} ${SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(Date(BuildConfig.BUILD_TIMESTAMP))}",
                fontSize = 13.sp,
                fontWeight = FontWeight.Normal,
                color = MiuixTheme.colorScheme.onSurface.copy(alpha = 0.5f),
                textAlign = TextAlign.Center
            )
        }
    }
}

@Composable
fun AboutPage(onBack: () -> Unit = {}) {
    val context = LocalContext.current
    val scrollBehavior = MiuixScrollBehavior(rememberTopAppBarState())
    
    Scaffold(
        topBar = {
            TopAppBar(
                title = stringResource(R.string.about_title),
                scrollBehavior = scrollBehavior,
                navigationIcon = {
                    IconButton(
                        onClick = onBack,
                        modifier = Modifier.padding(start = 18.dp)
                    ) {
                        Icon(
                            imageVector = MiuixIcons.Useful.Back,
                            contentDescription = stringResource(R.string.back)
                        )
                    }
                }
            )
        }
    ) { padding ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .nestedScroll(scrollBehavior.nestedScrollConnection)
                .overScrollVertical()
        ) {
            item {
                AppInfoCard()
            }
            
            item {
                SmallTitle(stringResource(R.string.about_contributors))
            }
            item {
                Card(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    SuperArrow(
                        title = "MerakXingChen",
                        summary = stringResource(R.string.about_developer),
                        leftAction = {
                            Box(modifier = Modifier.padding(end = 8.dp)) {
                                AsyncImage(
                                    model = "http://q.qlogo.cn/headimg_dl?dst_uin=3499362656&spec=640&img_type=jpg",
                                    contentDescription = stringResource(R.string.about_developer_avatar),
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(36.dp)
                                        .clip(CircleShape)
                                )
                            }
                        },
                        onClick = {
                            openBiliBiliSpace(context, "1064893426")
                        }
                    )
                }
            }
            
            item {
                SmallTitle(stringResource(R.string.about_feedback))
            }
            item {
                Card(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    SuperArrow(
                        title = stringResource(R.string.about_feedback),
                        summary = stringResource(R.string.about_feedback_desc),
                        onClick = {
                            joinQQGroup(context, "oUDBc2a4Yn_a3lBOM9CRlQcweArWZ90k")
                        }
                    )
                }
            }
            
            item {
                SmallTitle(stringResource(R.string.about_support))
            }
            item {
                Card(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    val sponsorToast = stringResource(R.string.about_sponsor_toast)
                    SuperArrow(
                        title = stringResource(R.string.about_sponsor),
                        summary = stringResource(R.string.about_sponsor_summary),
                        onClick = {
                            Toast.makeText(
                                context,
                                sponsorToast,
                                Toast.LENGTH_SHORT
                            ).show()
                        }
                    )
                }
            }
            
            item {
                SmallTitle(stringResource(R.string.about_others))
            }
            item {
                Card(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 6.dp)
                ) {
                    SuperArrow(
                        title = stringResource(R.string.about_github),
                        summary = stringResource(R.string.about_github_desc),
                        onClick = {
                            try {
                                val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/MerakXingChen/ThemeStore"))
                                context.startActivity(intent)
                            } catch (e: Exception) {
                                Toast.makeText(context, context.getString(R.string.about_open_failed), Toast.LENGTH_SHORT).show()
                            }
                        }
                    )
                }
            }
        }
    }
}


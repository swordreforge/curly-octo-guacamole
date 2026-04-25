# 历史记录功能实现计划

> **For agentic workers:** REQUIRED SUB-SKILL: Use superpowers:subagent-driven-development (recommended) or superpowers:executing-plans to implement this plan task-by-task. Steps use checkbox (`- [ ]`) syntax for tracking.

**Goal:** 添加历史记录功能，记录每次成功安装的主题，供用户快速查看和重新安装。

**Architecture:** 使用 SharedPreferences 存储 JSON 格式的历史列表，新增 ThemeHistory 工具类管理历史数据的增删改查，在 MainPage 添加第三个 Tab 展示历史页面。

**Tech Stack:** Kotlin, Compose, SharedPreferences, Miuix UI 组件

---

## 文件结构

```
app/src/main/java/com/merak/
├── utils/
│   └── ThemeHistory.kt          # 新增: 历史记录管理
├── ui/
│   ├── page/
│   │   └── HistoryPage.kt      # 新增: 历史页面
│   └── Router.kt             # 修改: 添加路由
└── ui/page/
    └── MainPage.kt            # 修改: 添加导航项
```

---

## Task 1: 创建 ThemeHistory.kt

**Files:**
- 创建: `app/src/main/java/com/merak/utils/ThemeHistory.kt`

- [ ] **Step 1: 创建 ThemeHistory.kt**

```kotlin
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
        val installTime: Long
    )

    private lateinit var prefs: SharedPreferences

    fun init(context: Context) {
        prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
    }

    fun add(item: HistoryItem) {
        val list = getAll().toMutableList()
        list.add(0, item)  // 添加到最前面
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
                        installTime = obj.getLong("installTime")
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
            }
            array.put(obj)
        }
        prefs.edit().putString(KEY_HISTORY, array.toString()).apply()
    }
}
```

---

## Task 2: 修改 ThemeInstaller.kt 集成历史记录

**Files:**
- Modify: `app/src/main/java/com/merak/utils/ThemeInstaller.kt:164-184`

- [ ] **Step 1: 修改 quickInstall 方法，添加历史记录回调**

```kotlin
    suspend fun quickInstall(context: Context, sourcePath: String): Result<Boolean> {
        return try {
            val result = installThemeFromPath(sourcePath)
            
            result.fold(
                onSuccess = {
                    val applied = applyTheme(context)
                    if (applied) {
                        // 添加历史记录
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
```

注意：需在文件顶部添加 `ThemeHistory` 的 import，并在 `ThemeStoreApplication.onCreate()` 中初始化 `ThemeHistory.init(context)`

---

## Task 3: 创建 HistoryPage.kt

**Files:**
- 创建: `app/src/main/java/com/merak/ui/page/HistoryPage.kt`

- [ ] **Step 1: 创建 HistoryPage.kt**

```kotlin
package com.merak.ui.page

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Text
import androidx.compose.material3.SwipeToDismissBox
import androidx.compose.material3.SwipeToDismissBoxValue
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.merak.R
import com.merak.utils.ThemeHistory
import com.merak.utils.ThemeInstaller
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun HistoryPage() {
    val context = LocalContext.current
    val scope = rememberCoroutineScope()
    val dateFormat = remember { SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault()) }
    
    var historyList by remember { mutableStateOf(emptyList<ThemeHistory.HistoryItem>()) }
    
    LaunchedEffect(Unit) {
        historyList = ThemeHistory.getAll()
    }
    
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFF5F5F5))
    ) {
        // 标题栏
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            Text(
                text = "历史记录",
                fontSize = 20.sp,
                color = Color.Black
            )
        }
        
        if (historyList.isEmpty()) {
            Box(
                modifier = Modifier.fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "暂无历史记录",
                    color = Color.Gray
                )
            }
        } else {
            LazyColumn(
                modifier = Modifier.fillMaxSize(),
                contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp),
                verticalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                itemsIndexed(historyList) { index, item ->
                    var showDismiss by remember { mutableStateOf(false) }
                    var dismissState by remember { 
                        mutableStateOf(SwipeToDismissBoxValue.Settled) 
                    }
                    
                    LaunchedEffect(dismissState) {
                        if (dismissState == SwipeToDismissBoxValue.EndToStart) {
                            ThemeHistory.remove(index)
                            historyList = ThemeHistory.getAll()
                        }
                    }
                    
                    SwipeToDismissBox(
                        state = dismissState,
                        enableDismissFromStartToEnd = false,
                        enableDismissFromEndToStart = true,
                        backgroundContent = {
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .background(Color.Red)
                                    .padding(end = 16.dp),
                                contentAlignment = Alignment.CenterEnd
                            ) {
                                Text("删除", color = Color.White)
                            }
                        },
                        content = {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .background(Color.White)
                                    .clickable {
                                        scope.launch {
                                            ThemeInstaller.quickInstall(context, item.sourcePath)
                                        }
                                    }
                                    .padding(16.dp)
                            ) {
                                Text(
                                    text = item.fileName,
                                    fontSize = 16.sp,
                                    color = Color.Black,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = item.sourcePath,
                                    fontSize = 12.sp,
                                    color = Color.Gray,
                                    maxLines = 1,
                                    overflow = TextOverflow.Ellipsis
                                )
                                Spacer(modifier = Modifier.height(4.dp))
                                Text(
                                    text = dateFormat.format(Date(item.installTime)),
                                    fontSize = 12.sp,
                                    color = Color.Gray
                                )
                            }
                        }
                    )
                }
            }
        }
    }
}
```

---

## Task 4: 修改 Router.kt 添加路由

**Files:**
- Modify: `app/src/main/java/com/merak/ui/Router.kt:1-10`

- [ ] **Step 1: 添加 HISTORY 常量**

```kotlin
object Route {
    const val MAIN = "main"
    const val THEME_INSTALL = "theme_install"
    const val FILE_PICKER = "file_picker"
    const val LOG = "log"
    const val ABOUT = "about"
    const val HISTORY = "history"  // 新增
}
```

---

## Task 5: 修改 MainPage.kt 添加历史Tab

**Files:**
- Modify: `app/src/main/java/com/merak/ui/page/MainPage.kt:1-54`

- [ ] **Step 1: 修改 MainPage.kt 添��入口**

1. 添加 import:
```kotlin
import top.yukonga.miuix.kmp.icon.icons.useful.NavigatorSwitch
```

2. 修改 `items` 列表，添加历史导航项:
```kotlin
val items = listOf(
    NavigationItem(stringResource(R.string.title_home), MiuixIcons.Useful.NavigatorSwitch),
    NavigationItem("历史", MiuixIcons.Useful.NavigatorSwitch),  // 新增
    NavigationItem(stringResource(R.string.title_settings), MiuixIcons.Useful.Settings)
)
```

3. 修改 pageCount 和 page 处理:
```kotlin
val pagerState = rememberPagerState(initialPage = 0, pageCount = { 3 })

// 在 pageContent 中添加:
2 -> HistoryPage()
```

---

## Task 6: 初始化 ThemeHistory

**Files:**
- Modify: `app/src/main/java/com/merak/ThemeStoreApplication.kt`

- [ ] **Step 1: 在 onCreate 中初始化 ThemeHistory**

```kotlin
override fun onCreate() {
    super.onCreate()
    
    // 初始化 PreferenceUtil
    PreferenceUtil.init(this)
    
    // 初始化 ThemeHistory
    ThemeHistory.init(this)  // 新增
    
    // ...
}
```

---

## Task 7: 编译验证

- [ ] **Step 1: 编译 Debug APK**

```bash
./gradlew assembleDebug --no-daemon
```

预期：BUILD SUCCESSFUL

---

**Plan complete.**
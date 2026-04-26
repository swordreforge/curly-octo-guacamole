package com.merak.ui.page

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import coil.request.ImageRequest
import com.merak.R
import com.merak.utils.ThemeHistory
import com.merak.utils.ThemeInstaller
import kotlinx.coroutines.launch
import top.yukonga.miuix.kmp.basic.*
import top.yukonga.miuix.kmp.extra.SuperDialog
import top.yukonga.miuix.kmp.icon.icons.useful.Delete
import top.yukonga.miuix.kmp.utils.overScrollVertical
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import java.io.File
import java.text.SimpleDateFormat
import java.util.*

@Composable
fun HistoryPage() {
    val context = LocalContext.current
    val coroutineScope = rememberCoroutineScope()
    val scrollBehavior = MiuixScrollBehavior(rememberTopAppBarState())

    var historyList by remember { mutableStateOf<List<ThemeHistory.HistoryItem>>(emptyList()) }
    var isLoading by remember { mutableStateOf(true) }
    val showReinstallDialog = remember { mutableStateOf(false) }
    val showReinstallingDialog = remember { mutableStateOf(false) }
    var selectedItem by remember { mutableStateOf<ThemeHistory.HistoryItem?>(null) }
    var isReinstalling by remember { mutableStateOf(false) }

    fun loadHistory() {
        historyList = ThemeHistory.getAll()
    }

    fun extractMissingCovers() {
        coroutineScope.launch {
            historyList.forEachIndexed { index, item ->
                if (item.coverPath.isNullOrEmpty()) {
                    val coverPath = ThemeInstaller.extractCover(context, item.sourcePath)
                    if (coverPath != null) {
                        ThemeHistory.updateCoverPath(index, coverPath)
                    }
                }
            }
            loadHistory()
        }
    }

    LaunchedEffect(Unit) {
        isLoading = true
        loadHistory()
        extractMissingCovers()
        isLoading = false
    }

    Scaffold(
        topBar = {
            TopAppBar(
                title = stringResource(R.string.history_title),
                scrollBehavior = scrollBehavior
            )
        }
    ) { padding ->
        if (isLoading) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        } else if (historyList.isEmpty()) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = stringResource(R.string.history_empty),
                    color = Color.Gray
                )
            }
        } else {
            LazyColumn(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .nestedScroll(scrollBehavior.nestedScrollConnection)
                    .overScrollVertical()
            ) {
                itemsIndexed(historyList) { index, item ->
                    HistoryItemCard(
                        item = item,
                        onReinstallClick = {
                            selectedItem = item
                            showReinstallDialog.value = true
                        },
                        onDeleteClick = {
                            ThemeHistory.remove(index)
                            loadHistory()
                        }
                    )
                }
            }
        }
    }

    if (selectedItem != null && showReinstallDialog.value) {
        SuperDialog(
            title = stringResource(R.string.history_reinstall_title),
            summary = stringResource(R.string.history_reinstall_message, selectedItem!!.fileName),
            show = showReinstallDialog,
            onDismissRequest = { showReinstallDialog.value = false }
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TextButton(
                    text = stringResource(R.string.cancel),
                    onClick = { showReinstallDialog.value = false },
                    modifier = Modifier.weight(1f)
                )
                Spacer(Modifier.width(12.dp))
                TextButton(
                    text = stringResource(R.string.confirm),
                    onClick = {
                        showReinstallDialog.value = false
                        isReinstalling = true
                        showReinstallingDialog.value = true
                        coroutineScope.launch {
                            try {
                                val itemToReinstall = selectedItem!!
                                val result = ThemeInstaller.quickInstall(context, itemToReinstall.sourcePath)
                                result.fold(
                                    onSuccess = {
                                        Toast.makeText(
                                            context,
                                            context.getString(R.string.history_reinstall_success),
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    },
                                    onFailure = { error ->
                                        Toast.makeText(
                                            context,
                                            "${context.getString(R.string.history_reinstall_failed)}: ${error.message}",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }
                                )
                            } catch (e: Exception) {
                                Toast.makeText(
                                    context,
                                    e.message ?: context.getString(R.string.history_reinstall_failed),
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                            isReinstalling = false
                            showReinstallingDialog.value = false
                        }
                    },
                    modifier = Modifier.weight(1f),
                    enabled = !isReinstalling
                )
            }
        }
    }

    if (showReinstallingDialog.value) {
        SuperDialog(
            title = stringResource(R.string.history_reinstalling),
            show = showReinstallingDialog,
            onDismissRequest = {}
        ) {
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.Center
            ) {
                CircularProgressIndicator()
            }
        }
    }
}

@Composable
private fun HistoryItemCard(
    item: ThemeHistory.HistoryItem,
    onReinstallClick: () -> Unit,
    onDeleteClick: () -> Unit
) {
    var expanded by remember { mutableStateOf(false) }
    val coverWidth = 60.dp
    val coverHeight = 106.dp

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 12.dp, vertical = 4.dp)
            .clickable(onClick = onReinstallClick)
    ) {
        Box {
            Column(modifier = Modifier.padding(12.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.spacedBy(12.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (item.coverPath != null && File(item.coverPath).exists()) {
                        Image(
                            painter = rememberAsyncImagePainter(
                                ImageRequest.Builder(LocalContext.current)
                                    .data(File(item.coverPath))
                                    .build()
                            ),
                            contentDescription = "封面",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .width(coverWidth)
                                .height(coverHeight)
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color.Gray.copy(alpha = 0.2f))
                        )
                    } else {
                        Box(
                            modifier = Modifier
                                .width(coverWidth)
                                .height(coverHeight)
                                .clip(RoundedCornerShape(8.dp))
                                .background(Color.Gray.copy(alpha = 0.2f)),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(24.dp),
                                strokeWidth = 2.dp
                            )
                        }
                    }

                    Column(
                        modifier = Modifier.weight(1f)
                    ) {
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Text(
                                text = item.fileName,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis,
                                modifier = Modifier.weight(1f)
                            )

                            Box {
                                Box(
                                    modifier = Modifier
                                        .clickable {
                                            expanded = !expanded
                                        }
                                        .padding(8.dp)
                                ) {
                                    Icon(
                                        imageVector = if (expanded) {
                                            Icons.Filled.KeyboardArrowUp
                                        } else {
                                            Icons.Filled.KeyboardArrowDown
                                        },
                                        contentDescription = if (expanded) "收起" else "展开",
                                        tint = Color.Gray
                                    )
                                }
                            }
                        }

                        Spacer(modifier = Modifier.height(4.dp))

                        if (expanded) {
                            Text(
                                text = formatDateTime(item.installTime),
                                fontSize = 12.sp,
                                color = Color.Gray
                            )

                            Text(
                                text = item.sourcePath,
                                fontSize = 12.sp,
                                color = Color.Gray,
                                maxLines = 1,
                                overflow = TextOverflow.Ellipsis
                            )

                            Spacer(modifier = Modifier.height(8.dp))

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {
                                TextButton(
                                    text = stringResource(R.string.history_reinstall_title),
                                    onClick = onReinstallClick
                                )

                                Spacer(modifier = Modifier.width(8.dp))

                                TextButton(
                                    text = stringResource(R.string.delete),
                                    onClick = onDeleteClick
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}

private fun formatDateTime(timestamp: Long): String {
    val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
    return sdf.format(Date(timestamp))
}
package com.android.thememanager.maml.widget;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.miui.maml.widget.edit.MamlDownloadStatus;
import com.miui.maml.widget.edit.MamlDownloadStatusKt;
import com.miui.maml.widget.edit.MamlWidget;
import com.miui.maml.widget.edit.MamlutilKt;
import com.miui.maml.widget.edit.ParseMamlResource;
import ek5k.C6002g;
import java.io.File;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.io.cdj;
import zy.dd;
import zy.oc;

/* JADX INFO: renamed from: com.android.thememanager.maml.widget.q */
/* JADX INFO: compiled from: MamlDownloadManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2154q implements InterfaceC1755y {

    /* JADX INFO: renamed from: y */
    private static final String f12670y = "MamlDownloadManager";

    /* JADX INFO: renamed from: k */
    private final qrj f12672k = qrj.wvg();

    /* JADX INFO: renamed from: q */
    private boolean f12674q = false;

    /* JADX INFO: renamed from: n */
    private final Map<String, Set<C2152n>> f12673n = new ConcurrentHashMap();

    /* JADX INFO: renamed from: g */
    private boolean f12671g = true;

    private boolean f7l8(Context context, String id, int version) {
        List<MamlWidget> listFindLocalMamlInfo;
        try {
            listFindLocalMamlInfo = MamlutilKt.findLocalMamlInfo(context, null, id, -1, -1, version);
        } catch (Exception e2) {
            e2.printStackTrace();
            listFindLocalMamlInfo = null;
        }
        boolean z2 = listFindLocalMamlInfo != null && listFindLocalMamlInfo.size() > 0;
        String strKja0 = C2152n.kja0();
        if (strKja0 == null) {
            Log.w(f12670y, "isMamlResourceExist: null path");
            return false;
        }
        File file = new File(strKja0, id + ".zip");
        boolean zExists = file.exists();
        if (zExists != z2) {
            Log.w(f12670y, "mamlResourceExist. listValid = " + z2 + ", but zipExist = " + zExists + ", delete " + id + ", " + (zExists ? file.delete() : cdj.m22881c(new File(strKja0, id))));
        }
        return z2 && zExists;
    }

    /* JADX INFO: renamed from: g */
    private C2152n m8204g(String taskId) {
        Set<C2152n> set = this.f12673n.get(taskId);
        if (set == null || set.size() <= 0) {
            return null;
        }
        Iterator<C2152n> it = set.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    private int m8206n(String taskId) {
        int iO1t = this.f12672k.o1t(taskId);
        if (iO1t == 1 || iO1t == 2 || iO1t == 4) {
            return 0;
        }
        return iO1t != 8 ? 3 : 1;
    }

    private void n7h(C2152n task, MamlDownloadStatus s2) {
        String strM8197h = task.m8197h();
        Context qVar = bf2.toq.toq();
        Intent intent = new Intent(MamlutilKt.DOWNLOAD_ACTION);
        MamlDownloadStatusKt.extendIntent(s2, intent);
        intent.setPackage(strM8197h);
        qVar.sendBroadcast(intent);
        Set<C2152n> set = this.f12673n.get(task.getTaskId());
        if (set == null || set.size() <= 1) {
            return;
        }
        Iterator<C2152n> it = set.iterator();
        while (it.hasNext()) {
            String strM8197h2 = it.next().m8197h();
            if (!p029m.zy.m24738k(strM8197h2, strM8197h)) {
                intent.setPackage(strM8197h2);
                qVar.sendBroadcast(intent);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m8207p(C2152n c2152n) {
        Log.i(f12670y, "maml resource already exist. " + c2152n.getTaskId() + ", ver=" + c2152n.ki());
        n7h(c2152n, new MamlDownloadStatus(c2152n.getTaskId(), c2152n.ki(), 2, 100, null));
    }

    /* JADX INFO: renamed from: q */
    private void m8208q(String id) {
        if (this.f12671g) {
            String strKja0 = C2152n.kja0();
            if (strKja0 == null) {
                Log.w(f12670y, "cleanIfNeed: error paht");
            } else {
                MamlutilKt.cleanMamlResource(bf2.toq.toq(), Collections.singletonList(id), strKja0, 20);
                this.f12671g = false;
            }
        }
    }

    private void qrj(C2152n task, int cur, int total) {
        n7h(task, new MamlDownloadStatus(task.getTaskId(), task.ki(), m8206n(task.getTaskId()), (total == 0 || cur == 0) ? 0 : (int) ((cur * 100.0f) / total), null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m8209s() {
        this.f12672k.fu4(this);
    }

    private void x2(C2152n task) {
        Set<C2152n> set = this.f12673n.get(task.getTaskId());
        if (set != null) {
            set.add(task);
            return;
        }
        CopyOnWriteArraySet copyOnWriteArraySet = new CopyOnWriteArraySet();
        copyOnWriteArraySet.add(task);
        this.f12673n.put(task.getTaskId(), copyOnWriteArraySet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m8210y(C2152n c2152n, String str) {
        n7h(c2152n, new MamlDownloadStatus(str, c2152n.ki(), 2, 100, null));
        this.f12673n.remove(str);
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    @oc
    public void handleDownloadComplete(String downloadPath, String taskId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras) {
        C2152n c2152nM8204g = m8204g(taskId);
        if (c2152nM8204g == null) {
            if (downloadSuccess && downloadPath.contains(MamlutilKt.DEFAULT_DIR)) {
                Log.i(f12670y, "download success2, " + taskId);
                C2153p.f7l8(taskId, downloadPath);
                return;
            }
            return;
        }
        if (downloadSuccess) {
            Log.i(f12670y, "download success. " + downloadPath);
            ld6(c2152nM8204g, downloadPath);
            return;
        }
        n7h(c2152nM8204g, new MamlDownloadStatus(taskId, c2152nM8204g.ki(), 3, 0, "failCode=" + downloadFailCode));
        Log.w(f12670y, "download failed. " + downloadPath + ", " + taskId + ",,failCode=" + downloadFailCode);
        this.f12673n.remove(taskId);
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    @oc
    public void handleDownloadProgressUpdate(String downloadPath, String taskId, String extraData, int currBytes, int totalBytes) {
        C2152n c2152nM8204g = m8204g(taskId);
        if (c2152nM8204g != null) {
            qrj(c2152nM8204g, currBytes, totalBytes);
        }
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    @oc
    public void handleDownloadStatusChange(String downloadPath, String taskId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
        if (this.f12673n.containsKey(taskId)) {
            Log.i(f12670y, "downloadStatusChange. " + downloadPath + ",curr=" + currBytes);
        }
    }

    public int kja0(@dd final C2152n task) {
        if (!this.f12674q) {
            C6002g.fn3e(new Runnable() { // from class: com.android.thememanager.maml.widget.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12659k.m8209s();
                }
            });
            this.f12674q = true;
            String strKja0 = C2152n.kja0();
            if (strKja0 != null) {
                C2153p.m8201q(strKja0, f12670y);
            } else {
                Log.w(f12670y, "startDownload: error path");
            }
        }
        if (task == null) {
            return -1;
        }
        String strMo6831g = task.mo6831g();
        if (strMo6831g != null && strMo6831g.startsWith("file")) {
            Log.w(f12670y, "download url error. " + strMo6831g);
            return -1;
        }
        if (f7l8(bf2.toq.toq(), task.getTaskId(), task.ki())) {
            C6002g.zurt(new Runnable() { // from class: com.android.thememanager.maml.widget.toq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12677k.m8207p(task);
                }
            }, 1111L);
            return 1;
        }
        if (this.f12672k.jp0y(task.getTaskId())) {
            int iO1t = this.f12672k.o1t(task.getTaskId());
            x2(task);
            if (iO1t == 4) {
                this.f12672k.fti(task.getTaskId());
                return 1;
            }
            if (iO1t == 2 || iO1t == 1) {
                Log.w(f12670y, "addDownload. but running/ pending. do nothing. " + iO1t + ", " + task.getTaskId() + ", downloadId=" + this.f12672k.m8212z(task.getTaskId()));
                return 1;
            }
            if (iO1t == 8) {
                Log.w(f12670y, "addDownload..but already successful.");
                return 1;
            }
            this.f12672k.ni7(task);
        } else {
            x2(task);
            this.f12672k.ni7(task);
        }
        return 0;
    }

    public void ld6(final C2152n task, String path) {
        final String taskId = task.getTaskId();
        Runnable runnable = new Runnable() { // from class: com.android.thememanager.maml.widget.zy
            @Override // java.lang.Runnable
            public final void run() {
                this.f12681k.m8210y(task, taskId);
            }
        };
        String strKja0 = C2152n.kja0();
        if (strKja0 == null) {
            Log.w(f12670y, "parseZip: error path");
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(strKja0);
        String str = File.separator;
        sb.append(str);
        sb.append(taskId);
        sb.append(str);
        if (ParseMamlResource.INSTANCE.importMamlResource(taskId, path, runnable, sb.toString()) == null) {
            n7h(task, new MamlDownloadStatus(task.getTaskId(), task.ki(), 3, 0, "importMamlFail"));
            this.f12673n.remove(taskId);
        }
        m8208q(taskId);
    }
}

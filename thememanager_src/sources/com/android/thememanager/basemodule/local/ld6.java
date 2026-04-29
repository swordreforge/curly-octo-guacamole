package com.android.thememanager.basemodule.local;

import android.app.DownloadManager;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.cdj;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.util.d8wk;
import ek5k.C6002g;
import java.io.File;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import yz.C7794k;

/* JADX INFO: compiled from: ResourceDownloadService.java */
/* JADX INFO: loaded from: classes.dex */
public class ld6 implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: a */
    private static final String f9960a = "ThemeManagerTag";

    /* JADX INFO: renamed from: b */
    public static final String f9961b = "_downloading";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f57553bo = "no_task_id";

    /* JADX INFO: renamed from: c */
    public static final int f9962c = 300004;

    /* JADX INFO: renamed from: e */
    public static final int f9963e = 300005;

    /* JADX INFO: renamed from: f */
    public static final int f9964f = 300003;

    /* JADX INFO: renamed from: j */
    public static final int f9965j = 300006;

    /* JADX INFO: renamed from: l */
    public static final int f9966l = 300002;

    /* JADX INFO: renamed from: m */
    public static final int f9967m = 300008;

    /* JADX INFO: renamed from: o */
    public static final int f9968o = 300007;

    /* JADX INFO: renamed from: r */
    public static final int f9969r = 300001;

    /* JADX INFO: renamed from: t */
    public static final int f9970t = 0;

    /* JADX INFO: renamed from: u */
    private static final String f9971u = "no_extra_data";

    /* JADX INFO: renamed from: v */
    private static final String f9972v = "no_hash";

    /* JADX INFO: renamed from: x */
    private static volatile ld6 f9973x;

    /* JADX INFO: renamed from: g */
    private volatile HandlerC1745g f9974g;

    /* JADX INFO: renamed from: n */
    private volatile HandlerC1750y f9978n;

    /* JADX INFO: renamed from: q */
    protected volatile DownloadManager f9980q;

    /* JADX INFO: renamed from: y */
    private f7l8 f9982y;

    /* JADX INFO: renamed from: i */
    private List<Long> f9976i = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: z */
    private int f9983z = 10;

    /* JADX INFO: renamed from: k */
    private Context f9977k = bf2.toq.toq();

    /* JADX INFO: renamed from: s */
    private ConcurrentHashMap<String, toq> f9981s = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: p */
    private ConcurrentHashMap<String, toq> f9979p = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: h */
    private List<InterfaceC1747n> f9975h = Collections.synchronizedList(new LinkedList());

    /* JADX INFO: compiled from: ResourceDownloadService.java */
    public interface f7l8 {
        /* JADX INFO: renamed from: k */
        void mo6826k(String savePath, String taskId, String extraData, int currBytes, int totalBytes);

        void toq(String savePath, String taskId, String extraData, EnumC1748q currStatus, int downloadFailCode, String... extras);
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.local.ld6$g */
    /* JADX INFO: compiled from: ResourceDownloadService.java */
    private class HandlerC1745g extends Handler {

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.local.ld6$g$k */
        /* JADX INFO: compiled from: ResourceDownloadService.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ long f9985k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ boolean f9987q;

            k(final long val$downloadId, final boolean val$fromReceiver) {
                this.f9985k = val$downloadId;
                this.f9987q = val$fromReceiver;
            }

            /* JADX WARN: Removed duplicated region for block: B:43:0x0122  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instruction units count: 585
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.basemodule.local.ld6.HandlerC1745g.k.run():void");
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.local.ld6$g$toq */
        /* JADX INFO: compiled from: ResourceDownloadService.java */
        class toq implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ boolean f9988k;

            toq(final boolean val$noMaxDownloadLimited) {
                this.f9988k = val$noMaxDownloadLimited;
            }

            /* JADX WARN: Removed duplicated region for block: B:30:0x0134  */
            /* JADX WARN: Removed duplicated region for block: B:31:0x01b1  */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instruction units count: 458
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.basemodule.local.ld6.HandlerC1745g.toq.run():void");
            }
        }

        public HandlerC1745g(Looper looper) {
            super(looper);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public long m6828q(String downloadUrl, String savePath, String extraDataId, String extraData, String extraDataFileHash, String notificationTitle, long fileSize, boolean hideMobileAlert, boolean showNotification, boolean visibleInDownloadUI) {
            if (!C1781k.toq(bf2.toq.toq())) {
                C7794k.f7l8("not allow connect network");
                return -1L;
            }
            d8wk.m9698n();
            try {
                File file = new File(savePath);
                C1821p.qrj(file.getParentFile(), 511, -1, -1);
                new File(savePath).delete();
                DownloadManager.Request request = new DownloadManager.Request(Uri.parse(downloadUrl));
                request.setNotificationVisibility(showNotification ? 0 : 2).setMimeType(y9n.kja0(downloadUrl)).setTitle(notificationTitle).setDestinationUri(Uri.fromFile(file)).setVisibleInDownloadsUi(visibleInDownloadUI);
                if (hideMobileAlert) {
                    cdj.m7019y(request, "{\"bypass_recommended_size_limit\":true}");
                }
                cdj.f7l8(request, ld6.qrj(extraData, extraDataId, extraDataFileHash));
                if (fileSize > 0) {
                    cdj.m7018s(request, fileSize);
                }
                try {
                    return ld6.this.f9980q.enqueue(request);
                } catch (Exception e2) {
                    e = e2;
                    Log.e("ThemeManagerTag", "Failed to enqueue request to system dmgr " + e.toString());
                    e.printStackTrace();
                    return -1L;
                }
            } catch (Exception e3) {
                e = e3;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean zy(boolean noLimited) {
            return noLimited || ld6.this.f9979p.size() < ld6.this.f9983z;
        }

        public void f7l8(final boolean noMaxDownloadLimited) {
            if (zy(noMaxDownloadLimited)) {
                post(new toq(noMaxDownloadLimited));
            }
        }

        /* JADX INFO: renamed from: g */
        public void m6829g() {
            f7l8(false);
        }

        /* JADX INFO: renamed from: n */
        public void m6830n(final long downloadId, final boolean fromReceiver) {
            if (downloadId < 0) {
                return;
            }
            post(new k(downloadId, fromReceiver));
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.local.ld6$k */
    /* JADX INFO: compiled from: ResourceDownloadService.java */
    private static class C1746k {

        /* JADX INFO: renamed from: k */
        public String f9990k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f57554toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public String f57555zy;

        public C1746k(String appData) {
            if (appData == null) {
                return;
            }
            String[] strArrSplit = appData.split(":");
            if (strArrSplit.length != 3) {
                if (strArrSplit.length != 2) {
                    this.f9990k = appData;
                    return;
                } else {
                    this.f57554toq = strArrSplit[0];
                    this.f9990k = strArrSplit[1];
                    return;
                }
            }
            String str = strArrSplit[0];
            this.f57554toq = str;
            this.f9990k = strArrSplit[1];
            this.f57555zy = strArrSplit[2];
            if (ld6.f9971u.equals(str)) {
                this.f57554toq = null;
            }
            if (ld6.f57553bo.equals(this.f9990k)) {
                this.f9990k = null;
            }
            if (ld6.f9972v.equals(this.f57555zy)) {
                this.f57555zy = null;
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.local.ld6$n */
    /* JADX INFO: compiled from: ResourceDownloadService.java */
    public interface InterfaceC1747n {
        String f7l8();

        /* JADX INFO: renamed from: g */
        String mo6831g();

        String getTaskId();

        String getTitle();

        /* JADX INFO: renamed from: k */
        String mo6832k();

        String ld6();

        /* JADX INFO: renamed from: n */
        int mo6833n();

        default boolean n7h() {
            return true;
        }

        /* JADX INFO: renamed from: p */
        int mo6834p();

        /* JADX INFO: renamed from: q */
        void mo6835q();

        long qrj();

        /* JADX INFO: renamed from: s */
        String mo6836s();

        default boolean toq() {
            return true;
        }

        default boolean x2() {
            return false;
        }

        /* JADX INFO: renamed from: y */
        String mo6837y();

        default String zy() {
            return f7l8();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.local.ld6$q */
    /* JADX INFO: compiled from: ResourceDownloadService.java */
    public enum EnumC1748q {
        STATUS_NONE,
        STATUS_WAITING,
        STATUS_DOWNLOADING,
        STATUS_PENDING,
        STATUS_PAUSED,
        STATUS_FAILED,
        STATUS_SUCCESS,
        STATUS_ERROR
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: ResourceDownloadService.java */
    static class toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public String f57558f7l8;

        /* JADX INFO: renamed from: g */
        public String f9994g;

        /* JADX INFO: renamed from: k */
        public long f9995k;

        /* JADX INFO: renamed from: n */
        public String f9996n;

        /* JADX INFO: renamed from: p */
        public String f9997p;

        /* JADX INFO: renamed from: q */
        public String f9998q;

        /* JADX INFO: renamed from: s */
        public String f9999s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f57559toq;

        /* JADX INFO: renamed from: y */
        public EnumC1748q f10000y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f57560zy;

        public toq() {
        }

        /* JADX INFO: renamed from: k */
        public static toq m6838k(Cursor cursor) {
            toq toqVar = new toq();
            toqVar.f9995k = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            toqVar.f57559toq = cursor.getInt(cursor.getColumnIndexOrThrow("bytes_so_far"));
            toqVar.f57560zy = cursor.getInt(cursor.getColumnIndexOrThrow("total_size"));
            String string = cursor.getString(cursor.getColumnIndex("hint"));
            if (string != null) {
                toqVar.f9998q = Uri.parse(string).getEncodedPath();
            }
            String string2 = cursor.getString(cursor.getColumnIndex("local_uri"));
            if (string2 != null) {
                toqVar.f9996n = Uri.parse(string2).getEncodedPath();
            } else {
                toqVar.f9996n = toqVar.f9998q;
            }
            C1746k c1746k = new C1746k(cursor.getString(cursor.getColumnIndexOrThrow(cdj.f10288q)));
            toqVar.f9994g = c1746k.f9990k;
            toqVar.f9999s = c1746k.f57555zy;
            toqVar.f57558f7l8 = c1746k.f57554toq;
            toqVar.f10000y = ld6.jk(cursor.getInt(cursor.getColumnIndexOrThrow("status")));
            return toqVar;
        }

        public String toq() {
            return "DownloadQueryResult{downloadId=" + this.f9995k + ", currBytes=" + this.f57559toq + ", totalBytes=" + this.f57560zy + ", taskId='" + this.f9994g + "', status=" + this.f10000y + ", taskFileHash=" + this.f9999s + '}';
        }

        public void zy(toq other) {
            if (this != other) {
                this.f9995k = other.f9995k;
                this.f57559toq = other.f57559toq;
                this.f57560zy = other.f57560zy;
                this.f9998q = other.f9998q;
                this.f9996n = other.f9996n;
                this.f9994g = other.f9994g;
                this.f57558f7l8 = other.f57558f7l8;
                this.f10000y = other.f10000y;
                this.f9999s = other.f9999s;
            }
        }

        public toq(toq other) {
            zy(other);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.basemodule.local.ld6$y */
    /* JADX INFO: compiled from: ResourceDownloadService.java */
    class HandlerC1750y extends Handler {

        /* JADX INFO: renamed from: k */
        private Cursor f10001k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ContentObserver f57561toq;

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.local.ld6$y$k */
        /* JADX INFO: compiled from: ResourceDownloadService.java */
        class k extends ContentObserver {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ ld6 f10002k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            k(Handler handler, final ld6 val$this$0) {
                super(handler);
                this.f10002k = val$this$0;
            }

            @Override // android.database.ContentObserver
            public void onChange(boolean selfChange) {
                HandlerC1750y.this.m6845y();
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.local.ld6$y$toq */
        /* JADX INFO: compiled from: ResourceDownloadService.java */
        class toq implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ ld6 f10003k;

            toq(final ld6 val$this$0) {
                this.f10003k = val$this$0;
            }

            @Override // java.lang.Runnable
            public void run() {
                HandlerC1750y.this.m6845y();
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.basemodule.local.ld6$y$zy */
        /* JADX INFO: compiled from: ResourceDownloadService.java */
        class zy implements Runnable {
            zy() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void toq(toq toqVar) {
                ld6.this.fn3e(toqVar.f9995k, false);
            }

            @Override // java.lang.Runnable
            public void run() {
                final toq toqVar;
                if (HandlerC1750y.this.f10001k == null) {
                    HandlerC1750y.this.m6842p();
                    if (HandlerC1750y.this.f10001k == null) {
                        return;
                    }
                } else if (y9n.zy()) {
                    y9n.m7246g(HandlerC1750y.this.f10001k);
                    HandlerC1750y.this.f10001k = null;
                    HandlerC1750y.this.m6842p();
                    StringBuilder sb = new StringBuilder();
                    sb.append("queryStatus ");
                    sb.append(HandlerC1750y.this.f10001k == null);
                    Log.i("ThemeManagerTag", sb.toString());
                    if (HandlerC1750y.this.f10001k == null) {
                        return;
                    }
                } else {
                    HandlerC1750y.this.f10001k.requery();
                }
                HashSet hashSet = new HashSet();
                HandlerC1750y.this.f10001k.moveToPosition(-1);
                if (HandlerC1750y.this.f10001k.getCount() == 0) {
                    HandlerC1750y.this.f10001k.unregisterContentObserver(HandlerC1750y.this.f57561toq);
                    HandlerC1750y.this.f10001k.close();
                    HandlerC1750y.this.f10001k = null;
                }
                while (HandlerC1750y.this.f10001k != null && HandlerC1750y.this.f10001k.moveToNext()) {
                    toq toqVarM6838k = toq.m6838k(HandlerC1750y.this.f10001k);
                    if (!TextUtils.isEmpty(toqVarM6838k.f57558f7l8) && !TextUtils.isEmpty(toqVarM6838k.f9994g)) {
                        toq toqVar2 = (toq) ld6.this.f9981s.get(toqVarM6838k.f9994g);
                        if (toqVar2 == null) {
                            toqVar2 = (toq) ld6.this.f9979p.get(toqVarM6838k.f9994g);
                            if (toqVar2 == null) {
                                toqVar2 = toqVarM6838k;
                            }
                            ld6.this.f9981s.put(toqVar2.f9994g, toqVar2);
                        }
                        boolean z2 = toqVar2.f10000y != toqVarM6838k.f10000y;
                        boolean z3 = toqVar2.f57559toq != toqVarM6838k.f57559toq;
                        toqVar2.zy(toqVarM6838k);
                        hashSet.add(toqVar2.f9994g);
                        if (!ld6.this.f9979p.containsKey(toqVar2.f9994g)) {
                            ld6.this.f9979p.put(toqVar2.f9994g, toqVar2);
                        }
                        if (ld6.this.f9982y != null) {
                            if (z2) {
                                Log.d("ThemeManagerTag", "run: statusChange = " + z2 + " origin.status = " + toqVar2.f10000y);
                                ld6.this.f9982y.toq(toqVar2.f9996n, toqVar2.f9994g, toqVar2.f57558f7l8, toqVar2.f10000y, toqVar2.f10000y == EnumC1748q.STATUS_FAILED ? 300005 : 0, toqVar2.f9997p);
                            }
                            if (z3) {
                                ld6.this.f9982y.mo6826k(toqVar2.f9996n, toqVar2.f9994g, toqVar2.f57558f7l8, toqVar2.f57559toq, toqVar2.f57560zy);
                            }
                        }
                    }
                }
                for (String str : ld6.this.f9981s.keySet()) {
                    if (!hashSet.contains(str)) {
                        ld6.this.f9981s.remove(str);
                    }
                }
                for (String str2 : ld6.this.f9979p.keySet()) {
                    if (!hashSet.contains(str2) && (toqVar = (toq) ld6.this.f9979p.get(str2)) != null) {
                        Log.w("ThemeManagerTag", toqVar.f9995k + ", assume complete delay, submit but not existing now! " + str2);
                        HandlerC1750y.this.postDelayed(new Runnable() { // from class: com.android.thememanager.basemodule.local.qrj
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f10034k.toq(toqVar);
                            }
                        }, 1000L);
                    }
                }
            }
        }

        public HandlerC1750y(Looper looper) {
            super(looper);
            this.f57561toq = null;
            this.f57561toq = new k(this, ld6.this);
            post(new toq(ld6.this));
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: p */
        public synchronized void m6842p() {
            if (this.f10001k == null) {
                DownloadManager.Query query = new DownloadManager.Query();
                query.setFilterByStatus(7);
                try {
                    this.f10001k = ld6.this.f9980q.query(query);
                } catch (Exception unused) {
                }
                Cursor cursor = this.f10001k;
                if (cursor != null) {
                    cursor.registerContentObserver(this.f57561toq);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public void m6844s(long delayMs) {
            if (delayMs == 0) {
                m6845y();
            } else {
                postDelayed(new Runnable() { // from class: com.android.thememanager.basemodule.local.x2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10038k.m6845y();
                    }
                }, delayMs);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public void m6845y() {
            post(new zy());
        }
    }

    /* JADX INFO: compiled from: ResourceDownloadService.java */
    @Retention(RetentionPolicy.SOURCE)
    @interface zy {
    }

    private ld6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fu4(String str) {
        toq toqVar = this.f9981s.get(str);
        if (toqVar == null || toqVar.f10000y != EnumC1748q.STATUS_DOWNLOADING) {
            return;
        }
        cdj.m7011g(this.f9980q, toqVar.f9995k);
        this.f9978n.m6845y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public toq m6816i(long id) {
        Iterator<String> it = this.f9979p.keySet().iterator();
        while (it.hasNext()) {
            toq toqVar = this.f9979p.get(it.next());
            if (toqVar != null && toqVar.f9995k == id) {
                return toqVar;
            }
        }
        return null;
    }

    public static EnumC1748q jk(int status) {
        return status != 1 ? status != 2 ? status != 4 ? status != 8 ? status != 16 ? EnumC1748q.STATUS_ERROR : EnumC1748q.STATUS_FAILED : EnumC1748q.STATUS_SUCCESS : EnumC1748q.STATUS_PAUSED : EnumC1748q.STATUS_DOWNLOADING : EnumC1748q.STATUS_PENDING;
    }

    public static boolean ni7(EnumC1748q s2) {
        return s2 == EnumC1748q.STATUS_DOWNLOADING || s2 == EnumC1748q.STATUS_PAUSED || s2 == EnumC1748q.STATUS_PENDING || s2 == EnumC1748q.STATUS_WAITING;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String qrj(String extraData, String taskId, String fileHash) {
        if (TextUtils.isEmpty(extraData)) {
            extraData = f9971u;
        }
        if (TextUtils.isEmpty(taskId)) {
            taskId = f57553bo;
        }
        if (TextUtils.isEmpty(fileHash)) {
            fileHash = f9972v;
        }
        return extraData + ":" + taskId + ":" + fileHash;
    }

    public static ld6 t8r() {
        if (f9973x == null) {
            synchronized (ld6.class) {
                if (f9973x == null) {
                    f9973x = new ld6();
                }
            }
        }
        return f9973x;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z */
    public /* synthetic */ void m6823z(String str) {
        toq toqVar = this.f9981s.get(str);
        if (toqVar == null || toqVar.f10000y != EnumC1748q.STATUS_PAUSED) {
            return;
        }
        cdj.m7016p(this.f9980q, toqVar.f9995k);
        this.f9978n.m6845y();
    }

    public void a9() {
        this.f9982y = null;
    }

    public int cdj() {
        return this.f9979p.size() + this.f9975h.size();
    }

    public void fn3e(long downloadId, boolean fromReceiver) {
        zurt();
        if (this.f9976i.contains(Long.valueOf(downloadId))) {
            Log.w("ThemeManagerTag", downloadId + ", download complete , already in list.");
            return;
        }
        this.f9976i.add(Long.valueOf(downloadId));
        Log.w("ThemeManagerTag", downloadId + ", download complete , fromReceiver " + fromReceiver);
        this.f9974g.m6830n(downloadId, fromReceiver);
    }

    /* JADX INFO: renamed from: h */
    public EnumC1748q m6824h(String taskId) {
        if (taskId == null) {
            return EnumC1748q.STATUS_NONE;
        }
        toq toqVar = this.f9981s.get(taskId);
        if (toqVar != null) {
            return toqVar.f10000y;
        }
        if (this.f9979p.containsKey(taskId)) {
            return EnumC1748q.STATUS_DOWNLOADING;
        }
        synchronized (this.f9975h) {
            Iterator<InterfaceC1747n> it = this.f9975h.iterator();
            while (it.hasNext()) {
                if (taskId.equals(it.next().getTaskId())) {
                    return EnumC1748q.STATUS_WAITING;
                }
            }
            return EnumC1748q.STATUS_NONE;
        }
    }

    public List<C1749s> ki() {
        HashMap map = new HashMap();
        map.putAll(this.f9979p);
        map.putAll(this.f9981s);
        ArrayList arrayList = new ArrayList();
        for (toq toqVar : map.values()) {
            if (ni7(toqVar.f10000y)) {
                arrayList.add(new C1749s(toqVar));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(this.f9975h);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(new C1749s((InterfaceC1747n) it.next()));
        }
        return arrayList;
    }

    public long kja0(String taskId) {
        if (taskId == null) {
            return -1L;
        }
        toq toqVar = this.f9981s.get(taskId);
        return toqVar != null ? toqVar.f9995k : this.f9979p.containsKey(taskId) ? -2L : -3L;
    }

    public void mcp(int maxAllowNum) {
        if (maxAllowNum <= 0) {
            maxAllowNum = 1;
        }
        this.f9983z = maxAllowNum;
    }

    public C1749s n7h(String taskId) {
        toq toqVar = this.f9979p.get(taskId);
        if (toqVar != null) {
            return new C1749s(toqVar);
        }
        toq toqVar2 = this.f9981s.get(taskId);
        if (toqVar2 != null) {
            return new C1749s(toqVar2);
        }
        synchronized (this.f9975h) {
            for (InterfaceC1747n interfaceC1747n : this.f9975h) {
                if (TextUtils.equals(interfaceC1747n.getTaskId(), taskId)) {
                    return new C1749s(interfaceC1747n);
                }
            }
            return null;
        }
    }

    public void o1t(final String taskId) {
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.basemodule.local.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f10036k.fu4(taskId);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public void m6825t(final String taskId) {
        if (C1781k.toq(bf2.toq.toq())) {
            C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.basemodule.local.p
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10031k.m6823z(taskId);
                }
            });
        } else {
            C7794k.f7l8("not allow connect network");
        }
    }

    public void wvg(f7l8 l2) {
        this.f9982y = l2;
    }

    public boolean x2(InterfaceC1747n task, boolean immediateExecute) {
        Log.d("ThemeManagerTag", "addDownloadTask: task = " + task + " immediateExecute = " + immediateExecute);
        if (task == null) {
            return false;
        }
        zurt();
        if (immediateExecute) {
            this.f9975h.add(0, task);
        } else {
            this.f9975h.add(task);
        }
        this.f9982y.toq(task.f7l8(), task.getTaskId(), task.ld6(), EnumC1748q.STATUS_WAITING, 0, new String[0]);
        this.f9974g.f7l8(immediateExecute);
        return true;
    }

    public void zurt() {
        if (this.f9980q == null || this.f9978n == null || this.f9974g == null) {
            synchronized (this) {
                if (this.f9980q == null || this.f9978n == null || this.f9974g == null) {
                    this.f9980q = (DownloadManager) this.f9977k.getSystemService("download");
                    HandlerThread handlerThread = new HandlerThread("ResourceDownloadService.QueryThread");
                    handlerThread.start();
                    this.f9978n = new HandlerC1750y(handlerThread.getLooper());
                    HandlerThread handlerThread2 = new HandlerThread("ResourceDownloadService.DispatchThread");
                    handlerThread2.start();
                    this.f9974g = new HandlerC1745g(handlerThread2.getLooper());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.local.ld6$s */
    /* JADX INFO: compiled from: ResourceDownloadService.java */
    public static class C1749s {

        /* JADX INFO: renamed from: k */
        public String f9992k;

        /* JADX INFO: renamed from: q */
        public int f9993q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f57556toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f57557zy;

        C1749s(toq result) {
            this.f9992k = result.f9996n;
            this.f57556toq = result.f9994g;
            this.f57557zy = result.f57559toq;
            this.f9993q = result.f57560zy;
        }

        C1749s(InterfaceC1747n task) {
            this.f9992k = task.f7l8();
            this.f57556toq = task.getTaskId();
            this.f57557zy = 0;
            this.f9993q = 0;
        }
    }
}

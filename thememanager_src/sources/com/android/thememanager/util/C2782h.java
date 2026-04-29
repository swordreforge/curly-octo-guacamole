package com.android.thememanager.util;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import android.util.SparseArray;
import com.android.thememanager.R;
import com.android.thememanager.author.AuthorDetailActivity;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.xiaomi.mipush.sdk.C5658n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import miuix.appcompat.app.ki;
import p001b.InterfaceC1357q;

/* JADX INFO: renamed from: com.android.thememanager.util.h */
/* JADX INFO: compiled from: AuthorHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2782h {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final long f61252f7l8 = 31104000;

    /* JADX INFO: renamed from: g */
    private static final long f16517g = 2592000;

    /* JADX INFO: renamed from: k */
    private static final String f16518k = "AuthorHelper";

    /* JADX INFO: renamed from: n */
    private static final long f16519n = 86400;

    /* JADX INFO: renamed from: p */
    public static long f16520p = 0;

    /* JADX INFO: renamed from: q */
    private static final long f16521q = 3600;

    /* JADX INFO: renamed from: s */
    public static SparseArray<String> f16522s = new SparseArray<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f61253toq = "attention_key";

    /* JADX INFO: renamed from: y */
    private static volatile List<WeakReference<zy>> f16523y = null;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final long f61254zy = 60;

    /* JADX INFO: renamed from: com.android.thememanager.util.h$k */
    /* JADX INFO: compiled from: AuthorHelper.java */
    class k implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ q f16524k;

        k(final q val$callback) {
            this.f16524k = val$callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            q qVar = this.f16524k;
            if (qVar != null) {
                qVar.toq();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.h$q */
    /* JADX INFO: compiled from: AuthorHelper.java */
    public interface q {
        /* JADX INFO: renamed from: k */
        void mo6541k();

        void toq();
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.h$toq */
    /* JADX INFO: compiled from: AuthorHelper.java */
    class toq implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ q f16525k;

        toq(final q val$callback) {
            this.f16525k = val$callback;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            q qVar = this.f16525k;
            if (qVar != null) {
                qVar.mo6541k();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.util.h$zy */
    /* JADX INFO: compiled from: AuthorHelper.java */
    public interface zy {
        void a9();

        /* JADX INFO: renamed from: i */
        void mo9793i();
    }

    public static void f7l8(zy attentionCallback) {
        if (f16523y == null) {
            synchronized (C2782h.class) {
                if (f16523y == null) {
                    f16523y = new ArrayList();
                }
            }
        }
        for (int i2 = 0; i2 < f16523y.size(); i2++) {
            if (f16523y.get(i2).get() == attentionCallback) {
                Log.e(f16518k, "Object tried to add another callback", new Exception("Called by"));
                return;
            }
        }
        f16523y.add(new WeakReference<>(attentionCallback));
        m9792y(null);
    }

    /* JADX INFO: renamed from: g */
    private static int m9786g(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar.get(1);
    }

    /* JADX INFO: renamed from: k */
    public static void m9787k() {
        if (f16523y != null) {
            for (int i2 = 0; i2 < f16523y.size(); i2++) {
                f16523y.get(i2).get().a9();
            }
        }
    }

    public static void ld6(String pageGroupTitle, String pageKey, com.android.thememanager.controller.online.zurt requestUrl, com.android.thememanager.activity.kja0 activity) {
        PageGroup pageGroup = new PageGroup();
        pageGroup.setTitle(pageGroupTitle);
        Page page = new Page();
        page.setListUrl(requestUrl);
        page.setKey(pageKey);
        pageGroup.addPage(page);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pageGroup);
        Intent intent = new Intent();
        intent.setClassName(activity.etdu().getTabActivityPackage(), activity.etdu().getTabActivityClass());
        intent.putExtra("REQUEST_RESOURCE_CODE", "theme");
        intent.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
        intent.putExtra(InterfaceC1357q.f53949uv6, 0);
        intent.putExtra(InterfaceC1357q.f53866eqxt, pageGroupTitle);
        activity.startActivityForResult(intent, 1);
    }

    /* JADX INFO: renamed from: n */
    public static String m9788n(long time) {
        if (time <= 0) {
            Log.e(f16518k, "Time is invalid.");
            return "";
        }
        long time2 = (int) ((new Date(System.currentTimeMillis()).getTime() - new Date(time).getTime()) / 1000);
        if (time2 < f16521q) {
            int i2 = (int) (time2 / f61254zy);
            return com.android.thememanager.basemodule.utils.kja0.m7113s(R.plurals.detail_update_time_minute, i2, Integer.valueOf(i2));
        }
        if (time2 < 86400) {
            int i3 = (int) (time2 / f16521q);
            return com.android.thememanager.basemodule.utils.kja0.m7113s(R.plurals.detail_update_time_hour, i3, Integer.valueOf(i3));
        }
        if (time2 < f61252f7l8) {
            return m9790q(time) + C5658n.f73185t8r + zy(time);
        }
        return m9786g(time) + "/" + m9790q(time) + "/" + zy(time);
    }

    /* JADX INFO: renamed from: p */
    public static void m9789p(String pageGroupTitle, String pageKey, com.android.thememanager.controller.online.zurt requestUrl, com.android.thememanager.activity.kja0 activity) {
        PageGroup pageGroup = new PageGroup();
        pageGroup.setTitle(pageGroupTitle);
        Page page = new Page();
        page.setListUrl(requestUrl);
        page.setKey(pageKey);
        pageGroup.addPage(page);
        ArrayList arrayList = new ArrayList();
        arrayList.add(pageGroup);
        Intent intent = new Intent();
        intent.setClassName(activity.etdu().getTabActivityPackage(), AuthorDetailActivity.class.getName());
        intent.putExtra("REQUEST_RESOURCE_CODE", "theme");
        intent.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
        intent.putExtra(InterfaceC1357q.f53949uv6, 11);
        intent.putExtra(InterfaceC1357q.f53866eqxt, pageGroupTitle);
        activity.startActivityForResult(intent, 1);
    }

    /* JADX INFO: renamed from: q */
    private static int m9790q(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar.get(2) + 1;
    }

    /* JADX INFO: renamed from: s */
    public static void m9791s(Context context, q callback) {
        WeakReference weakReference = new WeakReference(context);
        new ki.C6947k((Context) weakReference.get()).m25050z(((Context) weakReference.get()).getResources().getString(R.string.author_dialog_message)).dd(android.R.string.ok, new toq(callback)).mcp(android.R.string.cancel, new k(callback)).m25037g().show();
    }

    public static void toq() {
        if (f16523y != null) {
            for (int i2 = 0; i2 < f16523y.size(); i2++) {
                f16523y.get(i2).get().mo9793i();
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m9792y(zy attentionCallback) {
        if (f16523y != null) {
            for (int size = f16523y.size() - 1; size >= 0; size--) {
                if (f16523y.get(size).get() == attentionCallback) {
                    f16523y.remove(size);
                }
            }
        }
    }

    private static int zy(long time) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return calendar.get(5);
    }
}

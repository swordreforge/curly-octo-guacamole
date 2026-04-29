package com.android.thememanager.controller.local;

import android.net.Uri;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.C1791k;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.android.thememanager.controller.local.g */
/* JADX INFO: compiled from: ImportResourceTask.java */
/* JADX INFO: loaded from: classes2.dex */
public class AsyncTaskC1904g extends AsyncTask<Void, Void, String> {

    /* JADX INFO: renamed from: n */
    public static final String f10867n = AsyncTaskC1904g.class.getSimpleName();

    /* JADX INFO: renamed from: k */
    private Uri f10868k;

    /* JADX INFO: renamed from: q */
    private WeakReference<com.android.thememanager.basemodule.local.n7h> f10869q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f57904toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private C1791k f57905zy;

    public AsyncTaskC1904g(Uri uri, C1791k resourceContext, int code, com.android.thememanager.basemodule.local.n7h listener) {
        this.f10868k = uri;
        this.f57905zy = resourceContext;
        this.f57904toq = code;
        this.f10869q = new WeakReference<>(listener);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x016b, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x016c, code lost:
    
        r0 = r14;
        r14 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0170, code lost:
    
        r1 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0171, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x019a, code lost:
    
        com.android.thememanager.basemodule.utils.y9n.m7246g(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x019d, code lost:
    
        throw r0;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x008e  */
    /* JADX WARN: Type inference failed for: r14v10 */
    /* JADX WARN: Type inference failed for: r14v4, types: [android.content.Context, com.android.thememanager.ThemeApplication] */
    /* JADX WARN: Type inference failed for: r14v8, types: [java.lang.AutoCloseable] */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String doInBackground(java.lang.Void... r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 414
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.controller.local.AsyncTaskC1904g.doInBackground(java.lang.Void[]):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(String s2) {
        super.onPostExecute(s2);
        WeakReference<com.android.thememanager.basemodule.local.n7h> weakReference = this.f10869q;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.f10869q.get().mo6854k(!TextUtils.isEmpty(s2));
        this.f10869q = null;
    }
}

package com.android.thememanager.settings;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.InterfaceC0928g;
import ek5k.C6002g;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class AlbumLoader implements InterfaceC0928g {

    /* JADX INFO: renamed from: g */
    public static final String f14872g = "album";

    /* JADX INFO: renamed from: h */
    public static final String f14873h = "media_count";

    /* JADX INFO: renamed from: i */
    public static final String f14874i = "cover_path";

    /* JADX INFO: renamed from: n */
    public static final String f14875n = "com.miui.gallery.cloud.provider";

    /* JADX INFO: renamed from: p */
    public static final String f14876p = "_id";

    /* JADX INFO: renamed from: s */
    public static final String f14877s = "media_type";

    /* JADX INFO: renamed from: t */
    public static final int f14878t = 2;

    /* JADX INFO: renamed from: y */
    public static final String f14879y = "remove_duplicate_items";

    /* JADX INFO: renamed from: z */
    public static final int f14880z = 1;

    /* JADX INFO: renamed from: k */
    private InterfaceC2501k f14881k;

    /* JADX INFO: renamed from: q */
    private final WeakReference<Context> f14882q;

    /* JADX INFO: renamed from: com.android.thememanager.settings.AlbumLoader$k */
    public interface InterfaceC2501k {
        /* JADX INFO: renamed from: k */
        void mo8966k(toq info);
    }

    public static class toq {

        /* JADX INFO: renamed from: k */
        private int f14883k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f60774toq;

        public toq(int count, String cover) {
            this.f14883k = count;
            this.f60774toq = cover;
        }

        /* JADX INFO: renamed from: k */
        public int m8967k() {
            return this.f14883k;
        }

        /* JADX INFO: renamed from: q */
        public void m8968q(String cover) {
            this.f60774toq = cover;
        }

        public String toq() {
            return this.f60774toq;
        }

        public void zy(int count) {
            this.f14883k = count;
        }
    }

    public AlbumLoader(Context context, InterfaceC2501k callbacks) {
        this.f14882q = new WeakReference<>(context);
        this.f14881k = callbacks;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m8963n() {
        Context context = this.f14882q.get();
        if (context == null) {
            return;
        }
        final toq toqVar = null;
        try {
            Cursor cursorQuery = context.getContentResolver().query(Uri.parse("content://com.miui.gallery.cloud.provider").buildUpon().appendPath(f14872g).appendQueryParameter(f14879y, "true").appendQueryParameter(f14877s, String.valueOf(3)).build(), new String[]{"_id", f14873h, f14874i}, "media_count > 0", null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0) {
                        int columnIndex = cursorQuery.getColumnIndex(f14873h);
                        int columnIndex2 = cursorQuery.getColumnIndex(f14874i);
                        cursorQuery.moveToFirst();
                        int i2 = cursorQuery.getInt(columnIndex);
                        String string = cursorQuery.getString(columnIndex2);
                        while (cursorQuery.moveToNext()) {
                            i2 += cursorQuery.getInt(columnIndex);
                        }
                        toqVar = new toq(i2, string);
                    }
                } finally {
                }
            }
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        } catch (Exception e2) {
            Log.e("AlbumLoader", "load fail. " + e2);
        }
        C6002g.fn3e(new Runnable() { // from class: com.android.thememanager.settings.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f15086k.m8964q(toqVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m8964q(toq toqVar) {
        InterfaceC2501k interfaceC2501k = this.f14881k;
        if (interfaceC2501k != null) {
            interfaceC2501k.mo8966k(toqVar);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m8965g() {
        this.f14881k = null;
        this.f14882q.clear();
    }

    public void zy() {
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.settings.toq
            @Override // java.lang.Runnable
            public final void run() {
                this.f15917k.m8963n();
            }
        });
    }
}

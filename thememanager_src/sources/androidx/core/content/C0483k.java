package androidx.core.content;

import android.content.ContentProvider;
import android.content.Context;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.content.k */
/* JADX INFO: compiled from: ContentProviderCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0483k {
    private C0483k() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static Context m2179k(@lvui ContentProvider contentProvider) {
        Context context = contentProvider.getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Cannot find context from the provider.");
    }
}

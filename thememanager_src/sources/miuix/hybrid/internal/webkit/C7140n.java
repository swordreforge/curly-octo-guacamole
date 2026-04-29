package miuix.hybrid.internal.webkit;

import android.webkit.GeolocationPermissions;
import miuix.hybrid.AbstractC7152q;

/* JADX INFO: renamed from: miuix.hybrid.internal.webkit.n */
/* JADX INFO: compiled from: GeolocationPermissionsCallback.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7140n implements AbstractC7152q.k {

    /* JADX INFO: renamed from: k */
    private GeolocationPermissions.Callback f40312k;

    public C7140n(GeolocationPermissions.Callback callback) {
        this.f40312k = callback;
    }

    @Override // miuix.hybrid.AbstractC7152q.k
    public void invoke(String origin, boolean allow, boolean retain) {
        this.f40312k.invoke(origin, allow, retain);
    }
}

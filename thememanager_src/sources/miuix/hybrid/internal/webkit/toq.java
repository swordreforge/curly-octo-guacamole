package miuix.hybrid.internal.webkit;

import android.content.Context;
import android.webkit.CookieSyncManager;
import miuix.hybrid.internal.provider.AbstractC7131k;

/* JADX INFO: compiled from: CookieSyncManagerDelegate.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq extends AbstractC7131k {
    @Override // miuix.hybrid.internal.provider.AbstractC7131k
    /* JADX INFO: renamed from: k */
    public void mo25840k(Context context) {
        CookieSyncManager.createInstance(context);
    }

    @Override // miuix.hybrid.internal.provider.AbstractC7131k
    public void toq() {
        CookieSyncManager.getInstance();
    }

    @Override // miuix.hybrid.internal.provider.AbstractC7131k
    public void zy() {
        CookieSyncManager.getInstance().sync();
    }
}

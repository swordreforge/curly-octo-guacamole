package miuix.hybrid.internal.webkit;

import android.webkit.WebBackForwardList;
import miuix.hybrid.AbstractC7122h;
import miuix.hybrid.AbstractC7149n;

/* JADX INFO: renamed from: miuix.hybrid.internal.webkit.y */
/* JADX INFO: compiled from: WebBackForwardList.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7145y extends AbstractC7149n {

    /* JADX INFO: renamed from: k */
    private WebBackForwardList f40322k;

    public C7145y(WebBackForwardList webBackForwardList) {
        this.f40322k = webBackForwardList;
    }

    @Override // miuix.hybrid.AbstractC7149n
    /* JADX INFO: renamed from: k */
    public int mo25897k() {
        return this.f40322k.getCurrentIndex();
    }

    @Override // miuix.hybrid.AbstractC7149n
    /* JADX INFO: renamed from: q */
    public int mo25898q() {
        return this.f40322k.getSize();
    }

    @Override // miuix.hybrid.AbstractC7149n
    public AbstractC7122h toq() {
        return new C7142p(this.f40322k.getCurrentItem());
    }

    @Override // miuix.hybrid.AbstractC7149n
    public AbstractC7122h zy(int index) {
        return new C7142p(this.f40322k.getItemAtIndex(index));
    }
}

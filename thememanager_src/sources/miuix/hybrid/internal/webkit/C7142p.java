package miuix.hybrid.internal.webkit;

import android.graphics.Bitmap;
import android.webkit.WebHistoryItem;
import miuix.hybrid.AbstractC7122h;

/* JADX INFO: renamed from: miuix.hybrid.internal.webkit.p */
/* JADX INFO: compiled from: WebHistoryItem.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7142p extends AbstractC7122h {

    /* JADX INFO: renamed from: k */
    private final WebHistoryItem f40314k;

    public C7142p(WebHistoryItem webHistoryItem) {
        this.f40314k = webHistoryItem;
    }

    @Override // miuix.hybrid.AbstractC7122h
    /* JADX INFO: renamed from: k */
    public Bitmap mo25791k() {
        return this.f40314k.getFavicon();
    }

    @Override // miuix.hybrid.AbstractC7122h
    /* JADX INFO: renamed from: q */
    public String mo25792q() {
        return this.f40314k.getUrl();
    }

    @Override // miuix.hybrid.AbstractC7122h
    public String toq() {
        return this.f40314k.getOriginalUrl();
    }

    @Override // miuix.hybrid.AbstractC7122h
    public String zy() {
        return this.f40314k.getTitle();
    }
}

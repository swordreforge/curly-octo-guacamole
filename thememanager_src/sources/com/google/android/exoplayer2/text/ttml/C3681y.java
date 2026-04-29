package com.google.android.exoplayer2.text.ttml;

import com.google.android.exoplayer2.util.lrht;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.ttml.y */
/* JADX INFO: compiled from: TtmlSubtitle.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3681y implements com.google.android.exoplayer2.text.f7l8 {

    /* JADX INFO: renamed from: g */
    private final Map<String, C3677n> f22067g;

    /* JADX INFO: renamed from: k */
    private final C3678q f22068k;

    /* JADX INFO: renamed from: n */
    private final Map<String, f7l8> f22069n;

    /* JADX INFO: renamed from: q */
    private final long[] f22070q;

    /* JADX INFO: renamed from: y */
    private final Map<String, String> f22071y;

    public C3681y(C3678q c3678q, Map<String, f7l8> map, Map<String, C3677n> map2, Map<String, String> map3) {
        this.f22068k = c3678q;
        this.f22067g = map2;
        this.f22071y = map3;
        this.f22069n = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f22070q = c3678q.m12967p();
    }

    @yz
    /* JADX INFO: renamed from: g */
    C3678q m12970g() {
        return this.f22068k;
    }

    @yz
    /* JADX INFO: renamed from: k */
    Map<String, f7l8> m12971k() {
        return this.f22069n;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: n */
    public int mo12858n() {
        return this.f22070q.length;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: q */
    public long mo12859q(int i2) {
        return this.f22070q[i2];
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public int toq(long j2) {
        int iM13658g = lrht.m13658g(this.f22070q, j2, false, false);
        if (iM13658g < this.f22070q.length) {
            return iM13658g;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public List<com.google.android.exoplayer2.text.toq> zy(long j2) {
        return this.f22068k.m12968y(j2, this.f22069n, this.f22067g, this.f22071y);
    }
}

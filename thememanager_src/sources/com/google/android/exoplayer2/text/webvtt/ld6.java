package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: compiled from: WebvttSubtitle.java */
/* JADX INFO: loaded from: classes2.dex */
final class ld6 implements com.google.android.exoplayer2.text.f7l8 {

    /* JADX INFO: renamed from: k */
    private final List<C3686n> f22110k;

    /* JADX INFO: renamed from: n */
    private final long[] f22111n;

    /* JADX INFO: renamed from: q */
    private final long[] f22112q;

    public ld6(List<C3686n> list) {
        this.f22110k = Collections.unmodifiableList(new ArrayList(list));
        this.f22112q = new long[list.size() * 2];
        for (int i2 = 0; i2 < list.size(); i2++) {
            C3686n c3686n = list.get(i2);
            int i3 = i2 * 2;
            long[] jArr = this.f22112q;
            jArr[i3] = c3686n.f65932toq;
            jArr[i3 + 1] = c3686n.f65933zy;
        }
        long[] jArr2 = this.f22112q;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f22111n = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ int m12993g(C3686n c3686n, C3686n c3686n2) {
        return Long.compare(c3686n.f65932toq, c3686n2.f65932toq);
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: n */
    public int mo12858n() {
        return this.f22111n.length;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: q */
    public long mo12859q(int i2) {
        C3844k.m13629k(i2 >= 0);
        C3844k.m13629k(i2 < this.f22111n.length);
        return this.f22111n[i2];
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public int toq(long j2) {
        int iM13658g = lrht.m13658g(this.f22111n, j2, false, false);
        if (iM13658g < this.f22111n.length) {
            return iM13658g;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public List<com.google.android.exoplayer2.text.toq> zy(long j2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < this.f22110k.size(); i2++) {
            long[] jArr = this.f22112q;
            int i3 = i2 * 2;
            if (jArr[i3] <= j2 && j2 < jArr[i3 + 1]) {
                C3686n c3686n = this.f22110k.get(i2);
                com.google.android.exoplayer2.text.toq toqVar = c3686n.f22113k;
                if (toqVar.f22007y == -3.4028235E38f) {
                    arrayList2.add(c3686n);
                } else {
                    arrayList.add(toqVar);
                }
            }
        }
        Collections.sort(arrayList2, new Comparator() { // from class: com.google.android.exoplayer2.text.webvtt.p
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ld6.m12993g((C3686n) obj, (C3686n) obj2);
            }
        });
        for (int i4 = 0; i4 < arrayList2.size(); i4++) {
            arrayList.add(((C3686n) arrayList2.get(i4)).f22113k.toq().m12937i((-1) - i4, 1).m12938k());
        }
        return arrayList;
    }
}

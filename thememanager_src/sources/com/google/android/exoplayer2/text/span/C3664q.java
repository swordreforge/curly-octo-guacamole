package com.google.android.exoplayer2.text.span;

import android.text.Spannable;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.span.q */
/* JADX INFO: compiled from: SpanUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3664q {
    private C3664q() {
    }

    /* JADX INFO: renamed from: k */
    public static void m12922k(Spannable spannable, Object obj, int i2, int i3, int i4) {
        for (Object obj2 : spannable.getSpans(i2, i3, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i2 && spannable.getSpanEnd(obj2) == i3 && spannable.getSpanFlags(obj2) == i4) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i2, i3, i4);
    }
}

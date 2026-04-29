package com.google.android.exoplayer2.ui;

import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.RelativeSizeSpan;
import com.google.android.exoplayer2.text.toq;
import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: compiled from: SubtitleViewUtils.java */
/* JADX INFO: loaded from: classes2.dex */
final class n5r1 {
    private n5r1() {
    }

    private static void f7l8(Spannable spannable, com.google.common.base.a9<Object> a9Var) {
        for (Object obj : spannable.getSpans(0, spannable.length(), Object.class)) {
            if (a9Var.apply(obj)) {
                spannable.removeSpan(obj);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m13321g(toq.zy zyVar) {
        zyVar.mcp(-3.4028235E38f, Integer.MIN_VALUE);
        if (zyVar.ld6() instanceof Spanned) {
            if (!(zyVar.ld6() instanceof Spannable)) {
                zyVar.wvg(SpannableString.valueOf(zyVar.ld6()));
            }
            f7l8((Spannable) C3844k.f7l8(zyVar.ld6()), new com.google.common.base.a9() { // from class: com.google.android.exoplayer2.ui.ncyb
                @Override // com.google.common.base.a9
                public final boolean apply(Object obj) {
                    return n5r1.m13324q(obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n */
    public static void m13323n(toq.zy zyVar) {
        zyVar.toq();
        if (zyVar.ld6() instanceof Spanned) {
            if (!(zyVar.ld6() instanceof Spannable)) {
                zyVar.wvg(SpannableString.valueOf(zyVar.ld6()));
            }
            f7l8((Spannable) C3844k.f7l8(zyVar.ld6()), new com.google.common.base.a9() { // from class: com.google.android.exoplayer2.ui.l
                @Override // com.google.common.base.a9
                public final boolean apply(Object obj) {
                    return n5r1.zy(obj);
                }
            });
        }
        m13321g(zyVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m13324q(Object obj) {
        return (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan);
    }

    /* JADX INFO: renamed from: y */
    public static float m13325y(int i2, float f2, int i3, int i4) {
        float f3;
        if (f2 == -3.4028235E38f) {
            return -3.4028235E38f;
        }
        if (i2 == 0) {
            f3 = i4;
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    return -3.4028235E38f;
                }
                return f2;
            }
            f3 = i3;
        }
        return f2 * f3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean zy(Object obj) {
        return !(obj instanceof com.google.android.exoplayer2.text.span.toq);
    }
}

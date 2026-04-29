package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.google.android.exoplayer2.ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.ui.e */
/* JADX INFO: compiled from: WebViewSubtitleOutput.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3745e extends FrameLayout implements SubtitleView.InterfaceC3733k {

    /* JADX INFO: renamed from: h */
    private static final float f22597h = 1.2f;

    /* JADX INFO: renamed from: i */
    private static final String f22598i = "default_bg";

    /* JADX INFO: renamed from: g */
    private C3760n f22599g;

    /* JADX INFO: renamed from: k */
    private final C3762q f22600k;

    /* JADX INFO: renamed from: n */
    private List<com.google.android.exoplayer2.text.toq> f22601n;

    /* JADX INFO: renamed from: p */
    private float f22602p;

    /* JADX INFO: renamed from: q */
    private final WebView f22603q;

    /* JADX INFO: renamed from: s */
    private int f22604s;

    /* JADX INFO: renamed from: y */
    private float f22605y;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.e$k */
    /* JADX INFO: compiled from: WebViewSubtitleOutput.java */
    class k extends WebView {
        k(C3745e c3745e, Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.e$toq */
    /* JADX INFO: compiled from: WebViewSubtitleOutput.java */
    static /* synthetic */ class toq {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f22606k;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f22606k = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22606k[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22606k[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C3745e(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: g */
    private static String m13286g(int i2) {
        return i2 != 1 ? i2 != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    /* JADX INFO: renamed from: n */
    private String m13287n(int i2, float f2) {
        float fM13325y = n5r1.m13325y(i2, f2, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        return fM13325y == -3.4028235E38f ? "unset" : com.google.android.exoplayer2.util.lrht.gvn7("%.2fpx", Float.valueOf(fM13325y / getContext().getResources().getDisplayMetrics().density));
    }

    /* JADX INFO: renamed from: q */
    private static String m13288q(C3760n c3760n) {
        int i2 = c3760n.f22829q;
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "unset" : com.google.android.exoplayer2.util.lrht.gvn7("-0.05em -0.05em 0.15em %s", ld6.toq(c3760n.f22828n)) : com.google.android.exoplayer2.util.lrht.gvn7("0.06em 0.08em 0.15em %s", ld6.toq(c3760n.f22828n)) : com.google.android.exoplayer2.util.lrht.gvn7("0.1em 0.12em 0.15em %s", ld6.toq(c3760n.f22828n)) : com.google.android.exoplayer2.util.lrht.gvn7("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", ld6.toq(c3760n.f22828n));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x023b  */
    /* JADX INFO: renamed from: s */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m13289s() {
        /*
            Method dump skipped, instruction units count: 699
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.C3745e.m13289s():void");
    }

    private static int toq(int i2) {
        if (i2 != 1) {
            return i2 != 2 ? 0 : -100;
        }
        return -50;
    }

    /* JADX INFO: renamed from: y */
    private static String m13290y(com.google.android.exoplayer2.text.toq toqVar) {
        float f2 = toqVar.f21998j;
        if (f2 == 0.0f) {
            return "";
        }
        int i2 = toqVar.f21993e;
        return com.google.android.exoplayer2.util.lrht.gvn7("%s(%.2fdeg)", (i2 == 2 || i2 == 1) ? "skewY" : "skewX", Float.valueOf(f2));
    }

    private static String zy(@zy.dd Layout.Alignment alignment) {
        if (alignment == null) {
            return C3678q.f22036a;
        }
        int i2 = toq.f22606k[alignment.ordinal()];
        return i2 != 1 ? i2 != 2 ? C3678q.f22036a : C3678q.f65807ch : "start";
    }

    public void f7l8() {
        this.f22603q.destroy();
    }

    @Override // com.google.android.exoplayer2.ui.SubtitleView.InterfaceC3733k
    /* JADX INFO: renamed from: k */
    public void mo13248k(List<com.google.android.exoplayer2.text.toq> list, C3760n c3760n, float f2, int i2, float f3) {
        this.f22599g = c3760n;
        this.f22605y = f2;
        this.f22604s = i2;
        this.f22602p = f3;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < list.size(); i3++) {
            com.google.android.exoplayer2.text.toq toqVar = list.get(i3);
            if (toqVar.f21995g != null) {
                arrayList.add(toqVar);
            } else {
                arrayList2.add(toqVar);
            }
        }
        if (!this.f22601n.isEmpty() || !arrayList2.isEmpty()) {
            this.f22601n = arrayList2;
            m13289s();
        }
        this.f22600k.mo13248k(arrayList, c3760n, f2, i2, f3);
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (!z2 || this.f22601n.isEmpty()) {
            return;
        }
        m13289s();
    }

    public C3745e(Context context, @zy.dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22601n = Collections.emptyList();
        this.f22599g = C3760n.f66706qrj;
        this.f22605y = 0.0533f;
        this.f22604s = 0;
        this.f22602p = 0.08f;
        C3762q c3762q = new C3762q(context, attributeSet);
        this.f22600k = c3762q;
        k kVar = new k(this, context, attributeSet);
        this.f22603q = kVar;
        kVar.setBackgroundColor(0);
        addView(c3762q);
        addView(kVar);
    }
}

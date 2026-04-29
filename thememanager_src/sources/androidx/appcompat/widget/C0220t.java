package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.C0506s;
import androidx.core.view.C0683f;
import androidx.core.view.inputmethod.C0697n;
import java.lang.ref.WeakReference;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.t */
/* JADX INFO: compiled from: AppCompatTextHelper.java */
/* JADX INFO: loaded from: classes.dex */
class C0220t {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f46950cdj = 3;

    /* JADX INFO: renamed from: h */
    private static final int f1179h = 2;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f46951kja0 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f46952n7h = -1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private yz f46953f7l8;

    /* JADX INFO: renamed from: g */
    private yz f1180g;

    /* JADX INFO: renamed from: k */
    @zy.lvui
    private final TextView f1181k;

    /* JADX INFO: renamed from: n */
    private yz f1182n;

    /* JADX INFO: renamed from: q */
    private yz f1184q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f46955qrj;

    /* JADX INFO: renamed from: s */
    @zy.lvui
    private final jk f1185s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private yz f46956toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private Typeface f46957x2;

    /* JADX INFO: renamed from: y */
    private yz f1186y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private yz f46958zy;

    /* JADX INFO: renamed from: p */
    private int f1183p = 0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f46954ld6 = -1;

    /* JADX INFO: renamed from: androidx.appcompat.widget.t$k */
    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    class k extends C0506s.f7l8 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f1187k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f46959toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ WeakReference f46960zy;

        k(int i2, int i3, WeakReference weakReference) {
            this.f1187k = i2;
            this.f46959toq = i3;
            this.f46960zy = weakReference;
        }

        @Override // androidx.core.content.res.C0506s.f7l8
        /* JADX INFO: renamed from: s */
        public void f7l8(@zy.lvui Typeface typeface) {
            int i2;
            if (Build.VERSION.SDK_INT >= 28 && (i2 = this.f1187k) != -1) {
                typeface = Typeface.create(typeface, i2, (this.f46959toq & 2) != 0);
            }
            C0220t.this.n7h(this.f46960zy, typeface);
        }

        @Override // androidx.core.content.res.C0506s.f7l8
        /* JADX INFO: renamed from: y */
        public void m2335g(int i2) {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.t$toq */
    /* JADX INFO: compiled from: AppCompatTextHelper.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ TextView f1190k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f1191n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Typeface f1192q;

        toq(TextView textView, Typeface typeface, int i2) {
            this.f1190k = textView;
            this.f1192q = typeface;
            this.f1191n = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1190k.setTypeface(this.f1192q, this.f1191n);
        }
    }

    C0220t(@zy.lvui TextView textView) {
        this.f1181k = textView;
        this.f1185s = new jk(textView);
    }

    /* JADX INFO: renamed from: k */
    private void m715k(Drawable drawable, yz yzVar) {
        if (drawable == null || yzVar == null) {
            return;
        }
        ld6.m630p(drawable, yzVar, this.f1181k.getDrawableState());
    }

    private void mcp(Context context, C0184b c0184b) {
        String strNi7;
        this.f1183p = c0184b.kja0(C7397k.qrj.wqg, this.f1183p);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int iKja0 = c0184b.kja0(C7397k.qrj.fm, -1);
            this.f46954ld6 = iKja0;
            if (iKja0 != -1) {
                this.f1183p = (this.f1183p & 2) | 0;
            }
        }
        int i3 = C7397k.qrj.mc;
        if (!c0184b.mcp(i3) && !c0184b.mcp(C7397k.qrj.l0u)) {
            int i4 = C7397k.qrj.g8;
            if (c0184b.mcp(i4)) {
                this.f46955qrj = false;
                int iKja02 = c0184b.kja0(i4, 1);
                if (iKja02 == 1) {
                    this.f46957x2 = Typeface.SANS_SERIF;
                    return;
                } else if (iKja02 == 2) {
                    this.f46957x2 = Typeface.SERIF;
                    return;
                } else {
                    if (iKja02 != 3) {
                        return;
                    }
                    this.f46957x2 = Typeface.MONOSPACE;
                    return;
                }
            }
            return;
        }
        this.f46957x2 = null;
        int i5 = C7397k.qrj.l0u;
        if (c0184b.mcp(i5)) {
            i3 = i5;
        }
        int i6 = this.f46954ld6;
        int i7 = this.f1183p;
        if (!context.isRestricted()) {
            try {
                Typeface typefaceLd6 = c0184b.ld6(i3, this.f1183p, new k(i6, i7, new WeakReference(this.f1181k)));
                if (typefaceLd6 != null) {
                    if (i2 < 28 || this.f46954ld6 == -1) {
                        this.f46957x2 = typefaceLd6;
                    } else {
                        this.f46957x2 = Typeface.create(Typeface.create(typefaceLd6, 0), this.f46954ld6, (this.f1183p & 2) != 0);
                    }
                }
                this.f46955qrj = this.f46957x2 == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f46957x2 != null || (strNi7 = c0184b.ni7(i3)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f46954ld6 == -1) {
            this.f46957x2 = Typeface.create(strNi7, this.f1183p);
        } else {
            this.f46957x2 = Typeface.create(Typeface.create(strNi7, 0), this.f46954ld6, (this.f1183p & 2) != 0);
        }
    }

    private void o1t() {
        yz yzVar = this.f1186y;
        this.f46956toq = yzVar;
        this.f46958zy = yzVar;
        this.f1184q = yzVar;
        this.f1182n = yzVar;
        this.f1180g = yzVar;
        this.f46953f7l8 = yzVar;
    }

    /* JADX INFO: renamed from: q */
    private static yz m716q(Context context, ld6 ld6Var, int i2) {
        ColorStateList colorStateListM632g = ld6Var.m632g(context, i2);
        if (colorStateListM632g == null) {
            return null;
        }
        yz yzVar = new yz();
        yzVar.f1221q = true;
        yzVar.f1220k = colorStateListM632g;
        return yzVar;
    }

    /* JADX INFO: renamed from: t */
    private void m717t(int i2, float f2) {
        this.f1185s.m619z(i2, f2);
    }

    /* JADX INFO: renamed from: z */
    private void m718z(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1181k.getCompoundDrawablesRelative();
            TextView textView = this.f1181k;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
            return;
        }
        if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative2 = this.f1181k.getCompoundDrawablesRelative();
        Drawable drawable7 = compoundDrawablesRelative2[0];
        if (drawable7 != null || compoundDrawablesRelative2[2] != null) {
            TextView textView2 = this.f1181k;
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative2[1];
            }
            Drawable drawable8 = compoundDrawablesRelative2[2];
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative2[3];
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
            return;
        }
        Drawable[] compoundDrawables = this.f1181k.getCompoundDrawables();
        TextView textView3 = this.f1181k;
        if (drawable == null) {
            drawable = compoundDrawables[0];
        }
        if (drawable2 == null) {
            drawable2 = compoundDrawables[1];
        }
        if (drawable3 == null) {
            drawable3 = compoundDrawables[2];
        }
        if (drawable4 == null) {
            drawable4 = compoundDrawables[3];
        }
        textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }

    void cdj(Context context, int i2) {
        String strNi7;
        C0184b c0184bA9 = C0184b.a9(context, i2, C7397k.qrj.yh8z);
        int i3 = C7397k.qrj.w6w4;
        if (c0184bA9.mcp(i3)) {
            t8r(c0184bA9.m547k(i3, false));
        }
        int i4 = C7397k.qrj.lm5;
        if (c0184bA9.mcp(i4) && c0184bA9.f7l8(i4, -1) == 0) {
            this.f1181k.setTextSize(0, 0.0f);
        }
        mcp(context, c0184bA9);
        int i5 = C7397k.qrj.p68f;
        if (c0184bA9.mcp(i5) && (strNi7 = c0184bA9.ni7(i5)) != null) {
            this.f1181k.setFontVariationSettings(strNi7);
        }
        c0184bA9.d3();
        Typeface typeface = this.f46957x2;
        if (typeface != null) {
            this.f1181k.setTypeface(typeface, this.f1183p);
        }
    }

    int f7l8() {
        return this.f1185s.x2();
    }

    void fn3e(@zy.lvui int[] iArr, int i2) throws IllegalArgumentException {
        this.f1185s.zurt(iArr, i2);
    }

    void fu4(@zy.dd PorterDuff.Mode mode) {
        if (this.f1186y == null) {
            this.f1186y = new yz();
        }
        yz yzVar = this.f1186y;
        yzVar.f46977toq = mode;
        yzVar.f46978zy = mode != null;
        o1t();
    }

    /* JADX INFO: renamed from: g */
    int m719g() {
        return this.f1185s.ld6();
    }

    /* JADX INFO: renamed from: h */
    void m720h() {
        toq();
    }

    /* JADX INFO: renamed from: i */
    void m721i(int i2, int i3, int i4, int i5) throws IllegalArgumentException {
        this.f1185s.fn3e(i2, i3, i4, i5);
    }

    void ki(@zy.lvui TextView textView, @zy.dd InputConnection inputConnection, @zy.lvui EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        C0697n.m3329p(editorInfo, textView.getText());
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    void kja0(boolean z2, int i2, int i3, int i4, int i5) {
        if (androidx.core.widget.toq.f50989toq) {
            return;
        }
        zy();
    }

    @zy.dd
    PorterDuff.Mode ld6() {
        yz yzVar = this.f1186y;
        if (yzVar != null) {
            return yzVar.f46977toq;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    int m722n() {
        return this.f1185s.m618p();
    }

    void n7h(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f46955qrj) {
            this.f46957x2 = typeface;
            TextView textView = weakReference.get();
            if (textView != null) {
                if (C0683f.zsr0(textView)) {
                    textView.post(new toq(textView, typeface, this.f1183p));
                } else {
                    textView.setTypeface(typeface, this.f1183p);
                }
            }
        }
    }

    void ni7(@zy.dd ColorStateList colorStateList) {
        if (this.f1186y == null) {
            this.f1186y = new yz();
        }
        yz yzVar = this.f1186y;
        yzVar.f1220k = colorStateList;
        yzVar.f1221q = colorStateList != null;
        o1t();
    }

    @zy.dd
    /* JADX INFO: renamed from: p */
    ColorStateList m723p() {
        yz yzVar = this.f1186y;
        if (yzVar != null) {
            return yzVar.f1220k;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0101  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void qrj(@zy.dd android.util.AttributeSet r19, int r20) {
        /*
            Method dump skipped, instruction units count: 608
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0220t.qrj(android.util.AttributeSet, int):void");
    }

    /* JADX INFO: renamed from: s */
    int m724s() {
        return this.f1185s.n7h();
    }

    void t8r(boolean z2) {
        this.f1181k.setAllCaps(z2);
    }

    void toq() {
        if (this.f46956toq != null || this.f46958zy != null || this.f1184q != null || this.f1182n != null) {
            Drawable[] compoundDrawables = this.f1181k.getCompoundDrawables();
            m715k(compoundDrawables[0], this.f46956toq);
            m715k(compoundDrawables[1], this.f46958zy);
            m715k(compoundDrawables[2], this.f1184q);
            m715k(compoundDrawables[3], this.f1182n);
        }
        if (this.f1180g == null && this.f46953f7l8 == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1181k.getCompoundDrawablesRelative();
        m715k(compoundDrawablesRelative[0], this.f1180g);
        m715k(compoundDrawablesRelative[2], this.f46953f7l8);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    void wvg(int i2, float f2) {
        if (androidx.core.widget.toq.f50989toq || x2()) {
            return;
        }
        m717t(i2, f2);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    boolean x2() {
        return this.f1185s.t8r();
    }

    /* JADX INFO: renamed from: y */
    int[] m725y() {
        return this.f1185s.qrj();
    }

    void zurt(int i2) {
        this.f1185s.ni7(i2);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    void zy() {
        this.f1185s.toq();
    }
}

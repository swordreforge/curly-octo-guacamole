package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityRecord;
import java.util.List;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.view.accessibility.i */
/* JADX INFO: compiled from: AccessibilityRecordCompat.java */
/* JADX INFO: loaded from: classes.dex */
public class C0654i {

    /* JADX INFO: renamed from: k */
    private final AccessibilityRecord f3913k;

    /* JADX INFO: renamed from: androidx.core.view.accessibility.i$k */
    /* JADX INFO: compiled from: AccessibilityRecordCompat.java */
    @hyr(15)
    static class k {
        private k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static int m3035k(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: q */
        static void m3036q(AccessibilityRecord accessibilityRecord, int i2) {
            accessibilityRecord.setMaxScrollY(i2);
        }

        @InterfaceC7830i
        static int toq(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        @InterfaceC7830i
        static void zy(AccessibilityRecord accessibilityRecord, int i2) {
            accessibilityRecord.setMaxScrollX(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.accessibility.i$toq */
    /* JADX INFO: compiled from: AccessibilityRecordCompat.java */
    @hyr(16)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static void m3037k(AccessibilityRecord accessibilityRecord, View view, int i2) {
            accessibilityRecord.setSource(view, i2);
        }
    }

    @Deprecated
    public C0654i(Object obj) {
        this.f3913k = (AccessibilityRecord) obj;
    }

    @Deprecated
    public static C0654i o1t() {
        return new C0654i(AccessibilityRecord.obtain());
    }

    /* JADX INFO: renamed from: p */
    public static int m3019p(@lvui AccessibilityRecord accessibilityRecord) {
        return k.m3035k(accessibilityRecord);
    }

    /* JADX INFO: renamed from: r */
    public static void m3020r(@lvui AccessibilityRecord accessibilityRecord, int i2) {
        k.zy(accessibilityRecord, i2);
    }

    public static void vyq(@lvui AccessibilityRecord accessibilityRecord, @dd View view, int i2) {
        toq.m3037k(accessibilityRecord, view, i2);
    }

    @Deprecated
    public static C0654i wvg(C0654i c0654i) {
        return new C0654i(AccessibilityRecord.obtain(c0654i.f3913k));
    }

    public static int x2(@lvui AccessibilityRecord accessibilityRecord) {
        return k.toq(accessibilityRecord);
    }

    public static void x9kr(@lvui AccessibilityRecord accessibilityRecord, int i2) {
        k.m3036q(accessibilityRecord, i2);
    }

    @Deprecated
    public void a9(boolean z2) {
        this.f3913k.setChecked(z2);
    }

    @Deprecated
    /* JADX INFO: renamed from: c */
    public void m3021c(boolean z2) {
        this.f3913k.setScrollable(z2);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public ki cdj() {
        return ki.ew(this.f3913k.getSource());
    }

    @Deprecated
    public void d2ok(int i2) {
        this.f3913k.setItemCount(i2);
    }

    @Deprecated
    public void d3(boolean z2) {
        this.f3913k.setEnabled(z2);
    }

    @Deprecated
    public void dd(int i2) {
        x9kr(this.f3913k, i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: e */
    public void m3022e(int i2) {
        this.f3913k.setToIndex(i2);
    }

    @Deprecated
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0654i)) {
            return false;
        }
        C0654i c0654i = (C0654i) obj;
        AccessibilityRecord accessibilityRecord = this.f3913k;
        return accessibilityRecord == null ? c0654i.f3913k == null : accessibilityRecord.equals(c0654i.f3913k);
    }

    @Deprecated
    public void eqxt(boolean z2) {
        this.f3913k.setFullScreen(z2);
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public void m3023f(int i2) {
        this.f3913k.setScrollY(i2);
    }

    @Deprecated
    public Object f7l8() {
        return this.f3913k;
    }

    @Deprecated
    public boolean fn3e() {
        return this.f3913k.isChecked();
    }

    @Deprecated
    public void fti(CharSequence charSequence) {
        this.f3913k.setClassName(charSequence);
    }

    @Deprecated
    public boolean fu4() {
        return this.f3913k.isPassword();
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public int m3024g() {
        return this.f3913k.getFromIndex();
    }

    @Deprecated
    public void gvn7(int i2) {
        this.f3913k.setCurrentItemIndex(i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public int m3025h() {
        return this.f3913k.getScrollY();
    }

    @Deprecated
    public int hashCode() {
        AccessibilityRecord accessibilityRecord = this.f3913k;
        if (accessibilityRecord == null) {
            return 0;
        }
        return accessibilityRecord.hashCode();
    }

    @Deprecated
    public void hyr(int i2) {
        this.f3913k.setScrollX(i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: i */
    public int m3026i() {
        return this.f3913k.getWindowId();
    }

    @Deprecated
    public void jk(CharSequence charSequence) {
        this.f3913k.setBeforeText(charSequence);
    }

    @Deprecated
    public void jp0y(CharSequence charSequence) {
        this.f3913k.setContentDescription(charSequence);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public int m3027k() {
        return this.f3913k.getAddedCount();
    }

    @Deprecated
    public List<CharSequence> ki() {
        return this.f3913k.getText();
    }

    @Deprecated
    public int kja0() {
        return this.f3913k.getScrollX();
    }

    @Deprecated
    /* JADX INFO: renamed from: l */
    public void m3028l(boolean z2) {
        this.f3913k.setPassword(z2);
    }

    @Deprecated
    public int ld6() {
        return x2(this.f3913k);
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @Deprecated
    public void lrht(View view) {
        this.f3913k.setSource(view);
    }

    @Deprecated
    public void lvui(int i2) {
        m3020r(this.f3913k, i2);
    }

    @Deprecated
    public void mcp(int i2) {
        this.f3913k.setAddedCount(i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public int m3029n() {
        return this.f3913k.getCurrentItemIndex();
    }

    @Deprecated
    public void n5r1(int i2) {
        this.f3913k.setRemovedCount(i2);
    }

    @Deprecated
    public int n7h() {
        return this.f3913k.getRemovedCount();
    }

    @Deprecated
    public void ncyb(Parcelable parcelable) {
        this.f3913k.setParcelableData(parcelable);
    }

    @Deprecated
    public boolean ni7() {
        return this.f3913k.isFullScreen();
    }

    @Deprecated
    public void oc(int i2) {
        this.f3913k.setFromIndex(i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: q */
    public CharSequence m3030q() {
        return this.f3913k.getContentDescription();
    }

    @Deprecated
    public Parcelable qrj() {
        return this.f3913k.getParcelableData();
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public int m3031s() {
        return m3019p(this.f3913k);
    }

    @Deprecated
    /* JADX INFO: renamed from: t */
    public void m3032t() {
        this.f3913k.recycle();
    }

    @Deprecated
    public int t8r() {
        return this.f3913k.getToIndex();
    }

    @Deprecated
    public CharSequence toq() {
        return this.f3913k.getBeforeText();
    }

    @Deprecated
    public void uv6(View view, int i2) {
        vyq(this.f3913k, view, i2);
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public int m3033y() {
        return this.f3913k.getItemCount();
    }

    @Deprecated
    /* JADX INFO: renamed from: z */
    public boolean m3034z() {
        return this.f3913k.isScrollable();
    }

    @Deprecated
    public boolean zurt() {
        return this.f3913k.isEnabled();
    }

    @Deprecated
    public CharSequence zy() {
        return this.f3913k.getClassName();
    }
}

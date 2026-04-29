package androidx.preference;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.preference.fn3e;
import p023g.C6045k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public abstract class DialogPreference extends Preference {
    private CharSequence aj;
    private CharSequence ar;
    private int bc;
    private CharSequence be;
    private Drawable bs;
    private CharSequence k0;

    /* JADX INFO: renamed from: androidx.preference.DialogPreference$k */
    public interface InterfaceC0987k {
        @dd
        <T extends Preference> T findPreference(@lvui CharSequence charSequence);
    }

    public DialogPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, fn3e.ld6.f51863ld6, i2, i3);
        String strKja0 = androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51836fn3e, fn3e.ld6.f51911x2);
        this.be = strKja0;
        if (strKja0 == null) {
            this.be = lvui();
        }
        this.aj = androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f5495i, fn3e.ld6.f51889qrj);
        this.bs = androidx.core.content.res.kja0.zy(typedArrayObtainStyledAttributes, fn3e.ld6.f51860ki, fn3e.ld6.f51875n7h);
        this.k0 = androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51878ni7, fn3e.ld6.f51861kja0);
        this.ar = androidx.core.content.res.kja0.kja0(typedArrayObtainStyledAttributes, fn3e.ld6.f51923zurt, fn3e.ld6.f5494h);
        this.bc = androidx.core.content.res.kja0.n7h(typedArrayObtainStyledAttributes, fn3e.ld6.f51894t8r, fn3e.ld6.f51822cdj, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    @dd
    public Drawable cv06() {
        return this.bs;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m28245do(int i2) {
        ukdy(x2().getString(i2));
    }

    public void ebn(int i2) {
        pc(x2().getString(i2));
    }

    public int h7am() {
        return this.bc;
    }

    public void ij(int i2) {
        nsb(x2().getString(i2));
    }

    public void ixz(int i2) {
        this.bc = i2;
    }

    @dd
    public CharSequence jbh() {
        return this.ar;
    }

    @Override // androidx.preference.Preference
    /* JADX INFO: renamed from: m */
    protected void mo4639m() {
        gvn7().d3(this);
    }

    @dd
    public CharSequence mbx() {
        return this.be;
    }

    public void n2t(@dd CharSequence charSequence) {
        this.k0 = charSequence;
    }

    public void nsb(@dd CharSequence charSequence) {
        this.ar = charSequence;
    }

    public void pc(@dd CharSequence charSequence) {
        this.be = charSequence;
    }

    public void uc(int i2) {
        this.bs = C6045k.toq(x2(), i2);
    }

    public void ukdy(@dd CharSequence charSequence) {
        this.aj = charSequence;
    }

    @dd
    public CharSequence vep5() {
        return this.aj;
    }

    public void wx16(@dd Drawable drawable) {
        this.bs = drawable;
    }

    @dd
    public CharSequence yl() {
        return this.k0;
    }

    public void zwy(int i2) {
        n2t(x2().getString(i2));
    }

    public DialogPreference(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public DialogPreference(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, androidx.core.content.res.kja0.m2303k(context, fn3e.C1008k.f51789ld6, R.attr.dialogPreferenceStyle));
    }

    public DialogPreference(@lvui Context context) {
        this(context, null);
    }
}

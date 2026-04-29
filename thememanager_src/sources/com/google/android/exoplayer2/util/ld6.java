package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.xwq3;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Locale;

/* JADX INFO: compiled from: DebugTextViewHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 implements gc3c.InterfaceC3440y, Runnable {

    /* JADX INFO: renamed from: g */
    private static final int f23224g = 1000;

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.t8r f23225k;

    /* JADX INFO: renamed from: n */
    private boolean f23226n;

    /* JADX INFO: renamed from: q */
    private final TextView f23227q;

    public ld6(com.google.android.exoplayer2.t8r t8rVar, TextView textView) {
        C3844k.m13629k(t8rVar.g1() == Looper.getMainLooper());
        this.f23225k = t8rVar;
        this.f23227q = textView;
    }

    private static String f7l8(com.google.android.exoplayer2.decoder.f7l8 f7l8Var) {
        if (f7l8Var == null) {
            return "";
        }
        f7l8Var.zy();
        int i2 = f7l8Var.f19561q;
        int i3 = f7l8Var.f19557g;
        int i4 = f7l8Var.f19559n;
        int i5 = f7l8Var.f63552f7l8;
        int i6 = f7l8Var.f19563y;
        int i7 = f7l8Var.f19562s;
        StringBuilder sb = new StringBuilder(93);
        sb.append(" sib:");
        sb.append(i2);
        sb.append(" sb:");
        sb.append(i3);
        sb.append(" rb:");
        sb.append(i4);
        sb.append(" db:");
        sb.append(i5);
        sb.append(" mcdb:");
        sb.append(i6);
        sb.append(" dk:");
        sb.append(i7);
        return sb.toString();
    }

    private static String t8r(float f2) {
        if (f2 == -1.0f || f2 == 1.0f) {
            return "";
        }
        String strValueOf = String.valueOf(String.format(Locale.US, "%.02f", Float.valueOf(f2)));
        return strValueOf.length() != 0 ? " par:".concat(strValueOf) : new String(" par:");
    }

    private static String zurt(long j2, int i2) {
        return i2 == 0 ? "N/A" : String.valueOf((long) (j2 / ((double) i2)));
    }

    protected String a9() {
        xwq3 xwq3VarY2 = this.f23225k.y2();
        com.google.android.exoplayer2.decoder.f7l8 f7l8VarZwy = this.f23225k.zwy();
        if (xwq3VarY2 == null || f7l8VarZwy == null) {
            return "";
        }
        String str = xwq3VarY2.f23682r;
        String str2 = xwq3VarY2.f23675k;
        int i2 = xwq3VarY2.f23674j;
        int i3 = xwq3VarY2.f23679o;
        String strT8r = t8r(xwq3VarY2.f23665a);
        String strF7l8 = f7l8(f7l8VarZwy);
        String strZurt = zurt(f7l8VarZwy.f19560p, f7l8VarZwy.f63553ld6);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39 + String.valueOf(str2).length() + String.valueOf(strT8r).length() + String.valueOf(strF7l8).length() + String.valueOf(strZurt).length());
        sb.append("\n");
        sb.append(str);
        sb.append("(id:");
        sb.append(str2);
        sb.append(" r:");
        sb.append(i2);
        sb.append(AnimatedProperty.PROPERTY_NAME_X);
        sb.append(i3);
        sb.append(strT8r);
        sb.append(strF7l8);
        sb.append(" vfpo: ");
        sb.append(strZurt);
        sb.append(")");
        return sb.toString();
    }

    public final void fti() {
        if (this.f23226n) {
            return;
        }
        this.f23226n = true;
        this.f23225k.ngy(this);
        gvn7();
    }

    @SuppressLint({"SetTextI18n"})
    protected final void gvn7() {
        this.f23227q.setText(zy());
        this.f23227q.removeCallbacks(this);
        this.f23227q.postDelayed(this, 1000L);
    }

    /* JADX INFO: renamed from: i */
    protected String m13651i() {
        int playbackState = this.f23225k.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.f23225k.yqrt()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : "ended" : "ready" : "buffering" : "idle", Integer.valueOf(this.f23225k.lw()));
    }

    public final void jp0y() {
        if (this.f23226n) {
            this.f23226n = false;
            this.f23225k.mo12081e(this);
            this.f23227q.removeCallbacks(this);
        }
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public final void ld6(int i2) {
        gvn7();
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    /* JADX INFO: renamed from: n */
    public final void mo11370n(gc3c.x2 x2Var, gc3c.x2 x2Var2, int i2) {
        gvn7();
    }

    @Override // java.lang.Runnable
    public final void run() {
        gvn7();
    }

    protected String toq() {
        xwq3 xwq3VarPjz9 = this.f23225k.pjz9();
        com.google.android.exoplayer2.decoder.f7l8 f7l8VarU38j = this.f23225k.u38j();
        if (xwq3VarPjz9 == null || f7l8VarU38j == null) {
            return "";
        }
        String str = xwq3VarPjz9.f23682r;
        String str2 = xwq3VarPjz9.f23675k;
        int i2 = xwq3VarPjz9.f23668d;
        int i3 = xwq3VarPjz9.f23686v;
        String strF7l8 = f7l8(f7l8VarU38j);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 36 + String.valueOf(str2).length() + String.valueOf(strF7l8).length());
        sb.append("\n");
        sb.append(str);
        sb.append("(id:");
        sb.append(str2);
        sb.append(" hz:");
        sb.append(i2);
        sb.append(" ch:");
        sb.append(i3);
        sb.append(strF7l8);
        sb.append(")");
        return sb.toString();
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y, com.google.android.exoplayer2.gc3c.InterfaceC3434g
    public final void wvg(boolean z2, int i2) {
        gvn7();
    }

    protected String zy() {
        String strM13651i = m13651i();
        String strA9 = a9();
        String qVar = toq();
        StringBuilder sb = new StringBuilder(String.valueOf(strM13651i).length() + String.valueOf(strA9).length() + String.valueOf(qVar).length());
        sb.append(strM13651i);
        sb.append(strA9);
        sb.append(qVar);
        return sb.toString();
    }
}

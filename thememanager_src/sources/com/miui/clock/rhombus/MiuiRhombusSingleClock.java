package com.miui.clock.rhombus;

import android.content.Context;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0498q;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiClockNumberView;
import com.miui.clock.module.AbstractC5071k;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.C5070i;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.module.fn3e;
import com.miui.clock.module.zurt;
import gcp.C6062n;
import gcp.ld6;
import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class MiuiRhombusSingleClock extends MiuiRhombusBase {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private ImageView f72020ab;
    private float an;
    private C5092n bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private View f72021bo;
    private fn3e bp;
    private zurt bv;

    /* JADX INFO: renamed from: d */
    private View f29280d;
    private boolean id;

    /* JADX INFO: renamed from: u */
    private View f29281u;

    /* JADX INFO: renamed from: v */
    private ViewGroup f29282v;

    /* JADX INFO: renamed from: w */
    private View f29283w;

    /* JADX INFO: renamed from: com.miui.clock.rhombus.MiuiRhombusSingleClock$k */
    static /* synthetic */ class C5088k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f29284k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f29284k = iArr;
            try {
                iArr[EnumC5072n.COLON1.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29284k[EnumC5072n.COLON2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29284k[EnumC5072n.FULL_COLON.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29284k[EnumC5072n.FULL_HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29284k[EnumC5072n.FULL_MINUTE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public MiuiRhombusSingleClock(Context context) {
        super(context);
        this.an = -1.0f;
        this.id = true;
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        int i2 = C5088k.f29284k[enumC5072n.ordinal()];
        return i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? super.f7l8(enumC5072n) : this.f29283w : this.f29280d : this.f72020ab : this.f72021bo : this.f29281u;
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void fti() {
        String str;
        super.fti();
        if (this.bb == null) {
            return;
        }
        this.f29282v.setContentDescription(miuix.pickerwidget.date.zy.m26303k(this.f29257k, System.currentTimeMillis(), (this.f29253g ? 32 : 16) | 12 | 64));
        this.bb.eqxt(this.f29257k);
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f29282v.getLayoutParams();
        float f2 = 1.0f;
        int i2 = getResources().getConfiguration().orientation;
        if (C6062n.f35046q && i2 == 1) {
            f2 = 1.2f;
        } else if (C6062n.qrj() && !C6062n.m22322s(this.f29257k)) {
            f2 = 0.8f;
        }
        float f3 = this.an;
        if (f3 > 0.0f) {
            f2 *= f3;
        }
        Log.d("MiuiClock", "radio = " + f2 + ", mDeviceScale = " + this.an);
        layoutParams.width = (int) (((float) m17737k(C5049g.q.j1s)) * f2);
        layoutParams.height = (int) (((float) m17737k(C5049g.q.wr)) * f2);
        this.f29280d.getLayoutParams().height = (int) (((float) m17737k(C5049g.q.le9)) * f2);
        this.f29283w.getLayoutParams().height = (int) (m17737k(r3) * f2);
        int[] iArr = this.f29268z;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        int[] iArr2 = this.f29255i.ld6()[i3][i4];
        int[] iArr3 = this.f29255i.ki()[i5][i6];
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f29266t.getLayoutParams();
        FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f29264r.getLayoutParams();
        FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) this.f29258l.getLayoutParams();
        FrameLayout.LayoutParams layoutParams5 = (FrameLayout.LayoutParams) this.f29252f.getLayoutParams();
        if (this.f29255i.mo17701p() == AbstractC5071k.k.Copperplate) {
            this.f29264r.setVisibility(8);
            this.f29252f.setVisibility(8);
            layoutParams2.width = -1;
            layoutParams2.height = -1;
            layoutParams2.topMargin = 0;
            layoutParams2.setMarginEnd(0);
            layoutParams4.width = -1;
            layoutParams4.height = -1;
            layoutParams4.topMargin = 0;
            layoutParams4.setMarginEnd(0);
            this.f29266t.setLayoutParams(layoutParams2);
            this.f29258l.setLayoutParams(layoutParams4);
            if (this.bp == null) {
                this.bp = new fn3e();
            }
            if (this.bv == null) {
                this.bv = new zurt();
            }
            this.f29266t.qrj(this.bp).m17546s(0.0f).kja0(f2).ld6(0, 0).m17545p(0, 0).n7h((i3 * 10) + i4).m17543h(this.bb.m17754r()).m17544k();
            this.f29258l.qrj(this.bv).m17546s(0.0f).kja0(f2).ld6(0, 0).m17545p(0, 0).n7h((i5 * 10) + i6).m17543h(this.bb.dd()).m17544k();
            str = "MiuiClock";
        } else if (this.f29255i.mo17710k()) {
            this.f29264r.setVisibility(0);
            this.f29252f.setVisibility(0);
            int i7 = this.f29255i.kja0()[i3];
            int i8 = this.f29255i.n7h()[i3];
            str = "MiuiClock";
            double radians = Math.toRadians(this.f29255i.cdj());
            double d2 = i7;
            double d4 = i8;
            double dCos = (Math.cos(radians) * d2) + (Math.sin(radians) * d4);
            double dCos2 = (d4 * Math.cos(radians)) + (d2 * Math.sin(radians));
            float f4 = this.f29262p;
            double d5 = f2;
            layoutParams2.width = (int) (((double) f4) * dCos * d5);
            layoutParams2.height = (int) (((double) f4) * dCos2 * d5);
            layoutParams2.setMarginEnd((int) (iArr2[0] * f4 * f2));
            layoutParams2.topMargin = (int) (iArr2[1] * this.f29262p * f2);
            double d6 = this.f29255i.kja0()[i4];
            double d7 = this.f29255i.n7h()[i4];
            double dCos3 = (Math.cos(radians) * d6) + (Math.sin(radians) * d7);
            double dCos4 = (d7 * Math.cos(radians)) + (d6 * Math.sin(radians));
            float f5 = this.f29262p;
            layoutParams3.width = (int) (((double) f5) * dCos3 * d5);
            layoutParams3.height = (int) (((double) f5) * dCos4 * d5);
            layoutParams3.setMarginStart((int) (iArr2[2] * f5 * f2));
            layoutParams3.topMargin = (int) (iArr2[3] * this.f29262p * f2);
            double d8 = this.f29255i.kja0()[i5];
            double d9 = this.f29255i.n7h()[i5];
            double dCos5 = (Math.cos(radians) * d8) + (Math.sin(radians) * d9);
            double dCos6 = (d9 * Math.cos(radians)) + (d8 * Math.sin(radians));
            float f6 = this.f29262p;
            layoutParams4.width = (int) (((double) f6) * dCos5 * d5);
            layoutParams4.height = (int) (((double) f6) * dCos6 * d5);
            layoutParams4.setMarginEnd((int) (iArr3[0] * f6 * f2));
            layoutParams4.topMargin = (int) (iArr3[1] * this.f29262p * f2);
            double d10 = this.f29255i.kja0()[i6];
            double d11 = this.f29255i.n7h()[i6];
            double dCos7 = (Math.cos(radians) * d10) + (Math.sin(radians) * d11);
            double dCos8 = (d11 * Math.cos(radians)) + (d10 * Math.sin(radians));
            float f7 = this.f29262p;
            layoutParams5.width = (int) (((double) f7) * dCos7 * d5);
            layoutParams5.height = (int) (((double) f7) * dCos8 * d5);
            layoutParams5.setMarginStart((int) (iArr3[2] * f7 * f2));
            layoutParams5.topMargin = (int) (iArr3[3] * this.f29262p * f2);
            this.f29266t.setLayoutParams(layoutParams2);
            this.f29264r.setLayoutParams(layoutParams3);
            this.f29258l.setLayoutParams(layoutParams4);
            this.f29252f.setLayoutParams(layoutParams5);
            float[] fArr = this.f29255i.x2()[i3][i4];
            float[] fArr2 = this.f29255i.t8r()[i5][i6];
            MiuiClockNumberView miuiClockNumberViewN7h = this.f29266t.qrj(this.f29255i).n7h(i3);
            float f8 = this.f29262p;
            miuiClockNumberViewN7h.ld6((int) (dCos * 0.5d * ((double) f8) * d5), (int) (dCos2 * 0.5d * ((double) f8) * d5)).m17543h(this.bb.m17754r()).m17546s(fArr[0]).kja0(f2).m17545p(0, 0).m17544k();
            MiuiClockNumberView miuiClockNumberViewN7h2 = this.f29264r.qrj(this.f29255i).n7h(i4);
            float f9 = this.f29262p;
            miuiClockNumberViewN7h2.ld6((int) (dCos3 * 0.5d * ((double) f9) * d5), (int) (dCos4 * 0.5d * ((double) f9) * d5)).m17543h(this.bb.m17754r()).m17546s(fArr[1]).kja0(f2).m17545p(0, 0).m17544k();
            MiuiClockNumberView miuiClockNumberViewN7h3 = this.f29258l.qrj(this.f29255i).n7h(i5);
            float f10 = this.f29262p;
            miuiClockNumberViewN7h3.ld6((int) (dCos5 * 0.5d * ((double) f10) * d5), (int) (dCos6 * 0.5d * ((double) f10) * d5)).m17543h(this.bb.dd()).m17546s(fArr2[0]).kja0(f2).m17545p(0, 0).m17544k();
            MiuiClockNumberView miuiClockNumberViewN7h4 = this.f29252f.qrj(this.f29255i).n7h(i6);
            float f11 = this.f29262p;
            miuiClockNumberViewN7h4.ld6((int) (dCos7 * 0.5d * ((double) f11) * d5), (int) (dCos8 * 0.5d * ((double) f11) * d5)).m17543h(this.bb.dd()).m17546s(fArr2[1]).kja0(f2).m17545p(0, 0).m17544k();
        } else {
            str = "MiuiClock";
            this.f29264r.setVisibility(0);
            this.f29252f.setVisibility(0);
            layoutParams2.width = -2;
            float fQrj = this.f29255i.qrj();
            float f12 = this.f29262p;
            layoutParams2.height = (int) (fQrj * f12 * f2);
            layoutParams2.topMargin = (int) (iArr2[1] * f12 * f2);
            layoutParams2.setMarginEnd((int) (iArr2[0] * f12 * f2));
            layoutParams3.width = -2;
            float fQrj2 = this.f29255i.qrj();
            float f13 = this.f29262p;
            layoutParams3.height = (int) (fQrj2 * f13 * f2);
            layoutParams3.setMarginStart((int) (iArr2[2] * f13 * f2));
            layoutParams3.topMargin = (int) (iArr2[3] * this.f29262p * f2);
            layoutParams4.width = -2;
            float fQrj3 = this.f29255i.qrj();
            float f14 = this.f29262p;
            layoutParams4.height = (int) (fQrj3 * f14 * f2);
            layoutParams4.setMarginEnd((int) (iArr3[0] * f14 * f2));
            layoutParams4.topMargin = (int) (iArr3[1] * this.f29262p * f2);
            layoutParams5.width = -2;
            float fQrj4 = this.f29255i.qrj();
            float f15 = this.f29262p;
            layoutParams5.height = (int) (fQrj4 * f15 * f2);
            layoutParams5.setMarginStart((int) (iArr3[2] * f15 * f2));
            layoutParams5.topMargin = (int) (iArr3[3] * this.f29262p * f2);
            this.f29266t.setLayoutParams(layoutParams2);
            this.f29264r.setLayoutParams(layoutParams3);
            this.f29258l.setLayoutParams(layoutParams4);
            this.f29252f.setLayoutParams(layoutParams5);
            this.f29266t.qrj(this.f29255i).m17546s(0.0f).kja0(f2).ld6(0, 0).m17545p(0, 0).n7h(i3).m17543h(this.bb.m17754r()).m17544k();
            this.f29264r.qrj(this.f29255i).m17546s(0.0f).kja0(f2).ld6(0, 0).m17545p(0, 0).n7h(i4).m17543h(this.bb.m17754r()).m17544k();
            this.f29258l.qrj(this.f29255i).m17546s(0.0f).kja0(f2).ld6(0, 0).m17545p(0, 0).n7h(i5).m17543h(this.bb.dd()).m17544k();
            this.f29252f.qrj(this.f29255i).m17546s(0.0f).kja0(f2).ld6(0, 0).m17545p(0, 0).n7h(i6).m17543h(this.bb.dd()).m17544k();
        }
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) this.f29281u.getLayoutParams();
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.f72021bo.getLayoutParams();
        int iMo17703y = (int) (this.f29255i.mo17703y() * this.f29262p * f2);
        ((ViewGroup.MarginLayoutParams) toqVar).width = iMo17703y;
        ((ViewGroup.MarginLayoutParams) toqVar).height = iMo17703y;
        ((ViewGroup.MarginLayoutParams) toqVar2).width = iMo17703y;
        ((ViewGroup.MarginLayoutParams) toqVar2).height = iMo17703y;
        ((ViewGroup.MarginLayoutParams) toqVar2).topMargin = (int) (this.f29255i.mo17699g() * this.f29262p * f2);
        Drawable drawableM2259s = C0498q.m2259s(getContext(), this.f29255i.f7l8());
        if (this.f29255i.mo17701p() != AbstractC5071k.k.SKPupok) {
            this.f29281u.setBackground(ld6.m22315k(drawableM2259s, this.bb.lvui()));
            this.f72021bo.setBackground(ld6.m22315k(drawableM2259s, this.bb.lvui()));
            return;
        }
        if (drawableM2259s instanceof AnimatedVectorDrawable) {
            try {
                VectorDrawable vectorDrawable = (VectorDrawable) AnimatedVectorDrawable.class.getMethod("getVectorDrawable", new Class[0]).invoke(drawableM2259s, new Object[0]);
                if (vectorDrawable != null) {
                    Method declaredMethod = VectorDrawable.class.getDeclaredMethod("getTargetByName", String.class);
                    declaredMethod.setAccessible(true);
                    Object objInvoke = declaredMethod.invoke(vectorDrawable, "_R_G_L_0_G_D_1_P_0");
                    if (objInvoke != null) {
                        Method declaredMethod2 = objInvoke.getClass().getDeclaredMethod("setStrokeColor", Integer.TYPE);
                        declaredMethod2.setAccessible(true);
                        declaredMethod2.invoke(objInvoke, Integer.valueOf(this.bb.lvui()));
                    }
                }
            } catch (Exception e2) {
                Log.e(str, "AnimatedVectorDrawable reflect fail", e2);
            }
        }
        this.f29281u.setBackground(drawableM2259s);
        this.f72021bo.setBackground(drawableM2259s);
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f29255i = new C5070i();
        this.f29281u = findViewById(C5049g.g.f71027n7h);
        this.f72021bo = findViewById(C5049g.g.f71013kja0);
        this.f29282v = (ViewGroup) findViewById(C5049g.g.f70964b3e);
        this.f72020ab = (ImageView) findViewById(C5049g.g.f28947h);
        this.f29280d = findViewById(C5049g.g.f28949j);
        this.f29283w = findViewById(C5049g.g.f70968bo);
        fti();
    }

    @Override // com.miui.clock.zy.n7h
    public void qrj(boolean z2) {
        this.id = !z2;
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        super.setClockPalette(i2, z2, map, z3);
        if (this.bb == null) {
            return;
        }
        fti();
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        super.setClockStyleInfo(abstractC5074q);
        C5092n c5092n = (C5092n) abstractC5074q;
        this.bb = c5092n;
        setClockStyle(c5092n.x9kr());
        fti();
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void setMagazineInfoVisible(boolean z2) {
    }

    @Override // com.miui.clock.rhombus.MiuiRhombusBase, com.miui.clock.zy.n7h
    public void setScaleRatio(float f2) {
        super.setScaleRatio(f2);
        this.an = f2;
        fti();
    }

    public MiuiRhombusSingleClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.an = -1.0f;
        this.id = true;
    }
}

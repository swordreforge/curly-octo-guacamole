package com.miui.clock.smartframe;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiGalleryBaseClock;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.EnumC5072n;
import gcp.C6062n;
import gcp.C6064q;
import java.util.Map;
import miuix.pickerwidget.date.C7230k;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MiuiSmartFrameBase extends MiuiGalleryBaseClock {
    protected TextView ad;
    protected TextView aj;
    protected TextView am;
    private Paint ar;
    protected TextView ay;
    protected int[] bc;
    protected TextView be;
    protected TextView bs;
    protected AbstractC5096k bu;
    protected View k0;

    /* JADX INFO: renamed from: com.miui.clock.smartframe.MiuiSmartFrameBase$k */
    static /* synthetic */ class C5095k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f29312k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f29312k = iArr;
            try {
                iArr[EnumC5072n.FULL_DATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29312k[EnumC5072n.FULL_WEEK.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29312k[EnumC5072n.HOUR1.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29312k[EnumC5072n.HOUR2.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29312k[EnumC5072n.MIN1.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29312k[EnumC5072n.MIN2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29312k[EnumC5072n.CLOCK_CONTAINER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public MiuiSmartFrameBase(Context context) {
        super(context);
        this.ar = new Paint();
        this.bc = new int[4];
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        switch (C5095k.f29312k[enumC5072n.ordinal()]) {
            case 1:
                return this.ad;
            case 2:
                return this.am;
            case 3:
                return this.ay;
            case 4:
                return this.be;
            case 5:
                return this.aj;
            case 6:
                return this.bs;
            case 7:
                return this.k0;
            default:
                return super.f7l8(enumC5072n);
        }
    }

    @Override // com.miui.clock.zy.n7h
    public void fti() {
        if (this.bu == null) {
            return;
        }
        this.as.setTimeInMillis(System.currentTimeMillis());
        String strM22334k = C6064q.m22334k(this.bg ? "HHmm" : "hhmm");
        for (int i2 = 0; i2 < strM22334k.length(); i2++) {
            this.bc[i2] = Integer.parseInt(String.valueOf(strM22334k.charAt(i2)));
        }
        this.k0.setContentDescription(miuix.pickerwidget.date.zy.m26303k(this.bl, System.currentTimeMillis(), (this.bg ? 32 : 16) | 12 | 64));
        this.ay.setText(String.valueOf(this.bc[0]));
        this.be.setText(String.valueOf(this.bc[1]));
        this.aj.setText(String.valueOf(this.bc[2]));
        this.bs.setText(String.valueOf(this.bc[3]));
        C7230k c7230k = this.as;
        Context context = this.bl;
        String str = c7230k.format(context, context.getString(C5049g.s.f71780w831));
        C7230k c7230k2 = this.as;
        Context context2 = this.bl;
        String str2 = c7230k2.format(context2, context2.getString(C5049g.s.f71793z4));
        this.ad.setText(str);
        this.am.setText(str2);
        TextView textView = this.ad;
        C7230k c7230k3 = this.as;
        Context context3 = this.bl;
        textView.setContentDescription(c7230k3.format(context3, context3.getString(C5049g.s.f71744m4)));
    }

    @Override // com.miui.clock.zy.n7h
    public AbstractC5074q getClockStyleInfo() {
        return this.bu;
    }

    @Override // com.miui.clock.zy.n7h
    public int getMagazineColor() {
        AbstractC5096k abstractC5096k = this.bu;
        if (abstractC5096k != null) {
            return gcp.toq.m22345k(abstractC5096k.qrj(), 0.6f);
        }
        return 0;
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationClockBottom() {
        return this.ac ? hb(C5049g.q.crha) : hb(C5049g.q.f1);
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationRelativePosition() {
        return (C6062n.f35046q && getResources().getConfiguration().orientation == 2) ? 2 : 1;
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.ad = (TextView) findViewById(C5049g.g.f28948i);
        this.am = (TextView) findViewById(C5049g.g.f70996gvn7);
        this.ay = (TextView) findViewById(C5049g.g.f28964z);
        this.be = (TextView) findViewById(C5049g.g.f71034o1t);
        this.aj = (TextView) findViewById(C5049g.g.f71008jk);
        this.bs = (TextView) findViewById(C5049g.g.f70962a9);
        this.k0 = findViewById(C5049g.g.f28963y);
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        String str;
        int iQrj;
        int iN7h;
        if (map != null) {
            str = "secondary20=" + map.get("secondary20") + ",secondary97=" + map.get("secondary97") + ",secondary15=" + map.get("secondary15") + ",secondary60=" + map.get("secondary60") + ",tertiary90=" + map.get("tertiary90") + ",secondary20=" + map.get("secondary20");
        } else {
            str = "null";
        }
        Log.d("ClockPalette", "setClockPalette: type = " + i2 + ", textDark = " + z2 + ", palette = " + str);
        AbstractC5096k abstractC5096k = this.bu;
        if (abstractC5096k == null || !abstractC5096k.cdj()) {
            return;
        }
        if (i2 == 1) {
            iQrj = (map == null || map.get("secondary20") == null) ? this.bu.qrj() : map.get("secondary20").intValue();
            iN7h = (map == null || map.get("secondary97") == null) ? this.bu.n7h() : map.get("secondary97").intValue();
        } else if (i2 == 2) {
            iQrj = (map == null || map.get("secondary15") == null) ? this.bu.qrj() : map.get("secondary15").intValue();
            iN7h = (map == null || map.get("secondary60") == null) ? this.bu.n7h() : map.get("secondary60").intValue();
        } else {
            iQrj = (map == null || map.get("tertiary90") == null) ? this.bu.qrj() : map.get("tertiary90").intValue();
            iN7h = (map == null || map.get("secondary20") == null) ? this.bu.n7h() : map.get("secondary20").intValue();
        }
        this.bu.gvn7(iQrj);
        this.bu.d3(iN7h);
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        this.bu = (AbstractC5096k) abstractC5074q;
        fti();
    }

    protected boolean y9n(String str) {
        Rect rect = new Rect();
        this.ar.setTextSize(this.am.getTextSize());
        this.ar.getTextBounds(str, 0, str.length(), rect);
        return ((float) rect.width()) > ((float) hb(C5049g.q.fpn));
    }

    public MiuiSmartFrameBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.ar = new Paint();
        this.bc = new int[4];
    }
}

package com.miui.clock.classic;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import androidx.constraintlayout.widget.C0397q;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiGalleryBaseClock;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.fu4;
import gcp.C6062n;
import gcp.C6066y;
import gcp.f7l8;
import java.util.Map;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ClassicClockBaseView extends MiuiGalleryBaseClock {
    protected ClassicTextAreaView ad;
    protected boolean aj;
    protected C0397q am;
    protected boolean ar;
    protected fu4 ay;
    protected int be;
    protected Map<String, Integer> bs;
    protected boolean k0;

    public ClassicClockBaseView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    protected abstract boolean mo17574b();

    protected void bf2(int i2, int i3) {
        this.am.gvn7(this);
        this.am.b3e(i2, 3, i3);
        this.am.ki(this);
    }

    @Override // com.miui.clock.zy.n7h
    public void fti() {
        this.as.setTimeInMillis(System.currentTimeMillis());
        this.ad.fu4();
    }

    @Override // com.miui.clock.zy.n7h
    public AbstractC5074q getClockStyleInfo() {
        return this.ay;
    }

    @Override // com.miui.clock.zy.n7h
    public int getMagazineColor() {
        fu4 fu4Var = this.ay;
        if (fu4Var != null) {
            return gcp.toq.m22345k(fu4Var.m17726s(), 0.6f);
        }
        return 0;
    }

    @Override // com.miui.clock.zy.n7h
    public int getNotificationClockBottom() {
        return this.ac ? mo17574b() ? hb(C5049g.q.fm) : hb(C5049g.q.l0u) : mo17574b() ? hb(C5049g.q.mc) : hb(C5049g.q.gl8t);
    }

    public void i1(AbstractC5074q abstractC5074q) {
        super.x2();
        if (abstractC5074q == null) {
            return;
        }
        fu4 fu4Var = (fu4) abstractC5074q;
        this.ay = fu4Var;
        this.ad.x2(fu4Var);
    }

    @Override // com.miui.clock.MiuiBaseClock2
    /* JADX INFO: renamed from: j */
    protected void mo17536j(Context context) {
        super.mo17536j(context);
        this.am = new C0397q();
    }

    @Override // com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public void jk(boolean z2) {
        this.ar = z2;
    }

    @Override // com.miui.clock.MiuiBaseClock2
    /* JADX INFO: renamed from: m */
    public void mo17537m(TimeZone timeZone) {
        this.as.setTimeZone(timeZone);
        fti();
    }

    @Override // com.miui.clock.MiuiBaseClock2
    /* JADX INFO: renamed from: o */
    protected void mo17538o() {
        super.mo17538o();
        f7l8.m22299k();
        this.ad.kja0();
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        ClassicTextAreaView classicTextAreaView = (ClassicTextAreaView) findViewById(C5049g.g.f71010jz5);
        this.ad = classicTextAreaView;
        classicTextAreaView.setCalendar(this.as);
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockPalette(int i2, boolean z2, Map<String, Integer> map, boolean z3) {
        String str;
        fu4 fu4Var;
        this.be = i2;
        this.aj = z2;
        this.bs = map;
        this.k0 = z3;
        if (map != null) {
            str = "secondary30=" + map.get("secondary30");
        } else {
            str = "null";
        }
        Log.d("ClockPalette", "setClockPalette: type = " + i2 + ", textDark = " + z2 + ", palette = " + str);
        if (C6062n.x2(this.bl) || (fu4Var = this.ay) == null || !fu4Var.cdj()) {
            return;
        }
        if (C6062n.m22317h(this.bl)) {
            int iQrj = z2 ? (map == null || map.get("neutral-variant30") == null) ? this.ay.qrj() : map.get("neutral-variant30").intValue() : Color.parseColor("#FFABABAB");
            int iIntValue = z2 ? (map == null || map.get("secondary70") == null) ? iQrj : map.get("secondary70").intValue() : Color.parseColor("#FFBEBEBE");
            this.ay.m17727t(iQrj);
            this.ay.fu4(iIntValue);
            this.ay.gvn7(-1);
            this.ay.m17728z(iIntValue);
        } else {
            int iQrj2 = !z2 ? -1 : (map == null || map.get("secondary30") == null) ? this.ay.qrj() : map.get("secondary30").intValue();
            if (AbstractC5074q.m17719h(this.ay.dd())) {
                this.ay.gvn7(C6066y.m22346k(iQrj2));
            } else {
                this.ay.gvn7(iQrj2);
            }
        }
        this.ay.fti(z2 ? (map == null || map.get("secondary30") == null) ? this.ay.qrj() : map.get("secondary30").intValue() : -1);
        i1(this.ay);
    }

    @Override // com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        fu4 fu4Var = (fu4) abstractC5074q;
        this.ay = fu4Var;
        this.ad.x2(fu4Var);
    }

    @Override // com.miui.clock.zy.n7h
    public void setSuperSaveOpen(boolean z2) {
        super.setSuperSaveOpen(z2);
        fu4 fu4Var = this.ay;
        if (fu4Var != null) {
            i1(fu4Var);
        }
    }

    protected float y9n(int i2) {
        return getResources().getDimension(i2) * C6062n.m22318k(getContext());
    }

    public ClassicClockBaseView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClassicClockBaseView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
    }
}

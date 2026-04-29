package com.miui.clock.classic;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0397q;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiTextGlassView;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.module.fu4;
import com.miui.clock.module.toq;
import gcp.C6061k;
import gcp.C6062n;
import gcp.C6064q;

/* JADX INFO: loaded from: classes3.dex */
public class ClassicClockSmallView extends ClassicClockBaseView {
    private MiuiTextGlassView bc;
    private boolean bd;
    private int bu;

    /* JADX INFO: renamed from: com.miui.clock.classic.ClassicClockSmallView$k */
    static /* synthetic */ class C5042k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f28714k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f28714k = iArr;
            try {
                iArr[EnumC5072n.TEXT_AREA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28714k[EnumC5072n.TIME_AREA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ClassicClockSmallView(Context context) {
        super(context);
        this.bd = true;
    }

    /* JADX INFO: renamed from: a */
    private int m17575a(int i2) {
        return hb(i2);
    }

    protected void a98o(fu4 fu4Var) {
        boolean zM17733k = toq.C8026toq.m17733k(fu4Var.d2ok());
        boolean zM17730k = toq.f7l8.m17730k(fu4Var.d2ok());
        boolean zM22350p = gcp.zy.m22350p(this.bl);
        boolean zX2 = gcp.zy.x2(this.bl);
        int iF7l8 = C6064q.f7l8();
        if (zM17733k && !zM22350p) {
            fu4Var.m17706l(ClockBean.getClassicDefaultLine1(this.bl, iF7l8));
        } else {
            if (!zM17730k || zX2) {
                return;
            }
            fu4Var.m17706l(ClockBean.getClassicDefaultLine1(this.bl, iF7l8));
        }
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView
    /* JADX INFO: renamed from: b */
    protected boolean mo17574b() {
        return false;
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        int i2 = C5042k.f28714k[enumC5072n.ordinal()];
        return i2 != 1 ? i2 != 2 ? super.f7l8(enumC5072n) : this.bc : this.ad;
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        this.bc.setText(C6061k.m22310n(this.bl, this.as, this.bg, this.ay.lvui(), true));
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        float fY9n = y9n(C5049g.q.f29028k);
        float fY9n2 = y9n(C5049g.q.f29034q);
        float fY9n3 = y9n(C5049g.q.f71597ncyb);
        return (int) (fY9n3 + (this.ad != null ? r3.getViewHeight() : y9n(C5049g.q.f71595n5r1)) + fY9n + fY9n2 + y9n(C5049g.q.f29035r) + 0.5f);
    }

    @Override // com.miui.clock.MiuiBaseClock2, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int iWidth = C6062n.f7l8(this.bl).width();
        if (this.bu != iWidth) {
            this.bu = iWidth;
            zp();
        }
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.MiuiGalleryBaseClock, android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.bu = C6062n.f7l8(this.bl).width();
        this.bc = (MiuiTextGlassView) findViewById(C5049g.g.f71006ixz);
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.zy.n7h
    public void setClockStyleInfo(AbstractC5074q abstractC5074q) {
        a98o((fu4) abstractC5074q);
        super.setClockStyleInfo(abstractC5074q);
        if (this.bd) {
            this.bd = false;
            zp();
        }
        fti();
    }

    public void zp() {
        C0397q c0397q = new C0397q();
        c0397q.gvn7(this);
        int i2 = C5049g.g.f71010jz5;
        c0397q.b3e(i2, 3, m17575a(C5049g.q.f71597ncyb));
        int i3 = C5049g.q.f29029l;
        c0397q.b3e(i2, 6, m17575a(i3));
        c0397q.b3e(i2, 7, m17575a(i3));
        int i4 = C5049g.g.f28950k;
        c0397q.b3e(i4, 3, m17575a(C5049g.q.f29028k));
        int i5 = C5049g.g.f71006ixz;
        int i6 = C5049g.q.f29022e;
        c0397q.b3e(i5, 6, m17575a(i6));
        c0397q.b3e(i5, 7, m17575a(i6));
        c0397q.b3e(i5, 4, m17575a(C5049g.q.f71635toq));
        int i7 = C5049g.g.f71031nmn5;
        c0397q.b3e(i7, 6, m17575a(i3));
        c0397q.b3e(i7, 7, m17575a(i3));
        c0397q.b3e(i7, 3, m17575a(C5049g.q.f71513d3));
        c0397q.x9kr(i4, m17575a(C5049g.q.f29034q));
        c0397q.ki(this);
        this.ad.m17611h();
        fu4 fu4Var = this.ay;
        if (fu4Var != null) {
            C6061k.zurt(this.bc, fu4Var);
        }
    }

    public ClassicClockSmallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bd = true;
    }

    public ClassicClockSmallView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.bd = true;
    }
}

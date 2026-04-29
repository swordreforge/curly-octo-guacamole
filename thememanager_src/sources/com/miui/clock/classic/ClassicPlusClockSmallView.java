package com.miui.clock.classic;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0397q;
import com.miui.clock.C5049g;
import com.miui.clock.MiuiTextGlassView;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.EnumC5072n;
import com.miui.clock.module.fu4;
import gcp.C6061k;
import gcp.C6062n;

/* JADX INFO: loaded from: classes3.dex */
public class ClassicPlusClockSmallView extends ClassicClockBaseView {
    private MiuiTextGlassView bc;
    private boolean bd;
    private int bu;

    /* JADX INFO: renamed from: com.miui.clock.classic.ClassicPlusClockSmallView$k */
    static /* synthetic */ class C5044k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f28751k;

        static {
            int[] iArr = new int[EnumC5072n.values().length];
            f28751k = iArr;
            try {
                iArr[EnumC5072n.TEXT_AREA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28751k[EnumC5072n.TIME_AREA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public ClassicPlusClockSmallView(Context context) {
        super(context);
        this.bd = true;
    }

    /* JADX INFO: renamed from: a */
    private void m17602a() {
        C0397q c0397q = new C0397q();
        c0397q.gvn7(this);
        c0397q.b3e(C5049g.g.f71010jz5, 3, a98o(C5049g.q.f71597ncyb));
        int i2 = C5049g.g.f28950k;
        c0397q.b3e(i2, 3, a98o(C5049g.q.f71644uv6));
        c0397q.b3e(C5049g.g.f71031nmn5, 3, a98o(C5049g.q.f71523eqxt));
        c0397q.x9kr(i2, a98o(C5049g.q.f71582lvui));
        c0397q.ki(this);
        this.ad.m17611h();
        fu4 fu4Var = this.ay;
        if (fu4Var != null) {
            C6061k.zurt(this.bc, fu4Var);
        }
    }

    private int a98o(int i2) {
        return hb(i2);
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView
    /* JADX INFO: renamed from: b */
    protected boolean mo17574b() {
        return true;
    }

    @Override // com.miui.clock.MiuiGalleryBaseClock, com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public View f7l8(EnumC5072n enumC5072n) {
        int i2 = C5044k.f28751k[enumC5072n.ordinal()];
        return i2 != 1 ? i2 != 2 ? super.f7l8(enumC5072n) : this.bc : this.ad;
    }

    @Override // com.miui.clock.classic.ClassicClockBaseView, com.miui.clock.zy.n7h
    public void fti() {
        super.fti();
        this.bc.setText(this.bl.getString(C5049g.s.f71715fu4, C6061k.ki(C6061k.m22311p(this.bg, this.as), this.bg), C6061k.ki(this.as.get(20), true)));
    }

    @Override // com.miui.clock.zy.n7h
    public int getGalleryGravity() {
        return 1;
    }

    @Override // com.miui.clock.MiuiBaseClock2, com.miui.clock.zy.n7h
    public float getTopMargin() {
        return hb(C5049g.q.f71597ncyb);
    }

    @Override // com.miui.clock.zy.n7h
    public int mcp(boolean z2) {
        float fY9n = y9n(C5049g.q.f71597ncyb);
        float fY9n2 = y9n(C5049g.q.f71644uv6);
        return (int) (fY9n + (this.ad != null ? r2.getLineHeight() : y9n(C5049g.q.f71595n5r1)) + fY9n2 + y9n(C5049g.q.f71582lvui) + y9n(C5049g.q.f71523eqxt) + 0.5f);
    }

    @Override // com.miui.clock.MiuiBaseClock2, android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int iWidth = C6062n.f7l8(this.bl).width();
        if (this.bu != iWidth) {
            this.bu = iWidth;
            m17602a();
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
        super.setClockStyleInfo(abstractC5074q);
        if (this.bd) {
            this.bd = false;
            m17602a();
        }
        fti();
    }

    public ClassicPlusClockSmallView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.bd = true;
    }

    public ClassicPlusClockSmallView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.bd = true;
    }
}

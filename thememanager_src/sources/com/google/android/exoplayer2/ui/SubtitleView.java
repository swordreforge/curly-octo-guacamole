package com.google.android.exoplayer2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.accessibility.CaptioningManager;
import android.widget.FrameLayout;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.text.toq;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class SubtitleView extends FrameLayout implements gc3c.InterfaceC3440y {

    /* JADX INFO: renamed from: f */
    public static final int f22530f = 2;

    /* JADX INFO: renamed from: l */
    public static final int f22531l = 1;

    /* JADX INFO: renamed from: r */
    public static final float f22532r = 0.08f;

    /* JADX INFO: renamed from: t */
    public static final float f22533t = 0.0533f;

    /* JADX INFO: renamed from: g */
    private float f22534g;

    /* JADX INFO: renamed from: h */
    private int f22535h;

    /* JADX INFO: renamed from: i */
    private InterfaceC3733k f22536i;

    /* JADX INFO: renamed from: k */
    private List<com.google.android.exoplayer2.text.toq> f22537k;

    /* JADX INFO: renamed from: n */
    private int f22538n;

    /* JADX INFO: renamed from: p */
    private boolean f22539p;

    /* JADX INFO: renamed from: q */
    private C3760n f22540q;

    /* JADX INFO: renamed from: s */
    private boolean f22541s;

    /* JADX INFO: renamed from: y */
    private float f22542y;

    /* JADX INFO: renamed from: z */
    private View f22543z;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.SubtitleView$k */
    interface InterfaceC3733k {
        /* JADX INFO: renamed from: k */
        void mo13248k(List<com.google.android.exoplayer2.text.toq> list, C3760n c3760n, float f2, int i2, float f3);
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    public SubtitleView(Context context) {
        this(context, null);
    }

    private void f7l8() {
        this.f22536i.mo13248k(getCuesWithStylingPreferencesApplied(), this.f22540q, this.f22534g, this.f22538n, this.f22542y);
    }

    private List<com.google.android.exoplayer2.text.toq> getCuesWithStylingPreferencesApplied() {
        if (this.f22541s && this.f22539p) {
            return this.f22537k;
        }
        ArrayList arrayList = new ArrayList(this.f22537k.size());
        for (int i2 = 0; i2 < this.f22537k.size(); i2++) {
            arrayList.add(toq(this.f22537k.get(i2)));
        }
        return arrayList;
    }

    private float getUserCaptionFontScale() {
        CaptioningManager captioningManager;
        if (com.google.android.exoplayer2.util.lrht.f23230k < 19 || isInEditMode() || (captioningManager = (CaptioningManager) getContext().getSystemService("captioning")) == null || !captioningManager.isEnabled()) {
            return 1.0f;
        }
        return captioningManager.getFontScale();
    }

    private C3760n getUserCaptionStyle() {
        if (com.google.android.exoplayer2.util.lrht.f23230k < 19 || isInEditMode()) {
            return C3760n.f66706qrj;
        }
        CaptioningManager captioningManager = (CaptioningManager) getContext().getSystemService("captioning");
        return (captioningManager == null || !captioningManager.isEnabled()) ? C3760n.f66706qrj : C3760n.m13320k(captioningManager.getUserStyle());
    }

    private <T extends View & InterfaceC3733k> void setView(T t2) {
        removeView(this.f22543z);
        View view = this.f22543z;
        if (view instanceof C3745e) {
            ((C3745e) view).f7l8();
        }
        this.f22543z = t2;
        this.f22536i = t2;
        addView(t2);
    }

    private com.google.android.exoplayer2.text.toq toq(com.google.android.exoplayer2.text.toq toqVar) {
        toq.zy qVar = toqVar.toq();
        if (!this.f22541s) {
            n5r1.m13323n(qVar);
        } else if (!this.f22539p) {
            n5r1.m13321g(qVar);
        }
        return qVar.m12938k();
    }

    private void zy(int i2, float f2) {
        this.f22538n = i2;
        this.f22534g = f2;
        f7l8();
    }

    @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
    /* JADX INFO: renamed from: h */
    public void mo12098h(List<com.google.android.exoplayer2.text.toq> list) {
        setCues(list);
    }

    public void setApplyEmbeddedFontSizes(boolean z2) {
        this.f22539p = z2;
        f7l8();
    }

    public void setApplyEmbeddedStyles(boolean z2) {
        this.f22541s = z2;
        f7l8();
    }

    public void setBottomPaddingFraction(float f2) {
        this.f22542y = f2;
        f7l8();
    }

    public void setCues(@zy.dd List<com.google.android.exoplayer2.text.toq> list) {
        if (list == null) {
            list = Collections.emptyList();
        }
        this.f22537k = list;
        f7l8();
    }

    public void setFixedTextSize(@zy.cdj int i2, float f2) {
        Context context = getContext();
        zy(2, TypedValue.applyDimension(i2, f2, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public void setFractionalTextSize(float f2) {
        setFractionalTextSize(f2, false);
    }

    public void setStyle(C3760n c3760n) {
        this.f22540q = c3760n;
        f7l8();
    }

    public void setUserDefaultStyle() {
        setStyle(getUserCaptionStyle());
    }

    public void setUserDefaultTextSize() {
        setFractionalTextSize(getUserCaptionFontScale() * 0.0533f);
    }

    public void setViewType(int i2) {
        if (this.f22535h == i2) {
            return;
        }
        if (i2 == 1) {
            setView(new C3762q(getContext()));
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException();
            }
            setView(new C3745e(getContext()));
        }
        this.f22535h = i2;
    }

    public SubtitleView(Context context, @zy.dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22537k = Collections.emptyList();
        this.f22540q = C3760n.f66706qrj;
        this.f22538n = 0;
        this.f22534g = 0.0533f;
        this.f22542y = 0.08f;
        this.f22541s = true;
        this.f22539p = true;
        C3762q c3762q = new C3762q(context);
        this.f22536i = c3762q;
        this.f22543z = c3762q;
        addView(c3762q);
        this.f22535h = 1;
    }

    public void setFractionalTextSize(float f2, boolean z2) {
        zy(z2 ? 1 : 0, f2);
    }
}

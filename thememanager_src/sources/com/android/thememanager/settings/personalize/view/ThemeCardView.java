package com.android.thememanager.settings.personalize.view;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Matrix;
import android.os.Build;
import android.util.ArrayMap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeSettingsActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.y9n;
import kotlin.collections.C6144h;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import l05.InterfaceC6768s;
import miuix.smooth.SmoothFrameLayout2;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import uj2j.C7689q;
import yz.C7794k;

/* JADX INFO: compiled from: ThemeCardView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class ThemeCardView extends SmoothFrameLayout2 {

    /* JADX INFO: renamed from: m */
    @InterfaceC7396q
    private static final String f15339m = "ThemeCardView";

    /* JADX INFO: renamed from: o */
    @InterfaceC7396q
    public static final C2590k f15340o = new C2590k(null);

    /* JADX INFO: renamed from: c */
    @InterfaceC7395n
    private ImageView f15341c;

    /* JADX INFO: renamed from: e */
    @InterfaceC7395n
    private TextView f15342e;

    /* JADX INFO: renamed from: f */
    @InterfaceC7395n
    private ImageView f15343f;

    /* JADX INFO: renamed from: j */
    @InterfaceC7395n
    private TextView f15344j;

    /* JADX INFO: renamed from: l */
    @InterfaceC7395n
    private ImageView f15345l;

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.view.ThemeCardView$k */
    /* JADX INFO: compiled from: ThemeCardView.kt */
    public static final class C2590k {
        private C2590k() {
        }

        public /* synthetic */ C2590k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public ThemeCardView(@InterfaceC7396q Context context) {
        this(context, null, 0, 6, null);
        d2ok.m23075h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public ThemeCardView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        d2ok.m23075h(context, "context");
    }

    public /* synthetic */ ThemeCardView(Context context, AttributeSet attributeSet, int i2, int i3, ni7 ni7Var) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX INFO: renamed from: p */
    private final void m9116p() {
        Intent intent = new Intent();
        Context context = getContext();
        d2ok.n7h(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        if (C1819o.dd(activity) && !C1819o.m7164r(activity)) {
            nn86.m7150k(R.string.multiwindow_no_support, 0);
            return;
        }
        if (C1807g.m7081r()) {
            if (C6144h.ph5d(new String[]{"dizi", "ruan"}, Build.DEVICE)) {
                intent.setComponent(new ComponentName(activity, "com.android.thememanager.settings.theme.activity.LocalThemePadActivity"));
            } else {
                intent.setComponent(new ComponentName(activity, "com.android.thememanager.settings.theme.activity.OnlineThemePadActivity"));
            }
            intent.putExtra("resource_code", "theme");
        } else {
            intent.setClass(activity, ThemeSettingsActivity.class);
        }
        try {
            activity.startActivity(intent);
        } catch (Exception e2) {
            C7794k.m28198s(f15339m, "doThemeCardClick: ", e2);
        }
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        d2ok.qrj(arrayMapM6679k);
        arrayMapM6679k.put(com.android.thememanager.basemodule.analysis.toq.i0, "主题套装");
        C1708s.f7l8().ld6().ni7(C1706p.n7h("personalize", "主题套装", arrayMapM6679k));
    }

    private final boolean qrj() {
        return C1807g.zurt() && !y9n.a9() && C1807g.wvg() && C1819o.ncyb(bf2.toq.toq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x2(ThemeCardView this$0, View view) {
        d2ok.m23075h(this$0, "this$0");
        this$0.m9116p();
    }

    public final void kja0(@InterfaceC7396q C7689q result) {
        float fFloatValue;
        d2ok.m23075h(result, "result");
        ImageView imageView = this.f15345l;
        if (imageView != null) {
            imageView.setBackgroundColor(result.f7l8());
        }
        ImageView imageView2 = this.f15343f;
        if (imageView2 != null) {
            imageView2.setImageBitmap(result.m28078s());
        }
        ImageView imageView3 = this.f15341c;
        if (imageView3 != null) {
            imageView3.setImageBitmap(result.m28079y());
        }
        if (qrj()) {
            Float fValueOf = this.f15343f != null ? Float.valueOf(r0.getWidth()) : null;
            Float fValueOf2 = result.m28078s() != null ? Float.valueOf(r2.getWidth()) : null;
            if (fValueOf != null) {
                float fFloatValue2 = fValueOf.floatValue();
                d2ok.qrj(fValueOf2);
                fFloatValue = fFloatValue2 / fValueOf2.floatValue();
            } else {
                fFloatValue = 1.0f;
            }
            ImageView imageView4 = this.f15343f;
            d2ok.qrj(imageView4);
            Matrix imageMatrix = imageView4.getImageMatrix();
            imageMatrix.setScale(fFloatValue, fFloatValue);
            ImageView imageView5 = this.f15343f;
            if (imageView5 != null) {
                imageView5.setImageMatrix(imageMatrix);
            }
            ImageView imageView6 = this.f15341c;
            if (imageView6 != null) {
                imageView6.setImageMatrix(imageMatrix);
            }
        }
        TextView textView = this.f15344j;
        if (textView == null) {
            return;
        }
        textView.setText(result.m28076p());
    }

    public final void ld6() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.personalize_theme_card_view, (ViewGroup) this, true);
        this.f15345l = (ImageView) viewInflate.findViewById(R.id.wallpaper_img);
        this.f15343f = (ImageView) viewInflate.findViewById(R.id.theme_lock_preview);
        this.f15341c = (ImageView) viewInflate.findViewById(R.id.theme_desk_preview);
        if (qrj()) {
            ImageView imageView = this.f15343f;
            d2ok.qrj(imageView);
            imageView.setScaleType(ImageView.ScaleType.MATRIX);
            ImageView imageView2 = this.f15341c;
            d2ok.qrj(imageView2);
            imageView2.setScaleType(ImageView.ScaleType.MATRIX);
        }
        this.f15342e = (TextView) viewInflate.findViewById(R.id.theme_title);
        this.f15344j = (TextView) viewInflate.findViewById(R.id.theme_name_title);
        TextView textView = this.f15342e;
        if (textView != null) {
            textView.setText(getResources().getString(R.string.theme_component_title_all));
        }
        setContentDescription(getResources().getString(R.string.theme_component_title_all));
        setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.personalize.view.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThemeCardView.x2(this.f15351k, view);
            }
        });
    }

    public final void release() {
        ImageView imageView = this.f15345l;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.f15345l = null;
        ImageView imageView2 = this.f15343f;
        if (imageView2 != null) {
            imageView2.setImageBitmap(null);
        }
        this.f15343f = null;
        ImageView imageView3 = this.f15341c;
        if (imageView3 != null) {
            imageView3.setImageBitmap(null);
        }
        this.f15341c = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m9118s(int i2, int i3) {
        ImageView imageView = this.f15343f;
        ViewGroup.LayoutParams layoutParams = imageView != null ? imageView.getLayoutParams() : null;
        if (layoutParams != null) {
            layoutParams.width = i2;
        }
        ImageView imageView2 = this.f15343f;
        ViewGroup.LayoutParams layoutParams2 = imageView2 != null ? imageView2.getLayoutParams() : null;
        if (layoutParams2 != null) {
            layoutParams2.height = i3;
        }
        ImageView imageView3 = this.f15341c;
        ViewGroup.LayoutParams layoutParams3 = imageView3 != null ? imageView3.getLayoutParams() : null;
        if (layoutParams3 != null) {
            layoutParams3.width = i2;
        }
        ImageView imageView4 = this.f15341c;
        ViewGroup.LayoutParams layoutParams4 = imageView4 != null ? imageView4.getLayoutParams() : null;
        if (layoutParams4 == null) {
            return;
        }
        layoutParams4.height = i3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public ThemeCardView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d2ok.m23075h(context, "context");
        ld6();
    }
}

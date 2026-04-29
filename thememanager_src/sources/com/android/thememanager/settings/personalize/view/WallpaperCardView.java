package com.android.thememanager.settings.personalize.view;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.settings.personalize.x2;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import l05.InterfaceC6768s;
import miuix.smooth.SmoothFrameLayout2;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import uj2j.C7688k;
import yz.C7794k;

/* JADX INFO: compiled from: WallpaperCardView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WallpaperCardView extends SmoothFrameLayout2 implements InterfaceC2593k {

    /* JADX INFO: renamed from: c */
    @InterfaceC7396q
    public static final C2591k f15346c = new C2591k(null);

    /* JADX INFO: renamed from: e */
    @InterfaceC7396q
    public static final String f15347e = "WallpaperCardView";

    /* JADX INFO: renamed from: f */
    @InterfaceC7395n
    private TextView f15348f;

    /* JADX INFO: renamed from: l */
    @InterfaceC7395n
    private ImageView f15349l;

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.view.WallpaperCardView$k */
    /* JADX INFO: compiled from: WallpaperCardView.kt */
    public static final class C2591k {
        private C2591k() {
        }

        public /* synthetic */ C2591k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public WallpaperCardView(@InterfaceC7396q Context context) {
        this(context, null, 0, 6, null);
        d2ok.m23075h(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public WallpaperCardView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        d2ok.m23075h(context, "context");
    }

    public /* synthetic */ WallpaperCardView(Context context, AttributeSet attributeSet, int i2, int i3, ni7 ni7Var) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final void m9119p(WallpaperCardView this$0, View view) {
        d2ok.m23075h(this$0, "this$0");
        Context context = this$0.getContext();
        d2ok.n7h(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        if (C1819o.dd(activity) && !C1819o.m7164r(activity)) {
            nn86.m7150k(R.string.multiwindow_no_support, 0);
            return;
        }
        try {
            activity.startActivity(x2.m9126k(x2.f15358n));
        } catch (Exception e2) {
            C7794k.m28198s(f15347e, "startActivity error: ", e2);
        }
        C1708s.f7l8().ld6().ni7(C1706p.kja0("personalize", "personalize_wallpaper_card", ""));
    }

    @Override // com.android.thememanager.settings.personalize.view.InterfaceC2593k
    /* JADX INFO: renamed from: k */
    public void mo9121k(@InterfaceC7395n Bitmap bitmap) {
    }

    public final void ld6(@InterfaceC7396q C7688k data) {
        d2ok.m23075h(data, "data");
        ImageView imageView = this.f15349l;
        if (imageView != null) {
            imageView.setImageBitmap(data.m28071n());
        }
        setTextColor(data.m28069g());
    }

    @Override // com.android.thememanager.settings.personalize.view.InterfaceC2593k
    public void release() {
        ImageView imageView = this.f15349l;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.f15349l = null;
    }

    /* JADX INFO: renamed from: s */
    public final void m9122s() {
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.personalize_wallpaper_card_view, (ViewGroup) this, true);
        this.f15349l = (ImageView) viewInflate.findViewById(R.id.wallpaper_img);
        TextView textView = (TextView) viewInflate.findViewById(R.id.card_title);
        this.f15348f = textView;
        if (textView != null) {
            textView.setText(getResources().getString(R.string.personalize_wallpaper_title));
        }
        setContentDescription(getResources().getString(R.string.personalize_wallpaper_title));
        setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.personalize.view.f7l8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                WallpaperCardView.m9119p(this.f15350k, view);
            }
        });
    }

    public final void setTextColor(boolean z2) {
        TextView textView = this.f15348f;
        if (textView != null) {
            textView.setTextColor(z2 ? -16777216 : -1);
        }
    }

    @Override // com.android.thememanager.settings.personalize.view.InterfaceC2593k
    public void toq(@InterfaceC7395n Bitmap bitmap) {
    }

    @Override // com.android.thememanager.settings.personalize.view.InterfaceC2593k
    public void zy(@InterfaceC7395n Bitmap bitmap) {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public WallpaperCardView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        d2ok.m23075h(context, "context");
        m9122s();
    }
}

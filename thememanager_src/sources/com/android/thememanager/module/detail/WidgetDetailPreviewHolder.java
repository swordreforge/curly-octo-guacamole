package com.android.thememanager.module.detail;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.network.entity.WidgetPreviewInfo;
import com.google.android.exoplayer2.text.ttml.C3678q;
import etdu.InterfaceC6012k;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WidgetPreviewAdapter.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetDetailPreviewHolder extends BaseThemeAdapter.ViewHolder<WidgetPreviewInfo> implements InterfaceC6012k {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final View f13057g;

    /* JADX INFO: renamed from: h */
    private float f13058h;

    /* JADX INFO: renamed from: i */
    private final int f13059i;

    /* JADX INFO: renamed from: p */
    private ImageView f13060p;

    /* JADX INFO: renamed from: s */
    private View f13061s;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final WidgetPreviewAdapter f13062y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetDetailPreviewHolder(@InterfaceC7396q View itemView, @InterfaceC7396q WidgetPreviewAdapter adapter) {
        super(itemView, adapter);
        d2ok.m23075h(itemView, "itemView");
        d2ok.m23075h(adapter, "adapter");
        this.f13057g = itemView;
        this.f13062y = adapter;
        this.f13059i = fn3e().getResources().getDimensionPixelOffset(R.dimen.widget_preview_viewpager_offset_margin);
    }

    @InterfaceC7396q
    public final View cdj() {
        return this.f13057g;
    }

    @Override // etdu.InterfaceC6012k
    public void kja0(float f2) {
        float fAbs = this.f13059i * Math.abs(f2);
        int iJk = C1819o.jk(fn3e());
        View view = this.f13061s;
        View view2 = null;
        if (view == null) {
            d2ok.n5r1(C3678q.f65834ni7);
            view = null;
        }
        float width = (iJk - view.getWidth()) * 0.5f;
        this.f13058h = width;
        float fAbs2 = width * Math.abs(f2);
        if (f2 == 0.0f) {
            this.f13057g.setTranslationX(0.0f);
            View view3 = this.f13061s;
            if (view3 == null) {
                d2ok.n5r1(C3678q.f65834ni7);
            } else {
                view2 = view3;
            }
            view2.setTranslationX(0.0f);
            return;
        }
        if (f2 < 0.0f) {
            this.f13057g.setTranslationX(fAbs);
            View view4 = this.f13061s;
            if (view4 == null) {
                d2ok.n5r1(C3678q.f65834ni7);
            } else {
                view2 = view4;
            }
            view2.setTranslationX(fAbs2);
            return;
        }
        this.f13057g.setTranslationX(-fAbs);
        View view5 = this.f13061s;
        if (view5 == null) {
            d2ok.n5r1(C3678q.f65834ni7);
        } else {
            view2 = view5;
        }
        view2.setTranslationX(-fAbs2);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void o1t(@InterfaceC7396q WidgetPreviewInfo info, int i2) {
        d2ok.m23075h(info, "info");
        super.o1t(info, i2);
        View viewFindViewById = this.f13057g.findViewById(R.id.widget_thumbnail);
        d2ok.kja0(viewFindViewById, "findViewById(...)");
        this.f13060p = (ImageView) viewFindViewById;
        View viewFindViewById2 = this.f13057g.findViewById(R.id.wrap_widget_thumbnail);
        d2ok.kja0(viewFindViewById2, "findViewById(...)");
        this.f13061s = viewFindViewById2;
        this.f13057g.setTag(this);
        x2.C1735g c1735gM6793r = x2.fn3e().m6793r(x2.ki(i2, 0.0f));
        Context context = this.f13057g.getContext();
        d2ok.n7h(context, "null cannot be cast to non-null type android.app.Activity");
        Activity activity = (Activity) context;
        String picUrl = info.getPicUrl();
        ImageView imageView = this.f13060p;
        if (imageView == null) {
            d2ok.n5r1("img");
            imageView = null;
        }
        x2.m6782y(activity, picUrl, imageView, c1735gM6793r);
    }

    @InterfaceC7396q
    public final WidgetPreviewAdapter wvg() {
        return this.f13062y;
    }
}

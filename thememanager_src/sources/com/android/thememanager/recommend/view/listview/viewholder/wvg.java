package com.android.thememanager.recommend.view.listview.viewholder;

import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.model.LargeIconStatus;
import com.android.thememanager.module.detail.presenter.C2225g;
import com.android.thememanager.settings.superwallpaper.utils.C2662g;
import com.bumptech.glide.load.engine.AbstractC3039p;
import i1.C6077k;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: compiled from: LargeIconPurchasePickerViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class wvg extends AbstractC2438g {

    /* JADX INFO: renamed from: g */
    protected View f14406g;

    /* JADX INFO: renamed from: h */
    private String f14407h;

    /* JADX INFO: renamed from: i */
    private final View f14408i;

    /* JADX INFO: renamed from: p */
    private final C2225g f14409p;

    /* JADX INFO: renamed from: s */
    protected TextView f14410s;

    /* JADX INFO: renamed from: y */
    protected ImageView f14411y;

    /* JADX INFO: renamed from: z */
    private x2.C1735g f14412z;

    private wvg(@InterfaceC7396q @lvui View itemView, C2225g vm, com.android.thememanager.recommend.view.listview.zy adapter) {
        super(itemView, adapter);
        this.f14409p = vm;
        this.f14410s = (TextView) itemView.findViewById(R.id.title);
        this.f14406g = itemView.findViewById(R.id.using_flag);
        this.f14411y = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f14408i = itemView.findViewById(R.id.process_bar);
        this.f14412z = com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(com.android.thememanager.basemodule.imageloader.x2.x2(), bf2.toq.toq().getResources().getDimension(R.dimen.de_detail_corner_radius))).ncyb(0.7f);
        C6077k.o1t(itemView);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d2ok(LargeIconStatus largeIconStatus) {
        m8789r(largeIconStatus.selected);
        this.f14408i.setVisibility(largeIconStatus.status == 1 ? 0 : 8);
    }

    private void jk(LargeIconElement element) {
        C2225g c2225g = this.f14409p;
        String str = element.id;
        c2225g.kiv(str, new LargeIconStatus(str, oc(), 0, element.hasBought)).m4391p((AbstractActivityC1717k) this.itemView.getContext(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.recommend.view.listview.viewholder.o1t
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f14390k.d2ok((LargeIconStatus) obj);
            }
        });
    }

    public static wvg lvui(ViewGroup parent, C2225g vm, com.android.thememanager.recommend.view.listview.zy adapter) {
        return new wvg(LayoutInflater.from(parent.getContext()).inflate(R.layout.large_icon_online_view_holder, parent, false), vm, adapter);
    }

    private boolean oc() {
        return (this.f14407h == null || this.f14409p.fu4() == null || !TextUtils.equals(this.f14407h, this.f14409p.fu4().id)) ? false : true;
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    public void o1t(LargeIconElement element, int position) {
        super.o1t(element, position);
        this.f14407h = element.id;
        jk(element);
        String str = element.name;
        if (str != null) {
            this.f14410s.setText(str);
        }
        String str2 = element.previewUrl;
        if (TextUtils.isEmpty(str2)) {
            str2 = element.preview_1_1;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = element.preview_2_2;
        }
        if (TextUtils.equals(element.id, LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID)) {
            this.f14411y.setScaleX(1.08f);
            this.f14411y.setScaleY(1.08f);
            Drawable drawableM9263q = C2662g.m9263q(element.packageName);
            if (drawableM9263q != null) {
                this.f14411y.setImageDrawable(drawableM9263q);
                return;
            }
        } else {
            this.f14411y.setScaleX(1.0f);
            this.f14411y.setScaleY(1.0f);
        }
        this.f14412z.dd(element.packageName + element.name + element.author);
        this.f14412z.d3(TextUtils.equals(element.id, LargeIconElement.DEFAULT_LARGE_ICON_PRODUCT_ID) ? AbstractC3039p.f62798toq : AbstractC3039p.f18436k);
        com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) this.itemView.getContext(), str2, this.f14411y, this.f14412z);
    }

    /* JADX INFO: renamed from: r */
    protected void m8789r(boolean isUsing) {
        if (isUsing) {
            this.f14406g.setVisibility(0);
            this.f14410s.setTextColor(this.itemView.getContext().getResources().getColor(R.color.system_blue));
        } else {
            this.f14406g.setVisibility(4);
            this.f14410s.setTextColor(this.itemView.getContext().getResources().getColor(R.color.large_icon_header_selector_text));
        }
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    /* JADX INFO: renamed from: t */
    protected void mo8787t() {
        super.mo8787t();
        ArrayMap<String, Object> arrayMapNi7 = ni7();
        if (arrayMapNi7 == null) {
            return;
        }
        arrayMapNi7.put(com.android.thememanager.basemodule.analysis.toq.a800, "yes");
        arrayMapNi7.put("content", this.f14367k.id);
        C1708s.f7l8().ld6().ni7(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.qlt6, null, arrayMapNi7));
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    public void wvg() {
        ArrayMap<String, Object> arrayMapNi7 = ni7();
        if (arrayMapNi7 == null) {
            return;
        }
        arrayMapNi7.put(com.android.thememanager.basemodule.analysis.toq.a800, "yes");
        arrayMapNi7.put("content", this.f14367k.id);
        C1708s.f7l8().ld6().cdj(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.qlt6, null, arrayMapNi7));
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    /* JADX INFO: renamed from: z */
    protected void mo8788z(LargeIconElement element) {
        this.f14409p.r6ty(element);
        super.mo8788z(element);
    }
}

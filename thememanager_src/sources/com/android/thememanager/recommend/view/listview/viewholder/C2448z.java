package com.android.thememanager.recommend.view.listview.viewholder;

import android.app.Activity;
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
import com.android.thememanager.basemodule.utils.C1815m;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.model.LargeIconStatus;
import com.android.thememanager.module.detail.presenter.C2225g;
import i1.C6077k;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.z */
/* JADX INFO: compiled from: LargeIconPickerRecommendViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2448z extends AbstractC2438g {

    /* JADX INFO: renamed from: f */
    private androidx.lifecycle.jp0y<LargeIconStatus> f14415f;

    /* JADX INFO: renamed from: g */
    private TextView f14416g;

    /* JADX INFO: renamed from: h */
    private View f14417h;

    /* JADX INFO: renamed from: i */
    private View f14418i;

    /* JADX INFO: renamed from: l */
    private androidx.lifecycle.fti<LargeIconStatus> f14419l;

    /* JADX INFO: renamed from: p */
    private TextView f14420p;

    /* JADX INFO: renamed from: r */
    private x2.C1735g f14421r;

    /* JADX INFO: renamed from: s */
    private ImageView f14422s;

    /* JADX INFO: renamed from: t */
    private String f14423t;

    /* JADX INFO: renamed from: y */
    private View f14424y;

    /* JADX INFO: renamed from: z */
    private final C2225g f14425z;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.z$k */
    /* JADX INFO: compiled from: LargeIconPickerRecommendViewHolder.java */
    class k implements androidx.lifecycle.jp0y<LargeIconStatus> {
        k() {
        }

        @Override // androidx.lifecycle.jp0y
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(LargeIconStatus status) {
            LargeIconElement largeIconElement = C2448z.this.f14367k;
            if (largeIconElement == null || !TextUtils.equals(status.id, largeIconElement.id)) {
                return;
            }
            C2448z.this.dd(status.selected);
            if (status.status == 1) {
                C2448z.this.f14417h.setVisibility(0);
            } else {
                C2448z.this.f14417h.setVisibility(8);
            }
            C2448z.this.f14416g.setVisibility(status.hasBought ? 8 : 0);
        }
    }

    public C2448z(@InterfaceC7396q @lvui View itemView, C2225g vm, com.android.thememanager.recommend.view.listview.zy adapter) {
        super(itemView, adapter);
        this.f14415f = new k();
        this.f14425z = vm;
        this.f14420p = (TextView) itemView.findViewById(R.id.title);
        this.f14424y = itemView.findViewById(R.id.using_flag);
        this.f14422s = (ImageView) itemView.findViewById(R.id.thumbnail);
        this.f14416g = (TextView) itemView.findViewById(R.id.price);
        this.f14417h = itemView.findViewById(R.id.process_bar);
        this.f14418i = itemView.findViewById(R.id.preview);
        this.f14421r = com.android.thememanager.basemodule.imageloader.x2.fn3e().m6793r(com.android.thememanager.basemodule.imageloader.x2.ki(com.android.thememanager.basemodule.imageloader.x2.x2(), bf2.toq.toq().getResources().getDimension(R.dimen.large_icon_picker_page_recommend_list_item_radius))).ncyb(0.8f);
        C6077k.o1t(itemView);
    }

    /* JADX INFO: renamed from: r */
    public static C2448z m8790r(ViewGroup parent, C2225g vm, com.android.thememanager.recommend.view.listview.zy adapter) {
        return new C2448z(LayoutInflater.from(parent.getContext()).inflate(R.layout.large_icon_picker_recommend_vh, parent, false), vm, adapter);
    }

    protected C2225g d2ok() {
        return this.f14425z;
    }

    protected void dd(boolean isUsing) {
        if (isUsing) {
            this.f14424y.setVisibility(0);
            this.f14420p.setTextColor(this.itemView.getContext().getResources().getColor(R.color.system_blue));
            this.f14416g.setTextColor(this.itemView.getContext().getResources().getColor(R.color.system_blue));
        } else {
            this.f14424y.setVisibility(4);
            this.f14420p.setTextColor(this.itemView.getContext().getResources().getColor(R.color.large_icon_header_selector_text));
            this.f14416g.setTextColor(this.itemView.getContext().getResources().getColor(R.color.large_icon_header_selector_text));
        }
    }

    protected boolean lvui() {
        return (this.f14423t == null || d2ok().fu4() == null || !TextUtils.equals(this.f14423t, d2ok().fu4().id)) ? false : true;
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    public void o1t(final LargeIconElement largeIconElement, int position) {
        super.o1t(largeIconElement, position);
        com.android.thememanager.recommend.view.listview.zy zyVar = this.f14369q;
        if (zyVar != null && zyVar.m8796z() > 0) {
            ViewGroup.LayoutParams layoutParams = this.f14418i.getLayoutParams();
            layoutParams.width = this.f14369q.m8796z();
            layoutParams.height = this.f14369q.m8796z();
        }
        String str = largeIconElement.id;
        this.f14423t = str;
        oc(str, new LargeIconStatus(str, lvui(), 0, largeIconElement.hasBought));
        this.f14420p.setText(largeIconElement.name);
        if (largeIconElement.hasBought || largeIconElement.currentPriceInCent <= 0) {
            this.f14416g.setVisibility(8);
        } else {
            this.f14416g.setText(C1815m.toq(bf2.toq.toq(), largeIconElement.currentPriceInCent));
        }
        String str2 = largeIconElement.previewUrl;
        if (TextUtils.isEmpty(str2)) {
            str2 = largeIconElement.preview_1_1;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = largeIconElement.preview_2_2;
        }
        this.f14421r.dd(String.valueOf(largeIconElement.name));
        com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) this.itemView.getContext(), str2, this.f14422s, this.f14421r);
    }

    protected void oc(String id, LargeIconStatus status) {
        androidx.lifecycle.fti<LargeIconStatus> ftiVarKiv = this.f14425z.kiv(id, status);
        this.f14419l = ftiVarKiv;
        ftiVarKiv.kja0(this.f14415f);
        this.f14419l.m4391p((AbstractActivityC1717k) this.itemView.getContext(), this.f14415f);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    /* JADX INFO: renamed from: t */
    protected void mo8787t() {
        super.mo8787t();
        ArrayMap<String, Object> arrayMapNi7 = ni7();
        if (arrayMapNi7 == null) {
            return;
        }
        arrayMapNi7.put(com.android.thememanager.basemodule.analysis.toq.a800, "no");
        arrayMapNi7.put("content", this.f14367k.id);
        C1708s.f7l8().ld6().ni7(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.qlt6, null, arrayMapNi7));
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    public void wvg() {
        ArrayMap<String, Object> arrayMapNi7 = ni7();
        if (arrayMapNi7 == null) {
            return;
        }
        arrayMapNi7.put(com.android.thememanager.basemodule.analysis.toq.a800, "no");
        arrayMapNi7.put("content", this.f14367k.id);
        C1708s.f7l8().ld6().cdj(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.qlt6, null, arrayMapNi7));
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    /* JADX INFO: renamed from: z */
    protected void mo8788z(LargeIconElement largeIconElement) {
        OnlineResourceDetail onlineResourceDetailCnbm = this.f14425z.cnbm(largeIconElement.id, largeIconElement.isOfficialIcons);
        this.f14425z.r6ty(onlineResourceDetailCnbm != null ? LargeIconElement.create(onlineResourceDetailCnbm, largeIconElement, onlineResourceDetailCnbm.productPackageName) : largeIconElement);
        super.mo8788z(largeIconElement);
    }
}

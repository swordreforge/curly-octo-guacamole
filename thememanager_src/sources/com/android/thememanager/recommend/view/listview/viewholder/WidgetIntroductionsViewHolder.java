package com.android.thememanager.recommend.view.listview.viewholder;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.recommend.model.entity.element.WidgetIntroductionsElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WidgetIntroductionsViewHolder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetIntroductionsViewHolder extends BaseViewHolder<WidgetIntroductionsElement> {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C2435k f14337y = new C2435k(null);

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final ImageView f14338g;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.WidgetIntroductionsViewHolder$k */
    /* JADX INFO: compiled from: WidgetIntroductionsViewHolder.kt */
    public static final class C2435k {
        private C2435k() {
        }

        public /* synthetic */ C2435k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final WidgetIntroductionsViewHolder m8781k(@InterfaceC7395n ViewGroup viewGroup, @InterfaceC7396q RecommendListViewAdapter adapter) {
            d2ok.m23075h(adapter, "adapter");
            View viewInflate = LayoutInflater.from(adapter.fn3e()).inflate(R.layout.rc_element_widget_introduction_img_layout, viewGroup, false);
            d2ok.kja0(viewInflate, "inflate(...)");
            return new WidgetIntroductionsViewHolder(viewInflate, adapter);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetIntroductionsViewHolder(@InterfaceC7396q View itemView, @InterfaceC7396q RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        d2ok.m23075h(itemView, "itemView");
        d2ok.m23075h(adapter, "adapter");
        x9kr();
        View viewFindViewById = itemView.findViewById(R.id.widget_introduction_img);
        d2ok.kja0(viewFindViewById, "findViewById(...)");
        this.f14338g = (ImageView) viewFindViewById;
    }

    @InterfaceC7396q
    @l05.qrj
    public static final WidgetIntroductionsViewHolder ncyb(@InterfaceC7395n ViewGroup viewGroup, @InterfaceC7396q RecommendListViewAdapter recommendListViewAdapter) {
        return f14337y.m8781k(viewGroup, recommendListViewAdapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(@InterfaceC7396q WidgetIntroductionsElement info, int i2) {
        d2ok.m23075h(info, "info");
        super.o1t(info, i2);
        List listCb = kotlin.text.fti.cb(info.getWidgetPreviewInfo().getPicAspectRatio(), new String[]{":"}, false, 0, 6, null);
        if (listCb.size() == 2) {
            this.f14338g.getLayoutParams().height = (C1819o.jk(fn3e()) * Integer.parseInt((String) listCb.get(1))) / Integer.parseInt((String) listCb.get(0));
        }
        Context contextFn3e = fn3e();
        d2ok.n7h(contextFn3e, "null cannot be cast to non-null type android.app.Activity");
        com.android.thememanager.basemodule.imageloader.x2.m6780q((Activity) contextFn3e, info.getWidgetPreviewInfo().getPicUrl(), this.f14338g, R.drawable.wallpaper_grey_bg);
    }
}

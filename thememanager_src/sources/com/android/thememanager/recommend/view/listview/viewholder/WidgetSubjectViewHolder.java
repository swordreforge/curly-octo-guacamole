package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.recommend.model.entity.element.AodProductElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIProduct;
import gc3c.ViewOnClickListenerC6059k;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: WidgetSubjectViewHolder.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class WidgetSubjectViewHolder extends BaseViewHolder<AodProductElement> {

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    public static final C2437k f14353y = new C2437k(null);

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    private final ViewOnClickListenerC6059k f14354g;

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.WidgetSubjectViewHolder$k */
    /* JADX INFO: compiled from: WidgetSubjectViewHolder.kt */
    public static final class C2437k {
        private C2437k() {
        }

        public /* synthetic */ C2437k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final WidgetSubjectViewHolder m8786k(@InterfaceC7396q ViewGroup parent, @InterfaceC7396q RecommendListViewAdapter adapter) {
            d2ok.m23075h(parent, "parent");
            d2ok.m23075h(adapter, "adapter");
            View viewM22285q = gc3c.toq.m22285q(parent, false);
            d2ok.qrj(viewM22285q);
            return new WidgetSubjectViewHolder(viewM22285q, adapter);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WidgetSubjectViewHolder(@InterfaceC7396q View itemView, @InterfaceC7396q RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        d2ok.m23075h(itemView, "itemView");
        d2ok.m23075h(adapter, "adapter");
        this.f14354g = new ViewOnClickListenerC6059k(itemView, ki(), adapter, 4);
    }

    @InterfaceC7396q
    @l05.qrj
    public static final WidgetSubjectViewHolder ncyb(@InterfaceC7396q ViewGroup viewGroup, @InterfaceC7396q RecommendListViewAdapter recommendListViewAdapter) {
        return f14353y.m8786k(viewGroup, recommendListViewAdapter);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void o1t(@InterfaceC7396q AodProductElement item, int i2) {
        d2ok.m23075h(item, "item");
        super.o1t(item, i2);
        this.f14354g.m22283n(item.getProduct(), i2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.android.thememanager.recommend.view.listview.viewholder.BaseViewHolder
    @InterfaceC7395n
    /* JADX INFO: renamed from: t */
    protected List<String> mo8573t() {
        UIProduct product;
        AodProductElement aodProductElement = (AodProductElement) this.f9849q;
        String str = (aodProductElement == null || (product = aodProductElement.getProduct()) == null) ? null : product.trackId;
        if (str == null) {
            return null;
        }
        return kotlin.collections.zurt.ld6(str);
    }
}

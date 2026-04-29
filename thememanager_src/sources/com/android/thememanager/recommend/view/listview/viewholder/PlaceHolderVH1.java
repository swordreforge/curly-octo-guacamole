package com.android.thememanager.recommend.view.listview.viewholder;

import android.view.View;
import com.android.thememanager.recommend.model.entity.element.PlaceHolderElement;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PlaceHolderVH.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PlaceHolderVH1 extends BaseViewHolder<PlaceHolderElement> {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final C2423k f14230g = new C2423k(null);

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.PlaceHolderVH1$k */
    /* JADX INFO: compiled from: PlaceHolderVH.kt */
    public static final class C2423k {
        private C2423k() {
        }

        public /* synthetic */ C2423k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        public final PlaceHolderVH1 m8739k(@InterfaceC7396q RecommendListViewAdapter adapter, @InterfaceC7396q View itemView) {
            d2ok.m23075h(adapter, "adapter");
            d2ok.m23075h(itemView, "itemView");
            return new PlaceHolderVH1(itemView, adapter);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceHolderVH1(@InterfaceC7396q View itemView, @InterfaceC7396q RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        d2ok.m23075h(itemView, "itemView");
        d2ok.m23075h(adapter, "adapter");
    }

    @InterfaceC7396q
    @l05.qrj
    public static final PlaceHolderVH1 ncyb(@InterfaceC7396q RecommendListViewAdapter recommendListViewAdapter, @InterfaceC7396q View view) {
        return f14230g.m8739k(recommendListViewAdapter, view);
    }
}

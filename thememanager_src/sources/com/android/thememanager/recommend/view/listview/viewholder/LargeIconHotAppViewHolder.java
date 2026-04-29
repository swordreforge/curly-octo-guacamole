package com.android.thememanager.recommend.view.listview.viewholder;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.activity.LargeIconAllActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.recommend.model.entity.element.LargeIconHotAppCardElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.recommend.view.listview.RecommendListViewAdapter;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.router.recommend.entity.UILink;
import i1.C6077k;
import java.util.ArrayList;
import java.util.List;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconHotAppViewHolder extends BaseViewHolder<LargeIconHotAppCardElement> {

    /* JADX INFO: renamed from: l */
    private static final int f14202l = 10;

    /* JADX INFO: renamed from: r */
    private static final int f14203r = 5;

    /* JADX INFO: renamed from: t */
    private static final String f14204t = "LargeIconHotAppViewHold";

    /* JADX INFO: renamed from: g */
    private TextView f14205g;

    /* JADX INFO: renamed from: h */
    private int f14206h;

    /* JADX INFO: renamed from: i */
    private int f14207i;

    /* JADX INFO: renamed from: p */
    private int f14208p;

    /* JADX INFO: renamed from: s */
    private GridLayout f14209s;

    /* JADX INFO: renamed from: y */
    private TextView f14210y;

    /* JADX INFO: renamed from: z */
    private final List<C2420k> f14211z;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.LargeIconHotAppViewHolder$k */
    class C2420k {

        /* JADX INFO: renamed from: k */
        private final View f14212k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final ImageView f60720toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final TextView f60721zy;

        public C2420k(View parentView) {
            this.f14212k = parentView;
            this.f60720toq = (ImageView) parentView.findViewById(R.id.icon_item_preview);
            C6077k.f7l8(parentView);
            this.f60721zy = (TextView) parentView.findViewById(R.id.icon_item_title);
        }

        private void toq(UILink link) {
            if (link == null) {
                return;
            }
            String str = link.type;
            str.hashCode();
            if (str.equals("SEARCH")) {
                C2451n.toq toqVarM8797g = C2451n.m8797g();
                toqVarM8797g.toq(link.productType);
                toqVarM8797g.x2("largeicons");
                C2451n.m8803y(LargeIconHotAppViewHolder.this.ki(), LargeIconHotAppViewHolder.this.ni7(), link, toqVarM8797g);
            } else if (str.equals("UI_PAGE")) {
                LargeIconHotAppViewHolder.this.m8723e(link.link);
            } else {
                Log.d(LargeIconHotAppViewHolder.f14204t, "link.type not exist");
            }
            if ("UI_PAGE".equals(link.type) || "SEARCH".equals(link.type)) {
                LargeIconHotAppViewHolder.this.m8726m(link.type, link.trackId, link.link);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void zy(UIImageWithLink uIImageWithLink, View view) {
            toq(uIImageWithLink.link);
        }

        /* JADX INFO: renamed from: q */
        public void m8729q(final UIImageWithLink data) {
            this.f14212k.setPadding(0, 0, 0, LargeIconHotAppViewHolder.this.f14207i);
            this.f14212k.getLayoutParams().width = LargeIconHotAppViewHolder.this.f14208p;
            this.f14212k.setVisibility(0);
            int i2 = LargeIconHotAppViewHolder.this.f14206h;
            this.f60720toq.getLayoutParams().width = i2;
            this.f60720toq.getLayoutParams().height = i2;
            UILink uILink = data.link;
            if (uILink != null) {
                this.f60721zy.setText(uILink.title);
            }
            com.android.thememanager.basemodule.imageloader.x2.m6782y(LargeIconHotAppViewHolder.this.ki(), data.imageUrl, this.f60720toq, com.android.thememanager.basemodule.imageloader.x2.fn3e().jk(0));
            this.f14212k.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.fn3e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f14363k.zy(data, view);
                }
            });
        }
    }

    public LargeIconHotAppViewHolder(@InterfaceC7396q @lvui View itemView, RecommendListViewAdapter adapter) {
        super(itemView, adapter);
        if (adapter != null && adapter.d2ok() == 0) {
            x9kr();
        }
        this.f14211z = new ArrayList(2);
        vyq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m8723e(String onlineId) {
        if (!C1819o.eqxt(ki())) {
            Log.d(f14204t, "getActivity(): is valid");
        } else if (TextUtils.isEmpty(onlineId)) {
            Log.d(f14204t, "onlineId: is null");
        } else {
            ki().startActivity(LargeIconAllActivity.z4(ki(), onlineId, null, true));
            m8726m("UI_PAGE", ((LargeIconHotAppCardElement) this.f9849q).trackId, null);
        }
    }

    public static LargeIconHotAppViewHolder hb(ViewGroup parent, RecommendListViewAdapter adapter) {
        return new LargeIconHotAppViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.large_icon_hot_app_card, parent, false), adapter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public void m8726m(String type, String trackId, String packageName) {
        String strKx3 = ni7() instanceof com.android.thememanager.basemodule.base.toq ? ((com.android.thememanager.basemodule.base.toq) ni7()).kx3() : null;
        String str = "UI_PAGE".equals(type) ? "more" : com.android.thememanager.basemodule.analysis.toq.of0c;
        ArrayMap arrayMap = new ArrayMap();
        if ("SEARCH".equals(type)) {
            arrayMap.put("app_package_name", packageName);
        }
        C1708s.f7l8().ld6().ni7(C1706p.m6650h(strKx3, trackId, null, str, arrayMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nn86(LargeIconHotAppCardElement largeIconHotAppCardElement, View view) {
        if (TextUtils.isEmpty(largeIconHotAppCardElement.onlineId)) {
            Log.w(f14204t, "setInfo: onlineId is null");
        } else {
            m8723e(largeIconHotAppCardElement.onlineId);
        }
    }

    private void vyq() {
        int i2 = y9n.fn3e().x;
        this.f14207i = ki().getResources().getDimensionPixelOffset(R.dimen.large_icon_hot_app_item_padding_bottom);
        this.f14208p = i2 / 5;
        this.f14206h = (i2 - (fn3e().getResources().getDimensionPixelSize(R.dimen.large_icon_hot_card_icon_spacing) * 10)) / 5;
        this.f14205g = (TextView) this.itemView.findViewById(R.id.hot_app_title);
        this.f14210y = (TextView) this.itemView.findViewById(R.id.hot_app_subTitle);
        GridLayout gridLayout = (GridLayout) this.itemView.findViewById(R.id.hot_app_grid_container);
        this.f14209s = gridLayout;
        gridLayout.setColumnCount(5);
        for (int i3 = 0; i3 < 10; i3++) {
            View viewInflate = LayoutInflater.from(fn3e()).inflate(R.layout.large_icon_hot_app_item, (ViewGroup) this.f14209s, false);
            this.f14209s.addView(viewInflate);
            this.f14211z.add(new C2420k(viewInflate));
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void o1t(final LargeIconHotAppCardElement item, int position) {
        super.o1t(item, position);
        this.f14205g.setText(item.title);
        List<UIImageWithLink> list = item.uiImageWithLinks;
        if (y9n.mcp(list)) {
            return;
        }
        int iMin = Math.min(list.size(), 10);
        for (int i2 = 0; i2 < iMin; i2++) {
            this.f14211z.get(i2).m8729q(list.get(i2));
        }
        this.f14210y.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14374k.nn86(item, view);
            }
        });
    }
}

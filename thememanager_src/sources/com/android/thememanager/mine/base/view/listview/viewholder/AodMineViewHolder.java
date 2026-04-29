package com.android.thememanager.mine.base.view.listview.viewholder;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.basemodule.views.BatchOperationAdapter.toq;
import i1.C6077k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AodMineViewHolder<T extends BatchOperationAdapter.toq> extends BatchOperationAdapter.BatchViewHolder<T> {

    /* JADX INFO: renamed from: h */
    protected TextView f12695h;

    /* JADX INFO: renamed from: i */
    protected TextView f12696i;

    /* JADX INFO: renamed from: p */
    protected TextView f12697p;

    /* JADX INFO: renamed from: s */
    protected TextView f12698s;

    /* JADX INFO: renamed from: y */
    protected ImageView f12699y;

    /* JADX INFO: renamed from: z */
    protected x2.C1735g f12700z;

    public AodMineViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12699y = (ImageView) itemView.findViewById(R.id.image);
        this.f12698s = (TextView) itemView.findViewById(android.R.id.title);
        this.f12697p = (TextView) itemView.findViewById(R.id.price);
        this.f12695h = (TextView) itemView.findViewById(R.id.incompatible);
        this.f12696i = (TextView) itemView.findViewById(R.id.current_using);
        Resources resources = ki().getResources();
        float fHb = adapter.hb();
        int dimension = (int) (fHb <= 0.0f ? resources.getDimension(R.dimen.detail_recommend_item_width) : fHb);
        float fraction = resources.getFraction(R.fraction.aod_thumbnail_default_ratio, dimension, dimension);
        this.f12699y.getLayoutParams().width = dimension;
        this.f12699y.getLayoutParams().height = (int) fraction;
        C6077k.o1t(itemView.findViewById(R.id.image_fl));
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.me_card_aod_thunmnail_padding_horizontal);
        itemView.setPaddingRelative(dimensionPixelSize, 0, dimensionPixelSize, resources.getDimensionPixelSize(R.dimen.me_card_aod_thunmnail_padding_bottom));
        this.f12700z = x2.fn3e();
        if (C1819o.d2ok(fn3e())) {
            this.f12700z.wvg(0);
        }
    }

    /* JADX INFO: renamed from: l */
    protected static View m8216l(ViewGroup parent, Context context) {
        return LayoutInflater.from(context).inflate(R.layout.me_item_aod, parent, false);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected View oc() {
        return this.itemView.findViewById(R.id.image_fl);
    }
}

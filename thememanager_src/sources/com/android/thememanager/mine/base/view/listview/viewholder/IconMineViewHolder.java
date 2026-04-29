package com.android.thememanager.mine.base.view.listview.viewholder;

import android.content.Context;
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
public abstract class IconMineViewHolder<T extends BatchOperationAdapter.toq> extends BatchOperationAdapter.BatchViewHolder<T> {

    /* JADX INFO: renamed from: h */
    protected TextView f12701h;

    /* JADX INFO: renamed from: i */
    protected TextView f12702i;

    /* JADX INFO: renamed from: p */
    protected TextView f12703p;

    /* JADX INFO: renamed from: s */
    protected TextView f12704s;

    /* JADX INFO: renamed from: y */
    protected ImageView f12705y;

    /* JADX INFO: renamed from: z */
    protected x2.C1735g f12706z;

    public IconMineViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter) {
        super(itemView, adapter);
        this.f12705y = (ImageView) itemView.findViewById(R.id.image);
        this.f12704s = (TextView) itemView.findViewById(R.id.title);
        this.f12703p = (TextView) itemView.findViewById(R.id.price);
        this.f12701h = (TextView) itemView.findViewById(R.id.current_using);
        this.f12702i = (TextView) itemView.findViewById(R.id.incompatible);
        this.f12706z = x2.fn3e().m6793r(x2.ki(C1819o.t8r(), 0.0f)).wvg(2);
        C6077k.o1t(itemView.findViewById(R.id.image_container));
    }

    /* JADX INFO: renamed from: l */
    protected static View m8217l(ViewGroup parent, Context context) {
        return LayoutInflater.from(context).inflate(R.layout.me_item_icon, parent, false);
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected View oc() {
        return this.itemView.findViewById(R.id.image_container);
    }
}

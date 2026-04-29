package com.android.thememanager.settings.subsettings;

import android.content.ActivityNotFoundException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.utils.C1803e;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.module.detail.view.nsb;
import i1.C6077k;
import yz.C7794k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WidgetListViewHolder extends BaseThemeAdapter.ViewHolder<C2615h> implements InterfaceC2616k {

    /* JADX INFO: renamed from: h */
    private static final String f15435h = "WidgetListModel";

    /* JADX INFO: renamed from: g */
    private final LinearLayout f15436g;

    /* JADX INFO: renamed from: p */
    private final TextView f15437p;

    /* JADX INFO: renamed from: s */
    private final TextView f15438s;

    /* JADX INFO: renamed from: y */
    private final ImageView f15439y;

    /* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.WidgetListViewHolder$k */
    class ViewOnClickListenerC2612k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C2615h f15440k;

        ViewOnClickListenerC2612k(final C2615h val$product) {
            this.f15440k = val$product;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            try {
                C2615h c2615h = this.f15440k;
                v2.getContext().startActivity(C1803e.m7041s(c2615h.f60875toq, c2615h.f15466s, c2615h.f60876zy));
                C1708s.f7l8().ld6().ni7(C1706p.kja0(((nsb) WidgetListViewHolder.this.ni7()).kx3(), this.f15440k.f60875toq, ""));
            } catch (ActivityNotFoundException unused) {
                C7794k.toq(WidgetListViewHolder.f15435h, "not found activity for startExternalActivity");
            }
        }
    }

    public WidgetListViewHolder(@lvui View itemView, @lvui WidgetAdapter adapter) {
        super(itemView, adapter);
        this.f15436g = (LinearLayout) itemView.findViewById(R.id.widget_item);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.widget_thumbnail);
        this.f15439y = imageView;
        this.f15438s = (TextView) itemView.findViewById(R.id.widget_title);
        this.f15437p = (TextView) itemView.findViewById(R.id.widget_count);
        C6077k.wvg(itemView.findViewById(R.id.wrap_widget_thumbnail), imageView);
    }

    /* JADX INFO: renamed from: t */
    private ViewGroup.LayoutParams m9169t(C2615h product) {
        int dimensionPixelOffset;
        if (product == null) {
            return null;
        }
        int i2 = product.f15464p;
        ViewGroup.LayoutParams layoutParams = this.f15436g.getLayoutParams();
        int dimensionPixelOffset2 = 0;
        switch (i2) {
            case 119:
                dimensionPixelOffset2 = ki().getResources().getDimensionPixelOffset(R.dimen.widget_1_2_width);
                dimensionPixelOffset = ki().getResources().getDimensionPixelOffset(R.dimen.widget_1_2_height);
                layoutParams.width = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_1_width);
                break;
            case 120:
                dimensionPixelOffset2 = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_1_width);
                dimensionPixelOffset = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_1_height);
                layoutParams.width = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_1_wrap_width);
                break;
            case 121:
                dimensionPixelOffset2 = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_2_width);
                dimensionPixelOffset = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_2_height);
                layoutParams.width = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_1_wrap_width);
                break;
            case 122:
                dimensionPixelOffset2 = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_3_width);
                dimensionPixelOffset = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_3_height);
                layoutParams.width = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_1_wrap_width);
                break;
            case 123:
                dimensionPixelOffset2 = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_4_width);
                dimensionPixelOffset = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_4_height);
                layoutParams.width = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_4_wrap_width);
                break;
            case 124:
                dimensionPixelOffset2 = ki().getResources().getDimensionPixelOffset(R.dimen.widget_4_4_width);
                dimensionPixelOffset = ki().getResources().getDimensionPixelOffset(R.dimen.widget_4_4_height);
                layoutParams.width = ki().getResources().getDimensionPixelOffset(R.dimen.widget_2_4_wrap_width);
                break;
            default:
                dimensionPixelOffset = 0;
                break;
        }
        ViewGroup.LayoutParams layoutParams2 = this.f15439y.getLayoutParams();
        layoutParams2.width = dimensionPixelOffset2;
        layoutParams2.height = dimensionPixelOffset;
        this.f15439y.setLayoutParams(layoutParams2);
        return layoutParams2;
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    /* JADX INFO: renamed from: n */
    public void mo9024n() {
        InterfaceC1719p interfaceC1719pM6706z = m6706z();
        if (interfaceC1719pM6706z != null) {
            interfaceC1719pM6706z.n5r1(fu4().f60875toq);
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: wvg, reason: merged with bridge method [inline-methods] */
    public void o1t(C2615h product, int position) {
        super.o1t(product, position);
        if (product == null) {
            return;
        }
        m9169t(product);
        com.android.thememanager.basemodule.imageloader.x2.zy(ki(), product.m9177k(fn3e()), this.f15439y);
        this.f15438s.setText(product.f60876zy);
        if (product.f15467y != 0) {
            this.f15437p.setText("（" + product.f15467y + "）");
        }
        C1812k.zy(product.f60876zy, this.f15439y);
        this.f15439y.setOnClickListener(new ViewOnClickListenerC2612k(product));
    }

    @Override // com.android.thememanager.settings.subsettings.InterfaceC2616k
    public void zy() {
        InterfaceC1719p interfaceC1719pM6706z = m6706z();
        if (interfaceC1719pM6706z != null) {
            interfaceC1719pM6706z.ncyb(fu4().f60875toq);
        }
    }
}

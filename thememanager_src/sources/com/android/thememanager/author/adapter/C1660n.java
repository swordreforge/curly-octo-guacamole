package com.android.thememanager.author.adapter;

import android.app.Activity;
import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.activity.C1582h;
import com.android.thememanager.activity.cv06;
import com.android.thememanager.basemodule.imageloader.NinePatchImageView;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.fu4;
import com.android.thememanager.util.bek6;
import com.android.thememanager.util.ch;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;

/* JADX INFO: renamed from: com.android.thememanager.author.adapter.n */
/* JADX INFO: compiled from: AuthorWidgetAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
public final class C1660n extends cv06 {
    public C1660n(@InterfaceC7395n Context context, @InterfaceC7395n fu4 fu4Var) {
        super(context, fu4Var);
    }

    @Override // com.android.thememanager.activity.cv06, com.android.thememanager.activity.pc
    /* JADX INFO: renamed from: r */
    protected void mo6401r(@InterfaceC7395n View view, @InterfaceC7395n Resource resource, int i2, int i3) {
        if (view == null || resource == null) {
            return;
        }
        ImageView imageView = (NinePatchImageView) view.findViewById(R.id.preview_image);
        TextView textView = (TextView) view.findViewById(R.id.title);
        TextView textView2 = (TextView) view.findViewById(R.id.brief);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.designer_container);
        d2ok.qrj(linearLayout);
        bek6.m9613g(linearLayout);
        textView.setText(resource.getTitle());
        textView2.setMaxLines(1);
        textView2.setText(resource.getBrief());
        if (textView2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            int dimensionPixelSize = m6465l().getResources().getDimensionPixelSize(R.dimen.author_suit_card_margin_bottom);
            ViewGroup.LayoutParams layoutParams = textView2.getLayoutParams();
            d2ok.n7h(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = dimensionPixelSize;
        }
        List<PathEntry> listM6463e = m6463e(resource, i3);
        PathEntry pathEntry = listM6463e.isEmpty() ? null : listM6463e.get(0);
        i1(imageView, nn86());
        nmn5(imageView, resource, pathEntry, i3);
    }

    @Override // com.android.thememanager.activity.pc
    protected void y9n() {
        Activity activity = this.f9313o.get();
        d2ok.qrj(activity);
        this.f57347bo = (int) activity.getResources().getDimension(R.dimen.default_horizontal_offset_from_screen_new);
        this.f9314u = (int) activity.getResources().getDimension(R.dimen.author_detail_item_gap);
        this.f9315v = 0;
        this.f9309d = 0;
        Pair<Integer, Integer> pairD3 = ch.d3(activity, this.f9310e.getDisplayType(), this.f57347bo, this.f9314u);
        Object first = pairD3.first;
        d2ok.kja0(first, "first");
        this.f9307a = ((Number) first).intValue();
        Object second = pairD3.second;
        d2ok.kja0(second, "second");
        this.f9317x = ((Number) second).intValue();
    }

    public C1660n(@InterfaceC7395n C1582h c1582h, @InterfaceC7395n fu4 fu4Var) {
        super(c1582h, fu4Var);
    }
}

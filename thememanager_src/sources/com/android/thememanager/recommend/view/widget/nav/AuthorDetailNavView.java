package com.android.thememanager.recommend.view.widget.nav;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.views.nav.NavItemView;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: AuthorDetailNavView.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class AuthorDetailNavView extends NavViewTopContainer {
    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6768s
    public AuthorDetailNavView(@InterfaceC7396q Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        d2ok.m23075h(context, "context");
    }

    public /* synthetic */ AuthorDetailNavView(Context context, AttributeSet attributeSet, int i2, ni7 ni7Var) {
        this(context, (i2 & 2) != 0 ? null : attributeSet);
    }

    @Override // com.android.thememanager.recommend.view.widget.nav.NavViewTopContainer
    /* JADX INFO: renamed from: p */
    protected void mo8847p(@InterfaceC7395n NavItemView navItemView) {
        ImageView imageView = this.f14593h;
        if (imageView != null) {
            imageView.setImageResource(R.drawable.me_author_detail_tab_bottom);
        }
        if (navItemView instanceof NavItemTopView) {
            ((NavItemTopView) navItemView).getTitleView().setTextSize(0, this.f14597r);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public AuthorDetailNavView(@InterfaceC7396q Context context, @InterfaceC7395n AttributeSet attributeSet) {
        super(context, attributeSet);
        d2ok.m23075h(context, "context");
        float dimension = getResources().getDimension(R.dimen.author_detail_nav_text_size);
        this.f14598t = dimension;
        this.f14597r = dimension;
    }
}

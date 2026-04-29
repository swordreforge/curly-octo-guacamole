package com.android.thememanager.mine.local.view.recyclerview.viewholder;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.views.BatchOperationAdapter;
import com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter;
import i1.C6077k;
import java.util.List;
import p029m.zy;
import zsr0.toq;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class LocalWallpaperViewHolder extends BatchOperationAdapter.BatchViewHolder<BaseLocalResourceAdapter.toq> {

    /* JADX INFO: renamed from: h */
    private boolean f12817h;

    /* JADX INFO: renamed from: p */
    private List<Resource> f12818p;

    /* JADX INFO: renamed from: s */
    private int f12819s;

    /* JADX INFO: renamed from: y */
    private ImageView f12820y;

    public LocalWallpaperViewHolder(@lvui View itemView, @lvui BatchOperationAdapter adapter, boolean isNightMode) {
        super(itemView, adapter);
        this.f12817h = isNightMode;
        this.f12820y = (ImageView) itemView.findViewById(R.id.thumbnail);
        C6077k.o1t(itemView);
    }

    /* JADX INFO: renamed from: l */
    private void m8262l(Resource resource) {
        TextView textView;
        if (toq.m28222q(((Activity) this.itemView.getContext()).getIntent()) || (textView = (TextView) this.itemView.findViewById(R.id.flag_using)) == null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        if (toq.m28221n(bf2.toq.toq(), resource, "lockscreen")) {
            sb.append(this.itemView.getContext().getString(R.string.current_using_lockscreen_wallpaper_text));
        }
        if (toq.m28221n(bf2.toq.toq(), resource, "wallpaper")) {
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(this.itemView.getContext().getString(R.string.current_using_desktop_wallpaper_text));
        }
        String string = sb.toString();
        if (zy.toq(string)) {
            textView.setVisibility(8);
        } else {
            textView.setText(string);
            textView.setVisibility(0);
        }
    }

    public static LocalWallpaperViewHolder n5r1(ViewGroup parent, BaseLocalResourceAdapter adapter, boolean isNightMode) {
        return new LocalWallpaperViewHolder(LayoutInflater.from(adapter.fn3e()).inflate(R.layout.me_item_local_wallpaper, parent, false), adapter, isNightMode);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder, com.android.thememanager.basemodule.base.BaseThemeAdapter.ViewHolder
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void o1t(com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter.toq r8, int r9) {
        /*
            r7 = this;
            super.o1t(r8, r9)
            com.android.thememanager.basemodule.resource.model.Resource r8 = r8.m8241k()
            if (r8 != 0) goto La
            return
        La:
            java.lang.String r0 = r8.getTitle()
            r1 = 2
            android.view.View[] r1 = new android.view.View[r1]
            android.view.View r2 = r7.itemView
            r3 = 0
            r1[r3] = r2
            android.widget.ImageView r2 = r7.f12820y
            r4 = 1
            r1[r4] = r2
            com.android.thememanager.basemodule.utils.C1812k.zy(r0, r1)
            com.android.thememanager.basemodule.base.BaseThemeAdapter r0 = r7.f9847k
            com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter r0 = (com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter) r0
            java.lang.String r0 = r0.c8jq()
            java.lang.String r0 = zsr0.toq.zy(r8, r0)
            boolean r1 = com.android.thememanager.basemodule.utils.o1t.m7179z()
            if (r1 == 0) goto L4d
            boolean r1 = com.android.thememanager.basemodule.resource.C1792n.nn86(r0)
            if (r1 != 0) goto L3c
            boolean r1 = com.android.thememanager.basemodule.resource.C1792n.hyr(r0)
            if (r1 == 0) goto L4d
        L3c:
            java.lang.String r1 = zsr0.toq.m28220k(r0)
            boolean r2 = p029m.zy.toq(r1)
            if (r2 != 0) goto L4d
            boolean r2 = r7.f12817h
            if (r2 == 0) goto L4b
            r0 = r1
        L4b:
            r1 = r4
            goto L4e
        L4d:
            r1 = r3
        L4e:
            com.android.thememanager.wallpaper.g r2 = com.android.thememanager.wallpaper.C2949g.f17747k
            boolean r2 = r2.ld6()
            if (r2 == 0) goto L59
            android.graphics.ColorSpace$Named r2 = android.graphics.ColorSpace.Named.DISPLAY_P3
            goto L5b
        L59:
            android.graphics.ColorSpace$Named r2 = android.graphics.ColorSpace.Named.LINEAR_SRGB
        L5b:
            java.lang.String r2 = r2.name()
            com.android.thememanager.basemodule.imageloader.x2$g r5 = com.android.thememanager.basemodule.imageloader.x2.fn3e()
            r6 = 0
            android.graphics.drawable.Drawable r9 = com.android.thememanager.basemodule.imageloader.x2.ki(r9, r6)
            com.android.thememanager.basemodule.imageloader.x2$g r9 = r5.m6793r(r9)
            com.android.thememanager.basemodule.imageloader.x2$g r9 = r9.dd(r2)
            com.android.thememanager.basemodule.imageloader.x2$g r9 = r9.m6792l(r4)
            androidx.fragment.app.q r2 = r7.ki()
            android.widget.ImageView r4 = r7.f12820y
            com.android.thememanager.basemodule.imageloader.x2.m6782y(r2, r0, r4, r9)
            android.view.View r9 = r7.itemView
            r0 = 2131427966(0x7f0b027e, float:1.8477563E38)
            android.view.View r9 = r9.findViewById(r0)
            android.widget.ImageView r9 = (android.widget.ImageView) r9
            if (r9 == 0) goto L92
            if (r1 == 0) goto L8d
            goto L8f
        L8d:
            r3 = 8
        L8f:
            r9.setVisibility(r3)
        L92:
            r7.m8262l(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.mine.local.view.recyclerview.viewholder.LocalWallpaperViewHolder.o1t(com.android.thememanager.mine.local.view.recyclerview.adapter.BaseLocalResourceAdapter$toq, int):void");
    }

    /* JADX INFO: renamed from: f */
    public void m8264f(List<Resource> resources) {
        this.f12818p = resources;
    }

    @Override // com.android.thememanager.basemodule.views.BatchOperationAdapter.BatchViewHolder
    protected void lvui() {
        com.android.thememanager.toq.jk(ki(), this.f12819s, 0, 1, this.f12818p);
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.l0u));
    }

    public void uv6(int mPosition) {
        this.f12819s = mPosition;
    }
}

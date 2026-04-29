package com.android.thememanager.recommend.view.listview.viewholder;

import android.content.Intent;
import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.mine.remote.view.activity.MineRemotePackageLargeIconActivity;
import com.android.thememanager.model.LargeIconElement;
import i1.C6077k;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: compiled from: LargeIconMoreViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class ni7 extends AbstractC2438g {
    public ni7(@InterfaceC7396q @lvui View itemView, com.android.thememanager.recommend.view.listview.zy adapter) {
        super(itemView, adapter);
        C6077k.cdj(itemView);
    }

    public static ni7 mcp(ViewGroup parent, com.android.thememanager.recommend.view.listview.zy adapter) {
        return new ni7(LayoutInflater.from(parent.getContext()).inflate(R.layout.large_icon_selector_more_resource, parent, false), adapter);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    /* JADX INFO: renamed from: t */
    protected void mo8787t() {
        super.mo8787t();
        ArrayMap<String, Object> arrayMapNi7 = ni7();
        if (arrayMapNi7 == null) {
            return;
        }
        arrayMapNi7.put("content", com.android.thememanager.basemodule.analysis.toq.kajn);
        arrayMapNi7.put(com.android.thememanager.basemodule.analysis.toq.a800, "yes");
        C1708s.f7l8().ld6().ni7(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.qlt6, null, arrayMapNi7));
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    /* JADX INFO: renamed from: z */
    protected void mo8788z(LargeIconElement element) {
        super.mo8788z(element);
        Intent intentSok = MineRemotePackageLargeIconActivity.sok(this.itemView.getContext(), "largeicons");
        intentSok.putExtra(MineRemotePackageLargeIconActivity.f12838d, element.packageName);
        if (fn3e().ni7() != null) {
            fn3e().ni7().startActivityForResult(intentSok, 6003);
        } else {
            ((AbstractActivityC1717k) this.itemView.getContext()).startActivityForResult(intentSok, 6003);
        }
    }
}

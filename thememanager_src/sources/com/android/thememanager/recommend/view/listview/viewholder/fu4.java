package com.android.thememanager.recommend.view.listview.viewholder;

import android.util.ArrayMap;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.recommend.view.C2451n;
import com.android.thememanager.router.recommend.entity.UILink;
import com.xiaomi.mipush.sdk.C5658n;
import i1.C6077k;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: compiled from: LargeIconPickerMoreViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public class fu4 extends AbstractC2438g {

    /* JADX INFO: renamed from: g */
    private View f14366g;

    public fu4(@InterfaceC7396q @lvui View itemView, com.android.thememanager.recommend.view.listview.zy adapter) {
        super(itemView, adapter);
        this.f14366g = itemView.findViewById(R.id.preview);
        C6077k.cdj(itemView);
    }

    public static fu4 mcp(ViewGroup parent, com.android.thememanager.recommend.view.listview.zy adapter) {
        return new fu4(LayoutInflater.from(parent.getContext()).inflate(R.layout.large_icon_picker_more_vh, parent, false), adapter);
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    public void o1t(LargeIconElement largeIconElement, int position) {
        super.o1t(largeIconElement, position);
        ViewGroup.LayoutParams layoutParams = this.f14366g.getLayoutParams();
        if (layoutParams == null || fn3e().m8796z() <= 0) {
            return;
        }
        layoutParams.width = fn3e().m8796z() - (bf2.toq.toq().getResources().getDimensionPixelOffset(R.dimen.large_icon_select_flag_margin) * 2);
        layoutParams.height = fn3e().m8796z() - (bf2.toq.toq().getResources().getDimensionPixelOffset(R.dimen.large_icon_select_flag_margin) * 2);
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
        arrayMapNi7.put(com.android.thememanager.basemodule.analysis.toq.a800, "no");
        C1708s.f7l8().ld6().ni7(C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.qlt6, null, arrayMapNi7));
    }

    @Override // com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g
    /* JADX INFO: renamed from: z */
    protected void mo8788z(LargeIconElement largeIconElement) {
        String str;
        String str2;
        super.mo8788z(largeIconElement);
        UILink uILink = new UILink();
        String str3 = largeIconElement.packageName;
        uILink.link = str3;
        uILink.type = "SEARCH";
        String[] strArrSplit = str3.split(C5658n.f73185t8r);
        if (strArrSplit.length > 1) {
            str = strArrSplit[0];
            str2 = strArrSplit[1];
        } else {
            str = largeIconElement.packageName;
            str2 = null;
        }
        uILink.title = com.android.thememanager.basemodule.utils.a9.m6996n(str, str2);
        C2451n.toq toqVarM8797g = C2451n.m8797g();
        toqVarM8797g.toq(InterfaceC1789q.fd23);
        toqVarM8797g.x2("largeicons");
        C2451n.m8803y((AbstractActivityC1717k) this.itemView.getContext(), null, uILink, toqVarM8797g);
    }
}

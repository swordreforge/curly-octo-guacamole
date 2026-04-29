package com.android.thememanager.recommend.view.listview.viewholder;

import android.util.ArrayMap;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.model.LargeIconElement;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.viewholder.g */
/* JADX INFO: compiled from: BaseLargeIconPickerViewHolder.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2438g extends RecyclerView.fti {

    /* JADX INFO: renamed from: k */
    protected LargeIconElement f14367k;

    /* JADX INFO: renamed from: n */
    protected int f14368n;

    /* JADX INFO: renamed from: q */
    protected com.android.thememanager.recommend.view.listview.zy f14369q;

    public AbstractC2438g(@InterfaceC7396q @lvui View itemView, com.android.thememanager.recommend.view.listview.zy adapter) {
        super(itemView);
        this.f14369q = adapter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fu4(LargeIconElement largeIconElement, View view) {
        mo8788z(largeIconElement);
    }

    public com.android.thememanager.recommend.view.listview.zy fn3e() {
        return this.f14369q;
    }

    protected ArrayMap<String, Object> ni7() {
        if (this.f14367k == null) {
            return null;
        }
        ArrayMap<String, Object> arrayMap = new ArrayMap<>();
        arrayMap.put("app_package_name", fn3e().fu4());
        arrayMap.put(com.android.thememanager.basemodule.analysis.toq.t2d, Integer.valueOf(this.f14368n));
        arrayMap.put("resourceType", "largeicons");
        return arrayMap;
    }

    public void o1t(final LargeIconElement element, int position) {
        this.f14367k = element;
        this.f14368n = position;
        this.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.listview.viewholder.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14386k.fu4(element, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    protected void mo8787t() {
    }

    public void wvg() {
    }

    /* JADX INFO: renamed from: z */
    protected void mo8788z(LargeIconElement element) {
        mo8787t();
    }
}

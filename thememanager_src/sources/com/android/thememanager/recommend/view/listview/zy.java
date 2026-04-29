package com.android.thememanager.recommend.view.listview;

import android.util.Log;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.ld6;
import com.android.thememanager.model.LargeIconElement;
import com.android.thememanager.module.detail.presenter.C2225g;
import com.android.thememanager.recommend.view.listview.viewholder.AbstractC2438g;
import com.android.thememanager.recommend.view.listview.viewholder.C2448z;
import com.android.thememanager.recommend.view.listview.viewholder.fu4;
import com.android.thememanager.recommend.view.listview.viewholder.ni7;
import com.android.thememanager.recommend.view.listview.viewholder.wvg;
import java.util.ArrayList;
import java.util.List;
import mub.InterfaceC7396q;
import zy.lvui;

/* JADX INFO: compiled from: LargeIconPickerAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends RecyclerView.AbstractC1060y<AbstractC2438g> {

    /* JADX INFO: renamed from: h */
    public static final int f14439h = 3;

    /* JADX INFO: renamed from: p */
    public static final int f14440p = 2;

    /* JADX INFO: renamed from: s */
    public static final int f14441s = 1;

    /* JADX INFO: renamed from: y */
    public static final int f14442y = 0;

    /* JADX INFO: renamed from: g */
    private com.android.thememanager.basemodule.base.toq f14443g;

    /* JADX INFO: renamed from: k */
    private C2225g f14444k;

    /* JADX INFO: renamed from: q */
    private int f14446q = -1;

    /* JADX INFO: renamed from: n */
    private List<LargeIconElement> f14445n = new ArrayList();

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.listview.zy$k */
    /* JADX INFO: compiled from: LargeIconPickerAdapter.java */
    class C2450k extends ld6.toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ List f14447k;

        C2450k(final List val$newList) {
            this.f14447k = val$newList;
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: k */
        public boolean mo4703k(int a2, int b2) {
            return ((LargeIconElement) zy.this.f14445n.get(a2)).equals((LargeIconElement) this.f14447k.get(b2));
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: n */
        public int mo4704n() {
            return zy.this.f14445n.size();
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: q */
        public int mo4705q() {
            return this.f14447k.size();
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        public boolean toq(int a2, int b2) {
            return ((LargeIconElement) zy.this.f14445n.get(a2)).equals((LargeIconElement) this.f14447k.get(b2));
        }
    }

    public zy(com.android.thememanager.basemodule.base.toq fragment, C2225g vm) {
        this.f14444k = vm;
        this.f14443g = fragment;
    }

    private List<LargeIconElement> fn3e() {
        return this.f14445n;
    }

    public String fu4() {
        C2225g c2225g = this.f14444k;
        if (c2225g != null) {
            return c2225g.b9ub(true);
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        List<LargeIconElement> listFn3e = fn3e();
        if (listFn3e == null) {
            return 0;
        }
        return listFn3e.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return fn3e().get(position).type;
    }

    public void ki(List<LargeIconElement> newList) {
        StringBuilder sb = new StringBuilder();
        sb.append("commitData: ");
        sb.append(newList == null ? null : Integer.valueOf(newList.size()));
        Log.i("LargeIcon", sb.toString());
        if (newList == null || newList.size() <= 0) {
            this.f14445n.clear();
            notifyDataSetChanged();
        } else {
            ld6.zy(new C2450k(newList), false).m5034n(this);
            this.f14445n.clear();
            this.f14445n.addAll(newList);
        }
    }

    public void mcp(int width) {
        this.f14446q = width;
    }

    public com.android.thememanager.basemodule.base.toq ni7() {
        return this.f14443g;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: o1t, reason: merged with bridge method [inline-methods] */
    public void mo6707z(@InterfaceC7396q @lvui AbstractC2438g holder, int position) {
        holder.o1t(fn3e().get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@InterfaceC7396q @lvui AbstractC2438g holder) {
        super.onViewAttachedToWindow(holder);
        holder.wvg();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: wvg, reason: merged with bridge method [inline-methods] */
    public AbstractC2438g onCreateViewHolder(@InterfaceC7396q @lvui ViewGroup parent, int viewType) {
        if (viewType == 0) {
            return wvg.lvui(parent, this.f14444k, this);
        }
        if (viewType == 1) {
            return ni7.mcp(parent, this);
        }
        if (viewType == 2) {
            return C2448z.m8790r(parent, this.f14444k, this);
        }
        if (viewType == 3) {
            return fu4.mcp(parent, this);
        }
        throw new RuntimeException("error view Type" + viewType);
    }

    /* JADX INFO: renamed from: z */
    public int m8796z() {
        return this.f14446q;
    }
}

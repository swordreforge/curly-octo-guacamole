package com.android.thememanager.superwallpaper.base;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import h7am.C6071k;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.superwallpaper.base.k */
/* JADX INFO: compiled from: BasePositionDetailAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2721k extends RecyclerView.AbstractC1060y<zy> {

    /* JADX INFO: renamed from: k */
    private AbstractC2723p f16107k;

    /* JADX INFO: renamed from: q */
    private boolean f16108q;

    public AbstractC2721k(@lvui Context activity, @lvui AbstractC2723p presenter) {
        this.f16107k = presenter;
        this.f16108q = com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().qrj() || com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().kja0();
    }

    public View cdj(ViewGroup parent) {
        return LayoutInflater.from(parent.getContext()).inflate(R.layout.super_wallpaper_land_position_view_holder, parent, false);
    }

    public boolean fn3e() {
        return this.f16108q;
    }

    public void fu4(int land) {
        Log.d(C6071k.f35077k, "click:" + land);
        this.f16107k.zy(land);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f16107k.f7l8().size();
    }

    public int ki() {
        return this.f16107k.m9496y();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @hyr(api = 23)
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(zy holder, int position) {
        holder.fu4(this.f16107k.f7l8().get(position), position);
    }
}

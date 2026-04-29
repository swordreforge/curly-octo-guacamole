package com.android.thememanager.v9.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.presenter.C2308g;
import com.android.thememanager.settings.superwallpaper.widget.ApkSuperWallpaperItemView;
import com.android.thememanager.v9.data.C2850g;
import com.android.thememanager.v9.data.C2852n;
import com.android.thememanager.v9.data.C2854q;
import com.android.thememanager.v9.holder.C2861k;
import com.android.thememanager.v9.holder.C2862q;
import com.android.thememanager.view.MtzSuperWallpaperItemView;
import java.util.ArrayList;
import java.util.HashMap;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.v9.adapter.k */
/* JADX INFO: compiled from: SuperWallpaperAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2844k extends RecyclerView.AbstractC1060y<RecyclerView.fti> {

    /* JADX INFO: renamed from: g */
    private static final int f17025g = 0;

    /* JADX INFO: renamed from: n */
    private static final int f17026n = -1;

    /* JADX INFO: renamed from: q */
    private static final String f17027q = "SuperWallpaperAdapter";

    /* JADX INFO: renamed from: s */
    private static HashMap<String, Integer> f17028s = null;

    /* JADX INFO: renamed from: y */
    private static final int f17029y = 1;

    /* JADX INFO: renamed from: k */
    private ArrayList<C2852n> f17030k;

    /* JADX INFO: renamed from: com.android.thememanager.v9.adapter.k$k */
    /* JADX INFO: compiled from: SuperWallpaperAdapter.java */
    public static class k extends RecyclerView.fti {
        public k(View itemView) {
            super(itemView);
            ((TextView) itemView.findViewById(R.id.super_wallpaper_list_footer)).setText(R.string.super_wallpaper_list_footer_text);
        }
    }

    static {
        HashMap<String, Integer> map = new HashMap<>();
        f17028s = map;
        map.put("apk", 0);
        f17028s.put(C2308g.f13473z, 1);
    }

    public ArrayList<C2852n> cdj() {
        return this.f17030k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        if (kja0.qrj(this.f17030k)) {
            return 0;
        }
        return this.f17030k.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        if (position == getItemCount() - 1) {
            return -1;
        }
        return f17028s.get(this.f17030k.get(position).f61467toq).intValue();
    }

    public void ki(ArrayList<C2852n> bannerDatas) {
        this.f17030k = bannerDatas;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(@lvui RecyclerView.fti holder, int position) {
        if (position < getItemCount() - 1) {
            if (holder instanceof C2862q) {
                ((C2862q) holder).ki(position, (C2850g) this.f17030k.get(position));
            } else if (holder instanceof C2861k) {
                ((C2861k) holder).ki(position, (C2854q) this.f17030k.get(position));
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    public RecyclerView.fti onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        return viewType != -1 ? viewType != 1 ? new C2861k((ApkSuperWallpaperItemView) LayoutInflater.from(parent.getContext()).inflate(R.layout.super_wallpaper_item_apk, parent, false)) : new C2862q((MtzSuperWallpaperItemView) LayoutInflater.from(parent.getContext()).inflate(R.layout.super_wallpaper_item_mtz, parent, false)) : new k(LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_footer, parent, false));
    }
}

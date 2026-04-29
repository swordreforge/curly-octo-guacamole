package com.android.thememanager.settings.subsettings;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.ld6;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.BaseThemeAdapter;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class WallpaperSubVAdapter extends BaseThemeAdapter<f7l8, BaseThemeAdapter.ViewHolder> {

    /* JADX INFO: renamed from: r */
    private static final int f15425r = 3;

    /* JADX INFO: renamed from: t */
    private static final int f15426t = 2;

    /* JADX INFO: renamed from: z */
    public static final String f15427z = "WallpaperSubVAdapter";

    /* JADX INFO: renamed from: g */
    private final int f15428g;

    /* JADX INFO: renamed from: h */
    private float f15429h;

    /* JADX INFO: renamed from: i */
    private Runnable f15430i;

    /* JADX INFO: renamed from: p */
    private boolean f15431p;

    /* JADX INFO: renamed from: s */
    private List<f7l8> f15432s;

    /* JADX INFO: renamed from: y */
    private final boolean f15433y;

    /* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.WallpaperSubVAdapter$k */
    class C2611k extends ld6.toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ List f15434k;

        C2611k(final List val$list) {
            this.f15434k = val$list;
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: k */
        public boolean mo4703k(int a2, int b2) {
            return ((f7l8) WallpaperSubVAdapter.this.f15432s.get(a2)).equals(this.f15434k.get(b2));
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: n */
        public int mo4704n() {
            return WallpaperSubVAdapter.this.f15432s.size();
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        /* JADX INFO: renamed from: q */
        public int mo4705q() {
            return this.f15434k.size();
        }

        @Override // androidx.recyclerview.widget.ld6.toq
        public boolean toq(int a2, int b2) {
            return ((f7l8) WallpaperSubVAdapter.this.f15432s.get(a2)).equals((f7l8) this.f15434k.get(b2));
        }
    }

    public WallpaperSubVAdapter(InterfaceC1719p activity, boolean f2) {
        super(activity);
        this.f15428g = 1;
        this.f15432s = new ArrayList();
        this.f15431p = false;
        this.f15429h = 1.0f;
        this.f15433y = f2;
    }

    public void d2ok() {
        this.f15432s.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: dd, reason: merged with bridge method [inline-methods] */
    public void onViewAttachedToWindow(@lvui BaseThemeAdapter.ViewHolder holder) {
        if (holder instanceof InterfaceC2616k) {
            ((InterfaceC2616k) holder).mo9024n();
        }
    }

    /* JADX INFO: renamed from: f */
    public void m9165f() {
        int i2 = 0;
        int i3 = -1;
        for (int i4 = 0; i4 < this.f15432s.size(); i4++) {
            if (this.f15432s.get(i4).f15451k == 2) {
                i2++;
                if (-1 == i3) {
                    i3 = i4;
                }
            }
        }
        if (i3 != -1) {
            notifyItemRangeChanged(i3, i2, 3);
        }
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        int size = this.f15432s.size();
        if (!this.f15433y) {
            return size;
        }
        if (size == 0) {
            return 0;
        }
        return size + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return position == this.f15432s.size() ? 1 : 0;
    }

    /* JADX INFO: renamed from: l */
    public void m9166l(int type, List<f7l8> list, boolean hasAnimation) {
        if (this.f15432s.size() <= 0 || type != 1) {
            ncyb(list);
        } else if (this.f15432s.get(0).f15451k == type) {
            this.f15432s.set(0, list.get(0));
            notifyItemChanged(0, 2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui BaseThemeAdapter.ViewHolder vh, int i2, @lvui List<Object> payloads) {
        if (payloads.isEmpty()) {
            onBindViewHolder(vh, i2);
        }
        List<f7l8> list = this.f15432s;
        for (Object obj : payloads) {
            if ((obj instanceof Integer) && (vh instanceof WallpaperSingleLineViewHolder)) {
                f7l8 f7l8Var = list.get(i2);
                Integer num = (Integer) obj;
                if (2 == num.intValue()) {
                    ((WallpaperSingleLineViewHolder) vh).dd(f7l8Var);
                } else if (3 == num.intValue()) {
                    ((WallpaperSingleLineViewHolder) vh).m9164r(f7l8Var);
                }
            }
        }
    }

    public void n5r1(Runnable r2) {
        this.f15430i = r2;
    }

    public void ncyb(List<f7l8> list) {
        androidx.recyclerview.widget.ld6.zy(new C2611k(list), false).m5034n(this);
        this.f15432s.clear();
        this.f15432s.addAll(list);
        Log.i(f15427z, "setAllData: size of list = " + list.size() + ", size of data: = " + this.f15432s.size());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public BaseThemeAdapter.ViewHolder onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        return viewType == 1 ? new MoreWallpaperBtnViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.wallpaper_more_btn, parent, false), this) : new WallpaperSingleLineViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.wallpaper_horizontal_list, parent, false), this, this.f15431p, this.f15429h);
    }

    @Override // com.android.thememanager.basemodule.base.BaseThemeAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: wvg */
    public void onBindViewHolder(@lvui BaseThemeAdapter.ViewHolder vh, int position) {
        if (vh instanceof WallpaperSingleLineViewHolder) {
            ((WallpaperSingleLineViewHolder) vh).lvui(this.f15432s.get(position));
            if (this.f15430i == null || position < this.f15432s.size() - 2) {
                return;
            }
            this.f15430i.run();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: x9kr, reason: merged with bridge method [inline-methods] */
    public void onViewDetachedFromWindow(@lvui BaseThemeAdapter.ViewHolder holder) {
        if (holder instanceof InterfaceC2616k) {
            ((InterfaceC2616k) holder).zy();
        }
    }

    public WallpaperSubVAdapter(InterfaceC1719p activity, boolean f2, boolean isNightMode, float imageScalingFactor) {
        super(activity);
        this.f15428g = 1;
        this.f15432s = new ArrayList();
        this.f15433y = f2;
        this.f15431p = isNightMode;
        this.f15429h = imageScalingFactor;
    }
}

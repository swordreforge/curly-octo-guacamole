package com.android.thememanager.settings.subsettings;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.fn3e;
import androidx.recyclerview.widget.ld6;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.base.C1718n;
import com.android.thememanager.basemodule.base.InterfaceC1719p;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1812k;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: compiled from: WallpaperSubHAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class qrj extends fn3e<Resource, RecyclerView.fti> {

    /* JADX INFO: renamed from: i */
    private static final int f15485i = 2;

    /* JADX INFO: renamed from: l */
    private static final int f15486l = 1;

    /* JADX INFO: renamed from: r */
    public static final int f15487r = 5;

    /* JADX INFO: renamed from: t */
    private static final int f15488t = 4;

    /* JADX INFO: renamed from: z */
    private static final int f15489z = 3;

    /* JADX INFO: renamed from: g */
    private int f15490g;

    /* JADX INFO: renamed from: h */
    private float f15491h;

    /* JADX INFO: renamed from: n */
    private List<Resource> f15492n;

    /* JADX INFO: renamed from: p */
    private boolean f15493p;

    /* JADX INFO: renamed from: s */
    private final C1718n f15494s;

    /* JADX INFO: renamed from: y */
    private int f15495y;

    /* JADX INFO: renamed from: com.android.thememanager.settings.subsettings.qrj$k */
    /* JADX INFO: compiled from: WallpaperSubHAdapter.java */
    class C2620k extends ld6.AbstractC1092g<Resource> {
        C2620k() {
        }

        @Override // androidx.recyclerview.widget.ld6.AbstractC1092g
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public boolean toq(@lvui Resource a2, @lvui Resource b2) {
            String contentPath;
            String contentPath2;
            if ((TextUtils.isEmpty(a2.getOnlineId()) || TextUtils.isEmpty(b2.getOnlineId())) ? false : true) {
                contentPath = a2.getOnlineId();
                contentPath2 = b2.getOnlineId();
            } else {
                contentPath = a2.getContentPath();
                contentPath2 = b2.getContentPath();
            }
            return TextUtils.equals(contentPath, contentPath2);
        }

        @Override // androidx.recyclerview.widget.ld6.AbstractC1092g
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public boolean mo5028k(@lvui Resource a2, @lvui Resource b2) {
            String contentPath;
            String contentPath2;
            if ((TextUtils.isEmpty(a2.getOnlineId()) || TextUtils.isEmpty(b2.getOnlineId())) ? false : true) {
                contentPath = a2.getOnlineId();
                contentPath2 = b2.getOnlineId();
            } else {
                contentPath = a2.getContentPath();
                contentPath2 = b2.getContentPath();
            }
            return TextUtils.equals(contentPath, contentPath2);
        }
    }

    qrj(@lvui InterfaceC1719p vContainer, boolean isNightMode, float imageScalingFactor) {
        super(new C2620k());
        this.f15492n = null;
        this.f15491h = 1.0f;
        this.f15493p = isNightMode;
        C1718n c1718n = new C1718n(vContainer);
        this.f15494s = c1718n;
        boolean z2 = false;
        if ("com.miui.aod".equals(c1718n.m6716k().getCallingPackage()) && c1718n.m6716k().getIntent().getBooleanExtra(com.android.thememanager.f7l8.f58072zy, false)) {
            z2 = true;
        }
        c1718n.m6717n(z2);
        this.f15491h = imageScalingFactor;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemViewType(int position) {
        return this.f15495y == 10 ? this.f15490g == 8 ? 5 : 3 : position == 0 ? 4 : 2;
    }

    void o1t() {
        notifyItemRangeChanged(0, getItemCount(), 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(@lvui RecyclerView.fti vh, int pos) {
        if (vh instanceof C2619q) {
            ((C2619q) vh).oc(this.f15490g, this.f15492n, pos);
        }
        View view = vh.itemView;
        C1812k.toq(view, view.getContext().getString(R.string.de_order, Integer.valueOf(pos + 1)));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    public RecyclerView.fti onCreateViewHolder(@lvui ViewGroup parent, int viewType) {
        return viewType != 2 ? viewType != 3 ? viewType != 5 ? new C2619q(LayoutInflater.from(parent.getContext()).inflate(R.layout.wallpaper_settings_my_item3, parent, false), this.f15494s, this.f15493p, this.f15491h) : new C2619q(LayoutInflater.from(parent.getContext()).inflate(R.layout.wallpaper_settings_my_item_fold_dynamic, parent, false), this.f15494s, this.f15493p, this.f15491h) : new C2619q(LayoutInflater.from(parent.getContext()).inflate(R.layout.wallpaper_settings_my_item2, parent, false), this.f15494s, this.f15493p, this.f15491h) : new C2619q(LayoutInflater.from(parent.getContext()).inflate(R.layout.wallpaper_settings_my_item, parent, false), this.f15494s, this.f15493p, this.f15491h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewAttachedToWindow(@lvui RecyclerView.fti holder) {
        if (holder instanceof InterfaceC2616k) {
            ((InterfaceC2616k) holder).mo9024n();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onViewDetachedFromWindow(@lvui RecyclerView.fti holder) {
        if (holder instanceof InterfaceC2616k) {
            ((InterfaceC2616k) holder).zy();
        }
    }

    /* JADX INFO: renamed from: z */
    void m9182z(f7l8 data) {
        this.f15490g = data.f15451k;
        this.f15495y = data.f60864toq;
        ArrayList arrayList = new ArrayList();
        this.f15492n = arrayList;
        arrayList.addAll(data.f60866zy);
        ni7(this.f15492n);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public void onBindViewHolder(@lvui RecyclerView.fti holder, int position, @lvui List<Object> payloads) {
        if (payloads.isEmpty()) {
            super.onBindViewHolder(holder, position, payloads);
            return;
        }
        for (Object obj : payloads) {
            if ((obj instanceof Integer) && ((Integer) obj).intValue() == 1) {
                ((C2619q) holder).mcp(this.f15490g, ki(position));
            }
        }
    }
}

package com.android.thememanager.settings.superwallpaper.adapter;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.settings.superwallpaper.C2656k;
import zy.hyr;

/* JADX INFO: compiled from: PositionListRecyclerViewAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends RecyclerView.AbstractC1060y<toq> {

    /* JADX INFO: renamed from: y */
    private static final String f15676y = "zy";

    /* JADX INFO: renamed from: g */
    private Context f15677g;

    /* JADX INFO: renamed from: k */
    private Icon[] f15678k;

    /* JADX INFO: renamed from: n */
    private InterfaceC2649k f15679n;

    /* JADX INFO: renamed from: q */
    private int f15680q;

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.adapter.zy$k */
    /* JADX INFO: compiled from: PositionListRecyclerViewAdapter.java */
    public interface InterfaceC2649k {
        /* JADX INFO: renamed from: k */
        void mo9225k(int position);
    }

    /* JADX INFO: compiled from: PositionListRecyclerViewAdapter.java */
    public class toq extends RecyclerView.fti {

        /* JADX INFO: renamed from: k */
        private ImageView f15682k;

        /* JADX INFO: renamed from: n */
        private ViewOutlineProvider f15683n;

        /* JADX INFO: renamed from: q */
        private ImageView f15684q;

        /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.adapter.zy$toq$k */
        /* JADX INFO: compiled from: PositionListRecyclerViewAdapter.java */
        class C2650k extends ViewOutlineProvider {
            C2650k() {
            }

            @Override // android.view.ViewOutlineProvider
            public void getOutline(View view, Outline outline) {
                outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), 30.0f);
            }
        }

        public toq(View itemView) {
            super(itemView);
            this.f15683n = new C2650k();
            ImageView imageView = (ImageView) itemView.findViewById(R.id.image);
            this.f15682k = imageView;
            imageView.setOutlineProvider(this.f15683n);
            this.f15682k.setClipToOutline(true);
            this.f15684q = (ImageView) itemView.findViewById(R.id.background);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fn3e(int i2, View view) {
            Log.i(zy.f15676y, "onclick ");
            zy.this.f15680q = i2;
            zy.this.notifyDataSetChanged();
            zy.this.f15679n.mo9225k(zy.this.f15680q);
        }

        public void ni7(Drawable drawable, final int position) {
            if (zy.this.f15680q == position) {
                this.f15684q.setVisibility(0);
            } else {
                this.f15684q.setVisibility(8);
            }
            this.f15682k.setImageDrawable(drawable);
            this.f15682k.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.superwallpaper.adapter.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15668k.fn3e(position, view);
                }
            });
        }
    }

    public zy(Context activity, Icon[] list, String wpName, InterfaceC2649k callBack) {
        this.f15677g = activity;
        this.f15678k = list;
        this.f15679n = callBack;
        this.f15680q = C2656k.m9242n(activity, wpName);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @hyr(api = 23)
    /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(toq holder, int position) {
        holder.ni7(this.f15678k[position].loadDrawable(this.f15677g), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f15678k.length;
    }

    public void o1t(Icon[] list) {
        this.f15678k = list;
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public toq onCreateViewHolder(ViewGroup parent, int viewType) {
        return new toq(LayoutInflater.from(parent.getContext()).inflate(R.layout.position_list_stagger_item, parent, false));
    }
}

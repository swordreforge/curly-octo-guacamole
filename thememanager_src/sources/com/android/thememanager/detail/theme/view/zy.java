package com.android.thememanager.detail.theme.view;

import android.graphics.Bitmap;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.AsyncTaskC1733q;
import com.android.thememanager.basemodule.imageloader.x2;
import com.android.thememanager.basemodule.utils.C1812k;
import com.android.thememanager.basemodule.utils.qrj;
import i1.C6077k;
import java.util.List;
import zy.lvui;

/* JADX INFO: compiled from: ResourceDetailPreviewAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends RecyclerView.AbstractC1060y<toq> {

    /* JADX INFO: renamed from: g */
    private InterfaceC2004k f11406g;

    /* JADX INFO: renamed from: k */
    private List<String> f11407k;

    /* JADX INFO: renamed from: n */
    private int f11408n;

    /* JADX INFO: renamed from: q */
    private int f11409q;

    /* JADX INFO: renamed from: y */
    private String f11410y;

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.zy$k */
    /* JADX INFO: compiled from: ResourceDetailPreviewAdapter.java */
    public interface InterfaceC2004k {
        /* JADX INFO: renamed from: k */
        void mo7820k(int position);
    }

    /* JADX INFO: compiled from: ResourceDetailPreviewAdapter.java */
    public static class toq extends RecyclerView.fti {

        /* JADX INFO: renamed from: g */
        private AsyncTaskC1733q.k f11411g;

        /* JADX INFO: renamed from: k */
        private ImageView f11412k;

        /* JADX INFO: renamed from: n */
        private int f11413n;

        /* JADX INFO: renamed from: q */
        private int f11414q;

        /* JADX INFO: renamed from: y */
        private String f11415y;

        /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.zy$toq$k */
        /* JADX INFO: compiled from: ResourceDetailPreviewAdapter.java */
        class C2005k implements AsyncTaskC1733q.k {
            C2005k() {
            }

            @Override // com.android.thememanager.basemodule.imageloader.AsyncTaskC1733q.k
            public void ld6(String key, Bitmap bitmap) {
                if (bitmap != null) {
                    toq.this.f11412k.setImageBitmap(bitmap);
                }
            }
        }

        public toq(View itemView, int w2, int h2, String version) {
            super(itemView);
            this.f11414q = w2;
            this.f11413n = h2;
            this.f11415y = version;
            this.f11412k = (ImageView) itemView.findViewById(R.id.content_wallpaper);
            this.f11411g = new C2005k();
        }

        public void fn3e(String previewUrl) {
            this.f11412k.setBackground(x2.ki(x2.x2(), 0.0f));
            new AsyncTaskC1733q(previewUrl, Bitmap.Config.ARGB_8888, this.f11414q, this.f11413n, 2, this.f11411g, this.f11415y, qrj.zy(qrj.toq.THEME_DETAIL)).toq();
        }
    }

    public zy(List<String> previewUrls, int itemWidth, int itemHeight, String version) {
        this.f11407k = previewUrls;
        this.f11409q = itemWidth;
        this.f11408n = itemHeight;
        this.f11410y = version;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fn3e(int i2, View view) {
        InterfaceC2004k interfaceC2004k = this.f11406g;
        if (interfaceC2004k != null) {
            interfaceC2004k.mo7820k(i2);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    @lvui
    /* JADX INFO: renamed from: fu4, reason: merged with bridge method [inline-methods] */
    public toq onCreateViewHolder(@lvui ViewGroup viewGroup, int i2) {
        if (getItemCount() != 1) {
            CardView cardView = (CardView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.de_detail_preview_item_no_wrap, viewGroup, false);
            cardView.setLayoutParams(new ViewGroup.LayoutParams(this.f11409q, this.f11408n));
            cardView.setForeground(viewGroup.getContext().getDrawable(R.drawable.aod_item_foreground_frame));
            return new toq(cardView, this.f11409q, this.f11408n, this.f11410y);
        }
        View viewInflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.de_detail_preview_item, viewGroup, false);
        CardView cardView2 = (CardView) viewInflate.findViewById(R.id.thumbnail);
        cardView2.getLayoutParams().width = this.f11409q;
        cardView2.getLayoutParams().height = this.f11408n;
        return new toq(viewInflate, this.f11409q, this.f11408n, this.f11410y);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f11407k.size();
    }

    public List<String> ki() {
        return this.f11407k;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(@lvui toq viewHolder, final int i2) {
        viewHolder.fn3e(this.f11407k.get(i2));
        viewHolder.itemView.findViewById(R.id.content_wallpaper).setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.detail.theme.view.toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11194k.fn3e(i2, view);
            }
        });
        C1812k.toq(viewHolder.f11412k, String.format("%s %d", viewHolder.itemView.getContext().getString(R.string.de_preview), Integer.valueOf(i2 + 1)));
        if (Build.VERSION.SDK_INT < 31) {
            C6077k.wvg(viewHolder.itemView, viewHolder.f11412k);
        }
    }

    public void o1t(InterfaceC2004k onItemClickListener) {
        this.f11406g = onItemClickListener;
    }

    /* JADX INFO: renamed from: z */
    public void m7831z(List<String> previewUrls) {
        this.f11407k = previewUrls;
    }
}

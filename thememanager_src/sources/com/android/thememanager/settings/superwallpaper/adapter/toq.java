package com.android.thememanager.settings.superwallpaper.adapter;

import android.app.Activity;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.R;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.android.thememanager.settings.superwallpaper.utils.x2;
import com.bumptech.glide.load.resource.bitmap.C3113s;
import java.util.List;

/* JADX INFO: compiled from: OnlineWallpaperRecyclerViewAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq extends RecyclerView.AbstractC1060y<C2648k> {

    /* JADX INFO: renamed from: n */
    private static final String f15670n = "toq";

    /* JADX INFO: renamed from: k */
    private Activity f15671k;

    /* JADX INFO: renamed from: q */
    private List<UIImageWithLink> f15672q;

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.adapter.toq$k */
    /* JADX INFO: compiled from: OnlineWallpaperRecyclerViewAdapter.java */
    public static class C2648k extends RecyclerView.fti {

        /* JADX INFO: renamed from: k */
        private ImageView f15673k;

        /* JADX INFO: renamed from: q */
        private Activity f15674q;

        /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.adapter.toq$k$k */
        /* JADX INFO: compiled from: OnlineWallpaperRecyclerViewAdapter.java */
        class k extends AsyncTask<Void, Void, String> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ UIImageWithLink f15675k;

            k(final UIImageWithLink val$uiImageWithLink) {
                this.f15675k = val$uiImageWithLink;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public String doInBackground(Void... params) {
                return x2.toq(C2648k.this.f15674q, this.f15675k);
            }

            @Override // android.os.AsyncTask
            protected void onPreExecute() {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
                alphaAnimation.setDuration(300L);
                C2648k.this.f15673k.startAnimation(alphaAnimation);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public void onPostExecute(String result) {
                Log.d(toq.f15670n, "setInfo local uri = " + result);
                if (C2648k.this.f15674q == null || C2648k.this.f15674q.isFinishing() || C2648k.this.f15674q.isDestroyed()) {
                    return;
                }
                com.bumptech.glide.zy.mcp(C2648k.this.f15674q).zurt().mo6748i(result).o05(new C3113s().kja0(500)).ixz(C2648k.this.f15673k);
            }
        }

        public C2648k(Activity activity, View itemView) {
            super(itemView);
            this.f15674q = activity;
            this.f15673k = (ImageView) itemView.findViewById(R.id.image);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void fu4(UIImageWithLink uIImageWithLink, View view) {
            Log.d(toq.f15670n, "onclick ");
            x2.f7l8(this.f15674q, uIImageWithLink);
        }

        /* JADX INFO: renamed from: z */
        public void m9228z(final UIImageWithLink uiImageWithLink, int position) {
            Log.d(toq.f15670n, "uiImageWithLink = " + uiImageWithLink.link.type + " " + uiImageWithLink.title);
            new k(uiImageWithLink).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            this.f15673k.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.superwallpaper.adapter.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15666k.fu4(uiImageWithLink, view);
                }
            });
        }
    }

    public toq(Activity activity, List<UIImageWithLink> list) {
        this.f15671k = activity;
        this.f15672q = list;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: fn3e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C2648k holder, int position) {
        holder.m9228z(this.f15672q.get(position), position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    public int getItemCount() {
        return this.f15672q.size();
    }

    public List ki() {
        return this.f15672q;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1060y
    /* JADX INFO: renamed from: ni7, reason: merged with bridge method [inline-methods] */
    public C2648k onCreateViewHolder(ViewGroup parent, int viewType) {
        return new C2648k(this.f15671k, LayoutInflater.from(parent.getContext()).inflate(R.layout.wallpaper_setting_stagger_item, parent, false));
    }
}

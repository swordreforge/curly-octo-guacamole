package com.android.thememanager.settings.personalize.holder;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.AsyncTask;
import android.util.Log;
import android.util.Pair;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.lifecycle.InterfaceC0954z;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.x9kr;
import com.android.thememanager.settings.personalize.ld6;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import ek5k.C6002g;
import i1.C6077k;
import java.lang.ref.WeakReference;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class NotifyCardHolder extends BottomViewHolder {

    /* JADX INFO: renamed from: i */
    private static final String f15239i = "NotifyCardHolder";

    /* JADX INFO: renamed from: h */
    private AsyncTaskC2559k f15240h;

    /* JADX INFO: renamed from: p */
    private ImageView f15241p;

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.holder.NotifyCardHolder$k */
    private static class AsyncTaskC2559k extends AsyncTask<Void, Void, Pair<String, Bitmap>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<NotifyCardHolder> f15242k;

        public AsyncTaskC2559k(NotifyCardHolder notifyCardHolder) {
            this.f15242k = new WeakReference<>(notifyCardHolder);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Pair<String, Bitmap> doInBackground(Void... voids) {
            if (this.f15242k.get() == null || isCancelled()) {
                return null;
            }
            return C2663k.m9271y(bf2.toq.toq());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Pair<String, Bitmap> result) {
            if (this.f15242k.get() != null) {
                this.f15242k.get().m9061t(result);
            }
        }
    }

    public NotifyCardHolder(final Activity activity, View itemView) {
        super(activity, itemView);
        this.f15241p = (ImageView) itemView.findViewById(R.id.preview_img);
        FrameLayout frameLayout = (FrameLayout) itemView.findViewById(R.id.img_fl);
        this.f15241p.setContentDescription(activity.getResources().getString(R.string.personalize_notify_style_title));
        C6077k.o1t(frameLayout);
        frameLayout.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.personalize.holder.zy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15253k.mcp(activity, view);
            }
        });
        jk();
    }

    private void jk() {
        AsyncTaskC2559k asyncTaskC2559k = this.f15240h;
        if (asyncTaskC2559k == null || asyncTaskC2559k.getStatus() != AsyncTask.Status.RUNNING) {
            AsyncTaskC2559k asyncTaskC2559k2 = new AsyncTaskC2559k(this);
            this.f15240h = asyncTaskC2559k2;
            asyncTaskC2559k2.executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void mcp(Activity activity, View view) {
        Intent intent = new Intent();
        intent.setClassName("com.miui.aod", ld6.f60815x2);
        intent.putExtra(x9kr.f10438g, "personalize");
        if (C1807g.m7081r()) {
            C1819o.m7160n(intent);
        }
        try {
            activity.startActivity(intent);
        } catch (Exception e2) {
            Log.e(f15239i, e2.getMessage());
        }
        C1708s.f7l8().ld6().ni7(C1706p.kja0("personalize", o1t(), ""));
    }

    @Override // com.android.thememanager.settings.personalize.holder.BottomViewHolder
    public String o1t() {
        return com.android.thememanager.basemodule.analysis.toq.da;
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void onDestroy(@lvui InterfaceC0954z owner) {
        ImageView imageView = this.f15241p;
        if (imageView != null) {
            imageView.setImageBitmap(null);
            this.f15241p = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public void m9061t(Pair<String, Bitmap> result) {
        ImageView imageView = this.f15241p;
        if (imageView == null) {
            Log.d(f15239i, "preview is null.");
            return;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        if (result == null) {
            this.f15241p.setBackground(null);
            layoutParams.width = (int) this.f15230k.getResources().getDimension(R.dimen.personalize_notify_card_preview_width);
            layoutParams.height = (int) this.f15230k.getResources().getDimension(R.dimen.personalize_notify_card_preview_height);
            int dimension = (int) this.f15230k.getResources().getDimension(R.dimen.personalize_border_width);
            this.f15241p.setPadding(dimension, dimension, dimension, dimension);
            this.f15241p.setImageResource(R.drawable.personalize_notify_no_style);
            Log.d(f15239i, "result is null.");
            return;
        }
        String str = (String) result.first;
        Bitmap bitmap = (Bitmap) result.second;
        if (bitmap == null || bitmap.isRecycled() || "none".equals(str)) {
            this.f15241p.setImageResource(R.drawable.personalize_notify_no_style);
            this.f15241p.setBackground(null);
            this.f15241p.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            int dimension2 = (int) this.f15230k.getResources().getDimension(R.dimen.personalize_border_width);
            this.f15241p.setPadding(dimension2, dimension2, dimension2, dimension2);
            layoutParams.width = (int) this.f15230k.getResources().getDimension(R.dimen.personalize_notify_card_preview_width);
            layoutParams.height = (int) this.f15230k.getResources().getDimension(R.dimen.personalize_notify_card_preview_height);
            Log.d(f15239i, "show default.");
            return;
        }
        if (ld6.f60812n7h.equals(str)) {
            this.f15241p.setImageResource(R.drawable.personalize_notify_style_screen_on);
            this.f15241p.setBackground(null);
            this.f15241p.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
            this.f15241p.setPadding(0, 0, 0, 0);
            layoutParams.width = (int) this.f15230k.getResources().getDimension(R.dimen.personalize_notify_card_screen_on_width);
            layoutParams.height = (int) this.f15230k.getResources().getDimension(R.dimen.personalize_notify_card_screen_on_height);
            return;
        }
        this.f15241p.setImageBitmap(bitmap);
        this.f15241p.setBackgroundResource(R.drawable.personalize_notify_preview_bg_shape);
        this.f15241p.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
        int dimension3 = (int) this.f15230k.getResources().getDimension(R.dimen.personalize_border_width);
        this.f15241p.setPadding(dimension3, dimension3, dimension3, dimension3);
        layoutParams.width = (int) this.f15230k.getResources().getDimension(R.dimen.personalize_notify_card_preview_width);
        layoutParams.height = (int) this.f15230k.getResources().getDimension(R.dimen.personalize_notify_card_preview_height);
    }

    @Override // androidx.lifecycle.InterfaceC0928g, androidx.lifecycle.ld6
    public void t8r(@lvui InterfaceC0954z owner) {
        jk();
    }
}

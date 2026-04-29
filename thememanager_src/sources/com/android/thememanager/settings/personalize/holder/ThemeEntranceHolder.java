package com.android.thememanager.settings.personalize.holder;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.VectorDrawable;
import android.os.AsyncTask;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import com.android.thememanager.R;
import com.android.thememanager.activity.ThemeSettingsActivity;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.ki;
import com.android.thememanager.basemodule.utils.ncyb;
import com.android.thememanager.basemodule.utils.nn86;
import ek5k.C6002g;
import i1.C6077k;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeEntranceHolder extends BottomViewHolder implements com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: p */
    private static final String f15243p = "ThemeEntranceHolder";

    private static class toq extends AsyncTask<Void, Void, Bitmap> {

        /* JADX INFO: renamed from: k */
        private WeakReference<ImageView> f15244k;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Bitmap doInBackground(Void... voids) {
            try {
                return new ncyb(bf2.toq.toq()).zy(ki.m7107k((VectorDrawable) bf2.toq.toq().getResources().getDrawable(R.drawable.personalize_theme_entrance_bg)), 25.0f);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Bitmap result) {
            super.onPostExecute(result);
            ImageView imageView = this.f15244k.get();
            if (imageView == null || result == null) {
                return;
            }
            imageView.setImageBitmap(result);
        }

        private toq(ImageView iv) {
            this.f15244k = new WeakReference<>(iv);
        }
    }

    public ThemeEntranceHolder(final Activity activity, View itemView) {
        super(activity, itemView);
        View viewFindViewById = itemView.findViewById(R.id.image_container);
        ImageView imageView = (ImageView) itemView.findViewById(R.id.img_background);
        C6077k.o1t(viewFindViewById);
        new toq(imageView).executeOnExecutor(C6002g.ld6(), new Void[0]);
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.settings.personalize.holder.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ThemeEntranceHolder.m9063t(activity, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m9063t(Activity activity, View view) {
        Intent intent = new Intent();
        if (C1819o.dd(activity)) {
            nn86.m7150k(R.string.multiwindow_no_support, 0);
            return;
        }
        intent.setClass(activity, ThemeSettingsActivity.class);
        try {
            activity.startActivity(intent);
        } catch (Exception e2) {
            Log.e(f15243p, e2.getMessage());
        }
        C1708s.f7l8().ld6().ni7(C1706p.kja0("personalize", "主题套装", ""));
    }

    @Override // com.android.thememanager.settings.personalize.holder.BottomViewHolder
    public String o1t() {
        return com.android.thememanager.basemodule.analysis.toq.fvqg;
    }
}

package com.android.thememanager.activity;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.imageloader.x2;
import java.lang.ref.WeakReference;
import miuix.androidbasewidget.widget.ProgressBar;

/* JADX INFO: loaded from: classes.dex */
public class WallpaperLoadView extends FrameLayout implements x2.InterfaceC1740s {

    /* JADX INFO: renamed from: k */
    private ProgressBar f8914k;

    public WallpaperLoadView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: g */
    private void m6380g(boolean show) {
        if (this.f8914k == null) {
            this.f8914k = (ProgressBar) findViewById(R.id.process_bar);
        }
        this.f8914k.setVisibility(show ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m6381q(Fragment fragment, WeakReference weakReference) {
        if (weakReference == null || weakReference.get() == null || ((Bitmap) weakReference.get()).isRecycled()) {
            return;
        }
        try {
            if (fragment.getActivity() != null) {
                com.android.thememanager.basemodule.imageloader.x2.zy(fragment.getActivity(), weakReference.get(), (ImageView) findViewById(R.id.wallpaper_item_img));
            }
            m6380g(false);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // com.android.thememanager.basemodule.imageloader.x2.InterfaceC1740s
    /* JADX INFO: renamed from: k */
    public void mo6382k(@zy.lvui Object result) {
        m6380g(false);
    }

    /* JADX INFO: renamed from: n */
    public void m6383n(final Fragment fragment, r25n viewModel, int position) {
        m6380g(true);
        viewModel.n5r1(position).m4391p(fragment, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.ix
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9101k.m6381q(fragment, (WeakReference) obj);
            }
        });
    }

    @Override // com.android.thememanager.basemodule.imageloader.x2.InterfaceC1740s
    public void toq() {
    }

    public WallpaperLoadView(Context context, @zy.dd AttributeSet attrs) {
        super(context, attrs);
    }

    public WallpaperLoadView(Context context, @zy.dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    public WallpaperLoadView(Context context, @zy.dd AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
    }
}

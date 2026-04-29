package com.android.thememanager.superwallpaper.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.o1t;
import cv06.InterfaceC5977k;
import h7am.C6071k;
import java.lang.ref.WeakReference;
import zy.dd;
import zy.hyr;

/* JADX INFO: loaded from: classes2.dex */
public class SuperWallpaperProgressBar extends LinearLayout implements InterfaceC5977k.k {

    /* JADX INFO: renamed from: c */
    private static final long f16199c = 3;

    /* JADX INFO: renamed from: e */
    private static final int f16200e = 0;

    /* JADX INFO: renamed from: f */
    private static final long f16201f = 100;

    /* JADX INFO: renamed from: i */
    private static final long f16202i = 10000;

    /* JADX INFO: renamed from: l */
    private static final int f16203l = 2;

    /* JADX INFO: renamed from: r */
    private static final int f16204r = 0;

    /* JADX INFO: renamed from: t */
    private static final int f16205t = 100;

    /* JADX INFO: renamed from: z */
    private static final long f16206z = 300;

    /* JADX INFO: renamed from: g */
    private int f16207g;

    /* JADX INFO: renamed from: h */
    private boolean f16208h;

    /* JADX INFO: renamed from: k */
    private ProgressBar f16209k;

    /* JADX INFO: renamed from: n */
    private ProgressBar f16210n;

    /* JADX INFO: renamed from: p */
    private boolean f16211p;

    /* JADX INFO: renamed from: q */
    private ProgressBar f16212q;

    /* JADX INFO: renamed from: s */
    private zy f16213s;

    /* JADX INFO: renamed from: y */
    private InterfaceC5977k f16214y;

    /* JADX INFO: renamed from: com.android.thememanager.superwallpaper.view.SuperWallpaperProgressBar$k */
    class C2738k extends AnimatorListenerAdapter {
        C2738k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            SuperWallpaperProgressBar.this.f16207g = 2;
        }
    }

    static /* synthetic */ class toq {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f16216k;

        static {
            int[] iArr = new int[InterfaceC5977k.toq.values().length];
            f16216k = iArr;
            try {
                iArr[InterfaceC5977k.toq.AOD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16216k[InterfaceC5977k.toq.LOCKSCREEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16216k[InterfaceC5977k.toq.DESKTOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class zy extends Handler {

        /* JADX INFO: renamed from: k */
        private WeakReference<SuperWallpaperProgressBar> f16217k;

        public zy(SuperWallpaperProgressBar view) {
            this.f16217k = new WeakReference<>(view);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            SuperWallpaperProgressBar superWallpaperProgressBar;
            if (msg.what == 0 && (superWallpaperProgressBar = this.f16217k.get()) != null) {
                superWallpaperProgressBar.m9536s();
            }
        }
    }

    public SuperWallpaperProgressBar(Context context, @dd AttributeSet attrs) {
        super(context, attrs);
        m9537y();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @hyr(api = 24)
    /* JADX INFO: renamed from: s */
    public void m9536s() {
        InterfaceC5977k interfaceC5977k = this.f16214y;
        if (interfaceC5977k == null || interfaceC5977k.zurt() == null) {
            return;
        }
        this.f16207g++;
        int i2 = toq.f16216k[this.f16214y.zurt().ordinal()];
        if (i2 == 1) {
            this.f16209k.setProgress(this.f16207g, true);
            this.f16212q.setProgress(0, true);
            this.f16210n.setProgress(0, true);
        } else if (i2 == 2) {
            this.f16209k.setProgress(100, true);
            this.f16212q.setProgress(this.f16207g, true);
            this.f16210n.setProgress(0, true);
        } else if (i2 == 3) {
            this.f16209k.setProgress(100, true);
            this.f16212q.setProgress(100, true);
            this.f16210n.setProgress(this.f16207g, true);
        }
        if (this.f16207g >= 100) {
            this.f16207g = 0;
            this.f16214y.o1t(true);
        }
        long j2 = f16201f;
        if (this.f16214y.zurt() == InterfaceC5977k.toq.AOD && !this.f16211p) {
            j2 = 3;
        }
        this.f16213s.sendEmptyMessageDelayed(0, j2);
    }

    /* JADX INFO: renamed from: y */
    private void m9537y() {
        View viewInflate = View.inflate(getContext(), R.layout.de_super_wallpaper_progress_view, null);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(viewInflate);
        this.f16209k = (ProgressBar) findViewById(R.id.super_wallpaper_setting_progressbar_aod);
        this.f16212q = (ProgressBar) findViewById(R.id.super_wallpaper_setting_progressbar_lock_screen);
        this.f16210n = (ProgressBar) findViewById(R.id.super_wallpaper_setting_progressbar_desktop);
        this.f16213s = new zy(this);
        boolean zF7l8 = o1t.f7l8();
        this.f16211p = zF7l8;
        this.f16208h = true;
        if (zF7l8) {
            return;
        }
        this.f16209k.setVisibility(8);
    }

    public Animator f7l8(final boolean show) {
        this.f16208h = show;
        if (show) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "alpha", 0.0f, 1.0f);
            objectAnimatorOfFloat.setDuration(250L);
            return objectAnimatorOfFloat;
        }
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, "alpha", 1.0f, 0.0f);
        objectAnimatorOfFloat2.setDuration(200L);
        objectAnimatorOfFloat2.addListener(new C2738k());
        return objectAnimatorOfFloat2;
    }

    @Override // cv06.InterfaceC5977k.k
    /* JADX INFO: renamed from: k */
    public void mo9489k(InterfaceC5977k.toq sceneType) {
        this.f16207g = 2;
        this.f16213s.removeMessages(0);
        this.f16213s.sendEmptyMessage(0);
        Log.d(C6071k.f35077k, "SuperWallpaperProgressBar onSceneChanged:" + sceneType);
    }

    @Override // cv06.InterfaceC5977k.k
    /* JADX INFO: renamed from: q */
    public void mo9524q() {
        this.f16213s.removeMessages(0);
    }

    public void setSuperWallpaperScene(InterfaceC5977k superWallpaperScene) {
        this.f16214y = superWallpaperScene;
    }

    @Override // cv06.InterfaceC5977k.k
    public void toq() {
        this.f16213s.removeMessages(0);
        Log.d(C6071k.f35077k, "SuperWallpaperProgressBar onScenePause");
    }

    @Override // cv06.InterfaceC5977k.k
    public void zy() {
        if (this.f16208h) {
            this.f16213s.sendEmptyMessage(0);
            Log.d(C6071k.f35077k, "SuperWallpaperProgressBar onSceneResume");
        }
    }
}

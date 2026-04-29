package com.android.thememanager.activity;

import a98o.C0004k;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0891q;
import androidx.lifecycle.C0924e;
import androidx.viewpager.widget.ViewPager;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.activity.WallpaperDetailViewPager;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper;
import com.android.thememanager.basemodule.imageloader.n7h;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1822q;
import com.android.thememanager.basemodule.views.AutoSwitchPreviewView;
import com.android.thememanager.controller.C1901h;
import com.android.thememanager.controller.cdj;
import com.android.thememanager.controller.online.EnumC1933t;
import com.android.thememanager.controller.zy;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.WallpaperInfo;
import com.android.thememanager.lockscreen.lock.base.BaseTemplateView;
import com.android.thememanager.lockscreen.lock.task.C2112y;
import com.android.thememanager.lockscreen.lock.wallpaper.WallpaperTextureView;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.model.WallpaperApplyInfos;
import com.android.thememanager.router.recommend.entity.UIProduct;
import com.android.thememanager.router.recommend.entity.WallpaperRecommendItem;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.settings.superwallpaper.utils.C2670y;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.util.x9kr;
import com.android.thememanager.view.ScalableImageView;
import com.android.thememanager.view.WallpaperView;
import com.android.thememanager.view.ncyb;
import com.android.thememanager.wallpaper.C2949g;
import com.google.gson.C4871g;
import com.miui.clock.MiuiClockView;
import com.miui.clock.module.AbstractC5074q;
import com.miui.clock.module.ClockBean;
import com.miui.maml.folme.AnimatedProperty;
import ek5k.C6002g;
import i1.C6077k;
import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Supplier;
import miui.util.InputStreamLoader;
import miuix.appcompat.app.ki;
import org.json.JSONArray;
import org.json.JSONException;
import p001b.InterfaceC1357q;

/* JADX INFO: renamed from: com.android.thememanager.activity.m */
/* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractViewOnClickListenerC1611m extends ij implements p001b.f7l8, View.OnClickListener, InterfaceC1789q, com.android.thememanager.basemodule.analysis.toq, cdj.toq {
    private static final int smyf = 300;
    protected static final String v62 = "WallpaperDetailFragment";
    private static final int vl4 = 3;
    private static final int w7wd = -2;
    private r25n a7kc;
    private ImageView ac;
    private com.android.thememanager.view.ncyb ad;
    private View afw;
    private View am;
    protected Bitmap ar;
    private ViewGroup as;
    protected ImageView ax;
    private MiuiClockView ay;
    private ImageView az;
    protected TextView ba;
    private Matrix bc;
    private ValueAnimator be;
    private ImageView bg;
    protected zwy bl;
    protected ImageView bq;
    private String dy;
    private ImageView eht;
    private int hp;
    protected WallpaperView in;
    private com.android.thememanager.util.x9kr k0;
    protected String k6e;
    private String ls9;
    private WallpaperTextureView lw58;
    private C1901h mjvl;
    private FrameLayout n5ij;
    protected WallpaperDetailViewPager ndjo;
    private TemplateConfig oyp;
    private miuix.appcompat.app.ki q09;
    private Toast q7k9;
    com.android.thememanager.util.kja0 qns;
    private com.android.thememanager.controller.online.mcp th6;
    protected boolean tlhn;
    private ObjectAnimator wra;
    private ObjectAnimator xhv;
    private Uri xk5;
    protected com.android.thememanager.controller.n7h xy8;
    private ObjectAnimator zm;
    protected AutoSwitchPreviewView zmmu;
    private ObjectAnimator zsl;
    private com.android.thememanager.util.cv06 aj = new com.android.thememanager.util.cv06();
    private boolean bs = false;
    private boolean bu = false;
    private boolean bd = false;
    protected int[] w97r = new int[2];
    protected int[] tgs = new int[2];
    protected int[] yl25 = new int[2];
    protected boolean sk1t = false;
    private float[] vb6 = null;
    private List<WallpaperRecommendItem> s8y = null;
    private boolean cw14 = false;
    private boolean d1cy = false;
    private boolean xqx = false;
    private boolean zr5t = false;
    private long ei = 0;
    protected boolean ut = false;
    private boolean wh6 = false;
    private final androidx.collection.ld6<Integer, Bitmap> fn2 = new androidx.collection.ld6<>(3);
    public boolean us2t = true;
    private boolean nq0z = true;
    private Runnable k84 = new Runnable() { // from class: com.android.thememanager.activity.j
        @Override // java.lang.Runnable
        public final void run() {
            this.f9103k.mla();
        }
    };
    protected WallpaperView.zy cecm = new p();
    private x9kr.zy kdv1 = new x9kr.zy() { // from class: com.android.thememanager.activity.o
        @Override // com.android.thememanager.util.x9kr.zy
        /* JADX INFO: renamed from: k */
        public final void mo6457k(Bitmap bitmap, String str, String str2) {
            this.f9291k.bf5(bitmap, str, str2);
        }
    };
    private ValueAnimator.AnimatorUpdateListener h06 = new ld6();
    private AnimatorListenerAdapter gjxq = new x2();
    private ScalableImageView.InterfaceC2904s r7v2 = new qrj();
    private ScalableImageView.InterfaceC2903q l2jk = new n7h();
    private ncyb.zy bsb = new kja0();
    protected final zy.InterfaceC1958k p2c = new toq();
    private p000a.zy lr4 = new zy();
    private p000a.zy ule = new q();
    private C1901h.toq v3 = new C1901h.toq() { // from class: com.android.thememanager.activity.dd
        @Override // com.android.thememanager.controller.C1901h.toq
        /* JADX INFO: renamed from: k */
        public final void mo6405k(boolean z2, C0004k c0004k) {
            this.f8982k.l7o(z2, c0004k);
        }
    };
    protected int yf = -1;

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$cdj */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    static class cdj extends AsyncTask<Void, Void, Integer> {

        /* JADX INFO: renamed from: k */
        WeakReference<AbstractViewOnClickListenerC1611m> f9221k;

        public cdj(AbstractViewOnClickListenerC1611m fragment) {
            this.f9221k = new WeakReference<>(fragment);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer doInBackground(Void... voids) {
            return Integer.valueOf(com.android.thememanager.basemodule.utils.bf2.toq());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Integer result) {
            super.onPostExecute(result);
            AbstractViewOnClickListenerC1611m abstractViewOnClickListenerC1611m = this.f9221k.get();
            if (abstractViewOnClickListenerC1611m == null || !abstractViewOnClickListenerC1611m.isAdded()) {
                return;
            }
            abstractViewOnClickListenerC1611m.vymi(result.intValue());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$f7l8 */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class f7l8 implements ViewPager.InterfaceC1284p {
        f7l8() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        /* JADX INFO: renamed from: k */
        public void mo5550k(int state) {
            AbstractViewOnClickListenerC1611m.this.us2t = state == 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void toq(int position) {
            WallpaperView.zy zyVar;
            Log.i(AbstractViewOnClickListenerC1611m.v62, "onPageSelected: position = " + position + ",mResourceIndex = " + AbstractViewOnClickListenerC1611m.this.f9076m);
            if (position <= AbstractViewOnClickListenerC1611m.this.f9075j.size()) {
                AbstractViewOnClickListenerC1611m abstractViewOnClickListenerC1611m = AbstractViewOnClickListenerC1611m.this;
                int i2 = abstractViewOnClickListenerC1611m.f9076m;
                if (position > i2) {
                    WallpaperView.zy zyVar2 = abstractViewOnClickListenerC1611m.cecm;
                    if (zyVar2 == null || !zyVar2.mo6449k(position - i2)) {
                        return;
                    }
                    AbstractViewOnClickListenerC1611m.this.cecm.zy();
                    return;
                }
                if (position >= i2 || (zyVar = abstractViewOnClickListenerC1611m.cecm) == null || !zyVar.mo6449k(position - i2)) {
                    return;
                }
                AbstractViewOnClickListenerC1611m.this.cecm.toq();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void zy(int position, float positionOffset, int positionOffsetPixels) {
            AbstractViewOnClickListenerC1611m.this.us2t = positionOffset == 0.0f;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$g */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (AbstractViewOnClickListenerC1611m.this.n5ij != null) {
                AbstractViewOnClickListenerC1611m.this.n5ij.setAlpha(1.0f);
                AbstractViewOnClickListenerC1611m.this.n5ij.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$h */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    public static class h extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        private InputStream f9224k;

        /* JADX INFO: renamed from: q */
        private WeakReference<AbstractViewOnClickListenerC1611m> f9225q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f57341toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private String f57342zy;

        public h(AbstractViewOnClickListenerC1611m fragment, Uri wallpaperUri, String tempWallpaperTargetPath) {
            try {
                this.f9224k = C2082k.zy().toq().getContentResolver().openInputStream(wallpaperUri);
                this.f57341toq = tempWallpaperTargetPath;
                this.f57342zy = this.f57341toq + ".temp";
                this.f9225q = new WeakReference<>(fragment);
            } catch (Exception e2) {
                Log.e(AbstractViewOnClickListenerC1611m.v62, "openInputStream() error:" + e2);
                cancel(true);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void[] params) {
            if (isCancelled()) {
                return null;
            }
            com.android.thememanager.util.ch.t8iq(this.f9224k, this.f57342zy);
            new File(this.f57342zy).renameTo(new File(this.f57341toq));
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void result) {
            AbstractViewOnClickListenerC1611m abstractViewOnClickListenerC1611m = this.f9225q.get();
            if (abstractViewOnClickListenerC1611m == null || !C1819o.eqxt(abstractViewOnClickListenerC1611m.getActivity())) {
                new File(this.f57341toq).delete();
            } else {
                abstractViewOnClickListenerC1611m.s31(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$k */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class k implements DialogInterface.OnClickListener {
        k() {
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialog, int which) {
            dialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$kja0 */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class kja0 implements ncyb.zy {
        kja0() {
        }

        @Override // com.android.thememanager.view.ncyb.zy
        /* JADX INFO: renamed from: k */
        public void mo6447k(int applyType, WallpaperApplyInfos infos) {
            WallpaperView wallpaperView = AbstractViewOnClickListenerC1611m.this.in;
            if (wallpaperView == null || wallpaperView.zurt()) {
                Log.w(AbstractViewOnClickListenerC1611m.v62, "wallpaper apply click fail, reason: mWallpaperView is touch");
                Toast.makeText(bf2.toq.toq(), AbstractViewOnClickListenerC1611m.this.getString(R.string.toast_transparent_wallpaper_filter_set_failured), 0).show();
            } else {
                if (C1819o.lvui()) {
                    return;
                }
                if (C1819o.dd(AbstractViewOnClickListenerC1611m.this.getActivity()) && !C1819o.m7164r(AbstractViewOnClickListenerC1611m.this.getActivity())) {
                    com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.multiwindow_no_support, 0);
                    return;
                }
                String str = AbstractViewOnClickListenerC1611m.this.f9074f.se() ? com.android.thememanager.basemodule.analysis.toq.t0 : com.android.thememanager.basemodule.analysis.toq.iby;
                AbstractViewOnClickListenerC1611m abstractViewOnClickListenerC1611m = AbstractViewOnClickListenerC1611m.this;
                AbstractViewOnClickListenerC1611m.this.jglj(str, abstractViewOnClickListenerC1611m.dbf(abstractViewOnClickListenerC1611m.f9070b), applyType, infos);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$ld6 */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class ld6 implements ValueAnimator.AnimatorUpdateListener {
        ld6() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            AbstractViewOnClickListenerC1611m.this.am.setAlpha(((Float) animation.getAnimatedValue()).floatValue());
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$n */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class n extends AnimatorListenerAdapter {
        n() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (AbstractViewOnClickListenerC1611m.this.n5ij != null) {
                AbstractViewOnClickListenerC1611m.this.n5ij.setAlpha(1.0f);
                AbstractViewOnClickListenerC1611m.this.n5ij.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$n7h */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class n7h implements ScalableImageView.InterfaceC2903q {
        n7h() {
        }

        @Override // com.android.thememanager.view.ScalableImageView.InterfaceC2903q
        /* JADX INFO: renamed from: k */
        public void mo6448k() {
            AbstractViewOnClickListenerC1611m.this.in.n5r1();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$p */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class p implements WallpaperView.zy {
        p() {
        }

        @Override // com.android.thememanager.view.WallpaperView.zy
        /* JADX INFO: renamed from: k */
        public boolean mo6449k(int offset) {
            if (offset != 0) {
                int size = AbstractViewOnClickListenerC1611m.this.f9075j.size();
                if (AbstractViewOnClickListenerC1611m.this.mjvl != null && AbstractViewOnClickListenerC1611m.this.cw14) {
                    AbstractViewOnClickListenerC1611m abstractViewOnClickListenerC1611m = AbstractViewOnClickListenerC1611m.this;
                    boolean z2 = abstractViewOnClickListenerC1611m.f9076m == abstractViewOnClickListenerC1611m.f9075j.size() - 1;
                    C1901h c1901h = AbstractViewOnClickListenerC1611m.this.mjvl;
                    C1901h.toq toqVar = AbstractViewOnClickListenerC1611m.this.v3;
                    AbstractViewOnClickListenerC1611m abstractViewOnClickListenerC1611m2 = AbstractViewOnClickListenerC1611m.this;
                    c1901h.m7470g(toqVar, abstractViewOnClickListenerC1611m2.f9076m, abstractViewOnClickListenerC1611m2.f9075j.size(), false, z2, size);
                }
                AbstractViewOnClickListenerC1611m abstractViewOnClickListenerC1611m3 = AbstractViewOnClickListenerC1611m.this;
                int i2 = abstractViewOnClickListenerC1611m3.f9076m + offset;
                if (i2 < size && i2 >= 0) {
                    return true;
                }
                if (!abstractViewOnClickListenerC1611m3.cw14 && size != 1 && i2 == size) {
                    com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.up_to_the_end, 0);
                }
            }
            return false;
        }

        @Override // com.android.thememanager.view.WallpaperView.zy
        public void toq() {
            AbstractViewOnClickListenerC1611m.this.bd = true;
            String trackId = AbstractViewOnClickListenerC1611m.this.f9070b.getOnlineInfo().getTrackId();
            AbstractViewOnClickListenerC1611m.this.vwb();
            AbstractViewOnClickListenerC1611m.this.ncyb(trackId);
        }

        @Override // com.android.thememanager.view.WallpaperView.zy
        public void zy() {
            AbstractViewOnClickListenerC1611m.this.bd = false;
            String trackId = AbstractViewOnClickListenerC1611m.this.f9070b.getOnlineInfo().getTrackId();
            AbstractViewOnClickListenerC1611m.this.mi1u();
            AbstractViewOnClickListenerC1611m.this.ncyb(trackId);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$q */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class q implements p000a.zy {
        q() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            AbstractViewOnClickListenerC1611m.this.ln();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(AbstractViewOnClickListenerC1611m.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$qrj */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class qrj implements ScalableImageView.InterfaceC2904s {
        qrj() {
        }

        @Override // com.android.thememanager.view.ScalableImageView.InterfaceC2904s
        /* JADX INFO: renamed from: k */
        public void mo6450k() {
            AbstractViewOnClickListenerC1611m.this.wh6 = false;
        }

        @Override // com.android.thememanager.view.ScalableImageView.InterfaceC2904s
        /* JADX INFO: renamed from: n */
        public void mo6451n() {
        }

        @Override // com.android.thememanager.view.ScalableImageView.InterfaceC2904s
        /* JADX INFO: renamed from: q */
        public void mo6452q() {
            AbstractViewOnClickListenerC1611m abstractViewOnClickListenerC1611m = AbstractViewOnClickListenerC1611m.this;
            abstractViewOnClickListenerC1611m.vh(abstractViewOnClickListenerC1611m);
            AbstractViewOnClickListenerC1611m.this.wh6 = false;
        }

        @Override // com.android.thememanager.view.ScalableImageView.InterfaceC2904s
        public void toq() {
        }

        @Override // com.android.thememanager.view.ScalableImageView.InterfaceC2904s
        public void zy() {
            AbstractViewOnClickListenerC1611m.this.wh6 = true;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$s */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class s extends AnimatorListenerAdapter {
        s() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (AbstractViewOnClickListenerC1611m.this.bg != null) {
                AbstractViewOnClickListenerC1611m.this.bg.setAlpha(1.0f);
                AbstractViewOnClickListenerC1611m.this.bg.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$toq */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class toq implements zy.InterfaceC1958k {
        toq() {
        }

        @Override // com.android.thememanager.controller.zy.InterfaceC1958k
        public void n7h() {
            if (C1819o.eqxt(AbstractViewOnClickListenerC1611m.this.getActivity())) {
                AbstractViewOnClickListenerC1611m.this.xo(true);
            }
        }

        @Override // com.android.thememanager.controller.zy.InterfaceC1958k
        /* JADX INFO: renamed from: q */
        public void mo6453q(Pair<Boolean, Boolean> success, int applyType, Bundle data) {
            if (C1819o.eqxt(AbstractViewOnClickListenerC1611m.this.getActivity())) {
                AbstractViewOnClickListenerC1611m.this.xo(false);
                if (applyType != 32) {
                    if (com.android.thememanager.basemodule.utils.y9n.m7251n(32) && data != null && data.getBoolean(com.android.thememanager.basemodule.analysis.toq.f1, false)) {
                        AbstractViewOnClickListenerC1611m.this.zaso();
                    }
                    if (com.android.thememanager.basemodule.utils.y9n.vyq() || AbstractViewOnClickListenerC1611m.this.xk5 != null || "settings".equals(AbstractViewOnClickListenerC1611m.this.k6e)) {
                        return;
                    }
                    new RestoreHomeIconHelper(AbstractViewOnClickListenerC1611m.this.getActivity()).x2();
                    return;
                }
                int i2 = data != null ? data.getInt(com.android.thememanager.util.mbx.f61352ni7, -1) : -1;
                if (i2 == 3) {
                    com.android.thememanager.controller.cdj.zy(AbstractViewOnClickListenerC1611m.this.getActivity(), data);
                    return;
                }
                if (i2 == 2) {
                    try {
                        Intent intentM9873y = com.android.thememanager.util.mbx.m9873y(AbstractViewOnClickListenerC1611m.this.getActivity());
                        data.putString("from", com.android.thememanager.util.mbx.f61350ld6);
                        intentM9873y.putExtras(data);
                        AbstractViewOnClickListenerC1611m.this.getActivity().startActivity(intentM9873y);
                        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.hf7, C1706p.kja0(((com.android.thememanager.basemodule.base.toq) AbstractViewOnClickListenerC1611m.this).f9877s, null, ""));
                    } catch (Exception e2) {
                        Log.e("theme:WallpaperDetail", "error occur while goto mazagine CTA", e2);
                    }
                }
            }
        }

        @Override // com.android.thememanager.controller.zy.InterfaceC1958k
        public void zy() {
            if (AbstractViewOnClickListenerC1611m.this.q09 == null || !AbstractViewOnClickListenerC1611m.this.q09.isShowing()) {
                return;
            }
            AbstractViewOnClickListenerC1611m.this.q09.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$x2 */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class x2 extends AnimatorListenerAdapter {
        x2() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            AbstractViewOnClickListenerC1611m.this.am.setVisibility(8);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$y */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class y extends AnimatorListenerAdapter {
        y() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (AbstractViewOnClickListenerC1611m.this.az != null) {
                AbstractViewOnClickListenerC1611m.this.az.setAlpha(1.0f);
                AbstractViewOnClickListenerC1611m.this.az.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.m$zy */
    /* JADX INFO: compiled from: BaseWallpaperDetailFragment.java */
    class zy implements p000a.zy {
        zy() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            C2687z.kja0();
            AbstractViewOnClickListenerC1611m.this.oei();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(AbstractViewOnClickListenerC1611m.this.getContext(), true);
            } else {
                AbstractViewOnClickListenerC1611m.this.getActivity().finish();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean a3dw(View view, MotionEvent motionEvent) {
        if (this.f57309ab != null && !this.tlhn) {
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1 && action != 3) {
                    return false;
                }
                this.f57309ab.post(new Runnable() { // from class: com.android.thememanager.activity.vyq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9363k.lg4k();
                    }
                });
                return false;
            }
            this.f57309ab.post(new Runnable() { // from class: com.android.thememanager.activity.uv6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9344k.d6od();
                }
            });
        }
        return false;
    }

    private int ap23(WallpaperInfo wallpaperInfo) {
        if (wallpaperInfo == null) {
            return 0;
        }
        return wallpaperInfo.getMagicType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bf5(final Bitmap bitmap, String str, String str2) {
        if (yw()) {
            return;
        }
        boolean zEquals = TextUtils.equals(str2, dbf(this.f9070b));
        if (bitmap == null) {
            if (TextUtils.equals(zah1(this.f9059l, this.f9070b), str)) {
                com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.wallpaper_decoded_error, 0);
                return;
            } else {
                if (zEquals) {
                    com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.online_no_network, 0);
                    return;
                }
                return;
            }
        }
        final int iCb = cb(str);
        if (iCb != -2) {
            Log.d(v62, "mDecoderListener completed offset " + iCb);
            this.f57309ab.post(new Runnable() { // from class: com.android.thememanager.activity.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8970k.cr3(iCb, bitmap);
                }
            });
        }
        r25n r25nVar = this.a7kc;
        if (r25nVar != null) {
            r25nVar.m6475f(this.f9076m + iCb, bitmap);
        }
        ImageView imageView = this.eht;
        if (imageView != null) {
            imageView.setEnabled(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean brv() {
        this.nq0z = false;
        Log.d(v62, "needUpdateLauncherView set false");
        return false;
    }

    private int cb(String localPath) {
        for (int i2 = -1; i2 <= 1; i2++) {
            if (d9i(jyr(i2), localPath)) {
                return i2;
            }
        }
        return -2;
    }

    private boolean cjaj() {
        Resource resourceJyr = jyr(0);
        if (resourceJyr == null) {
            return false;
        }
        String strJk = com.android.thememanager.util.uc.jk(this.f9059l, resourceJyr);
        File file = new File(strJk);
        return !com.android.thememanager.util.ch.vyq(strJk) && file.exists() && file.length() > 0;
    }

    private UIProduct d6c() {
        List<WallpaperRecommendItem> list = this.s8y;
        if (list != null && list.size() != 0) {
            for (WallpaperRecommendItem wallpaperRecommendItem : this.s8y) {
                if (this.f9076m <= wallpaperRecommendItem.endProdutPos) {
                    return wallpaperRecommendItem.subjects.get(0).products.get(this.f9076m - wallpaperRecommendItem.startProductPos);
                }
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d6od() {
        ImageView imageView = this.bq;
        if (imageView != null) {
            imageView.setEnabled(false);
            zwy zwyVar = this.bl;
            if (zwyVar != null) {
                zwyVar.m6487q(false);
            }
        }
        qla(true);
    }

    private boolean d9i(Resource res, String decodedImagePath) {
        return res != null && (TextUtils.equals(zah1(this.f9059l, res), decodedImagePath) || TextUtils.equals(vahq(this.f9059l, res), decodedImagePath) || TextUtils.equals(vc(this.f9059l, res, true), decodedImagePath));
    }

    private Matrix eklw() {
        float[] fArr = this.vb6;
        if (fArr == null || fArr.length != 9) {
            return null;
        }
        Matrix matrix = new Matrix();
        matrix.setValues(this.vb6);
        return matrix;
    }

    private boolean eu() {
        com.android.thememanager.fu4 fu4Var;
        Resource resourceJyr = jyr(0);
        if (resourceJyr == null || (fu4Var = this.f9059l) == null) {
            return false;
        }
        String strJk = com.android.thememanager.util.uc.jk(fu4Var, resourceJyr);
        return !TextUtils.isEmpty(strJk) && com.android.thememanager.util.ch.m9675l(strJk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f26p(int i2, int i3, String str, String str2, WallpaperApplyInfos wallpaperApplyInfos, DialogInterface dialogInterface, int i4) {
        if (i2 == 0 && i3 != 32) {
            i3 = com.android.thememanager.view.ncyb.m10408q();
        }
        b6(str, str2, i3, wallpaperApplyInfos);
        dialogInterface.dismiss();
    }

    private void ff() {
        Bitmap bitmapEs7;
        if (!zt() || getActivity() == null || this.in.getImageBitmap() == null || this.in.getImageBitmap().isRecycled() || (bitmapEs7 = es7()) == null || bitmapEs7.isRecycled()) {
            return;
        }
        this.n5ij.removeAllViews();
        WallpaperTextureView wallpaperTextureView = (WallpaperTextureView) this.n5ij.findViewById(R.id.wsf_wallpaper);
        this.lw58 = wallpaperTextureView;
        if (wallpaperTextureView == null) {
            Log.d(v62, "wallpaper detail create magic view: start");
            this.lw58 = com.android.thememanager.lockscreen.lock.wallpaper.n7h.f7l8(getContext(), bitmapEs7, ap23(this.oyp.getWallpaperInfo()), null, this.oyp.getWallpaperInfo() != null ? this.oyp.getWallpaperInfo().getEnableBlur() : false);
            Log.d(v62, "wallpaper detail create magic view: end");
            this.lw58.setId(R.id.wsf_wallpaper);
            this.n5ij.addView(this.lw58);
        }
        this.lw58.jk();
    }

    private boolean gw(String path) {
        boolean z2 = com.android.thememanager.util.ch.vyq(path) || com.android.thememanager.util.ch.n5r1(path);
        if (!this.ut || com.android.thememanager.basemodule.utils.o1t.m7171i()) {
            return z2;
        }
        if (z2) {
            return (!TextUtils.isEmpty(path) && path.contains("_dark.")) || zsr0.toq.m28220k(path) != null;
        }
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void ie() {
        this.a7kc = (r25n) new C0924e(this).m4420k(r25n.class);
        WallpaperDetailViewPager wallpaperDetailViewPager = (WallpaperDetailViewPager) tww7(R.id.wallpaper_pager);
        this.ndjo = wallpaperDetailViewPager;
        if (wallpaperDetailViewPager == null) {
            return;
        }
        zwy zwyVar = new zwy(this, this.f9075j, wallpaperDetailViewPager, this.in, this.f9076m, this.a7kc);
        this.bl = zwyVar;
        zwyVar.m6484g(true);
        l0(this.ndjo);
        this.bl.m6486n(new WallpaperDetailViewPager.InterfaceC1559k() { // from class: com.android.thememanager.activity.lrht
            @Override // com.android.thememanager.activity.WallpaperDetailViewPager.InterfaceC1559k
            /* JADX INFO: renamed from: k */
            public final void mo6379k() {
                this.f9167k.wu();
            }
        });
        this.bl.zy(new f7l8());
    }

    public static String ip(com.android.thememanager.fu4 resContext, Resource resource) {
        PathEntry pathEntry;
        List<PathEntry> previews = new ResourceResolver(resource, resContext).getPreviews();
        if (previews == null || previews.size() <= 0 || (pathEntry = previews.get(0)) == null) {
            return null;
        }
        return pathEntry.getOnlinePath();
    }

    private void iz() {
        Resource resourceJyr;
        String strJk;
        if (!com.android.thememanager.basemodule.utils.o1t.m7179z() || this.f9059l == null || this.bg == null || this.az == null || getActivity() == null || (resourceJyr = jyr(0)) == null || (strJk = com.android.thememanager.util.uc.jk(this.f9059l, resourceJyr)) == null) {
            return;
        }
        String strM28220k = (com.android.thememanager.util.ch.vyq(strJk) || com.android.thememanager.util.ch.n5r1(strJk)) ? zsr0.toq.m28220k(strJk) : null;
        if (TextUtils.isEmpty(strM28220k)) {
            this.xqx = false;
            return;
        }
        this.xqx = true;
        boolean z2 = this.ut;
        String str = z2 ? strJk : strM28220k;
        if (z2) {
            strJk = strM28220k;
        }
        final WeakReference weakReference = new WeakReference(this.bg);
        final WeakReference weakReference2 = new WeakReference(this.az);
        final String str2 = str;
        final String str3 = strJk;
        new com.android.thememanager.basemodule.imageloader.n7h(new n7h.toq() { // from class: com.android.thememanager.activity.n5r1
            @Override // com.android.thememanager.basemodule.imageloader.n7h.toq
            /* JADX INFO: renamed from: k */
            public final void mo6454k(Map map) {
                this.f9248k.z1r(str2, weakReference, str3, weakReference2, map);
            }
        }, str, strJk).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    private synchronized ObjectAnimator izu(boolean show) {
        if (show) {
            if (this.xhv == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.n5ij, "alpha", 0.0f, 1.0f);
                this.xhv = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(150L);
                this.xhv.addListener(new n());
            }
            return this.xhv;
        }
        if (this.zm == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.n5ij, "alpha", 1.0f, 0.0f);
            this.zm = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(150L);
            this.zm.addListener(new g());
        }
        return this.zm;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void jb9(boolean z2, Bitmap bitmap) {
        if (C1819o.eqxt(this.f9074f)) {
            mq(bitmap, z2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jglj(final String sourceType, final String onlineUrl, final int applyType, final WallpaperApplyInfos infos) {
        if (!com.android.thememanager.util.kja0.m9846g("image", Integer.valueOf(applyType)) && !com.android.thememanager.util.kja0.f7l8("image", Integer.valueOf(applyType))) {
            b6(sourceType, onlineUrl, applyType, infos);
        } else {
            final int qVar = com.android.thememanager.util.kja0.toq();
            this.qns = new com.android.thememanager.util.kja0().m9849q(getActivity(), qVar, true, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.x9kr
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f9372k.f26p(qVar, applyType, sourceType, onlineUrl, infos, dialogInterface, i2);
                }
            }).m9850y();
        }
    }

    private boolean koj() {
        if (this.xqx && this.d1cy && !this.zr5t) {
            this.d1cy = false;
            this.f57309ab.post(new Runnable() { // from class: com.android.thememanager.activity.r
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9322k.verb();
                }
            });
        }
        return false;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void l0(WallpaperDetailViewPager wallpaperViewPager) {
        if (mkmm()) {
            return;
        }
        wallpaperViewPager.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.thememanager.activity.hb
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f9064k.y3(view, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l7o(boolean z2, C0004k c0004k) {
        this.cw14 = z2;
        int size = this.f9075j.size() - 1;
        this.f9075j.addAll(c0004k);
        if (size == this.f9076m) {
            oei();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lg4k() {
        ImageView imageView = this.bq;
        if (imageView != null) {
            imageView.setEnabled(true);
        }
        zwy zwyVar = this.bl;
        if (zwyVar != null) {
            zwyVar.m6487q(true);
        }
        qla(false);
    }

    private void mq(Bitmap bitmap, boolean updateLauncherView) {
        if (bitmap != null) {
            Log.d(v62, "clock color pick: use origin bitmap , updateLauncherView :" + updateLauncherView);
            this.zmmu.zurt(bitmap, updateLauncherView);
            return;
        }
        if (this.ar != null) {
            Log.d(v62, "clock color pick: use dark bitmap , updateLauncherView :" + updateLauncherView);
            this.zmmu.zurt(this.ar, updateLauncherView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: owi, reason: merged with bridge method [inline-methods] */
    public void cr3(int offset, Bitmap bitmap) {
        Pair<Bitmap, Boolean> pair = bitmap != null ? new Pair<>(bitmap, Boolean.FALSE) : sj(offset);
        boolean zBooleanValue = pair != null ? ((Boolean) pair.second).booleanValue() : false;
        if (bitmap == null) {
            bitmap = pair != null ? (Bitmap) pair.first : null;
        }
        int i2 = this.f9076m + offset;
        if (bitmap == null) {
            bitmap = this.k0.m10074s(i2);
        }
        if (bitmap == null && this.in.m10318r(offset) == i2 && this.in.x9kr(offset)) {
            return;
        }
        this.in.setBitmapInfo(offset, bitmap, i2, bitmap == null && (i2 >= 0 && i2 < this.f9075j.size()), zBooleanValue);
        if (offset == 0) {
            if (bitmap != null) {
                this.ar = bitmap;
                Log.d(v62, "updatePreviewMask needUpdateLauncherView " + this.nq0z);
                xnu(this.nq0z);
                Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: com.android.thememanager.activity.nn86
                    @Override // android.os.MessageQueue.IdleHandler
                    public final boolean queueIdle() {
                        return this.f9280k.brv();
                    }
                });
                Matrix matrixEklw = eklw();
                if (matrixEklw == null) {
                    matrixEklw = this.bc;
                }
                this.in.ki(bitmap, matrixEklw);
                jog(matrixEklw == null, true);
                this.in.n5r1();
                this.bc = null;
            }
            this.sk1t = bitmap != null;
            String strZah1 = zah1(this.f9059l, this.f9070b);
            ae4(com.android.thememanager.util.ch.vyq(strZah1) || com.android.thememanager.util.ch.n5r1(strZah1));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void qppo() {
        ImageView imageView = this.bq;
        if (imageView != null) {
            imageView.setEnabled(false);
        }
        ImageView imageView2 = this.eht;
        if (imageView2 != null) {
            imageView2.setEnabled(false);
        }
        oaex(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void s31(int offset) {
        cr3(offset, this.k0.m10074s(this.f9076m + offset));
    }

    private boolean sb(WallpaperInfo wallpaperInfo) {
        return wallpaperInfo != null && wallpaperInfo.getEnableBlur();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[PHI: r2
      0x0071: PHI (r2v3 android.graphics.Bitmap) = (r2v1 android.graphics.Bitmap), (r2v6 android.graphics.Bitmap), (r2v6 android.graphics.Bitmap) binds: [B:16:0x005a, B:18:0x0066, B:20:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.util.Pair<android.graphics.Bitmap, java.lang.Boolean> sj(int r18) {
        /*
            r17 = this;
            r0 = r17
            com.android.thememanager.basemodule.resource.model.Resource r1 = r17.jyr(r18)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.android.thememanager.fu4 r3 = r0.f9059l
            java.lang.String r3 = r0.zah1(r3, r1)
            boolean r4 = r17.xblq()
            r5 = 1
            if (r4 == 0) goto L25
            com.android.thememanager.fu4 r4 = r0.f9059l
            java.lang.String r4 = vahq(r4, r1)
            com.android.thememanager.fu4 r6 = r0.f9059l
            java.lang.String r6 = vc(r6, r1, r5)
            r9 = r4
            goto L27
        L25:
            r6 = r2
            r9 = r6
        L27:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r3)
            r4.add(r9)
            r4.add(r6)
            int r7 = r0.f9076m
            int r8 = r7 + r18
            r7 = 0
            r10 = r7
            r13 = r10
        L3c:
            int r11 = r4.size()
            if (r7 >= r11) goto L8c
            java.lang.Object r11 = r4.get(r7)
            r12 = r11
            java.lang.String r12 = (java.lang.String) r12
            boolean r11 = android.text.TextUtils.isEmpty(r12)
            if (r11 != 0) goto L89
            java.io.File r11 = new java.io.File
            r11.<init>(r12)
            boolean r11 = r11.exists()
            if (r11 == 0) goto L89
            if (r2 != 0) goto L71
            com.android.thememanager.util.x9kr r2 = r0.k0
            android.graphics.Bitmap r2 = r2.m10074s(r8)
            boolean r11 = r12.equals(r6)
            if (r11 == 0) goto L71
            boolean r11 = r6.equals(r9)
            if (r11 != 0) goto L71
            r16 = r5
            goto L73
        L71:
            r16 = r13
        L73:
            if (r2 != 0) goto L87
            if (r10 != 0) goto L87
            com.android.thememanager.util.x9kr r10 = r0.k0
            r13 = 0
            boolean r11 = r0.gw(r12)
            r14 = r11 ^ 1
            boolean r15 = r0.ut
            r11 = r8
            r10.f7l8(r11, r12, r13, r14, r15)
            r10 = r5
        L87:
            r13 = r16
        L89:
            int r7 = r7 + 1
            goto L3c
        L8c:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto Lba
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r3 = r4.exists()
            if (r3 != 0) goto Lba
            boolean r3 = android.text.TextUtils.isEmpty(r9)
            if (r3 != 0) goto Lba
            java.io.File r3 = new java.io.File
            r3.<init>(r9)
            boolean r3 = r3.exists()
            if (r3 != 0) goto Lba
            com.android.thememanager.util.x9kr r7 = r0.k0
            java.lang.String r10 = r0.dbf(r1)
            r11 = 1
            boolean r12 = r0.ut
            r7.f7l8(r8, r9, r10, r11, r12)
        Lba:
            android.util.Pair r1 = new android.util.Pair
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r13)
            r1.<init>(r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.activity.AbstractViewOnClickListenerC1611m.sj(int):android.util.Pair");
    }

    private void sm(boolean enable) {
        if (this.bl != null && !mkmm()) {
            this.bl.m6484g(!enable);
        }
        if (this.tlhn == enable) {
            return;
        }
        this.in.m10304p(enable);
        Toast toast = this.q7k9;
        if (toast != null) {
            toast.cancel();
        }
        Toast toastMakeText = Toast.makeText(this.f9074f.getApplicationContext(), enable ? R.string.scrollable_wallpaper_open : R.string.scrollable_wallpaper_close, 0);
        this.q7k9 = toastMakeText;
        toastMakeText.show();
        if (enable) {
            if (this.zmmu.qrj()) {
                this.zmmu.t8r();
                this.bu = true;
            } else {
                this.bu = false;
            }
        } else if (this.bu ^ this.zmmu.qrj()) {
            this.zmmu.t8r();
        }
        bmt3();
        this.tlhn = enable;
        this.bq.setSelected(enable);
        jog(!enable, false);
        String str = !TextUtils.isEmpty(this.ls9) ? this.ls9 : this.f9074f.se() ? com.android.thememanager.basemodule.analysis.toq.t0 : com.android.thememanager.basemodule.analysis.toq.iby;
        com.android.thememanager.basemodule.analysis.kja0.f7l8(str, com.android.thememanager.basemodule.analysis.toq.fai, null);
        C1708s.f7l8().ld6().ni7(C1706p.kja0(str, com.android.thememanager.basemodule.analysis.toq.fai, ""));
    }

    private Bitmap uv(String localPath) {
        BitmapFactory.Options optionsCdj = C2763c.cdj();
        InputStreamLoader inputStreamLoader = new InputStreamLoader(localPath);
        if (C2949g.f17747k.ld6()) {
            optionsCdj.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        int[] iArr = this.w97r;
        int i2 = 0;
        optionsCdj.inSampleSize = C2763c.m9651q(inputStreamLoader, iArr[0] * iArr[1] * 2);
        inputStreamLoader.close();
        Bitmap bitmapM9646h = null;
        while (true) {
            int i3 = i2 + 1;
            if (i2 >= 3) {
                break;
            }
            try {
                bitmapM9646h = C2763c.m9646h(localPath, optionsCdj);
                break;
            } catch (OutOfMemoryError unused) {
                Log.i("decoder", "decode wallpaper OOM: " + i3 + " " + localPath);
                optionsCdj.inSampleSize = optionsCdj.inSampleSize + 1;
                i2 = i3;
            }
        }
        return bitmapM9646h;
    }

    private static String vahq(com.android.thememanager.fu4 resourceContext, Resource resource) {
        String strVc = vc(resourceContext, resource, false);
        if (!TextUtils.isEmpty(strVc)) {
            return strVc;
        }
        return resourceContext.getPreviewCacheFolder() + File.separator + resource.getOnlineId();
    }

    private static String vc(com.android.thememanager.fu4 resourceContext, Resource resource, boolean isThumbnail) {
        PathEntry pathEntry;
        ResourceResolver resourceResolver = new ResourceResolver(resource, resourceContext);
        List<PathEntry> thumbnails = isThumbnail ? resourceResolver.getThumbnails() : resourceResolver.getPreviews();
        if (thumbnails == null || thumbnails.size() <= 0 || (pathEntry = thumbnails.get(0)) == null) {
            return null;
        }
        return pathEntry.getLocalPath();
    }

    private synchronized ObjectAnimator vddr(boolean show) {
        if (show) {
            if (this.wra == null) {
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.az, "alpha", 1.0f, 0.0f);
                this.wra = objectAnimatorOfFloat;
                objectAnimatorOfFloat.setDuration(300L);
                this.wra.addListener(new y());
            }
            return this.wra;
        }
        if (this.zsl == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.bg, "alpha", 1.0f, 0.0f);
            this.zsl = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(300L);
            this.zsl.addListener(new s());
        }
        return this.zsl;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void verb() {
        ImageView imageView = this.bq;
        if (imageView != null) {
            imageView.setEnabled(true);
        }
        ImageView imageView2 = this.eht;
        if (imageView2 != null) {
            imageView2.setEnabled(true);
        }
        oaex(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vh(AbstractViewOnClickListenerC1611m fragment) {
        C1708s.f7l8().ld6().ni7(C1706p.zy(com.android.thememanager.basemodule.analysis.toq.crha));
        if (fragment.zmmu.t8r() && wqp()) {
            fragment.bq.setVisibility(this.yf <= 1 ? 4 : 0);
        }
        bmt3();
    }

    private void wh() {
        new cdj(this).executeOnExecutor(C6002g.ld6(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wu() {
        this.r7v2.mo6452q();
    }

    private boolean x3b() {
        if (this.hp == 0) {
            return true;
        }
        UIProduct uIProductD6c = d6c();
        return (uIProductD6c == null || uIProductD6c.likeCount == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xo(boolean show) {
        if (!show) {
            this.be.start();
        } else {
            this.am.setAlpha(1.0f);
            this.am.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Bitmap xouc() {
        String contentPath = this.f9070b.getContentPath();
        String strDbf = dbf(this.f9070b);
        int[] iArr = this.w97r;
        Bitmap bitmapA8p6 = a8p6(contentPath, strDbf, iArr[0] / 4, iArr[1] / 4);
        this.fn2.m840p(Integer.valueOf(this.f9076m), bitmapA8p6);
        return bitmapA8p6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean y3(View view, MotionEvent motionEvent) {
        if (!this.xqx) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            if (this.us2t) {
                this.f57309ab.postDelayed(this.k84, ViewConfiguration.getLongPressTimeout());
            }
            return false;
        }
        if (action != 1) {
            if (action == 2) {
                return this.d1cy;
            }
            if (action != 3) {
                return false;
            }
        }
        this.f57309ab.removeCallbacks(this.k84);
        if (!this.d1cy) {
            return false;
        }
        koj();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean ydj3(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                this.f57309ab.removeCallbacks(this.k84);
                if (this.d1cy) {
                    this.zr5t = false;
                    koj();
                }
                if (this.xqx && jCurrentTimeMillis - this.ei > ViewConfiguration.getLongPressTimeout() && !this.zr5t) {
                    this.in.setTouching(false);
                    return true;
                }
                this.zr5t = false;
            } else {
                if (action == 2) {
                    this.zr5t = true;
                    return this.tlhn || this.d1cy;
                }
                if (action == 3) {
                    this.f57309ab.removeCallbacks(this.k84);
                    if (this.d1cy) {
                        this.zr5t = false;
                        koj();
                    }
                    this.zr5t = false;
                }
            }
        } else {
            if (!this.xqx) {
                return false;
            }
            this.ei = System.currentTimeMillis();
            this.f57309ab.postDelayed(this.k84, ViewConfiguration.getLongPressTimeout());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z1r(String str, WeakReference weakReference, String str2, WeakReference weakReference2, Map map) {
        if (C1819o.eqxt(this.f9074f)) {
            Bitmap bitmap = (Bitmap) map.get(str);
            if (bitmap != null && !bitmap.isRecycled() && weakReference.get() != null) {
                ((ImageView) weakReference.get()).setImageBitmap(bitmap);
            }
            Bitmap bitmap2 = (Bitmap) map.get(str2);
            if (bitmap2 == null || bitmap2.isRecycled() || weakReference2.get() == null) {
                return;
            }
            ((ImageView) weakReference2.get()).setImageBitmap(bitmap2);
        }
    }

    private String zah1(com.android.thememanager.fu4 resourceContext, Resource r2) {
        String strJk = com.android.thememanager.util.uc.jk(resourceContext, r2);
        if (!com.android.thememanager.basemodule.utils.o1t.m7179z()) {
            return strJk;
        }
        if ((!com.android.thememanager.util.ch.vyq(strJk) && !com.android.thememanager.util.ch.n5r1(strJk)) || !this.ut) {
            return strJk;
        }
        String strM28220k = zsr0.toq.m28220k(strJk);
        return !TextUtils.isEmpty(strM28220k) ? strM28220k : strJk;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zaso() {
        if (C1819o.eqxt(getActivity())) {
            if (this.q09 == null) {
                this.q09 = new ki.C6947k(getActivity()).fu4(R.string.dialog_apply_lock_screen_wallpaper_content).lrht(R.string.dialog_apply_lock_screen_wallpaper_warning).m25047s(true).dd(R.string.i_know, new k()).m25037g();
            }
            this.q09.show();
        }
    }

    protected Bitmap a8p6(String localPath, String onlineUrl, int width, int height) {
        boolean z2;
        Bitmap bitmapUv = uv(localPath);
        if (bitmapUv == null) {
            bitmapUv = this.k0.m10075y(onlineUrl);
            if (bitmapUv == null) {
                return null;
            }
            z2 = true;
        } else {
            z2 = false;
        }
        try {
            bitmapM9645g = C2949g.f7l8(bitmapUv.getColorSpace()) ? C2763c.m9645g(bitmapUv, width, height) : null;
            if (bitmapM9645g == null) {
                bitmapM9645g = Bitmap.createBitmap(width, height, bitmapUv.getConfig());
            }
            C1819o.m7167y(bitmapM9645g, getContext());
            C1819o.m7167y(bitmapUv, getContext());
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
        }
        if (bitmapM9645g != null) {
            C2763c.k kVar = new C2763c.k();
            kVar.f16351n = new Rect(0, 0, bitmapUv.getWidth(), bitmapUv.getHeight());
            synchronized (bitmapM9645g) {
                C2763c.f7l8(bitmapUv, bitmapM9645g, kVar);
            }
        }
        if (!z2 && bitmapUv != bitmapM9645g) {
            bitmapUv.recycle();
        }
        return bitmapM9645g;
    }

    @Override // com.android.thememanager.activity.ij
    protected void ab(int index) {
        this.f9878y.zy(this.f9070b.getOnlineInfo().getTrackId());
    }

    protected void ae4(boolean isSystemImage) {
        Resource resource;
        this.bq.setEnabled(this.sk1t);
        this.ba.setEnabled(this.sk1t);
        if (com.android.thememanager.basemodule.utils.o1t.m7171i() || this.hp == 1 || (resource = this.f9070b) == null || TextUtils.isEmpty(resource.getOnlineId()) || isSystemImage) {
            this.ax.setVisibility(4);
            return;
        }
        this.ax.setVisibility(0);
        this.ax.setEnabled(this.sk1t);
        this.ax.setSelected(EnumC1933t.FAVORITE.contains(this.f9070b));
    }

    protected boolean alcv() {
        return true;
    }

    protected void anw() {
        if (!com.android.thememanager.basemodule.privacy.x2.zy() && !TextUtils.isEmpty(ip(this.f9059l, cn02()))) {
            u38j().m6909i(getActivity(), null);
            return;
        }
        if (this.ad == null) {
            com.android.thememanager.view.ncyb ncybVar = new com.android.thememanager.view.ncyb((AbstractActivityC1717k) getActivity());
            this.ad = ncybVar;
            ncybVar.ld6(this.bsb);
        }
        this.ad.n7h(this.f9070b.getWallpaperType(), this.f9070b.getWallpaperTypeId());
        if (this.ad.m10411y()) {
            return;
        }
        this.ad.x2();
    }

    protected abstract void b6(String sourceType, String onlineUrl, int applyType, WallpaperApplyInfos infos);

    protected void bmt3() {
        AutoSwitchPreviewView autoSwitchPreviewView;
        ImageView imageView = this.eht;
        if (imageView == null || (autoSwitchPreviewView = this.zmmu) == null) {
            return;
        }
        imageView.setVisibility((autoSwitchPreviewView.qrj() && zt()) ? 0 : 4);
    }

    @Override // com.android.thememanager.activity.ij
    protected void bqie() {
        super.bqie();
        String onlineId = this.f9070b.getOnlineId();
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        boolean zIsEmpty = TextUtils.isEmpty(onlineId);
        String str = com.android.thememanager.basemodule.analysis.toq.iby;
        if (!zIsEmpty) {
            arrayMapM6679k.put("productId", onlineId);
            this.ls9 = com.android.thememanager.basemodule.analysis.toq.t0;
        } else if (com.android.thememanager.util.ch.vyq(this.f9070b.getContentPath())) {
            arrayMapM6679k.put("title", this.f9070b.getTitle());
            this.ls9 = com.android.thememanager.basemodule.analysis.toq.qe;
        } else {
            this.ls9 = com.android.thememanager.basemodule.analysis.toq.iby;
        }
        arrayMapM6679k.put("entryType", this.k6e);
        if (this.f9074f.se()) {
            str = com.android.thememanager.basemodule.analysis.toq.t0;
        }
        C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.cjaj, C1706p.m6655s(str));
        com.android.thememanager.basemodule.analysis.zy.m6681q(arrayMapM6679k);
        if (TextUtils.isEmpty(onlineId)) {
            onlineId = this.f9070b.getContentPath();
        }
        com.android.thememanager.basemodule.analysis.kja0.m6641s("T_EXPOSE", this.ls9, onlineId, new C4871g().o1t(arrayMapM6679k));
        C1708s.f7l8().ld6().cdj(C1706p.n7h(this.ls9, onlineId, arrayMapM6679k));
    }

    @Override // com.android.thememanager.activity.ij
    protected Resource btvn(Intent intent) {
        String path;
        String stringExtra = intent.getStringExtra(com.android.thememanager.util.uc.f16820g);
        Resource resource = new Resource();
        if (stringExtra != null) {
            Uri uri = Uri.parse(stringExtra);
            this.xk5 = uri;
            path = uri.getPath();
        } else {
            Uri data = intent.getData();
            this.xk5 = data;
            if (data == null) {
                path = null;
            } else if ("file".equals(data.getScheme())) {
                path = this.xk5.getPath();
            } else if ("content".equals(this.xk5.getScheme())) {
                path = C2687z.m9384y() + C1822q.zy(this.xk5.toString());
                this.dy = path;
                new h(this, this.xk5, this.dy).executeOnExecutor(C6002g.ld6(), new Void[0]);
            } else {
                Log.w(v62, "not support uri scheme");
                path = null;
            }
        }
        if (TextUtils.isEmpty(path) || !(new File(path).exists() || path.equals(this.dy))) {
            com.android.thememanager.basemodule.utils.nn86.toq(this.f9074f.getResources().getString(R.string.the_picture_is_not_support), 0);
            return null;
        }
        resource.setContentPath(path);
        return resource;
    }

    @Override // com.android.thememanager.controller.cdj.toq
    /* JADX INFO: renamed from: c */
    public void mo6444c(Bundle result) {
    }

    protected void c2() {
    }

    protected abstract boolean cp();

    protected String dbf(Resource resource) {
        String strIp = ip(this.f9059l, resource);
        if (strIp == null) {
            return strIp;
        }
        return strIp.replaceFirst("w\\d+", AnimatedProperty.PROPERTY_NAME_W + this.f9059l.getPreviewImageWidth());
    }

    protected Bitmap es7() {
        return com.android.thememanager.v9.toq.m10207q(getContext(), this.in.getImageMatrix(), this.in.getWidth(), this.in.getHeight(), this.in.getImageBitmap(), false, false);
    }

    @Override // com.android.thememanager.activity.ij
    protected boolean exv8(Intent intent) {
        return com.android.thememanager.util.uc.f16827n.equals(intent.getAction()) || "android.intent.action.VIEW".equals(intent.getAction());
    }

    @Override // com.android.thememanager.activity.ij
    protected void f3f() {
    }

    @Override // com.android.thememanager.activity.ij
    protected void g0ad() {
        oei();
    }

    @Override // com.android.thememanager.activity.ij
    protected boolean hyow(Intent intent) {
        if (this.f9074f.yqrt() != 9) {
            return super.hyow(intent);
        }
        try {
            ArrayList arrayList = new ArrayList();
            C0004k<Resource> c0004k = new C0004k<>();
            Uri data = intent.getData();
            this.f9076m = Integer.parseInt(data.getQueryParameter("index"));
            JSONArray jSONArray = new JSONArray(data.getQueryParameter("resourceList"));
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                c0004k.add(com.android.thememanager.util.uc.mcp(jSONArray.getJSONObject(i2), this.f9059l, false));
            }
            arrayList.add(c0004k);
            this.f9077o = 0;
            this.f9073e = arrayList;
            this.f9075j = c0004k;
            int i3 = this.f9076m;
            if (i3 >= 0) {
                return i3 < c0004k.size();
            }
            return false;
        } catch (JSONException e2) {
            Log.e(v62, "initDataSetByExternalResources() : " + e2.toString());
            return false;
        }
    }

    @Override // com.android.thememanager.controller.cdj.toq
    public void i1(Bundle result) {
    }

    @Override // com.android.thememanager.activity.ij
    @SuppressLint({"ClickableViewAccessibility"})
    protected void i3x9() {
        boolean booleanExtra;
        z4t().mcp();
        jre();
        WallpaperView wallpaperView = (WallpaperView) tww7(R.id.wallpaperView);
        this.in = wallpaperView;
        wallpaperView.ncyb(this.cecm);
        this.in.setGestureListener(this.r7v2);
        this.in.setMatrixChangeListener(this.l2jk);
        if (!mkmm()) {
            ie();
        }
        this.in.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.thememanager.activity.e
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f8994k.ydj3(view, motionEvent);
            }
        });
        ActivityC0891q activity = getActivity();
        int[] iArr = this.w97r;
        this.k0 = new com.android.thememanager.util.x9kr(activity, 3, iArr[0], iArr[1], this.kdv1);
        this.as = (ViewGroup) tww7(R.id.wallpaper_detail_operation_bar);
        if (com.android.thememanager.basemodule.utils.y9n.m7258z()) {
            C1819o.hb(this.f9074f, 0);
            this.f9074f.getWindow().getDecorView().setSystemUiVisibility(1792);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.as.getLayoutParams();
            marginLayoutParams.bottomMargin += com.android.thememanager.basemodule.utils.y9n.cdj(this.f9074f);
            this.as.setLayoutParams(marginLayoutParams);
        }
        this.th6 = new com.android.thememanager.controller.online.mcp(this.f9074f.se() ? com.android.thememanager.basemodule.analysis.toq.t0 : com.android.thememanager.basemodule.analysis.toq.iby);
        this.ba = (TextView) tww7(R.id.choose_super_wallpaper_button);
        c2();
        C6077k.m22369i(this.ba);
        com.android.thememanager.util.dd.m9704k(this.ba, com.android.thememanager.util.dd.f16402k);
        this.ba.setOnClickListener(this);
        this.zmmu = (AutoSwitchPreviewView) tww7(R.id.preview_mask);
        if (com.android.thememanager.basemodule.utils.o1t.m7171i()) {
            try {
                TemplateConfig templateConfigM9306k = C2670y.m9306k();
                this.oyp = templateConfigM9306k;
                if (templateConfigM9306k == null) {
                    return;
                }
                this.afw = com.android.thememanager.lockscreen.lock.zy.f12538k.m8161k(getContext(), this.oyp.getClockInfo().getTemplateId());
                if (this.oyp.getWallpaperInfo() != null && TextUtils.equals(this.oyp.getClockInfo().getTemplateId(), "doodle")) {
                    this.oyp.getWallpaperInfo().setSupportSubject(false);
                }
                ((BaseTemplateView) this.afw).kja0();
                this.zmmu.addView(this.afw);
                this.zmmu.m7297p(this.afw);
                ((BaseTemplateView) this.afw).m8051z(this.oyp, true, true);
            } catch (Exception e2) {
                Log.d(v62, "addTemplageView: " + e2.getMessage());
            }
        } else {
            MiuiClockView miuiClockView = (MiuiClockView) tww7(R.id.lockscreen_clock);
            this.ay = miuiClockView;
            miuiClockView.setVisibility(0);
            this.ay.x2(new ClockBean(AbstractC5074q.f29194r));
            this.zmmu.m7298s(this.ay);
        }
        View viewTww7 = tww7(R.id.wallpaper_detail_loading_view);
        this.am = viewTww7;
        viewTww7.setEnabled(false);
        this.am.setClickable(true);
        this.am.setAlpha(1.0f);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        this.be = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setInterpolator(new LinearInterpolator());
        this.be.setDuration(300L);
        this.be.addUpdateListener(this.h06);
        this.be.addListener(this.gjxq);
        Intent intent = this.f9074f.getIntent();
        this.vb6 = intent.getFloatArrayExtra(InterfaceC1357q.f46174do);
        this.k6e = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
        ImageView imageView = (ImageView) tww7(R.id.wallpaper_detail_favorite_btn);
        this.ax = imageView;
        imageView.setOnClickListener(this);
        ImageView imageView2 = (ImageView) tww7(R.id.wallpaper_detail_scroll_btn);
        this.bq = imageView2;
        imageView2.setOnClickListener(this);
        this.bq.setVisibility(4);
        ImageView imageView3 = (ImageView) tww7(R.id.back_btn);
        this.ac = imageView3;
        imageView3.setBackground(getActivity().getDrawable(R.drawable.btn_half_tran_bg));
        C6077k.m22369i(this.ac);
        C1819o.kja0(getActivity(), (FrameLayout) tww7(R.id.back_btn_container));
        this.ac.setOnClickListener(this);
        C6077k.cdj(this.bq);
        C6077k.cdj(this.ax);
        zi4o();
        this.hp = intent.getIntExtra(InterfaceC1357q.f53840a5id, 0);
        this.f9877s = intent.getStringExtra(InterfaceC1357q.f53875ga);
        String stringExtra = intent.getStringExtra(InterfaceC1357q.f53929pc);
        int i2 = this.hp;
        if (i2 == 2 || i2 == 4 || stringExtra != null) {
            boolean booleanExtra2 = intent.getBooleanExtra(InterfaceC1357q.f53918ngy, true);
            this.cw14 = booleanExtra2;
            if (booleanExtra2) {
                int intExtra = intent.getIntExtra(InterfaceC1357q.f53930pjz9, -1);
                if (intExtra != -1) {
                    intExtra++;
                }
                int i3 = intExtra;
                if (this.hp == 3) {
                    this.s8y = (ArrayList) intent.getSerializableExtra(InterfaceC1357q.f53881h4b);
                    booleanExtra = intent.getBooleanExtra(InterfaceC1357q.f53958wlev, true);
                } else {
                    booleanExtra = true;
                }
                C1901h c1901h = new C1901h(this.f9059l.getResourceCode(), this, stringExtra, i3, this.hp, this.s8y, booleanExtra);
                this.mjvl = c1901h;
                c1901h.m7470g(this.v3, this.f9076m, this.f9075j.size(), true, false, this.f9075j.size());
            }
        }
        com.android.thememanager.view.ncyb ncybVar = new com.android.thememanager.view.ncyb((AbstractActivityC1717k) getActivity());
        this.ad = ncybVar;
        ncybVar.ld6(this.bsb);
        if (com.android.thememanager.basemodule.utils.o1t.m7171i()) {
            rig();
        }
    }

    protected boolean jog(boolean reset, boolean firstShow) {
        return false;
    }

    protected void jre() {
        Point pointFn3e = com.android.thememanager.basemodule.utils.y9n.fn3e();
        int iMin = Math.min(pointFn3e.x, pointFn3e.y);
        int iMax = Math.max(pointFn3e.x, pointFn3e.y);
        int[] iArr = this.tgs;
        int[] iArr2 = this.w97r;
        iArr2[0] = iMin;
        iArr[0] = iMin;
        iArr2[1] = iMax;
        iArr[1] = iMax;
    }

    protected Resource jyr(int offsetFromCurrent) {
        int i2 = this.f9076m + offsetFromCurrent;
        if (i2 < 0 || i2 >= this.f9075j.size()) {
            return null;
        }
        return this.f9075j.get(i2);
    }

    public void ln() {
        if (com.android.thememanager.util.oc.m9943c().lrht()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.supersave_mode_toast_message, 0);
        } else {
            if (com.android.thememanager.util.oc.ncyb(getActivity())) {
                return;
            }
            anw();
        }
    }

    protected boolean mkmm() {
        return true;
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.basemodule.analysis.qrj
    public void ncyb(String lastVisibleResourceTrackId) {
        if (lastVisibleResourceTrackId == null || lastVisibleResourceTrackId.equals(this.f9070b.getOnlineInfo().getTrackId())) {
            return;
        }
        this.f9878y.m6643n(lastVisibleResourceTrackId);
    }

    protected void oaex(boolean show) {
        FrameLayout.LayoutParams layoutParams;
        ImageView imageView = this.bg;
        if (imageView == null || this.az == null || this.in == null) {
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) imageView.getLayoutParams();
        Rect currentContainer = this.in.getCurrentContainer();
        boolean zX9kr = C1819o.x9kr();
        if (layoutParams2 != null && currentContainer != null) {
            if (zX9kr) {
                layoutParams2.rightMargin = com.android.thememanager.basemodule.utils.y9n.fn3e().x - currentContainer.right;
            } else {
                layoutParams2.leftMargin = currentContainer.left;
            }
            layoutParams2.topMargin = currentContainer.top;
            layoutParams2.width = currentContainer.width();
            layoutParams2.height = currentContainer.height();
            this.bg.setVisibility(0);
            this.bg.requestLayout();
        }
        if (show && (layoutParams = (FrameLayout.LayoutParams) this.az.getLayoutParams()) != null && currentContainer != null) {
            if (zX9kr) {
                layoutParams.rightMargin = com.android.thememanager.basemodule.utils.y9n.fn3e().x - currentContainer.right;
            } else {
                layoutParams.leftMargin = currentContainer.left;
            }
            layoutParams.topMargin = currentContainer.top;
            layoutParams.width = currentContainer.width();
            layoutParams.height = currentContainer.height();
            this.az.setVisibility(0);
            this.az.requestLayout();
        }
        ObjectAnimator objectAnimatorVddr = vddr(show);
        if (objectAnimatorVddr != null) {
            objectAnimatorVddr.start();
        }
    }

    public void oei() {
        if (this.k0 == null) {
            return;
        }
        if (getActivity() == null || !exv8(getActivity().getIntent()) || !eu() || (!com.android.thememanager.basemodule.utils.lvui.jk(getActivity()) && com.android.thememanager.basemodule.utils.lvui.m7132t())) {
            iz();
            int i2 = this.bd ? 1 : -1;
            this.k0.ld6(this.f9076m);
            s31(0);
            s31(i2);
            s31(-i2);
            this.in.invalidate();
        }
    }

    @Override // com.android.thememanager.activity.ij, com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (getActivity() != null && exv8(getActivity().getIntent()) && eu()) {
            com.android.thememanager.basemodule.utils.lvui.m7131s((AbstractActivityC1717k) getActivity(), this.lr4);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        if (v2.getId() == R.id.choose_super_wallpaper_button) {
            boolean zIsEmpty = TextUtils.isEmpty(ip(this.f9059l, cn02()));
            WallpaperView wallpaperView = this.in;
            if (wallpaperView == null || wallpaperView.zurt()) {
                return;
            }
            if (zIsEmpty || !com.android.thememanager.basemodule.utils.lvui.kja0(this, this.ule)) {
                ln();
                return;
            }
            return;
        }
        if (v2.getId() == R.id.wallpaper_detail_favorite_btn) {
            this.th6.m7593y(this.f9074f, v2, this.f9059l, this.f9070b, this.f9877s);
        } else if (v2.getId() == R.id.wallpaper_detail_scroll_btn) {
            sm(!v2.isSelected());
        } else if (v2.getId() == R.id.back_btn) {
            getActivity().onBackPressed();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@zy.lvui Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if (this.bl == null || mkmm()) {
            return;
        }
        this.bl.toq();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(@zy.dd Bundle bundle) {
        super.onCreate(bundle);
        this.f9076m = bundle != null ? bundle.getInt("screen_index_tag", -1) : -1;
        this.ut = C1819o.d2ok(getActivity());
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.wallpaper_detail, (ViewGroup) null);
    }

    @Override // com.android.thememanager.activity.ij, com.android.thememanager.activity.C1582h, com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        com.android.thememanager.view.ncyb ncybVar = this.ad;
        if (ncybVar != null && ncybVar.m10411y()) {
            this.ad.zy();
        }
        com.android.thememanager.util.kja0 kja0Var = this.qns;
        if (kja0Var != null) {
            kja0Var.m9847k();
        }
        com.android.thememanager.controller.n7h n7hVar = this.xy8;
        if (n7hVar != null) {
            n7hVar.cancel(true);
        }
        com.android.thememanager.controller.cdj.m7458q();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        wh();
    }

    @Override // com.android.thememanager.activity.ij, androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        com.android.thememanager.util.x9kr x9krVar = this.k0;
        if (x9krVar != null) {
            outState.putInt("screen_index_tag", x9krVar.m10072p());
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        com.android.thememanager.controller.cdj.toq(this);
        this.aj.toq(this.in, null);
        this.nq0z = true;
        if (this.bs) {
            oei();
            this.bs = false;
        }
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (alcv()) {
            this.bc = new Matrix(this.in.getImageMatrix());
        }
        com.android.thememanager.controller.cdj.m7458q();
        this.bs = true;
        com.android.thememanager.util.x9kr x9krVar = this.k0;
        if (x9krVar != null) {
            x9krVar.m10073q(true);
            this.in.d2ok();
            this.aj.zy(this.in, null);
        }
        androidx.collection.ld6<Integer, Bitmap> ld6Var = this.fn2;
        if (ld6Var != null) {
            ld6Var.m841q();
        }
    }

    public boolean qexj() {
        Intent intent = new Intent();
        intent.putExtra(InterfaceC1357q.f53902lh, this.f9076m);
        C0004k<Resource> c0004k = this.f9075j;
        if (c0004k != null) {
            int size = c0004k.size();
            int i2 = this.f9076m;
            if (size > i2) {
                intent.putExtra(InterfaceC1357q.f53846bap7, this.f9075j.get(i2).getOnlineId());
            }
        }
        intent.putExtra(InterfaceC1357q.f53881h4b, (Serializable) this.s8y);
        getActivity().setResult(-1, intent);
        return false;
    }

    protected void qla(boolean show) {
        WallpaperView wallpaperView;
        if (this.n5ij == null || (wallpaperView = this.in) == null || wallpaperView.getImageBitmap() == null) {
            return;
        }
        if (show) {
            ff();
            ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
            arrayMapM6679k.put("click_element_type", "preview");
            C1708s.f7l8().ld6().ni7(C1706p.n7h(!TextUtils.isEmpty(this.ls9) ? this.ls9 : this.f9074f.se() ? com.android.thememanager.basemodule.analysis.toq.t0 : com.android.thememanager.basemodule.analysis.toq.iby, this.f9070b.getOnlineInfo().getTrackId(), arrayMapM6679k));
        }
        ObjectAnimator objectAnimatorIzu = izu(show);
        if (objectAnimatorIzu != null) {
            objectAnimatorIzu.start();
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    protected void rig() {
        this.n5ij = (FrameLayout) tww7(R.id.magic_layout);
        ImageView imageView = (ImageView) tww7(R.id.wallpaper_magic_mode_btn);
        this.eht = imageView;
        imageView.setEnabled(false);
        C6077k.cdj(this.eht);
        int iAp23 = ap23(this.oyp.getWallpaperInfo());
        boolean zSb = sb(this.oyp.getWallpaperInfo());
        bmt3();
        if (com.android.thememanager.lockscreen.lock.wallpaper.kja0.f12503k.m8125g(iAp23, zSb)) {
            this.eht.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.thememanager.activity.ncyb
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f9264k.a3dw(view, motionEvent);
                }
            });
        }
    }

    @Override // com.android.thememanager.activity.ij
    protected void tjz5() {
    }

    public void vymi(int count) {
        this.yf = count;
        if (this.bq == null || !wqp()) {
            return;
        }
        this.bq.setVisibility(count > 1 ? 0 : 4);
    }

    protected boolean wqp() {
        return true;
    }

    protected void xnu(final boolean updateLauncherView) {
        if (this.fn2.m836g(Integer.valueOf(this.f9076m)) == null) {
            C2112y.toq(new Supplier() { // from class: com.android.thememanager.activity.hyr
                @Override // java.util.function.Supplier
                public final Object get() {
                    return this.f9065k.xouc();
                }
            }).ld6(new Consumer() { // from class: com.android.thememanager.activity.f
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f9045k.jb9(updateLauncherView, (Bitmap) obj);
                }
            });
        } else {
            Log.d(v62, "clock color pick cache bitmap");
            mq(this.fn2.m836g(Integer.valueOf(this.f9076m)), updateLauncherView);
        }
    }

    /* JADX INFO: renamed from: ybb, reason: merged with bridge method [inline-methods] */
    public boolean mla() {
        if (!mkmm()) {
            if (this.us2t && this.bl.m6485k()) {
            }
            return false;
        }
        if (this.zr5t) {
            return false;
        }
        this.d1cy = true;
        this.f57309ab.post(new Runnable() { // from class: com.android.thememanager.activity.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f9165k.qppo();
            }
        });
        return false;
    }

    protected void zi4o() {
        this.xqx = com.android.thememanager.basemodule.utils.o1t.m7179z();
        this.bg = (ImageView) tww7(R.id.converse_mode_image);
        this.az = (ImageView) tww7(R.id.converse_mode_image1);
    }

    protected boolean zt() {
        TemplateConfig templateConfig = this.oyp;
        return templateConfig != null && com.android.thememanager.lockscreen.lock.wallpaper.kja0.f12503k.m8125g(ap23(templateConfig.getWallpaperInfo()), sb(this.oyp.getWallpaperInfo()));
    }
}

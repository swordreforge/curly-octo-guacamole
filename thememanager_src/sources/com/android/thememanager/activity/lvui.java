package com.android.thememanager.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Point;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.util.Pair;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.asynclayoutinflater.view.C0238k;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.kja0;
import ch.InterfaceC1395k;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.account.C1688q;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.config.C1724k;
import com.android.thememanager.basemodule.config.model.Config;
import com.android.thememanager.basemodule.guideview.RestoreHomeIconHelper;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.local.zy;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.video.InterfaceC1836n;
import com.android.thememanager.detail.video.C2006k;
import com.android.thememanager.detail.video.model.LocalVideoResource;
import com.android.thememanager.detail.video.model.RemoteVideoResource;
import com.android.thememanager.detail.video.model.VideoResource;
import com.android.thememanager.detail.video.model.VideoWallpaperUtils;
import com.android.thememanager.detail.video.util.C2008g;
import com.android.thememanager.detail.video.util.C2009k;
import com.android.thememanager.detail.video.util.InterfaceC2010n;
import com.android.thememanager.detail.video.util.InterfaceC2011q;
import com.android.thememanager.detail.video.view.activity.VideoDetailActivity;
import com.android.thememanager.detail.video.view.widget.IncallShowPreviewMask;
import com.android.thememanager.detail.video.view.widget.VideoApplyButton;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.wallpaper.WallpaperTextureView;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.router.detail.entity.VideoInfoUtils;
import com.android.thememanager.superwallpaper.util.InterfaceC2733k;
import com.android.thememanager.wallpaper.C2951n;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.gson.C4871g;
import com.market.sdk.utils.C5012n;
import dr.InterfaceC5994k;
import ek5k.C6002g;
import gyi.C6068k;
import i1.C6077k;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.List;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.appcompat.app.ki;
import miuix.core.util.C7083n;
import yz.C7794k;

/* JADX INFO: compiled from: BaseVideoDetailFragment.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class lvui extends com.android.thememanager.basemodule.base.toq implements InterfaceC1789q, com.android.thememanager.basemodule.analysis.toq, InterfaceC5994k {
    public static final String cw14 = "position";
    private static volatile boolean d1cy = false;
    static final int ei = 2;
    public static final String hp = "video_info";
    protected static final String mjvl = "VideoDetailFragment";
    protected static final int ndjo = -1;
    private static final String q7k9 = "likeCount";
    private static final String th6 = "like";
    static final int wra = 3;
    static final int xqx = 0;
    public static final String xy8 = "apply_flag";
    static final int zr5t = 1;

    /* JADX INFO: renamed from: a */
    private String f9177a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    protected ProgressBar f57328ab;
    private ImageView ac;
    private View ad;
    private View aj;
    private ImageView am;
    private ch.zy ax;
    protected VideoApplyButton ay;
    protected VideoDetailActivity az;

    /* JADX INFO: renamed from: b */
    protected Resource f9178b;
    private InterfaceC1395k ba;
    private long bb;
    protected InterfaceC2010n bc;
    private String bd;
    private PlayerView be;
    protected boolean bl;
    private long bp;
    private IncallShowPreviewMask bq;
    private AspectRatioFrameLayout bs;
    private com.android.thememanager.basemodule.local.zy bu;
    private long bv;

    /* JADX INFO: renamed from: c */
    protected int f9179c;

    /* JADX INFO: renamed from: d */
    private Dialog f9180d;

    /* JADX INFO: renamed from: e */
    private com.google.android.exoplayer2.source.fti f9181e;

    /* JADX INFO: renamed from: f */
    private FrameLayout f9182f;
    protected boolean id;
    private boolean in;

    /* JADX INFO: renamed from: j */
    private boolean f9183j;

    /* JADX INFO: renamed from: l */
    private FrameLayout f9184l;

    /* JADX INFO: renamed from: m */
    protected VideoInfo f9185m;

    /* JADX INFO: renamed from: o */
    protected boolean f9186o;

    /* JADX INFO: renamed from: r */
    private WallpaperTextureView f9187r;
    private com.android.thememanager.util.kja0 sk1t;

    /* JADX INFO: renamed from: t */
    private ImageView f9188t;
    private miuix.appcompat.app.ki tlhn;

    /* JADX INFO: renamed from: u */
    protected VideoResource f9189u;

    /* JADX INFO: renamed from: v */
    private Dialog f9190v;

    /* JADX INFO: renamed from: w */
    protected boolean f9191w;
    private ObjectAnimator w97r;

    /* JADX INFO: renamed from: x */
    private int f9192x;
    protected C2006k yl25;
    private com.android.thememanager.detail.video.zy zmmu;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final InterfaceC1836n f57329bo = new n7h(5000);
    private boolean an = true;
    protected int as = -1;
    protected int bg = -1;
    private boolean k0 = false;
    protected final VideoSizeConfirm ar = new VideoSizeConfirm(this);
    private volatile boolean tgs = false;
    protected boolean dy = false;
    private p000a.zy vb6 = new C1604k();
    protected p000a.zy k6e = new C1603g();
    protected ld6.EnumC1748q xk5 = ld6.EnumC1748q.STATUS_NONE;
    private final InterfaceC2011q s8y = new f7l8();

    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    class f7l8 implements InterfaceC2011q {
        f7l8() {
        }

        @Override // com.android.thememanager.detail.video.util.InterfaceC2011q
        /* JADX INFO: renamed from: k */
        public void mo6437k(int playState) {
            if (lvui.this.sc()) {
                if (playState == 0) {
                    if (lvui.this.vc()) {
                        return;
                    }
                    lvui.this.oaex(0, false);
                    return;
                }
                if (playState != 1) {
                    if (playState == 2) {
                        lvui.this.am.setEnabled(true);
                        lvui.this.m22231a();
                        return;
                    } else {
                        if (playState != 5) {
                            return;
                        }
                        if (lvui.this.f9188t != null) {
                            lvui.this.f9188t.setBackgroundColor(-16777216);
                            lvui.this.oaex(0, false);
                        }
                        com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.can_not_apply_error, 1);
                        return;
                    }
                }
                if (lvui.this.vc()) {
                    lvui.this.oaex(8, false);
                } else {
                    lvui.this.oaex(8, true);
                }
                lvui.this.bv = System.currentTimeMillis();
                lvui lvuiVar = lvui.this;
                InterfaceC2010n interfaceC2010n = lvuiVar.bc;
                if (interfaceC2010n != null) {
                    lvuiVar.bp = interfaceC2010n.getDuration();
                } else {
                    Log.w(lvui.mjvl, "player state ready. but activity destroy!");
                }
            }
        }

        @Override // com.android.thememanager.detail.video.util.InterfaceC2011q
        public void toq(int width, int height) {
            VideoDetailActivity videoDetailActivity;
            if (lvui.this.sc()) {
                lvui lvuiVar = lvui.this;
                lvuiVar.as = width;
                lvuiVar.bg = height;
                try {
                    if (lvuiVar.bs != null && (videoDetailActivity = lvui.this.az) != null && !videoDetailActivity.ukdy()) {
                        lvui lvuiVar2 = lvui.this;
                        int i2 = lvuiVar2.as;
                        int i3 = lvuiVar2.bg;
                        if (i2 > i3) {
                            i3 = i2;
                            i2 = i3;
                        }
                        lvuiVar2.bs.setAspectRatio((i2 * 1.0f) / i3);
                    }
                } catch (ArithmeticException unused) {
                    Log.w(lvui.mjvl, "onVideoSizeChanged: video error mVideoHeight = " + lvui.this.bg);
                }
                if (width == 0 || height == 0) {
                    lvui.this.ac.setEnabled(false);
                    if (lvui.this.am != null) {
                        lvui.this.am.setEnabled(false);
                    }
                    if (lvui.this.getLifecycle().toq() == kja0.zy.RESUMED) {
                        lvui lvuiVar3 = lvui.this;
                        lvuiVar3.ar.m6373n(lvuiVar3);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.lvui$g */
    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    class C1603g implements p000a.zy {
        C1603g() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            lvui.this.mete();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(lvui.this.getContext(), false);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.lvui$k */
    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    class C1604k implements p000a.zy {
        C1604k() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            lvui.this.iz();
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                com.android.thememanager.basemodule.utils.lvui.ki(lvui.this.getContext(), true);
            } else {
                lvui.this.getActivity().finish();
            }
        }
    }

    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    protected static class ld6 extends AsyncTask<Void, Void, Boolean> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f57330f7l8;

        /* JADX INFO: renamed from: g */
        private boolean f9196g;

        /* JADX INFO: renamed from: k */
        private WeakReference<lvui> f9197k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private int f57331ld6;

        /* JADX INFO: renamed from: n */
        private boolean f9198n;

        /* JADX INFO: renamed from: p */
        private int f9199p;

        /* JADX INFO: renamed from: q */
        private String f9200q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private int f57332qrj;

        /* JADX INFO: renamed from: s */
        private int f9201s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f57333toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private String f57334x2;

        /* JADX INFO: renamed from: y */
        private int f9202y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f57335zy;

        ld6(lvui fragment, String clickType, boolean isAudioOn, String path, String trackId, boolean copyVideo, boolean needCompress, boolean isSupportLoop) {
            this(fragment, clickType, isAudioOn, path, trackId, copyVideo, needCompress, isSupportLoop, -1);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean doInBackground(Void... voids) {
            boolean zM8493y;
            boolean zM8490s;
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f9198n) {
                String strLd6 = C5012n.ld6(this.f9200q);
                String str = C1788k.f10167c;
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                String str2 = str + strLd6;
                if (!new File(str2).exists()) {
                    C7083n.zy(new File(this.f9200q), new File(str2));
                }
                this.f9200q = str2;
            }
            lvui lvuiVar = this.f9197k.get();
            if (lvuiVar == null) {
                return Boolean.FALSE;
            }
            zM8493y = true;
            if (lvuiVar.f9185m.onlineId == null) {
                if (C1807g.d2ok()) {
                    Log.w(lvui.mjvl, "pc mode can not set video wallpaper!");
                    return Boolean.FALSE;
                }
                int iZy = com.android.thememanager.basemodule.video.f7l8.zy(this.f9200q);
                if (iZy == 90 || iZy == 270) {
                    this.f9196g = true;
                }
            }
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            if (jCurrentTimeMillis2 < 500) {
                SystemClock.sleep(500 - jCurrentTimeMillis2);
            }
            this.f57330f7l8 = C2951n.fn3e().kja0() ? this.f57330f7l8 || C2951n.fn3e().x2(this.f9200q) : this.f57330f7l8;
            String str3 = this.f57333toq;
            str3.hashCode();
            switch (str3) {
                case "home_and_lockscreen_video_wallpaper":
                    zM8490s = C1807g.zurt() ? C2320q.m8490s(this.f9200q, false, true, this.f57330f7l8) : C2320q.qrj(this.f57335zy, this.f57330f7l8, true, this.f9200q, this.f9196g, lvuiVar.f9178b);
                    if (zM8490s && C1807g.m7081r()) {
                        C2320q.cdj(true);
                        C2320q.cdj(false);
                    }
                    zM8493y = zM8490s;
                    break;
                case "sensor_video_wallpaper":
                    zM8493y = C2320q.m8493y(this.f9200q, this.f57331ld6, this.f9201s, this.f9199p, this.f57332qrj, this.f57334x2);
                    break;
                case "lock_video_wallpaper":
                    zM8490s = C1807g.zurt() ? C2320q.m8490s(this.f9200q, true, false, this.f57330f7l8) : C2320q.m8487p(this.f57335zy, this.f9200q, lvuiVar.f9178b, this.f57330f7l8);
                    if (zM8490s && C1807g.m7081r()) {
                        C2320q.cdj(true);
                    }
                    zM8493y = zM8490s;
                    break;
                case "home_video_wallpaper":
                    zM8493y = C1807g.zurt() ? C2320q.m8490s(this.f9200q, false, false, this.f57330f7l8) : C2320q.qrj(this.f57335zy, this.f57330f7l8, false, this.f9200q, this.f9196g, lvuiVar.f9178b);
                    if (zM8493y && C1807g.m7081r()) {
                        C2320q.cdj(false);
                        break;
                    }
                    break;
                case "24h_video_wallpaper":
                    C2320q.f7l8(this.f9200q);
                    break;
            }
            if (zM8493y && ((com.android.thememanager.basemodule.analysis.toq.t57j.equals(this.f57333toq) || com.android.thememanager.basemodule.analysis.toq.lz.equals(this.f57333toq) || com.android.thememanager.basemodule.analysis.toq.jut.equals(this.f57333toq)) && com.android.thememanager.superwallpaper.util.toq.m9512q(com.android.thememanager.superwallpaper.util.toq.toq()))) {
                com.android.thememanager.superwallpaper.util.toq.m9511g();
            }
            return Boolean.valueOf(zM8493y);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            lvui lvuiVar = this.f9197k.get();
            if (lvuiVar == null || !C1819o.eqxt(lvuiVar.getActivity())) {
                return;
            }
            lvuiVar.f57328ab.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Boolean applyResult) {
            int i2;
            super.onPostExecute(applyResult);
            lvui lvuiVar = this.f9197k.get();
            if (lvuiVar != null) {
                lvuiVar.eklw(this.f57333toq, this.f9202y);
            }
            if (com.android.thememanager.basemodule.analysis.toq.t57j.equals(this.f57333toq) && !applyResult.booleanValue()) {
                if (C1807g.zurt() && lvuiVar != null && C1819o.eqxt(lvuiVar.getActivity())) {
                    lvuiVar.az.finish();
                    return;
                }
                return;
            }
            String str = this.f57333toq;
            str.hashCode();
            switch (str) {
                case "home_and_lockscreen_video_wallpaper":
                case "24h_video_wallpaper":
                    i2 = R.string.toast_both_all_apply_success;
                    break;
                case "lock_video_wallpaper":
                    i2 = R.string.toast_lockscreen_apply_success;
                    break;
                case "home_video_wallpaper":
                    i2 = R.string.toast_home_apply_success;
                    break;
                default:
                    i2 = R.string.toast_transparent_wallpaper_filter_set_successfully;
                    break;
            }
            if (!applyResult.booleanValue()) {
                i2 = R.string.toast_transparent_wallpaper_filter_set_failured;
            }
            com.android.thememanager.basemodule.utils.nn86.m7150k(i2, 1);
            if (lvuiVar == null || !C1819o.eqxt(lvuiVar.getActivity())) {
                return;
            }
            lvuiVar.f57328ab.setVisibility(8);
            if ("settings".equals(lvuiVar.bd) || com.android.thememanager.basemodule.utils.y9n.vyq()) {
                return;
            }
            new RestoreHomeIconHelper(lvuiVar.getActivity()).x2();
        }

        public ld6 zy(int rate, int allFrameCount, int smallFrameCount, int stiffness, String thumbnailPath) {
            this.f57331ld6 = rate;
            this.f9201s = allFrameCount;
            this.f9199p = smallFrameCount;
            this.f57334x2 = thumbnailPath;
            this.f57332qrj = stiffness;
            return this;
        }

        ld6(lvui fragment, String clickType, boolean isAudioOn, String path, String trackId, boolean copyVideo, boolean needCompress, boolean isSupportLoop, int foldApplyType) {
            this.f9202y = -1;
            this.f9197k = new WeakReference<>(fragment);
            this.f57333toq = clickType;
            this.f57335zy = isAudioOn;
            this.f9200q = path;
            this.f9198n = copyVideo;
            this.f9196g = needCompress;
            this.f57330f7l8 = isSupportLoop;
            this.f9202y = foldApplyType;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.lvui$n */
    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    class C1605n implements C1781k.g {
        C1605n() {
        }

        @Override // com.android.thememanager.basemodule.privacy.C1781k.g
        /* JADX INFO: renamed from: k */
        public void mo6371k(boolean agree) {
            if (agree) {
                lvui lvuiVar = lvui.this;
                if (com.android.thememanager.basemodule.utils.lvui.kja0(lvuiVar, lvuiVar.k6e)) {
                    return;
                }
                lvui.this.mete();
            }
        }
    }

    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    public static class n7h implements InterfaceC1836n {

        /* JADX INFO: renamed from: n */
        private volatile boolean f9204n;

        /* JADX INFO: renamed from: q */
        private volatile boolean f9205q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final long f57336toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f57337zy;

        public n7h(long threshold) {
            this.f57336toq = threshold;
        }

        @Override // com.android.thememanager.basemodule.video.InterfaceC1836n
        /* JADX INFO: renamed from: k */
        public boolean mo6439k() {
            m6440q();
            return this.f9204n;
        }

        /* JADX INFO: renamed from: q */
        synchronized void m6440q() {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime - this.f57336toq > this.f57337zy) {
                this.f9205q = com.android.thememanager.basemodule.utils.mcp.m7139n();
                this.f9204n = com.android.thememanager.basemodule.utils.mcp.f7l8();
                this.f57337zy = jElapsedRealtime;
            }
            if (lvui.d1cy && this.f9204n) {
                boolean unused = lvui.d1cy = false;
            }
        }

        @Override // com.android.thememanager.basemodule.video.InterfaceC1836n
        public boolean toq() {
            return lvui.d1cy;
        }

        @Override // com.android.thememanager.basemodule.video.InterfaceC1836n
        public boolean zy() {
            m6440q();
            return this.f9205q;
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.lvui$p */
    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    private static class AsyncTaskC1606p extends AsyncTask<Void, Void, Pair<File, File>> {

        /* JADX INFO: renamed from: k */
        private WeakReference<lvui> f9206k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f57338toq;

        AsyncTaskC1606p(lvui fragment, String path) {
            this.f9206k = new WeakReference<>(fragment);
            this.f57338toq = path;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Pair<File, File> doInBackground(Void... voids) {
            lvui lvuiVar = this.f9206k.get();
            if (isCancelled() || lvuiVar == null) {
                return new Pair<>(null, null);
            }
            Pair<File, File> pairZp = C2320q.zp(new File(this.f57338toq));
            File file = (File) pairZp.first;
            if (file != null) {
                C6068k.m22356q(C6068k.f35060p, gyi.toq.zy(file.getPath()));
            }
            File file2 = (File) pairZp.second;
            if (file2 != null) {
                File file3 = new File(C1788k.f10182r + file2.getName());
                if (C7083n.zy(file2, file3)) {
                    file2 = file3;
                }
            }
            return new Pair<>(file, file2);
        }

        @Override // android.os.AsyncTask
        protected void onPreExecute() {
            super.onPreExecute();
            lvui lvuiVar = this.f9206k.get();
            if (lvuiVar == null || !C1819o.eqxt(lvuiVar.getActivity())) {
                return;
            }
            lvuiVar.f57328ab.setVisibility(0);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Pair<File, File> splitResult) {
            int i2;
            lvui lvuiVar = this.f9206k.get();
            if (lvuiVar == null || !C1819o.eqxt(lvuiVar.getActivity())) {
                return;
            }
            lvuiVar.f57328ab.setVisibility(8);
            String strM25584g = C7083n.m25584g(this.f57338toq);
            lvuiVar.eklw(com.android.thememanager.basemodule.analysis.toq.wutb, -1);
            if (splitResult.first == null) {
                i2 = R.string.incall_show_apply_fail;
            } else {
                if (splitResult.second != null) {
                    Resource resource = new Resource();
                    String path = ((File) splitResult.second).getPath();
                    resource.setContentPath(path);
                    resource.setMetaPath(path);
                    C2320q.x2(lvuiVar.getActivity(), path);
                }
                com.android.thememanager.basemodule.utils.vyq.jp0y(InterfaceC1789q.ta3f, null, null, null, strM25584g, null, strM25584g);
                i2 = R.string.incall_show_apply_success;
            }
            com.android.thememanager.basemodule.utils.nn86.m7150k(i2, 1);
            if ("settings".equals(lvuiVar.az.mo6320f())) {
                lvuiVar.az.finish();
            } else {
                new RestoreHomeIconHelper(lvuiVar.getActivity()).x2();
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.lvui$q */
    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    class C1607q extends TransitionListener {
        C1607q() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onComplete(Object toTag) {
            if (lvui.this.k0) {
                return;
            }
            lvui.this.bq.setVisibility(8);
        }
    }

    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    private static class qrj implements C1688q.n {

        /* JADX INFO: renamed from: k */
        private WeakReference<lvui> f9208k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private boolean f57339toq;

        public qrj(lvui fragment, boolean addLike) {
            this.f9208k = new WeakReference<>(fragment);
            this.f57339toq = addLike;
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginFail(C1688q.g loginError) {
        }

        @Override // com.android.thememanager.basemodule.account.C1688q.n
        public void loginSuccess() {
            lvui lvuiVar = this.f9208k.get();
            if (lvuiVar == null || !lvuiVar.sc()) {
                return;
            }
            lvuiVar.e4e(this.f57339toq);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.lvui$s */
    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    static /* synthetic */ class C1608s {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f9209k;

        static {
            int[] iArr = new int[ld6.EnumC1748q.values().length];
            f9209k = iArr;
            try {
                iArr[ld6.EnumC1748q.STATUS_WAITING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9209k[ld6.EnumC1748q.STATUS_PENDING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9209k[ld6.EnumC1748q.STATUS_DOWNLOADING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9209k[ld6.EnumC1748q.STATUS_PAUSED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9209k[ld6.EnumC1748q.STATUS_SUCCESS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    class toq implements C0238k.n {
        toq() {
        }

        @Override // androidx.asynclayoutinflater.view.C0238k.n
        /* JADX INFO: renamed from: k */
        public void mo778k(View view, int resId, ViewGroup parent) {
            if (C1819o.eqxt(lvui.this.getActivity())) {
                lvui.this.ad = view;
                lvui.this.d1ts();
                lvui lvuiVar = lvui.this;
                lvuiVar.kt06(lvuiVar.ad);
                lvui lvuiVar2 = lvui.this;
                lvuiVar2.ula6(lvuiVar2.ad);
                lvui lvuiVar3 = lvui.this;
                lvuiVar3.uo(lvuiVar3.ad);
                if (lvui.this.ad == null || !lvui.this.sc()) {
                    return;
                }
                lvui lvuiVar4 = lvui.this;
                lvuiVar4.az.setOperationBar(lvuiVar4.ad);
            }
        }
    }

    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    private static class x2 implements zy.InterfaceC1756k {

        /* JADX INFO: renamed from: k */
        private WeakReference<lvui> f9211k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ch.zy f57340toq = new ch.zy(C1788k.ad);

        public x2(@zy.lvui lvui fragment) {
            this.f9211k = new WeakReference<>(fragment);
        }

        @Override // com.android.thememanager.basemodule.local.zy.InterfaceC1756k
        /* JADX INFO: renamed from: k */
        public void mo6442k(int totalBytes, int currentBytes) {
            lvui lvuiVar = this.f9211k.get();
            if (lvuiVar == null || lvuiVar.xk5 == ld6.EnumC1748q.STATUS_PAUSED) {
                return;
            }
            lvuiVar.ay.m7883q(null, lvuiVar.tjz5(totalBytes, currentBytes));
        }

        @Override // com.android.thememanager.basemodule.local.zy.InterfaceC1756k
        public void toq(ld6.EnumC1748q newStatus) {
            lvui lvuiVar = this.f9211k.get();
            if (lvuiVar != null) {
                lvuiVar.vahq(lvuiVar.f9179c, newStatus);
                if (newStatus == ld6.EnumC1748q.STATUS_SUCCESS) {
                    lvuiVar.anw();
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.activity.lvui$y */
    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    class C1609y extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f9212k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f9214q;

        C1609y(final View val$preview, final int val$visible) {
            this.f9212k = val$preview;
            this.f9214q = val$visible;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animation) {
            this.f9212k.setVisibility(this.f9214q);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            this.f9212k.setVisibility(this.f9214q);
        }
    }

    /* JADX INFO: compiled from: BaseVideoDetailFragment.java */
    class zy extends GestureDetector.SimpleOnGestureListener {
        zy() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e2) {
            if (lvui.this.oph()) {
                return false;
            }
            lvui lvuiVar = lvui.this;
            if (lvuiVar.f9179c == 2) {
                return false;
            }
            return lvuiVar.az.nsb(true, true);
        }
    }

    private void a8p6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void anhx() {
        new AsyncTaskC1606p(this, this.f9189u.getDownloadFilePath()).executeOnExecutor(C6002g.qrj(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void anw() {
        this.f9189u = new LocalVideoResource(this.f9189u.getDownloadFilePath());
        if (sc() && C1819o.eqxt(this.az)) {
            iz();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b2() {
        this.bc.y2();
    }

    private boolean b7() {
        return !this.f9189u.isDownloaded() || (C1807g.zurt() && !C1807g.wvg() && gcp());
    }

    private void c25(String applyClick) {
        if (C1819o.lvui()) {
            return;
        }
        new ld6(this, applyClick, false, this.f9189u.getDownloadFilePath(), this.f9185m.trackId, this.f9191w, this.id, this.bl).executeOnExecutor(C6002g.qrj(), new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d1ts() {
        C2009k c2009k = new C2009k(new com.android.thememanager.detail.video.util.toq(this.f9189u), this.f9185m);
        this.bu = c2009k;
        c2009k.toq(new x2(this));
    }

    private void d6c(String event) {
        com.android.thememanager.basemodule.analysis.kja0.m6641s(event, com.android.thememanager.basemodule.analysis.toq.h7, this.f9185m.trackId, null);
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g());
        arrayMapM6679k.put("name", this.f9185m.name);
        arrayMapM6679k.put("productId", this.f9178b.getOnlineId());
        arrayMapM6679k.put("source", this.f9186o ? com.android.thememanager.basemodule.analysis.toq.goq : com.android.thememanager.basemodule.analysis.toq.i4w);
        arrayMapM6679k.put("resourceType", "videowallpaper");
        C1708s.f7l8().ld6().n5r1(event, C1706p.n7h(com.android.thememanager.basemodule.analysis.toq.h7, this.f9185m.trackId, arrayMapM6679k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4e(boolean addLike) {
        this.zmmu.m7887f(addLike, this.f9177a);
        d6c(addLike ? "LIKE" : "DIS_LIKE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void erbd(final String str, TemplateConfig templateConfig) {
        if (com.android.thememanager.superwallpaper.util.toq.m9512q(templateConfig)) {
            new com.android.thememanager.util.kja0().m9849q(getActivity(), 2, true, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.mcp
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    this.f9241k.nc(str, dialogInterface, i2);
                }
            }).m9850y();
        } else {
            c25(str);
        }
    }

    private boolean f3f() {
        InterfaceC1836n interfaceC1836n = this.f57329bo;
        if (interfaceC1836n != null && !interfaceC1836n.zy()) {
            z4j7();
            return false;
        }
        InterfaceC1836n interfaceC1836n2 = this.f57329bo;
        if (interfaceC1836n2 == null || interfaceC1836n2.mo6439k() || this.f57329bo.toq()) {
            return true;
        }
        vh(new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.d3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                this.f8980k.j3y2(dialogInterface, i2);
            }
        });
        return false;
    }

    private boolean f7z0() {
        Config configLd6 = C1724k.m6723p().ld6();
        return (!com.android.thememanager.basemodule.utils.o1t.a9() || this.f9183j || VideoInfoUtils.isSystemFile(this.f9185m) || this.in || (configLd6 != null && configLd6.video_wallpaper_mute) || C1807g.m7081r()) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ff(int index) {
        InterfaceC2010n interfaceC2010n;
        if (getLifecycle().toq().isAtLeast(kja0.zy.RESUMED) && sc()) {
            rf();
        }
        if (sc() || !vc() || (interfaceC2010n = this.bc) == null) {
            return;
        }
        interfaceC2010n.hyr();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ge(View view) {
        if (C1819o.lvui()) {
            return;
        }
        if (!C1781k.toq(bf2.toq.toq()) && this.f9186o) {
            ew(true);
            return;
        }
        if (!com.android.thememanager.basemodule.privacy.x2.zy() && this.f9186o) {
            u38j().m6909i(getActivity(), new C1605n());
        } else {
            if (com.android.thememanager.basemodule.utils.lvui.kja0(this, this.k6e)) {
                return;
            }
            mete();
        }
    }

    private void i1an(View view) {
        this.f9184l = (FrameLayout) view.findViewById(R.id.video_view);
        this.f9182f = (FrameLayout) view.findViewById(R.id.thumb);
        this.f9188t = (ImageView) view.findViewById(R.id.thumbnail);
        if (getContext() != null) {
            this.f9188t.setBackgroundColor(getContext().getColor(R.color.video_detail_preview_background_color));
        }
        this.f57328ab = (ProgressBar) view.findViewById(R.id.loading);
        this.bs = (AspectRatioFrameLayout) view.findViewById(R.id.ratio_frame);
        this.aj = view.findViewById(R.id.text_view);
        qla(this.f9184l);
        m8(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void j3y2(DialogInterface dialogInterface, int i2) {
        d1cy = true;
        rf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jyr() {
        int i2;
        final String[] strArr;
        if (com.android.thememanager.basemodule.utils.a9.zurt(bf2.toq.toq())) {
            if (f7z0()) {
                i2 = R.array.set_video_wallpaper_three_items_with_incall;
                strArr = new String[]{com.android.thememanager.basemodule.analysis.toq.t57j, com.android.thememanager.basemodule.analysis.toq.cun, com.android.thememanager.basemodule.analysis.toq.lz, com.android.thememanager.basemodule.analysis.toq.wutb};
            } else {
                i2 = R.array.set_video_wallpaper_three_items;
                strArr = new String[]{com.android.thememanager.basemodule.analysis.toq.t57j, com.android.thememanager.basemodule.analysis.toq.cun, com.android.thememanager.basemodule.analysis.toq.lz};
            }
        } else if (f7z0()) {
            i2 = R.array.set_wallpaper_two_items_with_incall;
            strArr = new String[]{com.android.thememanager.basemodule.analysis.toq.cun, com.android.thememanager.basemodule.analysis.toq.lz, com.android.thememanager.basemodule.analysis.toq.wutb};
        } else {
            i2 = R.array.set_wallpaper_two_items;
            strArr = new String[]{com.android.thememanager.basemodule.analysis.toq.cun, com.android.thememanager.basemodule.analysis.toq.lz};
        }
        miuix.appcompat.app.ki kiVarM25037g = new ki.C6947k(requireActivity(), 2131951635).zurt(i2, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.zurt
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                this.f9430k.zxq(strArr, strArr, dialogInterface, i3);
            }
        }).lrht(R.string.wallpaper_settings).mcp(android.R.string.cancel, null).m25037g();
        this.f9180d = kiVarM25037g;
        kiVarM25037g.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean k4jz(GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        gestureDetector.onTouchEvent(motionEvent);
        return true;
    }

    private boolean kl7m() {
        VideoResource videoResource = this.f9189u;
        if (videoResource instanceof LocalVideoResource) {
            return VideoWallpaperUtils.isDolbyVisionVideo(((LocalVideoResource) videoResource).getVideoType());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void m28(DialogInterface dialogInterface, int i2) {
        this.bu.mo6857k();
    }

    private void m8(View view) {
        this.bq = (IncallShowPreviewMask) view.findViewById(R.id.incall_preview);
        int iM7247h = com.android.thememanager.basemodule.utils.y9n.m7247h();
        if (iM7247h > 0) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.bq.getLayoutParams();
            layoutParams.bottomMargin = iM7247h;
            this.bq.setLayoutParams(layoutParams);
        }
    }

    private static boolean mub(Uri uri) {
        return "http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void nc(String str, DialogInterface dialogInterface, int i2) {
        c25(str);
    }

    private void nod(boolean isMute) {
        InterfaceC2010n interfaceC2010n = this.bc;
        if (interfaceC2010n != null) {
            interfaceC2010n.ikck(isMute);
        }
    }

    private Resource nyj(VideoInfo videoInfo) {
        Resource resource = new Resource();
        if (TextUtils.isEmpty(videoInfo.onlineId) && !TextUtils.isEmpty(videoInfo.path)) {
            videoInfo.onlineId = (String) C1792n.m6930b(videoInfo.path).second;
        }
        resource.setOnlineId(videoInfo.onlineId);
        resource.setProductId(videoInfo.productId);
        if (resource.getLocalInfo() != null) {
            String strSubstring = videoInfo.name;
            if (TextUtils.isEmpty(strSubstring) && !TextUtils.isEmpty(videoInfo.path)) {
                int iLastIndexOf = videoInfo.path.lastIndexOf("/") + 1;
                int iIndexOf = videoInfo.path.indexOf(com.android.thememanager.basemodule.resource.constants.toq.n96);
                if (iLastIndexOf > 0 && iIndexOf < videoInfo.path.length() && iIndexOf > iLastIndexOf) {
                    strSubstring = videoInfo.path.substring(iLastIndexOf, iIndexOf);
                }
            }
            resource.getLocalInfo().setTitle(strSubstring);
        }
        return resource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void oaex(final int visible, boolean animate) {
        View viewVss1 = vss1();
        if (!animate) {
            viewVss1.setVisibility(visible);
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewVss1, "alpha", 1.0f, 0.6f, 0.0f);
        this.w97r = objectAnimatorOfFloat;
        objectAnimatorOfFloat.addListener(new C1609y(viewVss1, visible));
        this.w97r.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean oph() {
        return this.bq != null && this.k0;
    }

    private void qla(View view) {
        final GestureDetector gestureDetector = new GestureDetector(view.getContext(), new zy());
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.thememanager.activity.t
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return lvui.k4jz(gestureDetector, view2, motionEvent);
            }
        });
    }

    private void rf() {
        this.az.nsb((oph() || this.f9179c == 2) ? false : true, false);
        View view = this.ad;
        if (view != null) {
            this.az.setOperationBar(view);
        }
        iz();
        sb();
    }

    private void sb() {
        boolean z2 = this.f9186o;
        String str = z2 ? com.android.thememanager.basemodule.analysis.toq.goq : com.android.thememanager.basemodule.analysis.toq.i4w;
        String onlineId = z2 ? this.f9178b.getOnlineId() : this.f9178b.getContentPath();
        if (TextUtils.isEmpty(onlineId)) {
            onlineId = this.f9185m.path;
        }
        ArrayMap arrayMap = new ArrayMap(4);
        arrayMap.put("name", this.f9185m.name);
        arrayMap.put("productId", onlineId);
        com.android.thememanager.basemodule.analysis.zy.m6681q(arrayMap);
        com.android.thememanager.basemodule.analysis.kja0.m6641s("T_EXPOSE", str, onlineId, new C4871g().o1t(arrayMap));
        C1708s.f7l8().ld6().cdj(C1706p.n7h(str, onlineId, arrayMap));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void sb1e(boolean z2) {
        if (z2) {
            mete();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean sc() {
        return this.f9192x == this.az.cv06();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ClickableViewAccessibility"})
    public void ula6(View root) {
        if (vc()) {
            ImageView imageView = (ImageView) root.findViewById(R.id.magic_mode);
            this.am = imageView;
            imageView.setEnabled(false);
            C6077k.cdj(this.am);
            this.am.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.thememanager.activity.eqxt
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    return this.f9041k.x7o(view, motionEvent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void uo(View root) {
        this.ac = (ImageView) root.findViewById(R.id.callShow);
        if (C1807g.m7081r()) {
            this.ac.setVisibility(4);
            return;
        }
        C6077k.f7l8(this.ac);
        final boolean zF7z0 = f7z0();
        this.ac.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.fti
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9049k.z5(zF7z0, view);
            }
        });
        if (zF7z0) {
            return;
        }
        if (VideoInfoUtils.isSystemFile(this.f9185m)) {
            this.ac.setVisibility(4);
        } else {
            this.ac.setImageResource(R.drawable.de_ic_callshow_disable);
        }
    }

    private void uv(VideoResource videoResource) {
        if (videoResource == null || videoResource.getExtraTag() == null) {
            return;
        }
        String string = this.ax.getString(videoResource.getDownloadFileName(), null);
        if (string != null) {
            this.ax.putString(videoResource.getDownloadFileName(), string + "," + videoResource.getExtraTag());
        } else {
            this.ax.putString(videoResource.getDownloadFileName(), videoResource.getExtraTag());
        }
        this.ax.apply();
    }

    private void vddr() {
        if (this.an) {
            long j2 = this.bb;
            if (j2 < this.bp) {
                this.bb = j2 + (System.currentTimeMillis() - this.bv);
            }
        }
        long j3 = this.bb;
        long j4 = this.bp;
        if (j3 > j4) {
            this.bb = j4;
        }
        HashMap map = new HashMap();
        map.put(com.android.thememanager.basemodule.analysis.toq.a5, String.valueOf(this.bp));
        map.put(com.android.thememanager.basemodule.analysis.toq.l42, String.valueOf(this.bb));
        C2008g.m7846k(com.android.thememanager.basemodule.analysis.toq.h7, this.f9185m.trackId, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void vg(int i2, String str, DialogInterface dialogInterface, int i3) {
        if (i2 == 0) {
            str = com.android.thememanager.basemodule.analysis.toq.lz;
        }
        c25(str);
    }

    private void vh(DialogInterface.OnClickListener agreeListener) {
        Dialog dialog = this.f9190v;
        if (dialog != null && dialog.isShowing()) {
            C7794k.m28196p(mjvl, "dialog is already showing");
            return;
        }
        miuix.appcompat.app.ki kiVarM25037g = new ki.C6947k(getActivity(), 2131951635).lrht(R.string.video_data_tips_title).fu4(R.string.video_data_tips_message).dd(R.string.theme_user_agreement_allow, agreeListener).mcp(R.string.theme_user_agreement_exit, null).m25047s(false).m25037g();
        this.f9190v = kiVarM25037g;
        kiVarM25037g.show();
    }

    private View vss1() {
        return vc() ? this.f9182f : this.f9188t;
    }

    private void wwp(View view) {
        this.be = (PlayerView) view.findViewById(R.id.video_view);
        this.f9188t = (ImageView) view.findViewById(R.id.thumbnail);
        if (getContext() != null) {
            this.f9188t.setBackgroundColor(getContext().getColor(R.color.video_detail_preview_background_color));
        }
        this.f57328ab = (ProgressBar) view.findViewById(R.id.loading);
        if (this.id) {
            this.be.setResizeMode(3);
        }
        this.be.setUseController(false);
        qla(this.be);
        m8(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean x7o(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.bc.bwp(false);
            if (le7()) {
                this.bc.y2();
            }
        } else if (action == 1) {
            this.bc.bwp(true);
            if (le7()) {
                new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.android.thememanager.activity.jp0y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9117k.b2();
                    }
                }, 100L);
            }
        }
        return false;
    }

    private void z4j7() {
        com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.online_no_network, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z5(boolean z2, View view) {
        if (!z2) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.not_support_incall_show, 0);
            return;
        }
        boolean z3 = !oph();
        C1708s.f7l8().ld6().ni7(C1706p.m6649g(com.android.thememanager.basemodule.analysis.toq.ffy, z3));
        this.ac.setSelected(z3);
        nod(!z3);
        if (!z3) {
            C6077k.toq(this.bq, new AnimConfig().addListeners(new C1607q()));
            this.k0 = false;
            vahq(this.f9179c, this.xk5);
            if (this.f9179c != 2) {
                this.az.nsb(true, false);
                return;
            }
            return;
        }
        this.k0 = true;
        this.bq.setVisibility(0);
        C6077k.zy(this.bq);
        vahq(2, this.xk5);
        if (this.f9179c != 2) {
            this.az.nsb(false, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z8(String str) {
        this.tgs = false;
        this.f9185m.path = str;
        zuf();
        if (isVisible() && sc() && getLifecycle().toq().isAtLeast(kja0.zy.RESUMED)) {
            rf();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zma(boolean z2) {
        if (z2) {
            mete();
        }
    }

    private void zuf() {
        VideoResource localVideoResource;
        VideoInfo videoInfo = this.f9185m;
        if (videoInfo != null) {
            Uri uri = Uri.parse(videoInfo.path);
            if ("content".equals(uri.getScheme())) {
                this.tgs = true;
                this.zmmu.hyr(uri).m4391p(this, new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.gvn7
                    @Override // androidx.lifecycle.jp0y
                    public final void toq(Object obj) {
                        this.f9058k.z8((String) obj);
                    }
                });
            } else if ("file".equals(uri.getScheme())) {
                this.f9185m.path = uri.getPath();
            }
            if (mub(uri)) {
                this.f9186o = true;
                VideoInfo videoInfo2 = this.f9185m;
                localVideoResource = new RemoteVideoResource(videoInfo2.path, videoInfo2.previewPath, videoInfo2.name, videoInfo2.onlineId, videoInfo2.sizeBytes, com.android.thememanager.basemodule.utils.hyr.zy(",", videoInfo2.innerTags));
                if (localVideoResource.isDownloaded()) {
                    localVideoResource = new LocalVideoResource(localVideoResource.getDownloadFilePath());
                }
            } else {
                localVideoResource = new LocalVideoResource(this.f9185m.path);
            }
            this.f9189u = localVideoResource;
            List<String> list = this.f9185m.innerTags;
            this.id = (list == null || list.isEmpty() || !this.f9185m.innerTags.contains("compress")) ? false : true;
            if (this.f9185m.onlineId == null) {
                this.id = false;
            }
            if (this.ba == null) {
                this.ba = new ch.zy(C1788k.ad);
            }
            String string = this.ba.getString(this.f9189u.getDownloadFileName(), null);
            List<String> list2 = this.f9185m.innerTags;
            if ((list2 != null && list2.contains(VideoInfoUtils.VIDEO_MUTE)) || (string != null && string.contains(VideoInfoUtils.VIDEO_MUTE))) {
                this.in = true;
            }
            if (this.f9185m.innerTags == null && string != null && string.length() > 0) {
                this.f9185m.innerTags = com.android.thememanager.basemodule.utils.hyr.m7090g(",", string);
            }
            List<String> list3 = this.f9185m.innerTags;
            this.bl = list3 != null && list3.contains(VideoInfoUtils.VIDEO_PRECUST) && this.f9185m.innerTags.contains("loop");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void zxq(String[] strArr, String[] strArr2, DialogInterface dialogInterface, int i2) {
        if (com.android.thememanager.basemodule.analysis.toq.wutb.equals(strArr[i2])) {
            new AsyncTaskC1606p(this, this.f9189u.getDownloadFilePath()).executeOnExecutor(C6002g.qrj(), new Void[0]);
            return;
        }
        final String str = strArr2[i2];
        boolean z2 = true;
        if (com.android.thememanager.util.kja0.m9846g("video", str) || com.android.thememanager.util.kja0.f7l8("video", str)) {
            final int qVar = com.android.thememanager.util.kja0.toq();
            this.sk1t = new com.android.thememanager.util.kja0().m9849q(getActivity(), qVar, true, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.jk
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface2, int i3) {
                    this.f9114k.vg(qVar, str, dialogInterface2, i3);
                }
            }).m9850y();
            return;
        }
        if (!com.android.thememanager.basemodule.analysis.toq.t57j.equals(str) && !com.android.thememanager.basemodule.analysis.toq.lz.equals(str)) {
            z2 = false;
        }
        if (z2) {
            new com.android.thememanager.superwallpaper.util.toq(new InterfaceC2733k() { // from class: com.android.thememanager.activity.a9
                @Override // com.android.thememanager.superwallpaper.util.InterfaceC2733k
                /* JADX INFO: renamed from: k */
                public final void mo6384k(TemplateConfig templateConfig) {
                    this.f8917k.erbd(str, templateConfig);
                }
            }).executeOnExecutor(C6002g.ld6(), new Void[0]);
        } else {
            c25(str);
        }
    }

    protected void ab(boolean isApplyIncallShow) {
        if (-1 == this.as || C2320q.kja0(getActivity())) {
            return;
        }
        if (C2320q.m8476e()) {
            com.android.thememanager.basemodule.utils.nn86.m7150k(R.string.supersave_mode_toast_message, 0);
            return;
        }
        if (this.f9183j) {
            new ld6(this, com.android.thememanager.basemodule.analysis.toq.bbg, false, this.f9189u.getDownloadFilePath(), this.f9185m.trackId, this.f9191w, this.id, this.bl).executeOnExecutor(C6002g.qrj(), new Void[0]);
            return;
        }
        if (isApplyIncallShow) {
            this.ar.m6374q(this, new Runnable() { // from class: com.android.thememanager.activity.d2ok
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8979k.anhx();
                }
            });
        } else if (i3x9()) {
            this.ar.m6374q(this, new Runnable() { // from class: com.android.thememanager.activity.fn3e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9047k.jyr();
                }
            });
        }
    }

    protected void eklw(String applyType, int foldType) {
        ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
        arrayMapM6679k.put("type", applyType);
        arrayMapM6679k.put("name", this.f9185m.name);
        arrayMapM6679k.put("source", this.f9186o ? com.android.thememanager.basemodule.analysis.toq.goq : com.android.thememanager.basemodule.analysis.toq.i4w);
        arrayMapM6679k.put("entryType", com.android.thememanager.basemodule.analysis.f7l8.m6607g());
        arrayMapM6679k.put("resourceType", "videowallpaper");
        arrayMapM6679k.put("productId", this.f9178b.getOnlineId());
        C1708s.f7l8().ld6().zurt(C1706p.n7h(kx3(), this.f9185m.trackId, arrayMapM6679k));
        com.android.thememanager.basemodule.analysis.kja0.f7l8(com.android.thememanager.basemodule.analysis.toq.h7, this.f9185m.trackId, applyType);
        C1708s.f7l8().ld6().ni7(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.h7, this.f9185m.trackId, applyType));
    }

    int fh() {
        Point pointM7248i = com.android.thememanager.basemodule.utils.y9n.m7248i();
        int i2 = pointM7248i.x;
        int i3 = pointM7248i.y;
        boolean z2 = this.as == 0 || this.bg == 0;
        boolean zWas = was(i2, i3);
        if (z2) {
            return 1;
        }
        return zWas ? 2 : 0;
    }

    protected boolean i3x9() {
        if (!com.android.thememanager.basemodule.utils.n5r1.toq(p001b.f7l8.f53825z4j7)) {
            return true;
        }
        if (this.tlhn == null) {
            this.tlhn = com.android.thememanager.basemodule.utils.n5r1.m7143k(getActivity(), R.string.forbid_video_wallpaper_by_second_space);
        }
        this.tlhn.show();
        return false;
    }

    protected void iz() {
        VideoInfo videoInfo;
        if ((com.android.thememanager.basemodule.utils.lvui.jk(bf2.toq.toq()) || !com.android.thememanager.basemodule.utils.lvui.m7132t()) && (videoInfo = this.f9185m) != null && kz28(videoInfo)) {
            return;
        }
        VideoResource videoResource = this.f9189u;
        if (videoResource == null || videoResource.isDownloaded() || f3f()) {
            if (this.bc == null) {
                bz2();
            }
            if (!this.bc.oki()) {
                bf2(this.bc);
            }
            this.bc.vy(this.s8y);
            this.bc.mo7842b(vc() ? this.aj : this.be);
            this.bc.ikck(!oph());
            this.bc.cfr(this.f9189u);
        }
    }

    public int kq() {
        if (kl7m()) {
            return 3;
        }
        return fh();
    }

    protected void kt06(View root) {
        ld6.C1749s c1749sN7h;
        this.ay = (VideoApplyButton) root.findViewById(R.id.apply);
        if (!this.f9189u.isDownloaded()) {
            com.android.thememanager.basemodule.local.ld6 ld6VarT8r = com.android.thememanager.basemodule.local.ld6.t8r();
            ld6.EnumC1748q enumC1748qM6824h = ld6VarT8r.m6824h(this.f9189u.getDownloadTaskId());
            this.xk5 = enumC1748qM6824h;
            if ((enumC1748qM6824h == ld6.EnumC1748q.STATUS_PAUSED || enumC1748qM6824h == ld6.EnumC1748q.STATUS_DOWNLOADING) && (c1749sN7h = ld6VarT8r.n7h(this.f9189u.getDownloadTaskId())) != null) {
                this.ay.m7883q(null, tjz5(c1749sN7h.f9993q, c1749sN7h.f57557zy));
            }
        }
        vahq(this.f9179c, this.xk5);
        this.ay.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.activity.oc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9297k.ge(view);
            }
        });
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String kx3() {
        if (sc()) {
            return gcp() ? com.android.thememanager.basemodule.analysis.toq.goq : com.android.thememanager.basemodule.analysis.toq.h7;
        }
        return null;
    }

    protected boolean kz28(VideoInfo mVideoInfo) {
        return mVideoInfo != null && TextUtils.isEmpty(Uri.parse(mVideoInfo.path).getScheme()) && C1792n.jp0y(mVideoInfo.path);
    }

    public boolean le7() {
        return gcp() && !C1807g.wvg();
    }

    @Override // com.android.thememanager.basemodule.base.toq
    public String m2t() {
        return this.f9179c == 2 ? com.android.thememanager.basemodule.analysis.toq.f4 : super.m2t();
    }

    @Override // dr.InterfaceC5994k
    public String mcp() {
        return "video";
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if (this.f9189u != null && b7()) {
            VideoInfo videoInfo = this.f9185m;
            String str = videoInfo.thumbnail;
            if ("sensor".equals(videoInfo.videoType) && !C1807g.wvg()) {
                str = this.f9185m.smallSensorThumbnail;
            }
            com.android.thememanager.basemodule.imageloader.x2.zy(getActivity(), str, this.f9188t);
        }
        a8p6();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        VideoDetailActivity videoDetailActivity = (VideoDetailActivity) requireActivity();
        this.az = videoDetailActivity;
        this.yl25 = (C2006k) new C0924e(videoDetailActivity).m4420k(C2006k.class);
        this.zmmu = (com.android.thememanager.detail.video.zy) new C0924e(this).m4420k(com.android.thememanager.detail.video.zy.class);
        VideoInfo videoInfo = (VideoInfo) getArguments().getSerializable(hp);
        this.f9185m = videoInfo;
        Resource resourceNyj = nyj(videoInfo);
        this.f9178b = resourceNyj;
        this.f9177a = resourceNyj.getOnlineId();
        this.f9183j = VideoInfoUtils.isDynamicVideoInfo(this.f9185m);
        this.f9192x = getArguments().getInt("position");
        this.f9179c = getArguments().getInt(xy8);
        this.f9191w = this.az.f11488l;
        zuf();
        VideoInfo videoInfo2 = this.f9185m;
        if (videoInfo2 != null && kz28(videoInfo2)) {
            com.android.thememanager.basemodule.utils.lvui.m7131s((AbstractActivityC1717k) getActivity(), this.vb6);
        }
        this.dy = com.android.thememanager.ncyb.m8422t();
        Log.d(mjvl, "support video effect：" + this.dy);
        bz2();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @zy.dd ViewGroup container, Bundle savedInstanceState) {
        return vc() ? inflater.inflate(R.layout.de_fragment_video_wallpaper_detail_fast_player, container, false) : inflater.inflate(R.layout.de_fragment_video_wallpaper_detail, container, false);
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        Dialog dialog = this.f9180d;
        if (dialog != null) {
            dialog.dismiss();
        }
        Dialog dialog2 = this.f9190v;
        if (dialog2 != null) {
            dialog2.dismiss();
        }
        miuix.appcompat.app.ki kiVar = this.tlhn;
        if (kiVar != null) {
            kiVar.dismiss();
            this.tlhn = null;
        }
        com.android.thememanager.util.kja0 kja0Var = this.sk1t;
        if (kja0Var != null) {
            kja0Var.m9847k();
        }
        com.android.thememanager.basemodule.local.zy zyVar = this.bu;
        if (zyVar != null) {
            zyVar.toq(null);
        }
        ObjectAnimator objectAnimator = this.w97r;
        if (objectAnimator != null) {
            objectAnimator.removeAllListeners();
            this.w97r.cancel();
        }
        InterfaceC2010n interfaceC2010n = this.bc;
        if (interfaceC2010n == null || interfaceC2010n.oki()) {
            return;
        }
        this.bc.pjz9(false);
        this.bc = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!sc() || this.tgs) {
            return;
        }
        rf();
    }

    @Override // com.android.thememanager.basemodule.base.toq, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        if (TextUtils.isEmpty(this.f9185m.trackId) || this.f9185m.trackId.startsWith(com.android.thememanager.util.hb.f16539r)) {
            return;
        }
        vddr();
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"ClickableViewAccessibility"})
    public void onViewCreated(@zy.lvui View view, @zy.dd Bundle savedInstanceState) {
        this.yl25.m7832c().m4391p(getViewLifecycleOwner(), new androidx.lifecycle.jp0y() { // from class: com.android.thememanager.activity.i
            @Override // androidx.lifecycle.jp0y
            public final void toq(Object obj) {
                this.f9066k.ff(((Integer) obj).intValue());
            }
        });
        if (vc()) {
            i1an(view);
        } else {
            wwp(view);
        }
        new C0238k(view.getContext()).m777k(R.layout.de_video_operation_bar, null, new toq());
        this.bd = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
    }

    @Override // dr.InterfaceC5994k
    public void r8s8() {
        this.ay.zy(gcp() ? R.string.wallpaper_apply_outer_and_inner : R.string.de_super_wp_apply_wallpaper_button_text, 100);
    }

    /* JADX INFO: renamed from: sj, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void mete() {
        ld6.EnumC1748q enumC1748q;
        boolean z2 = true;
        if (this.f9189u.isDownloaded() || (enumC1748q = this.xk5) == ld6.EnumC1748q.STATUS_SUCCESS) {
            if (!oph() && this.f9179c != 2) {
                z2 = false;
            }
            ab(z2);
            return;
        }
        if (enumC1748q == ld6.EnumC1748q.STATUS_DOWNLOADING) {
            this.bu.mo6859q();
            return;
        }
        if (enumC1748q == ld6.EnumC1748q.STATUS_PAUSED) {
            if (!C1781k.toq(bf2.toq.toq())) {
                ix(true, new C1781k.f7l8() { // from class: com.android.thememanager.activity.ni7
                    @Override // com.android.thememanager.basemodule.privacy.C1781k.f7l8
                    public final void y9n(boolean z3) {
                        this.f9266k.sb1e(z3);
                    }
                });
                return;
            }
            if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
                com.android.thememanager.basemodule.privacy.x2.m6916q(getContext(), new p000a.toq() { // from class: com.android.thememanager.activity.fu4
                    @Override // p000a.toq
                    public final void onSuccess() {
                        this.f9051k.mete();
                    }
                });
                return;
            } else if (this.f57329bo.zy()) {
                this.bu.mo6858n();
                return;
            } else {
                z4j7();
                return;
            }
        }
        if (enumC1748q == ld6.EnumC1748q.STATUS_NONE || enumC1748q == ld6.EnumC1748q.STATUS_FAILED || enumC1748q == ld6.EnumC1748q.STATUS_ERROR) {
            if (!C1781k.toq(bf2.toq.toq())) {
                ix(true, new C1781k.f7l8() { // from class: com.android.thememanager.activity.z
                    @Override // com.android.thememanager.basemodule.privacy.C1781k.f7l8
                    public final void y9n(boolean z3) {
                        this.f9425k.zma(z3);
                    }
                });
                return;
            }
            if (com.android.thememanager.basemodule.privacy.x2.f7l8()) {
                com.android.thememanager.basemodule.privacy.x2.m6916q(getContext(), new p000a.toq() { // from class: com.android.thememanager.activity.o1t
                    @Override // p000a.toq
                    public final void onSuccess() {
                        this.f9296k.kjd();
                    }
                });
                return;
            }
            if (this.ax == null) {
                this.ax = new ch.zy(C1788k.ad);
            }
            boolean zIsEmpty = TextUtils.isEmpty(this.ax.getString(this.f9189u.getDownloadFileName(), null));
            if (!TextUtils.isEmpty(this.f9189u.getExtraTag()) && zIsEmpty) {
                uv(this.f9189u);
            }
            if (!this.f57329bo.zy()) {
                z4j7();
            } else if (this.f57329bo.mo6439k()) {
                this.bu.mo6857k();
            } else {
                vh(new DialogInterface.OnClickListener() { // from class: com.android.thememanager.activity.wvg
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        this.f9368k.m28(dialogInterface, i2);
                    }
                });
            }
        }
    }

    protected int tjz5(int totalBytes, int currentBytes) {
        if (totalBytes == 0) {
            return 0;
        }
        return (int) ((currentBytes / totalBytes) * 100.0f);
    }

    protected void vahq(int applyFlag, ld6.EnumC1748q status) {
        this.xk5 = status;
        if (!f7z0()) {
            applyFlag = 1;
        }
        if (this.f9189u.isDownloaded() || status == ld6.EnumC1748q.STATUS_SUCCESS) {
            if (oph()) {
                this.ay.zy(R.string.incall_show_apply, 100);
                return;
            }
            if (applyFlag == 2) {
                this.ay.zy(R.string.incall_show_apply, 100);
                return;
            } else {
                if (applyFlag == 3 || applyFlag == 1) {
                    r8s8();
                    return;
                }
                return;
            }
        }
        int i2 = C1608s.f9209k[status.ordinal()];
        if (i2 == 1 || i2 == 2) {
            this.ay.toq(R.string.resource_waiting_download);
            return;
        }
        if (i2 == 3) {
            this.ay.zy(R.string.resource_downloading, 0);
        } else if (i2 == 4) {
            this.ay.toq(R.string.resource_waiting_pause);
        } else if (i2 != 5) {
            this.ay.zy((applyFlag & 1) != 0 ? R.string.resource_wallpaper_download : R.string.wallpaper_download_incall_show, 100);
        }
    }

    protected boolean vc() {
        return this.dy;
    }

    @Override // com.android.thememanager.basemodule.base.toq
    /* JADX INFO: renamed from: w */
    public String mo6436w() {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(com.google.android.exoplayer2.util.wvg.f67137toq, String.valueOf(oph()));
        return new C4871g().o1t(arrayMap);
    }

    @Override // com.android.thememanager.basemodule.base.toq, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
    }
}

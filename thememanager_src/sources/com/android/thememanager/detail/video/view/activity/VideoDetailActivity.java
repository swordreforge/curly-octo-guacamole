package com.android.thememanager.detail.video.view.activity;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.jp0y;
import androidx.viewpager.widget.ViewPager;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.activity.cnbm;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.basemodule.privacy.x2;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.basemodule.utils.hyr;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.basemodule.utils.ni7;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.qrj;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.basemodule.views.AutoSwitchPreviewView;
import com.android.thememanager.detail.theme.view.widget.BounceViewPager;
import com.android.thememanager.detail.video.C2006k;
import com.android.thememanager.detail.video.model.LocalVideoResource;
import com.android.thememanager.detail.video.model.RemoteVideoResource;
import com.android.thememanager.detail.video.model.VideoResource;
import com.android.thememanager.detail.video.util.InterfaceC2010n;
import com.android.thememanager.detail.video.view.activity.VideoDetailActivity;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.wallpaper.kja0;
import com.android.thememanager.router.detail.entity.VideoInfo;
import com.android.thememanager.util.uc;
import com.google.android.exoplayer2.t8r;
import com.google.android.exoplayer2.upstream.cache.InterfaceC3775k;
import i1.C6077k;
import java.io.Serializable;
import java.util.List;
import p001b.f7l8;
import yz.C7794k;
import zy.dd;

/* JADX INFO: loaded from: classes2.dex */
public class VideoDetailActivity extends AbstractActivityC1717k implements bf2.zy, InterfaceC1789q, f7l8, View.OnClickListener {
    private static final String ac = "index";
    private static final String ad = "path";
    private static final String am = "onlineId";
    private static final String as = "video_wallpaper_notification_has_showed";
    private static final String ax = "extra_apply_flag";
    private static final String ay = "PARAM_PREVIEW_PATH";
    private static final String az = "extra_serializable_video_info";
    private static final String ba = "extra_serializable_video_infos";
    public static final String bg = "videocache";
    public static final String bl = "com.android.thememanager.action.REQUEST_PERMISSION";
    private static final String bq = "extra_swipe_show_recommend";
    private static final String id = "VideoDetailActivity";
    public static final String in = "miui.intent.action.START_VIDEO_DETAIL";

    /* JADX INFO: renamed from: a */
    private View f11481a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private TemplateConfig f58048ab;

    /* JADX INFO: renamed from: b */
    private C2016q f11482b;
    protected InterfaceC2010n bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private ImageView f58049bo;

    /* JADX INFO: renamed from: c */
    private View f11483c;

    /* JADX INFO: renamed from: d */
    private C2006k f11484d;

    /* JADX INFO: renamed from: e */
    private FrameLayout f11485e;

    /* JADX INFO: renamed from: f */
    private cnbm f11486f;

    /* JADX INFO: renamed from: j */
    private BounceViewPager f11487j;

    /* JADX INFO: renamed from: l */
    public boolean f11488l;

    /* JADX INFO: renamed from: m */
    private boolean f11489m;

    /* JADX INFO: renamed from: o */
    private AutoSwitchPreviewView f11490o;

    /* JADX INFO: renamed from: u */
    private TextView f11492u;

    /* JADX INFO: renamed from: v */
    int f11493v;

    /* JADX INFO: renamed from: w */
    private View f11494w;

    /* JADX INFO: renamed from: x */
    private TextView f11495x;

    /* JADX INFO: renamed from: r */
    private String f11491r = "video";
    private p000a.zy bp = new toq();
    private final jp0y<Intent> bv = new jp0y() { // from class: com.android.thememanager.detail.video.view.activity.q
        @Override // androidx.lifecycle.jp0y
        public final void toq(Object obj) {
            this.f11512k.yl((Intent) obj);
        }
    };
    private final p000a.zy an = new zy();

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.activity.VideoDetailActivity$g */
    public interface InterfaceC2013g {
        /* JADX INFO: renamed from: k */
        void mo7848k();
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.activity.VideoDetailActivity$k */
    class C2014k implements BounceViewPager.InterfaceC1980k {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f11496k;

        C2014k(final int val$count) {
            this.f11496k = val$count;
        }

        @Override // com.android.thememanager.detail.theme.view.widget.BounceViewPager.InterfaceC1980k
        public void toq() {
            if (VideoDetailActivity.this.f11487j.getCurrentItem() >= this.f11496k - 1) {
                nn86.m7150k(R.string.up_to_the_end, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.activity.VideoDetailActivity$n */
    private class C2015n extends ViewPager.qrj {

        /* JADX INFO: renamed from: k */
        private final cnbm f11497k;

        /* JADX INFO: renamed from: q */
        private int f11499q;

        public C2015n(cnbm adapter) {
            this.f11497k = adapter;
        }

        /* JADX INFO: renamed from: g */
        private void m7849g(int position) {
            VideoInfo videoInfo;
            cnbm cnbmVar = this.f11497k;
            if (cnbmVar == null || cnbmVar.m6400z() == null || VideoDetailActivity.this.f11481a == null || (videoInfo = this.f11497k.m6400z().get(position)) == null) {
                return;
            }
            VideoDetailActivity.this.f11481a.setVisibility(4);
            VideoDetailActivity.this.f11495x.setText(videoInfo.pictureDescriptionTitle);
            VideoDetailActivity.this.f11492u.setText(videoInfo.pictureDescriptionContent);
            VideoDetailActivity.this.f11481a.setVisibility(0);
        }

        /* JADX INFO: renamed from: n */
        private boolean m7850n() {
            if (C1807g.zurt()) {
                return !VideoDetailActivity.this.mbx() || C1807g.wvg();
            }
            return false;
        }

        /* JADX INFO: renamed from: q */
        private boolean m7851q() {
            return VideoDetailActivity.this.f11489m && this.f11499q >= this.f11497k.mo5575n() + (-2);
        }

        @Override // androidx.viewpager.widget.ViewPager.qrj, androidx.viewpager.widget.ViewPager.InterfaceC1284p
        /* JADX INFO: renamed from: k */
        public void mo5550k(int state) {
            if (state == 1) {
                if (VideoDetailActivity.this.f11490o.getCurrentStatus() == 0) {
                    C6077k.gvn7(VideoDetailActivity.this.f11481a);
                    C6077k.gvn7(VideoDetailActivity.this.f58049bo);
                }
                if (m7851q()) {
                    VideoDetailActivity.this.ixz();
                }
                C6077k.gvn7(VideoDetailActivity.this.f11485e);
                return;
            }
            if (state == 0) {
                if (VideoDetailActivity.this.f11490o.getCurrentStatus() == 0) {
                    C6077k.eqxt(VideoDetailActivity.this.f11481a);
                    C6077k.eqxt(VideoDetailActivity.this.f58049bo);
                }
                C6077k.eqxt(VideoDetailActivity.this.f11485e);
                VideoDetailActivity.this.zwy();
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.qrj, androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void toq(int position) {
            this.f11499q = position;
            VideoDetailActivity.this.ebn(position);
            m7849g(position);
            if (m7851q()) {
                VideoDetailActivity.this.ixz();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.activity.VideoDetailActivity$q */
    static class C2016q {

        /* JADX INFO: renamed from: k */
        private ValueAnimator f11500k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private ValueAnimator f58051toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f58052zy;

        /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.activity.VideoDetailActivity$q$k */
        class k extends AnimatorListenerAdapter {
            k() {
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                if (C2016q.this.f58052zy) {
                    return;
                }
                C2016q.this.f58051toq.start();
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.detail.video.view.activity.VideoDetailActivity$q$toq */
        class toq extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ View f11502k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ View f11504q;

            toq(final View val$finger, final View val$path) {
                this.f11502k = val$finger;
                this.f11504q = val$path;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animation) {
                if (C2016q.this.f58052zy) {
                    return;
                }
                this.f11502k.setAlpha(1.0f);
                this.f11504q.setAlpha(1.0f);
                C2016q.this.f11500k.start();
            }
        }

        private C2016q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void f7l8(View view, View view2, ValueAnimator valueAnimator) {
            Integer num = (Integer) valueAnimator.getAnimatedValue();
            view.setTranslationX(num.intValue());
            view2.setTranslationX(num.intValue());
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: y */
        public static /* synthetic */ void m7855y(View view, View view2, ValueAnimator valueAnimator) {
            Float f2 = (Float) valueAnimator.getAnimatedValue();
            view.setAlpha(f2.floatValue());
            view2.setAlpha(f2.floatValue());
        }

        /* JADX INFO: renamed from: g */
        void m7856g() {
            ValueAnimator valueAnimator = this.f11500k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f11500k.cancel();
            }
            ValueAnimator valueAnimator2 = this.f58051toq;
            if (valueAnimator2 == null || !valueAnimator2.isRunning()) {
                return;
            }
            this.f58051toq.cancel();
        }

        void ld6(final View finger, final View path) {
            ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, C1819o.qrj(-300.0f));
            this.f11500k = valueAnimatorOfInt;
            valueAnimatorOfInt.setDuration(t8r.f65475toq);
            this.f11500k.setInterpolator(new AccelerateDecelerateInterpolator());
            this.f11500k.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.thememanager.detail.video.view.activity.n
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    VideoDetailActivity.C2016q.f7l8(finger, path, valueAnimator);
                }
            });
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f58051toq = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.android.thememanager.detail.video.view.activity.g
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    VideoDetailActivity.C2016q.m7855y(finger, path, valueAnimator);
                }
            });
            this.f58051toq.setDuration(500L);
            this.f11500k.addListener(new k());
            this.f58051toq.addListener(new toq(finger, path));
            this.f58052zy = false;
            this.f11500k.start();
        }

        /* JADX INFO: renamed from: p */
        void m7857p() {
            ValueAnimator valueAnimator = this.f11500k;
            if (valueAnimator != null) {
                valueAnimator.resume();
            }
            ValueAnimator valueAnimator2 = this.f58051toq;
            if (valueAnimator2 != null) {
                valueAnimator2.resume();
            }
        }

        /* JADX INFO: renamed from: s */
        void m7858s() {
            ValueAnimator valueAnimator = this.f11500k;
            if (valueAnimator != null) {
                valueAnimator.pause();
            }
            ValueAnimator valueAnimator2 = this.f58051toq;
            if (valueAnimator2 != null) {
                valueAnimator2.pause();
            }
        }

        void x2() {
            this.f58052zy = true;
        }

        /* synthetic */ C2016q(C2014k c2014k) {
            this();
        }
    }

    class toq implements p000a.zy {
        toq() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
            if (Build.VERSION.SDK_INT < 30) {
                VideoDetailActivity.this.f11484d.lrht();
            }
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                lvui.ki(VideoDetailActivity.this, true);
            } else {
                VideoDetailActivity.this.finish();
            }
        }
    }

    class zy implements p000a.zy {
        zy() {
        }

        @Override // p000a.zy
        /* JADX INFO: renamed from: k */
        public void mo0k() {
        }

        @Override // p000a.zy
        public void toq(boolean openDialog) {
            if (openDialog) {
                lvui.ki(VideoDetailActivity.this, true);
            } else {
                VideoDetailActivity.this.finish();
            }
        }
    }

    public static Intent bz2(Context context, @zy.lvui List<VideoInfo> list, int index, int applyFlag) {
        Intent intent = new Intent(context, (Class<?>) VideoDetailActivity.class);
        intent.putExtra(ba, (Serializable) list);
        intent.putExtra(ax, applyFlag);
        intent.putExtra("index", index);
        if (C1807g.m7081r()) {
            C1819o.m7160n(intent);
        }
        return intent;
    }

    private String h7am(VideoInfo videoInfo) {
        VideoResource localVideoResource;
        if (videoInfo != null) {
            Uri uri = Uri.parse(videoInfo.path);
            if ("file".equals(uri.getScheme())) {
                videoInfo.path = uri.getPath();
            }
            if (vep5(uri)) {
                localVideoResource = new RemoteVideoResource(videoInfo.path, videoInfo.previewPath, videoInfo.name, videoInfo.onlineId, videoInfo.sizeBytes, hyr.zy(",", videoInfo.innerTags));
                if (localVideoResource.isDownloaded()) {
                    localVideoResource = new LocalVideoResource(localVideoResource.getDownloadFilePath());
                }
            } else {
                localVideoResource = new LocalVideoResource(videoInfo.path);
            }
            if (localVideoResource.isDownloaded()) {
                return localVideoResource.getDownloadFilePath();
            }
        }
        return videoInfo.previewPath;
    }

    private boolean jbh(List<VideoInfo> videoInfoList) {
        return (videoInfoList == null || videoInfoList.size() <= 0 || TextUtils.isEmpty(videoInfoList.get(0).pictureDescriptionContent) || TextUtils.isEmpty(videoInfoList.get(0).pictureDescriptionTitle)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean mbx() {
        return "sensor".equals(this.f11491r);
    }

    private void pc(@zy.lvui View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof FrameLayout.LayoutParams) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = C1819o.gvn7(getResources()) - (y9n.jp0y() ? 0 : C1819o.qrj(5.0f));
            view.setLayoutParams(layoutParams);
        }
    }

    private void se(TextView textView) {
        float f2 = getResources().getConfiguration().fontScale;
        String strM7067k = fu4.m7067k();
        if (TextUtils.equals(strM7067k, "bo_CN")) {
            textView.setTextSize(0, (int) ((textView.getTextSize() / f2) * (((double) f2) <= 1.0d ? f2 : 1.0f)));
        } else if (TextUtils.equals(strM7067k, "ug_CN")) {
            textView.setTextSize(0, (int) ((textView.getTextSize() / f2) * (((double) f2) <= 1.25d ? f2 : 1.25f)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void uc(ViewStub viewStub, View view) {
        this.f11483c = view;
        View viewFindViewById = view.findViewById(R.id.finger);
        View viewFindViewById2 = this.f11483c.findViewById(R.id.finger_path);
        C2016q c2016q = new C2016q(null);
        this.f11482b = c2016q;
        c2016q.ld6(viewFindViewById, viewFindViewById2);
        this.f11483c.setOnClickListener(this);
    }

    private void uj2j(int videoIndex, List<VideoInfo> videoInfos) {
        VideoInfo videoInfo = videoInfos.get(videoIndex);
        if (videoInfo == null || videoInfo.pictureDescriptionTitle == null || videoInfo.pictureDescriptionContent == null) {
            return;
        }
        TextView textView = this.f11495x;
        if (textView != null) {
            se(textView);
            this.f11495x.setText(videoInfo.pictureDescriptionTitle);
        }
        TextView textView2 = this.f11492u;
        if (textView2 != null) {
            se(textView2);
            this.f11492u.setText(videoInfo.pictureDescriptionContent);
        }
    }

    private static boolean vep5(Uri uri) {
        return "http".equalsIgnoreCase(uri.getScheme()) || "https".equalsIgnoreCase(uri.getScheme());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void wx16(List list) {
        this.f11486f.wvg(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void yl(Intent intent) {
        if (TextUtils.equals(intent.getAction(), "com.android.thememanager.action.REQUEST_PERMISSION")) {
            lvui.m7131s(this, this.bp);
        }
    }

    public static Intent zkd(Context context, @dd VideoInfo videoInfo, boolean swipeShowRecommend, int applyFlag) {
        Intent intent = new Intent(context, (Class<?>) VideoDetailActivity.class);
        intent.putExtra("extra_serializable_video_info", videoInfo);
        intent.putExtra("extra_swipe_show_recommend", swipeShowRecommend);
        intent.putExtra(ax, applyFlag);
        if (C1807g.m7081r()) {
            C1819o.m7160n(intent);
        }
        return intent;
    }

    public InterfaceC3775k b3e() {
        return com.android.thememanager.basemodule.video.toq.toq(bg);
    }

    @dd
    public InterfaceC2010n bek6() {
        return this.bb;
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected boolean bo() {
        return false;
    }

    public int cv06() {
        return this.f11487j.getCurrentItem();
    }

    void ebn(int position) {
        C7794k.m28195n(id, "notify selected position " + position);
        this.f11484d.uv6(position);
        VideoInfo videoInfoNi7 = this.f11486f.ni7(this.f11484d.m7832c().m4388g().intValue());
        if (videoInfoNi7 != null) {
            this.f11490o.ni7(h7am(this.f11486f.ni7(this.f11484d.m7832c().m4388g().intValue())), videoInfoNi7.thumbnail, false);
        }
    }

    @Override // miuix.appcompat.app.t8r, android.app.Activity
    public void finish() {
        super.finish();
        com.android.thememanager.basemodule.video.toq.m7266g(bg);
    }

    void ixz() {
        if (this.f11489m) {
            C7794k.m28195n(id, "load more, next page index ");
            this.f11484d.hyr();
        }
    }

    public cnbm ktq() {
        return this.f11486f;
    }

    public boolean nsb(boolean show, boolean change) {
        this.f11490o.setVisibility(show ? 0 : 4);
        if (show && change) {
            return this.f11490o.t8r();
        }
        return false;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        int id2 = v2.getId();
        if (id2 == R.id.back_btn) {
            finish();
        } else if (id2 == R.id.mask) {
            C2320q.m8473a(as, true);
            this.f11482b.x2();
            this.f11483c.setVisibility(8);
        }
    }

    @Override // miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        int iM7247h = y9n.m7247h();
        if (C1807g.lvui()) {
            int i2 = newConfig.orientation;
            if (i2 == 1 || i2 == 2) {
                View view = this.f11481a;
                if (view != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                    marginLayoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.de_activity_wallpaper_detail_description_margin_bottom) + iM7247h;
                    marginLayoutParams.setMarginStart(getResources().getDimensionPixelSize(R.dimen.de_activity_wallpaper_detail_description_margin_start));
                    marginLayoutParams.setMarginEnd(getResources().getDimensionPixelSize(R.dimen.de_activity_wallpaper_detail_description_margin_end));
                    this.f11481a.setLayoutParams(marginLayoutParams);
                }
                if (this.f11485e != null) {
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(this.f11485e.getLayoutParams());
                    layoutParams.bottomMargin = getResources().getDimensionPixelSize(R.dimen.wallpaper_download_layout_padding_bottom) + iM7247h;
                    layoutParams.gravity = 81;
                    this.f11485e.setLayoutParams(layoutParams);
                }
                int iIntValue = this.f11484d.m7832c().m4388g() == null ? 0 : this.f11484d.m7832c().m4388g().intValue();
                VideoInfo videoInfoNi7 = this.f11486f.ni7(iIntValue);
                if (videoInfoNi7 != null) {
                    this.f11490o.ni7(h7am(this.f11486f.ni7(iIntValue)), videoInfoNi7.thumbnail, true);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00d8  */
    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onCreate(android.os.Bundle r22) {
        /*
            Method dump skipped, instruction units count: 950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.detail.video.view.activity.VideoDetailActivity.onCreate(android.os.Bundle):void");
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        C2016q c2016q = this.f11482b;
        if (c2016q != null) {
            c2016q.x2();
            this.f11482b.m7856g();
        }
        super.onDestroy();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        C2016q c2016q = this.f11482b;
        if (c2016q != null) {
            c2016q.m7858s();
        }
        ni7.m7146k().m7147n("com.android.thememanager.action.REQUEST_PERMISSION", this.bv);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        C2016q c2016q = this.f11482b;
        if (c2016q != null) {
            c2016q.m7857p();
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        cnbm cnbmVar = this.f11486f;
        if (cnbmVar != null) {
            outState.putSerializable(ba, cnbmVar.m6400z());
            outState.putInt("index", this.f11487j.getCurrentItem());
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onStart() {
        super.onStart();
        ni7.m7146k().toq("com.android.thememanager.action.REQUEST_PERMISSION", this.bv);
    }

    public void setOperationBar(@zy.lvui View v2) {
        this.f11485e.removeAllViews();
        this.f11485e.addView(v2);
    }

    public boolean ukdy() {
        return uc.m10037x() && qrj.m7199q(qrj.toq.NEW_LOCK_STYLE_SHADER) && this.f58048ab.getWallpaperInfo() != null && kja0.f12503k.m8125g(this.f58048ab.getWallpaperInfo().getMagicType(), this.f58048ab.getWallpaperInfo().getEnableBlur()) && !com.android.thememanager.superwallpaper.util.toq.m9512q(this.f58048ab);
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k
    protected void y2(int newMode) {
        super.y2(newMode);
        if (newMode == 1) {
            lvui.m7131s(this, this.bp);
        }
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, com.android.thememanager.basemodule.privacy.C1781k.f7l8
    public void y9n(boolean agree) {
        super.y9n(agree);
        if (agree || !x2.x2()) {
            lvui.m7131s(this, this.bp);
        }
    }

    void zwy() {
        View viewFindViewById = this.f11485e.findViewById(R.id.magic_mode);
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility((this.f11490o.qrj() && ukdy()) ? 0 : 4);
        }
    }
}

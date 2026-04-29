package com.android.thememanager.ad;

import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.activity.kja0;
import com.android.thememanager.basemodule.ad.model.AdInfo;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.basemodule.video.InterfaceC1836n;
import com.android.thememanager.basemodule.views.InterfaceC1852k;
import com.android.thememanager.util.g1;
import com.google.android.exoplayer2.gc3c;
import com.google.android.exoplayer2.jbh;
import com.google.android.exoplayer2.source.C3578c;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.util.wvg;
import com.google.android.exoplayer2.x2;
import com.google.android.exoplayer2.yqrt;
import hb.C6072k;
import i1.C6077k;
import java.util.ArrayList;
import java.util.Map;
import p001b.InterfaceC1355k;

/* JADX INFO: loaded from: classes.dex */
public class VideoAdActivity extends kja0 implements AudioManager.OnAudioFocusChangeListener, View.OnClickListener, InterfaceC1852k {
    private static final int ax = 1;
    private static final String az = "VideoAdActivity";
    private static final int ba = 0;

    /* JADX INFO: renamed from: a */
    private Handler f9477a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private String f57376ab;
    private Button an;
    private AdInfo as;

    /* JADX INFO: renamed from: b */
    private TextView f9478b;
    private ImageView bb;
    private boolean bl;
    private TextView bp;
    private TextView bv;

    /* JADX INFO: renamed from: c */
    private jbh f9479c;

    /* JADX INFO: renamed from: d */
    private String f9480d;

    /* JADX INFO: renamed from: e */
    private PlayerView f9481e;
    private FrameLayout id;
    private ImageView in;

    /* JADX INFO: renamed from: j */
    private ImageButton f9482j;

    /* JADX INFO: renamed from: m */
    private ImageView f9483m;

    /* JADX INFO: renamed from: o */
    private fti f9484o;

    /* JADX INFO: renamed from: u */
    private CheckBox f9485u;

    /* JADX INFO: renamed from: v */
    private String f9486v;

    /* JADX INFO: renamed from: w */
    private String f9487w;

    /* JADX INFO: renamed from: x */
    private AudioManager f9488x;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private boolean f57377bo = false;
    private final gc3c.InterfaceC3434g bg = new C1640q();

    /* JADX INFO: renamed from: com.android.thememanager.ad.VideoAdActivity$k */
    class HandlerC1639k extends Handler {
        HandlerC1639k(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (1 == msg.what && VideoAdActivity.this.f9479c != null) {
                VideoAdActivity.this.f9478b.setText(VideoAdActivity.this.getString(R.string.count_down_tip, Integer.valueOf((int) ((VideoAdActivity.this.f9479c.getDuration() - VideoAdActivity.this.f9479c.getCurrentPosition()) / 1000))));
                VideoAdActivity.this.f9477a.sendEmptyMessageDelayed(1, 100L);
            }
            super.handleMessage(msg);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.ad.VideoAdActivity$q */
    class C1640q implements gc3c.InterfaceC3434g {
        C1640q() {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        /* JADX INFO: renamed from: m */
        public void mo6500m(boolean playWhenReady, int playbackState) {
            if (playbackState == 3) {
                VideoAdActivity.this.f9482j.setVisibility(playWhenReady ? 8 : 0);
                VideoAdActivity.this.f9478b.setVisibility(0);
                VideoAdActivity.this.f9485u.setVisibility(0);
                VideoAdActivity.this.f9477a.sendEmptyMessage(1);
            }
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void ni7(yqrt error) {
            if (error == null || error.errorCode != 0) {
                Log.w(VideoAdActivity.az, "unexpected play error: " + error);
                return;
            }
            Throwable cause = error.getCause();
            if (cause instanceof InterfaceC1836n.toq) {
                if (((InterfaceC1836n.toq) cause).getRejectType() == 0) {
                    nn86.m7150k(R.string.online_no_network, 0);
                }
            } else {
                Log.w(VideoAdActivity.az, "media source error: " + cause);
            }
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3434g
        public void uv6(int reason) {
            VideoAdActivity.this.getWindow().clearFlags(128);
        }
    }

    class toq implements gc3c.InterfaceC3440y {
        toq() {
        }

        @Override // com.google.android.exoplayer2.gc3c.InterfaceC3440y
        /* JADX INFO: renamed from: r */
        public void mo6501r() {
            VideoAdActivity.this.in.setVisibility(8);
        }
    }

    class zy implements CompoundButton.OnCheckedChangeListener {
        zy() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (VideoAdActivity.this.f9479c == null) {
                return;
            }
            VideoAdActivity.this.f9479c.toq(isChecked ? 0.5f : 0.0f);
            if (isChecked != VideoAdActivity.this.f57377bo) {
                VideoAdActivity.this.f57377bo = isChecked;
                if (VideoAdActivity.this.f57377bo) {
                    C1708s.f7l8().x2(4001).jp0y(VideoAdActivity.this.as);
                } else {
                    C1708s.f7l8().x2(4001).mo6674s(VideoAdActivity.this.as);
                }
                g1.gyi(g1.f16465l, VideoAdActivity.this.f57377bo);
            }
        }
    }

    private void b3e() {
        this.f9484o = new C3578c.toq(com.android.thememanager.basemodule.video.toq.m7269q(InterfaceC1355k.f53834qrj)).mo12633g(Uri.parse(this.f9486v));
        this.f9477a = new HandlerC1639k(Looper.getMainLooper());
        this.f9488x = (AudioManager) getSystemService(wvg.f67137toq);
        x2.C3899k c3899k = new x2.C3899k();
        c3899k.m13916n(50000, 50000, 0, 5000);
        jbh qVar = new jbh.toq(this).ld6(c3899k.toq()).toq();
        this.f9479c = qVar;
        qVar.bek6(this.bg);
        this.f9479c.mu(this.f9484o);
        this.f9479c.setRepeatMode(2);
        this.f9479c.ngy(new toq());
        this.f9481e.setPlayer(this.f9479c);
    }

    private void bek6() {
        y9n.o1t(this);
        ImageView imageView = (ImageView) findViewById(R.id.img_back);
        this.f9483m = imageView;
        imageView.setOnClickListener(this);
        PlayerView playerView = (PlayerView) findViewById(R.id.video_view);
        this.f9481e = playerView;
        playerView.setUseController(false);
        this.f9482j = (ImageButton) findViewById(R.id.video_pause);
        this.in = (ImageView) findViewById(R.id.image_mask);
        this.f9478b = (TextView) findViewById(R.id.countdown);
        this.f9485u = (CheckBox) findViewById(R.id.audio_check);
        this.f9482j.setOnClickListener(this);
        C6077k.m22369i(this.f9485u);
        this.f9485u.setOnCheckedChangeListener(new zy());
        boolean zX2 = g1.x2(g1.f16465l, true);
        this.f57377bo = zX2;
        this.f9485u.setChecked(zX2);
        this.bb = (ImageView) findViewById(R.id.icon);
        this.bp = (TextView) findViewById(R.id.name);
        this.bv = (TextView) findViewById(R.id.summary);
        Button button = (Button) findViewById(R.id.jump_btn);
        this.an = button;
        C6077k.m22369i(button);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ad_download_container);
        this.id = frameLayout;
        frameLayout.setOnClickListener(this);
        if (y9n.m7258z() && !C1819o.d3()) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.id.getLayoutParams();
            layoutParams.bottomMargin = C1819o.zurt(this) + getResources().getDimensionPixelOffset(R.dimen.ad_video_detail_container_margin_bottom);
            this.id.setLayoutParams(layoutParams);
        }
        C6077k.o1t(this.id);
    }

    private void cv06() {
        this.f9479c.nmn5(true);
        this.bl = true;
        if (!this.f57377bo) {
            this.f9479c.toq(0.0f);
        } else if (this.f9488x.requestAudioFocus(this, 3, 1) == 1) {
            this.f9479c.toq(0.5f);
        }
    }

    private void ktq() {
        AdInfo adInfo = (AdInfo) getIntent().getSerializableExtra(p001b.f7l8.erbd);
        this.as = adInfo;
        if (adInfo == null) {
            nn86.toq("invalid intent", 0);
            finish();
            return;
        }
        this.f9486v = adInfo.videoUrl;
        this.f9480d = adInfo.iconUrl;
        this.f9487w = C1653q.n7h(adInfo);
        this.f57376ab = C1653q.qrj(this.as);
        AdInfo adInfo2 = this.as;
        float f2 = adInfo2.width;
        float f3 = adInfo2.height;
        if (f2 > 0.0f && f3 > 0.0f) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f9481e.getLayoutParams();
            Point pointFn3e = y9n.fn3e();
            if (f3 < f2) {
                int i2 = pointFn3e.x;
                layoutParams.width = i2;
                layoutParams.height = (int) ((i2 / f2) * f3);
            } else {
                layoutParams.width = pointFn3e.x;
                layoutParams.height = pointFn3e.y;
                layoutParams.gravity = 80;
            }
            this.f9481e.setLayoutParams(layoutParams);
        }
        ArrayList<String> arrayList = this.as.imgUrls;
        boolean z2 = (arrayList == null || TextUtils.isEmpty(arrayList.get(0))) ? false : true;
        if (z2) {
            com.android.thememanager.basemodule.imageloader.x2.m6782y(this, this.as.imgUrls.get(0), this.in, com.android.thememanager.basemodule.imageloader.x2.fn3e().jk(3));
        }
        String str = !TextUtils.isEmpty(this.f9480d) ? this.f9480d : z2 ? this.as.imgUrls.get(0) : null;
        if (str != null) {
            com.android.thememanager.basemodule.imageloader.x2.m6778n(this, str, this.bb, R.drawable.resource_thumbnail_bg_round_border, getResources().getDimensionPixelOffset(R.dimen.ad_video_detail_download_icon_radius));
        }
        if (!TextUtils.isEmpty(this.f9487w)) {
            this.bp.setText(this.f9487w);
            this.bp.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, getResources().getDrawable(R.drawable.ad_video_ad_tip), (Drawable) null);
        }
        if (!TextUtils.isEmpty(this.f57376ab)) {
            this.bv.setText(this.f57376ab);
        }
        this.an.setOnClickListener(this);
        if (!C1653q.kja0(this.as)) {
            this.an.setText(getResources().getText(R.string.ad_details));
            return;
        }
        if (a9.m6999s(this.as.packageName)) {
            this.an.setText(getResources().getText(R.string.ad_experience_now));
            return;
        }
        C6072k c6072kM6521y = com.android.thememanager.ad.download.toq.m6518s().m6521y(this.as.packageName);
        if (c6072kM6521y == null || c6072kM6521y.f35087k != 5) {
            this.an.setText(getResources().getText(R.string.ad_download_now));
        } else {
            this.an.setText(getResources().getText(R.string.resource_downloading));
        }
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public void onAudioFocusChange(int focusChange) {
        if (!this.f57377bo) {
            this.f9479c.toq(0.0f);
        } else if (focusChange == 1) {
            this.f9479c.toq(0.5f);
        } else if (focusChange == 3) {
            this.f9479c.toq(0.1f);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v2) {
        switch (v2.getId()) {
            case R.id.ad_download_container /* 2131427424 */:
                AdInfo adInfo = this.as;
                if (adInfo != null) {
                    C1653q.m6529q(this, adInfo, new Map[0]);
                }
                break;
            case R.id.img_back /* 2131428104 */:
                onBackPressed();
                break;
            case R.id.jump_btn /* 2131428159 */:
                AdInfo adInfo2 = this.as;
                if (adInfo2 != null) {
                    C1653q.f7l8(this, adInfo2, null);
                }
                break;
            case R.id.video_pause /* 2131429051 */:
                this.f9482j.setVisibility(8);
                cv06();
                break;
        }
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().addFlags(128);
        com.android.thememanager.ad.download.toq.m6518s().zy(this);
        bek6();
        ktq();
        b3e();
        cv06();
    }

    @Override // com.android.thememanager.basemodule.base.AbstractActivityC1717k, miuix.appcompat.app.t8r, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        com.android.thememanager.ad.download.toq.m6518s().n7h(this);
        this.f9479c.release();
        this.f9477a.removeCallbacksAndMessages(null);
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onPause() {
        super.onPause();
        this.f9479c.nmn5(false);
        this.bl = false;
        this.f9488x.abandonAudioFocus(this);
    }

    @Override // com.android.thememanager.activity.kja0, com.android.thememanager.basemodule.base.AbstractActivityC1717k, androidx.fragment.app.ActivityC0891q, android.app.Activity
    protected void onResume() {
        super.onResume();
        cv06();
    }

    @Override // android.app.Activity
    public boolean onTouchEvent(MotionEvent event) {
        jbh jbhVar;
        if (event.getAction() == 1 && (jbhVar = this.f9479c) != null) {
            jbhVar.nmn5(!this.bl);
            if (this.bl) {
                C1708s.f7l8().x2(4001).mo6666g(this.as);
            } else {
                C1708s.f7l8().x2(4001).lvui(this.as);
            }
            this.bl = !this.bl;
        }
        return super.onTouchEvent(event);
    }

    @Override // com.android.thememanager.basemodule.views.InterfaceC1852k
    /* JADX INFO: renamed from: q */
    public void mo6499q(String packageName, int state) {
        if (TextUtils.equals(packageName, this.as.packageName)) {
            if (state == -8 || state == -2) {
                this.an.setText(getResources().getText(R.string.ad_download_now));
            } else if (state == 4) {
                this.an.setText(getResources().getText(R.string.ad_experience_now));
            } else {
                if (state != 5) {
                    return;
                }
                this.an.setText(getResources().getText(R.string.resource_downloading));
            }
        }
    }

    @Override // com.android.thememanager.activity.kja0
    protected int r8s8() {
        return R.layout.video_ad_layout;
    }
}

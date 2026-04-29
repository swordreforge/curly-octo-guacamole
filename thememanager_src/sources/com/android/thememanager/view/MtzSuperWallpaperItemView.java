package com.android.thememanager.view;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.ActivityC0891q;
import com.android.thememanager.C2320q;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.analysis.zy;
import com.android.thememanager.basemodule.local.InterfaceC1755y;
import com.android.thememanager.basemodule.local.ld6;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.nn86;
import com.android.thememanager.basemodule.views.LoadingView;
import com.android.thememanager.module.detail.util.C2244g;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.v9.data.C2850g;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class MtzSuperWallpaperItemView extends FrameLayout implements InterfaceC1755y {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final int f61494ab = 5;
    private static final int bb = 6;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f61495bo = 1;
    private static final int bp = 1;
    private static final int bv = 500;

    /* JADX INFO: renamed from: d */
    private static final int f17321d = 3;

    /* JADX INFO: renamed from: u */
    private static final int f17322u = 0;

    /* JADX INFO: renamed from: v */
    private static final int f17323v = 2;

    /* JADX INFO: renamed from: w */
    private static final int f17324w = 4;

    /* JADX INFO: renamed from: x */
    private static final String f17325x = "SuperWallpaperListItem";

    /* JADX INFO: renamed from: a */
    private Handler f17326a;

    /* JADX INFO: renamed from: b */
    private View.OnClickListener f17327b;

    /* JADX INFO: renamed from: c */
    private String f17328c;

    /* JADX INFO: renamed from: e */
    private Resource f17329e;

    /* JADX INFO: renamed from: f */
    private C2850g f17330f;

    /* JADX INFO: renamed from: g */
    private View f17331g;

    /* JADX INFO: renamed from: h */
    private FrameLayout f17332h;

    /* JADX INFO: renamed from: i */
    private ImageView f17333i;

    /* JADX INFO: renamed from: j */
    private int f17334j;

    /* JADX INFO: renamed from: k */
    private Context f17335k;

    /* JADX INFO: renamed from: l */
    private ProgressBar f17336l;

    /* JADX INFO: renamed from: m */
    private int f17337m;

    /* JADX INFO: renamed from: n */
    private ImageView f17338n;

    /* JADX INFO: renamed from: o */
    private boolean f17339o;

    /* JADX INFO: renamed from: p */
    private TextView f17340p;

    /* JADX INFO: renamed from: q */
    private com.android.thememanager.mine.local.resource.toq f17341q;

    /* JADX INFO: renamed from: r */
    private TextView f17342r;

    /* JADX INFO: renamed from: s */
    private TextView f17343s;

    /* JADX INFO: renamed from: t */
    private Button f17344t;

    /* JADX INFO: renamed from: y */
    private LinearLayout f17345y;

    /* JADX INFO: renamed from: z */
    private LoadingView f17346z;

    /* JADX INFO: renamed from: com.android.thememanager.view.MtzSuperWallpaperItemView$k */
    class ViewOnClickListenerC2889k implements View.OnClickListener {
        ViewOnClickListenerC2889k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (MtzSuperWallpaperItemView.this.f17330f == null) {
                return;
            }
            MtzSuperWallpaperItemView.this.f17337m = 0;
            C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.hj, com.android.thememanager.basemodule.analysis.toq.nl6, MtzSuperWallpaperItemView.this.f17330f.f17067n));
            List<RelatedResource> parentResources = MtzSuperWallpaperItemView.this.f17329e.getParentResources();
            if (parentResources != null && parentResources.size() > 0) {
                MtzSuperWallpaperItemView.this.f17329e = C1792n.zy(parentResources.get(0), C1791k.getInstance(MtzSuperWallpaperItemView.this.f17328c));
            }
            if (C2244g.m8369n(MtzSuperWallpaperItemView.this.f17328c, MtzSuperWallpaperItemView.this.f17329e)) {
                com.android.thememanager.v9.f7l8.cdj((ActivityC0891q) MtzSuperWallpaperItemView.this.f17335k, MtzSuperWallpaperItemView.this.f17329e);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.MtzSuperWallpaperItemView$n */
    class ViewOnClickListenerC2890n implements View.OnClickListener {
        ViewOnClickListenerC2890n() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (!com.android.thememanager.basemodule.utils.mcp.m7138k() || !com.android.thememanager.basemodule.utils.mcp.m7139n()) {
                Toast.makeText(MtzSuperWallpaperItemView.this.getContext(), com.android.thememanager.basemodule.utils.kja0.ld6(R.string.download_failed), 0).show();
            } else {
                C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.hj, com.android.thememanager.basemodule.analysis.toq.haw, MtzSuperWallpaperItemView.this.f17330f.f17067n));
                MtzSuperWallpaperItemView.this.t8r(true);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.MtzSuperWallpaperItemView$q */
    class ViewOnClickListenerC2891q implements View.OnClickListener {
        ViewOnClickListenerC2891q() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            if (!com.android.thememanager.basemodule.utils.mcp.m7138k() || !com.android.thememanager.basemodule.utils.mcp.m7139n()) {
                Toast.makeText(MtzSuperWallpaperItemView.this.getContext(), com.android.thememanager.basemodule.utils.kja0.ld6(R.string.download_failed), 0).show();
                return;
            }
            if (MtzSuperWallpaperItemView.this.f17334j == 0) {
                C1708s.f7l8().ld6().ni7(C1706p.m6654q(com.android.thememanager.basemodule.analysis.toq.hj, com.android.thememanager.basemodule.analysis.toq.tc, MtzSuperWallpaperItemView.this.f17330f.f17067n));
                MtzSuperWallpaperItemView.this.t8r(false);
            } else if (MtzSuperWallpaperItemView.this.f17334j == 2) {
                MtzSuperWallpaperItemView.this.ni7();
            } else if (MtzSuperWallpaperItemView.this.f17334j == 3) {
                MtzSuperWallpaperItemView.this.jk();
            }
        }
    }

    class toq extends Handler {
        toq(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            if (msg.what != 1) {
                return;
            }
            if (MtzSuperWallpaperItemView.this.f17339o) {
                MtzSuperWallpaperItemView.this.f17346z.setVisibility(8);
                MtzSuperWallpaperItemView.this.f17332h.setVisibility(0);
                return;
            }
            MtzSuperWallpaperItemView.this.f17339o = true;
            MtzSuperWallpaperItemView.this.f17346z.setVisibility(0);
            MtzSuperWallpaperItemView.this.f17332h.setVisibility(8);
            MtzSuperWallpaperItemView.this.f17326a.removeMessages(1);
            MtzSuperWallpaperItemView.this.f17326a.sendEmptyMessageDelayed(1, 500L);
        }
    }

    class zy implements com.android.thememanager.mine.local.resource.zy {
        zy() {
        }

        @Override // com.android.thememanager.mine.local.resource.zy
        /* JADX INFO: renamed from: n */
        public void mo6339n(Resource resource) {
            if (MtzSuperWallpaperItemView.this.f17329e == null || MtzSuperWallpaperItemView.this.f17329e.getAssemblyId() == null || !MtzSuperWallpaperItemView.this.f17329e.getAssemblyId().equals(resource.getAssemblyId())) {
                return;
            }
            MtzSuperWallpaperItemView.this.f17329e = resource;
            MtzSuperWallpaperItemView mtzSuperWallpaperItemView = MtzSuperWallpaperItemView.this;
            mtzSuperWallpaperItemView.setState(mtzSuperWallpaperItemView.zurt());
            MtzSuperWallpaperItemView.this.m10266t();
        }

        @Override // com.android.thememanager.mine.local.resource.zy
        /* JADX INFO: renamed from: p */
        public void mo6340p(Resource resource) {
            if (MtzSuperWallpaperItemView.this.f17329e == null || MtzSuperWallpaperItemView.this.f17329e.getAssemblyId() == null || !MtzSuperWallpaperItemView.this.f17329e.getAssemblyId().equals(resource.getAssemblyId())) {
                return;
            }
            MtzSuperWallpaperItemView mtzSuperWallpaperItemView = MtzSuperWallpaperItemView.this;
            mtzSuperWallpaperItemView.setState(mtzSuperWallpaperItemView.zurt());
            MtzSuperWallpaperItemView.this.m10266t();
        }

        @Override // com.android.thememanager.mine.local.resource.zy
        /* JADX INFO: renamed from: q */
        public void mo6341q(Resource resource) {
            if (MtzSuperWallpaperItemView.this.f17329e == null || MtzSuperWallpaperItemView.this.f17329e.getAssemblyId() == null || !MtzSuperWallpaperItemView.this.f17329e.getAssemblyId().equals(resource.getAssemblyId())) {
                return;
            }
            MtzSuperWallpaperItemView.this.setState(6);
            MtzSuperWallpaperItemView.this.m10266t();
        }

        @Override // com.android.thememanager.mine.local.resource.zy
        public void toq(Resource resource, int downloadBytes, int totalBytes) {
        }
    }

    public MtzSuperWallpaperItemView(@zy.lvui Context context) {
        this(context, null);
    }

    private void a9() {
        if (this.f17326a.hasMessages(1)) {
            return;
        }
        this.f17339o = false;
        this.f17326a.sendEmptyMessage(1);
    }

    private void fn3e() {
        this.f17338n = (ImageView) findViewById(R.id.item_background);
        this.f17331g = findViewById(R.id.download_mask);
        this.f17345y = (LinearLayout) findViewById(R.id.wallpaper_content);
        this.f17343s = (TextView) findViewById(R.id.super_wallpaper_item_title);
        this.f17340p = (TextView) findViewById(R.id.super_wallpaper_item_summary);
        this.f17332h = (FrameLayout) findViewById(R.id.download_button_container);
        this.f17333i = (ImageView) findViewById(R.id.download_status);
        this.f17346z = (LoadingView) findViewById(R.id.loading_view);
        this.f17344t = (Button) findViewById(R.id.update_button);
        this.f17342r = (TextView) findViewById(R.id.download_percentage);
        this.f17336l = (ProgressBar) findViewById(R.id.download_progressbar);
        com.android.thememanager.mine.local.resource.toq toqVar = new com.android.thememanager.mine.local.resource.toq(this.f17335k);
        this.f17341q = toqVar;
        toqVar.m8232p(getResourceImportListener());
        this.f17333i.setOnClickListener(new ViewOnClickListenerC2891q());
        this.f17344t.setOnClickListener(new ViewOnClickListenerC2890n());
    }

    private void fti(int imageRes, String contentDes) {
        this.f17333i.setVisibility(0);
        this.f17333i.setImageResource(imageRes);
        this.f17333i.setContentDescription(contentDes);
    }

    private void fu4() {
        this.f17344t.setVisibility(this.f17334j == 5 ? 0 : 8);
        int i2 = this.f17334j;
        if (i2 == 0) {
            fti(R.drawable.download_start, com.android.thememanager.basemodule.utils.kja0.ld6(R.string.resource_download));
            return;
        }
        if (i2 == 1) {
            fti(R.drawable.download_pending, com.android.thememanager.basemodule.utils.kja0.ld6(R.string.resource_waiting_download));
            return;
        }
        if (i2 == 2) {
            fti(R.drawable.download_pause, com.android.thememanager.basemodule.utils.kja0.ld6(R.string.resource_waiting_pause));
        } else if (i2 != 3) {
            this.f17333i.setVisibility(8);
        } else {
            fti(R.drawable.download_resume, com.android.thememanager.basemodule.utils.kja0.ld6(R.string.resource_continue));
        }
    }

    /* JADX INFO: renamed from: i */
    private void m10260i(boolean isUpdate) {
        zy.C1711k c1711k = new zy.C1711k();
        c1711k.f9808n = isUpdate;
        c1711k.f9807k = com.android.thememanager.basemodule.analysis.f7l8.m6607g();
        c1711k.f57496toq = com.android.thememanager.basemodule.analysis.f7l8.m6613s();
        c1711k.f57497zy = com.android.thememanager.basemodule.analysis.f7l8.m6614y();
        C2320q.m8480i(this.f17329e, C1791k.getInstance(this.f17328c), c1711k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void jk() {
        setState(2);
        m10266t();
        C2320q.a98o(this.f17329e);
    }

    private void mcp() {
        if (this.f17341q.f7l8(this.f17329e)) {
            this.f17337m = 100;
            setState(6);
            m10266t();
            return;
        }
        this.f17337m = 0;
        if (!C2244g.m8370q(this.f17329e)) {
            setState(zurt());
            m10266t();
        } else if (C2320q.m8477f(this.f17329e)) {
            setState(3);
            m10266t();
        } else {
            setState(2);
            m10266t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ni7() {
        setState(3);
        m10266t();
        C2320q.m8484m(this.f17329e);
    }

    private void o1t() {
        int i2 = this.f17334j;
        if (i2 != 1 && i2 != 2 && i2 != 3 && i2 != 6) {
            this.f17336l.setVisibility(8);
            this.f17342r.setVisibility(8);
            return;
        }
        this.f17336l.setVisibility(0);
        this.f17336l.setProgressDrawable(getResources().getDrawable(this.f17334j == 3 ? R.drawable.download_progress_pause_bg : R.drawable.download_progress_bg));
        this.f17336l.setProgress(this.f17337m, true);
        this.f17342r.setVisibility(0);
        this.f17342r.setText(com.android.thememanager.basemodule.utils.kja0.x2(R.string.super_wallpaper_download_progress, Integer.valueOf(C2656k.m9243p(this.f17337m, 0, 100))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setState(int state) {
        this.f17334j = state;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public void m10266t() {
        wvg();
        m10268z();
        fu4();
        o1t();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8r(boolean isUpdate) {
        setState(2);
        m10266t();
        m10260i(isUpdate);
    }

    private void wvg() {
        int i2 = this.f17334j;
        if (i2 == 1 || i2 == 2) {
            a9();
        } else {
            if (i2 != 3) {
                return;
            }
            this.f17326a.removeMessages(1);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m10268z() {
        int i2 = this.f17334j;
        if (i2 == 1 || i2 == 2 || i2 == 3 || i2 == 6) {
            this.f17331g.setVisibility(0);
            this.f17345y.setVisibility(8);
        } else {
            this.f17331g.setVisibility(8);
            this.f17345y.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int zurt() {
        if (!C2244g.m8369n(this.f17328c, this.f17329e) || C2244g.m8367g(this.f17328c, this.f17329e)) {
            return C2244g.m8367g(this.f17328c, this.f17329e) ? 5 : 0;
        }
        return 4;
    }

    protected com.android.thememanager.mine.local.resource.zy getResourceImportListener() {
        return new zy();
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadComplete(String downloadPath, String taskId, String extraData, boolean downloadSuccess, int downloadFailCode, String... extras) {
        if (downloadSuccess || !taskId.equals(this.f17329e.getAssemblyId())) {
            return;
        }
        setState(zurt());
        m10266t();
        nn86.toq(this.f17335k.getResources().getString(R.string.download_failed) + ":" + downloadFailCode, 0);
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadProgressUpdate(String downloadPath, String taskId, String extraData, int currBytes, int totalBytes) {
        if (!taskId.equals(this.f17329e.getAssemblyId()) || totalBytes <= 0 || currBytes < 0) {
            return;
        }
        this.f17337m = (int) Math.round((((double) currBytes) * 100.0d) / ((double) totalBytes));
        m10266t();
    }

    @Override // com.android.thememanager.basemodule.local.InterfaceC1755y
    public void handleDownloadStatusChange(String downloadPath, String taskId, String extraData, ld6.EnumC1748q currStatus, int currBytes, int totalBytes) {
        if (taskId.equals(this.f17329e.getAssemblyId())) {
            if (C2320q.m8477f(this.f17329e)) {
                setState(3);
            } else if (C2320q.x9kr(this.f17329e)) {
                setState(2);
            }
            m10266t();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C2244g.m8368k(this);
        this.f17341q.m8235y();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C2244g.m8371y(this);
        this.f17341q.ld6();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        fn3e();
    }

    public void setBaseContents(C2850g data, int position) {
        this.f17330f = data;
        if (data != null) {
            C1708s.f7l8().ld6().cdj(C1706p.kja0(com.android.thememanager.basemodule.analysis.toq.hj, com.android.thememanager.basemodule.analysis.toq.s5qd, data.f17067n));
            this.f17329e = this.f17330f.f17068q;
            this.f17343s.setText(data.f17067n);
            this.f17340p.setText(data.f17066g);
            com.android.thememanager.basemodule.imageloader.x2.m6782y((Activity) this.f17335k, this.f17330f.f61468zy, this.f17338n, com.android.thememanager.basemodule.imageloader.x2.fn3e().gvn7(com.android.thememanager.basemodule.imageloader.x2.kja0(position)));
        }
        mcp();
        setOnClickListener(this.f17327b);
    }

    public MtzSuperWallpaperItemView(@zy.lvui Context context, @zy.dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MtzSuperWallpaperItemView(@zy.lvui Context context, @zy.dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17327b = new ViewOnClickListenerC2889k();
        this.f17326a = new toq(Looper.getMainLooper());
        this.f17335k = context;
        this.f17328c = "spwallpaper";
    }
}

package com.android.thememanager.detail.theme.view.widget;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.MamlAodFactory;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.superwallpaper.view.MamlPreview;
import com.google.android.exoplayer2.t8r;
import com.miui.maml.component.MamlView;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class MamlAodPreview extends FrameLayout {

    /* JADX INFO: renamed from: c */
    private static final int f11239c = 2;

    /* JADX INFO: renamed from: e */
    private static final int f11240e = 3;

    /* JADX INFO: renamed from: f */
    private static final int f11241f = 1;

    /* JADX INFO: renamed from: i */
    private static final String f11242i = MamlAodPreview.class.getSimpleName();

    /* JADX INFO: renamed from: j */
    private static final String f11243j = "battery_state";

    /* JADX INFO: renamed from: l */
    private static final int f11244l = 0;

    /* JADX INFO: renamed from: o */
    private static final String f11245o = "battery_level";

    /* JADX INFO: renamed from: r */
    private static final String f11246r = "finish";

    /* JADX INFO: renamed from: t */
    private static final String f11247t = "init";

    /* JADX INFO: renamed from: z */
    private static final String f11248z = "animationState";

    /* JADX INFO: renamed from: g */
    private Handler f11249g;

    /* JADX INFO: renamed from: h */
    private final MamlView.OnExternCommandListener f11250h;

    /* JADX INFO: renamed from: k */
    public int f11251k;

    /* JADX INFO: renamed from: n */
    private MamlView f11252n;

    /* JADX INFO: renamed from: p */
    private long f11253p;

    /* JADX INFO: renamed from: q */
    private FrameLayout f11254q;

    /* JADX INFO: renamed from: s */
    private Intent f11255s;

    /* JADX INFO: renamed from: y */
    private Handler f11256y;

    /* JADX INFO: renamed from: com.android.thememanager.detail.theme.view.widget.MamlAodPreview$k */
    class C1982k implements MamlView.OnExternCommandListener {
        C1982k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq() {
            MamlAodPreview.this.x2();
        }

        @Override // com.miui.maml.component.MamlView.OnExternCommandListener
        public void onCommand(String command, Double para1, String para2) {
            if (MamlAodPreview.f11248z.equals(command)) {
                if (!MamlAodPreview.f11246r.equals(para2)) {
                    if (MamlAodPreview.f11247t.equals(para2)) {
                        MamlAodPreview.this.qrj();
                    }
                } else {
                    MamlAodPreview.this.m7767g();
                    long jCurrentTimeMillis = System.currentTimeMillis() - MamlAodPreview.this.f11253p;
                    long j2 = t8r.f65475toq;
                    if (jCurrentTimeMillis < t8r.f65475toq) {
                        j2 = 4000 - jCurrentTimeMillis;
                    }
                    MamlAodPreview.this.f11249g.postDelayed(new Runnable() { // from class: com.android.thememanager.detail.theme.view.widget.y
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11404k.toq();
                        }
                    }, j2);
                }
            }
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void mo7775k(boolean inited);
    }

    public MamlAodPreview(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m7767g() {
        this.f11249g.removeCallbacksAndMessages(null);
        this.f11256y.removeCallbacksAndMessages(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qrj() {
        MamlView mamlView = this.f11252n;
        if (mamlView != null) {
            setBatteryStateAndLevel(mamlView);
            this.f11252n.sendCommand(MamlPreview.f16155c);
            this.f11253p = System.currentTimeMillis();
        }
        this.f11256y.removeCallbacksAndMessages(null);
        this.f11256y.postDelayed(new Runnable() { // from class: com.android.thememanager.detail.theme.view.widget.f7l8
            @Override // java.lang.Runnable
            public final void run() {
                this.f11364k.m7771s();
            }
        }, 4000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m7771s() {
        this.f11250h.onCommand(f11248z, Double.valueOf(0.0d), f11246r);
    }

    private void setBatteryStateAndLevel(@lvui MamlView mamlview) {
        int intExtra = this.f11255s.getIntExtra("level", -1);
        if (intExtra >= 0) {
            mamlview.putVariableNumber("battery_level", intExtra);
        }
        int intExtra2 = this.f11255s.getIntExtra("status", -1);
        if (!(intExtra2 == 2 || intExtra2 == 5)) {
            mamlview.putVariableNumber("battery_state", 0.0d);
        } else if (intExtra >= 100) {
            mamlview.putVariableNumber("battery_state", 3.0d);
        } else {
            mamlview.putVariableNumber("battery_state", 1.0d);
        }
    }

    public void f7l8(@lvui String aodPath, toq listener) {
        MamlView mamlView = this.f11252n;
        if (mamlView != null && mamlView.isLoaded()) {
            if (listener != null) {
                listener.mo7775k(true);
                return;
            }
            return;
        }
        int dimensionPixelOffset = getContext().getResources().getDimensionPixelOffset(R.dimen.aod_item_foreground_frame_width);
        if (this.f11254q == null) {
            FrameLayout frameLayout = new FrameLayout(getContext());
            this.f11254q = frameLayout;
            frameLayout.setPadding(dimensionPixelOffset, 0, dimensionPixelOffset, 0);
            addView(this.f11254q, new FrameLayout.LayoutParams(-1, -1, 17));
        }
        MamlView mamlViewM6986k = MamlAodFactory.m6986k(getContext(), aodPath, true, getLayoutParams().width / Math.min(y9n.fn3e().x, y9n.fn3e().y));
        this.f11252n = mamlViewM6986k;
        if (mamlViewM6986k.isLoaded()) {
            this.f11252n.setOnExternCommandListener(this.f11250h);
            if (getLayoutParams() != null && getLayoutParams().width > 0 && getLayoutParams().height > 0) {
                this.f11254q.getLayoutParams().width = getLayoutParams().width;
                this.f11254q.getLayoutParams().height = getLayoutParams().width;
                if (!C1807g.wvg()) {
                    this.f11252n.setScale((getLayoutParams().width - (dimensionPixelOffset * 2)) / (this.f11251k * 1.0f), 0, 0);
                }
            }
            this.f11254q.addView(this.f11252n, new FrameLayout.LayoutParams(-1, -1));
        }
        this.f11255s = getContext().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        setBatteryStateAndLevel(this.f11252n);
        if (listener != null) {
            listener.mo7775k(this.f11252n.isLoaded());
        }
    }

    public void ld6() {
        MamlView mamlView = this.f11252n;
        if (mamlView != null) {
            mamlView.onPause();
        }
        m7767g();
    }

    /* JADX INFO: renamed from: p */
    public void m7772p() {
        MamlView mamlView = this.f11252n;
        if (mamlView != null) {
            mamlView.removeRelatedBitmapsRef();
            this.f11252n.onDestroy();
            this.f11252n = null;
        }
        m7767g();
    }

    public void x2() {
        MamlView mamlView = this.f11252n;
        if (mamlView != null) {
            mamlView.onResume();
            qrj();
        }
    }

    /* JADX INFO: renamed from: y */
    public void m7773y(int cornerRadius, boolean hasStroke) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(-16777216);
        gradientDrawable.setCornerRadius(cornerRadius);
        if (hasStroke) {
            gradientDrawable.setStroke(getResources().getDimensionPixelSize(R.dimen.aod_item_foreground_frame_width), getResources().getColor(R.color.aod_item_foreground_frame_color));
        }
        setBackground(gradientDrawable);
    }

    public MamlAodPreview(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public MamlAodPreview(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f11251k = 0;
        this.f11249g = new Handler();
        this.f11256y = new Handler();
        this.f11250h = new C1982k();
        if (C1807g.zurt() || this.f11251k <= 0) {
            this.f11251k = y9n.fn3e().x;
        }
    }
}

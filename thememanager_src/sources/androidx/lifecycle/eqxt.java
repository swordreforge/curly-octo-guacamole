package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.kja0;
import androidx.lifecycle.lvui;
import zy.yz;

/* JADX INFO: compiled from: ProcessLifecycleOwner.java */
/* JADX INFO: loaded from: classes.dex */
public class eqxt implements InterfaceC0954z {

    /* JADX INFO: renamed from: i */
    @yz
    static final long f5068i = 700;

    /* JADX INFO: renamed from: z */
    private static final eqxt f5069z = new eqxt();

    /* JADX INFO: renamed from: y */
    private Handler f5077y;

    /* JADX INFO: renamed from: k */
    private int f5072k = 0;

    /* JADX INFO: renamed from: q */
    private int f5075q = 0;

    /* JADX INFO: renamed from: n */
    private boolean f5073n = true;

    /* JADX INFO: renamed from: g */
    private boolean f5070g = true;

    /* JADX INFO: renamed from: s */
    private final wvg f5076s = new wvg(this);

    /* JADX INFO: renamed from: p */
    private Runnable f5074p = new RunnableC0925k();

    /* JADX INFO: renamed from: h */
    lvui.InterfaceC0937k f5071h = new toq();

    /* JADX INFO: renamed from: androidx.lifecycle.eqxt$k */
    /* JADX INFO: compiled from: ProcessLifecycleOwner.java */
    class RunnableC0925k implements Runnable {
        RunnableC0925k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            eqxt.this.m4435g();
            eqxt.this.f7l8();
        }
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.java */
    class toq implements lvui.InterfaceC0937k {
        toq() {
        }

        @Override // androidx.lifecycle.lvui.InterfaceC0937k
        /* JADX INFO: renamed from: k */
        public void mo4439k() {
            eqxt.this.zy();
        }

        @Override // androidx.lifecycle.lvui.InterfaceC0937k
        public void onResume() {
            eqxt.this.toq();
        }

        @Override // androidx.lifecycle.lvui.InterfaceC0937k
        public void toq() {
        }
    }

    /* JADX INFO: compiled from: ProcessLifecycleOwner.java */
    class zy extends C0947s {

        /* JADX INFO: renamed from: androidx.lifecycle.eqxt$zy$k */
        /* JADX INFO: compiled from: ProcessLifecycleOwner.java */
        class C0926k extends C0947s {
            C0926k() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(@zy.lvui Activity activity) {
                eqxt.this.toq();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(@zy.lvui Activity activity) {
                eqxt.this.zy();
            }
        }

        zy() {
        }

        @Override // androidx.lifecycle.C0947s, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                lvui.m4454g(activity).m4458y(eqxt.this.f5071h);
            }
        }

        @Override // androidx.lifecycle.C0947s, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            eqxt.this.m4436k();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        @zy.hyr(29)
        public void onActivityPreCreated(@zy.lvui Activity activity, @zy.dd Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new C0926k());
        }

        @Override // androidx.lifecycle.C0947s, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            eqxt.this.m4438q();
        }
    }

    private eqxt() {
    }

    /* JADX INFO: renamed from: s */
    static void m4433s(Context context) {
        f5069z.m4437n(context);
    }

    @zy.lvui
    /* JADX INFO: renamed from: y */
    public static InterfaceC0954z m4434y() {
        return f5069z;
    }

    void f7l8() {
        if (this.f5072k == 0 && this.f5073n) {
            this.f5076s.m4480p(kja0.toq.ON_STOP);
            this.f5070g = true;
        }
    }

    /* JADX INFO: renamed from: g */
    void m4435g() {
        if (this.f5075q == 0) {
            this.f5073n = true;
            this.f5076s.m4480p(kja0.toq.ON_PAUSE);
        }
    }

    @Override // androidx.lifecycle.InterfaceC0954z
    @zy.lvui
    public kja0 getLifecycle() {
        return this.f5076s;
    }

    /* JADX INFO: renamed from: k */
    void m4436k() {
        int i2 = this.f5075q - 1;
        this.f5075q = i2;
        if (i2 == 0) {
            this.f5077y.postDelayed(this.f5074p, f5068i);
        }
    }

    /* JADX INFO: renamed from: n */
    void m4437n(Context context) {
        this.f5077y = new Handler();
        this.f5076s.m4480p(kja0.toq.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new zy());
    }

    /* JADX INFO: renamed from: q */
    void m4438q() {
        this.f5072k--;
        f7l8();
    }

    void toq() {
        int i2 = this.f5075q + 1;
        this.f5075q = i2;
        if (i2 == 1) {
            if (!this.f5073n) {
                this.f5077y.removeCallbacks(this.f5074p);
            } else {
                this.f5076s.m4480p(kja0.toq.ON_RESUME);
                this.f5073n = false;
            }
        }
    }

    void zy() {
        int i2 = this.f5072k + 1;
        this.f5072k = i2;
        if (i2 == 1 && this.f5070g) {
            this.f5076s.m4480p(kja0.toq.ON_START);
            this.f5070g = false;
        }
    }
}

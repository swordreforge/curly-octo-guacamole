package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.kja0;
import zy.uv6;

/* JADX INFO: compiled from: ReportFragment.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class lvui extends Fragment {

    /* JADX INFO: renamed from: q */
    private static final String f5100q = "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag";

    /* JADX INFO: renamed from: k */
    private InterfaceC0937k f5101k;

    /* JADX INFO: renamed from: androidx.lifecycle.lvui$k */
    /* JADX INFO: compiled from: ReportFragment.java */
    interface InterfaceC0937k {
        /* JADX INFO: renamed from: k */
        void mo4439k();

        void onResume();

        void toq();
    }

    /* JADX INFO: compiled from: ReportFragment.java */
    @zy.hyr(29)
    static class toq implements Application.ActivityLifecycleCallbacks {
        toq() {
        }

        static void registerIn(Activity activity) {
            activity.registerActivityLifecycleCallbacks(new toq());
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@zy.lvui Activity activity, @zy.dd Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@zy.lvui Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@zy.lvui Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(@zy.lvui Activity activity, @zy.dd Bundle bundle) {
            lvui.m4455k(activity, kja0.toq.ON_CREATE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(@zy.lvui Activity activity) {
            lvui.m4455k(activity, kja0.toq.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(@zy.lvui Activity activity) {
            lvui.m4455k(activity, kja0.toq.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(@zy.lvui Activity activity) {
            lvui.m4455k(activity, kja0.toq.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(@zy.lvui Activity activity) {
            lvui.m4455k(activity, kja0.toq.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(@zy.lvui Activity activity) {
            lvui.m4455k(activity, kja0.toq.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@zy.lvui Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@zy.lvui Activity activity, @zy.lvui Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@zy.lvui Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@zy.lvui Activity activity) {
        }
    }

    public static void f7l8(Activity activity) {
        if (Build.VERSION.SDK_INT >= 29) {
            toq.registerIn(activity);
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag(f5100q) == null) {
            fragmentManager.beginTransaction().add(new lvui(), f5100q).commit();
            fragmentManager.executePendingTransactions();
        }
    }

    /* JADX INFO: renamed from: g */
    static lvui m4454g(Activity activity) {
        return (lvui) activity.getFragmentManager().findFragmentByTag(f5100q);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    static void m4455k(@zy.lvui Activity activity, @zy.lvui kja0.toq toqVar) {
        if (activity instanceof InterfaceC0948t) {
            ((InterfaceC0948t) activity).getLifecycle().m4480p(toqVar);
        } else if (activity instanceof InterfaceC0954z) {
            kja0 lifecycle = ((InterfaceC0954z) activity).getLifecycle();
            if (lifecycle instanceof wvg) {
                ((wvg) lifecycle).m4480p(toqVar);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private void m4456n(InterfaceC0937k interfaceC0937k) {
        if (interfaceC0937k != null) {
            interfaceC0937k.mo4439k();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m4457q(InterfaceC0937k interfaceC0937k) {
        if (interfaceC0937k != null) {
            interfaceC0937k.onResume();
        }
    }

    private void toq(@zy.lvui kja0.toq toqVar) {
        if (Build.VERSION.SDK_INT < 29) {
            m4455k(getActivity(), toqVar);
        }
    }

    private void zy(InterfaceC0937k interfaceC0937k) {
        if (interfaceC0937k != null) {
            interfaceC0937k.toq();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        zy(this.f5101k);
        toq(kja0.toq.ON_CREATE);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        toq(kja0.toq.ON_DESTROY);
        this.f5101k = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        toq(kja0.toq.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m4457q(this.f5101k);
        toq(kja0.toq.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m4456n(this.f5101k);
        toq(kja0.toq.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        toq(kja0.toq.ON_STOP);
    }

    /* JADX INFO: renamed from: y */
    void m4458y(InterfaceC0937k interfaceC0937k) {
        this.f5101k = interfaceC0937k;
    }
}

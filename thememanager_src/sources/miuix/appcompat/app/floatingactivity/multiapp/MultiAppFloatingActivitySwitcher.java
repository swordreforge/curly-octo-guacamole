package miuix.appcompat.app.floatingactivity.multiapp;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import gb.toq;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import miuix.appcompat.app.floatingactivity.C6918g;
import miuix.appcompat.app.floatingactivity.FloatingActivitySwitcher;
import miuix.appcompat.app.floatingactivity.InterfaceC6939y;
import miuix.appcompat.app.floatingactivity.ld6;
import miuix.appcompat.app.floatingactivity.multiapp.IFloatingService;
import miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify;
import miuix.appcompat.app.t8r;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public final class MultiAppFloatingActivitySwitcher {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f86861cdj = "first_floating_activity";

    /* JADX INFO: renamed from: h */
    public static final String f38883h = "floating_service_path";

    /* JADX INFO: renamed from: i */
    private static String[] f38884i = null;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f86862ki = "service_page_index";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f86863kja0 = "floating_service_original_page_index";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f86864ld6 = "MFloatingSwitcher";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f86865n7h = "floating_service_pkg";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final long f86866qrj = 100;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static MultiAppFloatingActivitySwitcher f86867t8r = null;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f86868x2 = "floating_switcher_saved_key";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private long f86869f7l8;

    /* JADX INFO: renamed from: g */
    private long f38885g;

    /* JADX INFO: renamed from: n */
    private long f38887n;

    /* JADX INFO: renamed from: q */
    private IFloatingService f38889q;

    /* JADX INFO: renamed from: s */
    private boolean f38890s;

    /* JADX INFO: renamed from: y */
    private WeakReference<View> f38891y;

    /* JADX INFO: renamed from: k */
    private final Handler f38886k = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final SparseArray<ArrayList<ActivitySpec>> f86870toq = new SparseArray<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f86871zy = true;

    /* JADX INFO: renamed from: p */
    private final ServiceConnection f38888p = new ServiceConnectionC6930k();

    class ServiceNotify extends IServiceNotify.Stub {
        protected String mActivityIdentity;
        protected int mActivityTaskId;

        public ServiceNotify(t8r t8rVar) {
            this.mActivityIdentity = t8rVar.getActivityIdentity();
            this.mActivityTaskId = t8rVar.getTaskId();
        }

        @dd
        private t8r getActivity() {
            MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = MultiAppFloatingActivitySwitcher.gvn7();
            if (multiAppFloatingActivitySwitcherGvn7 != null) {
                return multiAppFloatingActivitySwitcherGvn7.jk(getActivityTaskId(), getActivityIdentity());
            }
            return null;
        }

        protected String getActivityIdentity() {
            return this.mActivityIdentity;
        }

        protected int getActivityTaskId() {
            return this.mActivityTaskId;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Override // miuix.appcompat.app.floatingactivity.multiapp.IServiceNotify
        public Bundle notifyFromService(int i2, Bundle bundle) throws RemoteException {
            Bundle bundle2 = new Bundle();
            if (i2 == 1) {
                MultiAppFloatingActivitySwitcher.f86867t8r.eqxt();
            } else if (i2 == 2) {
                MultiAppFloatingActivitySwitcher.f86867t8r.hb();
            } else if (i2 == 3) {
                MultiAppFloatingActivitySwitcher.f86867t8r.zurt();
                t8r activity = getActivity();
                if (activity != null) {
                    MultiAppFloatingActivitySwitcher.f86867t8r.zp(activity);
                }
            } else if (i2 != 5) {
                switch (i2) {
                    case 8:
                        t8r activity2 = getActivity();
                        if (bundle != null && activity2 != null) {
                            View floatingBrightPanel = activity2.getFloatingBrightPanel();
                            MultiAppFloatingActivitySwitcher.this.m24975b(ld6.m24948n(floatingBrightPanel, C6918g.m24910k(bundle)));
                            if (MultiAppFloatingActivitySwitcher.this.f38891y != null && MultiAppFloatingActivitySwitcher.this.f38891y.get() != null) {
                                ((ViewGroup) floatingBrightPanel.getParent()).getOverlay().add((View) MultiAppFloatingActivitySwitcher.this.f38891y.get());
                            }
                        }
                        break;
                    case 9:
                        t8r activity3 = getActivity();
                        bundle2.putBoolean(C6934k.f86874kja0, activity3 != null && activity3.isFinishing());
                        break;
                    case 10:
                        t8r activity4 = getActivity();
                        if (activity4 != null) {
                            MultiAppFloatingActivitySwitcher.this.f38886k.postDelayed(new RunnableC6931q(activity4), 160L);
                        }
                        break;
                    case 11:
                        MultiAppFloatingActivitySwitcher.f86867t8r.ni7();
                        break;
                }
            } else {
                MultiAppFloatingActivitySwitcher.f86867t8r.eqxt();
            }
            return bundle2;
        }

        public void resetAppCompatActivity(t8r t8rVar) {
            this.mActivityIdentity = t8rVar.getActivityIdentity();
            this.mActivityTaskId = t8rVar.getTaskId();
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.multiapp.MultiAppFloatingActivitySwitcher$k */
    class ServiceConnectionC6930k implements ServiceConnection {
        ServiceConnectionC6930k() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Log.d(MultiAppFloatingActivitySwitcher.f86864ld6, "onServiceConnected");
            if (MultiAppFloatingActivitySwitcher.f86867t8r != null) {
                MultiAppFloatingActivitySwitcher.f86867t8r.y9n(IFloatingService.Stub.asInterface(iBinder));
                MultiAppFloatingActivitySwitcher.this.t8r();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            Log.d(MultiAppFloatingActivitySwitcher.f86864ld6, "onServiceDisconnected");
            if (MultiAppFloatingActivitySwitcher.f86867t8r != null) {
                MultiAppFloatingActivitySwitcher.f86867t8r.m24958a();
                MultiAppFloatingActivitySwitcher.this.m24976i();
                MultiAppFloatingActivitySwitcher.this.mcp();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.app.floatingactivity.multiapp.MultiAppFloatingActivitySwitcher$q */
    static class RunnableC6931q implements Runnable {

        /* JADX INFO: renamed from: k */
        private WeakReference<t8r> f38903k;

        public RunnableC6931q(t8r t8rVar) {
            this.f38903k = null;
            this.f38903k = new WeakReference<>(t8rVar);
        }

        @Override // java.lang.Runnable
        public void run() {
            t8r t8rVar = this.f38903k.get();
            if (t8rVar != null) {
                t8rVar.executeOpenExitAnimation();
            }
        }
    }

    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ActivitySpec f38904k;

        toq(ActivitySpec activitySpec) {
            this.f38904k = activitySpec;
        }

        @Override // java.lang.Runnable
        public void run() {
            String strValueOf = String.valueOf(this.f38904k.f38896n.hashCode());
            Bundle bundle = new Bundle();
            bundle.putInt(C6934k.f86877qrj, this.f38904k.f38893h);
            bundle.putString(C6934k.f38915h, strValueOf);
            MultiAppFloatingActivitySwitcher.this.nn86(10, bundle);
        }
    }

    class zy implements InterfaceC6939y {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        protected int f86872f7l8;

        /* JADX INFO: renamed from: g */
        protected String f38906g;

        public zy(t8r t8rVar) {
            this.f38906g = t8rVar.getActivityIdentity();
            this.f86872f7l8 = t8rVar.getTaskId();
        }

        private boolean x2(int i2) {
            return !MultiAppFloatingActivitySwitcher.this.f86871zy && (i2 == 1 || i2 == 2);
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        public boolean f7l8() {
            ArrayList arrayList = (ArrayList) MultiAppFloatingActivitySwitcher.this.f86870toq.get(n7h());
            if (arrayList == null) {
                return false;
            }
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (((ActivitySpec) arrayList.get(i2)).f38895k == 0) {
                    return !r3.f38901z;
                }
            }
            return false;
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: g */
        public void mo24897g() {
            MultiAppFloatingActivitySwitcher.this.m24960e(5);
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: k */
        public void mo24899k() {
            MultiAppFloatingActivitySwitcher.this.m24960e(1);
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        public void ld6(t8r t8rVar) {
            MultiAppFloatingActivitySwitcher.this.uv6(t8rVar.getTaskId(), t8rVar.getActivityIdentity());
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: n */
        public void mo24900n() {
            MultiAppFloatingActivitySwitcher.this.m24960e(11);
        }

        protected int n7h() {
            return this.f86872f7l8;
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: p */
        public boolean mo24901p() {
            ArrayList arrayList = (ArrayList) MultiAppFloatingActivitySwitcher.this.f86870toq.get(n7h());
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    ActivitySpec activitySpec = (ActivitySpec) arrayList.get(i2);
                    t8r t8rVar = activitySpec.f38897p;
                    if (t8rVar != null && activitySpec.f38895k == 0) {
                        return t8rVar.getActivityIdentity().equals(qrj());
                    }
                }
            }
            return false;
        }

        @Override // miuix.appcompat.app.floatingactivity.f7l8
        /* JADX INFO: renamed from: q */
        public boolean mo24902q(int i2) {
            if (!x2(i2) && MultiAppFloatingActivitySwitcher.this.bf2(i2, n7h())) {
                MultiAppFloatingActivitySwitcher.this.m24960e(5);
            }
            return false;
        }

        protected String qrj() {
            return this.f38906g;
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: s */
        public int mo24903s() {
            return Math.max(MultiAppFloatingActivitySwitcher.this.oc(n7h()), MultiAppFloatingActivitySwitcher.this.fti(n7h()));
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        public boolean toq() {
            return mo24903s() == 1;
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        /* JADX INFO: renamed from: y */
        public void mo24904y() {
            MultiAppFloatingActivitySwitcher.this.m24960e(2);
        }

        @Override // miuix.appcompat.app.floatingactivity.InterfaceC6939y
        public void zy(t8r t8rVar) {
            if (t8rVar != null) {
                try {
                    MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = MultiAppFloatingActivitySwitcher.gvn7();
                    if (multiAppFloatingActivitySwitcherGvn7 != null) {
                        multiAppFloatingActivitySwitcherGvn7.yz(ld6.m24946g(t8rVar.getFloatingBrightPanel()), t8rVar.getTaskId(), t8rVar.getActivityIdentity());
                    }
                } catch (Exception e2) {
                    Log.d(MultiAppFloatingActivitySwitcher.f86864ld6, "saveBitmap exception", e2);
                }
            }
        }
    }

    private MultiAppFloatingActivitySwitcher() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m24958a() {
        for (int i2 = 0; i2 < this.f86870toq.size(); i2++) {
            for (ActivitySpec activitySpec : this.f86870toq.valueAt(i2)) {
                a98o(activitySpec.f38893h, activitySpec.f38894i);
            }
        }
    }

    @dd
    private ActivitySpec a9(int i2, String str) {
        ArrayList<ActivitySpec> arrayList = this.f86870toq.get(i2);
        if (arrayList == null) {
            return null;
        }
        for (ActivitySpec activitySpec : arrayList) {
            if (TextUtils.equals(activitySpec.f38894i, str)) {
                return activitySpec;
            }
        }
        return null;
    }

    private void a98o(int i2, String str) {
        if (this.f38889q != null) {
            try {
                ActivitySpec activitySpecA9 = a9(i2, str);
                if (activitySpecA9 != null) {
                    IFloatingService iFloatingService = this.f38889q;
                    ServiceNotify serviceNotify = activitySpecA9.f38896n;
                    iFloatingService.unregisterServiceNotify(serviceNotify, String.valueOf(serviceNotify.hashCode()));
                }
            } catch (RemoteException e2) {
                Log.w(f86864ld6, "catch unregister service notify exception", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean bf2(int i2, int i3) {
        return !(i2 == 4 || i2 == 3) || oc(i3) <= 1;
    }

    /* JADX INFO: renamed from: c */
    private boolean m24959c(String str) {
        for (String str2 : f38884i) {
            if (str2.equals(str)) {
                return true;
            }
        }
        Log.w(f86864ld6, "Package is not allowed:" + str + ". Please contact the MIUIX developer!");
        return false;
    }

    private void cdj(Context context, Intent intent) {
        Intent intent2 = new Intent();
        String stringExtra = intent.getStringExtra(f86865n7h);
        if (m24959c(stringExtra)) {
            intent2.setPackage(stringExtra);
            String stringExtra2 = intent.getStringExtra(f38883h);
            if (TextUtils.isEmpty(stringExtra2)) {
                return;
            }
            intent2.setComponent(new ComponentName(stringExtra, stringExtra2));
            context.getApplicationContext().bindService(intent2, this.f38888p, 1);
        }
    }

    private void ch(@lvui String str, int i2) {
        IFloatingService iFloatingService = this.f38889q;
        if (iFloatingService != null) {
            try {
                iFloatingService.upDateRemoteActivityInfo(str, i2);
            } catch (RemoteException e2) {
                Log.w(f86864ld6, "catch updateServerActivityIndex service notify exception", e2);
            }
        }
    }

    private void d2ok(int i2) {
        ArrayList<ActivitySpec> arrayList = this.f86870toq.get(i2);
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                int i4 = arrayList.get(i3).f38895k;
                t8r t8rVar = arrayList.get(i3).f38897p;
                if (t8rVar != null && i4 != 0) {
                    t8rVar.hideFloatingDimBackground();
                }
            }
        }
    }

    public static void dd(t8r t8rVar, Intent intent, Bundle bundle) {
        if (!m24961f(intent)) {
            FloatingActivitySwitcher.o1t(t8rVar, bundle);
            return;
        }
        if (f86867t8r == null) {
            f86867t8r = new MultiAppFloatingActivitySwitcher();
            if (f38884i == null) {
                f38884i = t8rVar.getResources().getStringArray(toq.zy.f76991cdj);
            }
            f86867t8r.cdj(t8rVar, intent);
        }
        f86867t8r.lvui(t8rVar, intent, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public Bundle m24960e(int i2) {
        return nn86(i2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqxt() {
        final t8r t8rVar;
        if (hyr(this.f38885g)) {
            return;
        }
        this.f38885g = System.currentTimeMillis();
        for (int i2 = 0; i2 < this.f86870toq.size(); i2++) {
            for (ActivitySpec activitySpec : this.f86870toq.valueAt(i2)) {
                if (!activitySpec.f38898q && (t8rVar = activitySpec.f38897p) != null) {
                    t8rVar.runOnUiThread(new Runnable() { // from class: miuix.appcompat.app.floatingactivity.multiapp.toq
                        @Override // java.lang.Runnable
                        public final void run() {
                            t8rVar.hideFloatingBrightPanel();
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static boolean m24961f(Intent intent) {
        return (TextUtils.isEmpty(intent.getStringExtra(f86865n7h)) || TextUtils.isEmpty(intent.getStringExtra(f38883h))) ? false : true;
    }

    @Deprecated
    public static void fu4(Intent intent, Intent intent2) {
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcher = f86867t8r;
        int iKeyAt = 0;
        if (multiAppFloatingActivitySwitcher != null && multiAppFloatingActivitySwitcher.f86870toq.size() > 0) {
            iKeyAt = f86867t8r.f86870toq.keyAt(0);
        }
        m24974z(intent, intent2, iKeyAt);
    }

    static MultiAppFloatingActivitySwitcher gvn7() {
        return f86867t8r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hb() {
        final t8r t8rVar;
        if (hyr(this.f86869f7l8)) {
            return;
        }
        this.f86869f7l8 = System.currentTimeMillis();
        for (int i2 = 0; i2 < this.f86870toq.size(); i2++) {
            for (ActivitySpec activitySpec : this.f86870toq.valueAt(i2)) {
                if (!activitySpec.f38898q && (t8rVar = activitySpec.f38897p) != null) {
                    t8rVar.runOnUiThread(new Runnable() { // from class: miuix.appcompat.app.floatingactivity.multiapp.zy
                        @Override // java.lang.Runnable
                        public final void run() {
                            t8rVar.showFloatingBrightPanel();
                        }
                    });
                }
            }
        }
    }

    private boolean hyr(long j2) {
        return System.currentTimeMillis() - j2 <= f86866qrj;
    }

    private void i1(t8r t8rVar, Intent intent, Bundle bundle) {
        if (!n5r1(t8rVar)) {
            ActivitySpec activitySpec = bundle != null ? (ActivitySpec) bundle.getParcelable(f86868x2) : null;
            int i2 = 0;
            if (activitySpec == null) {
                activitySpec = new ActivitySpec(true);
                if (intent == null) {
                    intent = t8rVar.getIntent();
                }
                activitySpec.f38895k = intent.getIntExtra(f86862ki, 0);
            }
            activitySpec.f38897p = t8rVar;
            activitySpec.f38893h = t8rVar.getTaskId();
            activitySpec.f38894i = t8rVar.getActivityIdentity();
            ArrayList<ActivitySpec> arrayList = this.f86870toq.get(activitySpec.f38893h);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                this.f86870toq.put(activitySpec.f38893h, arrayList);
            }
            int i3 = activitySpec.f38895k;
            int size = arrayList.size() - 1;
            while (true) {
                if (size < 0) {
                    break;
                }
                if (i3 > arrayList.get(size).f38895k) {
                    i2 = size + 1;
                    break;
                }
                size--;
            }
            arrayList.add(i2, activitySpec);
            miuix.appcompat.app.floatingactivity.toq.f7l8(t8rVar, activitySpec.f38895k);
        }
        d2ok(t8rVar.getTaskId());
    }

    /* JADX INFO: renamed from: j */
    public static void m24964j(int i2, String str, Bundle bundle) {
        ActivitySpec activitySpecA9;
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = gvn7();
        if (multiAppFloatingActivitySwitcherGvn7 == null || (activitySpecA9 = multiAppFloatingActivitySwitcherGvn7.a9(i2, str)) == null) {
            return;
        }
        bundle.putParcelable(f86868x2, activitySpecA9);
    }

    private void lvui(t8r t8rVar, Intent intent, Bundle bundle) {
        if (miuix.appcompat.app.floatingactivity.helper.toq.toq(t8rVar) == 0) {
            return;
        }
        i1(t8rVar, intent, bundle);
        m24966m(t8rVar);
        t8rVar.getLifecycle().mo4451k(new MultiAppFloatingLifecycleObserver(t8rVar));
        t8rVar.setEnableSwipToDismiss(this.f86871zy);
        t8rVar.setOnFloatingCallback(new zy(t8rVar));
    }

    /* JADX INFO: renamed from: m */
    private void m24966m(t8r t8rVar) {
        ActivitySpec activitySpecA9 = a9(t8rVar.getTaskId(), t8rVar.getActivityIdentity());
        if (activitySpecA9 != null && activitySpecA9.f38896n == null) {
            activitySpecA9.f38896n = new ServiceNotify(t8rVar);
        } else if (activitySpecA9 != null) {
            activitySpecA9.f38896n.resetAppCompatActivity(t8rVar);
        }
        x9kr(activitySpecA9);
    }

    private boolean n5r1(t8r t8rVar) {
        return (t8rVar == null || a9(t8rVar.getTaskId(), t8rVar.getActivityIdentity()) == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ni7() {
        if (hyr(this.f38887n)) {
            return;
        }
        this.f38887n = System.currentTimeMillis();
        for (int i2 = 0; i2 < this.f86870toq.size(); i2++) {
            ArrayList<ActivitySpec> arrayListValueAt = this.f86870toq.valueAt(i2);
            for (int size = arrayListValueAt.size() - 1; size >= 0; size--) {
                t8r t8rVar = arrayListValueAt.get(size).f38897p;
                int i3 = arrayListValueAt.get(size).f38895k;
                int iOc = oc(arrayListValueAt.get(size).f38893h);
                if (t8rVar != null && i3 != iOc - 1) {
                    t8rVar.realFinish();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Bundle nn86(int i2, Bundle bundle) {
        IFloatingService iFloatingService = this.f38889q;
        if (iFloatingService == null) {
            Log.d(f86864ld6, "ifloatingservice is null");
            return null;
        }
        try {
            return iFloatingService.callServiceMethod(i2, bundle);
        } catch (RemoteException e2) {
            Log.w(f86864ld6, "catch call service method exception", e2);
            return null;
        }
    }

    public static void o1t(Intent intent, String str) {
        wvg(intent, str, null);
    }

    @Deprecated
    /* JADX INFO: renamed from: r */
    public static void m24970r(t8r t8rVar, Intent intent) {
        dd(t8rVar, intent, null);
    }

    /* JADX INFO: renamed from: t */
    public static void m24972t(Intent intent, t8r t8rVar) {
        m24974z(intent, t8rVar.getIntent(), t8rVar.getTaskId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t8r() {
        for (int i2 = 0; i2 < this.f86870toq.size(); i2++) {
            for (ActivitySpec activitySpec : this.f86870toq.valueAt(i2)) {
                if (!activitySpec.f38900y) {
                    x9kr(activitySpec);
                    ki(activitySpec.f38893h, activitySpec.f38894i);
                }
            }
        }
    }

    public static void wvg(Intent intent, String str, String str2) {
        intent.putExtra(f86865n7h, str);
        if (TextUtils.isEmpty(str2)) {
            str2 = FloatingService.class.getName();
        }
        intent.putExtra(f38883h, str2);
        if (intent.getIntExtra(f86862ki, -1) < 0) {
            intent.putExtra(f86861cdj, true);
            intent.putExtra(f86862ki, 0);
        }
    }

    private void x9kr(@dd ActivitySpec activitySpec) {
        IFloatingService iFloatingService;
        if (activitySpec == null || (iFloatingService = this.f38889q) == null) {
            return;
        }
        try {
            ServiceNotify serviceNotify = activitySpec.f38896n;
            iFloatingService.registerServiceNotify(serviceNotify, jp0y(serviceNotify, activitySpec.f38893h));
            ch(jp0y(activitySpec.f38896n, activitySpec.f38893h), activitySpec.f38895k);
            if (!activitySpec.f38900y) {
                activitySpec.f38900y = true;
                activitySpec.f38892g = activitySpec.f38895k;
            }
            Iterator<Runnable> it = activitySpec.f38899s.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
            activitySpec.f38899s.clear();
        } catch (RemoteException e2) {
            Log.w(f86864ld6, "catch register service notify exception", e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y9n(IFloatingService iFloatingService) {
        this.f38889q = iFloatingService;
        this.f38890s = true;
    }

    /* JADX INFO: renamed from: z */
    private static void m24974z(Intent intent, Intent intent2, int i2) {
        intent.putExtra(f86865n7h, intent2.getStringExtra(f86865n7h));
        intent.putExtra(f38883h, intent2.getStringExtra(f38883h));
        if (intent.getBooleanExtra(f86861cdj, false)) {
            intent.putExtra(f86862ki, 0);
        } else {
            int intExtra = intent2.getIntExtra(f86862ki, -1);
            if (intExtra < 0) {
                Log.w(f86864ld6, "the value of SERVICE_PAGE_INDEX is invalid  , index = " + intExtra + " , please check it");
            }
            intent.putExtra(f86862ki, intExtra + 1);
        }
        MultiAppFloatingActivitySwitcher multiAppFloatingActivitySwitcherGvn7 = gvn7();
        if (multiAppFloatingActivitySwitcherGvn7 != null) {
            intent.putExtra(f86863kja0, multiAppFloatingActivitySwitcherGvn7.oc(i2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(Context context) {
        if (this.f38890s) {
            this.f38890s = false;
            context.getApplicationContext().unbindService(this.f38888p);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zurt() {
        if (hyr(this.f38887n)) {
            return;
        }
        this.f38887n = System.currentTimeMillis();
        for (int i2 = 0; i2 < this.f86870toq.size(); i2++) {
            ArrayList<ActivitySpec> arrayListValueAt = this.f86870toq.valueAt(i2);
            for (int size = arrayListValueAt.size() - 1; size >= 0; size--) {
                t8r t8rVar = arrayListValueAt.get(size).f38897p;
                int i3 = arrayListValueAt.get(size).f38895k;
                int iOc = oc(arrayListValueAt.get(size).f38893h);
                if (t8rVar != null && i3 != iOc - 1) {
                    t8rVar.realFinish();
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    void m24975b(View view) {
        this.f38891y = new WeakReference<>(view);
    }

    View d3() {
        WeakReference<View> weakReference = this.f38891y;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    void ek5k(int i2, String str) {
        ActivitySpec activitySpecA9 = a9(i2, str);
        if (activitySpecA9 == null || activitySpecA9.f38897p == null) {
            return;
        }
        a98o(i2, str);
        ArrayList<ActivitySpec> arrayList = this.f86870toq.get(i2);
        if (arrayList != null) {
            arrayList.remove(activitySpecA9);
            if (arrayList.isEmpty()) {
                this.f86870toq.remove(i2);
            }
        }
        if (this.f86870toq.size() == 0) {
            zp(activitySpecA9.f38897p);
            m24976i();
        }
    }

    void fn3e(int i2, String str) {
        ActivitySpec activitySpecA9 = a9(i2, str);
        if (activitySpecA9 != null) {
            activitySpecA9.f38899s.clear();
        }
    }

    int fti(int i2) {
        ArrayList<ActivitySpec> arrayList = this.f86870toq.get(i2);
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public void m24976i() {
        this.f86870toq.clear();
        this.f38891y = null;
    }

    t8r jk(int i2, String str) {
        ActivitySpec activitySpecA9 = a9(i2, str);
        if (activitySpecA9 != null) {
            return activitySpecA9.f38897p;
        }
        return null;
    }

    String jp0y(Object obj, int i2) {
        return obj.hashCode() + ":" + i2;
    }

    void ki(int i2, String str) {
        ActivitySpec activitySpecA9;
        t8r t8rVar;
        ArrayList<ActivitySpec> arrayList = this.f86870toq.get(i2);
        if (((arrayList == null || arrayList.size() <= 1) && oc(i2) <= 1) || (activitySpecA9 = a9(i2, str)) == null || activitySpecA9.f38892g <= 0 || (t8rVar = activitySpecA9.f38897p) == null) {
            return;
        }
        t8rVar.hideFloatingDimBackground();
    }

    /* JADX INFO: renamed from: l */
    public boolean m24977l(int i2, String str) {
        ActivitySpec activitySpecA9 = a9(i2, str);
        if (activitySpecA9 != null) {
            return activitySpecA9.f38901z;
        }
        return false;
    }

    boolean lrht() {
        return this.f38889q != null;
    }

    void mcp() {
        if (this.f86870toq.size() == 0) {
            f86867t8r = null;
        }
    }

    boolean ncyb(int i2, String str) {
        ActivitySpec activitySpecA9 = a9(i2, str);
        if (activitySpecA9 == null) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putString(C6934k.f86879x2, String.valueOf(activitySpecA9.f38896n.hashCode()));
        bundle.putInt(C6934k.f86877qrj, i2);
        Bundle bundleNn86 = nn86(9, bundle);
        return bundleNn86 != null && bundleNn86.getBoolean(C6934k.f86874kja0);
    }

    /* JADX INFO: renamed from: o */
    void m24978o(int i2, String str, Runnable runnable) {
        if (m24977l(i2, str)) {
            return;
        }
        if (fti(i2) > 1 || oc(i2) > 1) {
            uv6(i2, str);
        }
        if (lrht()) {
            runnable.run();
            return;
        }
        ActivitySpec activitySpecA9 = a9(i2, str);
        if (activitySpecA9 != null) {
            activitySpecA9.f38899s.add(runnable);
        }
    }

    int oc(int i2) {
        Bundle bundle = new Bundle();
        bundle.putInt(C6934k.f86877qrj, i2);
        Bundle bundleNn86 = nn86(6, bundle);
        int i3 = bundleNn86 != null ? bundleNn86.getInt(String.valueOf(6)) : 0;
        ArrayList<ActivitySpec> arrayList = this.f86870toq.get(i2);
        if (arrayList != null) {
            Iterator<ActivitySpec> it = arrayList.iterator();
            while (it.hasNext()) {
                int i4 = it.next().f38895k;
                if (i4 + 1 > i3) {
                    i3 = i4 + 1;
                }
            }
        }
        return i3;
    }

    void uv6(int i2, String str) {
        ActivitySpec activitySpecA9 = a9(i2, str);
        if (activitySpecA9 != null) {
            activitySpecA9.f38901z = true;
        }
    }

    void vyq(int i2, String str) {
        ActivitySpec activitySpecA9 = a9(i2, str);
        if (activitySpecA9 == null) {
            return;
        }
        toq toqVar = new toq(activitySpecA9);
        if (lrht()) {
            toqVar.run();
        } else {
            activitySpecA9.f38899s.add(toqVar);
        }
    }

    /* JADX INFO: renamed from: x */
    void m24979x(int i2, String str, boolean z2) {
        ActivitySpec activitySpecA9 = a9(i2, str);
        if (activitySpecA9 != null) {
            activitySpecA9.f38898q = z2;
        }
    }

    void yz(Bitmap bitmap, int i2, String str) throws Exception {
        ActivitySpec activitySpecA9;
        if (bitmap == null || (activitySpecA9 = a9(i2, str)) == null) {
            return;
        }
        int byteCount = bitmap.getByteCount();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(byteCount);
        bitmap.copyPixelsToBuffer(byteBufferAllocate);
        C6918g.zy(this.f38889q, byteBufferAllocate.array(), byteCount, bitmap.getWidth(), bitmap.getHeight(), String.valueOf(activitySpecA9.f38896n.hashCode()), i2);
    }

    static class ActivitySpec implements Parcelable {
        public static final Parcelable.Creator<ActivitySpec> CREATOR = new Parcelable.Creator<ActivitySpec>() { // from class: miuix.appcompat.app.floatingactivity.multiapp.MultiAppFloatingActivitySwitcher.ActivitySpec.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public ActivitySpec createFromParcel(Parcel parcel) {
                return new ActivitySpec(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public ActivitySpec[] newArray(int i2) {
                return new ActivitySpec[i2];
            }
        };

        /* JADX INFO: renamed from: g */
        int f38892g;

        /* JADX INFO: renamed from: h */
        int f38893h;

        /* JADX INFO: renamed from: i */
        String f38894i;

        /* JADX INFO: renamed from: k */
        int f38895k;

        /* JADX INFO: renamed from: n */
        ServiceNotify f38896n;

        /* JADX INFO: renamed from: p */
        t8r f38897p;

        /* JADX INFO: renamed from: q */
        boolean f38898q;

        /* JADX INFO: renamed from: s */
        List<Runnable> f38899s;

        /* JADX INFO: renamed from: y */
        boolean f38900y;

        /* JADX INFO: renamed from: z */
        boolean f38901z;

        protected ActivitySpec(boolean z2) {
            this.f38895k = -1;
            this.f38900y = false;
            this.f38901z = false;
            this.f38898q = z2;
            this.f38899s = new LinkedList();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @lvui
        public String toString() {
            return "{ index : " + this.f38895k + "; taskId : " + this.f38893h + "; taskId : " + this.f38893h + "; identity : " + this.f38894i + "; serviceNotifyIndex : " + this.f38892g + "; register : " + this.f38900y + "; isOpenEnterAnimExecuted : " + this.f38901z + "; }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeInt(this.f38895k);
            parcel.writeInt(this.f38893h);
            parcel.writeString(this.f38894i);
            parcel.writeByte(this.f38898q ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.f38892g);
            parcel.writeByte(this.f38900y ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f38901z ? (byte) 1 : (byte) 0);
        }

        protected ActivitySpec(Parcel parcel) {
            this.f38895k = -1;
            this.f38900y = false;
            this.f38901z = false;
            this.f38895k = parcel.readInt();
            this.f38893h = parcel.readInt();
            this.f38894i = parcel.readString();
            this.f38898q = parcel.readByte() != 0;
            this.f38892g = parcel.readInt();
            this.f38900y = parcel.readByte() != 0;
            this.f38901z = parcel.readByte() != 0;
            this.f38899s = new LinkedList();
        }
    }
}

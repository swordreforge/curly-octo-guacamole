package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.InterfaceC0051n;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.AbstractC0067g;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0068k;
import androidx.activity.result.InterfaceC0071y;
import androidx.activity.result.contract.AbstractC0059k;
import androidx.activity.result.contract.toq;
import androidx.fragment.app.C0888n;
import androidx.fragment.app.C0894t;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.o1t;
import androidx.lifecycle.InterfaceC0931j;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.hb;
import androidx.lifecycle.kja0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import o1t.C7422k;
import zy.InterfaceC7843t;
import zy.dd;
import zy.lvui;
import zy.nn86;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public abstract class FragmentManager implements fn3e {

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    static final String f51433dd = "FragmentManager";

    /* JADX INFO: renamed from: l */
    private static final String f4685l = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final int f51434ncyb = 1;

    /* JADX INFO: renamed from: r */
    private static boolean f4686r = false;

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    static boolean f51435x9kr = true;

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private boolean f51436a9;

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    private androidx.fragment.app.cdj f51438d2ok;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private ArrayList<Boolean> f51439d3;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private ArrayList<ki> f51440eqxt;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private OnBackPressedDispatcher f51441f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    @dd
    Fragment f51442fn3e;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private boolean f51443fti;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private ArrayList<C0884k> f51445gvn7;

    /* JADX INFO: renamed from: i */
    private Fragment f4689i;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private boolean f51446jk;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private boolean f51447jp0y;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private AbstractC0893s<?> f51448ki;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private boolean f51452mcp;

    /* JADX INFO: renamed from: n */
    private ArrayList<Fragment> f4691n;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private AbstractC0067g<IntentSenderRequest> f51455o1t;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private ArrayList<Fragment> f51456oc;

    /* JADX INFO: renamed from: q */
    ArrayList<C0884k> f4693q;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private AbstractC0879g f51458t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f51459toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private AbstractC0067g<String[]> f51460wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private ArrayList<kja0> f51461x2;

    /* JADX INFO: renamed from: z */
    private AbstractC0067g<Intent> f4697z;

    /* JADX INFO: renamed from: k */
    private final ArrayList<InterfaceC0861h> f4690k = new ArrayList<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final C0904z f51463zy = new C0904z();

    /* JADX INFO: renamed from: g */
    private final androidx.fragment.app.x2 f4687g = new androidx.fragment.app.x2(this);

    /* JADX INFO: renamed from: y */
    private final androidx.activity.zy f4696y = new zy(false);

    /* JADX INFO: renamed from: s */
    private final AtomicInteger f4694s = new AtomicInteger();

    /* JADX INFO: renamed from: p */
    private final Map<String, Bundle> f4692p = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private final Map<String, n7h> f51450ld6 = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private Map<Fragment, HashSet<androidx.core.os.zy>> f51457qrj = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private final C0894t.f7l8 f51453n7h = new C0865q();

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private final androidx.fragment.app.qrj f51449kja0 = new androidx.fragment.app.qrj(this);

    /* JADX INFO: renamed from: h */
    private final CopyOnWriteArrayList<androidx.fragment.app.ki> f4688h = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    int f51437cdj = -1;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private C0903y f51462zurt = null;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private C0903y f51454ni7 = new C0863n();
    private oc mSpecialEffectsControllerFactory = null;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private oc f51444fu4 = new C0860g();

    /* JADX INFO: renamed from: t */
    ArrayDeque<LaunchedFragmentInfo> f4695t = new ArrayDeque<>();

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    private Runnable f51451lvui = new f7l8();

    private class cdj implements InterfaceC0861h {

        /* JADX INFO: renamed from: k */
        final String f4704k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f51464toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final int f51465zy;

        cdj(@dd String str, int i2, int i3) {
            this.f4704k = str;
            this.f51464toq = i2;
            this.f51465zy = i3;
        }

        @Override // androidx.fragment.app.FragmentManager.InterfaceC0861h
        /* JADX INFO: renamed from: k */
        public boolean mo4209k(@lvui ArrayList<C0884k> arrayList, @lvui ArrayList<Boolean> arrayList2) {
            Fragment fragment = FragmentManager.this.f51442fn3e;
            if (fragment == null || this.f51464toq >= 0 || this.f4704k != null || !fragment.getChildFragmentManager().vep5()) {
                return FragmentManager.this.uc(arrayList, arrayList2, this.f4704k, this.f51464toq, this.f51465zy);
            }
            return false;
        }
    }

    class f7l8 implements Runnable {
        f7l8() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FragmentManager.this.y9n(true);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$g */
    class C0860g implements oc {
        C0860g() {
        }

        @Override // androidx.fragment.app.oc
        @lvui
        /* JADX INFO: renamed from: k */
        public d3 mo4210k(@lvui ViewGroup viewGroup) {
            return new androidx.fragment.app.toq(viewGroup);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$h */
    interface InterfaceC0861h {
        /* JADX INFO: renamed from: k */
        boolean mo4209k(@lvui ArrayList<C0884k> arrayList, @lvui ArrayList<Boolean> arrayList2);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$k */
    class C0862k implements InterfaceC0068k<ActivityResult> {
        C0862k() {
        }

        @Override // androidx.activity.result.InterfaceC0068k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo79k(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f4695t.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w(FragmentManager.f51433dd, "No IntentSenders were started for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f4702k;
            int i2 = launchedFragmentInfoPollFirst.f4703q;
            Fragment fragmentM4365s = FragmentManager.this.f51463zy.m4365s(str);
            if (fragmentM4365s != null) {
                fragmentM4365s.onActivityResult(i2, activityResult.m22k(), activityResult.getData());
                return;
            }
            Log.w(FragmentManager.f51433dd, "Intent Sender result delivered for unknown Fragment " + str);
        }
    }

    static class ki implements Fragment.x2 {

        /* JADX INFO: renamed from: k */
        final boolean f4709k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final C0884k f51466toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f51467zy;

        ki(@lvui C0884k c0884k, boolean z2) {
            this.f4709k = z2;
            this.f51466toq = c0884k;
        }

        @Override // androidx.fragment.app.Fragment.x2
        /* JADX INFO: renamed from: k */
        public void mo4181k() {
            this.f51467zy++;
        }

        /* JADX INFO: renamed from: n */
        public boolean m4211n() {
            return this.f51467zy == 0;
        }

        /* JADX INFO: renamed from: q */
        void m4212q() {
            boolean z2 = this.f51467zy > 0;
            for (Fragment fragment : this.f51466toq.f51489d2ok.fnq8()) {
                fragment.setOnStartEnterTransitionListener(null);
                if (z2 && fragment.isPostponed()) {
                    fragment.startPostponedEnterTransition();
                }
            }
            C0884k c0884k = this.f51466toq;
            c0884k.f51489d2ok.m4207z(c0884k, this.f4709k, !z2, true);
        }

        @Override // androidx.fragment.app.Fragment.x2
        public void toq() {
            int i2 = this.f51467zy - 1;
            this.f51467zy = i2;
            if (i2 != 0) {
                return;
            }
            this.f51466toq.f51489d2ok.ga();
        }

        void zy() {
            C0884k c0884k = this.f51466toq;
            c0884k.f51489d2ok.m4207z(c0884k, this.f4709k, false, false);
        }
    }

    public interface kja0 {
        @zy.oc
        void onBackStackChanged();
    }

    public interface ld6 {
        @Deprecated
        @dd
        CharSequence getBreadCrumbShortTitle();

        @nn86
        @Deprecated
        int getBreadCrumbShortTitleRes();

        @Deprecated
        @dd
        CharSequence getBreadCrumbTitle();

        @nn86
        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        @dd
        String getName();
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$n */
    class C0863n extends C0903y {
        C0863n() {
        }

        @Override // androidx.fragment.app.C0903y
        @lvui
        /* JADX INFO: renamed from: k */
        public Fragment mo4213k(@lvui ClassLoader classLoader, @lvui String str) {
            return FragmentManager.this.qo().toq(FragmentManager.this.qo().m4330g(), str, null);
        }
    }

    private static class n7h implements InterfaceC0881i {

        /* JADX INFO: renamed from: k */
        private final androidx.lifecycle.kja0 f4710k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final InterfaceC0881i f51469toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final androidx.lifecycle.fn3e f51470zy;

        n7h(@lvui androidx.lifecycle.kja0 kja0Var, @lvui InterfaceC0881i interfaceC0881i, @lvui androidx.lifecycle.fn3e fn3eVar) {
            this.f4710k = kja0Var;
            this.f51469toq = interfaceC0881i;
            this.f51470zy = fn3eVar;
        }

        @Override // androidx.fragment.app.InterfaceC0881i
        /* JADX INFO: renamed from: k */
        public void mo4214k(@lvui String str, @lvui Bundle bundle) {
            this.f51469toq.mo4214k(str, bundle);
        }

        public boolean toq(kja0.zy zyVar) {
            return this.f4710k.toq().isAtLeast(zyVar);
        }

        public void zy() {
            this.f4710k.zy(this.f51470zy);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$p */
    class C0864p implements InterfaceC0068k<ActivityResult> {
        C0864p() {
        }

        @Override // androidx.activity.result.InterfaceC0068k
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo79k(ActivityResult activityResult) {
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f4695t.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w(FragmentManager.f51433dd, "No Activities were started for result for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f4702k;
            int i2 = launchedFragmentInfoPollFirst.f4703q;
            Fragment fragmentM4365s = FragmentManager.this.f51463zy.m4365s(str);
            if (fragmentM4365s != null) {
                fragmentM4365s.onActivityResult(i2, activityResult.m22k(), activityResult.getData());
                return;
            }
            Log.w(FragmentManager.f51433dd, "Activity result delivered for unknown Fragment " + str);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$q */
    class C0865q implements C0894t.f7l8 {
        C0865q() {
        }

        @Override // androidx.fragment.app.C0894t.f7l8
        /* JADX INFO: renamed from: k */
        public void mo4215k(@lvui Fragment fragment, @lvui androidx.core.os.zy zyVar) {
            if (zyVar.zy()) {
                return;
            }
            FragmentManager.this.ukdy(fragment, zyVar);
        }

        @Override // androidx.fragment.app.C0894t.f7l8
        public void toq(@lvui Fragment fragment, @lvui androidx.core.os.zy zyVar) {
            FragmentManager.this.m4203p(fragment, zyVar);
        }
    }

    public static abstract class qrj {
        public void f7l8(@lvui FragmentManager fragmentManager, @lvui Fragment fragment, @lvui Context context) {
        }

        /* JADX INFO: renamed from: g */
        public void m4216g(@lvui FragmentManager fragmentManager, @lvui Fragment fragment) {
        }

        @Deprecated
        /* JADX INFO: renamed from: k */
        public void m4217k(@lvui FragmentManager fragmentManager, @lvui Fragment fragment, @dd Bundle bundle) {
        }

        public void ld6(@lvui FragmentManager fragmentManager, @lvui Fragment fragment) {
        }

        /* JADX INFO: renamed from: n */
        public void m4218n(@lvui FragmentManager fragmentManager, @lvui Fragment fragment) {
        }

        public void n7h(@lvui FragmentManager fragmentManager, @lvui Fragment fragment) {
        }

        /* JADX INFO: renamed from: p */
        public void m4219p(@lvui FragmentManager fragmentManager, @lvui Fragment fragment, @lvui Bundle bundle) {
        }

        /* JADX INFO: renamed from: q */
        public void m4220q(@lvui FragmentManager fragmentManager, @lvui Fragment fragment) {
        }

        public void qrj(@lvui FragmentManager fragmentManager, @lvui Fragment fragment, @lvui View view, @dd Bundle bundle) {
        }

        /* JADX INFO: renamed from: s */
        public void m4221s(@lvui FragmentManager fragmentManager, @lvui Fragment fragment) {
        }

        public void toq(@lvui FragmentManager fragmentManager, @lvui Fragment fragment, @lvui Context context) {
        }

        public void x2(@lvui FragmentManager fragmentManager, @lvui Fragment fragment) {
        }

        /* JADX INFO: renamed from: y */
        public void m4222y(@lvui FragmentManager fragmentManager, @lvui Fragment fragment, @dd Bundle bundle) {
        }

        public void zy(@lvui FragmentManager fragmentManager, @lvui Fragment fragment, @dd Bundle bundle) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$s */
    class C0866s implements androidx.fragment.app.ki {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Fragment f4713k;

        C0866s(Fragment fragment) {
            this.f4713k = fragment;
        }

        @Override // androidx.fragment.app.ki
        /* JADX INFO: renamed from: k */
        public void mo4223k(@lvui FragmentManager fragmentManager, @lvui Fragment fragment) {
            this.f4713k.onAttachFragment(fragment);
        }
    }

    class toq implements InterfaceC0068k<Map<String, Boolean>> {
        toq() {
        }

        @Override // androidx.activity.result.InterfaceC0068k
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void mo79k(Map<String, Boolean> map) {
            String[] strArr = (String[]) map.keySet().toArray(new String[0]);
            ArrayList arrayList = new ArrayList(map.values());
            int[] iArr = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                iArr[i2] = ((Boolean) arrayList.get(i2)).booleanValue() ? 0 : -1;
            }
            LaunchedFragmentInfo launchedFragmentInfoPollFirst = FragmentManager.this.f4695t.pollFirst();
            if (launchedFragmentInfoPollFirst == null) {
                Log.w(FragmentManager.f51433dd, "No permissions were requested for " + this);
                return;
            }
            String str = launchedFragmentInfoPollFirst.f4702k;
            int i3 = launchedFragmentInfoPollFirst.f4703q;
            Fragment fragmentM4365s = FragmentManager.this.f51463zy.m4365s(str);
            if (fragmentM4365s != null) {
                fragmentM4365s.onRequestPermissionsResult(i3, strArr, iArr);
                return;
            }
            Log.w(FragmentManager.f51433dd, "Permission request result delivered for unknown Fragment " + str);
        }
    }

    static class x2 extends AbstractC0059k<IntentSenderRequest, ActivityResult> {
        x2() {
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public ActivityResult zy(int i2, @dd Intent intent) {
            return new ActivityResult(i2, intent);
        }

        @Override // androidx.activity.result.contract.AbstractC0059k
        @lvui
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public Intent mo36k(@lvui Context context, IntentSenderRequest intentSenderRequest) {
            Bundle bundleExtra;
            Intent intent = new Intent(toq.ld6.f128k);
            Intent fillInIntent = intentSenderRequest.getFillInIntent();
            if (fillInIntent != null && (bundleExtra = fillInIntent.getBundleExtra(toq.C0063p.f129k)) != null) {
                intent.putExtra(toq.C0063p.f129k, bundleExtra);
                fillInIntent.removeExtra(toq.C0063p.f129k);
                if (fillInIntent.getBooleanExtra(FragmentManager.f4685l, false)) {
                    intentSenderRequest = new IntentSenderRequest.C0058k(intentSenderRequest.getIntentSender()).toq(null).zy(intentSenderRequest.toq(), intentSenderRequest.m33k()).m35k();
                }
            }
            intent.putExtra(toq.ld6.f46468toq, intentSenderRequest);
            if (FragmentManager.m4(2)) {
                Log.v(FragmentManager.f51433dd, "CreateIntent created the following intent: " + intent);
            }
            return intent;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentManager$y */
    class C0867y extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ViewGroup f4717k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Fragment f4718n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f4719q;

        C0867y(ViewGroup viewGroup, View view, Fragment fragment) {
            this.f4717k = viewGroup;
            this.f4719q = view;
            this.f4718n = fragment;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4717k.endViewTransition(this.f4719q);
            animator.removeListener(this);
            Fragment fragment = this.f4718n;
            View view = fragment.mView;
            if (view == null || !fragment.mHidden) {
                return;
            }
            view.setVisibility(8);
        }
    }

    class zy extends androidx.activity.zy {
        zy(boolean z2) {
            super(z2);
        }

        @Override // androidx.activity.zy
        /* JADX INFO: renamed from: n */
        public void mo21n() {
            FragmentManager.this.py();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4183a(@dd ArrayList<C0884k> arrayList, @dd ArrayList<Boolean> arrayList2) {
        int iIndexOf;
        int iIndexOf2;
        ArrayList<ki> arrayList3 = this.f51440eqxt;
        int size = arrayList3 == null ? 0 : arrayList3.size();
        int i2 = 0;
        while (i2 < size) {
            ki kiVar = this.f51440eqxt.get(i2);
            if (arrayList != null && !kiVar.f4709k && (iIndexOf2 = arrayList.indexOf(kiVar.f51466toq)) != -1 && arrayList2 != null && arrayList2.get(iIndexOf2).booleanValue()) {
                this.f51440eqxt.remove(i2);
                i2--;
                size--;
                kiVar.zy();
            } else if (kiVar.m4211n() || (arrayList != null && kiVar.f51466toq.vyq(arrayList, 0, arrayList.size()))) {
                this.f51440eqxt.remove(i2);
                i2--;
                size--;
                if (arrayList == null || kiVar.f4709k || (iIndexOf = arrayList.indexOf(kiVar.f51466toq)) == -1 || arrayList2 == null || !arrayList2.get(iIndexOf).booleanValue()) {
                    kiVar.m4212q();
                } else {
                    kiVar.zy();
                }
            }
            i2++;
        }
    }

    private void b9ub() {
        synchronized (this.f4690k) {
            if (this.f4690k.isEmpty()) {
                this.f4696y.m89s(xwq3() > 0 && sok(this.f4689i));
            } else {
                this.f4696y.m89s(true);
            }
        }
    }

    static int bap7(int i2) {
        if (i2 == 4097) {
            return 8194;
        }
        if (i2 != 4099) {
            return i2 != 8194 ? 0 : 4097;
        }
        return 4099;
    }

    private static void bf2(@lvui ArrayList<C0884k> arrayList, @lvui ArrayList<Boolean> arrayList2, int i2, int i3) {
        while (i2 < i3) {
            C0884k c0884k = arrayList.get(i2);
            if (arrayList2.get(i2).booleanValue()) {
                c0884k.ncyb(-1);
                c0884k.m4294c(i2 == i3 + (-1));
            } else {
                c0884k.ncyb(1);
                c0884k.m4295f();
            }
            i2++;
        }
    }

    private void bo() {
        if (f51435x9kr) {
            Iterator<d3> it = ni7().iterator();
            while (it.hasNext()) {
                it.next().ld6();
            }
        } else if (this.f51440eqxt != null) {
            while (!this.f51440eqxt.isEmpty()) {
                this.f51440eqxt.remove(0).m4212q();
            }
        }
    }

    private void bwp(@lvui androidx.collection.zy<Fragment> zyVar) {
        int size = zyVar.size();
        for (int i2 = 0; i2 < size; i2++) {
            Fragment fragmentLd6 = zyVar.ld6(i2);
            if (!fragmentLd6.mAdded) {
                View viewRequireView = fragmentLd6.requireView();
                fragmentLd6.mPostponedAlpha = viewRequireView.getAlpha();
                viewRequireView.setAlpha(0.0f);
            }
        }
    }

    private void fn3e() {
        if (w831()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    private Set<d3> fu4(@lvui ArrayList<C0884k> arrayList, int i2, int i3) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i2 < i3) {
            Iterator<o1t.C0889k> it = arrayList.get(i2).f51527zy.iterator();
            while (it.hasNext()) {
                Fragment fragment = it.next().f51529toq;
                if (fragment != null && (viewGroup = fragment.mContainer) != null) {
                    hashSet.add(d3.n7h(viewGroup, this));
                }
            }
            i2++;
        }
        return hashSet;
    }

    @dd
    static Fragment gbni(@lvui View view) {
        Object tag = view.getTag(C7422k.f7l8.f42848l);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    private void gcp(@lvui Fragment fragment) {
        ViewGroup viewGroupMu = mu(fragment);
        if (viewGroupMu == null || fragment.getEnterAnim() + fragment.getExitAnim() + fragment.getPopEnterAnim() + fragment.getPopExitAnim() <= 0) {
            return;
        }
        int i2 = C7422k.f7l8.f93697bo;
        if (viewGroupMu.getTag(i2) == null) {
            viewGroupMu.setTag(i2, fragment);
        }
        ((Fragment) viewGroupMu.getTag(i2)).setPopDirection(fragment.getPopDirection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v4 */
    /* JADX WARN: Type inference failed for: r17v0, types: [androidx.fragment.app.FragmentManager] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    private void i1(@lvui ArrayList<C0884k> arrayList, @lvui ArrayList<Boolean> arrayList2, int i2, int i3) {
        ?? r1;
        ?? r14;
        boolean z2;
        int i4;
        int i5;
        ArrayList<Boolean> arrayList3;
        int iWx16;
        ArrayList<Boolean> arrayList4;
        int i6;
        ?? r12;
        boolean z3 = arrayList.get(i2).f51519ki;
        ArrayList<Fragment> arrayList5 = this.f51456oc;
        if (arrayList5 == null) {
            this.f51456oc = new ArrayList<>();
        } else {
            arrayList5.clear();
        }
        this.f51456oc.addAll(this.f51463zy.kja0());
        Fragment fragmentG1 = g1();
        boolean z5 = false;
        for (int i7 = i2; i7 < i3; i7++) {
            C0884k c0884k = arrayList.get(i7);
            fragmentG1 = !arrayList2.get(i7).booleanValue() ? c0884k.lrht(this.f51456oc, fragmentG1) : c0884k.m4300o(this.f51456oc, fragmentG1);
            z5 = z5 || c0884k.f4853s;
        }
        this.f51456oc.clear();
        if (z3 || this.f51437cdj < 1) {
            r1 = 1;
        } else if (f51435x9kr) {
            for (int i8 = i2; i8 < i3; i8++) {
                Iterator<o1t.C0889k> it = arrayList.get(i8).f51527zy.iterator();
                while (it.hasNext()) {
                    Fragment fragment = it.next().f51529toq;
                    if (fragment != null && fragment.mFragmentManager != null) {
                        this.f51463zy.cdj(wvg(fragment));
                    }
                }
            }
            r1 = 1;
        } else {
            r1 = 1;
            C0894t.mcp(this.f51448ki.m4330g(), this.f51458t8r, arrayList, arrayList2, i2, i3, false, this.f51453n7h);
        }
        bf2(arrayList, arrayList2, i2, i3);
        if (f51435x9kr) {
            boolean zBooleanValue = arrayList2.get(i3 - 1).booleanValue();
            for (int i9 = i2; i9 < i3; i9++) {
                C0884k c0884k2 = arrayList.get(i9);
                if (zBooleanValue) {
                    for (int size = c0884k2.f51527zy.size() - r1; size >= 0; size--) {
                        Fragment fragment2 = c0884k2.f51527zy.get(size).f51529toq;
                        if (fragment2 != null) {
                            wvg(fragment2).qrj();
                        }
                    }
                } else {
                    Iterator<o1t.C0889k> it2 = c0884k2.f51527zy.iterator();
                    while (it2.hasNext()) {
                        Fragment fragment3 = it2.next().f51529toq;
                        if (fragment3 != null) {
                            wvg(fragment3).qrj();
                        }
                    }
                }
            }
            gc3c(this.f51437cdj, r1);
            for (d3 d3Var : fu4(arrayList, i2, i3)) {
                d3Var.ki(zBooleanValue);
                d3Var.m4248h();
                d3Var.f7l8();
            }
            i6 = i3;
            arrayList4 = arrayList2;
        } else {
            if (z3) {
                androidx.collection.zy zyVar = new androidx.collection.zy();
                m4193y(zyVar);
                r14 = r1;
                z2 = z3;
                i4 = i3;
                i5 = i2;
                arrayList3 = arrayList2;
                iWx16 = wx16(arrayList, arrayList2, i2, i3, zyVar);
                bwp(zyVar);
            } else {
                r14 = r1;
                z2 = z3;
                i4 = i3;
                i5 = i2;
                arrayList3 = arrayList2;
                iWx16 = i4;
            }
            if (iWx16 == i5 || !z2) {
                arrayList4 = arrayList3;
                i6 = i4;
            } else {
                if (this.f51437cdj >= r14) {
                    arrayList4 = arrayList3;
                    int i10 = iWx16;
                    i6 = i4;
                    r12 = r14;
                    C0894t.mcp(this.f51448ki.m4330g(), this.f51458t8r, arrayList, arrayList2, i2, i10, true, this.f51453n7h);
                } else {
                    arrayList4 = arrayList3;
                    i6 = i4;
                    r12 = r14;
                }
                gc3c(this.f51437cdj, r12);
            }
        }
        for (int i11 = i2; i11 < i6; i11++) {
            C0884k c0884k3 = arrayList.get(i11);
            if (arrayList4.get(i11).booleanValue() && c0884k3.f4820r >= 0) {
                c0884k3.f4820r = -1;
            }
            c0884k3.hb();
        }
        if (z5) {
            n2t();
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: j */
    public static void m4185j(boolean z2) {
        f4686r = z2;
    }

    /* JADX INFO: renamed from: m */
    private void m4186m() {
        if (f51435x9kr) {
            Iterator<d3> it = ni7().iterator();
            while (it.hasNext()) {
                it.next().m4250p();
            }
        } else {
            if (this.f51457qrj.isEmpty()) {
                return;
            }
            for (Fragment fragment : this.f51457qrj.keySet()) {
                t8r(fragment);
                zkd(fragment);
            }
        }
    }

    static boolean m4(int i2) {
        return f4686r || Log.isLoggable(f51433dd, i2);
    }

    private void m58i(RuntimeException runtimeException) {
        Log.e(f51433dd, runtimeException.getMessage());
        Log.e(f51433dd, "Activity state:");
        PrintWriter printWriter = new PrintWriter(new gvn7(f51433dd));
        AbstractC0893s<?> abstractC0893s = this.f51448ki;
        if (abstractC0893s != null) {
            try {
                abstractC0893s.mo4321y("  ", null, printWriter, new String[0]);
                throw runtimeException;
            } catch (Exception e2) {
                Log.e(f51433dd, "Failed dumping state", e2);
                throw runtimeException;
            }
        }
        try {
            hb("  ", null, printWriter, new String[0]);
            throw runtimeException;
        } catch (Exception e3) {
            Log.e(f51433dd, "Failed dumping state", e3);
            throw runtimeException;
        }
    }

    private ViewGroup mu(@lvui Fragment fragment) {
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (fragment.mContainerId > 0 && this.f51458t8r.mo4180q()) {
            View viewZy = this.f51458t8r.zy(fragment.mContainerId);
            if (viewZy instanceof ViewGroup) {
                return (ViewGroup) viewZy;
            }
        }
        return null;
    }

    private void n2t() {
        if (this.f51461x2 != null) {
            for (int i2 = 0; i2 < this.f51461x2.size(); i2++) {
                this.f51461x2.get(i2).onBackStackChanged();
            }
        }
    }

    private void ncyb(@dd Fragment fragment) {
        if (fragment == null || !fragment.equals(zp(fragment.mWho))) {
            return;
        }
        fragment.performPrimaryNavigationFragmentChanged();
    }

    private Set<d3> ni7() {
        HashSet hashSet = new HashSet();
        Iterator<zurt> it = this.f51463zy.x2().iterator();
        while (it.hasNext()) {
            ViewGroup viewGroup = it.next().ld6().mContainer;
            if (viewGroup != null) {
                hashSet.add(d3.kja0(viewGroup, was()));
            }
        }
        return hashSet;
    }

    private void nn86() {
        if (this.f51447jp0y) {
            this.f51447jp0y = false;
            o05();
        }
    }

    private void nsb(@lvui ArrayList<C0884k> arrayList, @lvui ArrayList<Boolean> arrayList2) {
        if (arrayList.isEmpty()) {
            return;
        }
        if (arrayList.size() != arrayList2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
        }
        m4183a(arrayList, arrayList2);
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            if (!arrayList.get(i2).f51519ki) {
                if (i3 != i2) {
                    i1(arrayList, arrayList2, i3, i2);
                }
                i3 = i2 + 1;
                if (arrayList2.get(i2).booleanValue()) {
                    while (i3 < size && arrayList2.get(i3).booleanValue() && !arrayList.get(i3).f51519ki) {
                        i3++;
                    }
                }
                i1(arrayList, arrayList2, i2, i3);
                i2 = i3 - 1;
            }
            i2++;
        }
        if (i3 != size) {
            i1(arrayList, arrayList2, i3, size);
        }
    }

    @ni7
    /* JADX INFO: renamed from: o */
    public static void m4188o(boolean z2) {
        f51435x9kr = z2;
    }

    private void o05() {
        Iterator<zurt> it = this.f51463zy.x2().iterator();
        while (it.hasNext()) {
            b3e(it.next());
        }
    }

    private void o1t(@lvui Fragment fragment) {
        Animator animator;
        if (fragment.mView != null) {
            C0888n.q qVarZy = C0888n.zy(this.f51448ki.m4330g(), fragment, !fragment.mHidden, fragment.getPopDirection());
            if (qVarZy == null || (animator = qVarZy.f51499toq) == null) {
                if (qVarZy != null) {
                    fragment.mView.startAnimation(qVarZy.f4835k);
                    qVarZy.f4835k.start();
                }
                fragment.mView.setVisibility((!fragment.mHidden || fragment.isHideReplaced()) ? 0 : 8);
                if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                }
            } else {
                animator.setTarget(fragment.mView);
                if (!fragment.mHidden) {
                    fragment.mView.setVisibility(0);
                } else if (fragment.isHideReplaced()) {
                    fragment.setHideReplaced(false);
                } else {
                    ViewGroup viewGroup = fragment.mContainer;
                    View view = fragment.mView;
                    viewGroup.startViewTransition(view);
                    qVarZy.f51499toq.addListener(new C0867y(viewGroup, view, fragment));
                }
                qVarZy.f51499toq.start();
            }
        }
        ltg8(fragment);
        fragment.mHiddenChanged = false;
        fragment.onHiddenChanged(fragment.mHidden);
    }

    /* JADX INFO: renamed from: t */
    private void m4189t(@lvui Fragment fragment) {
        fragment.performDestroyView();
        this.f51449kja0.n7h(fragment, false);
        fragment.mContainer = null;
        fragment.mView = null;
        fragment.mViewLifecycleOwner = null;
        fragment.mViewLifecycleOwnerLiveData.cdj(null);
        fragment.mInLayout = false;
    }

    @lvui
    static FragmentManager t8iq(@lvui View view) {
        Fragment fragmentM4190u = m4190u(view);
        if (fragmentM4190u != null) {
            if (fragmentM4190u.isAdded()) {
                return fragmentM4190u.getChildFragmentManager();
            }
            throw new IllegalStateException("The Fragment " + fragmentM4190u + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
        Context context = view.getContext();
        ActivityC0891q activityC0891q = null;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                break;
            }
            if (context instanceof ActivityC0891q) {
                activityC0891q = (ActivityC0891q) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        if (activityC0891q != null) {
            return activityC0891q.getSupportFragmentManager();
        }
        throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
    }

    private void t8r(@lvui Fragment fragment) {
        HashSet<androidx.core.os.zy> hashSet = this.f51457qrj.get(fragment);
        if (hashSet != null) {
            Iterator<androidx.core.os.zy> it = hashSet.iterator();
            while (it.hasNext()) {
                it.next().m2780k();
            }
            hashSet.clear();
            m4189t(fragment);
            this.f51457qrj.remove(fragment);
        }
    }

    @dd
    /* JADX INFO: renamed from: u */
    private static Fragment m4190u(@lvui View view) {
        while (view != null) {
            Fragment fragmentGbni = gbni(view);
            if (fragmentGbni != null) {
                return fragmentGbni;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        return null;
    }

    private void uv6(int i2) {
        try {
            this.f51459toq = true;
            this.f51463zy.m4364q(i2);
            gc3c(i2, false);
            if (f51435x9kr) {
                Iterator<d3> it = ni7().iterator();
                while (it.hasNext()) {
                    it.next().m4250p();
                }
            }
            this.f51459toq = false;
            y9n(true);
        } catch (Throwable th) {
            this.f51459toq = false;
            throw th;
        }
    }

    @lvui
    /* JADX INFO: renamed from: v */
    private androidx.fragment.app.cdj m4191v(@lvui Fragment fragment) {
        return this.f51438d2ok.m4237c(fragment);
    }

    private boolean v0af(@lvui Fragment fragment) {
        return (fragment.mHasMenu && fragment.mMenuVisible) || fragment.mChildFragmentManager.m4200i();
    }

    private int wx16(@lvui ArrayList<C0884k> arrayList, @lvui ArrayList<Boolean> arrayList2, int i2, int i3, @lvui androidx.collection.zy<Fragment> zyVar) {
        int i4 = i3;
        for (int i5 = i3 - 1; i5 >= i2; i5--) {
            C0884k c0884k = arrayList.get(i5);
            boolean zBooleanValue = arrayList2.get(i5).booleanValue();
            if (c0884k.nn86() && !c0884k.vyq(arrayList, i5 + 1, i3)) {
                if (this.f51440eqxt == null) {
                    this.f51440eqxt = new ArrayList<>();
                }
                ki kiVar = new ki(c0884k, zBooleanValue);
                this.f51440eqxt.add(kiVar);
                c0884k.m4298j(kiVar);
                if (zBooleanValue) {
                    c0884k.m4295f();
                } else {
                    c0884k.m4294c(false);
                }
                i4--;
                if (i5 != i4) {
                    arrayList.remove(i5);
                    arrayList.add(i4, c0884k);
                }
                m4193y(zyVar);
            }
        }
        return i4;
    }

    @lvui
    /* JADX INFO: renamed from: x */
    public static <F extends Fragment> F m4192x(@lvui View view) {
        F f2 = (F) m4190u(view);
        if (f2 != null) {
            return f2;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    /* JADX INFO: renamed from: y */
    private void m4193y(@lvui androidx.collection.zy<Fragment> zyVar) {
        int i2 = this.f51437cdj;
        if (i2 < 1) {
            return;
        }
        int iMin = Math.min(i2, 5);
        for (Fragment fragment : this.f51463zy.kja0()) {
            if (fragment.mState < iMin) {
                bz2(fragment, iMin);
                if (fragment.mView != null && !fragment.mHidden && fragment.mIsNewlyAdded) {
                    zyVar.add(fragment);
                }
            }
        }
    }

    private boolean y2(@lvui ArrayList<C0884k> arrayList, @lvui ArrayList<Boolean> arrayList2) {
        synchronized (this.f4690k) {
            if (this.f4690k.isEmpty()) {
                return false;
            }
            int size = this.f4690k.size();
            boolean zMo4209k = false;
            for (int i2 = 0; i2 < size; i2++) {
                zMo4209k |= this.f4690k.get(i2).mo4209k(arrayList, arrayList2);
            }
            this.f4690k.clear();
            this.f51448ki.f7l8().removeCallbacks(this.f51451lvui);
            return zMo4209k;
        }
    }

    private boolean yl(@dd String str, int i2, int i3) {
        y9n(false);
        yz(true);
        Fragment fragment = this.f51442fn3e;
        if (fragment != null && i2 < 0 && str == null && fragment.getChildFragmentManager().vep5()) {
            return true;
        }
        boolean zUc = uc(this.f51445gvn7, this.f51439d3, str, i2, i3);
        if (zUc) {
            this.f51459toq = true;
            try {
                nsb(this.f51445gvn7, this.f51439d3);
            } finally {
                zurt();
            }
        }
        b9ub();
        nn86();
        this.f51463zy.toq();
        return zUc;
    }

    private void yz(boolean z2) {
        if (this.f51459toq) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        }
        if (this.f51448ki == null) {
            if (!this.f51443fti) {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
            throw new IllegalStateException("FragmentManager has been destroyed");
        }
        if (Looper.myLooper() != this.f51448ki.f7l8().getLooper()) {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
        if (!z2) {
            fn3e();
        }
        if (this.f51445gvn7 == null) {
            this.f51445gvn7 = new ArrayList<>();
            this.f51439d3 = new ArrayList<>();
        }
        this.f51459toq = true;
        try {
            m4183a(null, null);
        } finally {
            this.f51459toq = false;
        }
    }

    private void zurt() {
        this.f51459toq = false;
        this.f51439d3.clear();
        this.f51445gvn7.clear();
    }

    void a5id(@dd Fragment fragment) {
        if (fragment == null || (fragment.equals(zp(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this))) {
            Fragment fragment2 = this.f51442fn3e;
            this.f51442fn3e = fragment;
            ncyb(fragment2);
            ncyb(this.f51442fn3e);
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void a9() {
        this.f51446jk = false;
        this.f51436a9 = false;
        this.f51438d2ok.m4242o(false);
        uv6(0);
    }

    public boolean a98o() {
        boolean zY9n = y9n(true);
        bo();
        return zY9n;
    }

    /* JADX INFO: renamed from: b */
    void m4194b(@lvui InterfaceC0861h interfaceC0861h, boolean z2) {
        if (z2 && (this.f51448ki == null || this.f51443fti)) {
            return;
        }
        yz(z2);
        if (interfaceC0861h.mo4209k(this.f51445gvn7, this.f51439d3)) {
            this.f51459toq = true;
            try {
                nsb(this.f51445gvn7, this.f51439d3);
            } finally {
                zurt();
            }
        }
        b9ub();
        nn86();
        this.f51463zy.toq();
    }

    void b3e(@lvui zurt zurtVar) {
        Fragment fragmentLd6 = zurtVar.ld6();
        if (fragmentLd6.mDeferStart) {
            if (this.f51459toq) {
                this.f51447jp0y = true;
                return;
            }
            fragmentLd6.mDeferStart = false;
            if (f51435x9kr) {
                zurtVar.qrj();
            } else {
                zkd(fragmentLd6);
            }
        }
    }

    public void bek6() {
        ek5k(new cdj(null, -1, 0), false);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0160  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void bz2(@zy.lvui androidx.fragment.app.Fragment r11, int r12) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.bz2(androidx.fragment.app.Fragment, int):void");
    }

    /* JADX INFO: renamed from: c */
    void m4195c() {
        this.f51446jk = false;
        this.f51436a9 = false;
        this.f51438d2ok.m4242o(false);
        uv6(7);
    }

    int c8jq() {
        return this.f51463zy.ld6();
    }

    void cdj(@lvui Fragment fragment) {
        if (m4(2)) {
            Log.v(f51433dd, "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (fragment.mAdded) {
                return;
            }
            this.f51463zy.m4361k(fragment);
            if (m4(2)) {
                Log.v(f51433dd, "add from attach: " + fragment);
            }
            if (v0af(fragment)) {
                this.f51452mcp = true;
            }
        }
    }

    boolean cfr(int i2) {
        return this.f51437cdj >= i2;
    }

    @dd
    public Fragment ch(@InterfaceC7843t int i2) {
        return this.f51463zy.f7l8(i2);
    }

    public void cnbm(@lvui qrj qrjVar) {
        this.f51449kja0.m4323h(qrjVar);
    }

    public void cv06(int i2, int i3) {
        if (i2 >= 0) {
            ek5k(new cdj(null, i2, i3), false);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    @dd
    /* JADX INFO: renamed from: d */
    public Fragment m4196d(@lvui Bundle bundle, @lvui String str) {
        String string = bundle.getString(str);
        if (string == null) {
            return null;
        }
        Fragment fragmentZp = zp(string);
        if (fragmentZp == null) {
            m58i(new IllegalStateException("Fragment no longer exists for key " + str + ": unique id " + string));
        }
        return fragmentZp;
    }

    void d2ok() {
        for (Fragment fragment : this.f51463zy.kja0()) {
            if (fragment != null) {
                fragment.performLowMemory();
            }
        }
    }

    boolean d3(@lvui Menu menu, @lvui MenuInflater menuInflater) {
        if (this.f51437cdj < 1) {
            return false;
        }
        ArrayList<Fragment> arrayList = null;
        boolean z2 = false;
        for (Fragment fragment : this.f51463zy.kja0()) {
            if (fragment != null && etdu(fragment) && fragment.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(fragment);
                z2 = true;
            }
        }
        if (this.f4691n != null) {
            for (int i2 = 0; i2 < this.f4691n.size(); i2++) {
                Fragment fragment2 = this.f4691n.get(i2);
                if (arrayList == null || !arrayList.contains(fragment2)) {
                    fragment2.onDestroyOptionsMenu();
                }
            }
        }
        this.f4691n = arrayList;
        return z2;
    }

    @dd
    Fragment d8wk() {
        return this.f4689i;
    }

    boolean dd(@lvui MenuItem menuItem) {
        if (this.f51437cdj < 1) {
            return false;
        }
        for (Fragment fragment : this.f51463zy.kja0()) {
            if (fragment != null && fragment.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: do, reason: not valid java name */
    public void m28244do(@lvui qrj qrjVar, boolean z2) {
        this.f51449kja0.kja0(qrjVar, z2);
    }

    @lvui
    public ld6 dr(int i2) {
        return this.f4693q.get(i2);
    }

    public void dxef(@lvui C0903y c0903y) {
        this.f51462zurt = c0903y;
    }

    /* JADX INFO: renamed from: e */
    void m4197e() {
        uv6(2);
    }

    void e5(@lvui Fragment fragment, boolean z2) {
        ViewGroup viewGroupMu = mu(fragment);
        if (viewGroupMu == null || !(viewGroupMu instanceof FragmentContainerView)) {
            return;
        }
        ((FragmentContainerView) viewGroupMu).setDrawDisappearingViewsLast(!z2);
    }

    void ebn(@lvui Fragment fragment) {
        if (m4(2)) {
            Log.v(f51433dd, "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean z2 = !fragment.isInBackStack();
        if (!fragment.mDetached || z2) {
            this.f51463zy.m4360i(fragment);
            if (v0af(fragment)) {
                this.f51452mcp = true;
            }
            fragment.mRemoving = true;
            gcp(fragment);
        }
    }

    void ek5k(@lvui InterfaceC0861h interfaceC0861h, boolean z2) {
        if (!z2) {
            if (this.f51448ki == null) {
                if (!this.f51443fti) {
                    throw new IllegalStateException("FragmentManager has not been attached to a host.");
                }
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            fn3e();
        }
        synchronized (this.f4690k) {
            if (this.f51448ki == null) {
                if (!z2) {
                    throw new IllegalStateException("Activity has been destroyed");
                }
            } else {
                this.f4690k.add(interfaceC0861h);
                ga();
            }
        }
    }

    void eqxt() {
        uv6(1);
    }

    boolean etdu(@dd Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        return fragment.isMenuVisible();
    }

    /* JADX INFO: renamed from: f */
    void m4198f() {
        b9ub();
        ncyb(this.f51442fn3e);
    }

    @lvui
    public List<Fragment> fnq8() {
        return this.f51463zy.kja0();
    }

    void fti(@lvui Configuration configuration) {
        for (Fragment fragment : this.f51463zy.kja0()) {
            if (fragment != null) {
                fragment.performConfigurationChanged(configuration);
            }
        }
    }

    @dd
    public Fragment g1() {
        return this.f51442fn3e;
    }

    void ga() {
        synchronized (this.f4690k) {
            ArrayList<ki> arrayList = this.f51440eqxt;
            boolean z2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
            boolean z3 = this.f4690k.size() == 1;
            if (z2 || z3) {
                this.f51448ki.f7l8().removeCallbacks(this.f51451lvui);
                this.f51448ki.f7l8().post(this.f51451lvui);
                b9ub();
            }
        }
    }

    void gc3c(int i2, boolean z2) {
        AbstractC0893s<?> abstractC0893s;
        if (this.f51448ki == null && i2 != -1) {
            throw new IllegalStateException("No activity");
        }
        if (z2 || i2 != this.f51437cdj) {
            this.f51437cdj = i2;
            if (f51435x9kr) {
                this.f51463zy.t8r();
            } else {
                Iterator<Fragment> it = this.f51463zy.kja0().iterator();
                while (it.hasNext()) {
                    se(it.next());
                }
                for (zurt zurtVar : this.f51463zy.x2()) {
                    Fragment fragmentLd6 = zurtVar.ld6();
                    if (!fragmentLd6.mIsNewlyAdded) {
                        se(fragmentLd6);
                    }
                    if (fragmentLd6.mRemoving && !fragmentLd6.isInBackStack()) {
                        this.f51463zy.ki(zurtVar);
                    }
                }
            }
            o05();
            if (this.f51452mcp && (abstractC0893s = this.f51448ki) != null && this.f51437cdj == 7) {
                abstractC0893s.t8r();
                this.f51452mcp = false;
            }
        }
    }

    void gvn7() {
        this.f51446jk = false;
        this.f51436a9 = false;
        this.f51438d2ok.m4242o(false);
        uv6(1);
    }

    @lvui
    List<Fragment> gyi() {
        return this.f51463zy.qrj();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SyntheticAccessor"})
    /* JADX INFO: renamed from: h */
    void m4199h(@lvui AbstractC0893s<?> abstractC0893s, @lvui AbstractC0879g abstractC0879g, @dd Fragment fragment) {
        String str;
        if (this.f51448ki != null) {
            throw new IllegalStateException("Already attached");
        }
        this.f51448ki = abstractC0893s;
        this.f51458t8r = abstractC0879g;
        this.f4689i = fragment;
        if (fragment != null) {
            x2(new C0866s(fragment));
        } else if (abstractC0893s instanceof androidx.fragment.app.ki) {
            x2((androidx.fragment.app.ki) abstractC0893s);
        }
        if (this.f4689i != null) {
            b9ub();
        }
        if (abstractC0893s instanceof InterfaceC0051n) {
            InterfaceC0051n interfaceC0051n = (InterfaceC0051n) abstractC0893s;
            OnBackPressedDispatcher onBackPressedDispatcher = interfaceC0051n.getOnBackPressedDispatcher();
            this.f51441f7l8 = onBackPressedDispatcher;
            InterfaceC0954z interfaceC0954z = interfaceC0051n;
            if (fragment != null) {
                interfaceC0954z = fragment;
            }
            onBackPressedDispatcher.toq(interfaceC0954z, this.f4696y);
        }
        if (fragment != null) {
            this.f51438d2ok = fragment.mFragmentManager.m4191v(fragment);
        } else if (abstractC0893s instanceof InterfaceC0931j) {
            this.f51438d2ok = androidx.fragment.app.cdj.lrht(((InterfaceC0931j) abstractC0893s).getViewModelStore());
        } else {
            this.f51438d2ok = new androidx.fragment.app.cdj(false);
        }
        this.f51438d2ok.m4242o(w831());
        this.f51463zy.m4367z(this.f51438d2ok);
        Object obj = this.f51448ki;
        if (obj instanceof InterfaceC0071y) {
            ActivityResultRegistry activityResultRegistry = ((InterfaceC0071y) obj).getActivityResultRegistry();
            if (fragment != null) {
                str = fragment.mWho + ":";
            } else {
                str = "";
            }
            String str2 = "FragmentManager:" + str;
            this.f4697z = activityResultRegistry.m28s(str2 + "StartActivityForResult", new toq.C0063p(), new C0864p());
            this.f51455o1t = activityResultRegistry.m28s(str2 + "StartIntentSenderForResult", new x2(), new C0862k());
            this.f51460wvg = activityResultRegistry.m28s(str2 + "RequestPermissions", new toq.C0066y(), new toq());
        }
    }

    Parcelable h4b() {
        int size;
        bo();
        m4186m();
        y9n(true);
        this.f51446jk = true;
        this.f51438d2ok.m4242o(true);
        ArrayList<FragmentState> arrayListNi7 = this.f51463zy.ni7();
        BackStackState[] backStackStateArr = null;
        if (arrayListNi7.isEmpty()) {
            if (m4(2)) {
                Log.v(f51433dd, "saveAllState: no fragments!");
            }
            return null;
        }
        ArrayList<String> arrayListFu4 = this.f51463zy.fu4();
        ArrayList<C0884k> arrayList = this.f4693q;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            backStackStateArr = new BackStackState[size];
            for (int i2 = 0; i2 < size; i2++) {
                backStackStateArr[i2] = new BackStackState(this.f4693q.get(i2));
                if (m4(2)) {
                    Log.v(f51433dd, "saveAllState: adding back stack #" + i2 + ": " + this.f4693q.get(i2));
                }
            }
        }
        FragmentManagerState fragmentManagerState = new FragmentManagerState();
        fragmentManagerState.f4722k = arrayListNi7;
        fragmentManagerState.f4725q = arrayListFu4;
        fragmentManagerState.f4723n = backStackStateArr;
        fragmentManagerState.f4720g = this.f4694s.get();
        Fragment fragment = this.f51442fn3e;
        if (fragment != null) {
            fragmentManagerState.f4727y = fragment.mWho;
        }
        fragmentManagerState.f4726s.addAll(this.f4692p.keySet());
        fragmentManagerState.f4724p.addAll(this.f4692p.values());
        fragmentManagerState.f4721h = new ArrayList<>(this.f4695t);
        return fragmentManagerState;
    }

    public void h7am(@dd String str, int i2) {
        ek5k(new cdj(str, -1, i2), false);
    }

    public void hb(@lvui String str, @dd FileDescriptor fileDescriptor, @lvui PrintWriter printWriter, @dd String[] strArr) {
        int size;
        int size2;
        String str2 = str + "    ";
        this.f51463zy.m4362n(str, fileDescriptor, printWriter, strArr);
        ArrayList<Fragment> arrayList = this.f4691n;
        if (arrayList != null && (size2 = arrayList.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size2; i2++) {
                Fragment fragment = this.f4691n.get(i2);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(fragment.toString());
            }
        }
        ArrayList<C0884k> arrayList2 = this.f4693q;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size; i3++) {
                C0884k c0884k = this.f4693q.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(c0884k.toString());
                c0884k.n5r1(str2, printWriter);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.f4694s.get());
        synchronized (this.f4690k) {
            int size3 = this.f4690k.size();
            if (size3 > 0) {
                printWriter.print(str);
                printWriter.println("Pending Actions:");
                for (int i4 = 0; i4 < size3; i4++) {
                    InterfaceC0861h interfaceC0861h = this.f4690k.get(i4);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(i4);
                    printWriter.print(": ");
                    printWriter.println(interfaceC0861h);
                }
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.f51448ki);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.f51458t8r);
        if (this.f4689i != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.f4689i);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.f51437cdj);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.f51446jk);
        printWriter.print(" mStopped=");
        printWriter.print(this.f51436a9);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.f51443fti);
        if (this.f51452mcp) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.f51452mcp);
        }
    }

    boolean hyr(@lvui Menu menu) {
        boolean z2 = false;
        if (this.f51437cdj < 1) {
            return false;
        }
        for (Fragment fragment : this.f51463zy.kja0()) {
            if (fragment != null && etdu(fragment) && fragment.performPrepareOptionsMenu(menu)) {
                z2 = true;
            }
        }
        return z2;
    }

    /* JADX INFO: renamed from: i */
    boolean m4200i() {
        boolean zV0af = false;
        for (Fragment fragment : this.f51463zy.qrj()) {
            if (fragment != null) {
                zV0af = v0af(fragment);
            }
            if (zV0af) {
                return true;
            }
        }
        return false;
    }

    void i9jn(@lvui Fragment fragment) {
        if (m4(2)) {
            Log.v(f51433dd, "hide: " + fragment);
        }
        if (fragment.mHidden) {
            return;
        }
        fragment.mHidden = true;
        fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
        gcp(fragment);
    }

    public void ij(@lvui kja0 kja0Var) {
        ArrayList<kja0> arrayList = this.f51461x2;
        if (arrayList != null) {
            arrayList.remove(kja0Var);
        }
    }

    @lvui
    AbstractC0879g ikck() {
        return this.f51458t8r;
    }

    public void ixz(@lvui Bundle bundle, @lvui String str, @lvui Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            m58i(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(str, fragment.mWho);
    }

    public boolean jbh(@dd String str, int i2) {
        return yl(str, -1, i2);
    }

    void jk() {
        this.f51446jk = false;
        this.f51436a9 = false;
        this.f51438d2ok.m4242o(false);
        uv6(4);
    }

    boolean jp0y(@lvui MenuItem menuItem) {
        if (this.f51437cdj < 1) {
            return false;
        }
        for (Fragment fragment : this.f51463zy.kja0()) {
            if (fragment != null && fragment.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    void jz5(@lvui FragmentContainerView fragmentContainerView) {
        View view;
        for (zurt zurtVar : this.f51463zy.x2()) {
            Fragment fragmentLd6 = zurtVar.ld6();
            if (fragmentLd6.mContainerId == fragmentContainerView.getId() && (view = fragmentLd6.mView) != null && view.getParent() == null) {
                fragmentLd6.mContainer = fragmentContainerView;
                zurtVar.toq();
            }
        }
    }

    @Override // androidx.fragment.app.fn3e
    /* JADX INFO: renamed from: k */
    public final void mo4201k(@lvui String str, @lvui Bundle bundle) {
        n7h n7hVar = this.f51450ld6.get(str);
        if (n7hVar == null || !n7hVar.toq(kja0.zy.STARTED)) {
            this.f4692p.put(str, bundle);
        } else {
            n7hVar.mo4214k(str, bundle);
        }
    }

    void kcsr(@lvui Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, @dd Intent intent, int i3, int i4, int i5, @dd Bundle bundle) throws IntentSender.SendIntentException {
        Intent intent2;
        if (this.f51455o1t == null) {
            this.f51448ki.ki(fragment, intentSender, i2, intent, i3, i4, i5, bundle);
            return;
        }
        if (bundle != null) {
            if (intent == null) {
                intent2 = new Intent();
                intent2.putExtra(f4685l, true);
            } else {
                intent2 = intent;
            }
            if (m4(2)) {
                Log.v(f51433dd, "ActivityOptions " + bundle + " were added to fillInIntent " + intent2 + " for fragment " + fragment);
            }
            intent2.putExtra(toq.C0063p.f129k, bundle);
        } else {
            intent2 = intent;
        }
        IntentSenderRequest intentSenderRequestM35k = new IntentSenderRequest.C0058k(intentSender).toq(intent2).zy(i4, i3).m35k();
        this.f4695t.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (m4(2)) {
            Log.v(f51433dd, "Fragment " + fragment + "is launching an IntentSender for result ");
        }
        this.f51455o1t.toq(intentSenderRequestM35k);
    }

    @lvui
    public o1t ki() {
        return new C0884k(this);
    }

    int kja0() {
        return this.f4694s.getAndIncrement();
    }

    @lvui
    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public o1t ktq() {
        return ki();
    }

    /* JADX INFO: renamed from: l */
    void m4202l() {
        uv6(5);
    }

    zurt ld6(@lvui Fragment fragment) {
        if (m4(2)) {
            Log.v(f51433dd, "add: " + fragment);
        }
        zurt zurtVarWvg = wvg(fragment);
        fragment.mFragmentManager = this;
        this.f51463zy.cdj(zurtVarWvg);
        if (!fragment.mDetached) {
            this.f51463zy.m4361k(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (v0af(fragment)) {
                this.f51452mcp = true;
            }
        }
        return zurtVarWvg;
    }

    @Deprecated
    C0880h lh() {
        if (this.f51448ki instanceof InterfaceC0931j) {
            m58i(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.f51438d2ok.vyq();
    }

    void lrht() {
        this.f51446jk = false;
        this.f51436a9 = false;
        this.f51438d2ok.m4242o(false);
        uv6(5);
    }

    void ltg8(@lvui Fragment fragment) {
        if (fragment.mAdded && v0af(fragment)) {
            this.f51452mcp = true;
        }
    }

    Fragment lv5(@lvui String str) {
        return this.f51463zy.m4365s(str);
    }

    void lvui(boolean z2) {
        for (Fragment fragment : this.f51463zy.kja0()) {
            if (fragment != null) {
                fragment.performMultiWindowModeChanged(z2);
            }
        }
    }

    void lw(@lvui oc ocVar) {
        this.mSpecialEffectsControllerFactory = ocVar;
    }

    public boolean mbx(int i2, int i3) {
        if (i2 >= 0) {
            return yl(null, i2, i3);
        }
        throw new IllegalArgumentException("Bad id: " + i2);
    }

    void mcp(@lvui Fragment fragment) {
        if (m4(2)) {
            Log.v(f51433dd, "detach: " + fragment);
        }
        if (fragment.mDetached) {
            return;
        }
        fragment.mDetached = true;
        if (fragment.mAdded) {
            if (m4(2)) {
                Log.v(f51433dd, "remove from detach: " + fragment);
            }
            this.f51463zy.m4360i(fragment);
            if (v0af(fragment)) {
                this.f51452mcp = true;
            }
            gcp(fragment);
        }
    }

    void n5r1(boolean z2) {
        for (Fragment fragment : this.f51463zy.kja0()) {
            if (fragment != null) {
                fragment.performPictureInPictureModeChanged(z2);
            }
        }
    }

    void n7h(@lvui Fragment fragment) {
        this.f51438d2ok.n5r1(fragment);
    }

    void ngy(@dd Parcelable parcelable) {
        zurt zurtVar;
        if (parcelable == null) {
            return;
        }
        FragmentManagerState fragmentManagerState = (FragmentManagerState) parcelable;
        if (fragmentManagerState.f4722k == null) {
            return;
        }
        this.f51463zy.fn3e();
        for (FragmentState fragmentState : fragmentManagerState.f4722k) {
            if (fragmentState != null) {
                Fragment fragmentM4239f = this.f51438d2ok.m4239f(fragmentState.f4735q);
                if (fragmentM4239f != null) {
                    if (m4(2)) {
                        Log.v(f51433dd, "restoreSaveState: re-attaching retained " + fragmentM4239f);
                    }
                    zurtVar = new zurt(this.f51449kja0, this.f51463zy, fragmentM4239f, fragmentState);
                } else {
                    zurtVar = new zurt(this.f51449kja0, this.f51463zy, this.f51448ki.m4330g().getClassLoader(), vq(), fragmentState);
                }
                Fragment fragmentLd6 = zurtVar.ld6();
                fragmentLd6.mFragmentManager = this;
                if (m4(2)) {
                    Log.v(f51433dd, "restoreSaveState: active (" + fragmentLd6.mWho + "): " + fragmentLd6);
                }
                zurtVar.kja0(this.f51448ki.m4330g().getClassLoader());
                this.f51463zy.cdj(zurtVar);
                zurtVar.fn3e(this.f51437cdj);
            }
        }
        for (Fragment fragment : this.f51438d2ok.uv6()) {
            if (!this.f51463zy.zy(fragment.mWho)) {
                if (m4(2)) {
                    Log.v(f51433dd, "Discarding retained Fragment " + fragment + " that was not found in the set of active Fragments " + fragmentManagerState.f4722k);
                }
                this.f51438d2ok.hb(fragment);
                fragment.mFragmentManager = this;
                zurt zurtVar2 = new zurt(this.f51449kja0, this.f51463zy, fragment);
                zurtVar2.fn3e(1);
                zurtVar2.qrj();
                fragment.mRemoving = true;
                zurtVar2.qrj();
            }
        }
        this.f51463zy.zurt(fragmentManagerState.f4725q);
        if (fragmentManagerState.f4723n != null) {
            this.f4693q = new ArrayList<>(fragmentManagerState.f4723n.length);
            int i2 = 0;
            while (true) {
                BackStackState[] backStackStateArr = fragmentManagerState.f4723n;
                if (i2 >= backStackStateArr.length) {
                    break;
                }
                C0884k c0884kM4174k = backStackStateArr[i2].m4174k(this);
                if (m4(2)) {
                    Log.v(f51433dd, "restoreAllState: back stack #" + i2 + " (index " + c0884kM4174k.f4820r + "): " + c0884kM4174k);
                    PrintWriter printWriter = new PrintWriter(new gvn7(f51433dd));
                    c0884kM4174k.hyr("  ", printWriter, false);
                    printWriter.close();
                }
                this.f4693q.add(c0884kM4174k);
                i2++;
            }
        } else {
            this.f4693q = null;
        }
        this.f4694s.set(fragmentManagerState.f4720g);
        String str = fragmentManagerState.f4727y;
        if (str != null) {
            Fragment fragmentZp = zp(str);
            this.f51442fn3e = fragmentZp;
            ncyb(fragmentZp);
        }
        ArrayList<String> arrayList = fragmentManagerState.f4726s;
        if (arrayList != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                Bundle bundle = fragmentManagerState.f4724p.get(i3);
                bundle.setClassLoader(this.f51448ki.m4330g().getClassLoader());
                this.f4692p.put(arrayList.get(i3), bundle);
            }
        }
        this.f4695t = new ArrayDeque<>(fragmentManagerState.f4721h);
    }

    @dd
    public Fragment nmn5(@dd String str) {
        return this.f51463zy.m4366y(str);
    }

    void oc() {
        this.f51443fti = true;
        y9n(true);
        m4186m();
        uv6(-1);
        this.f51448ki = null;
        this.f51458t8r = null;
        this.f4689i = null;
        if (this.f51441f7l8 != null) {
            this.f4696y.f7l8();
            this.f51441f7l8 = null;
        }
        AbstractC0067g<Intent> abstractC0067g = this.f4697z;
        if (abstractC0067g != null) {
            abstractC0067g.mo31q();
            this.f51455o1t.mo31q();
            this.f51460wvg.mo31q();
        }
    }

    void oki(@lvui Fragment fragment) {
        if (m4(2)) {
            Log.v(f51433dd, "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* JADX INFO: renamed from: p */
    void m4203p(@lvui Fragment fragment, @lvui androidx.core.os.zy zyVar) {
        if (this.f51457qrj.get(fragment) == null) {
            this.f51457qrj.put(fragment, new HashSet<>());
        }
        this.f51457qrj.get(fragment).add(zyVar);
    }

    public void pc(@lvui androidx.fragment.app.ki kiVar) {
        this.f4688h.remove(kiVar);
    }

    void pjz9(@dd Parcelable parcelable, @dd C0880h c0880h) {
        if (this.f51448ki instanceof InterfaceC0931j) {
            m58i(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.f51438d2ok.m4240j(c0880h);
        ngy(parcelable);
    }

    void py() {
        y9n(true);
        if (this.f4696y.m87g()) {
            vep5();
        } else {
            this.f51441f7l8.m13n();
        }
    }

    @Override // androidx.fragment.app.fn3e
    /* JADX INFO: renamed from: q */
    public final void mo4204q(@lvui String str) {
        this.f4692p.remove(str);
    }

    @lvui
    C0904z qkj8() {
        return this.f51463zy;
    }

    @lvui
    AbstractC0893s<?> qo() {
        return this.f51448ki;
    }

    public void qrj(@lvui kja0 kja0Var) {
        if (this.f51461x2 == null) {
            this.f51461x2 = new ArrayList<>();
        }
        this.f51461x2.add(kja0Var);
    }

    /* JADX INFO: renamed from: r */
    void m4205r(@lvui Fragment fragment) {
        Iterator<androidx.fragment.app.ki> it = this.f4688h.iterator();
        while (it.hasNext()) {
            it.next().mo4223k(this, fragment);
        }
    }

    public boolean r8s8() {
        return this.f51443fti;
    }

    /* JADX INFO: renamed from: s */
    void m4206s(C0884k c0884k) {
        if (this.f4693q == null) {
            this.f4693q = new ArrayList<>();
        }
        this.f4693q.add(c0884k);
    }

    void se(@lvui Fragment fragment) {
        if (!this.f51463zy.zy(fragment.mWho)) {
            if (m4(3)) {
                Log.d(f51433dd, "Ignoring moving " + fragment + " to state " + this.f51437cdj + "since it is not added to " + this);
                return;
            }
            return;
        }
        zkd(fragment);
        View view = fragment.mView;
        if (view != null && fragment.mIsNewlyAdded && fragment.mContainer != null) {
            float f2 = fragment.mPostponedAlpha;
            if (f2 > 0.0f) {
                view.setAlpha(f2);
            }
            fragment.mPostponedAlpha = 0.0f;
            fragment.mIsNewlyAdded = false;
            C0888n.q qVarZy = C0888n.zy(this.f51448ki.m4330g(), fragment, true, fragment.getPopDirection());
            if (qVarZy != null) {
                Animation animation = qVarZy.f4835k;
                if (animation != null) {
                    fragment.mView.startAnimation(animation);
                } else {
                    qVarZy.f51499toq.setTarget(fragment.mView);
                    qVarZy.f51499toq.start();
                }
            }
        }
        if (fragment.mHiddenChanged) {
            o1t(fragment);
        }
    }

    boolean sok(@dd Fragment fragment) {
        if (fragment == null) {
            return true;
        }
        FragmentManager fragmentManager = fragment.mFragmentManager;
        return fragment.equals(fragmentManager.g1()) && sok(fragmentManager.f4689i);
    }

    @lvui
    LayoutInflater.Factory2 tfm() {
        return this.f4687g;
    }

    @lvui
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        Fragment fragment = this.f4689i;
        if (fragment != null) {
            sb.append(fragment.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.f4689i)));
            sb.append("}");
        } else {
            AbstractC0893s<?> abstractC0893s = this.f51448ki;
            if (abstractC0893s != null) {
                sb.append(abstractC0893s.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.f51448ki)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.fragment.app.fn3e
    @SuppressLint({"SyntheticAccessor"})
    public final void toq(@lvui final String str, @lvui InterfaceC0954z interfaceC0954z, @lvui final InterfaceC0881i interfaceC0881i) {
        final androidx.lifecycle.kja0 lifecycle = interfaceC0954z.getLifecycle();
        if (lifecycle.toq() == kja0.zy.DESTROYED) {
            return;
        }
        androidx.lifecycle.fn3e fn3eVar = new androidx.lifecycle.fn3e() { // from class: androidx.fragment.app.FragmentManager.6
            @Override // androidx.lifecycle.fn3e
            public void gvn7(@lvui InterfaceC0954z interfaceC0954z2, @lvui kja0.toq toqVar) {
                Bundle bundle;
                if (toqVar == kja0.toq.ON_START && (bundle = (Bundle) FragmentManager.this.f4692p.get(str)) != null) {
                    interfaceC0881i.mo4214k(str, bundle);
                    FragmentManager.this.mo4204q(str);
                }
                if (toqVar == kja0.toq.ON_DESTROY) {
                    lifecycle.zy(this);
                    FragmentManager.this.f51450ld6.remove(str);
                }
            }
        };
        lifecycle.mo4451k(fn3eVar);
        n7h n7hVarPut = this.f51450ld6.put(str, new n7h(lifecycle, interfaceC0881i, fn3eVar));
        if (n7hVarPut != null) {
            n7hVarPut.zy();
        }
    }

    boolean uc(@lvui ArrayList<C0884k> arrayList, @lvui ArrayList<Boolean> arrayList2, @dd String str, int i2, int i3) {
        int i4;
        ArrayList<C0884k> arrayList3 = this.f4693q;
        if (arrayList3 == null) {
            return false;
        }
        if (str == null && i2 < 0 && (i3 & 1) == 0) {
            int size = arrayList3.size() - 1;
            if (size < 0) {
                return false;
            }
            arrayList.add(this.f4693q.remove(size));
            arrayList2.add(Boolean.TRUE);
        } else {
            if (str != null || i2 >= 0) {
                int size2 = arrayList3.size() - 1;
                while (size2 >= 0) {
                    C0884k c0884k = this.f4693q.get(size2);
                    if ((str != null && str.equals(c0884k.getName())) || (i2 >= 0 && i2 == c0884k.f4820r)) {
                        break;
                    }
                    size2--;
                }
                if (size2 < 0) {
                    return false;
                }
                if ((i3 & 1) != 0) {
                    while (true) {
                        size2--;
                        if (size2 < 0) {
                            break;
                        }
                        C0884k c0884k2 = this.f4693q.get(size2);
                        if (str == null || !str.equals(c0884k2.getName())) {
                            if (i2 < 0 || i2 != c0884k2.f4820r) {
                                break;
                            }
                        }
                    }
                }
                i4 = size2;
            } else {
                i4 = -1;
            }
            if (i4 == this.f4693q.size() - 1) {
                return false;
            }
            for (int size3 = this.f4693q.size() - 1; size3 > i4; size3--) {
                arrayList.add(this.f4693q.remove(size3));
                arrayList2.add(Boolean.TRUE);
            }
        }
        return true;
    }

    void uj2j() {
        if (this.f51448ki == null) {
            return;
        }
        this.f51446jk = false;
        this.f51436a9 = false;
        this.f51438d2ok.m4242o(false);
        for (Fragment fragment : this.f51463zy.kja0()) {
            if (fragment != null) {
                fragment.noteStateNotSaved();
            }
        }
    }

    void ukdy(@lvui Fragment fragment, @lvui androidx.core.os.zy zyVar) {
        HashSet<androidx.core.os.zy> hashSet = this.f51457qrj.get(fragment);
        if (hashSet != null && hashSet.remove(zyVar) && hashSet.isEmpty()) {
            this.f51457qrj.remove(fragment);
            if (fragment.mState < 5) {
                m4189t(fragment);
                zkd(fragment);
            }
        }
    }

    public boolean vep5() {
        return yl(null, -1, 0);
    }

    @lvui
    public C0903y vq() {
        C0903y c0903y = this.f51462zurt;
        if (c0903y != null) {
            return c0903y;
        }
        Fragment fragment = this.f4689i;
        return fragment != null ? fragment.mFragmentManager.vq() : this.f51454ni7;
    }

    void vy(@lvui Fragment fragment, @lvui kja0.zy zyVar) {
        if (fragment.equals(zp(fragment.mWho)) && (fragment.mHost == null || fragment.mFragmentManager == this)) {
            fragment.mMaxState = zyVar;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " is not an active fragment of FragmentManager " + this);
    }

    void vyq() {
        this.f51436a9 = true;
        this.f51438d2ok.m4242o(true);
        uv6(4);
    }

    public boolean w831() {
        return this.f51446jk || this.f51436a9;
    }

    @lvui
    oc was() {
        oc ocVar = this.mSpecialEffectsControllerFactory;
        if (ocVar != null) {
            return ocVar;
        }
        Fragment fragment = this.f4689i;
        return fragment != null ? fragment.mFragmentManager.was() : this.f51444fu4;
    }

    @dd
    public Fragment.SavedState wlev(@lvui Fragment fragment) {
        zurt zurtVarN7h = this.f51463zy.n7h(fragment.mWho);
        if (zurtVarN7h == null || !zurtVarN7h.ld6().equals(fragment)) {
            m58i(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return zurtVarN7h.ki();
    }

    @lvui
    androidx.fragment.app.qrj wo() {
        return this.f51449kja0;
    }

    @lvui
    zurt wvg(@lvui Fragment fragment) {
        zurt zurtVarN7h = this.f51463zy.n7h(fragment.mWho);
        if (zurtVarN7h != null) {
            return zurtVarN7h;
        }
        zurt zurtVar = new zurt(this.f51449kja0, this.f51463zy, fragment);
        zurtVar.kja0(this.f51448ki.m4330g().getClassLoader());
        zurtVar.fn3e(this.f51437cdj);
        return zurtVar;
    }

    public void x2(@lvui androidx.fragment.app.ki kiVar) {
        this.f4688h.add(kiVar);
    }

    void x9kr(@lvui Menu menu) {
        if (this.f51437cdj < 1) {
            return;
        }
        for (Fragment fragment : this.f51463zy.kja0()) {
            if (fragment != null) {
                fragment.performOptionsMenuClosed(menu);
            }
        }
    }

    public int xwq3() {
        ArrayList<C0884k> arrayList = this.f4693q;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    boolean y9n(boolean z2) {
        yz(z2);
        boolean z3 = false;
        while (y2(this.f51445gvn7, this.f51439d3)) {
            this.f51459toq = true;
            try {
                nsb(this.f51445gvn7, this.f51439d3);
                zurt();
                z3 = true;
            } catch (Throwable th) {
                zurt();
                throw th;
            }
        }
        b9ub();
        nn86();
        this.f51463zy.toq();
        return z3;
    }

    void yqrt(@lvui Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, @dd Bundle bundle) {
        if (this.f4697z == null) {
            this.f51448ki.cdj(fragment, intent, i2, bundle);
            return;
        }
        this.f4695t.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        if (intent != null && bundle != null) {
            intent.putExtra(toq.C0063p.f129k, bundle);
        }
        this.f4697z.toq(intent);
    }

    /* JADX INFO: renamed from: z */
    void m4207z(@lvui C0884k c0884k, boolean z2, boolean z3, boolean z5) {
        if (z2) {
            c0884k.m4294c(z5);
        } else {
            c0884k.m4295f();
        }
        ArrayList arrayList = new ArrayList(1);
        ArrayList arrayList2 = new ArrayList(1);
        arrayList.add(c0884k);
        arrayList2.add(Boolean.valueOf(z2));
        if (z3 && this.f51437cdj >= 1) {
            C0894t.mcp(this.f51448ki.m4330g(), this.f51458t8r, arrayList, arrayList2, 0, 1, true, this.f51453n7h);
        }
        if (z5) {
            gc3c(this.f51437cdj, true);
        }
        for (Fragment fragment : this.f51463zy.qrj()) {
            if (fragment != null && fragment.mView != null && fragment.mIsNewlyAdded && c0884k.uv6(fragment.mContainerId)) {
                float f2 = fragment.mPostponedAlpha;
                if (f2 > 0.0f) {
                    fragment.mView.setAlpha(f2);
                }
                if (z5) {
                    fragment.mPostponedAlpha = 0.0f;
                } else {
                    fragment.mPostponedAlpha = -1.0f;
                    fragment.mIsNewlyAdded = false;
                }
            }
        }
    }

    void z4(@lvui Fragment fragment, @lvui String[] strArr, int i2) {
        if (this.f51460wvg == null) {
            this.f51448ki.qrj(fragment, strArr, i2);
            return;
        }
        this.f4695t.addLast(new LaunchedFragmentInfo(fragment.mWho, i2));
        this.f51460wvg.toq(strArr);
    }

    void zkd(@lvui Fragment fragment) {
        bz2(fragment, this.f51437cdj);
    }

    @dd
    Fragment zp(@lvui String str) {
        return this.f51463zy.m4358g(str);
    }

    @lvui
    hb zsr0(@lvui Fragment fragment) {
        return this.f51438d2ok.m4238e(fragment);
    }

    void zwy(@lvui Fragment fragment) {
        this.f51438d2ok.hb(fragment);
    }

    @Override // androidx.fragment.app.fn3e
    public final void zy(@lvui String str) {
        n7h n7hVarRemove = this.f51450ld6.remove(str);
        if (n7hVarRemove != null) {
            n7hVarRemove.zy();
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator<LaunchedFragmentInfo>() { // from class: androidx.fragment.app.FragmentManager.LaunchedFragmentInfo.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo createFromParcel(Parcel parcel) {
                return new LaunchedFragmentInfo(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public LaunchedFragmentInfo[] newArray(int i2) {
                return new LaunchedFragmentInfo[i2];
            }
        };

        /* JADX INFO: renamed from: k */
        String f4702k;

        /* JADX INFO: renamed from: q */
        int f4703q;

        LaunchedFragmentInfo(@lvui String str, int i2) {
            this.f4702k = str;
            this.f4703q = i2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            parcel.writeString(this.f4702k);
            parcel.writeInt(this.f4703q);
        }

        LaunchedFragmentInfo(@lvui Parcel parcel) {
            this.f4702k = parcel.readString();
            this.f4703q = parcel.readInt();
        }
    }
}

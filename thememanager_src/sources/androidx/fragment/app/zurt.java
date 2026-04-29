package androidx.fragment.app;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C0683f;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.d3;
import androidx.lifecycle.InterfaceC0931j;
import androidx.lifecycle.kja0;
import o1t.C7422k;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: FragmentStateManager.java */
/* JADX INFO: loaded from: classes.dex */
class zurt {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f51551f7l8 = "android:target_req_state";

    /* JADX INFO: renamed from: g */
    private static final String f4956g = "FragmentManager";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f51552ld6 = "android:user_visible_hint";

    /* JADX INFO: renamed from: p */
    private static final String f4957p = "android:view_registry_state";

    /* JADX INFO: renamed from: s */
    private static final String f4958s = "android:view_state";

    /* JADX INFO: renamed from: y */
    private static final String f4959y = "android:target_state";

    /* JADX INFO: renamed from: k */
    private final qrj f4960k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final C0904z f51553toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @lvui
    private final Fragment f51554zy;

    /* JADX INFO: renamed from: q */
    private boolean f4962q = false;

    /* JADX INFO: renamed from: n */
    private int f4961n = -1;

    /* JADX INFO: renamed from: androidx.fragment.app.zurt$k */
    /* JADX INFO: compiled from: FragmentStateManager.java */
    class ViewOnAttachStateChangeListenerC0905k implements View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f4963k;

        ViewOnAttachStateChangeListenerC0905k(View view) {
            this.f4963k = view;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            this.f4963k.removeOnAttachStateChangeListener(this);
            C0683f.m28243do(this.f4963k);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: compiled from: FragmentStateManager.java */
    static /* synthetic */ class toq {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f4965k;

        static {
            int[] iArr = new int[kja0.zy.values().length];
            f4965k = iArr;
            try {
                iArr[kja0.zy.RESUMED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4965k[kja0.zy.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4965k[kja0.zy.CREATED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4965k[kja0.zy.INITIALIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    zurt(@lvui qrj qrjVar, @lvui C0904z c0904z, @lvui Fragment fragment) {
        this.f4960k = qrjVar;
        this.f51553toq = c0904z;
        this.f51554zy = fragment;
    }

    private Bundle cdj() {
        Bundle bundle = new Bundle();
        this.f51554zy.performSaveInstanceState(bundle);
        this.f4960k.m4326p(this.f51554zy, bundle, false);
        if (bundle.isEmpty()) {
            bundle = null;
        }
        if (this.f51554zy.mView != null) {
            m4370i();
        }
        if (this.f51554zy.mSavedViewState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putSparseParcelableArray(f4958s, this.f51554zy.mSavedViewState);
        }
        if (this.f51554zy.mSavedViewRegistryState != null) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBundle(f4957p, this.f51554zy.mSavedViewRegistryState);
        }
        if (!this.f51554zy.mUserVisibleHint) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(f51552ld6, this.f51554zy.mUserVisibleHint);
        }
        return bundle;
    }

    private boolean x2(@lvui View view) {
        if (view == this.f51554zy.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.f51554zy.mView) {
                return true;
            }
        }
        return false;
    }

    void f7l8() {
        Fragment fragmentM4358g;
        if (FragmentManager.m4(3)) {
            Log.d(f4956g, "movefrom CREATED: " + this.f51554zy);
        }
        Fragment fragment = this.f51554zy;
        boolean zIsChangingConfigurations = true;
        boolean z2 = fragment.mRemoving && !fragment.isInBackStack();
        if (!(z2 || this.f51553toq.m4359h().m4241m(this.f51554zy))) {
            String str = this.f51554zy.mTargetWho;
            if (str != null && (fragmentM4358g = this.f51553toq.m4358g(str)) != null && fragmentM4358g.mRetainInstance) {
                this.f51554zy.mTarget = fragmentM4358g;
            }
            this.f51554zy.mState = 0;
            return;
        }
        AbstractC0893s<?> abstractC0893s = this.f51554zy.mHost;
        if (abstractC0893s instanceof InterfaceC0931j) {
            zIsChangingConfigurations = this.f51553toq.m4359h().nn86();
        } else if (abstractC0893s.m4330g() instanceof Activity) {
            zIsChangingConfigurations = true ^ ((Activity) abstractC0893s.m4330g()).isChangingConfigurations();
        }
        if (z2 || zIsChangingConfigurations) {
            this.f51553toq.m4359h().hyr(this.f51554zy);
        }
        this.f51554zy.performDestroy();
        this.f4960k.m4327q(this.f51554zy, false);
        for (zurt zurtVar : this.f51553toq.x2()) {
            if (zurtVar != null) {
                Fragment fragmentLd6 = zurtVar.ld6();
                if (this.f51554zy.mWho.equals(fragmentLd6.mTargetWho)) {
                    fragmentLd6.mTarget = this.f51554zy;
                    fragmentLd6.mTargetWho = null;
                }
            }
        }
        Fragment fragment2 = this.f51554zy;
        String str2 = fragment2.mTargetWho;
        if (str2 != null) {
            fragment2.mTarget = this.f51553toq.m4358g(str2);
        }
        this.f51553toq.ki(this);
    }

    void fn3e(int i2) {
        this.f4961n = i2;
    }

    /* JADX INFO: renamed from: g */
    void m4368g() {
        String resourceName;
        if (this.f51554zy.mFromLayout) {
            return;
        }
        if (FragmentManager.m4(3)) {
            Log.d(f4956g, "moveto CREATE_VIEW: " + this.f51554zy);
        }
        Fragment fragment = this.f51554zy;
        LayoutInflater layoutInflaterPerformGetLayoutInflater = fragment.performGetLayoutInflater(fragment.mSavedFragmentState);
        ViewGroup viewGroup = null;
        Fragment fragment2 = this.f51554zy;
        ViewGroup viewGroup2 = fragment2.mContainer;
        if (viewGroup2 != null) {
            viewGroup = viewGroup2;
        } else {
            int i2 = fragment2.mContainerId;
            if (i2 != 0) {
                if (i2 == -1) {
                    throw new IllegalArgumentException("Cannot create fragment " + this.f51554zy + " for a container view with no id");
                }
                viewGroup = (ViewGroup) fragment2.mFragmentManager.ikck().zy(this.f51554zy.mContainerId);
                if (viewGroup == null) {
                    Fragment fragment3 = this.f51554zy;
                    if (!fragment3.mRestored) {
                        try {
                            resourceName = fragment3.getResources().getResourceName(this.f51554zy.mContainerId);
                        } catch (Resources.NotFoundException unused) {
                            resourceName = "unknown";
                        }
                        throw new IllegalArgumentException("No view found for id 0x" + Integer.toHexString(this.f51554zy.mContainerId) + " (" + resourceName + ") for fragment " + this.f51554zy);
                    }
                }
            }
        }
        Fragment fragment4 = this.f51554zy;
        fragment4.mContainer = viewGroup;
        fragment4.performCreateView(layoutInflaterPerformGetLayoutInflater, viewGroup, fragment4.mSavedFragmentState);
        View view = this.f51554zy.mView;
        if (view != null) {
            boolean z2 = false;
            view.setSaveFromParentEnabled(false);
            Fragment fragment5 = this.f51554zy;
            fragment5.mView.setTag(C7422k.f7l8.f42848l, fragment5);
            if (viewGroup != null) {
                toq();
            }
            Fragment fragment6 = this.f51554zy;
            if (fragment6.mHidden) {
                fragment6.mView.setVisibility(8);
            }
            if (C0683f.zsr0(this.f51554zy.mView)) {
                C0683f.m28243do(this.f51554zy.mView);
            } else {
                View view2 = this.f51554zy.mView;
                view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0905k(view2));
            }
            this.f51554zy.performViewCreated();
            qrj qrjVar = this.f4960k;
            Fragment fragment7 = this.f51554zy;
            qrjVar.qrj(fragment7, fragment7.mView, fragment7.mSavedFragmentState, false);
            int visibility = this.f51554zy.mView.getVisibility();
            float alpha = this.f51554zy.mView.getAlpha();
            if (FragmentManager.f51435x9kr) {
                this.f51554zy.setPostOnViewCreatedAlpha(alpha);
                Fragment fragment8 = this.f51554zy;
                if (fragment8.mContainer != null && visibility == 0) {
                    View viewFindFocus = fragment8.mView.findFocus();
                    if (viewFindFocus != null) {
                        this.f51554zy.setFocusedView(viewFindFocus);
                        if (FragmentManager.m4(2)) {
                            Log.v(f4956g, "requestFocus: Saved focused view " + viewFindFocus + " for Fragment " + this.f51554zy);
                        }
                    }
                    this.f51554zy.mView.setAlpha(0.0f);
                }
            } else {
                Fragment fragment9 = this.f51554zy;
                if (visibility == 0 && fragment9.mContainer != null) {
                    z2 = true;
                }
                fragment9.mIsNewlyAdded = z2;
            }
        }
        this.f51554zy.mState = 2;
    }

    /* JADX INFO: renamed from: h */
    void m4369h() {
        if (FragmentManager.m4(3)) {
            Log.d(f4956g, "moveto RESUMED: " + this.f51554zy);
        }
        View focusedView = this.f51554zy.getFocusedView();
        if (focusedView != null && x2(focusedView)) {
            boolean zRequestFocus = focusedView.requestFocus();
            if (FragmentManager.m4(2)) {
                StringBuilder sb = new StringBuilder();
                sb.append("requestFocus: Restoring focused view ");
                sb.append(focusedView);
                sb.append(" ");
                sb.append(zRequestFocus ? "succeeded" : "failed");
                sb.append(" on Fragment ");
                sb.append(this.f51554zy);
                sb.append(" resulting in focused view ");
                sb.append(this.f51554zy.mView.findFocus());
                Log.v(f4956g, sb.toString());
            }
        }
        this.f51554zy.setFocusedView(null);
        this.f51554zy.performResume();
        this.f4960k.m4328s(this.f51554zy, false);
        Fragment fragment = this.f51554zy;
        fragment.mSavedFragmentState = null;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
    }

    /* JADX INFO: renamed from: i */
    void m4370i() {
        if (this.f51554zy.mView == null) {
            return;
        }
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        this.f51554zy.mView.saveHierarchyState(sparseArray);
        if (sparseArray.size() > 0) {
            this.f51554zy.mSavedViewState = sparseArray;
        }
        Bundle bundle = new Bundle();
        this.f51554zy.mViewLifecycleOwner.m4235n(bundle);
        if (bundle.isEmpty()) {
            return;
        }
        this.f51554zy.mSavedViewRegistryState = bundle;
    }

    /* JADX INFO: renamed from: k */
    void m4371k() {
        if (FragmentManager.m4(3)) {
            Log.d(f4956g, "moveto ACTIVITY_CREATED: " + this.f51554zy);
        }
        Fragment fragment = this.f51554zy;
        fragment.performActivityCreated(fragment.mSavedFragmentState);
        qrj qrjVar = this.f4960k;
        Fragment fragment2 = this.f51554zy;
        qrjVar.m4324k(fragment2, fragment2.mSavedFragmentState, false);
    }

    @dd
    Fragment.SavedState ki() {
        Bundle bundleCdj;
        if (this.f51554zy.mState <= -1 || (bundleCdj = cdj()) == null) {
            return null;
        }
        return new Fragment.SavedState(bundleCdj);
    }

    void kja0(@lvui ClassLoader classLoader) {
        Bundle bundle = this.f51554zy.mSavedFragmentState;
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(classLoader);
        Fragment fragment = this.f51554zy;
        fragment.mSavedViewState = fragment.mSavedFragmentState.getSparseParcelableArray(f4958s);
        Fragment fragment2 = this.f51554zy;
        fragment2.mSavedViewRegistryState = fragment2.mSavedFragmentState.getBundle(f4957p);
        Fragment fragment3 = this.f51554zy;
        fragment3.mTargetWho = fragment3.mSavedFragmentState.getString(f4959y);
        Fragment fragment4 = this.f51554zy;
        if (fragment4.mTargetWho != null) {
            fragment4.mTargetRequestCode = fragment4.mSavedFragmentState.getInt(f51551f7l8, 0);
        }
        Fragment fragment5 = this.f51554zy;
        Boolean bool = fragment5.mSavedUserVisibleHint;
        if (bool != null) {
            fragment5.mUserVisibleHint = bool.booleanValue();
            this.f51554zy.mSavedUserVisibleHint = null;
        } else {
            fragment5.mUserVisibleHint = fragment5.mSavedFragmentState.getBoolean(f51552ld6, true);
        }
        Fragment fragment6 = this.f51554zy;
        if (fragment6.mUserVisibleHint) {
            return;
        }
        fragment6.mDeferStart = true;
    }

    @lvui
    Fragment ld6() {
        return this.f51554zy;
    }

    /* JADX INFO: renamed from: n */
    void m4372n() {
        if (FragmentManager.m4(3)) {
            Log.d(f4956g, "moveto CREATED: " + this.f51554zy);
        }
        Fragment fragment = this.f51554zy;
        if (fragment.mIsCreated) {
            fragment.restoreChildFragmentState(fragment.mSavedFragmentState);
            this.f51554zy.mState = 1;
            return;
        }
        this.f4960k.m4329y(fragment, fragment.mSavedFragmentState, false);
        Fragment fragment2 = this.f51554zy;
        fragment2.performCreate(fragment2.mSavedFragmentState);
        qrj qrjVar = this.f4960k;
        Fragment fragment3 = this.f51554zy;
        qrjVar.zy(fragment3, fragment3.mSavedFragmentState, false);
    }

    void n7h() {
        if (FragmentManager.m4(3)) {
            Log.d(f4956g, "movefrom RESUMED: " + this.f51554zy);
        }
        this.f51554zy.performPause();
        this.f4960k.m4322g(this.f51554zy, false);
    }

    void ni7() {
        if (FragmentManager.m4(3)) {
            Log.d(f4956g, "movefrom STARTED: " + this.f51554zy);
        }
        this.f51554zy.performStop();
        this.f4960k.x2(this.f51554zy, false);
    }

    /* JADX INFO: renamed from: p */
    void m4373p() {
        Fragment fragment = this.f51554zy;
        if (fragment.mFromLayout && fragment.mInLayout && !fragment.mPerformedCreateView) {
            if (FragmentManager.m4(3)) {
                Log.d(f4956g, "moveto CREATE_VIEW: " + this.f51554zy);
            }
            Fragment fragment2 = this.f51554zy;
            fragment2.performCreateView(fragment2.performGetLayoutInflater(fragment2.mSavedFragmentState), null, this.f51554zy.mSavedFragmentState);
            View view = this.f51554zy.mView;
            if (view != null) {
                view.setSaveFromParentEnabled(false);
                Fragment fragment3 = this.f51554zy;
                fragment3.mView.setTag(C7422k.f7l8.f42848l, fragment3);
                Fragment fragment4 = this.f51554zy;
                if (fragment4.mHidden) {
                    fragment4.mView.setVisibility(8);
                }
                this.f51554zy.performViewCreated();
                qrj qrjVar = this.f4960k;
                Fragment fragment5 = this.f51554zy;
                qrjVar.qrj(fragment5, fragment5.mView, fragment5.mSavedFragmentState, false);
                this.f51554zy.mState = 2;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    int m4374q() {
        Fragment fragment;
        ViewGroup viewGroup;
        Fragment fragment2 = this.f51554zy;
        if (fragment2.mFragmentManager == null) {
            return fragment2.mState;
        }
        int iMin = this.f4961n;
        int i2 = toq.f4965k[fragment2.mMaxState.ordinal()];
        if (i2 != 1) {
            iMin = i2 != 2 ? i2 != 3 ? i2 != 4 ? Math.min(iMin, -1) : Math.min(iMin, 0) : Math.min(iMin, 1) : Math.min(iMin, 5);
        }
        Fragment fragment3 = this.f51554zy;
        if (fragment3.mFromLayout) {
            if (fragment3.mInLayout) {
                iMin = Math.max(this.f4961n, 2);
                View view = this.f51554zy.mView;
                if (view != null && view.getParent() == null) {
                    iMin = Math.min(iMin, 2);
                }
            } else {
                iMin = this.f4961n < 4 ? Math.min(iMin, fragment3.mState) : Math.min(iMin, 1);
            }
        }
        if (!this.f51554zy.mAdded) {
            iMin = Math.min(iMin, 1);
        }
        d3.C0874n.toq toqVarX2 = null;
        if (FragmentManager.f51435x9kr && (viewGroup = (fragment = this.f51554zy).mContainer) != null) {
            toqVarX2 = d3.n7h(viewGroup, fragment.getParentFragmentManager()).x2(this);
        }
        if (toqVarX2 == d3.C0874n.toq.ADDING) {
            iMin = Math.min(iMin, 6);
        } else if (toqVarX2 == d3.C0874n.toq.REMOVING) {
            iMin = Math.max(iMin, 3);
        } else {
            Fragment fragment4 = this.f51554zy;
            if (fragment4.mRemoving) {
                iMin = fragment4.isInBackStack() ? Math.min(iMin, 1) : Math.min(iMin, -1);
            }
        }
        Fragment fragment5 = this.f51554zy;
        if (fragment5.mDeferStart && fragment5.mState < 5) {
            iMin = Math.min(iMin, 4);
        }
        if (FragmentManager.m4(2)) {
            Log.v(f4956g, "computeExpectedState() of " + iMin + " for " + this.f51554zy);
        }
        return iMin;
    }

    void qrj() {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        ViewGroup viewGroup3;
        if (this.f4962q) {
            if (FragmentManager.m4(2)) {
                Log.v(f4956g, "Ignoring re-entrant call to moveToExpectedState() for " + ld6());
                return;
            }
            return;
        }
        try {
            this.f4962q = true;
            while (true) {
                int iM4374q = m4374q();
                Fragment fragment = this.f51554zy;
                int i2 = fragment.mState;
                if (iM4374q == i2) {
                    if (FragmentManager.f51435x9kr && fragment.mHiddenChanged) {
                        if (fragment.mView != null && (viewGroup = fragment.mContainer) != null) {
                            d3 d3VarN7h = d3.n7h(viewGroup, fragment.getParentFragmentManager());
                            if (this.f51554zy.mHidden) {
                                d3VarN7h.zy(this);
                            } else {
                                d3VarN7h.m4249n(this);
                            }
                        }
                        Fragment fragment2 = this.f51554zy;
                        FragmentManager fragmentManager = fragment2.mFragmentManager;
                        if (fragmentManager != null) {
                            fragmentManager.ltg8(fragment2);
                        }
                        Fragment fragment3 = this.f51554zy;
                        fragment3.mHiddenChanged = false;
                        fragment3.onHiddenChanged(fragment3.mHidden);
                    }
                    return;
                }
                if (iM4374q <= i2) {
                    switch (i2 - 1) {
                        case -1:
                            m4375s();
                            break;
                        case 0:
                            f7l8();
                            break;
                        case 1:
                            m4376y();
                            this.f51554zy.mState = 1;
                            break;
                        case 2:
                            fragment.mInLayout = false;
                            fragment.mState = 2;
                            break;
                        case 3:
                            if (FragmentManager.m4(3)) {
                                Log.d(f4956g, "movefrom ACTIVITY_CREATED: " + this.f51554zy);
                            }
                            Fragment fragment4 = this.f51554zy;
                            if (fragment4.mView != null && fragment4.mSavedViewState == null) {
                                m4370i();
                            }
                            Fragment fragment5 = this.f51554zy;
                            if (fragment5.mView != null && (viewGroup3 = fragment5.mContainer) != null) {
                                d3.n7h(viewGroup3, fragment5.getParentFragmentManager()).m4251q(this);
                            }
                            this.f51554zy.mState = 3;
                            break;
                        case 4:
                            ni7();
                            break;
                        case 5:
                            fragment.mState = 5;
                            break;
                        case 6:
                            n7h();
                            break;
                    }
                } else {
                    switch (i2 + 1) {
                        case 0:
                            zy();
                            break;
                        case 1:
                            m4372n();
                            break;
                        case 2:
                            m4373p();
                            m4368g();
                            break;
                        case 3:
                            m4371k();
                            break;
                        case 4:
                            if (fragment.mView != null && (viewGroup2 = fragment.mContainer) != null) {
                                d3.n7h(viewGroup2, fragment.getParentFragmentManager()).toq(d3.C0874n.zy.from(this.f51554zy.mView.getVisibility()), this);
                            }
                            this.f51554zy.mState = 4;
                            break;
                        case 5:
                            zurt();
                            break;
                        case 6:
                            fragment.mState = 6;
                            break;
                        case 7:
                            m4369h();
                            break;
                    }
                }
            }
        } finally {
            this.f4962q = false;
        }
    }

    /* JADX INFO: renamed from: s */
    void m4375s() {
        if (FragmentManager.m4(3)) {
            Log.d(f4956g, "movefrom ATTACHED: " + this.f51554zy);
        }
        this.f51554zy.performDetach();
        boolean z2 = false;
        this.f4960k.m4325n(this.f51554zy, false);
        Fragment fragment = this.f51554zy;
        fragment.mState = -1;
        fragment.mHost = null;
        fragment.mParentFragment = null;
        fragment.mFragmentManager = null;
        if (fragment.mRemoving && !fragment.isInBackStack()) {
            z2 = true;
        }
        if (z2 || this.f51553toq.m4359h().m4241m(this.f51554zy)) {
            if (FragmentManager.m4(3)) {
                Log.d(f4956g, "initState called for fragment: " + this.f51554zy);
            }
            this.f51554zy.initState();
        }
    }

    @lvui
    FragmentState t8r() {
        FragmentState fragmentState = new FragmentState(this.f51554zy);
        Fragment fragment = this.f51554zy;
        if (fragment.mState <= -1 || fragmentState.f4732l != null) {
            fragmentState.f4732l = fragment.mSavedFragmentState;
        } else {
            Bundle bundleCdj = cdj();
            fragmentState.f4732l = bundleCdj;
            if (this.f51554zy.mTargetWho != null) {
                if (bundleCdj == null) {
                    fragmentState.f4732l = new Bundle();
                }
                fragmentState.f4732l.putString(f4959y, this.f51554zy.mTargetWho);
                int i2 = this.f51554zy.mTargetRequestCode;
                if (i2 != 0) {
                    fragmentState.f4732l.putInt(f51551f7l8, i2);
                }
            }
        }
        return fragmentState;
    }

    void toq() {
        int iM4363p = this.f51553toq.m4363p(this.f51554zy);
        Fragment fragment = this.f51554zy;
        fragment.mContainer.addView(fragment.mView, iM4363p);
    }

    /* JADX INFO: renamed from: y */
    void m4376y() {
        View view;
        if (FragmentManager.m4(3)) {
            Log.d(f4956g, "movefrom CREATE_VIEW: " + this.f51554zy);
        }
        Fragment fragment = this.f51554zy;
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && (view = fragment.mView) != null) {
            viewGroup.removeView(view);
        }
        this.f51554zy.performDestroyView();
        this.f4960k.n7h(this.f51554zy, false);
        Fragment fragment2 = this.f51554zy;
        fragment2.mContainer = null;
        fragment2.mView = null;
        fragment2.mViewLifecycleOwner = null;
        fragment2.mViewLifecycleOwnerLiveData.cdj(null);
        this.f51554zy.mInLayout = false;
    }

    void zurt() {
        if (FragmentManager.m4(3)) {
            Log.d(f4956g, "moveto STARTED: " + this.f51554zy);
        }
        this.f51554zy.performStart();
        this.f4960k.ld6(this.f51554zy, false);
    }

    void zy() {
        if (FragmentManager.m4(3)) {
            Log.d(f4956g, "moveto ATTACHED: " + this.f51554zy);
        }
        Fragment fragment = this.f51554zy;
        Fragment fragment2 = fragment.mTarget;
        zurt zurtVarN7h = null;
        if (fragment2 != null) {
            zurt zurtVarN7h2 = this.f51553toq.n7h(fragment2.mWho);
            if (zurtVarN7h2 == null) {
                throw new IllegalStateException("Fragment " + this.f51554zy + " declared target fragment " + this.f51554zy.mTarget + " that does not belong to this FragmentManager!");
            }
            Fragment fragment3 = this.f51554zy;
            fragment3.mTargetWho = fragment3.mTarget.mWho;
            fragment3.mTarget = null;
            zurtVarN7h = zurtVarN7h2;
        } else {
            String str = fragment.mTargetWho;
            if (str != null && (zurtVarN7h = this.f51553toq.n7h(str)) == null) {
                throw new IllegalStateException("Fragment " + this.f51554zy + " declared target fragment " + this.f51554zy.mTargetWho + " that does not belong to this FragmentManager!");
            }
        }
        if (zurtVarN7h != null && (FragmentManager.f51435x9kr || zurtVarN7h.ld6().mState < 1)) {
            zurtVarN7h.qrj();
        }
        Fragment fragment4 = this.f51554zy;
        fragment4.mHost = fragment4.mFragmentManager.qo();
        Fragment fragment5 = this.f51554zy;
        fragment5.mParentFragment = fragment5.mFragmentManager.d8wk();
        this.f4960k.f7l8(this.f51554zy, false);
        this.f51554zy.performAttach();
        this.f4960k.toq(this.f51554zy, false);
    }

    zurt(@lvui qrj qrjVar, @lvui C0904z c0904z, @lvui ClassLoader classLoader, @lvui C0903y c0903y, @lvui FragmentState fragmentState) {
        this.f4960k = qrjVar;
        this.f51553toq = c0904z;
        Fragment fragmentMo4213k = c0903y.mo4213k(classLoader, fragmentState.f4731k);
        this.f51554zy = fragmentMo4213k;
        Bundle bundle = fragmentState.f4740z;
        if (bundle != null) {
            bundle.setClassLoader(classLoader);
        }
        fragmentMo4213k.setArguments(fragmentState.f4740z);
        fragmentMo4213k.mWho = fragmentState.f4735q;
        fragmentMo4213k.mFromLayout = fragmentState.f4733n;
        fragmentMo4213k.mRestored = true;
        fragmentMo4213k.mFragmentId = fragmentState.f4728g;
        fragmentMo4213k.mContainerId = fragmentState.f4739y;
        fragmentMo4213k.mTag = fragmentState.f4737s;
        fragmentMo4213k.mRetainInstance = fragmentState.f4734p;
        fragmentMo4213k.mRemoving = fragmentState.f4729h;
        fragmentMo4213k.mDetached = fragmentState.f4730i;
        fragmentMo4213k.mHidden = fragmentState.f4738t;
        fragmentMo4213k.mMaxState = kja0.zy.values()[fragmentState.f4736r];
        Bundle bundle2 = fragmentState.f4732l;
        if (bundle2 != null) {
            fragmentMo4213k.mSavedFragmentState = bundle2;
        } else {
            fragmentMo4213k.mSavedFragmentState = new Bundle();
        }
        if (FragmentManager.m4(2)) {
            Log.v(f4956g, "Instantiated fragment " + fragmentMo4213k);
        }
    }

    zurt(@lvui qrj qrjVar, @lvui C0904z c0904z, @lvui Fragment fragment, @lvui FragmentState fragmentState) {
        this.f4960k = qrjVar;
        this.f51553toq = c0904z;
        this.f51554zy = fragment;
        fragment.mSavedViewState = null;
        fragment.mSavedViewRegistryState = null;
        fragment.mBackStackNesting = 0;
        fragment.mInLayout = false;
        fragment.mAdded = false;
        Fragment fragment2 = fragment.mTarget;
        fragment.mTargetWho = fragment2 != null ? fragment2.mWho : null;
        fragment.mTarget = null;
        Bundle bundle = fragmentState.f4732l;
        if (bundle != null) {
            fragment.mSavedFragmentState = bundle;
        } else {
            fragment.mSavedFragmentState = new Bundle();
        }
    }
}

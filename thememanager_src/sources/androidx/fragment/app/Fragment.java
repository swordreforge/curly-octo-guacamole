package androidx.fragment.app;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.AbstractC0067g;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0068k;
import androidx.activity.result.InterfaceC0071y;
import androidx.activity.result.contract.AbstractC0059k;
import androidx.core.app.C0447s;
import androidx.core.app.y2;
import androidx.core.view.C0690h;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.C0942o;
import androidx.lifecycle.InterfaceC0931j;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.hb;
import androidx.lifecycle.kja0;
import androidx.lifecycle.n5r1;
import androidx.loader.app.AbstractC0956k;
import androidx.savedstate.C1158q;
import androidx.savedstate.InterfaceC1157n;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p032p.InterfaceC7598k;
import zy.InterfaceC7842s;
import zy.dd;
import zy.ek5k;
import zy.lvui;
import zy.nn86;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, InterfaceC0954z, InterfaceC0931j, androidx.lifecycle.n7h, InterfaceC1157n, androidx.activity.result.toq {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    C0856s mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    private boolean mCalled;

    @lvui
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;

    @zy.gvn7
    private int mContentLayoutId;
    C0924e.toq mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    AbstractC0893s<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    boolean mIsNewlyAdded;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    androidx.lifecycle.wvg mLifecycleRegistry;
    kja0.zy mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<ld6> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    float mPostponedAlpha;
    Runnable mPostponedDurationRunnable;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    C1158q mSavedStateRegistryController;

    @dd
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;

    @dd
    a9 mViewLifecycleOwner;
    androidx.lifecycle.fti<InterfaceC0954z> mViewLifecycleOwnerLiveData;

    @lvui
    String mWho;

    class f7l8 extends ld6 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ InterfaceC7598k f4660k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC0068k f4662q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ AtomicReference f51413toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ AbstractC0059k f51414zy;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f7l8(InterfaceC7598k interfaceC7598k, AtomicReference atomicReference, AbstractC0059k abstractC0059k, InterfaceC0068k interfaceC0068k) {
            super(null);
            this.f4660k = interfaceC7598k;
            this.f51413toq = atomicReference;
            this.f51414zy = abstractC0059k;
            this.f4662q = interfaceC0068k;
        }

        @Override // androidx.fragment.app.Fragment.ld6
        /* JADX INFO: renamed from: k */
        void mo4177k() {
            String strGenerateActivityResultKey = Fragment.this.generateActivityResultKey();
            this.f51413toq.set(((ActivityResultRegistry) this.f4660k.apply(null)).m27p(strGenerateActivityResultKey, Fragment.this, this.f51414zy, this.f4662q));
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$g */
    class C0851g implements InterfaceC7598k<Void, ActivityResultRegistry> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ActivityResultRegistry f4663k;

        C0851g(ActivityResultRegistry activityResultRegistry) {
            this.f4663k = activityResultRegistry;
        }

        @Override // p032p.InterfaceC7598k
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r1) {
            return this.f4663k;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$k */
    class RunnableC0852k implements Runnable {
        RunnableC0852k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.startPostponedEnterTransition();
        }
    }

    private static abstract class ld6 {
        private ld6() {
        }

        /* JADX INFO: renamed from: k */
        abstract void mo4177k();

        /* synthetic */ ld6(RunnableC0852k runnableC0852k) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$n */
    class C0853n implements InterfaceC7598k<Void, ActivityResultRegistry> {
        C0853n() {
        }

        @Override // p032p.InterfaceC7598k
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ActivityResultRegistry apply(Void r3) {
            Fragment fragment = Fragment.this;
            Object obj = fragment.mHost;
            return obj instanceof InterfaceC0071y ? ((InterfaceC0071y) obj).getActivityResultRegistry() : fragment.requireActivity().getActivityResultRegistry();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$p */
    public static class C0854p extends RuntimeException {
        public C0854p(@lvui String str, @dd Exception exc) {
            super(str, exc);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$q */
    class C0855q extends AbstractC0879g {
        C0855q() {
        }

        @Override // androidx.fragment.app.AbstractC0879g
        /* JADX INFO: renamed from: q */
        public boolean mo4180q() {
            return Fragment.this.mView != null;
        }

        @Override // androidx.fragment.app.AbstractC0879g
        @dd
        public View zy(int i2) {
            View view = Fragment.this.mView;
            if (view != null) {
                return view.findViewById(i2);
            }
            throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$s */
    static class C0856s {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        Boolean f51416cdj;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        int f51417f7l8;

        /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
        float f51418fn3e;

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        x2 f51419fu4;

        /* JADX INFO: renamed from: g */
        int f4667g;

        /* JADX INFO: renamed from: h */
        Object f4668h;

        /* JADX INFO: renamed from: i */
        y2 f4669i;

        /* JADX INFO: renamed from: k */
        View f4670k;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        Boolean f51420ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        Object f51421kja0;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        Object f51422ld6 = null;

        /* JADX INFO: renamed from: n */
        int f4671n;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        Object f51423n7h;

        /* JADX INFO: renamed from: ni7, reason: collision with root package name */
        boolean f51424ni7;

        /* JADX INFO: renamed from: p */
        ArrayList<String> f4672p;

        /* JADX INFO: renamed from: q */
        int f4673q;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        Object f51425qrj;

        /* JADX INFO: renamed from: s */
        ArrayList<String> f4674s;

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        y2 f51426t8r;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        Animator f51427toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        Object f51428x2;

        /* JADX INFO: renamed from: y */
        int f4675y;

        /* JADX INFO: renamed from: z */
        boolean f4676z;

        /* JADX INFO: renamed from: zurt, reason: collision with root package name */
        View f51429zurt;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f51430zy;

        C0856s() {
            Object obj = Fragment.USE_DEFAULT_TRANSITION;
            this.f51428x2 = obj;
            this.f51425qrj = null;
            this.f51423n7h = obj;
            this.f51421kja0 = null;
            this.f4668h = obj;
            this.f51426t8r = null;
            this.f4669i = null;
            this.f51418fn3e = 1.0f;
            this.f51429zurt = null;
        }
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Fragment.this.callStartTransitionListener(false);
        }
    }

    interface x2 {
        /* JADX INFO: renamed from: k */
        void mo4181k();

        void toq();
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.fragment.app.Fragment$y */
    class C0857y<I> extends AbstractC0067g<I> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AtomicReference f4678k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ AbstractC0059k f51431toq;

        C0857y(AtomicReference atomicReference, AbstractC0059k abstractC0059k) {
            this.f4678k = atomicReference;
            this.f51431toq = abstractC0059k;
        }

        @Override // androidx.activity.result.AbstractC0067g
        @lvui
        /* JADX INFO: renamed from: k */
        public AbstractC0059k<I, ?> mo30k() {
            return this.f51431toq;
        }

        @Override // androidx.activity.result.AbstractC0067g
        /* JADX INFO: renamed from: q */
        public void mo31q() {
            AbstractC0067g abstractC0067g = (AbstractC0067g) this.f4678k.getAndSet(null);
            if (abstractC0067g != null) {
                abstractC0067g.mo31q();
            }
        }

        @Override // androidx.activity.result.AbstractC0067g
        public void zy(I i2, @dd C0447s c0447s) {
            AbstractC0067g abstractC0067g = (AbstractC0067g) this.f4678k.get();
            if (abstractC0067g == null) {
                throw new IllegalStateException("Operation cannot be started before fragment is in created state");
            }
            abstractC0067g.zy(i2, c0447s);
        }
    }

    class zy implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ d3 f4679k;

        zy(d3 d3Var) {
            this.f4679k = d3Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f4679k.f7l8();
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new n7h();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new RunnableC0852k();
        this.mMaxState = kja0.zy.RESUMED;
        this.mViewLifecycleOwnerLiveData = new androidx.lifecycle.fti<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        initLifecycle();
    }

    private C0856s ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new C0856s();
        }
        return this.mAnimationInfo;
    }

    private int getMinimumMaxLifecycleState() {
        kja0.zy zyVar = this.mMaxState;
        return (zyVar == kja0.zy.INITIALIZED || this.mParentFragment == null) ? zyVar.ordinal() : Math.min(zyVar.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new androidx.lifecycle.wvg(this);
        this.mSavedStateRegistryController = C1158q.m5233k(this);
        this.mDefaultFactory = null;
    }

    @lvui
    @Deprecated
    public static Fragment instantiate(@lvui Context context, @lvui String str) {
        return instantiate(context, str, null);
    }

    @lvui
    private <I, O> AbstractC0067g<I> prepareCallInternal(@lvui AbstractC0059k<I, O> abstractC0059k, @lvui InterfaceC7598k<Void, ActivityResultRegistry> interfaceC7598k, @lvui InterfaceC0068k<O> interfaceC0068k) {
        if (this.mState <= 1) {
            AtomicReference atomicReference = new AtomicReference();
            registerOnPreAttachListener(new f7l8(interfaceC7598k, atomicReference, abstractC0059k, interfaceC0068k));
            return new C0857y(atomicReference, abstractC0059k);
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(@lvui ld6 ld6Var) {
        if (this.mState >= 0) {
            ld6Var.mo4177k();
        } else {
            this.mOnPreAttachedListeners.add(ld6Var);
        }
    }

    void callStartTransitionListener(boolean z2) {
        ViewGroup viewGroup;
        FragmentManager fragmentManager;
        C0856s c0856s = this.mAnimationInfo;
        x2 x2Var = null;
        if (c0856s != null) {
            c0856s.f51424ni7 = false;
            x2 x2Var2 = c0856s.f51419fu4;
            c0856s.f51419fu4 = null;
            x2Var = x2Var2;
        }
        if (x2Var != null) {
            x2Var.toq();
            return;
        }
        if (!FragmentManager.f51435x9kr || this.mView == null || (viewGroup = this.mContainer) == null || (fragmentManager = this.mFragmentManager) == null) {
            return;
        }
        d3 d3VarN7h = d3.n7h(viewGroup, fragmentManager);
        d3VarN7h.m4248h();
        if (z2) {
            this.mHost.f7l8().post(new zy(d3VarN7h));
        } else {
            d3VarN7h.f7l8();
        }
    }

    @lvui
    AbstractC0879g createFragmentContainer() {
        return new C0855q();
    }

    public void dump(@lvui String str, @dd FileDescriptor fileDescriptor, @lvui PrintWriter printWriter, @dd String[] strArr) {
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.mFragmentId));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.mContainerId));
        printWriter.print(" mTag=");
        printWriter.println(this.mTag);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.mState);
        printWriter.print(" mWho=");
        printWriter.print(this.mWho);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.mBackStackNesting);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.mAdded);
        printWriter.print(" mRemoving=");
        printWriter.print(this.mRemoving);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.mFromLayout);
        printWriter.print(" mInLayout=");
        printWriter.println(this.mInLayout);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.mHidden);
        printWriter.print(" mDetached=");
        printWriter.print(this.mDetached);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.mMenuVisible);
        printWriter.print(" mHasMenu=");
        printWriter.println(this.mHasMenu);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.mRetainInstance);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.mSavedViewRegistryState);
        }
        Fragment targetFragment = getTargetFragment();
        if (targetFragment != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(targetFragment);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.mTargetRequestCode);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        printWriter.println(getPopDirection());
        if (getEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            printWriter.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            printWriter.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            printWriter.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            printWriter.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.mContainer);
        }
        if (this.mView != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            printWriter.print(str);
            printWriter.print("mAnimatingAway=");
            printWriter.println(getAnimatingAway());
        }
        if (getContext() != null) {
            AbstractC0956k.m4499q(this).toq(str, fileDescriptor, printWriter, strArr);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.hb(str + "  ", fileDescriptor, printWriter, strArr);
    }

    public final boolean equals(@dd Object obj) {
        return super.equals(obj);
    }

    @dd
    Fragment findFragmentByWho(@lvui String str) {
        return str.equals(this.mWho) ? this : this.mChildFragmentManager.lv5(str);
    }

    @lvui
    String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    @dd
    public final ActivityC0891q getActivity() {
        AbstractC0893s<?> abstractC0893s = this.mHost;
        if (abstractC0893s == null) {
            return null;
        }
        return (ActivityC0891q) abstractC0893s.m4332n();
    }

    public boolean getAllowEnterTransitionOverlap() {
        Boolean bool;
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null || (bool = c0856s.f51420ki) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    public boolean getAllowReturnTransitionOverlap() {
        Boolean bool;
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null || (bool = c0856s.f51416cdj) == null) {
            return true;
        }
        return bool.booleanValue();
    }

    View getAnimatingAway() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return null;
        }
        return c0856s.f4670k;
    }

    Animator getAnimator() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return null;
        }
        return c0856s.f51427toq;
    }

    @dd
    public final Bundle getArguments() {
        return this.mArguments;
    }

    @lvui
    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    @dd
    public Context getContext() {
        AbstractC0893s<?> abstractC0893s = this.mHost;
        if (abstractC0893s == null) {
            return null;
        }
        return abstractC0893s.m4330g();
    }

    @Override // androidx.lifecycle.n7h
    @lvui
    public C0924e.toq getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (this.mDefaultFactory == null) {
            Application application = null;
            Context applicationContext = requireContext().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                }
                if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                }
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
            if (application == null && FragmentManager.m4(3)) {
                Log.d("FragmentManager", "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
            }
            this.mDefaultFactory = new n5r1(application, this, getArguments());
        }
        return this.mDefaultFactory;
    }

    int getEnterAnim() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return 0;
        }
        return c0856s.f4673q;
    }

    @dd
    public Object getEnterTransition() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return null;
        }
        return c0856s.f51422ld6;
    }

    y2 getEnterTransitionCallback() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return null;
        }
        return c0856s.f51426t8r;
    }

    int getExitAnim() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return 0;
        }
        return c0856s.f4671n;
    }

    @dd
    public Object getExitTransition() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return null;
        }
        return c0856s.f51425qrj;
    }

    y2 getExitTransitionCallback() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return null;
        }
        return c0856s.f4669i;
    }

    View getFocusedView() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return null;
        }
        return c0856s.f51429zurt;
    }

    @Deprecated
    @dd
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    @dd
    public final Object getHost() {
        AbstractC0893s<?> abstractC0893s = this.mHost;
        if (abstractC0893s == null) {
            return null;
        }
        return abstractC0893s.mo4320s();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    @lvui
    public final LayoutInflater getLayoutInflater() {
        LayoutInflater layoutInflater = this.mLayoutInflater;
        return layoutInflater == null ? performGetLayoutInflater(null) : layoutInflater;
    }

    @Override // androidx.lifecycle.InterfaceC0954z
    @lvui
    public androidx.lifecycle.kja0 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @lvui
    @Deprecated
    public AbstractC0956k getLoaderManager() {
        return AbstractC0956k.m4499q(this);
    }

    int getNextTransition() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return 0;
        }
        return c0856s.f4675y;
    }

    @dd
    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    @lvui
    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    boolean getPopDirection() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return false;
        }
        return c0856s.f51430zy;
    }

    int getPopEnterAnim() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return 0;
        }
        return c0856s.f4667g;
    }

    int getPopExitAnim() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return 0;
        }
        return c0856s.f51417f7l8;
    }

    float getPostOnViewCreatedAlpha() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return 1.0f;
        }
        return c0856s.f51418fn3e;
    }

    @dd
    public Object getReenterTransition() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return null;
        }
        Object obj = c0856s.f51423n7h;
        return obj == USE_DEFAULT_TRANSITION ? getExitTransition() : obj;
    }

    @lvui
    public final Resources getResources() {
        return requireContext().getResources();
    }

    @Deprecated
    public final boolean getRetainInstance() {
        return this.mRetainInstance;
    }

    @dd
    public Object getReturnTransition() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return null;
        }
        Object obj = c0856s.f51428x2;
        return obj == USE_DEFAULT_TRANSITION ? getEnterTransition() : obj;
    }

    @Override // androidx.savedstate.InterfaceC1157n
    @lvui
    public final androidx.savedstate.zy getSavedStateRegistry() {
        return this.mSavedStateRegistryController.toq();
    }

    @dd
    public Object getSharedElementEnterTransition() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return null;
        }
        return c0856s.f51421kja0;
    }

    @dd
    public Object getSharedElementReturnTransition() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return null;
        }
        Object obj = c0856s.f4668h;
        return obj == USE_DEFAULT_TRANSITION ? getSharedElementEnterTransition() : obj;
    }

    @lvui
    ArrayList<String> getSharedElementSourceNames() {
        ArrayList<String> arrayList;
        C0856s c0856s = this.mAnimationInfo;
        return (c0856s == null || (arrayList = c0856s.f4674s) == null) ? new ArrayList<>() : arrayList;
    }

    @lvui
    ArrayList<String> getSharedElementTargetNames() {
        ArrayList<String> arrayList;
        C0856s c0856s = this.mAnimationInfo;
        return (c0856s == null || (arrayList = c0856s.f4672p) == null) ? new ArrayList<>() : arrayList;
    }

    @lvui
    public final String getString(@nn86 int i2) {
        return getResources().getString(i2);
    }

    @dd
    public final String getTag() {
        return this.mTag;
    }

    @Deprecated
    @dd
    public final Fragment getTargetFragment() {
        String str;
        Fragment fragment = this.mTarget;
        if (fragment != null) {
            return fragment;
        }
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null || (str = this.mTargetWho) == null) {
            return null;
        }
        return fragmentManager.zp(str);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        return this.mTargetRequestCode;
    }

    @lvui
    public final CharSequence getText(@nn86 int i2) {
        return getResources().getText(i2);
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @dd
    public View getView() {
        return this.mView;
    }

    @lvui
    @zy.oc
    public InterfaceC0954z getViewLifecycleOwner() {
        a9 a9Var = this.mViewLifecycleOwner;
        if (a9Var != null) {
            return a9Var;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @lvui
    public LiveData<InterfaceC0954z> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    @Override // androidx.lifecycle.InterfaceC0931j
    @lvui
    public hb getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        if (getMinimumMaxLifecycleState() != kja0.zy.INITIALIZED.ordinal()) {
            return this.mFragmentManager.zsr0(this);
        }
        throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
    }

    @SuppressLint({"KotlinPropertyAccess"})
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final int hashCode() {
        return super.hashCode();
    }

    void initState() {
        initLifecycle();
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new n7h();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isHidden() {
        return this.mHidden;
    }

    boolean isHideReplaced() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return false;
        }
        return c0856s.f4676z;
    }

    final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public final boolean isMenuVisible() {
        FragmentManager fragmentManager;
        return this.mMenuVisible && ((fragmentManager = this.mFragmentManager) == null || fragmentManager.etdu(this.mParentFragment));
    }

    boolean isPostponed() {
        C0856s c0856s = this.mAnimationInfo;
        if (c0856s == null) {
            return false;
        }
        return c0856s.f51424ni7;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    final boolean isRemovingParent() {
        Fragment parentFragment = getParentFragment();
        return parentFragment != null && (parentFragment.isRemoving() || parentFragment.isRemovingParent());
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isStateSaved() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            return false;
        }
        return fragmentManager.w831();
    }

    public final boolean isVisible() {
        View view;
        return (!isAdded() || isHidden() || (view = this.mView) == null || view.getWindowToken() == null || this.mView.getVisibility() != 0) ? false : true;
    }

    void noteStateNotSaved() {
        this.mChildFragmentManager.uj2j();
    }

    @Deprecated
    @zy.oc
    @InterfaceC7842s
    public void onActivityCreated(@dd Bundle bundle) {
        this.mCalled = true;
    }

    @Deprecated
    public void onActivityResult(int i2, int i3, @dd Intent intent) {
        if (FragmentManager.m4(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i2 + " resultCode: " + i3 + " data: " + intent);
        }
    }

    @zy.oc
    @InterfaceC7842s
    public void onAttach(@lvui Context context) {
        this.mCalled = true;
        AbstractC0893s<?> abstractC0893s = this.mHost;
        Activity activityM4332n = abstractC0893s == null ? null : abstractC0893s.m4332n();
        if (activityM4332n != null) {
            this.mCalled = false;
            onAttach(activityM4332n);
        }
    }

    @Deprecated
    @zy.oc
    public void onAttachFragment(@lvui Fragment fragment) {
    }

    @Override // android.content.ComponentCallbacks
    @InterfaceC7842s
    public void onConfigurationChanged(@lvui Configuration configuration) {
        this.mCalled = true;
    }

    @zy.oc
    public boolean onContextItemSelected(@lvui MenuItem menuItem) {
        return false;
    }

    @zy.oc
    @InterfaceC7842s
    public void onCreate(@dd Bundle bundle) {
        this.mCalled = true;
        restoreChildFragmentState(bundle);
        if (this.mChildFragmentManager.cfr(1)) {
            return;
        }
        this.mChildFragmentManager.gvn7();
    }

    @dd
    @zy.oc
    public Animation onCreateAnimation(int i2, boolean z2, int i3) {
        return null;
    }

    @dd
    @zy.oc
    public Animator onCreateAnimator(int i2, boolean z2, int i3) {
        return null;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    @zy.oc
    public void onCreateContextMenu(@lvui ContextMenu contextMenu, @lvui View view, @dd ContextMenu.ContextMenuInfo contextMenuInfo) {
        requireActivity().onCreateContextMenu(contextMenu, view, contextMenuInfo);
    }

    @zy.oc
    public void onCreateOptionsMenu(@lvui Menu menu, @lvui MenuInflater menuInflater) {
    }

    @dd
    @zy.oc
    public View onCreateView(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle) {
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            return layoutInflater.inflate(i2, viewGroup, false);
        }
        return null;
    }

    @zy.oc
    @InterfaceC7842s
    public void onDestroy() {
        this.mCalled = true;
    }

    @zy.oc
    public void onDestroyOptionsMenu() {
    }

    @zy.oc
    @InterfaceC7842s
    public void onDestroyView() {
        this.mCalled = true;
    }

    @zy.oc
    @InterfaceC7842s
    public void onDetach() {
        this.mCalled = true;
    }

    @lvui
    public LayoutInflater onGetLayoutInflater(@dd Bundle bundle) {
        return getLayoutInflater(bundle);
    }

    @zy.oc
    public void onHiddenChanged(boolean z2) {
    }

    @ek5k
    @InterfaceC7842s
    public void onInflate(@lvui Context context, @lvui AttributeSet attributeSet, @dd Bundle bundle) {
        this.mCalled = true;
        AbstractC0893s<?> abstractC0893s = this.mHost;
        Activity activityM4332n = abstractC0893s == null ? null : abstractC0893s.m4332n();
        if (activityM4332n != null) {
            this.mCalled = false;
            onInflate(activityM4332n, attributeSet, bundle);
        }
    }

    @Override // android.content.ComponentCallbacks
    @zy.oc
    @InterfaceC7842s
    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onMultiWindowModeChanged(boolean z2) {
    }

    @zy.oc
    public boolean onOptionsItemSelected(@lvui MenuItem menuItem) {
        return false;
    }

    @zy.oc
    public void onOptionsMenuClosed(@lvui Menu menu) {
    }

    @zy.oc
    @InterfaceC7842s
    public void onPause() {
        this.mCalled = true;
    }

    public void onPictureInPictureModeChanged(boolean z2) {
    }

    @zy.oc
    public void onPrepareOptionsMenu(@lvui Menu menu) {
    }

    @zy.oc
    public void onPrimaryNavigationFragmentChanged(boolean z2) {
    }

    @Deprecated
    public void onRequestPermissionsResult(int i2, @lvui String[] strArr, @lvui int[] iArr) {
    }

    @zy.oc
    @InterfaceC7842s
    public void onResume() {
        this.mCalled = true;
    }

    @zy.oc
    public void onSaveInstanceState(@lvui Bundle bundle) {
    }

    @zy.oc
    @InterfaceC7842s
    public void onStart() {
        this.mCalled = true;
    }

    @zy.oc
    @InterfaceC7842s
    public void onStop() {
        this.mCalled = true;
    }

    @zy.oc
    public void onViewCreated(@lvui View view, @dd Bundle bundle) {
    }

    @zy.oc
    @InterfaceC7842s
    public void onViewStateRestored(@dd Bundle bundle) {
        this.mCalled = true;
    }

    void performActivityCreated(Bundle bundle) {
        this.mChildFragmentManager.uj2j();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(bundle);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.jk();
        } else {
            throw new eqxt("Fragment " + this + " did not call through to super.onActivityCreated()");
        }
    }

    void performAttach() {
        Iterator<ld6> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().mo4177k();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.m4199h(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.m4330g());
        if (this.mCalled) {
            this.mFragmentManager.m4205r(this);
            this.mChildFragmentManager.a9();
        } else {
            throw new eqxt("Fragment " + this + " did not call through to super.onAttach()");
        }
    }

    void performConfigurationChanged(@lvui Configuration configuration) {
        onConfigurationChanged(configuration);
        this.mChildFragmentManager.fti(configuration);
    }

    boolean performContextItemSelected(@lvui MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.jp0y(menuItem);
    }

    void performCreate(Bundle bundle) {
        this.mChildFragmentManager.uj2j();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.mo4451k(new androidx.lifecycle.fn3e() { // from class: androidx.fragment.app.Fragment.5
            @Override // androidx.lifecycle.fn3e
            public void gvn7(@lvui InterfaceC0954z interfaceC0954z, @lvui kja0.toq toqVar) {
                View view;
                if (toqVar != kja0.toq.ON_STOP || (view = Fragment.this.mView) == null) {
                    return;
                }
                view.cancelPendingInputEvents();
            }
        });
        this.mSavedStateRegistryController.m5235q(bundle);
        onCreate(bundle);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.m4480p(kja0.toq.ON_CREATE);
            return;
        }
        throw new eqxt("Fragment " + this + " did not call through to super.onCreate()");
    }

    boolean performCreateOptionsMenu(@lvui Menu menu, @lvui MenuInflater menuInflater) {
        boolean z2 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z2 = true;
            onCreateOptionsMenu(menu, menuInflater);
        }
        return z2 | this.mChildFragmentManager.d3(menu, menuInflater);
    }

    void performCreateView(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle) {
        this.mChildFragmentManager.uj2j();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new a9(this, getViewModelStore());
        View viewOnCreateView = onCreateView(layoutInflater, viewGroup, bundle);
        this.mView = viewOnCreateView;
        if (viewOnCreateView == null) {
            if (this.mViewLifecycleOwner.zy()) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.mViewLifecycleOwner = null;
        } else {
            this.mViewLifecycleOwner.toq();
            C0942o.toq(this.mView, this.mViewLifecycleOwner);
            androidx.lifecycle.ek5k.toq(this.mView, this.mViewLifecycleOwner);
            androidx.savedstate.f7l8.toq(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.cdj(this.mViewLifecycleOwner);
        }
    }

    void performDestroy() {
        this.mChildFragmentManager.oc();
        this.mLifecycleRegistry.m4480p(kja0.toq.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (this.mCalled) {
            return;
        }
        throw new eqxt("Fragment " + this + " did not call through to super.onDestroy()");
    }

    void performDestroyView() {
        this.mChildFragmentManager.eqxt();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().toq().isAtLeast(kja0.zy.CREATED)) {
            this.mViewLifecycleOwner.m4234k(kja0.toq.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            AbstractC0956k.m4499q(this).mo4504y();
            this.mPerformedCreateView = false;
        } else {
            throw new eqxt("Fragment " + this + " did not call through to super.onDestroyView()");
        }
    }

    void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (this.mCalled) {
            if (this.mChildFragmentManager.r8s8()) {
                return;
            }
            this.mChildFragmentManager.oc();
            this.mChildFragmentManager = new n7h();
            return;
        }
        throw new eqxt("Fragment " + this + " did not call through to super.onDetach()");
    }

    @lvui
    LayoutInflater performGetLayoutInflater(@dd Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = onGetLayoutInflater(bundle);
        this.mLayoutInflater = layoutInflaterOnGetLayoutInflater;
        return layoutInflaterOnGetLayoutInflater;
    }

    void performLowMemory() {
        onLowMemory();
        this.mChildFragmentManager.d2ok();
    }

    void performMultiWindowModeChanged(boolean z2) {
        onMultiWindowModeChanged(z2);
        this.mChildFragmentManager.lvui(z2);
    }

    boolean performOptionsItemSelected(@lvui MenuItem menuItem) {
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible && onOptionsItemSelected(menuItem)) {
            return true;
        }
        return this.mChildFragmentManager.dd(menuItem);
    }

    void performOptionsMenuClosed(@lvui Menu menu) {
        if (this.mHidden) {
            return;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            onOptionsMenuClosed(menu);
        }
        this.mChildFragmentManager.x9kr(menu);
    }

    void performPause() {
        this.mChildFragmentManager.m4202l();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4234k(kja0.toq.ON_PAUSE);
        }
        this.mLifecycleRegistry.m4480p(kja0.toq.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (this.mCalled) {
            return;
        }
        throw new eqxt("Fragment " + this + " did not call through to super.onPause()");
    }

    void performPictureInPictureModeChanged(boolean z2) {
        onPictureInPictureModeChanged(z2);
        this.mChildFragmentManager.n5r1(z2);
    }

    boolean performPrepareOptionsMenu(@lvui Menu menu) {
        boolean z2 = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            z2 = true;
            onPrepareOptionsMenu(menu);
        }
        return z2 | this.mChildFragmentManager.hyr(menu);
    }

    void performPrimaryNavigationFragmentChanged() {
        boolean zSok = this.mFragmentManager.sok(this);
        Boolean bool = this.mIsPrimaryNavigationFragment;
        if (bool == null || bool.booleanValue() != zSok) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(zSok);
            onPrimaryNavigationFragmentChanged(zSok);
            this.mChildFragmentManager.m4198f();
        }
    }

    void performResume() {
        this.mChildFragmentManager.uj2j();
        this.mChildFragmentManager.y9n(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (!this.mCalled) {
            throw new eqxt("Fragment " + this + " did not call through to super.onResume()");
        }
        androidx.lifecycle.wvg wvgVar = this.mLifecycleRegistry;
        kja0.toq toqVar = kja0.toq.ON_RESUME;
        wvgVar.m4480p(toqVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4234k(toqVar);
        }
        this.mChildFragmentManager.m4195c();
    }

    void performSaveInstanceState(Bundle bundle) {
        onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m5234n(bundle);
        Parcelable parcelableH4b = this.mChildFragmentManager.h4b();
        if (parcelableH4b != null) {
            bundle.putParcelable("android:support:fragments", parcelableH4b);
        }
    }

    void performStart() {
        this.mChildFragmentManager.uj2j();
        this.mChildFragmentManager.y9n(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (!this.mCalled) {
            throw new eqxt("Fragment " + this + " did not call through to super.onStart()");
        }
        androidx.lifecycle.wvg wvgVar = this.mLifecycleRegistry;
        kja0.toq toqVar = kja0.toq.ON_START;
        wvgVar.m4480p(toqVar);
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4234k(toqVar);
        }
        this.mChildFragmentManager.lrht();
    }

    void performStop() {
        this.mChildFragmentManager.vyq();
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4234k(kja0.toq.ON_STOP);
        }
        this.mLifecycleRegistry.m4480p(kja0.toq.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (this.mCalled) {
            return;
        }
        throw new eqxt("Fragment " + this + " did not call through to super.onStop()");
    }

    void performViewCreated() {
        onViewCreated(this.mView, this.mSavedFragmentState);
        this.mChildFragmentManager.m4197e();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().f51424ni7 = true;
    }

    @Override // androidx.activity.result.toq
    @lvui
    @zy.oc
    public final <I, O> AbstractC0067g<I> registerForActivityResult(@lvui AbstractC0059k<I, O> abstractC0059k, @lvui InterfaceC0068k<O> interfaceC0068k) {
        return prepareCallInternal(abstractC0059k, new C0853n(), interfaceC0068k);
    }

    public void registerForContextMenu(@lvui View view) {
        view.setOnCreateContextMenuListener(this);
    }

    @Deprecated
    public final void requestPermissions(@lvui String[] strArr, int i2) {
        if (this.mHost != null) {
            getParentFragmentManager().z4(this, strArr, i2);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @lvui
    public final ActivityC0891q requireActivity() {
        ActivityC0891q activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @lvui
    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    @lvui
    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    @lvui
    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    @lvui
    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    @lvui
    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    @lvui
    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    void restoreChildFragmentState(@dd Bundle bundle) {
        Parcelable parcelable;
        if (bundle == null || (parcelable = bundle.getParcelable("android:support:fragments")) == null) {
            return;
        }
        this.mChildFragmentManager.ngy(parcelable);
        this.mChildFragmentManager.gvn7();
    }

    final void restoreViewState(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = this.mSavedViewState;
        if (sparseArray != null) {
            this.mView.restoreHierarchyState(sparseArray);
            this.mSavedViewState = null;
        }
        if (this.mView != null) {
            this.mViewLifecycleOwner.m4236q(this.mSavedViewRegistryState);
            this.mSavedViewRegistryState = null;
        }
        this.mCalled = false;
        onViewStateRestored(bundle);
        if (this.mCalled) {
            if (this.mView != null) {
                this.mViewLifecycleOwner.m4234k(kja0.toq.ON_CREATE);
            }
        } else {
            throw new eqxt("Fragment " + this + " did not call through to super.onViewStateRestored()");
        }
    }

    public void setAllowEnterTransitionOverlap(boolean z2) {
        ensureAnimationInfo().f51420ki = Boolean.valueOf(z2);
    }

    public void setAllowReturnTransitionOverlap(boolean z2) {
        ensureAnimationInfo().f51416cdj = Boolean.valueOf(z2);
    }

    void setAnimatingAway(View view) {
        ensureAnimationInfo().f4670k = view;
    }

    void setAnimations(int i2, int i3, int i4, int i5) {
        if (this.mAnimationInfo == null && i2 == 0 && i3 == 0 && i4 == 0 && i5 == 0) {
            return;
        }
        ensureAnimationInfo().f4673q = i2;
        ensureAnimationInfo().f4671n = i3;
        ensureAnimationInfo().f4667g = i4;
        ensureAnimationInfo().f51417f7l8 = i5;
    }

    void setAnimator(Animator animator) {
        ensureAnimationInfo().f51427toq = animator;
    }

    public void setArguments(@dd Bundle bundle) {
        if (this.mFragmentManager != null && isStateSaved()) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.mArguments = bundle;
    }

    public void setEnterSharedElementCallback(@dd y2 y2Var) {
        ensureAnimationInfo().f51426t8r = y2Var;
    }

    public void setEnterTransition(@dd Object obj) {
        ensureAnimationInfo().f51422ld6 = obj;
    }

    public void setExitSharedElementCallback(@dd y2 y2Var) {
        ensureAnimationInfo().f4669i = y2Var;
    }

    public void setExitTransition(@dd Object obj) {
        ensureAnimationInfo().f51425qrj = obj;
    }

    void setFocusedView(View view) {
        ensureAnimationInfo().f51429zurt = view;
    }

    public void setHasOptionsMenu(boolean z2) {
        if (this.mHasMenu != z2) {
            this.mHasMenu = z2;
            if (!isAdded() || isHidden()) {
                return;
            }
            this.mHost.t8r();
        }
    }

    void setHideReplaced(boolean z2) {
        ensureAnimationInfo().f4676z = z2;
    }

    public void setInitialSavedState(@dd SavedState savedState) {
        Bundle bundle;
        if (this.mFragmentManager != null) {
            throw new IllegalStateException("Fragment already added");
        }
        if (savedState == null || (bundle = savedState.f4659k) == null) {
            bundle = null;
        }
        this.mSavedFragmentState = bundle;
    }

    public void setMenuVisibility(boolean z2) {
        if (this.mMenuVisible != z2) {
            this.mMenuVisible = z2;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.t8r();
            }
        }
    }

    void setNextTransition(int i2) {
        if (this.mAnimationInfo == null && i2 == 0) {
            return;
        }
        ensureAnimationInfo();
        this.mAnimationInfo.f4675y = i2;
    }

    void setOnStartEnterTransitionListener(x2 x2Var) {
        ensureAnimationInfo();
        C0856s c0856s = this.mAnimationInfo;
        x2 x2Var2 = c0856s.f51419fu4;
        if (x2Var == x2Var2) {
            return;
        }
        if (x2Var != null && x2Var2 != null) {
            throw new IllegalStateException("Trying to set a replacement startPostponedEnterTransition on " + this);
        }
        if (c0856s.f51424ni7) {
            c0856s.f51419fu4 = x2Var;
        }
        if (x2Var != null) {
            x2Var.mo4181k();
        }
    }

    void setPopDirection(boolean z2) {
        if (this.mAnimationInfo == null) {
            return;
        }
        ensureAnimationInfo().f51430zy = z2;
    }

    void setPostOnViewCreatedAlpha(float f2) {
        ensureAnimationInfo().f51418fn3e = f2;
    }

    public void setReenterTransition(@dd Object obj) {
        ensureAnimationInfo().f51423n7h = obj;
    }

    @Deprecated
    public void setRetainInstance(boolean z2) {
        this.mRetainInstance = z2;
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (z2) {
            fragmentManager.n7h(this);
        } else {
            fragmentManager.zwy(this);
        }
    }

    public void setReturnTransition(@dd Object obj) {
        ensureAnimationInfo().f51428x2 = obj;
    }

    public void setSharedElementEnterTransition(@dd Object obj) {
        ensureAnimationInfo().f51421kja0 = obj;
    }

    void setSharedElementNames(@dd ArrayList<String> arrayList, @dd ArrayList<String> arrayList2) {
        ensureAnimationInfo();
        C0856s c0856s = this.mAnimationInfo;
        c0856s.f4674s = arrayList;
        c0856s.f4672p = arrayList2;
    }

    public void setSharedElementReturnTransition(@dd Object obj) {
        ensureAnimationInfo().f4668h = obj;
    }

    @Deprecated
    public void setTargetFragment(@dd Fragment fragment, int i2) {
        FragmentManager fragmentManager = this.mFragmentManager;
        FragmentManager fragmentManager2 = fragment != null ? fragment.mFragmentManager : null;
        if (fragmentManager != null && fragmentManager2 != null && fragmentManager != fragmentManager2) {
            throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
        }
        for (Fragment targetFragment = fragment; targetFragment != null; targetFragment = targetFragment.getTargetFragment()) {
            if (targetFragment.equals(this)) {
                throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
            }
        }
        if (fragment == null) {
            this.mTargetWho = null;
            this.mTarget = null;
        } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
            this.mTargetWho = null;
            this.mTarget = fragment;
        } else {
            this.mTargetWho = fragment.mWho;
            this.mTarget = null;
        }
        this.mTargetRequestCode = i2;
    }

    @Deprecated
    public void setUserVisibleHint(boolean z2) {
        if (!this.mUserVisibleHint && z2 && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            FragmentManager fragmentManager = this.mFragmentManager;
            fragmentManager.b3e(fragmentManager.wvg(this));
        }
        this.mUserVisibleHint = z2;
        this.mDeferStart = this.mState < 5 && !z2;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(z2);
        }
    }

    public boolean shouldShowRequestPermissionRationale(@lvui String str) {
        AbstractC0893s<?> abstractC0893s = this.mHost;
        if (abstractC0893s != null) {
            return abstractC0893s.kja0(str);
        }
        return false;
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent) {
        startActivity(intent, null);
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        startActivityForResult(intent, i2, null);
    }

    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, @dd Intent intent, int i3, int i4, int i5, @dd Bundle bundle) throws IntentSender.SendIntentException {
        if (this.mHost == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        if (FragmentManager.m4(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + i2 + " IntentSender: " + intentSender + " fillInIntent: " + intent + " options: " + bundle);
        }
        getParentFragmentManager().kcsr(this, intentSender, i2, intent, i3, i4, i5, bundle);
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo == null || !ensureAnimationInfo().f51424ni7) {
            return;
        }
        if (this.mHost == null) {
            ensureAnimationInfo().f51424ni7 = false;
        } else if (Looper.myLooper() != this.mHost.f7l8().getLooper()) {
            this.mHost.f7l8().postAtFrontOfQueue(new toq());
        } else {
            callStartTransitionListener(true);
        }
    }

    @lvui
    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public void unregisterForContextMenu(@lvui View view) {
        view.setOnCreateContextMenuListener(null);
    }

    @SuppressLint({"BanParcelableUsage, ParcelClassLoader"})
    public static class SavedState implements Parcelable {

        @lvui
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: androidx.fragment.app.Fragment.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: k */
        final Bundle f4659k;

        SavedState(Bundle bundle) {
            this.f4659k = bundle;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            parcel.writeBundle(this.f4659k);
        }

        SavedState(@lvui Parcel parcel, @dd ClassLoader classLoader) {
            Bundle bundle = parcel.readBundle();
            this.f4659k = bundle;
            if (classLoader == null || bundle == null) {
                return;
            }
            bundle.setClassLoader(classLoader);
        }
    }

    @lvui
    @Deprecated
    public static Fragment instantiate(@lvui Context context, @lvui String str, @dd Bundle bundle) {
        try {
            Fragment fragmentNewInstance = C0903y.m4357q(context.getClassLoader(), str).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (bundle != null) {
                bundle.setClassLoader(fragmentNewInstance.getClass().getClassLoader());
                fragmentNewInstance.setArguments(bundle);
            }
            return fragmentNewInstance;
        } catch (IllegalAccessException e2) {
            throw new C0854p("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (InstantiationException e3) {
            throw new C0854p("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e3);
        } catch (NoSuchMethodException e4) {
            throw new C0854p("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e4);
        } catch (InvocationTargetException e6) {
            throw new C0854p("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e6);
        }
    }

    @lvui
    public final String getString(@nn86 int i2, @dd Object... objArr) {
        return getResources().getString(i2, objArr);
    }

    public final void postponeEnterTransition(long j2, @lvui TimeUnit timeUnit) {
        ensureAnimationInfo().f51424ni7 = true;
        FragmentManager fragmentManager = this.mFragmentManager;
        Handler handlerF7l8 = fragmentManager != null ? fragmentManager.qo().f7l8() : new Handler(Looper.getMainLooper());
        handlerF7l8.removeCallbacks(this.mPostponedDurationRunnable);
        handlerF7l8.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(j2));
    }

    @Override // androidx.activity.result.toq
    @lvui
    @zy.oc
    public final <I, O> AbstractC0067g<I> registerForActivityResult(@lvui AbstractC0059k<I, O> abstractC0059k, @lvui ActivityResultRegistry activityResultRegistry, @lvui InterfaceC0068k<O> interfaceC0068k) {
        return prepareCallInternal(abstractC0059k, new C0851g(activityResultRegistry), interfaceC0068k);
    }

    public void startActivity(@SuppressLint({"UnknownNullness"}) Intent intent, @dd Bundle bundle) {
        AbstractC0893s<?> abstractC0893s = this.mHost;
        if (abstractC0893s != null) {
            abstractC0893s.cdj(this, intent, -1, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, @dd Bundle bundle) {
        if (this.mHost != null) {
            getParentFragmentManager().yqrt(this, intent, i2, bundle);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @lvui
    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public LayoutInflater getLayoutInflater(@dd Bundle bundle) {
        AbstractC0893s<?> abstractC0893s = this.mHost;
        if (abstractC0893s != null) {
            LayoutInflater layoutInflaterMo4319p = abstractC0893s.mo4319p();
            C0690h.m3309q(layoutInflaterMo4319p, this.mChildFragmentManager.tfm());
            return layoutInflaterMo4319p;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    @Deprecated
    @zy.oc
    @InterfaceC7842s
    public void onAttach(@lvui Activity activity) {
        this.mCalled = true;
    }

    @ek5k
    @Deprecated
    @InterfaceC7842s
    public void onInflate(@lvui Activity activity, @lvui AttributeSet attributeSet, @dd Bundle bundle) {
        this.mCalled = true;
    }

    private void restoreViewState() {
        if (FragmentManager.m4(3)) {
            Log.d("FragmentManager", "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            restoreViewState(this.mSavedFragmentState);
        }
        this.mSavedFragmentState = null;
    }

    @zy.kja0
    public Fragment(@zy.gvn7 int i2) {
        this();
        this.mContentLayoutId = i2;
    }
}

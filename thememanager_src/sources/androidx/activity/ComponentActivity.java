package androidx.activity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.contextaware.InterfaceC0046k;
import androidx.activity.contextaware.InterfaceC0047q;
import androidx.activity.result.AbstractC0067g;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.InterfaceC0068k;
import androidx.activity.result.InterfaceC0071y;
import androidx.activity.result.contract.AbstractC0059k;
import androidx.activity.result.contract.toq;
import androidx.core.app.C0447s;
import androidx.core.app.cdj;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.C0942o;
import androidx.lifecycle.InterfaceC0931j;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.ek5k;
import androidx.lifecycle.fn3e;
import androidx.lifecycle.hb;
import androidx.lifecycle.kja0;
import androidx.lifecycle.n5r1;
import androidx.lifecycle.n7h;
import androidx.lifecycle.wvg;
import androidx.savedstate.C1158q;
import androidx.savedstate.InterfaceC1157n;
import androidx.savedstate.f7l8;
import androidx.savedstate.zy;
import java.util.concurrent.atomic.AtomicInteger;
import zy.InterfaceC7842s;
import zy.dd;
import zy.gvn7;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes.dex */
public class ComponentActivity extends cdj implements InterfaceC0046k, InterfaceC0954z, InterfaceC0931j, n7h, InterfaceC1157n, InterfaceC0051n, InterfaceC0071y, androidx.activity.result.toq {
    private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
    private final ActivityResultRegistry mActivityResultRegistry;

    @gvn7
    private int mContentLayoutId;
    final androidx.activity.contextaware.toq mContextAwareHelper;
    private C0924e.toq mDefaultFactory;
    private final wvg mLifecycleRegistry;
    private final AtomicInteger mNextLocalRequestCode;
    private final OnBackPressedDispatcher mOnBackPressedDispatcher;
    final C1158q mSavedStateRegistryController;
    private hb mViewModelStore;

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$k */
    class RunnableC0041k implements Runnable {
        RunnableC0041k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                ComponentActivity.super.onBackPressed();
            } catch (IllegalStateException e2) {
                if (!TextUtils.equals(e2.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                    throw e2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$n */
    static final class C0042n {

        /* JADX INFO: renamed from: k */
        Object f8k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        hb f46338toq;

        C0042n() {
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ComponentActivity$q */
    class C0043q implements InterfaceC0047q {
        C0043q() {
        }

        @Override // androidx.activity.contextaware.InterfaceC0047q
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: k */
        public void mo8k(@lvui Context context) {
            Bundle qVar = ComponentActivity.this.getSavedStateRegistry().toq(ComponentActivity.ACTIVITY_RESULT_TAG);
            if (qVar != null) {
                ComponentActivity.this.mActivityResultRegistry.f7l8(qVar);
            }
        }
    }

    class toq extends ActivityResultRegistry {

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$toq$k */
        class RunnableC0044k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ int f11k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ AbstractC0059k.k f13q;

            RunnableC0044k(int i2, AbstractC0059k.k kVar) {
                this.f11k = i2;
                this.f13q = kVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                toq.this.zy(this.f11k, this.f13q.m37k());
            }
        }

        /* JADX INFO: renamed from: androidx.activity.ComponentActivity$toq$toq, reason: collision with other inner class name */
        class RunnableC7847toq implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ int f14k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ IntentSender.SendIntentException f16q;

            RunnableC7847toq(int i2, IntentSender.SendIntentException sendIntentException) {
                this.f14k = i2;
                this.f16q = sendIntentException;
            }

            @Override // java.lang.Runnable
            public void run() {
                toq.this.toq(this.f14k, 0, new Intent().setAction(toq.ld6.f128k).putExtra(toq.ld6.f46469zy, this.f16q));
            }
        }

        toq() {
        }

        @Override // androidx.activity.result.ActivityResultRegistry
        /* JADX INFO: renamed from: g */
        public <I, O> void mo9g(int i2, @lvui AbstractC0059k<I, O> abstractC0059k, I i3, @dd C0447s c0447s) {
            ComponentActivity componentActivity = ComponentActivity.this;
            AbstractC0059k.k<O> qVar = abstractC0059k.toq(componentActivity, i3);
            if (qVar != null) {
                new Handler(Looper.getMainLooper()).post(new RunnableC0044k(i2, qVar));
                return;
            }
            Intent intentMo36k = abstractC0059k.mo36k(componentActivity, i3);
            Bundle bundleX2 = null;
            if (intentMo36k.getExtras() != null && intentMo36k.getExtras().getClassLoader() == null) {
                intentMo36k.setExtrasClassLoader(componentActivity.getClassLoader());
            }
            if (intentMo36k.hasExtra(toq.C0063p.f129k)) {
                bundleX2 = intentMo36k.getBundleExtra(toq.C0063p.f129k);
                intentMo36k.removeExtra(toq.C0063p.f129k);
            } else if (c0447s != null) {
                bundleX2 = c0447s.x2();
            }
            Bundle bundle = bundleX2;
            if (toq.C0066y.f130k.equals(intentMo36k.getAction())) {
                String[] stringArrayExtra = intentMo36k.getStringArrayExtra(toq.C0066y.f46470toq);
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                androidx.core.app.toq.jp0y(componentActivity, stringArrayExtra, i2);
                return;
            }
            if (!toq.ld6.f128k.equals(intentMo36k.getAction())) {
                androidx.core.app.toq.m1984r(componentActivity, intentMo36k, i2, bundle);
                return;
            }
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) intentMo36k.getParcelableExtra(toq.ld6.f46468toq);
            try {
                androidx.core.app.toq.dd(componentActivity, intentSenderRequest.getIntentSender(), i2, intentSenderRequest.getFillInIntent(), intentSenderRequest.m33k(), intentSenderRequest.toq(), 0, bundle);
            } catch (IntentSender.SendIntentException e2) {
                new Handler(Looper.getMainLooper()).post(new RunnableC7847toq(i2, e2));
            }
        }
    }

    class zy implements zy.InterfaceC7893zy {
        zy() {
        }

        @Override // androidx.savedstate.zy.InterfaceC7893zy
        @lvui
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: k */
        public Bundle mo10k() {
            Bundle bundle = new Bundle();
            ComponentActivity.this.mActivityResultRegistry.m29y(bundle);
            return bundle;
        }
    }

    public ComponentActivity() {
        this.mContextAwareHelper = new androidx.activity.contextaware.toq();
        this.mLifecycleRegistry = new wvg(this);
        this.mSavedStateRegistryController = C1158q.m5233k(this);
        this.mOnBackPressedDispatcher = new OnBackPressedDispatcher(new RunnableC0041k());
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mActivityResultRegistry = new toq();
        if (getLifecycle() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycle().mo4451k(new fn3e() { // from class: androidx.activity.ComponentActivity.3
            @Override // androidx.lifecycle.fn3e
            public void gvn7(@lvui InterfaceC0954z interfaceC0954z, @lvui kja0.toq toqVar) {
                if (toqVar == kja0.toq.ON_STOP) {
                    Window window = ComponentActivity.this.getWindow();
                    View viewPeekDecorView = window != null ? window.peekDecorView() : null;
                    if (viewPeekDecorView != null) {
                        viewPeekDecorView.cancelPendingInputEvents();
                    }
                }
            }
        });
        getLifecycle().mo4451k(new fn3e() { // from class: androidx.activity.ComponentActivity.4
            @Override // androidx.lifecycle.fn3e
            public void gvn7(@lvui InterfaceC0954z interfaceC0954z, @lvui kja0.toq toqVar) {
                if (toqVar == kja0.toq.ON_DESTROY) {
                    ComponentActivity.this.mContextAwareHelper.toq();
                    if (ComponentActivity.this.isChangingConfigurations()) {
                        return;
                    }
                    ComponentActivity.this.getViewModelStore().m4441k();
                }
            }
        });
        getLifecycle().mo4451k(new fn3e() { // from class: androidx.activity.ComponentActivity.5
            @Override // androidx.lifecycle.fn3e
            public void gvn7(@lvui InterfaceC0954z interfaceC0954z, @lvui kja0.toq toqVar) {
                ComponentActivity.this.ensureViewModelStore();
                ComponentActivity.this.getLifecycle().zy(this);
            }
        });
        getSavedStateRegistry().m5240p(ACTIVITY_RESULT_TAG, new zy());
        addOnContextAvailableListener(new C0043q());
    }

    private void initViewTreeOwners() {
        C0942o.toq(getWindow().getDecorView(), this);
        ek5k.toq(getWindow().getDecorView(), this);
        f7l8.toq(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void addContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.addContentView(view, layoutParams);
    }

    @Override // androidx.activity.contextaware.InterfaceC0046k
    public final void addOnContextAvailableListener(@lvui InterfaceC0047q interfaceC0047q) {
        this.mContextAwareHelper.m15k(interfaceC0047q);
    }

    void ensureViewModelStore() {
        if (this.mViewModelStore == null) {
            C0042n c0042n = (C0042n) getLastNonConfigurationInstance();
            if (c0042n != null) {
                this.mViewModelStore = c0042n.f46338toq;
            }
            if (this.mViewModelStore == null) {
                this.mViewModelStore = new hb();
            }
        }
    }

    @Override // androidx.activity.result.InterfaceC0071y
    @lvui
    public final ActivityResultRegistry getActivityResultRegistry() {
        return this.mActivityResultRegistry;
    }

    @Override // androidx.lifecycle.n7h
    @lvui
    public C0924e.toq getDefaultViewModelProviderFactory() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        if (this.mDefaultFactory == null) {
            this.mDefaultFactory = new n5r1(getApplication(), this, getIntent() != null ? getIntent().getExtras() : null);
        }
        return this.mDefaultFactory;
    }

    @Deprecated
    @dd
    public Object getLastCustomNonConfigurationInstance() {
        C0042n c0042n = (C0042n) getLastNonConfigurationInstance();
        if (c0042n != null) {
            return c0042n.f8k;
        }
        return null;
    }

    @Override // androidx.core.app.cdj, androidx.lifecycle.InterfaceC0954z
    @lvui
    public kja0 getLifecycle() {
        return this.mLifecycleRegistry;
    }

    @Override // androidx.activity.InterfaceC0051n
    @lvui
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.mOnBackPressedDispatcher;
    }

    @Override // androidx.savedstate.InterfaceC1157n
    @lvui
    public final androidx.savedstate.zy getSavedStateRegistry() {
        return this.mSavedStateRegistryController.toq();
    }

    @Override // androidx.lifecycle.InterfaceC0931j
    @lvui
    public hb getViewModelStore() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        ensureViewModelStore();
        return this.mViewModelStore;
    }

    @Override // android.app.Activity
    @Deprecated
    @InterfaceC7842s
    protected void onActivityResult(int i2, int i3, @dd Intent intent) {
        if (this.mActivityResultRegistry.toq(i2, i3, intent)) {
            return;
        }
        super.onActivityResult(i2, i3, intent);
    }

    @Override // android.app.Activity
    @oc
    public void onBackPressed() {
        this.mOnBackPressedDispatcher.m13n();
    }

    @Override // androidx.core.app.cdj, android.app.Activity
    protected void onCreate(@dd Bundle bundle) {
        this.mSavedStateRegistryController.m5235q(bundle);
        this.mContextAwareHelper.zy(this);
        super.onCreate(bundle);
        androidx.lifecycle.lvui.f7l8(this);
        int i2 = this.mContentLayoutId;
        if (i2 != 0) {
            setContentView(i2);
        }
    }

    @Override // android.app.Activity
    @Deprecated
    @InterfaceC7842s
    public void onRequestPermissionsResult(int i2, @lvui String[] strArr, @lvui int[] iArr) {
        if (this.mActivityResultRegistry.toq(i2, -1, new Intent().putExtra(toq.C0066y.f46470toq, strArr).putExtra(toq.C0066y.f46471zy, iArr))) {
            return;
        }
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Deprecated
    @dd
    public Object onRetainCustomNonConfigurationInstance() {
        return null;
    }

    @Override // android.app.Activity
    @dd
    public final Object onRetainNonConfigurationInstance() {
        C0042n c0042n;
        Object objOnRetainCustomNonConfigurationInstance = onRetainCustomNonConfigurationInstance();
        hb hbVar = this.mViewModelStore;
        if (hbVar == null && (c0042n = (C0042n) getLastNonConfigurationInstance()) != null) {
            hbVar = c0042n.f46338toq;
        }
        if (hbVar == null && objOnRetainCustomNonConfigurationInstance == null) {
            return null;
        }
        C0042n c0042n2 = new C0042n();
        c0042n2.f8k = objOnRetainCustomNonConfigurationInstance;
        c0042n2.f46338toq = hbVar;
        return c0042n2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.core.app.cdj, android.app.Activity
    @InterfaceC7842s
    public void onSaveInstanceState(@lvui Bundle bundle) {
        kja0 lifecycle = getLifecycle();
        if (lifecycle instanceof wvg) {
            ((wvg) lifecycle).cdj(kja0.zy.CREATED);
        }
        super.onSaveInstanceState(bundle);
        this.mSavedStateRegistryController.m5234n(bundle);
    }

    @Override // androidx.activity.contextaware.InterfaceC0046k
    @dd
    public Context peekAvailableContext() {
        return this.mContextAwareHelper.m17q();
    }

    @Override // androidx.activity.result.toq
    @lvui
    public final <I, O> AbstractC0067g<I> registerForActivityResult(@lvui AbstractC0059k<I, O> abstractC0059k, @lvui ActivityResultRegistry activityResultRegistry, @lvui InterfaceC0068k<O> interfaceC0068k) {
        return activityResultRegistry.m27p("activity_rq#" + this.mNextLocalRequestCode.getAndIncrement(), this, abstractC0059k, interfaceC0068k);
    }

    @Override // androidx.activity.contextaware.InterfaceC0046k
    public final void removeOnContextAvailableListener(@lvui InterfaceC0047q interfaceC0047q) {
        this.mContextAwareHelper.m16n(interfaceC0047q);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (androidx.tracing.toq.m5296y()) {
                androidx.tracing.toq.zy("reportFullyDrawn() for " + getComponentName());
            }
            super.reportFullyDrawn();
        } finally {
            androidx.tracing.toq.m5290g();
        }
    }

    @Override // android.app.Activity
    public void setContentView(@gvn7 int i2) {
        initViewTreeOwners();
        super.setContentView(i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        super.startActivityForResult(intent, i2);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, @dd Intent intent, int i3, int i4, int i5) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startActivityForResult(@SuppressLint({"UnknownNullness"}) Intent intent, int i2, @dd Bundle bundle) {
        super.startActivityForResult(intent, i2, bundle);
    }

    @Override // android.app.Activity
    @Deprecated
    public void startIntentSenderForResult(@SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, @dd Intent intent, int i3, int i4, int i5, @dd Bundle bundle) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view) {
        initViewTreeOwners();
        super.setContentView(view);
    }

    @Override // androidx.activity.result.toq
    @lvui
    public final <I, O> AbstractC0067g<I> registerForActivityResult(@lvui AbstractC0059k<I, O> abstractC0059k, @lvui InterfaceC0068k<O> interfaceC0068k) {
        return registerForActivityResult(abstractC0059k, this.mActivityResultRegistry, interfaceC0068k);
    }

    @Override // android.app.Activity
    public void setContentView(@SuppressLint({"UnknownNullness", "MissingNullability"}) View view, @SuppressLint({"UnknownNullness", "MissingNullability"}) ViewGroup.LayoutParams layoutParams) {
        initViewTreeOwners();
        super.setContentView(view, layoutParams);
    }

    @zy.kja0
    public ComponentActivity(@gvn7 int i2) {
        this();
        this.mContentLayoutId = i2;
    }
}

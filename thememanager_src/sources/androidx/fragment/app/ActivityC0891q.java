package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;
import androidx.activity.InterfaceC0051n;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.contextaware.InterfaceC0047q;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.InterfaceC0071y;
import androidx.core.app.toq;
import androidx.core.app.y2;
import androidx.lifecycle.InterfaceC0931j;
import androidx.lifecycle.hb;
import androidx.lifecycle.kja0;
import androidx.loader.app.AbstractC0956k;
import androidx.savedstate.zy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import zy.InterfaceC7842s;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.fragment.app.q */
/* JADX INFO: compiled from: FragmentActivity.java */
/* JADX INFO: loaded from: classes.dex */
public class ActivityC0891q extends ComponentActivity implements toq.InterfaceC0455s, toq.ld6 {
    static final String FRAGMENTS_TAG = "android:support:fragments";
    boolean mCreated;
    final androidx.lifecycle.wvg mFragmentLifecycleRegistry;
    final f7l8 mFragments;
    boolean mResumed;
    boolean mStopped;

    /* JADX INFO: renamed from: androidx.fragment.app.q$k */
    /* JADX INFO: compiled from: FragmentActivity.java */
    class k implements zy.InterfaceC7893zy {
        k() {
        }

        @Override // androidx.savedstate.zy.InterfaceC7893zy
        @lvui
        /* JADX INFO: renamed from: k */
        public Bundle mo10k() {
            Bundle bundle = new Bundle();
            ActivityC0891q.this.markFragmentsCreated();
            ActivityC0891q.this.mFragmentLifecycleRegistry.m4480p(kja0.toq.ON_STOP);
            Parcelable parcelableX9kr = ActivityC0891q.this.mFragments.x9kr();
            if (parcelableX9kr != null) {
                bundle.putParcelable(ActivityC0891q.FRAGMENTS_TAG, parcelableX9kr);
            }
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$toq */
    /* JADX INFO: compiled from: FragmentActivity.java */
    class toq implements InterfaceC0047q {
        toq() {
        }

        @Override // androidx.activity.contextaware.InterfaceC0047q
        /* JADX INFO: renamed from: k */
        public void mo8k(@lvui Context context) {
            ActivityC0891q.this.mFragments.m4262k(null);
            Bundle qVar = ActivityC0891q.this.getSavedStateRegistry().toq(ActivityC0891q.FRAGMENTS_TAG);
            if (qVar != null) {
                ActivityC0891q.this.mFragments.d2ok(qVar.getParcelable(ActivityC0891q.FRAGMENTS_TAG));
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.q$zy */
    /* JADX INFO: compiled from: FragmentActivity.java */
    class zy extends AbstractC0893s<ActivityC0891q> implements InterfaceC0931j, InterfaceC0051n, InterfaceC0071y, ki {
        public zy() {
            super(ActivityC0891q.this);
        }

        @Override // androidx.activity.result.InterfaceC0071y
        @lvui
        public ActivityResultRegistry getActivityResultRegistry() {
            return ActivityC0891q.this.getActivityResultRegistry();
        }

        @Override // androidx.lifecycle.InterfaceC0954z
        @lvui
        public androidx.lifecycle.kja0 getLifecycle() {
            return ActivityC0891q.this.mFragmentLifecycleRegistry;
        }

        @Override // androidx.activity.InterfaceC0051n
        @lvui
        public OnBackPressedDispatcher getOnBackPressedDispatcher() {
            return ActivityC0891q.this.getOnBackPressedDispatcher();
        }

        @Override // androidx.lifecycle.InterfaceC0931j
        @lvui
        public hb getViewModelStore() {
            return ActivityC0891q.this.getViewModelStore();
        }

        @Override // androidx.fragment.app.AbstractC0893s
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public ActivityC0891q mo4320s() {
            return ActivityC0891q.this;
        }

        @Override // androidx.fragment.app.ki
        /* JADX INFO: renamed from: k */
        public void mo4223k(@lvui FragmentManager fragmentManager, @lvui Fragment fragment) {
            ActivityC0891q.this.onAttachFragment(fragment);
        }

        @Override // androidx.fragment.app.AbstractC0893s
        public boolean kja0(@lvui String str) {
            return androidx.core.app.toq.lvui(ActivityC0891q.this, str);
        }

        @Override // androidx.fragment.app.AbstractC0893s
        public int ld6() {
            Window window = ActivityC0891q.this.getWindow();
            if (window == null) {
                return 0;
            }
            return window.getAttributes().windowAnimations;
        }

        @Override // androidx.fragment.app.AbstractC0893s
        public boolean n7h(@lvui Fragment fragment) {
            return !ActivityC0891q.this.isFinishing();
        }

        @Override // androidx.fragment.app.AbstractC0893s
        @lvui
        /* JADX INFO: renamed from: p */
        public LayoutInflater mo4319p() {
            return ActivityC0891q.this.getLayoutInflater().cloneInContext(ActivityC0891q.this);
        }

        @Override // androidx.fragment.app.AbstractC0893s, androidx.fragment.app.AbstractC0879g
        /* JADX INFO: renamed from: q */
        public boolean mo4180q() {
            Window window = ActivityC0891q.this.getWindow();
            return (window == null || window.peekDecorView() == null) ? false : true;
        }

        @Override // androidx.fragment.app.AbstractC0893s
        public void t8r() {
            ActivityC0891q.this.supportInvalidateOptionsMenu();
        }

        @Override // androidx.fragment.app.AbstractC0893s
        public boolean x2() {
            return ActivityC0891q.this.getWindow() != null;
        }

        @Override // androidx.fragment.app.AbstractC0893s
        /* JADX INFO: renamed from: y */
        public void mo4321y(@lvui String str, @dd FileDescriptor fileDescriptor, @lvui PrintWriter printWriter, @dd String[] strArr) {
            ActivityC0891q.this.dump(str, fileDescriptor, printWriter, strArr);
        }

        @Override // androidx.fragment.app.AbstractC0893s, androidx.fragment.app.AbstractC0879g
        @dd
        public View zy(int i2) {
            return ActivityC0891q.this.findViewById(i2);
        }
    }

    public ActivityC0891q() {
        this.mFragments = f7l8.toq(new zy());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.wvg(this);
        this.mStopped = true;
        init();
    }

    private void init() {
        getSavedStateRegistry().m5240p(FRAGMENTS_TAG, new k());
        addOnContextAvailableListener(new toq());
    }

    private static boolean markState(FragmentManager fragmentManager, kja0.zy zyVar) {
        boolean zMarkState = false;
        for (Fragment fragment : fragmentManager.fnq8()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    zMarkState |= markState(fragment.getChildFragmentManager(), zyVar);
                }
                a9 a9Var = fragment.mViewLifecycleOwner;
                if (a9Var != null && a9Var.getLifecycle().toq().isAtLeast(kja0.zy.STARTED)) {
                    fragment.mViewLifecycleOwner.m4233g(zyVar);
                    zMarkState = true;
                }
                if (fragment.mLifecycleRegistry.toq().isAtLeast(kja0.zy.STARTED)) {
                    fragment.mLifecycleRegistry.cdj(zyVar);
                    zMarkState = true;
                }
            }
        }
        return zMarkState;
    }

    @dd
    final View dispatchFragmentsOnCreateView(@dd View view, @lvui String str, @lvui Context context, @lvui AttributeSet attributeSet) {
        return this.mFragments.jp0y(view, str, context, attributeSet);
    }

    @Override // android.app.Activity
    public void dump(@lvui String str, @dd FileDescriptor fileDescriptor, @lvui PrintWriter printWriter, @dd String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        printWriter.print(str);
        printWriter.print("Local FragmentActivity ");
        printWriter.print(Integer.toHexString(System.identityHashCode(this)));
        printWriter.println(" State:");
        String str2 = str + "  ";
        printWriter.print(str2);
        printWriter.print("mCreated=");
        printWriter.print(this.mCreated);
        printWriter.print(" mResumed=");
        printWriter.print(this.mResumed);
        printWriter.print(" mStopped=");
        printWriter.print(this.mStopped);
        if (getApplication() != null) {
            AbstractC0956k.m4499q(this).toq(str2, fileDescriptor, printWriter, strArr);
        }
        this.mFragments.jk().hb(str, fileDescriptor, printWriter, strArr);
    }

    @lvui
    public FragmentManager getSupportFragmentManager() {
        return this.mFragments.jk();
    }

    @lvui
    @Deprecated
    public AbstractC0956k getSupportLoaderManager() {
        return AbstractC0956k.m4499q(this);
    }

    void markFragmentsCreated() {
        while (markState(getSupportFragmentManager(), kja0.zy.CREATED)) {
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC7842s
    protected void onActivityResult(int i2, int i3, @dd Intent intent) {
        this.mFragments.fti();
        super.onActivityResult(i2, i3, intent);
    }

    @Deprecated
    @zy.oc
    public void onAttachFragment(@lvui Fragment fragment) {
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(@lvui Configuration configuration) {
        this.mFragments.fti();
        super.onConfigurationChanged(configuration);
        this.mFragments.m4265q(configuration);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.cdj, android.app.Activity
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        this.mFragmentLifecycleRegistry.m4480p(kja0.toq.ON_CREATE);
        this.mFragments.m4259g();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int i2, @lvui Menu menu) {
        return i2 == 0 ? super.onCreatePanelMenu(i2, menu) | this.mFragments.f7l8(menu, getMenuInflater()) : super.onCreatePanelMenu(i2, menu);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    @dd
    public View onCreateView(@dd View view, @lvui String str, @lvui Context context, @lvui AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(view, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.mFragments.m4269y();
        this.mFragmentLifecycleRegistry.m4480p(kja0.toq.ON_DESTROY);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
        this.mFragments.m4264p();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int i2, @lvui MenuItem menuItem) {
        if (super.onMenuItemSelected(i2, menuItem)) {
            return true;
        }
        if (i2 == 0) {
            return this.mFragments.x2(menuItem);
        }
        if (i2 != 6) {
            return false;
        }
        return this.mFragments.m4263n(menuItem);
    }

    @Override // android.app.Activity
    @InterfaceC7842s
    public void onMultiWindowModeChanged(boolean z2) {
        this.mFragments.ld6(z2);
    }

    @Override // android.app.Activity
    @InterfaceC7842s
    protected void onNewIntent(@SuppressLint({"UnknownNullness"}) Intent intent) {
        this.mFragments.fti();
        super.onNewIntent(intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i2, @lvui Menu menu) {
        if (i2 == 0) {
            this.mFragments.qrj(menu);
        }
        super.onPanelClosed(i2, menu);
    }

    @Override // android.app.Activity
    protected void onPause() {
        super.onPause();
        this.mResumed = false;
        this.mFragments.n7h();
        this.mFragmentLifecycleRegistry.m4480p(kja0.toq.ON_PAUSE);
    }

    @Override // android.app.Activity
    @InterfaceC7842s
    public void onPictureInPictureModeChanged(boolean z2) {
        this.mFragments.kja0(z2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        onResumeFragments();
    }

    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    protected boolean onPrepareOptionsPanel(@dd View view, @lvui Menu menu) {
        return super.onPreparePanel(0, view, menu);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int i2, @dd View view, @lvui Menu menu) {
        return i2 == 0 ? onPrepareOptionsPanel(view, menu) | this.mFragments.m4260h(menu) : super.onPreparePanel(i2, view, menu);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    @InterfaceC7842s
    public void onRequestPermissionsResult(int i2, @lvui String[] strArr, @lvui int[] iArr) {
        this.mFragments.fti();
        super.onRequestPermissionsResult(i2, strArr, iArr);
    }

    @Override // android.app.Activity
    protected void onResume() {
        this.mFragments.fti();
        super.onResume();
        this.mResumed = true;
        this.mFragments.o1t();
    }

    protected void onResumeFragments() {
        this.mFragmentLifecycleRegistry.m4480p(kja0.toq.ON_RESUME);
        this.mFragments.ki();
    }

    @Override // android.app.Activity
    protected void onStart() {
        this.mFragments.fti();
        super.onStart();
        this.mStopped = false;
        if (!this.mCreated) {
            this.mCreated = true;
            this.mFragments.zy();
        }
        this.mFragments.o1t();
        this.mFragmentLifecycleRegistry.m4480p(kja0.toq.ON_START);
        this.mFragments.t8r();
    }

    @Override // android.app.Activity
    public void onStateNotSaved() {
        this.mFragments.fti();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.mStopped = true;
        markFragmentsCreated();
        this.mFragments.m4261i();
        this.mFragmentLifecycleRegistry.m4480p(kja0.toq.ON_STOP);
    }

    public void setEnterSharedElementCallback(@dd y2 y2Var) {
        androidx.core.app.toq.d3(this, y2Var);
    }

    public void setExitSharedElementCallback(@dd y2 y2Var) {
        androidx.core.app.toq.oc(this, y2Var);
    }

    public void startActivityFromFragment(@lvui Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2) {
        startActivityFromFragment(fragment, intent, i2, (Bundle) null);
    }

    @Deprecated
    public void startIntentSenderFromFragment(@lvui Fragment fragment, @SuppressLint({"UnknownNullness"}) IntentSender intentSender, int i2, @dd Intent intent, int i3, int i4, int i5, @dd Bundle bundle) throws IntentSender.SendIntentException {
        if (i2 == -1) {
            androidx.core.app.toq.dd(this, intentSender, i2, intent, i3, i4, i5, bundle);
        } else {
            fragment.startIntentSenderForResult(intentSender, i2, intent, i3, i4, i5, bundle);
        }
    }

    public void supportFinishAfterTransition() {
        androidx.core.app.toq.fu4(this);
    }

    @Deprecated
    public void supportInvalidateOptionsMenu() {
        invalidateOptionsMenu();
    }

    public void supportPostponeEnterTransition() {
        androidx.core.app.toq.jk(this);
    }

    public void supportStartPostponedEnterTransition() {
        androidx.core.app.toq.x9kr(this);
    }

    @Override // androidx.core.app.toq.ld6
    @Deprecated
    public final void validateRequestPermissionsRequestCode(int i2) {
    }

    public void startActivityFromFragment(@lvui Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i2, @dd Bundle bundle) {
        if (i2 == -1) {
            androidx.core.app.toq.m1984r(this, intent, -1, bundle);
        } else {
            fragment.startActivityForResult(intent, i2, bundle);
        }
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    @dd
    public View onCreateView(@lvui String str, @lvui Context context, @lvui AttributeSet attributeSet) {
        View viewDispatchFragmentsOnCreateView = dispatchFragmentsOnCreateView(null, str, context, attributeSet);
        return viewDispatchFragmentsOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewDispatchFragmentsOnCreateView;
    }

    @zy.kja0
    public ActivityC0891q(@zy.gvn7 int i2) {
        super(i2);
        this.mFragments = f7l8.toq(new zy());
        this.mFragmentLifecycleRegistry = new androidx.lifecycle.wvg(this);
        this.mStopped = true;
        init();
    }
}

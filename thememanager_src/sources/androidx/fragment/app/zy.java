package androidx.fragment.app;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.C0942o;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.ek5k;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: DialogFragment.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends Fragment implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {

    /* JADX INFO: renamed from: a */
    private static final String f4966a = "android:savedDialogState";

    /* JADX INFO: renamed from: b */
    public static final int f4967b = 3;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f51555bo = "android:cancelable";

    /* JADX INFO: renamed from: d */
    private static final String f4968d = "android:backStackId";

    /* JADX INFO: renamed from: j */
    public static final int f4969j = 0;

    /* JADX INFO: renamed from: m */
    public static final int f4970m = 2;

    /* JADX INFO: renamed from: o */
    public static final int f4971o = 1;

    /* JADX INFO: renamed from: u */
    private static final String f4972u = "android:theme";

    /* JADX INFO: renamed from: v */
    private static final String f4973v = "android:showsDialog";

    /* JADX INFO: renamed from: w */
    private static final String f4974w = "android:dialogShowing";

    /* JADX INFO: renamed from: x */
    private static final String f4975x = "android:style";

    /* JADX INFO: renamed from: c */
    private boolean f4976c;

    /* JADX INFO: renamed from: e */
    private boolean f4977e;

    /* JADX INFO: renamed from: f */
    private boolean f4978f;

    /* JADX INFO: renamed from: g */
    private DialogInterface.OnDismissListener f4979g;

    /* JADX INFO: renamed from: h */
    private boolean f4980h;

    /* JADX INFO: renamed from: i */
    private int f4981i;

    /* JADX INFO: renamed from: k */
    private Handler f4982k;

    /* JADX INFO: renamed from: l */
    private boolean f4983l;

    /* JADX INFO: renamed from: n */
    private DialogInterface.OnCancelListener f4984n;

    /* JADX INFO: renamed from: p */
    private boolean f4985p;

    /* JADX INFO: renamed from: q */
    private Runnable f4986q;

    /* JADX INFO: renamed from: r */
    @dd
    private Dialog f4987r;

    /* JADX INFO: renamed from: s */
    private int f4988s;

    /* JADX INFO: renamed from: t */
    private androidx.lifecycle.jp0y<InterfaceC0954z> f4989t;

    /* JADX INFO: renamed from: y */
    private int f4990y;

    /* JADX INFO: renamed from: z */
    private boolean f4991z;

    /* JADX INFO: renamed from: androidx.fragment.app.zy$k */
    /* JADX INFO: compiled from: DialogFragment.java */
    class RunnableC0906k implements Runnable {
        RunnableC0906k() {
        }

        @Override // java.lang.Runnable
        @SuppressLint({"SyntheticAccessor"})
        public void run() {
            zy.this.f4979g.onDismiss(zy.this.f4987r);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.zy$n */
    /* JADX INFO: compiled from: DialogFragment.java */
    class C0907n extends AbstractC0879g {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AbstractC0879g f4993k;

        C0907n(AbstractC0879g abstractC0879g) {
            this.f4993k = abstractC0879g;
        }

        @Override // androidx.fragment.app.AbstractC0879g
        /* JADX INFO: renamed from: q */
        public boolean mo4180q() {
            return this.f4993k.mo4180q() || zy.this.kiv();
        }

        @Override // androidx.fragment.app.AbstractC0879g
        @dd
        public View zy(int i2) {
            return this.f4993k.mo4180q() ? this.f4993k.zy(i2) : zy.this.uf(i2);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.zy$q */
    /* JADX INFO: compiled from: DialogFragment.java */
    class C0908q implements androidx.lifecycle.jp0y<InterfaceC0954z> {
        C0908q() {
        }

        @Override // androidx.lifecycle.jp0y
        @SuppressLint({"SyntheticAccessor"})
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void toq(InterfaceC0954z interfaceC0954z) {
            if (interfaceC0954z == null || !zy.this.f4980h) {
                return;
            }
            View viewRequireView = zy.this.requireView();
            if (viewRequireView.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (zy.this.f4987r != null) {
                if (FragmentManager.m4(3)) {
                    Log.d("FragmentManager", "DialogFragment " + this + " setting the content view on " + zy.this.f4987r);
                }
                zy.this.f4987r.setContentView(viewRequireView);
            }
        }
    }

    /* JADX INFO: compiled from: DialogFragment.java */
    class toq implements DialogInterface.OnCancelListener {
        toq() {
        }

        @Override // android.content.DialogInterface.OnCancelListener
        @SuppressLint({"SyntheticAccessor"})
        public void onCancel(@dd DialogInterface dialogInterface) {
            if (zy.this.f4987r != null) {
                zy zyVar = zy.this;
                zyVar.onCancel(zyVar.f4987r);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DialogFragment.java */
    class DialogInterfaceOnDismissListenerC7881zy implements DialogInterface.OnDismissListener {
        DialogInterfaceOnDismissListenerC7881zy() {
        }

        @Override // android.content.DialogInterface.OnDismissListener
        @SuppressLint({"SyntheticAccessor"})
        public void onDismiss(@dd DialogInterface dialogInterface) {
            if (zy.this.f4987r != null) {
                zy zyVar = zy.this;
                zyVar.onDismiss(zyVar.f4987r);
            }
        }
    }

    public zy() {
        this.f4986q = new RunnableC0906k();
        this.f4984n = new toq();
        this.f4979g = new DialogInterfaceOnDismissListenerC7881zy();
        this.f4990y = 0;
        this.f4988s = 0;
        this.f4985p = true;
        this.f4980h = true;
        this.f4981i = -1;
        this.f4989t = new C0908q();
        this.f4977e = false;
    }

    private void m2t(boolean z2, boolean z3) {
        if (this.f4978f) {
            return;
        }
        this.f4978f = true;
        this.f4976c = false;
        Dialog dialog = this.f4987r;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.f4987r.dismiss();
            if (!z3) {
                if (Looper.myLooper() == this.f4982k.getLooper()) {
                    onDismiss(this.f4987r);
                } else {
                    this.f4982k.post(this.f4986q);
                }
            }
        }
        this.f4983l = true;
        if (this.f4981i >= 0) {
            getParentFragmentManager().cv06(this.f4981i, 1);
            this.f4981i = -1;
            return;
        }
        o1t o1tVarKi = getParentFragmentManager().ki();
        o1tVarKi.fu4(this);
        if (z2) {
            o1tVarKi.n7h();
        } else {
            o1tVarKi.qrj();
        }
    }

    private void z4t(@dd Bundle bundle) {
        if (this.f4980h && !this.f4977e) {
            try {
                this.f4991z = true;
                Dialog dialogNnh = nnh(bundle);
                this.f4987r = dialogNnh;
                if (this.f4980h) {
                    rp(dialogNnh, this.f4990y);
                    Context context = getContext();
                    if (context instanceof Activity) {
                        this.f4987r.setOwnerActivity((Activity) context);
                    }
                    this.f4987r.setCancelable(this.f4985p);
                    this.f4987r.setOnCancelListener(this.f4984n);
                    this.f4987r.setOnDismissListener(this.f4979g);
                    this.f4977e = true;
                } else {
                    this.f4987r = null;
                }
            } finally {
                this.f4991z = false;
            }
        }
    }

    @lvui
    public final Dialog bih() {
        Dialog dialogU38j = u38j();
        if (dialogU38j != null) {
            return dialogU38j;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // androidx.fragment.app.Fragment
    @lvui
    AbstractC0879g createFragmentContainer() {
        return new C0907n(super.createFragmentContainer());
    }

    public void cyoe(@lvui FragmentManager fragmentManager, @dd String str) {
        this.f4978f = false;
        this.f4976c = true;
        o1t o1tVarKi = fragmentManager.ki();
        o1tVarKi.f7l8(this, str);
        o1tVarKi.qrj();
    }

    public void ec(boolean z2) {
        this.f4985p = z2;
        Dialog dialog = this.f4987r;
        if (dialog != null) {
            dialog.setCancelable(z2);
        }
    }

    boolean kiv() {
        return this.f4977e;
    }

    public void kx3() {
        m2t(false, false);
    }

    public int l05(@lvui o1t o1tVar, @dd String str) {
        this.f4978f = false;
        this.f4976c = true;
        o1tVar.f7l8(this, str);
        this.f4983l = false;
        int iQrj = o1tVar.qrj();
        this.f4981i = iQrj;
        return iQrj;
    }

    @lvui
    @zy.oc
    public Dialog nnh(@dd Bundle bundle) {
        if (FragmentManager.m4(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new Dialog(requireContext(), v5yj());
    }

    public void o5(boolean z2) {
        this.f4980h = z2;
    }

    @Override // androidx.fragment.app.Fragment
    @zy.oc
    public void onAttach(@lvui Context context) {
        super.onAttach(context);
        getViewLifecycleOwnerLiveData().ld6(this.f4989t);
        if (this.f4976c) {
            return;
        }
        this.f4978f = false;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(@lvui DialogInterface dialogInterface) {
    }

    @Override // androidx.fragment.app.Fragment
    @zy.oc
    public void onCreate(@dd Bundle bundle) {
        super.onCreate(bundle);
        this.f4982k = new Handler();
        this.f4980h = this.mContainerId == 0;
        if (bundle != null) {
            this.f4990y = bundle.getInt(f4975x, 0);
            this.f4988s = bundle.getInt(f4972u, 0);
            this.f4985p = bundle.getBoolean(f51555bo, true);
            this.f4980h = bundle.getBoolean(f4973v, this.f4980h);
            this.f4981i = bundle.getInt(f4968d, -1);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @zy.oc
    public void onDestroyView() {
        super.onDestroyView();
        Dialog dialog = this.f4987r;
        if (dialog != null) {
            this.f4983l = true;
            dialog.setOnDismissListener(null);
            this.f4987r.dismiss();
            if (!this.f4978f) {
                onDismiss(this.f4987r);
            }
            this.f4987r = null;
            this.f4977e = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    @zy.oc
    public void onDetach() {
        super.onDetach();
        if (!this.f4976c && !this.f4978f) {
            this.f4978f = true;
        }
        getViewLifecycleOwnerLiveData().kja0(this.f4989t);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(@lvui DialogInterface dialogInterface) {
        if (this.f4983l) {
            return;
        }
        if (FragmentManager.m4(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        m2t(true, true);
    }

    @Override // androidx.fragment.app.Fragment
    @lvui
    public LayoutInflater onGetLayoutInflater(@dd Bundle bundle) {
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(bundle);
        if (this.f4980h && !this.f4991z) {
            z4t(bundle);
            if (FragmentManager.m4(2)) {
                Log.d("FragmentManager", "get layout inflater for DialogFragment " + this + " from dialog context");
            }
            Dialog dialog = this.f4987r;
            return dialog != null ? layoutInflaterOnGetLayoutInflater.cloneInContext(dialog.getContext()) : layoutInflaterOnGetLayoutInflater;
        }
        if (FragmentManager.m4(2)) {
            String str = "getting layout inflater for DialogFragment " + this;
            if (this.f4980h) {
                Log.d("FragmentManager", "mCreatingDialog = true: " + str);
            } else {
                Log.d("FragmentManager", "mShowsDialog = false: " + str);
            }
        }
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // androidx.fragment.app.Fragment
    @zy.oc
    public void onSaveInstanceState(@lvui Bundle bundle) {
        super.onSaveInstanceState(bundle);
        Dialog dialog = this.f4987r;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean(f4974w, false);
            bundle.putBundle(f4966a, bundleOnSaveInstanceState);
        }
        int i2 = this.f4990y;
        if (i2 != 0) {
            bundle.putInt(f4975x, i2);
        }
        int i3 = this.f4988s;
        if (i3 != 0) {
            bundle.putInt(f4972u, i3);
        }
        boolean z2 = this.f4985p;
        if (!z2) {
            bundle.putBoolean(f51555bo, z2);
        }
        boolean z3 = this.f4980h;
        if (!z3) {
            bundle.putBoolean(f4973v, z3);
        }
        int i4 = this.f4981i;
        if (i4 != -1) {
            bundle.putInt(f4968d, i4);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @zy.oc
    public void onStart() {
        super.onStart();
        Dialog dialog = this.f4987r;
        if (dialog != null) {
            this.f4983l = false;
            dialog.show();
            View decorView = this.f4987r.getWindow().getDecorView();
            C0942o.toq(decorView, this);
            ek5k.toq(decorView, this);
            androidx.savedstate.f7l8.toq(decorView, this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @zy.oc
    public void onStop() {
        super.onStop();
        Dialog dialog = this.f4987r;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @zy.oc
    public void onViewStateRestored(@dd Bundle bundle) {
        Bundle bundle2;
        super.onViewStateRestored(bundle);
        if (this.f4987r == null || bundle == null || (bundle2 = bundle.getBundle(f4966a)) == null) {
            return;
        }
        this.f4987r.onRestoreInstanceState(bundle2);
    }

    @Override // androidx.fragment.app.Fragment
    void performCreateView(@lvui LayoutInflater layoutInflater, @dd ViewGroup viewGroup, @dd Bundle bundle) {
        Bundle bundle2;
        super.performCreateView(layoutInflater, viewGroup, bundle);
        if (this.mView != null || this.f4987r == null || bundle == null || (bundle2 = bundle.getBundle(f4966a)) == null) {
            return;
        }
        this.f4987r.onRestoreInstanceState(bundle2);
    }

    public boolean ps() {
        return this.f4980h;
    }

    public void r6ty(@lvui FragmentManager fragmentManager, @dd String str) {
        this.f4978f = false;
        this.f4976c = true;
        o1t o1tVarKi = fragmentManager.ki();
        o1tVarKi.f7l8(this, str);
        o1tVarKi.kja0();
    }

    public boolean ra() {
        return this.f4985p;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void rp(@lvui Dialog dialog, int i2) {
        if (i2 != 1 && i2 != 2) {
            if (i2 != 3) {
                return;
            }
            Window window = dialog.getWindow();
            if (window != null) {
                window.addFlags(24);
            }
        }
        dialog.requestWindowFeature(1);
    }

    @dd
    public Dialog u38j() {
        return this.f4987r;
    }

    @dd
    View uf(int i2) {
        Dialog dialog = this.f4987r;
        if (dialog != null) {
            return dialog.findViewById(i2);
        }
        return null;
    }

    @hb
    public int v5yj() {
        return this.f4988s;
    }

    /* JADX INFO: renamed from: w */
    public void mo4377w() {
        m2t(true, false);
    }

    public void yw(int i2, @hb int i3) {
        if (FragmentManager.m4(2)) {
            Log.d("FragmentManager", "Setting style and theme for DialogFragment " + this + " to " + i2 + ", " + i3);
        }
        this.f4990y = i2;
        if (i2 == 2 || i2 == 3) {
            this.f4988s = R.style.Theme.Panel;
        }
        if (i3 != 0) {
            this.f4988s = i3;
        }
    }

    public zy(@zy.gvn7 int i2) {
        super(i2);
        this.f4986q = new RunnableC0906k();
        this.f4984n = new toq();
        this.f4979g = new DialogInterfaceOnDismissListenerC7881zy();
        this.f4990y = 0;
        this.f4988s = 0;
        this.f4985p = true;
        this.f4980h = true;
        this.f4981i = -1;
        this.f4989t = new C0908q();
        this.f4977e = false;
    }
}

package androidx.core.view;

import android.R;
import android.annotation.SuppressLint;
import android.os.Build;
import android.os.CancellationSignal;
import android.view.View;
import android.view.Window;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.WindowInsetsController;
import android.view.animation.Interpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.core.view.sok;

/* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class sok {

    /* JADX INFO: renamed from: q */
    public static final int f4106q = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f50867toq = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f50868zy = 1;

    /* JADX INFO: renamed from: k */
    private final C0718n f4107k;

    /* JADX INFO: renamed from: androidx.core.view.sok$g */
    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    public interface InterfaceC0716g {
        /* JADX INFO: renamed from: k */
        void m3443k(@zy.lvui sok sokVar, int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.core.view.sok$k */
    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    @zy.hyr(20)
    static class C0717k extends C0718n {

        /* JADX INFO: renamed from: k */
        @zy.lvui
        protected final Window f4108k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.lvui
        private final View f50869toq;

        C0717k(@zy.lvui Window window, @zy.lvui View view) {
            this.f4108k = window;
            this.f50869toq = view;
        }

        private void cdj(int i2) {
            if (i2 == 1) {
                ki(4);
                t8r(1024);
                return;
            }
            if (i2 == 2) {
                ki(2);
                return;
            }
            if (i2 != 8) {
                return;
            }
            final View viewFindViewById = this.f50869toq;
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = this.f4108k.getCurrentFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.f4108k.findViewById(R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new Runnable() { // from class: androidx.core.view.etdu
                @Override // java.lang.Runnable
                public final void run() {
                    sok.C0717k.n7h(viewFindViewById);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void n7h(View view) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
        }

        private void qrj(int i2) {
            if (i2 == 1) {
                kja0(4);
            } else if (i2 == 2) {
                kja0(2);
            } else {
                if (i2 != 8) {
                    return;
                }
                ((InputMethodManager) this.f4108k.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.f4108k.getDecorView().getWindowToken(), 0);
            }
        }

        @Override // androidx.core.view.sok.C0718n
        void f7l8(@zy.lvui InterfaceC0716g interfaceC0716g) {
        }

        /* JADX INFO: renamed from: h */
        protected void m3444h(int i2) {
            this.f4108k.addFlags(i2);
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: k */
        void mo3445k(InterfaceC0716g interfaceC0716g) {
        }

        protected void ki(int i2) {
            View decorView = this.f4108k.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }

        protected void kja0(int i2) {
            View decorView = this.f4108k.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.sok.C0718n
        void ld6(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    cdj(i3);
                }
            }
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: p */
        void mo3446p(int i2) {
            if (i2 == 0) {
                ki(6144);
                return;
            }
            if (i2 == 1) {
                ki(4096);
                kja0(2048);
            } else {
                if (i2 != 2) {
                    return;
                }
                ki(2048);
                kja0(4096);
            }
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: q */
        void mo3447q(int i2) {
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i2 & i3) != 0) {
                    qrj(i3);
                }
            }
        }

        protected void t8r(int i2) {
            this.f4108k.clearFlags(i2);
        }

        @Override // androidx.core.view.sok.C0718n
        void toq(int i2, long j2, Interpolator interpolator, CancellationSignal cancellationSignal, fnq8 fnq8Var) {
        }

        @Override // androidx.core.view.sok.C0718n
        int zy() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: androidx.core.view.sok$n */
    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    private static class C0718n {
        C0718n() {
        }

        void f7l8(@zy.lvui InterfaceC0716g interfaceC0716g) {
        }

        /* JADX INFO: renamed from: g */
        public boolean mo3448g() {
            return false;
        }

        /* JADX INFO: renamed from: k */
        void mo3445k(InterfaceC0716g interfaceC0716g) {
        }

        void ld6(int i2) {
        }

        /* JADX INFO: renamed from: n */
        public boolean mo3449n() {
            return false;
        }

        /* JADX INFO: renamed from: p */
        void mo3446p(int i2) {
        }

        /* JADX INFO: renamed from: q */
        void mo3447q(int i2) {
        }

        /* JADX INFO: renamed from: s */
        public void mo3450s(boolean z2) {
        }

        void toq(int i2, long j2, Interpolator interpolator, CancellationSignal cancellationSignal, fnq8 fnq8Var) {
        }

        /* JADX INFO: renamed from: y */
        public void mo3451y(boolean z2) {
        }

        int zy() {
            return 0;
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    @zy.hyr(23)
    private static class toq extends C0717k {
        toq(@zy.lvui Window window, @zy.dd View view) {
            super(window, view);
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: g */
        public boolean mo3448g() {
            return (this.f4108k.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: s */
        public void mo3450s(boolean z2) {
            if (!z2) {
                ki(8192);
                return;
            }
            t8r(67108864);
            m3444h(Integer.MIN_VALUE);
            kja0(8192);
        }
    }

    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    @zy.hyr(26)
    private static class zy extends toq {
        zy(@zy.lvui Window window, @zy.dd View view) {
            super(window, view);
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: n */
        public boolean mo3449n() {
            return (this.f4108k.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: y */
        public void mo3451y(boolean z2) {
            if (!z2) {
                ki(16);
                return;
            }
            t8r(134217728);
            m3444h(Integer.MIN_VALUE);
            kja0(16);
        }
    }

    @zy.hyr(30)
    @Deprecated
    private sok(@zy.lvui WindowInsetsController windowInsetsController) {
        this.f4107k = new C0719q(windowInsetsController, this);
    }

    @zy.hyr(30)
    @zy.lvui
    @Deprecated
    public static sok x2(@zy.lvui WindowInsetsController windowInsetsController) {
        return new sok(windowInsetsController);
    }

    public void f7l8(@zy.lvui InterfaceC0716g interfaceC0716g) {
        this.f4107k.f7l8(interfaceC0716g);
    }

    /* JADX INFO: renamed from: g */
    public boolean m3436g() {
        return this.f4107k.mo3448g();
    }

    /* JADX INFO: renamed from: k */
    public void m3437k(@zy.lvui InterfaceC0716g interfaceC0716g) {
        this.f4107k.mo3445k(interfaceC0716g);
    }

    public void ld6(int i2) {
        this.f4107k.ld6(i2);
    }

    /* JADX INFO: renamed from: n */
    public boolean m3438n() {
        return this.f4107k.mo3449n();
    }

    /* JADX INFO: renamed from: p */
    public void m3439p(int i2) {
        this.f4107k.mo3446p(i2);
    }

    /* JADX INFO: renamed from: q */
    public void m3440q(int i2) {
        this.f4107k.mo3447q(i2);
    }

    /* JADX INFO: renamed from: s */
    public void m3441s(boolean z2) {
        this.f4107k.mo3450s(z2);
    }

    public void toq(int i2, long j2, @zy.dd Interpolator interpolator, @zy.dd CancellationSignal cancellationSignal, @zy.lvui fnq8 fnq8Var) {
        this.f4107k.toq(i2, j2, interpolator, cancellationSignal, fnq8Var);
    }

    /* JADX INFO: renamed from: y */
    public void m3442y(boolean z2) {
        this.f4107k.mo3451y(z2);
    }

    @SuppressLint({"WrongConstant"})
    public int zy() {
        return this.f4107k.zy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: androidx.core.view.sok$q */
    /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
    @zy.hyr(30)
    static class C0719q extends C0718n {

        /* JADX INFO: renamed from: k */
        final sok f4109k;

        /* JADX INFO: renamed from: q */
        protected Window f4110q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final WindowInsetsController f50870toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final androidx.collection.qrj<InterfaceC0716g, WindowInsetsController.OnControllableInsetsChangedListener> f50871zy;

        /* JADX INFO: renamed from: androidx.core.view.sok$q$k */
        /* JADX INFO: compiled from: WindowInsetsControllerCompat.java */
        class k implements WindowInsetsAnimationControlListener {

            /* JADX INFO: renamed from: k */
            private qo f4111k = null;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ fnq8 f50872toq;

            k(fnq8 fnq8Var) {
                this.f50872toq = fnq8Var;
            }

            public void onCancelled(@zy.dd WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f50872toq.m3259k(windowInsetsAnimationController == null ? null : this.f4111k);
            }

            public void onFinished(@zy.lvui WindowInsetsAnimationController windowInsetsAnimationController) {
                this.f50872toq.zy(this.f4111k);
            }

            public void onReady(@zy.lvui WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
                qo qoVar = new qo(windowInsetsAnimationController);
                this.f4111k = qoVar;
                this.f50872toq.toq(qoVar, i2);
            }
        }

        C0719q(@zy.lvui Window window, @zy.lvui sok sokVar) {
            this(window.getInsetsController(), sokVar);
            this.f4110q = window;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void qrj(InterfaceC0716g interfaceC0716g, WindowInsetsController windowInsetsController, int i2) {
            if (this.f50870toq == windowInsetsController) {
                interfaceC0716g.m3443k(this.f4109k, i2);
            }
        }

        @Override // androidx.core.view.sok.C0718n
        void f7l8(@zy.lvui InterfaceC0716g interfaceC0716g) {
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerRemove = this.f50871zy.remove(interfaceC0716g);
            if (onControllableInsetsChangedListenerRemove != null) {
                this.f50870toq.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerRemove);
            }
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: g */
        public boolean mo3448g() {
            return (this.f50870toq.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: k */
        void mo3445k(@zy.lvui final InterfaceC0716g interfaceC0716g) {
            if (this.f50871zy.containsKey(interfaceC0716g)) {
                return;
            }
            WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener = new WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.w831
                public final void onControllableInsetsChanged(WindowInsetsController windowInsetsController, int i2) {
                    this.f4184k.qrj(interfaceC0716g, windowInsetsController, i2);
                }
            };
            this.f50871zy.put(interfaceC0716g, onControllableInsetsChangedListener);
            this.f50870toq.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
        }

        protected void kja0(int i2) {
            View decorView = this.f4110q.getDecorView();
            decorView.setSystemUiVisibility((~i2) & decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.sok.C0718n
        void ld6(int i2) {
            Window window = this.f4110q;
            if (window != null && (i2 & 8) != 0 && Build.VERSION.SDK_INT < 32) {
                ((InputMethodManager) window.getContext().getSystemService("input_method")).isActive();
            }
            this.f50870toq.show(i2);
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: n */
        public boolean mo3449n() {
            return (this.f50870toq.getSystemBarsAppearance() & 16) != 0;
        }

        protected void n7h(int i2) {
            View decorView = this.f4110q.getDecorView();
            decorView.setSystemUiVisibility(i2 | decorView.getSystemUiVisibility());
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: p */
        void mo3446p(int i2) {
            this.f50870toq.setSystemBarsBehavior(i2);
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: q */
        void mo3447q(int i2) {
            this.f50870toq.hide(i2);
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: s */
        public void mo3450s(boolean z2) {
            if (z2) {
                if (this.f4110q != null) {
                    n7h(8192);
                }
                this.f50870toq.setSystemBarsAppearance(8, 8);
            } else {
                if (this.f4110q != null) {
                    kja0(8192);
                }
                this.f50870toq.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.sok.C0718n
        void toq(int i2, long j2, @zy.dd Interpolator interpolator, @zy.dd CancellationSignal cancellationSignal, @zy.lvui fnq8 fnq8Var) {
            this.f50870toq.controlWindowInsetsAnimation(i2, j2, interpolator, cancellationSignal, new k(fnq8Var));
        }

        @Override // androidx.core.view.sok.C0718n
        /* JADX INFO: renamed from: y */
        public void mo3451y(boolean z2) {
            if (z2) {
                if (this.f4110q != null) {
                    n7h(16);
                }
                this.f50870toq.setSystemBarsAppearance(16, 16);
            } else {
                if (this.f4110q != null) {
                    kja0(16);
                }
                this.f50870toq.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.sok.C0718n
        @SuppressLint({"WrongConstant"})
        int zy() {
            return this.f50870toq.getSystemBarsBehavior();
        }

        C0719q(@zy.lvui WindowInsetsController windowInsetsController, @zy.lvui sok sokVar) {
            this.f50871zy = new androidx.collection.qrj<>();
            this.f50870toq = windowInsetsController;
            this.f4109k = sokVar;
        }
    }

    public sok(@zy.lvui Window window, @zy.lvui View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            this.f4107k = new C0719q(window, this);
        } else {
            this.f4107k = new zy(window, view);
        }
    }
}

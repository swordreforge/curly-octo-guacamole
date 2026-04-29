package androidx.fragment.app;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0683f;
import androidx.lifecycle.kja0;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import zy.InterfaceC7832k;
import zy.InterfaceC7843t;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.nn86;

/* JADX INFO: compiled from: FragmentTransaction.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class o1t {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f51502a9 = 4096;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final int f51503d3 = 4097;

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final int f51504eqxt = 4099;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    static final int f51505fn3e = 1;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f51506fti = 8192;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    static final int f51507fu4 = 4;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f51508gvn7 = 0;

    /* JADX INFO: renamed from: i */
    static final int f4844i = 0;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    static final int f51509jk = 10;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f51510jp0y = -1;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    static final int f51511mcp = 9;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    static final int f51512ni7 = 3;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    static final int f51513o1t = 6;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final int f51514oc = 8194;

    /* JADX INFO: renamed from: t */
    static final int f4845t = 8;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    static final int f51515wvg = 7;

    /* JADX INFO: renamed from: z */
    static final int f4846z = 5;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    static final int f51516zurt = 2;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    ArrayList<String> f51517cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    int f51518f7l8;

    /* JADX INFO: renamed from: g */
    int f4847g;

    /* JADX INFO: renamed from: h */
    ArrayList<String> f4848h;

    /* JADX INFO: renamed from: k */
    private final C0903y f4849k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    boolean f51519ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    CharSequence f51520kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    String f51521ld6;

    /* JADX INFO: renamed from: n */
    int f4850n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    int f51522n7h;

    /* JADX INFO: renamed from: p */
    boolean f4851p;

    /* JADX INFO: renamed from: q */
    int f4852q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    CharSequence f51523qrj;

    /* JADX INFO: renamed from: s */
    boolean f4853s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    ArrayList<Runnable> f51524t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ClassLoader f51525toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    int f51526x2;

    /* JADX INFO: renamed from: y */
    int f4854y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    ArrayList<C0889k> f51527zy;

    /* JADX INFO: renamed from: androidx.fragment.app.o1t$k */
    /* JADX INFO: compiled from: FragmentTransaction.java */
    static final class C0889k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        kja0.zy f51528f7l8;

        /* JADX INFO: renamed from: g */
        int f4855g;

        /* JADX INFO: renamed from: k */
        int f4856k;

        /* JADX INFO: renamed from: n */
        int f4857n;

        /* JADX INFO: renamed from: q */
        int f4858q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        Fragment f51529toq;

        /* JADX INFO: renamed from: y */
        kja0.zy f4859y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f51530zy;

        C0889k() {
        }

        C0889k(int i2, Fragment fragment) {
            this.f4856k = i2;
            this.f51529toq = fragment;
            kja0.zy zyVar = kja0.zy.RESUMED;
            this.f51528f7l8 = zyVar;
            this.f4859y = zyVar;
        }

        C0889k(int i2, @lvui Fragment fragment, kja0.zy zyVar) {
            this.f4856k = i2;
            this.f51529toq = fragment;
            this.f51528f7l8 = fragment.mMaxState;
            this.f4859y = zyVar;
        }
    }

    @Deprecated
    public o1t() {
        this.f51527zy = new ArrayList<>();
        this.f4851p = true;
        this.f51519ki = false;
        this.f4849k = null;
        this.f51525toq = null;
    }

    @lvui
    private Fragment cdj(@lvui Class<? extends Fragment> cls, @dd Bundle bundle) {
        C0903y c0903y = this.f4849k;
        if (c0903y == null) {
            throw new IllegalStateException("Creating a Fragment requires that this FragmentTransaction was built with FragmentManager.beginTransaction()");
        }
        ClassLoader classLoader = this.f51525toq;
        if (classLoader == null) {
            throw new IllegalStateException("The FragmentManager must be attached to itshost to create a Fragment");
        }
        Fragment fragmentMo4213k = c0903y.mo4213k(classLoader, cls.getName());
        if (bundle != null) {
            fragmentMo4213k.setArguments(bundle);
        }
        return fragmentMo4213k;
    }

    @lvui
    @Deprecated
    public o1t a9(@nn86 int i2) {
        this.f51522n7h = i2;
        this.f51520kja0 = null;
        return this;
    }

    @lvui
    public o1t d2ok(@dd Fragment fragment) {
        m4314s(new C0889k(8, fragment));
        return this;
    }

    @lvui
    public o1t d3(@zy.toq @InterfaceC7832k int i2, @zy.toq @InterfaceC7832k int i3) {
        return oc(i2, i3, 0, 0);
    }

    @lvui
    @Deprecated
    public o1t dd(@hb int i2) {
        return this;
    }

    @lvui
    public o1t eqxt(@lvui Fragment fragment, @lvui kja0.zy zyVar) {
        m4314s(new C0889k(10, fragment, zyVar));
        return this;
    }

    @lvui
    public o1t f7l8(@lvui Fragment fragment, @dd String str) {
        mo4297i(0, fragment, str, 1);
        return this;
    }

    @lvui
    public o1t fn3e(@lvui Fragment fragment) {
        m4314s(new C0889k(4, fragment));
        return this;
    }

    @lvui
    @Deprecated
    public o1t fti(@dd CharSequence charSequence) {
        this.f51522n7h = 0;
        this.f51520kja0 = charSequence;
        return this;
    }

    @lvui
    public o1t fu4(@lvui Fragment fragment) {
        m4314s(new C0889k(3, fragment));
        return this;
    }

    /* JADX INFO: renamed from: g */
    o1t m4309g(@lvui ViewGroup viewGroup, @lvui Fragment fragment, @dd String str) {
        fragment.mContainer = viewGroup;
        return zy(viewGroup.getId(), fragment, str);
    }

    @lvui
    @Deprecated
    public o1t gvn7(@dd CharSequence charSequence) {
        this.f51526x2 = 0;
        this.f51523qrj = charSequence;
        return this;
    }

    /* JADX INFO: renamed from: h */
    public abstract void mo4296h();

    /* JADX INFO: renamed from: i */
    void mo4297i(int i2, Fragment fragment, @dd String str, int i3) {
        Class<?> cls = fragment.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str2 = fragment.mTag;
            if (str2 != null && !str.equals(str2)) {
                throw new IllegalStateException("Can't change tag of fragment " + fragment + ": was " + fragment.mTag + " now " + str);
            }
            fragment.mTag = str;
        }
        if (i2 != 0) {
            if (i2 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + fragment + " with tag " + str + " to container view with no id");
            }
            int i4 = fragment.mFragmentId;
            if (i4 != 0 && i4 != i2) {
                throw new IllegalStateException("Can't change container ID of fragment " + fragment + ": was " + fragment.mFragmentId + " now " + i2);
            }
            fragment.mFragmentId = i2;
            fragment.mContainerId = i2;
        }
        m4314s(new C0889k(i3, fragment));
    }

    @lvui
    @Deprecated
    public o1t jk(boolean z2) {
        return lvui(z2);
    }

    @lvui
    @Deprecated
    public o1t jp0y(@nn86 int i2) {
        this.f51526x2 = i2;
        this.f51523qrj = null;
        return this;
    }

    @lvui
    public o1t ki(@lvui Fragment fragment) {
        m4314s(new C0889k(6, fragment));
        return this;
    }

    public abstract void kja0();

    @lvui
    public o1t ld6(@dd String str) {
        if (!this.f4851p) {
            throw new IllegalStateException("This FragmentTransaction is not allowed to be added to the back stack.");
        }
        this.f4853s = true;
        this.f51521ld6 = str;
        return this;
    }

    @lvui
    public o1t lvui(boolean z2) {
        this.f51519ki = z2;
        return this;
    }

    @lvui
    public o1t mcp(@lvui Runnable runnable) {
        t8r();
        if (this.f51524t8r == null) {
            this.f51524t8r = new ArrayList<>();
        }
        this.f51524t8r.add(runnable);
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: n */
    public final o1t m4310n(@InterfaceC7843t int i2, @lvui Class<? extends Fragment> cls, @dd Bundle bundle, @dd String str) {
        return zy(i2, cdj(cls, bundle), str);
    }

    public abstract int n7h();

    public boolean ni7() {
        return this.f51527zy.isEmpty();
    }

    @lvui
    public o1t o1t(@InterfaceC7843t int i2, @lvui Fragment fragment, @dd String str) {
        if (i2 == 0) {
            throw new IllegalArgumentException("Must use non-zero containerViewId");
        }
        mo4297i(i2, fragment, str, 2);
        return this;
    }

    @lvui
    public o1t oc(@zy.toq @InterfaceC7832k int i2, @zy.toq @InterfaceC7832k int i3, @zy.toq @InterfaceC7832k int i4, @zy.toq @InterfaceC7832k int i5) {
        this.f4852q = i2;
        this.f4850n = i3;
        this.f4847g = i4;
        this.f51518f7l8 = i5;
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public o1t m4311p(@lvui View view, @lvui String str) {
        if (C0894t.jk()) {
            String strGyi = C0683f.gyi(view);
            if (strGyi == null) {
                throw new IllegalArgumentException("Unique transitionNames are required for all sharedElements");
            }
            if (this.f4848h == null) {
                this.f4848h = new ArrayList<>();
                this.f51517cdj = new ArrayList<>();
            } else {
                if (this.f51517cdj.contains(str)) {
                    throw new IllegalArgumentException("A shared element with the target name '" + str + "' has already been added to the transaction.");
                }
                if (this.f4848h.contains(strGyi)) {
                    throw new IllegalArgumentException("A shared element with the source name '" + strGyi + "' has already been added to the transaction.");
                }
            }
            this.f4848h.add(strGyi);
            this.f51517cdj.add(str);
        }
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public final o1t m4312q(@InterfaceC7843t int i2, @lvui Class<? extends Fragment> cls, @dd Bundle bundle) {
        return toq(i2, cdj(cls, bundle));
    }

    public abstract int qrj();

    @lvui
    /* JADX INFO: renamed from: r */
    public o1t m4313r(int i2) {
        this.f4854y = i2;
        return this;
    }

    /* JADX INFO: renamed from: s */
    void m4314s(C0889k c0889k) {
        this.f51527zy.add(c0889k);
        c0889k.f51530zy = this.f4852q;
        c0889k.f4858q = this.f4850n;
        c0889k.f4857n = this.f4847g;
        c0889k.f4855g = this.f51518f7l8;
    }

    @lvui
    /* JADX INFO: renamed from: t */
    public final o1t m4315t(@InterfaceC7843t int i2, @lvui Class<? extends Fragment> cls, @dd Bundle bundle, @dd String str) {
        return o1t(i2, cdj(cls, bundle), str);
    }

    @lvui
    public o1t t8r() {
        if (this.f4853s) {
            throw new IllegalStateException("This transaction is already being added to the back stack");
        }
        this.f4851p = false;
        return this;
    }

    @lvui
    public o1t toq(@InterfaceC7843t int i2, @lvui Fragment fragment) {
        mo4297i(i2, fragment, null, 1);
        return this;
    }

    @lvui
    public final o1t wvg(@InterfaceC7843t int i2, @lvui Class<? extends Fragment> cls, @dd Bundle bundle) {
        return m4315t(i2, cls, bundle, null);
    }

    @lvui
    public o1t x2(@lvui Fragment fragment) {
        m4314s(new C0889k(7, fragment));
        return this;
    }

    @lvui
    public o1t x9kr(@lvui Fragment fragment) {
        m4314s(new C0889k(5, fragment));
        return this;
    }

    @lvui
    /* JADX INFO: renamed from: y */
    public final o1t m4316y(@lvui Class<? extends Fragment> cls, @dd Bundle bundle, @dd String str) {
        return f7l8(cdj(cls, bundle), str);
    }

    @lvui
    /* JADX INFO: renamed from: z */
    public o1t m4317z(@InterfaceC7843t int i2, @lvui Fragment fragment) {
        return o1t(i2, fragment, null);
    }

    public boolean zurt() {
        return this.f4851p;
    }

    @lvui
    public o1t zy(@InterfaceC7843t int i2, @lvui Fragment fragment, @dd String str) {
        mo4297i(i2, fragment, str, 1);
        return this;
    }

    o1t(@lvui C0903y c0903y, @dd ClassLoader classLoader) {
        this.f51527zy = new ArrayList<>();
        this.f4851p = true;
        this.f51519ki = false;
        this.f4849k = c0903y;
        this.f51525toq = classLoader;
    }
}

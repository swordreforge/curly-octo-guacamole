package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import java.util.concurrent.CopyOnWriteArrayList;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.java */
/* JADX INFO: loaded from: classes.dex */
class qrj {

    /* JADX INFO: renamed from: k */
    @lvui
    private final CopyOnWriteArrayList<C0892k> f4864k = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final FragmentManager f51531toq;

    /* JADX INFO: renamed from: androidx.fragment.app.qrj$k */
    /* JADX INFO: compiled from: FragmentLifecycleCallbacksDispatcher.java */
    private static final class C0892k {

        /* JADX INFO: renamed from: k */
        @lvui
        final FragmentManager.qrj f4865k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final boolean f51532toq;

        C0892k(@lvui FragmentManager.qrj qrjVar, boolean z2) {
            this.f4865k = qrjVar;
            this.f51532toq = z2;
        }
    }

    qrj(@lvui FragmentManager fragmentManager) {
        this.f51531toq = fragmentManager;
    }

    void f7l8(@lvui Fragment fragment, boolean z2) {
        Context contextM4330g = this.f51531toq.qo().m4330g();
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().f7l8(fragment, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.f7l8(this.f51531toq, fragment, contextM4330g);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    void m4322g(@lvui Fragment fragment, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().m4322g(fragment, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.m4216g(this.f51531toq, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m4323h(@lvui FragmentManager.qrj qrjVar) {
        synchronized (this.f4864k) {
            int i2 = 0;
            int size = this.f4864k.size();
            while (true) {
                if (i2 >= size) {
                    break;
                }
                if (this.f4864k.get(i2).f4865k == qrjVar) {
                    this.f4864k.remove(i2);
                    break;
                }
                i2++;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    void m4324k(@lvui Fragment fragment, @dd Bundle bundle, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().m4324k(fragment, bundle, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.m4217k(this.f51531toq, fragment, bundle);
            }
        }
    }

    public void kja0(@lvui FragmentManager.qrj qrjVar, boolean z2) {
        this.f4864k.add(new C0892k(qrjVar, z2));
    }

    void ld6(@lvui Fragment fragment, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().ld6(fragment, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.ld6(this.f51531toq, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    void m4325n(@lvui Fragment fragment, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().m4325n(fragment, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.m4218n(this.f51531toq, fragment);
            }
        }
    }

    void n7h(@lvui Fragment fragment, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().n7h(fragment, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.n7h(this.f51531toq, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    void m4326p(@lvui Fragment fragment, @lvui Bundle bundle, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().m4326p(fragment, bundle, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.m4219p(this.f51531toq, fragment, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    void m4327q(@lvui Fragment fragment, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().m4327q(fragment, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.m4220q(this.f51531toq, fragment);
            }
        }
    }

    void qrj(@lvui Fragment fragment, @lvui View view, @dd Bundle bundle, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().qrj(fragment, view, bundle, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.qrj(this.f51531toq, fragment, view, bundle);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    void m4328s(@lvui Fragment fragment, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().m4328s(fragment, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.m4221s(this.f51531toq, fragment);
            }
        }
    }

    void toq(@lvui Fragment fragment, boolean z2) {
        Context contextM4330g = this.f51531toq.qo().m4330g();
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().toq(fragment, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.toq(this.f51531toq, fragment, contextM4330g);
            }
        }
    }

    void x2(@lvui Fragment fragment, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().x2(fragment, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.x2(this.f51531toq, fragment);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    void m4329y(@lvui Fragment fragment, @dd Bundle bundle, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().m4329y(fragment, bundle, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.m4222y(this.f51531toq, fragment, bundle);
            }
        }
    }

    void zy(@lvui Fragment fragment, @dd Bundle bundle, boolean z2) {
        Fragment fragmentD8wk = this.f51531toq.d8wk();
        if (fragmentD8wk != null) {
            fragmentD8wk.getParentFragmentManager().wo().zy(fragment, bundle, true);
        }
        for (C0892k c0892k : this.f4864k) {
            if (!z2 || c0892k.f51532toq) {
                c0892k.f4865k.zy(this.f51531toq, fragment, bundle);
            }
        }
    }
}

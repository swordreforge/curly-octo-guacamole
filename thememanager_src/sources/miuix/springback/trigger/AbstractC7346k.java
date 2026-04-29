package miuix.springback.trigger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import ula6.toq;

/* JADX INFO: renamed from: miuix.springback.trigger.k */
/* JADX INFO: compiled from: BaseTrigger.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7346k {

    /* JADX INFO: renamed from: g */
    private static int f41808g;

    /* JADX INFO: renamed from: n */
    private static int f41809n;

    /* JADX INFO: renamed from: q */
    private static int f41810q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static int f90338zy;

    /* JADX INFO: renamed from: k */
    private List<k> f41811k = new ArrayList();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private k f90339toq;

    /* JADX INFO: renamed from: miuix.springback.trigger.k$k */
    /* JADX INFO: compiled from: BaseTrigger.java */
    public static abstract class k {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        static final Comparator<k> f90340zy = new C8113k();

        /* JADX INFO: renamed from: k */
        public int f41812k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f90341toq;

        /* JADX INFO: renamed from: miuix.springback.trigger.k$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BaseTrigger.java */
        class C8113k implements Comparator<k> {
            C8113k() {
            }

            @Override // java.util.Comparator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public int compare(k kVar, k kVar2) {
                return Integer.compare(kVar.f41812k, kVar2.f41812k);
            }
        }

        k(int i2, int i3) {
            if (i2 < 0 || i3 < 0 || i3 < i2) {
                throw new IllegalArgumentException("not allow enterPoint < 0 or triggerPoint < 0 or triggerPoint < enterPoint!");
            }
            this.f41812k = i2;
            this.f90341toq = i3;
        }

        protected View f7l8(LayoutInflater layoutInflater, ViewGroup viewGroup) {
            return null;
        }

        /* JADX INFO: renamed from: g */
        protected abstract void mo7378g();

        /* JADX INFO: renamed from: k */
        void m26659k() {
            mo7378g();
        }

        protected abstract void ld6();

        /* JADX INFO: renamed from: n */
        void m26660n() {
            ld6();
        }

        /* JADX INFO: renamed from: p */
        protected abstract void mo7379p();

        /* JADX INFO: renamed from: q */
        void m26661q() {
            mo7379p();
        }

        /* JADX INFO: renamed from: s */
        protected abstract void mo7380s();

        void toq() {
            mo7381y();
        }

        /* JADX INFO: renamed from: y */
        protected abstract void mo7381y();

        void zy() {
            mo7380s();
        }
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.k$q */
    /* JADX INFO: compiled from: BaseTrigger.java */
    public static abstract class q extends k {

        /* JADX INFO: renamed from: miuix.springback.trigger.k$q$k */
        /* JADX INFO: compiled from: BaseTrigger.java */
        public interface k {
            void f7l8(int i2);

            /* JADX INFO: renamed from: g */
            void mo26663g(int i2);

            /* JADX INFO: renamed from: k */
            void mo26664k(int i2);

            /* JADX INFO: renamed from: n */
            void mo26665n(int i2);

            /* JADX INFO: renamed from: p */
            void mo26666p(int i2);

            /* JADX INFO: renamed from: q */
            float mo26667q();

            /* JADX INFO: renamed from: s */
            void mo26668s(int i2);

            void toq(int i2);

            /* JADX INFO: renamed from: y */
            void mo26669y(int i2);

            void zy(int i2);
        }

        public q() {
            super(AbstractC7346k.f41809n, AbstractC7346k.f41808g);
        }

        public q(int i2, int i3) {
            super(i2, i3);
        }
    }

    public AbstractC7346k(Context context) {
        f90338zy = context.getResources().getDimensionPixelSize(toq.zy.f44593y);
        f41810q = context.getResources().getDimensionPixelSize(toq.zy.f95443ld6);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(toq.zy.f44591s);
        f41809n = dimensionPixelSize;
        f41808g = dimensionPixelSize;
    }

    public List<k> f7l8() {
        return this.f41811k;
    }

    /* JADX INFO: renamed from: g */
    public boolean mo26654g(k kVar) {
        return kVar instanceof zy ? this.f90339toq != null : kVar != null && this.f41811k.contains(kVar);
    }

    public abstract boolean ld6();

    /* JADX INFO: renamed from: n */
    public void mo26655n(k kVar) {
        if (kVar instanceof zy) {
            this.f90339toq = kVar;
            return;
        }
        if (Collections.binarySearch(this.f41811k, kVar, k.f90340zy) >= 0) {
            throw new IllegalArgumentException("action conflict.");
        }
        this.f41811k.add((-r0) - 1, kVar);
    }

    /* JADX INFO: renamed from: p */
    public q m26656p() {
        for (int i2 = 0; i2 < this.f41811k.size(); i2++) {
            k kVar = this.f41811k.get(i2);
            if (kVar != null && (kVar instanceof q)) {
                return (q) kVar;
            }
        }
        return null;
    }

    public boolean qrj(k kVar) {
        if (ld6()) {
            return false;
        }
        if (kVar instanceof zy) {
            ((zy) kVar).f41820g = null;
            this.f90339toq = null;
            return true;
        }
        if (kVar != null && this.f41811k.contains(kVar)) {
            if (kVar instanceof toq) {
                ((toq) kVar).f41817q = null;
            }
            this.f41811k.remove(kVar);
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public zy m26657s() {
        return (zy) this.f90339toq;
    }

    public abstract boolean x2(k kVar);

    /* JADX INFO: renamed from: y */
    public toq m26658y() {
        for (int i2 = 0; i2 < this.f41811k.size(); i2++) {
            k kVar = this.f41811k.get(i2);
            if (kVar != null && (kVar instanceof toq)) {
                return (toq) kVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.k$toq */
    /* JADX INFO: compiled from: BaseTrigger.java */
    public static abstract class toq extends k {

        /* JADX INFO: renamed from: s */
        public static final int f41813s = 0;

        /* JADX INFO: renamed from: y */
        static final int[] f41814y = {toq.C7698y.f44574k, toq.C7698y.f44576q, toq.C7698y.f95426zy, toq.C7698y.f95425toq};

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f90342f7l8;

        /* JADX INFO: renamed from: g */
        public String[] f41815g;

        /* JADX INFO: renamed from: n */
        public int[] f41816n;

        /* JADX INFO: renamed from: q */
        protected k f41817q;

        /* JADX INFO: renamed from: miuix.springback.trigger.k$toq$k */
        /* JADX INFO: compiled from: BaseTrigger.java */
        interface k {
            /* JADX INFO: renamed from: g */
            void mo26671g(toq toqVar, int i2, String str);

            /* JADX INFO: renamed from: k */
            void mo26672k(toq toqVar, int i2);

            /* JADX INFO: renamed from: n */
            void mo26673n(toq toqVar);

            /* JADX INFO: renamed from: q */
            void mo26674q(toq toqVar);

            void toq(toq toqVar);

            void zy(toq toqVar);
        }

        /* JADX INFO: renamed from: miuix.springback.trigger.k$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BaseTrigger.java */
        public interface InterfaceC8114toq {
            void f7l8(int i2);

            /* JADX INFO: renamed from: g */
            void mo26675g(int i2);

            /* JADX INFO: renamed from: k */
            void mo26676k(int i2);

            /* JADX INFO: renamed from: n */
            void mo26677n(int i2);

            /* JADX INFO: renamed from: p */
            void mo26678p(int i2);

            /* JADX INFO: renamed from: q */
            float mo26679q();

            /* JADX INFO: renamed from: s */
            void mo26680s(int i2);

            void toq(int i2);

            /* JADX INFO: renamed from: y */
            void mo26681y(int i2);

            void zy(int i2);
        }

        public toq(int i2) {
            super(i2, AbstractC7346k.f90338zy + i2);
            int[] iArr = f41814y;
            this.f41815g = new String[iArr.length];
            this.f90342f7l8 = 0;
            if (i2 < 0) {
                throw new IllegalArgumentException("invalid offsetPoint");
            }
            this.f41816n = iArr;
        }

        public void cdj() {
            k kVar = this.f41817q;
            if (kVar != null) {
                kVar.zy(this);
            }
        }

        /* JADX INFO: renamed from: h */
        public void m26670h() {
            k kVar = this.f41817q;
            if (kVar != null) {
                kVar.mo26673n(this);
            }
        }

        public void ki(int i2, String str) {
            if (i2 >= f41814y.length) {
                throw new IllegalArgumentException("invalid index");
            }
            k kVar = this.f41817q;
            if (kVar != null) {
                kVar.mo26671g(this, i2, str);
            }
        }

        public void kja0() {
            k kVar = this.f41817q;
            if (kVar != null) {
                kVar.mo26674q(this);
            }
        }

        public void n7h() {
            k kVar = this.f41817q;
            if (kVar != null) {
                int i2 = this.f90342f7l8 + 1;
                this.f90342f7l8 = i2;
                kVar.mo26672k(this, i2);
            }
        }

        public boolean qrj() {
            return this.f90342f7l8 > 0;
        }

        public void t8r() {
            k kVar = this.f41817q;
            if (kVar != null) {
                kVar.toq(this);
            }
        }

        public int x2() {
            return this.f90342f7l8;
        }

        public toq(int i2, int[] iArr) {
            super(i2, AbstractC7346k.f90338zy + i2);
            int[] iArr2 = f41814y;
            this.f41815g = new String[iArr2.length];
            this.f90342f7l8 = 0;
            if (i2 >= 0) {
                if (iArr != null && iArr.length == iArr2.length) {
                    this.f41816n = iArr;
                    return;
                }
                throw new IllegalArgumentException("invalid text Ids");
            }
            throw new IllegalArgumentException("invalid offsetPoint");
        }

        public toq(int i2, int i3) {
            super(i2, i3);
            int[] iArr = f41814y;
            this.f41815g = new String[iArr.length];
            this.f90342f7l8 = 0;
            this.f41816n = iArr;
        }

        public toq(int i2, int i3, int[] iArr) {
            super(i2, i3);
            int[] iArr2 = f41814y;
            this.f41815g = new String[iArr2.length];
            this.f90342f7l8 = 0;
            if (iArr != null && iArr.length == iArr2.length) {
                this.f41816n = iArr;
                return;
            }
            throw new IllegalArgumentException("invalid text Ids");
        }
    }

    /* JADX INFO: renamed from: miuix.springback.trigger.k$zy */
    /* JADX INFO: compiled from: BaseTrigger.java */
    public static abstract class zy extends k {

        /* JADX INFO: renamed from: s */
        public static final int f41818s = 0;

        /* JADX INFO: renamed from: y */
        static final int[] f41819y = {toq.C7698y.f95424f7l8, toq.C7698y.f44578y, toq.C7698y.f44575n, toq.C7698y.f44573g};

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private int f90343f7l8;

        /* JADX INFO: renamed from: g */
        protected toq f41820g;

        /* JADX INFO: renamed from: n */
        public String[] f41821n;

        /* JADX INFO: renamed from: q */
        public int[] f41822q;

        /* JADX INFO: renamed from: miuix.springback.trigger.k$zy$k */
        /* JADX INFO: compiled from: BaseTrigger.java */
        public interface k {
            void f7l8(int i2);

            /* JADX INFO: renamed from: g */
            void mo26683g(int i2);

            /* JADX INFO: renamed from: k */
            void mo26684k(int i2);

            /* JADX INFO: renamed from: n */
            void mo26685n(int i2);

            /* JADX INFO: renamed from: p */
            void mo26686p(int i2);

            /* JADX INFO: renamed from: q */
            float mo26687q();

            /* JADX INFO: renamed from: s */
            void mo26688s(int i2);

            void toq(int i2);

            /* JADX INFO: renamed from: y */
            void mo26689y(int i2);

            void zy(int i2);
        }

        /* JADX INFO: renamed from: miuix.springback.trigger.k$zy$toq */
        /* JADX INFO: compiled from: BaseTrigger.java */
        interface toq {
            /* JADX INFO: renamed from: g */
            void mo26690g(zy zyVar, int i2, String str);

            /* JADX INFO: renamed from: k */
            void mo26691k(zy zyVar);

            /* JADX INFO: renamed from: n */
            void mo26692n(zy zyVar);

            /* JADX INFO: renamed from: q */
            void mo26693q(zy zyVar);

            void toq(zy zyVar);

            void zy(zy zyVar, int i2);
        }

        public zy(int i2) {
            super(i2, AbstractC7346k.f41810q + i2);
            int[] iArr = f41819y;
            this.f41821n = new String[iArr.length];
            this.f90343f7l8 = 0;
            if (i2 < 0) {
                throw new IllegalArgumentException("invalid offsetPoint");
            }
            this.f41822q = iArr;
        }

        public void cdj() {
            toq toqVar = this.f41820g;
            if (toqVar != null) {
                toqVar.mo26691k(this);
            }
        }

        /* JADX INFO: renamed from: h */
        public void m26682h() {
            toq toqVar = this.f41820g;
            if (toqVar != null) {
                this.f90343f7l8 = 0;
                toqVar.toq(this);
            }
        }

        public void ki(int i2, String str) {
            if (i2 >= f41819y.length) {
                throw new IllegalArgumentException("invalid index");
            }
            toq toqVar = this.f41820g;
            if (toqVar != null) {
                toqVar.mo26690g(this, i2, str);
            }
        }

        public void kja0() {
            toq toqVar = this.f41820g;
            if (toqVar != null) {
                toqVar.mo26692n(this);
            }
        }

        public void n7h() {
            toq toqVar = this.f41820g;
            if (toqVar != null) {
                int i2 = this.f90343f7l8 + 1;
                this.f90343f7l8 = i2;
                toqVar.zy(this, i2);
            }
        }

        public boolean qrj() {
            return this.f90343f7l8 > 0;
        }

        public void t8r() {
            toq toqVar = this.f41820g;
            if (toqVar != null) {
                this.f90343f7l8 = 0;
                toqVar.mo26693q(this);
            }
        }

        public int x2() {
            return this.f90343f7l8;
        }

        public zy(int i2, int[] iArr) {
            super(i2, AbstractC7346k.f41810q + i2);
            int[] iArr2 = f41819y;
            this.f41821n = new String[iArr2.length];
            this.f90343f7l8 = 0;
            if (i2 >= 0) {
                if (iArr != null && iArr.length == iArr2.length) {
                    this.f41822q = iArr;
                    return;
                }
                throw new IllegalArgumentException("invalid text Ids");
            }
            throw new IllegalArgumentException("invalid offsetPoint");
        }

        public zy(int i2, int i3) {
            super(i2, i3);
            int[] iArr = f41819y;
            this.f41821n = new String[iArr.length];
            this.f90343f7l8 = 0;
            this.f41822q = iArr;
        }

        public zy(int i2, int i3, int[] iArr) {
            super(i2, i3);
            int[] iArr2 = f41819y;
            this.f41821n = new String[iArr2.length];
            this.f90343f7l8 = 0;
            if (iArr != null && iArr.length == iArr2.length) {
                this.f41822q = iArr;
                return;
            }
            throw new IllegalArgumentException("invalid text Ids");
        }
    }
}

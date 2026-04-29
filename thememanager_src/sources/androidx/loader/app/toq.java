package androidx.loader.app;

import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import androidx.collection.n7h;
import androidx.core.util.C0640q;
import androidx.lifecycle.C0924e;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.hb;
import androidx.lifecycle.jp0y;
import androidx.lifecycle.lrht;
import androidx.loader.app.AbstractC0956k;
import androidx.loader.content.zy;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import zy.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: compiled from: LoaderManagerImpl.java */
/* JADX INFO: loaded from: classes.dex */
class toq extends AbstractC0956k {

    /* JADX INFO: renamed from: q */
    static boolean f5141q = false;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final String f51608zy = "LoaderManager";

    /* JADX INFO: renamed from: k */
    @lvui
    private final InterfaceC0954z f5142k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final zy f51609toq;

    /* JADX INFO: renamed from: androidx.loader.app.toq$k */
    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    public static class C0957k<D> extends fti<D> implements zy.InterfaceC7888zy<D> {

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private C7887toq<D> f51610cdj;

        /* JADX INFO: renamed from: h */
        private InterfaceC0954z f5143h;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private androidx.loader.content.zy<D> f51611ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        @lvui
        private final androidx.loader.content.zy<D> f51612kja0;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        @dd
        private final Bundle f51613n7h;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private final int f51614qrj;

        C0957k(int i2, @dd Bundle bundle, @lvui androidx.loader.content.zy<D> zyVar, @dd androidx.loader.content.zy<D> zyVar2) {
            this.f51614qrj = i2;
            this.f51613n7h = bundle;
            this.f51612kja0 = zyVar;
            this.f51611ki = zyVar2;
            zyVar.fn3e(i2, this);
        }

        @Override // androidx.lifecycle.fti, androidx.lifecycle.LiveData
        public void cdj(D d2) {
            super.cdj(d2);
            androidx.loader.content.zy<D> zyVar = this.f51611ki;
            if (zyVar != null) {
                zyVar.ni7();
                this.f51611ki = null;
            }
        }

        boolean fn3e() {
            C7887toq<D> c7887toq;
            return (!m4393y() || (c7887toq = this.f51610cdj) == null || c7887toq.m4510q()) ? false : true;
        }

        @lvui
        /* JADX INFO: renamed from: i */
        androidx.loader.content.zy<D> m4507i() {
            return this.f51612kja0;
        }

        @Override // androidx.loader.content.zy.InterfaceC7888zy
        /* JADX INFO: renamed from: k */
        public void mo4508k(@lvui androidx.loader.content.zy<D> zyVar, @dd D d2) {
            if (toq.f5141q) {
                Log.v(toq.f51608zy, "onLoadComplete: " + this);
            }
            if (Looper.myLooper() == Looper.getMainLooper()) {
                cdj(d2);
                return;
            }
            if (toq.f5141q) {
                Log.w(toq.f51608zy, "onLoadComplete was incorrectly called on a background thread");
            }
            n7h(d2);
        }

        @oc
        androidx.loader.content.zy<D> ki(boolean z2) {
            if (toq.f5141q) {
                Log.v(toq.f51608zy, "  Destroying: " + this);
            }
            this.f51612kja0.toq();
            this.f51612kja0.m4531k();
            C7887toq<D> c7887toq = this.f51610cdj;
            if (c7887toq != null) {
                kja0(c7887toq);
                if (z2) {
                    c7887toq.m4509n();
                }
            }
            this.f51612kja0.m4536t(this);
            if ((c7887toq == null || c7887toq.m4510q()) && !z2) {
                return this.f51612kja0;
            }
            this.f51612kja0.ni7();
            return this.f51611ki;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.lifecycle.LiveData
        public void kja0(@lvui jp0y<? super D> jp0yVar) {
            super.kja0(jp0yVar);
            this.f5143h = null;
            this.f51610cdj = null;
        }

        @lvui
        @oc
        androidx.loader.content.zy<D> ni7(@lvui InterfaceC0954z interfaceC0954z, @lvui AbstractC0956k.k<D> kVar) {
            C7887toq<D> c7887toq = new C7887toq<>(this.f51612kja0, kVar);
            m4391p(interfaceC0954z, c7887toq);
            C7887toq<D> c7887toq2 = this.f51610cdj;
            if (c7887toq2 != null) {
                kja0(c7887toq2);
            }
            this.f5143h = interfaceC0954z;
            this.f51610cdj = c7887toq;
            return this.f51612kja0;
        }

        @Override // androidx.lifecycle.LiveData
        protected void qrj() {
            if (toq.f5141q) {
                Log.v(toq.f51608zy, "  Stopping: " + this);
            }
            this.f51612kja0.o1t();
        }

        public void t8r(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            printWriter.print(str);
            printWriter.print("mId=");
            printWriter.print(this.f51614qrj);
            printWriter.print(" mArgs=");
            printWriter.println(this.f51613n7h);
            printWriter.print(str);
            printWriter.print("mLoader=");
            printWriter.println(this.f51612kja0);
            this.f51612kja0.f7l8(str + "  ", fileDescriptor, printWriter, strArr);
            if (this.f51610cdj != null) {
                printWriter.print(str);
                printWriter.print("mCallbacks=");
                printWriter.println(this.f51610cdj);
                this.f51610cdj.zy(str + "  ", printWriter);
            }
            printWriter.print(str);
            printWriter.print("mData=");
            printWriter.println(m4507i().m4534q(m4388g()));
            printWriter.print(str);
            printWriter.print("mStarted=");
            printWriter.println(m4393y());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(64);
            sb.append("LoaderInfo{");
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append(" #");
            sb.append(this.f51614qrj);
            sb.append(" : ");
            C0640q.m2982k(this.f51612kja0, sb);
            sb.append("}}");
            return sb.toString();
        }

        @Override // androidx.lifecycle.LiveData
        protected void x2() {
            if (toq.f5141q) {
                Log.v(toq.f51608zy, "  Starting: " + this);
            }
            this.f51612kja0.m4538z();
        }

        void zurt() {
            InterfaceC0954z interfaceC0954z = this.f5143h;
            C7887toq<D> c7887toq = this.f51610cdj;
            if (interfaceC0954z == null || c7887toq == null) {
                return;
            }
            super.kja0(c7887toq);
            m4391p(interfaceC0954z, c7887toq);
        }
    }

    /* JADX INFO: renamed from: androidx.loader.app.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    static class C7887toq<D> implements jp0y<D> {

        /* JADX INFO: renamed from: k */
        @lvui
        private final androidx.loader.content.zy<D> f5144k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @lvui
        private final AbstractC0956k.k<D> f51615toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f51616zy = false;

        C7887toq(@lvui androidx.loader.content.zy<D> zyVar, @lvui AbstractC0956k.k<D> kVar) {
            this.f5144k = zyVar;
            this.f51615toq = kVar;
        }

        @oc
        /* JADX INFO: renamed from: n */
        void m4509n() {
            if (this.f51616zy) {
                if (toq.f5141q) {
                    Log.v(toq.f51608zy, "  Resetting: " + this.f5144k);
                }
                this.f51615toq.zy(this.f5144k);
            }
        }

        /* JADX INFO: renamed from: q */
        boolean m4510q() {
            return this.f51616zy;
        }

        public String toString() {
            return this.f51615toq.toString();
        }

        @Override // androidx.lifecycle.jp0y
        public void toq(@dd D d2) {
            if (toq.f5141q) {
                Log.v(toq.f51608zy, "  onLoadFinished in " + this.f5144k + ": " + this.f5144k.m4534q(d2));
            }
            this.f51615toq.m4505k(this.f5144k, d2);
            this.f51616zy = true;
        }

        public void zy(String str, PrintWriter printWriter) {
            printWriter.print(str);
            printWriter.print("mDeliveredData=");
            printWriter.println(this.f51616zy);
        }
    }

    /* JADX INFO: compiled from: LoaderManagerImpl.java */
    static class zy extends lrht {

        /* JADX INFO: renamed from: s */
        private static final C0924e.toq f5145s = new C0958k();

        /* JADX INFO: renamed from: g */
        private n7h<C0957k> f5146g = new n7h<>();

        /* JADX INFO: renamed from: y */
        private boolean f5147y = false;

        /* JADX INFO: renamed from: androidx.loader.app.toq$zy$k */
        /* JADX INFO: compiled from: LoaderManagerImpl.java */
        static class C0958k implements C0924e.toq {
            C0958k() {
            }

            @Override // androidx.lifecycle.C0924e.toq
            @lvui
            public <T extends lrht> T toq(@lvui Class<T> cls) {
                return new zy();
            }
        }

        zy() {
        }

        @lvui
        /* JADX INFO: renamed from: f */
        static zy m4511f(hb hbVar) {
            return (zy) new C0924e(hbVar, f5145s).m4420k(zy.class);
        }

        /* JADX INFO: renamed from: c */
        <D> C0957k<D> m4512c(int i2) {
            return this.f5146g.n7h(i2);
        }

        /* JADX INFO: renamed from: e */
        void m4513e(int i2, @lvui C0957k c0957k) {
            this.f5146g.fn3e(i2, c0957k);
        }

        void hb() {
            this.f5147y = true;
        }

        void hyr() {
            this.f5147y = false;
        }

        boolean lrht() {
            int iA9 = this.f5146g.a9();
            for (int i2 = 0; i2 < iA9; i2++) {
                if (this.f5146g.fti(i2).fn3e()) {
                    return true;
                }
            }
            return false;
        }

        public void n5r1(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
            if (this.f5146g.a9() > 0) {
                printWriter.print(str);
                printWriter.println("Loaders:");
                String str2 = str + "    ";
                for (int i2 = 0; i2 < this.f5146g.a9(); i2++) {
                    C0957k c0957kFti = this.f5146g.fti(i2);
                    printWriter.print(str);
                    printWriter.print("  #");
                    printWriter.print(this.f5146g.m852i(i2));
                    printWriter.print(": ");
                    printWriter.println(c0957kFti.toString());
                    c0957kFti.t8r(str2, fileDescriptor, printWriter, strArr);
                }
            }
        }

        @Override // androidx.lifecycle.lrht
        protected void ncyb() {
            super.ncyb();
            int iA9 = this.f5146g.a9();
            for (int i2 = 0; i2 < iA9; i2++) {
                this.f5146g.fti(i2).ki(true);
            }
            this.f5146g.m855q();
        }

        void nn86(int i2) {
            this.f5146g.fu4(i2);
        }

        boolean uv6() {
            return this.f5147y;
        }

        void vyq() {
            int iA9 = this.f5146g.a9();
            for (int i2 = 0; i2 < iA9; i2++) {
                this.f5146g.fti(i2).zurt();
            }
        }
    }

    toq(@lvui InterfaceC0954z interfaceC0954z, @lvui hb hbVar) {
        this.f5142k = interfaceC0954z;
        this.f51609toq = zy.m4511f(hbVar);
    }

    @lvui
    @oc
    /* JADX INFO: renamed from: p */
    private <D> androidx.loader.content.zy<D> m4506p(int i2, @dd Bundle bundle, @lvui AbstractC0956k.k<D> kVar, @dd androidx.loader.content.zy<D> zyVar) {
        try {
            this.f51609toq.hb();
            androidx.loader.content.zy<D> qVar = kVar.toq(i2, bundle);
            if (qVar == null) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be null");
            }
            if (qVar.getClass().isMemberClass() && !Modifier.isStatic(qVar.getClass().getModifiers())) {
                throw new IllegalArgumentException("Object returned from onCreateLoader must not be a non-static inner member class: " + qVar);
            }
            C0957k c0957k = new C0957k(i2, bundle, qVar, zyVar);
            if (f5141q) {
                Log.v(f51608zy, "  Created new loader " + c0957k);
            }
            this.f51609toq.m4513e(i2, c0957k);
            this.f51609toq.hyr();
            return c0957k.ni7(this.f5142k, kVar);
        } catch (Throwable th) {
            this.f51609toq.hyr();
            throw th;
        }
    }

    @Override // androidx.loader.app.AbstractC0956k
    @lvui
    @oc
    public <D> androidx.loader.content.zy<D> f7l8(int i2, @dd Bundle bundle, @lvui AbstractC0956k.k<D> kVar) {
        if (this.f51609toq.uv6()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("initLoader must be called on the main thread");
        }
        C0957k<D> c0957kM4512c = this.f51609toq.m4512c(i2);
        if (f5141q) {
            Log.v(f51608zy, "initLoader in " + this + ": args=" + bundle);
        }
        if (c0957kM4512c == null) {
            return m4506p(i2, bundle, kVar, null);
        }
        if (f5141q) {
            Log.v(f51608zy, "  Re-using existing loader " + c0957kM4512c);
        }
        return c0957kM4512c.ni7(this.f5142k, kVar);
    }

    @Override // androidx.loader.app.AbstractC0956k
    /* JADX INFO: renamed from: g */
    public boolean mo4500g() {
        return this.f51609toq.lrht();
    }

    @Override // androidx.loader.app.AbstractC0956k
    @oc
    /* JADX INFO: renamed from: k */
    public void mo4501k(int i2) {
        if (this.f51609toq.uv6()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("destroyLoader must be called on the main thread");
        }
        if (f5141q) {
            Log.v(f51608zy, "destroyLoader in " + this + " of " + i2);
        }
        C0957k c0957kM4512c = this.f51609toq.m4512c(i2);
        if (c0957kM4512c != null) {
            c0957kM4512c.ki(true);
            this.f51609toq.nn86(i2);
        }
    }

    @Override // androidx.loader.app.AbstractC0956k
    @dd
    /* JADX INFO: renamed from: n */
    public <D> androidx.loader.content.zy<D> mo4502n(int i2) {
        if (this.f51609toq.uv6()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        C0957k<D> c0957kM4512c = this.f51609toq.m4512c(i2);
        if (c0957kM4512c != null) {
            return c0957kM4512c.m4507i();
        }
        return null;
    }

    @Override // androidx.loader.app.AbstractC0956k
    @lvui
    @oc
    /* JADX INFO: renamed from: s */
    public <D> androidx.loader.content.zy<D> mo4503s(int i2, @dd Bundle bundle, @lvui AbstractC0956k.k<D> kVar) {
        if (this.f51609toq.uv6()) {
            throw new IllegalStateException("Called while creating a loader");
        }
        if (Looper.getMainLooper() != Looper.myLooper()) {
            throw new IllegalStateException("restartLoader must be called on the main thread");
        }
        if (f5141q) {
            Log.v(f51608zy, "restartLoader in " + this + ": args=" + bundle);
        }
        C0957k<D> c0957kM4512c = this.f51609toq.m4512c(i2);
        return m4506p(i2, bundle, kVar, c0957kM4512c != null ? c0957kM4512c.ki(false) : null);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("LoaderManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        C0640q.m2982k(this.f5142k, sb);
        sb.append("}}");
        return sb.toString();
    }

    @Override // androidx.loader.app.AbstractC0956k
    @Deprecated
    public void toq(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        this.f51609toq.n5r1(str, fileDescriptor, printWriter, strArr);
    }

    @Override // androidx.loader.app.AbstractC0956k
    /* JADX INFO: renamed from: y */
    public void mo4504y() {
        this.f51609toq.vyq();
    }
}

package androidx.core.provider;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import androidx.collection.ld6;
import androidx.collection.qrj;
import androidx.core.provider.C0605y;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import zy.dd;
import zy.lvui;
import zy.o1t;

/* JADX INFO: compiled from: FontRequestWorker.java */
/* JADX INFO: loaded from: classes.dex */
class f7l8 {

    /* JADX INFO: renamed from: k */
    static final ld6<String, Typeface> f3722k = new ld6<>(16);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final ExecutorService f50552toq = C0604s.m2810k("fonts-androidx", 10, 10000);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final Object f50553zy = new Object();

    /* JADX INFO: renamed from: q */
    @o1t("LOCK")
    static final qrj<String, ArrayList<androidx.core.util.zy<C0597n>>> f3723q = new qrj<>();

    /* JADX INFO: renamed from: androidx.core.provider.f7l8$k */
    /* JADX INFO: compiled from: FontRequestWorker.java */
    class CallableC0596k implements Callable<C0597n> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f3724g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f3725k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C0599g f3726n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Context f3727q;

        CallableC0596k(String str, Context context, C0599g c0599g, int i2) {
            this.f3725k = str;
            this.f3727q = context;
            this.f3726n = c0599g;
            this.f3724g = i2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C0597n call() {
            return f7l8.zy(this.f3725k, this.f3727q, this.f3726n, this.f3724g);
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.f7l8$q */
    /* JADX INFO: compiled from: FontRequestWorker.java */
    class C0598q implements androidx.core.util.zy<C0597n> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f3729k;

        C0598q(String str) {
            this.f3729k = str;
        }

        @Override // androidx.core.util.zy
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void accept(C0597n c0597n) {
            synchronized (f7l8.f50553zy) {
                qrj<String, ArrayList<androidx.core.util.zy<C0597n>>> qrjVar = f7l8.f3723q;
                ArrayList<androidx.core.util.zy<C0597n>> arrayList = qrjVar.get(this.f3729k);
                if (arrayList == null) {
                    return;
                }
                qrjVar.remove(this.f3729k);
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    arrayList.get(i2).accept(c0597n);
                }
            }
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    class toq implements androidx.core.util.zy<C0597n> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C0600k f3730k;

        toq(C0600k c0600k) {
            this.f3730k = c0600k;
        }

        @Override // androidx.core.util.zy
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void accept(C0597n c0597n) {
            if (c0597n == null) {
                c0597n = new C0597n(-3);
            }
            this.f3730k.toq(c0597n);
        }
    }

    /* JADX INFO: compiled from: FontRequestWorker.java */
    class zy implements Callable<C0597n> {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ int f3731g;

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f3732k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C0599g f3733n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Context f3734q;

        zy(String str, Context context, C0599g c0599g, int i2) {
            this.f3732k = str;
            this.f3734q = context;
            this.f3733n = c0599g;
            this.f3731g = i2;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public C0597n call() {
            try {
                return f7l8.zy(this.f3732k, this.f3734q, this.f3733n, this.f3731g);
            } catch (Throwable unused) {
                return new C0597n(-3);
            }
        }
    }

    private f7l8() {
    }

    /* JADX INFO: renamed from: g */
    static void m2784g() {
        f3722k.m841q();
    }

    /* JADX INFO: renamed from: k */
    private static String m2785k(@lvui C0599g c0599g, int i2) {
        return c0599g.m2796q() + C5658n.f73185t8r + i2;
    }

    /* JADX INFO: renamed from: n */
    static Typeface m2786n(@lvui Context context, @lvui C0599g c0599g, @lvui C0600k c0600k, int i2, int i3) {
        String strM2785k = m2785k(c0599g, i2);
        Typeface typefaceM836g = f3722k.m836g(strM2785k);
        if (typefaceM836g != null) {
            c0600k.toq(new C0597n(typefaceM836g));
            return typefaceM836g;
        }
        if (i3 == -1) {
            C0597n c0597nZy = zy(strM2785k, context, c0599g, i2);
            c0600k.toq(c0597nZy);
            return c0597nZy.f3728k;
        }
        try {
            C0597n c0597n = (C0597n) C0604s.m2811q(f50552toq, new CallableC0596k(strM2785k, context, c0599g, i2), i3);
            c0600k.toq(c0597n);
            return c0597n.f3728k;
        } catch (InterruptedException unused) {
            c0600k.toq(new C0597n(-3));
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    static Typeface m2787q(@lvui Context context, @lvui C0599g c0599g, int i2, @dd Executor executor, @lvui C0600k c0600k) {
        String strM2785k = m2785k(c0599g, i2);
        Typeface typefaceM836g = f3722k.m836g(strM2785k);
        if (typefaceM836g != null) {
            c0600k.toq(new C0597n(typefaceM836g));
            return typefaceM836g;
        }
        toq toqVar = new toq(c0600k);
        synchronized (f50553zy) {
            qrj<String, ArrayList<androidx.core.util.zy<C0597n>>> qrjVar = f3723q;
            ArrayList<androidx.core.util.zy<C0597n>> arrayList = qrjVar.get(strM2785k);
            if (arrayList != null) {
                arrayList.add(toqVar);
                return null;
            }
            ArrayList<androidx.core.util.zy<C0597n>> arrayList2 = new ArrayList<>();
            arrayList2.add(toqVar);
            qrjVar.put(strM2785k, arrayList2);
            zy zyVar = new zy(strM2785k, context, c0599g, i2);
            if (executor == null) {
                executor = f50552toq;
            }
            C0604s.zy(executor, zyVar, new C0598q(strM2785k));
            return null;
        }
    }

    @SuppressLint({"WrongConstant"})
    private static int toq(@lvui C0605y.toq toqVar) {
        int i2 = 1;
        if (toqVar.zy() != 0) {
            return toqVar.zy() != 1 ? -3 : -2;
        }
        C0605y.zy[] qVar = toqVar.toq();
        if (qVar != null && qVar.length != 0) {
            i2 = 0;
            for (C0605y.zy zyVar : qVar) {
                int qVar2 = zyVar.toq();
                if (qVar2 != 0) {
                    if (qVar2 < 0) {
                        return -3;
                    }
                    return qVar2;
                }
            }
        }
        return i2;
    }

    @lvui
    static C0597n zy(@lvui String str, @lvui Context context, @lvui C0599g c0599g, int i2) {
        ld6<String, Typeface> ld6Var = f3722k;
        Typeface typefaceM836g = ld6Var.m836g(str);
        if (typefaceM836g != null) {
            return new C0597n(typefaceM836g);
        }
        try {
            C0605y.toq toqVarM2801n = C0601n.m2801n(context, c0599g, null);
            int qVar = toq(toqVarM2801n);
            if (qVar != 0) {
                return new C0597n(qVar);
            }
            Typeface typefaceZy = androidx.core.graphics.o1t.zy(context, null, toqVarM2801n.toq(), i2);
            if (typefaceZy == null) {
                return new C0597n(-3);
            }
            ld6Var.m840p(str, typefaceZy);
            return new C0597n(typefaceZy);
        } catch (PackageManager.NameNotFoundException unused) {
            return new C0597n(-1);
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.f7l8$n */
    /* JADX INFO: compiled from: FontRequestWorker.java */
    static final class C0597n {

        /* JADX INFO: renamed from: k */
        final Typeface f3728k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f50554toq;

        C0597n(int i2) {
            this.f3728k = null;
            this.f50554toq = i2;
        }

        @SuppressLint({"WrongConstant"})
        /* JADX INFO: renamed from: k */
        boolean m2789k() {
            return this.f50554toq == 0;
        }

        @SuppressLint({"WrongConstant"})
        C0597n(@lvui Typeface typeface) {
            this.f3728k = typeface;
            this.f50554toq = 0;
        }
    }
}

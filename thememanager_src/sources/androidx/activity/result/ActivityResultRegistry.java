package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.contract.AbstractC0059k;
import androidx.core.app.C0447s;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fn3e;
import androidx.lifecycle.kja0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import zy.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes.dex */
public abstract class ActivityResultRegistry {

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f46452kja0 = 65536;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f46453ld6 = "KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f46454n7h = "ActivityResultRegistry";

    /* JADX INFO: renamed from: p */
    private static final String f106p = "KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f46455qrj = "KEY_COMPONENT_ACTIVITY_RANDOM_OBJECT";

    /* JADX INFO: renamed from: s */
    private static final String f107s = "KEY_COMPONENT_ACTIVITY_REGISTERED_RCS";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f46456x2 = "KEY_COMPONENT_ACTIVITY_PENDING_RESULT";

    /* JADX INFO: renamed from: k */
    private Random f109k = new Random();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Map<Integer, String> f46458toq = new HashMap();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    final Map<String, Integer> f46459zy = new HashMap();

    /* JADX INFO: renamed from: q */
    private final Map<String, C0056q> f111q = new HashMap();

    /* JADX INFO: renamed from: n */
    ArrayList<String> f110n = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    final transient Map<String, zy<?>> f108g = new HashMap();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    final Map<String, Object> f46457f7l8 = new HashMap();

    /* JADX INFO: renamed from: y */
    final Bundle f112y = new Bundle();

    /* JADX INFO: Add missing generic type declarations: [I] */
    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$k */
    class C0055k<I> extends AbstractC0067g<I> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f117k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f46460toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ AbstractC0059k f46461zy;

        C0055k(String str, int i2, AbstractC0059k abstractC0059k) {
            this.f117k = str;
            this.f46460toq = i2;
            this.f46461zy = abstractC0059k;
        }

        @Override // androidx.activity.result.AbstractC0067g
        @lvui
        /* JADX INFO: renamed from: k */
        public AbstractC0059k<I, ?> mo30k() {
            return this.f46461zy;
        }

        @Override // androidx.activity.result.AbstractC0067g
        /* JADX INFO: renamed from: q */
        public void mo31q() {
            ActivityResultRegistry.this.x2(this.f117k);
        }

        @Override // androidx.activity.result.AbstractC0067g
        public void zy(I i2, @dd C0447s c0447s) {
            ActivityResultRegistry.this.f110n.add(this.f117k);
            Integer num = ActivityResultRegistry.this.f46459zy.get(this.f117k);
            ActivityResultRegistry.this.mo9g(num != null ? num.intValue() : this.f46460toq, this.f46461zy, i2, c0447s);
        }
    }

    /* JADX INFO: renamed from: androidx.activity.result.ActivityResultRegistry$q */
    private static class C0056q {

        /* JADX INFO: renamed from: k */
        final kja0 f119k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final ArrayList<fn3e> f46462toq = new ArrayList<>();

        C0056q(@lvui kja0 kja0Var) {
            this.f119k = kja0Var;
        }

        /* JADX INFO: renamed from: k */
        void m32k(@lvui fn3e fn3eVar) {
            this.f119k.mo4451k(fn3eVar);
            this.f46462toq.add(fn3eVar);
        }

        void toq() {
            Iterator<fn3e> it = this.f46462toq.iterator();
            while (it.hasNext()) {
                this.f119k.zy(it.next());
            }
            this.f46462toq.clear();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [I] */
    class toq<I> extends AbstractC0067g<I> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ String f120k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ int f46463toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ AbstractC0059k f46464zy;

        toq(String str, int i2, AbstractC0059k abstractC0059k) {
            this.f120k = str;
            this.f46463toq = i2;
            this.f46464zy = abstractC0059k;
        }

        @Override // androidx.activity.result.AbstractC0067g
        @lvui
        /* JADX INFO: renamed from: k */
        public AbstractC0059k<I, ?> mo30k() {
            return this.f46464zy;
        }

        @Override // androidx.activity.result.AbstractC0067g
        /* JADX INFO: renamed from: q */
        public void mo31q() {
            ActivityResultRegistry.this.x2(this.f120k);
        }

        @Override // androidx.activity.result.AbstractC0067g
        public void zy(I i2, @dd C0447s c0447s) {
            ActivityResultRegistry.this.f110n.add(this.f120k);
            Integer num = ActivityResultRegistry.this.f46459zy.get(this.f120k);
            ActivityResultRegistry.this.mo9g(num != null ? num.intValue() : this.f46463toq, this.f46464zy, i2, c0447s);
        }
    }

    private static class zy<O> {

        /* JADX INFO: renamed from: k */
        final InterfaceC0068k<O> f122k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final AbstractC0059k<?, O> f46465toq;

        zy(InterfaceC0068k<O> interfaceC0068k, AbstractC0059k<?, O> abstractC0059k) {
            this.f122k = interfaceC0068k;
            this.f46465toq = abstractC0059k;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m24k(int i2, String str) {
        this.f46458toq.put(Integer.valueOf(i2), str);
        this.f46459zy.put(str, Integer.valueOf(i2));
    }

    private int ld6(String str) {
        Integer num = this.f46459zy.get(str);
        if (num != null) {
            return num.intValue();
        }
        int iM25n = m25n();
        m24k(iM25n, str);
        return iM25n;
    }

    /* JADX INFO: renamed from: n */
    private int m25n() {
        int iNextInt = this.f109k.nextInt(2147418112);
        while (true) {
            int i2 = iNextInt + 65536;
            if (!this.f46458toq.containsKey(Integer.valueOf(i2))) {
                return i2;
            }
            iNextInt = this.f109k.nextInt(2147418112);
        }
    }

    /* JADX INFO: renamed from: q */
    private <O> void m26q(String str, int i2, @dd Intent intent, @dd zy<O> zyVar) {
        InterfaceC0068k<O> interfaceC0068k;
        if (zyVar != null && (interfaceC0068k = zyVar.f122k) != null) {
            interfaceC0068k.mo79k(zyVar.f46465toq.zy(i2, intent));
        } else {
            this.f46457f7l8.remove(str);
            this.f112y.putParcelable(str, new ActivityResult(i2, intent));
        }
    }

    public final void f7l8(@dd Bundle bundle) {
        if (bundle == null) {
            return;
        }
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(f107s);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(f106p);
        if (stringArrayList == null || integerArrayList == null) {
            return;
        }
        this.f110n = bundle.getStringArrayList(f46453ld6);
        this.f109k = (Random) bundle.getSerializable(f46455qrj);
        this.f112y.putAll(bundle.getBundle(f46456x2));
        for (int i2 = 0; i2 < stringArrayList.size(); i2++) {
            String str = stringArrayList.get(i2);
            if (this.f46459zy.containsKey(str)) {
                Integer numRemove = this.f46459zy.remove(str);
                if (!this.f112y.containsKey(str)) {
                    this.f46458toq.remove(numRemove);
                }
            }
            m24k(integerArrayList.get(i2).intValue(), stringArrayList.get(i2));
        }
    }

    @oc
    /* JADX INFO: renamed from: g */
    public abstract <I, O> void mo9g(int i2, @lvui AbstractC0059k<I, O> abstractC0059k, @SuppressLint({"UnknownNullness"}) I i3, @dd C0447s c0447s);

    @lvui
    /* JADX INFO: renamed from: p */
    public final <I, O> AbstractC0067g<I> m27p(@lvui final String str, @lvui InterfaceC0954z interfaceC0954z, @lvui final AbstractC0059k<I, O> abstractC0059k, @lvui final InterfaceC0068k<O> interfaceC0068k) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        if (lifecycle.toq().isAtLeast(kja0.zy.STARTED)) {
            throw new IllegalStateException("LifecycleOwner " + interfaceC0954z + " is attempting to register while current state is " + lifecycle.toq() + ". LifecycleOwners must call register before they are STARTED.");
        }
        int iLd6 = ld6(str);
        C0056q c0056q = this.f111q.get(str);
        if (c0056q == null) {
            c0056q = new C0056q(lifecycle);
        }
        c0056q.m32k(new fn3e() { // from class: androidx.activity.result.ActivityResultRegistry.1
            @Override // androidx.lifecycle.fn3e
            public void gvn7(@lvui InterfaceC0954z interfaceC0954z2, @lvui kja0.toq toqVar) {
                if (!kja0.toq.ON_START.equals(toqVar)) {
                    if (kja0.toq.ON_STOP.equals(toqVar)) {
                        ActivityResultRegistry.this.f108g.remove(str);
                        return;
                    } else {
                        if (kja0.toq.ON_DESTROY.equals(toqVar)) {
                            ActivityResultRegistry.this.x2(str);
                            return;
                        }
                        return;
                    }
                }
                ActivityResultRegistry.this.f108g.put(str, new zy<>(interfaceC0068k, abstractC0059k));
                if (ActivityResultRegistry.this.f46457f7l8.containsKey(str)) {
                    Object obj = ActivityResultRegistry.this.f46457f7l8.get(str);
                    ActivityResultRegistry.this.f46457f7l8.remove(str);
                    interfaceC0068k.mo79k(obj);
                }
                ActivityResult activityResult = (ActivityResult) ActivityResultRegistry.this.f112y.getParcelable(str);
                if (activityResult != null) {
                    ActivityResultRegistry.this.f112y.remove(str);
                    interfaceC0068k.mo79k(abstractC0059k.zy(activityResult.m22k(), activityResult.getData()));
                }
            }
        });
        this.f111q.put(str, c0056q);
        return new C0055k(str, iLd6, abstractC0059k);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @lvui
    /* JADX INFO: renamed from: s */
    public final <I, O> AbstractC0067g<I> m28s(@lvui String str, @lvui AbstractC0059k<I, O> abstractC0059k, @lvui InterfaceC0068k<O> interfaceC0068k) {
        int iLd6 = ld6(str);
        this.f108g.put(str, new zy<>(interfaceC0068k, abstractC0059k));
        if (this.f46457f7l8.containsKey(str)) {
            Object obj = this.f46457f7l8.get(str);
            this.f46457f7l8.remove(str);
            interfaceC0068k.mo79k(obj);
        }
        ActivityResult activityResult = (ActivityResult) this.f112y.getParcelable(str);
        if (activityResult != null) {
            this.f112y.remove(str);
            interfaceC0068k.mo79k(abstractC0059k.zy(activityResult.m22k(), activityResult.getData()));
        }
        return new toq(str, iLd6, abstractC0059k);
    }

    @oc
    public final boolean toq(int i2, int i3, @dd Intent intent) {
        String str = this.f46458toq.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f110n.remove(str);
        m26q(str, i3, intent, this.f108g.get(str));
        return true;
    }

    @oc
    final void x2(@lvui String str) {
        Integer numRemove;
        if (!this.f110n.contains(str) && (numRemove = this.f46459zy.remove(str)) != null) {
            this.f46458toq.remove(numRemove);
        }
        this.f108g.remove(str);
        if (this.f46457f7l8.containsKey(str)) {
            Log.w(f46454n7h, "Dropping pending result for request " + str + ": " + this.f46457f7l8.get(str));
            this.f46457f7l8.remove(str);
        }
        if (this.f112y.containsKey(str)) {
            Log.w(f46454n7h, "Dropping pending result for request " + str + ": " + this.f112y.getParcelable(str));
            this.f112y.remove(str);
        }
        C0056q c0056q = this.f111q.get(str);
        if (c0056q != null) {
            c0056q.toq();
            this.f111q.remove(str);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m29y(@lvui Bundle bundle) {
        bundle.putIntegerArrayList(f107s, new ArrayList<>(this.f46459zy.values()));
        bundle.putStringArrayList(f106p, new ArrayList<>(this.f46459zy.keySet()));
        bundle.putStringArrayList(f46453ld6, new ArrayList<>(this.f110n));
        bundle.putBundle(f46456x2, (Bundle) this.f112y.clone());
        bundle.putSerializable(f46455qrj, this.f109k);
    }

    @oc
    public final <O> boolean zy(int i2, @SuppressLint({"UnknownNullness"}) O o2) {
        InterfaceC0068k<?> interfaceC0068k;
        String str = this.f46458toq.get(Integer.valueOf(i2));
        if (str == null) {
            return false;
        }
        this.f110n.remove(str);
        zy<?> zyVar = this.f108g.get(str);
        if (zyVar != null && (interfaceC0068k = zyVar.f122k) != null) {
            interfaceC0068k.mo79k(o2);
            return true;
        }
        this.f112y.remove(str);
        this.f46457f7l8.put(str, o2);
        return true;
    }
}

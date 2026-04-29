package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fn3e;
import androidx.lifecycle.kja0;
import androidx.savedstate.zy;
import com.market.sdk.reflect.C4991s;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Recreator.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00102\u00020\u0001:\u0002\u0005\u0011B\u000f\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0012"}, d2 = {"Landroidx/savedstate/Recreator;", "Landroidx/lifecycle/fn3e;", "", "className", "Lkotlin/was;", "k", "Landroidx/lifecycle/z;", "source", "Landroidx/lifecycle/kja0$toq;", "event", "gvn7", "Landroidx/savedstate/n;", "Landroidx/savedstate/n;", "owner", C4991s.f28129n, "(Landroidx/savedstate/n;)V", "q", "toq", "savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
public final class Recreator implements fn3e {

    /* JADX INFO: renamed from: g */
    @InterfaceC7396q
    public static final String f6279g = "androidx.savedstate.Restarter";

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    public static final String f6280n = "classes_to_restore";

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C1153k f6281q = new C1153k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final InterfaceC1157n f6282k;

    /* JADX INFO: renamed from: androidx.savedstate.Recreator$k */
    /* JADX INFO: compiled from: Recreator.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/savedstate/Recreator$k;", "", "", "CLASSES_KEY", "Ljava/lang/String;", "COMPONENT_KEY", C4991s.f28129n, "()V", "savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C1153k {
        private C1153k() {
        }

        public /* synthetic */ C1153k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: compiled from: Recreator.kt */
    @d3(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000f"}, d2 = {"Landroidx/savedstate/Recreator$toq;", "Landroidx/savedstate/zy$zy;", "Landroid/os/Bundle;", "k", "", "className", "Lkotlin/was;", "toq", "", "Ljava/util/Set;", "classes", "Landroidx/savedstate/zy;", "registry", C4991s.f28129n, "(Landroidx/savedstate/zy;)V", "savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq implements zy.InterfaceC7893zy {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final Set<String> f6283k;

        public toq(@InterfaceC7396q zy registry) {
            d2ok.m23075h(registry, "registry");
            this.f6283k = new LinkedHashSet();
            registry.m5240p(Recreator.f6279g, this);
        }

        @Override // androidx.savedstate.zy.InterfaceC7893zy
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public Bundle mo10k() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList(Recreator.f6280n, new ArrayList<>(this.f6283k));
            return bundle;
        }

        public final void toq(@InterfaceC7396q String className) {
            d2ok.m23075h(className, "className");
            this.f6283k.add(className);
        }
    }

    public Recreator(@InterfaceC7396q InterfaceC1157n owner) {
        d2ok.m23075h(owner, "owner");
        this.f6282k = owner;
    }

    /* JADX INFO: renamed from: k */
    private final void m5230k(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(zy.InterfaceC1159k.class);
            d2ok.kja0(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(new Object[0]);
                    d2ok.kja0(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((zy.InterfaceC1159k) objNewInstance).mo4379k(this.f6282k);
                } catch (Exception e2) {
                    throw new RuntimeException("Failed to instantiate " + str, e2);
                }
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e3);
            }
        } catch (ClassNotFoundException e4) {
            throw new RuntimeException("Class " + str + " wasn't found", e4);
        }
    }

    @Override // androidx.lifecycle.fn3e
    public void gvn7(@InterfaceC7396q InterfaceC0954z source, @InterfaceC7396q kja0.toq event) {
        d2ok.m23075h(source, "source");
        d2ok.m23075h(event, "event");
        if (event != kja0.toq.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().zy(this);
        Bundle qVar = this.f6282k.getSavedStateRegistry().toq(f6279g);
        if (qVar == null) {
            return;
        }
        ArrayList<String> stringArrayList = qVar.getStringArrayList(f6280n);
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            m5230k(it.next());
        }
    }
}

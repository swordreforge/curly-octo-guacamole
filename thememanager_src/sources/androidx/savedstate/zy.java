package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fn3e;
import androidx.lifecycle.kja0;
import androidx.savedstate.Recreator;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import java.util.Map;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.oc;

/* JADX INFO: compiled from: SavedStateRegistry.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00122\u00020\u0001:\u0003\u001a\u0005\nB\t\b\u0000¢\u0006\u0004\b.\u0010/J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u000f\u001a\u00020\b2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\r0\fH\u0007J\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0015\u001a\u00020\b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0017\u001a\u00020\u0004H\u0007R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00060\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010 R$\u0010&\u001a\u00020\u001d2\u0006\u0010\"\u001a\u00020\u001d8G@BX\u0086\u000e¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010%R\u0018\u0010)\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010(R\"\u0010-\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b*\u0010\u001e\u001a\u0004\b#\u0010%\"\u0004\b+\u0010,¨\u00060"}, d2 = {"Landroidx/savedstate/zy;", "", "", InterfaceC1925p.qn, "Landroid/os/Bundle;", "toq", "Landroidx/savedstate/zy$zy;", "provider", "Lkotlin/was;", "p", "zy", "qrj", "Ljava/lang/Class;", "Landroidx/savedstate/zy$k;", "clazz", "ld6", "Landroidx/lifecycle/kja0;", "lifecycle", "f7l8", "(Landroidx/lifecycle/kja0;)V", "savedState", AnimatedProperty.PROPERTY_NAME_Y, "(Landroid/os/Bundle;)V", "outBundle", C7704k.y.toq.f44691k, "Landroidx/arch/core/internal/toq;", "k", "Landroidx/arch/core/internal/toq;", "components", "", com.market.sdk.reflect.toq.f68929toq, "attached", "Landroid/os/Bundle;", "restoredState", "<set-?>", "q", "n", "()Z", "isRestored", "Landroidx/savedstate/Recreator$toq;", "Landroidx/savedstate/Recreator$toq;", "recreatorProvider", C7704k.y.toq.f95579toq, "x2", "(Z)V", "isAllowingSavingState", C4991s.f28129n, "()V", "savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
@SuppressLint({"RestrictedApi"})
public final class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final toq f52445f7l8 = new toq(null);

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    @Deprecated
    private static final String f6288y = "androidx.lifecycle.BundlableSavedStateRegistry.key";

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private Recreator.toq f6291n;

    /* JADX INFO: renamed from: q */
    private boolean f6292q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f52446toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private Bundle f52447zy;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final androidx.arch.core.internal.toq<String, InterfaceC7893zy> f6290k = new androidx.arch.core.internal.toq<>();

    /* JADX INFO: renamed from: g */
    private boolean f6289g = true;

    /* JADX INFO: renamed from: androidx.savedstate.zy$k */
    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Landroidx/savedstate/zy$k;", "", "Landroidx/savedstate/n;", "owner", "Lkotlin/was;", "k", "savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
    public interface InterfaceC1159k {
        /* JADX INFO: renamed from: k */
        void mo4379k(@InterfaceC7396q InterfaceC1157n interfaceC1157n);
    }

    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/savedstate/zy$toq;", "", "", "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", C4991s.f28129n, "()V", "savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
    private static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.savedstate.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: SavedStateRegistry.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Landroidx/savedstate/zy$zy;", "", "Landroid/os/Bundle;", "k", "savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
    public interface InterfaceC7893zy {
        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        Bundle mo10k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static final void m5237g(zy this$0, InterfaceC0954z interfaceC0954z, kja0.toq event) {
        d2ok.m23075h(this$0, "this$0");
        d2ok.m23075h(interfaceC0954z, "<anonymous parameter 0>");
        d2ok.m23075h(event, "event");
        if (event == kja0.toq.ON_START) {
            this$0.f6289g = true;
        } else if (event == kja0.toq.ON_STOP) {
            this$0.f6289g = false;
        }
    }

    @oc
    public final void f7l8(@InterfaceC7396q kja0 lifecycle) {
        d2ok.m23075h(lifecycle, "lifecycle");
        if (!(!this.f52446toq)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.mo4451k(new fn3e() { // from class: androidx.savedstate.toq
            @Override // androidx.lifecycle.fn3e
            public final void gvn7(InterfaceC0954z interfaceC0954z, kja0.toq toqVar) {
                zy.m5237g(this.f6287k, interfaceC0954z, toqVar);
            }
        });
        this.f52446toq = true;
    }

    @oc
    public final void ld6(@InterfaceC7396q Class<? extends InterfaceC1159k> clazz) {
        d2ok.m23075h(clazz, "clazz");
        if (!this.f6289g) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.toq toqVar = this.f6291n;
        if (toqVar == null) {
            toqVar = new Recreator.toq(this);
        }
        this.f6291n = toqVar;
        try {
            clazz.getDeclaredConstructor(new Class[0]);
            Recreator.toq toqVar2 = this.f6291n;
            if (toqVar2 != null) {
                String name = clazz.getName();
                d2ok.kja0(name, "clazz.name");
                toqVar2.toq(name);
            }
        } catch (NoSuchMethodException e2) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
        }
    }

    @oc
    /* JADX INFO: renamed from: n */
    public final boolean m5239n() {
        return this.f6292q;
    }

    @oc
    /* JADX INFO: renamed from: p */
    public final void m5240p(@InterfaceC7396q String key, @InterfaceC7396q InterfaceC7893zy provider) {
        d2ok.m23075h(key, "key");
        d2ok.m23075h(provider, "provider");
        if (!(this.f6290k.f7l8(key, provider) == null)) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5241q() {
        return this.f6289g;
    }

    @oc
    public final void qrj(@InterfaceC7396q String key) {
        d2ok.m23075h(key, "key");
        this.f6290k.mo770y(key);
    }

    @oc
    /* JADX INFO: renamed from: s */
    public final void m5242s(@InterfaceC7396q Bundle outBundle) {
        d2ok.m23075h(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f52447zy;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        androidx.arch.core.internal.toq<String, InterfaceC7893zy>.C0237q c0237qZy = this.f6290k.zy();
        d2ok.kja0(c0237qZy, "this.components.iteratorWithAdditions()");
        while (c0237qZy.hasNext()) {
            Map.Entry next = c0237qZy.next();
            bundle.putBundle((String) next.getKey(), ((InterfaceC7893zy) next.getValue()).mo10k());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle(f6288y, bundle);
    }

    @InterfaceC7395n
    @oc
    public final Bundle toq(@InterfaceC7396q String key) {
        d2ok.m23075h(key, "key");
        if (!this.f6292q) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f52447zy;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f52447zy;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f52447zy;
        boolean z2 = false;
        if (bundle4 != null && !bundle4.isEmpty()) {
            z2 = true;
        }
        if (!z2) {
            this.f52447zy = null;
        }
        return bundle2;
    }

    public final void x2(boolean z2) {
        this.f6289g = z2;
    }

    @oc
    /* JADX INFO: renamed from: y */
    public final void m5243y(@InterfaceC7395n Bundle bundle) {
        if (!this.f52446toq) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f6292q)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f52447zy = bundle != null ? bundle.getBundle(f6288y) : null;
        this.f6292q = true;
    }

    @InterfaceC7395n
    public final InterfaceC7893zy zy(@InterfaceC7396q String key) {
        d2ok.m23075h(key, "key");
        for (Map.Entry<String, InterfaceC7893zy> components : this.f6290k) {
            d2ok.kja0(components, "components");
            String key2 = components.getKey();
            InterfaceC7893zy value = components.getValue();
            if (d2ok.f7l8(key2, key)) {
                return value;
            }
        }
        return null;
    }
}

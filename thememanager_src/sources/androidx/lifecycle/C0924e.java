package androidx.lifecycle;

import android.app.Application;
import androidx.exifinterface.media.C0846k;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import eqxt.AbstractC6008k;
import eqxt.C6009n;
import eqxt.C6011y;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import l05.InterfaceC6765n;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.lifecycle.e */
/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0006\n\u0013\u001cB#\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0012¢\u0006\u0004\b\u0016\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0016\u0010\u001aB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0016\u0010\u001bJ(\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\u0014\u0010\u0015\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Landroidx/lifecycle/e;", "", "Landroidx/lifecycle/lrht;", C0846k.zaso, "Ljava/lang/Class;", "modelClass", "k", "(Ljava/lang/Class;)Landroidx/lifecycle/lrht;", "", InterfaceC1925p.qn, "toq", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/lrht;", "Landroidx/lifecycle/hb;", "Landroidx/lifecycle/hb;", "store", "Landroidx/lifecycle/e$toq;", "Landroidx/lifecycle/e$toq;", "factory", "Leqxt/k;", "zy", "Leqxt/k;", "defaultCreationExtras", C4991s.f28129n, "(Landroidx/lifecycle/hb;Landroidx/lifecycle/e$toq;Leqxt/k;)V", "Landroidx/lifecycle/j;", "owner", "(Landroidx/lifecycle/j;)V", "(Landroidx/lifecycle/j;Landroidx/lifecycle/e$toq;)V", "q", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
public class C0924e {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final hb f5058k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final toq f51574toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final AbstractC6008k f51575zy;

    /* JADX INFO: renamed from: androidx.lifecycle.e$q */
    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/lifecycle/e$q;", "", "Landroidx/lifecycle/lrht;", "viewModel", "Lkotlin/was;", "q", C4991s.f28129n, "()V", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public static class q {
        /* JADX INFO: renamed from: q */
        public void mo4425q(@InterfaceC7396q lrht viewModel) {
            kotlin.jvm.internal.d2ok.m23075h(viewModel, "viewModel");
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.e$toq */
    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\fJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/e$toq;", "", "Landroidx/lifecycle/lrht;", C0846k.zaso, "Ljava/lang/Class;", "modelClass", "toq", "(Ljava/lang/Class;)Landroidx/lifecycle/lrht;", "Leqxt/k;", C2690k.k.f15972p, "zy", "(Ljava/lang/Class;Leqxt/k;)Landroidx/lifecycle/lrht;", "k", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
    public interface toq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        public static final k f5064k = k.f5065k;

        /* JADX INFO: renamed from: androidx.lifecycle.e$toq$k */
        /* JADX INFO: compiled from: ViewModelProvider.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ+\u0010\u0006\u001a\u00020\u00052\u001a\u0010\u0004\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00030\u0002\"\u0006\u0012\u0002\b\u00030\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Landroidx/lifecycle/e$toq$k;", "", "", "Leqxt/y;", "initializers", "Landroidx/lifecycle/e$toq;", "k", "([Leqxt/y;)Landroidx/lifecycle/e$toq;", C4991s.f28129n, "()V", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
        public static final class k {

            /* JADX INFO: renamed from: k */
            static final /* synthetic */ k f5065k = new k();

            private k() {
            }

            @InterfaceC7396q
            @l05.qrj
            /* JADX INFO: renamed from: k */
            public final toq m4427k(@InterfaceC7396q C6011y<?>... initializers) {
                kotlin.jvm.internal.d2ok.m23075h(initializers, "initializers");
                return new eqxt.toq((C6011y[]) Arrays.copyOf(initializers, initializers.length));
            }
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: k */
        static toq m4426k(@InterfaceC7396q C6011y<?>... c6011yArr) {
            return f5064k.m4427k(c6011yArr);
        }

        @InterfaceC7396q
        default <T extends lrht> T toq(@InterfaceC7396q Class<T> modelClass) {
            kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
            throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        @InterfaceC7396q
        default <T extends lrht> T zy(@InterfaceC7396q Class<T> modelClass, @InterfaceC7396q AbstractC6008k extras) {
            kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
            kotlin.jvm.internal.d2ok.m23075h(extras, "extras");
            return (T) toq(modelClass);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.e$zy */
    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00062\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/e$zy;", "Landroidx/lifecycle/e$toq;", "Landroidx/lifecycle/lrht;", C0846k.zaso, "Ljava/lang/Class;", "modelClass", "toq", "(Ljava/lang/Class;)Landroidx/lifecycle/lrht;", C4991s.f28129n, "()V", "k", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
    public static class zy implements toq {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7395n
        private static zy f51578zy;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        public static final k f51577toq = new k(null);

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        @InterfaceC6765n
        public static final AbstractC6008k.toq<String> f5066q = k.C7884k.f5067k;

        /* JADX INFO: renamed from: androidx.lifecycle.e$zy$k */
        /* JADX INFO: compiled from: ViewModelProvider.kt */
        @kotlin.d3(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/e$zy$k;", "", "Landroidx/lifecycle/e$zy;", "k", "()Landroidx/lifecycle/e$zy;", "getInstance$annotations", "()V", "instance", "Leqxt/k$toq;", "", "VIEW_MODEL_KEY", "Leqxt/k$toq;", "sInstance", "Landroidx/lifecycle/e$zy;", C4991s.f28129n, "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
        public static final class k {

            /* JADX INFO: renamed from: androidx.lifecycle.e$zy$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ViewModelProvider.kt */
            @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/e$zy$k$k;", "Leqxt/k$toq;", "", C4991s.f28129n, "()V", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
            private static final class C7884k implements AbstractC6008k.toq<String> {

                /* JADX INFO: renamed from: k */
                @InterfaceC7396q
                public static final C7884k f5067k = new C7884k();

                private C7884k() {
                }
            }

            private k() {
            }

            public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }

            @l05.qrj
            public static /* synthetic */ void toq() {
            }

            @InterfaceC7396q
            @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
            /* JADX INFO: renamed from: k */
            public final zy m4431k() {
                if (zy.f51578zy == null) {
                    zy.f51578zy = new zy();
                }
                zy zyVar = zy.f51578zy;
                kotlin.jvm.internal.d2ok.qrj(zyVar);
                return zyVar;
            }
        }

        @InterfaceC7396q
        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
        /* JADX INFO: renamed from: g */
        public static final zy m4428g() {
            return f51577toq.m4431k();
        }

        @Override // androidx.lifecycle.C0924e.toq
        @InterfaceC7396q
        public <T extends lrht> T toq(@InterfaceC7396q Class<T> modelClass) {
            kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
            try {
                T tNewInstance = modelClass.newInstance();
                kotlin.jvm.internal.d2ok.kja0(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e3);
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6768s
    public C0924e(@InterfaceC7396q hb store, @InterfaceC7396q toq factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.d2ok.m23075h(store, "store");
        kotlin.jvm.internal.d2ok.m23075h(factory, "factory");
    }

    @InterfaceC6768s
    public C0924e(@InterfaceC7396q hb store, @InterfaceC7396q toq factory, @InterfaceC7396q AbstractC6008k defaultCreationExtras) {
        kotlin.jvm.internal.d2ok.m23075h(store, "store");
        kotlin.jvm.internal.d2ok.m23075h(factory, "factory");
        kotlin.jvm.internal.d2ok.m23075h(defaultCreationExtras, "defaultCreationExtras");
        this.f5058k = store;
        this.f51574toq = factory;
        this.f51575zy = defaultCreationExtras;
    }

    @InterfaceC7396q
    @zy.oc
    /* JADX INFO: renamed from: k */
    public <T extends lrht> T m4420k(@InterfaceC7396q Class<T> modelClass) {
        kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) toq("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @InterfaceC7396q
    @zy.oc
    public <T extends lrht> T toq(@InterfaceC7396q String key, @InterfaceC7396q Class<T> modelClass) {
        T t2;
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
        T viewModel = (T) this.f5058k.toq(key);
        if (!modelClass.isInstance(viewModel)) {
            C6009n c6009n = new C6009n(this.f51575zy);
            c6009n.zy(zy.f5066q, key);
            try {
                t2 = (T) this.f51574toq.zy(modelClass, c6009n);
            } catch (AbstractMethodError unused) {
                t2 = (T) this.f51574toq.toq(modelClass);
            }
            this.f5058k.m4442q(key, t2);
            return t2;
        }
        Object obj = this.f51574toq;
        q qVar = obj instanceof q ? (q) obj : null;
        if (qVar != null) {
            kotlin.jvm.internal.d2ok.kja0(viewModel, "viewModel");
            qVar.mo4425q(viewModel);
        }
        if (viewModel != null) {
            return viewModel;
        }
        throw new NullPointerException("null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
    }

    /* JADX INFO: renamed from: androidx.lifecycle.e$k */
    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.d3(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\b\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u001b\b\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u0015\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0018J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/e$k;", "Landroidx/lifecycle/e$zy;", "Landroidx/lifecycle/lrht;", C0846k.zaso, "Ljava/lang/Class;", "modelClass", "Landroid/app/Application;", "app", C7704k.y.toq.f44691k, "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/lrht;", "Leqxt/k;", C2690k.k.f15972p, "zy", "(Ljava/lang/Class;Leqxt/k;)Landroidx/lifecycle/lrht;", "toq", "(Ljava/lang/Class;)Landroidx/lifecycle/lrht;", "n", "Landroid/app/Application;", com.google.android.exoplayer2.util.wvg.f23308n, "", "unused", C4991s.f28129n, "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", C7704k.y.toq.f95579toq, "k", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
    public static class k extends zy {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC7396q
        public static final String f51576f7l8 = "androidx.lifecycle.ViewModelProvider.DefaultKey";

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        public static final C7882k f5059g = new C7882k(null);

        /* JADX INFO: renamed from: s */
        @InterfaceC7396q
        @InterfaceC6765n
        public static final AbstractC6008k.toq<Application> f5060s = C7882k.C7883k.f5063k;

        /* JADX INFO: renamed from: y */
        @InterfaceC7395n
        private static k f5061y;

        /* JADX INFO: renamed from: n */
        @InterfaceC7395n
        private final Application f5062n;

        /* JADX INFO: renamed from: androidx.lifecycle.e$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ViewModelProvider.kt */
        @kotlin.d3(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/e$k$k;", "", "Landroidx/lifecycle/j;", "owner", "Landroidx/lifecycle/e$toq;", "k", "(Landroidx/lifecycle/j;)Landroidx/lifecycle/e$toq;", "Landroid/app/Application;", com.google.android.exoplayer2.util.wvg.f23308n, "Landroidx/lifecycle/e$k;", "toq", "Leqxt/k$toq;", "APPLICATION_KEY", "Leqxt/k$toq;", "", "DEFAULT_KEY", "Ljava/lang/String;", "sInstance", "Landroidx/lifecycle/e$k;", C4991s.f28129n, "()V", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
        public static final class C7882k {

            /* JADX INFO: renamed from: androidx.lifecycle.e$k$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ViewModelProvider.kt */
            @kotlin.d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/e$k$k$k;", "Leqxt/k$toq;", "Landroid/app/Application;", C4991s.f28129n, "()V", "lifecycle-viewmodel_release"}, m22787k = 1, mv = {1, 6, 0})
            private static final class C7883k implements AbstractC6008k.toq<Application> {

                /* JADX INFO: renamed from: k */
                @InterfaceC7396q
                public static final C7883k f5063k = new C7883k();

                private C7883k() {
                }
            }

            private C7882k() {
            }

            public /* synthetic */ C7882k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }

            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public final toq m4424k(@InterfaceC7396q InterfaceC0931j owner) {
                kotlin.jvm.internal.d2ok.m23075h(owner, "owner");
                if (!(owner instanceof n7h)) {
                    return zy.f51577toq.m4431k();
                }
                toq defaultViewModelProviderFactory = ((n7h) owner).getDefaultViewModelProviderFactory();
                kotlin.jvm.internal.d2ok.kja0(defaultViewModelProviderFactory, "owner.defaultViewModelProviderFactory");
                return defaultViewModelProviderFactory;
            }

            @InterfaceC7396q
            @l05.qrj
            public final k toq(@InterfaceC7396q Application application) {
                kotlin.jvm.internal.d2ok.m23075h(application, "application");
                if (k.f5061y == null) {
                    k.f5061y = new k(application);
                }
                k kVar = k.f5061y;
                kotlin.jvm.internal.d2ok.qrj(kVar);
                return kVar;
            }
        }

        private k(Application application, int i2) {
            this.f5062n = application;
        }

        @InterfaceC7396q
        @l05.qrj
        /* JADX INFO: renamed from: p */
        public static final k m4421p(@InterfaceC7396q Application application) {
            return f5059g.toq(application);
        }

        /* JADX INFO: renamed from: s */
        private final <T extends lrht> T m4422s(Class<T> cls, Application application) {
            if (!androidx.lifecycle.toq.class.isAssignableFrom(cls)) {
                return (T) super.toq(cls);
            }
            try {
                T tNewInstance = cls.getConstructor(Application.class).newInstance(application);
                kotlin.jvm.internal.d2ok.kja0(tNewInstance, "{\n                try {\n…          }\n            }");
                return tNewInstance;
            } catch (IllegalAccessException e2) {
                throw new RuntimeException("Cannot create an instance of " + cls, e2);
            } catch (InstantiationException e3) {
                throw new RuntimeException("Cannot create an instance of " + cls, e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("Cannot create an instance of " + cls, e4);
            } catch (InvocationTargetException e6) {
                throw new RuntimeException("Cannot create an instance of " + cls, e6);
            }
        }

        @Override // androidx.lifecycle.C0924e.zy, androidx.lifecycle.C0924e.toq
        @InterfaceC7396q
        public <T extends lrht> T toq(@InterfaceC7396q Class<T> modelClass) {
            kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
            Application application = this.f5062n;
            if (application != null) {
                return (T) m4422s(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.C0924e.toq
        @InterfaceC7396q
        public <T extends lrht> T zy(@InterfaceC7396q Class<T> modelClass, @InterfaceC7396q AbstractC6008k extras) {
            kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
            kotlin.jvm.internal.d2ok.m23075h(extras, "extras");
            if (this.f5062n != null) {
                return (T) toq(modelClass);
            }
            Application application = (Application) extras.mo22253k(f5060s);
            if (application != null) {
                return (T) m4422s(modelClass, application);
            }
            if (androidx.lifecycle.toq.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.toq(modelClass);
        }

        public k() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public k(@InterfaceC7396q Application application) {
            this(application, 0);
            kotlin.jvm.internal.d2ok.m23075h(application, "application");
        }
    }

    public /* synthetic */ C0924e(hb hbVar, toq toqVar, AbstractC6008k abstractC6008k, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this(hbVar, toqVar, (i2 & 4) != 0 ? AbstractC6008k.k.f73818toq : abstractC6008k);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0924e(@InterfaceC7396q InterfaceC0931j owner) {
        kotlin.jvm.internal.d2ok.m23075h(owner, "owner");
        hb viewModelStore = owner.getViewModelStore();
        kotlin.jvm.internal.d2ok.kja0(viewModelStore, "owner.viewModelStore");
        this(viewModelStore, k.f5059g.m4424k(owner), nn86.m4465k(owner));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C0924e(@InterfaceC7396q InterfaceC0931j owner, @InterfaceC7396q toq factory) {
        kotlin.jvm.internal.d2ok.m23075h(owner, "owner");
        kotlin.jvm.internal.d2ok.m23075h(factory, "factory");
        hb viewModelStore = owner.getViewModelStore();
        kotlin.jvm.internal.d2ok.kja0(viewModelStore, "owner.viewModelStore");
        this(viewModelStore, factory, nn86.m4465k(owner));
    }
}

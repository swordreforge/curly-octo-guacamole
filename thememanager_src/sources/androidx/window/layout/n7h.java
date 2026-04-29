package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.layout.WindowLayoutComponent;
import com.market.sdk.reflect.C4991s;
import com.miui.maml.folme.AnimatedProperty;
import cyoe.InterfaceC5981k;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.function.Consumer;
import kotlin.d3;
import kotlin.fti;
import kotlin.jk;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.a98o;
import kotlin.jvm.internal.d2ok;
import kotlin.reflect.InterfaceC6374q;
import l05.C6764k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.hyr;

/* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\u0016\u0010\f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002J\u0018\u0010\u0010\u001a\u00020\u0004*\u00020\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\u0018\u0010\u0012\u001a\u00020\u0004*\u00020\r2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J \u0010\u0014\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0015\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0016\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J \u0010\u0017\u001a\u0012\u0012\u0002\b\u0003 \u0013*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u00188FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010 \u001a\u00020\u0004*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Landroidx/window/layout/n7h;", "", "Ljava/lang/ClassLoader;", "classLoader", "", C7704k.y.toq.f44691k, "ki", AnimatedProperty.PROPERTY_NAME_H, "n7h", "cdj", "Lkotlin/Function0;", "block", "t8r", "Ljava/lang/reflect/Method;", "Lkotlin/reflect/q;", "clazz", "ld6", "Ljava/lang/Class;", "p", "kotlin.jvm.PlatformType", "fn3e", "i", "x2", "zurt", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "toq", "Lkotlin/jk;", "qrj", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent", "kja0", "(Ljava/lang/reflect/Method;)Z", "isPublic", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class n7h {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final n7h f7165k = new n7h();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final jk f53747toq = fti.m22825k(C1339n.INSTANCE);

    /* JADX INFO: renamed from: androidx.window.layout.n7h$k */
    /* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
    @d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C1338k extends AbstractC6308r implements InterfaceC5981k<Boolean> {
        final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1338k(ClassLoader classLoader) {
            super(0);
            this.$classLoader = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Boolean invoke() throws NoSuchMethodException {
            n7h n7hVar = n7h.f7165k;
            Class clsX2 = n7hVar.x2(this.$classLoader);
            boolean z2 = false;
            Method getBoundsMethod = clsX2.getMethod("getBounds", new Class[0]);
            Method getTypeMethod = clsX2.getMethod("getType", new Class[0]);
            Method getStateMethod = clsX2.getMethod("getState", new Class[0]);
            d2ok.kja0(getBoundsMethod, "getBoundsMethod");
            if (n7hVar.ld6(getBoundsMethod, a98o.m23050q(Rect.class)) && n7hVar.kja0(getBoundsMethod)) {
                d2ok.kja0(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (n7hVar.ld6(getTypeMethod, a98o.m23050q(cls)) && n7hVar.kja0(getTypeMethod)) {
                    d2ok.kja0(getStateMethod, "getStateMethod");
                    if (n7hVar.ld6(getStateMethod, a98o.m23050q(cls)) && n7hVar.kja0(getStateMethod)) {
                        z2 = true;
                    }
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.n7h$n */
    /* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
    @d3(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "invoke"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C1339n extends AbstractC6308r implements InterfaceC5981k<WindowLayoutComponent> {
        public static final C1339n INSTANCE = new C1339n();

        C1339n() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7395n
        public final WindowLayoutComponent invoke() {
            ClassLoader classLoader = n7h.class.getClassLoader();
            if (classLoader == null || !n7h.f7165k.m5713s(classLoader)) {
                return null;
            }
            try {
                return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
            } catch (UnsupportedOperationException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.n7h$q */
    /* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
    @d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C1340q extends AbstractC6308r implements InterfaceC5981k<Boolean> {
        final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1340q(ClassLoader classLoader) {
            super(0);
            this.$classLoader = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Boolean invoke() throws NoSuchMethodException {
            n7h n7hVar = n7h.f7165k;
            boolean z2 = false;
            Method getWindowExtensionsMethod = n7hVar.fn3e(this.$classLoader).getDeclaredMethod("getWindowExtensions", new Class[0]);
            Class windowExtensionsClass = n7hVar.m5708i(this.$classLoader);
            d2ok.kja0(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            d2ok.kja0(windowExtensionsClass, "windowExtensionsClass");
            if (n7hVar.m5711p(getWindowExtensionsMethod, windowExtensionsClass) && n7hVar.kja0(getWindowExtensionsMethod)) {
                z2 = true;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
    @d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class toq extends AbstractC6308r implements InterfaceC5981k<Boolean> {
        final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        toq(ClassLoader classLoader) {
            super(0);
            this.$classLoader = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Boolean invoke() throws NoSuchMethodException {
            n7h n7hVar = n7h.f7165k;
            boolean z2 = false;
            Method getWindowLayoutComponentMethod = n7hVar.m5708i(this.$classLoader).getMethod("getWindowLayoutComponent", new Class[0]);
            Class windowLayoutComponentClass = n7hVar.zurt(this.$classLoader);
            d2ok.kja0(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            if (n7hVar.kja0(getWindowLayoutComponentMethod)) {
                d2ok.kja0(windowLayoutComponentClass, "windowLayoutComponentClass");
                if (n7hVar.m5711p(getWindowLayoutComponentMethod, windowLayoutComponentClass)) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
    @d3(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class zy extends AbstractC6308r implements InterfaceC5981k<Boolean> {
        final /* synthetic */ ClassLoader $classLoader;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        zy(ClassLoader classLoader) {
            super(0);
            this.$classLoader = classLoader;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // cyoe.InterfaceC5981k
        @InterfaceC7396q
        public final Boolean invoke() throws NoSuchMethodException {
            n7h n7hVar = n7h.f7165k;
            Class clsZurt = n7hVar.zurt(this.$classLoader);
            boolean z2 = false;
            Method addListenerMethod = clsZurt.getMethod("addWindowLayoutInfoListener", Activity.class, Consumer.class);
            Method removeListenerMethod = clsZurt.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            d2ok.kja0(addListenerMethod, "addListenerMethod");
            if (n7hVar.kja0(addListenerMethod)) {
                d2ok.kja0(removeListenerMethod, "removeListenerMethod");
                if (n7hVar.kja0(removeListenerMethod)) {
                    z2 = true;
                }
            }
            return Boolean.valueOf(z2);
        }
    }

    private n7h() {
    }

    @hyr(24)
    private final boolean cdj(ClassLoader classLoader) {
        return t8r(new zy(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> fn3e(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: renamed from: h */
    private final boolean m5707h(ClassLoader classLoader) {
        return t8r(new toq(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final Class<?> m5708i(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    private final boolean ki(ClassLoader classLoader) {
        return t8r(new C1340q(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean kja0(Method method) {
        return Modifier.isPublic(method.getModifiers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean ld6(Method method, InterfaceC6374q<?> interfaceC6374q) {
        return m5711p(method, C6764k.m24702n(interfaceC6374q));
    }

    private final boolean n7h(ClassLoader classLoader) {
        return t8r(new C1338k(classLoader));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final boolean m5711p(Method method, Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public final boolean m5713s(ClassLoader classLoader) {
        return ki(classLoader) && m5707h(classLoader) && cdj(classLoader) && n7h(classLoader);
    }

    private final boolean t8r(InterfaceC5981k<Boolean> interfaceC5981k) {
        try {
            return interfaceC5981k.invoke().booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> x2(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Class<?> zurt(ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }

    @InterfaceC7395n
    public final WindowLayoutComponent qrj() {
        return (WindowLayoutComponent) f53747toq.getValue();
    }
}

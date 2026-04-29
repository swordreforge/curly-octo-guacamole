package kotlin.jvm.internal;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import kotlin.reflect.InterfaceC6365i;
import kotlin.reflect.InterfaceC6380y;

/* JADX INFO: compiled from: CallableReference.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class cdj implements kotlin.reflect.zy, Serializable {

    @kotlin.yz(version = "1.1")
    public static final Object NO_RECEIVER = C6286k.f36390k;

    @kotlin.yz(version = "1.4")
    private final boolean isTopLevel;

    /* JADX INFO: renamed from: k */
    private transient kotlin.reflect.zy f36389k;

    @kotlin.yz(version = "1.4")
    private final String name;

    @kotlin.yz(version = "1.4")
    private final Class owner;

    @kotlin.yz(version = "1.1")
    protected final Object receiver;

    @kotlin.yz(version = "1.4")
    private final String signature;

    /* JADX INFO: renamed from: kotlin.jvm.internal.cdj$k */
    /* JADX INFO: compiled from: CallableReference.java */
    @kotlin.yz(version = "1.2")
    private static class C6286k implements Serializable {

        /* JADX INFO: renamed from: k */
        private static final C6286k f36390k = new C6286k();

        private C6286k() {
        }

        private Object readResolve() throws ObjectStreamException {
            return f36390k;
        }
    }

    public cdj() {
        this(NO_RECEIVER);
    }

    @Override // kotlin.reflect.zy
    public Object call(Object... objArr) {
        return getReflected().call(objArr);
    }

    @Override // kotlin.reflect.zy
    public Object callBy(Map map) {
        return getReflected().callBy(map);
    }

    @kotlin.yz(version = "1.1")
    public kotlin.reflect.zy compute() {
        kotlin.reflect.zy zyVar = this.f36389k;
        if (zyVar != null) {
            return zyVar;
        }
        kotlin.reflect.zy zyVarComputeReflected = computeReflected();
        this.f36389k = zyVarComputeReflected;
        return zyVarComputeReflected;
    }

    protected abstract kotlin.reflect.zy computeReflected();

    @Override // kotlin.reflect.toq
    public List<Annotation> getAnnotations() {
        return getReflected().getAnnotations();
    }

    @kotlin.yz(version = "1.1")
    public Object getBoundReceiver() {
        return this.receiver;
    }

    @Override // kotlin.reflect.zy
    public String getName() {
        return this.name;
    }

    public InterfaceC6380y getOwner() {
        Class cls = this.owner;
        if (cls == null) {
            return null;
        }
        return this.isTopLevel ? a98o.f7l8(cls) : a98o.m23050q(cls);
    }

    @Override // kotlin.reflect.zy
    public List<kotlin.reflect.n7h> getParameters() {
        return getReflected().getParameters();
    }

    @kotlin.yz(version = "1.1")
    protected kotlin.reflect.zy getReflected() {
        kotlin.reflect.zy zyVarCompute = compute();
        if (zyVarCompute != this) {
            return zyVarCompute;
        }
        throw new l05.cdj();
    }

    @Override // kotlin.reflect.zy
    public kotlin.reflect.t8r getReturnType() {
        return getReflected().getReturnType();
    }

    public String getSignature() {
        return this.signature;
    }

    @Override // kotlin.reflect.zy
    @kotlin.yz(version = "1.1")
    public List<InterfaceC6365i> getTypeParameters() {
        return getReflected().getTypeParameters();
    }

    @Override // kotlin.reflect.zy
    @kotlin.yz(version = "1.1")
    public kotlin.reflect.ni7 getVisibility() {
        return getReflected().getVisibility();
    }

    @Override // kotlin.reflect.zy
    @kotlin.yz(version = "1.1")
    public boolean isAbstract() {
        return getReflected().isAbstract();
    }

    @Override // kotlin.reflect.zy
    @kotlin.yz(version = "1.1")
    public boolean isFinal() {
        return getReflected().isFinal();
    }

    @Override // kotlin.reflect.zy
    @kotlin.yz(version = "1.1")
    public boolean isOpen() {
        return getReflected().isOpen();
    }

    @Override // kotlin.reflect.zy
    @kotlin.yz(version = "1.3")
    public boolean isSuspend() {
        return getReflected().isSuspend();
    }

    @kotlin.yz(version = "1.1")
    protected cdj(Object obj) {
        this(obj, null, null, null, false);
    }

    @kotlin.yz(version = "1.4")
    protected cdj(Object obj, Class cls, String str, String str2, boolean z2) {
        this.receiver = obj;
        this.owner = cls;
        this.name = str;
        this.signature = str2;
        this.isTopLevel = z2;
    }
}

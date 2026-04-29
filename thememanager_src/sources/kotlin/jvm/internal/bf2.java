package kotlin.jvm.internal;

/* JADX INFO: compiled from: PropertyReference.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class bf2 extends cdj implements kotlin.reflect.kja0 {
    private final boolean syntheticJavaProperty;

    public bf2() {
        this.syntheticJavaProperty = false;
    }

    @Override // kotlin.jvm.internal.cdj
    public kotlin.reflect.zy compute() {
        return this.syntheticJavaProperty ? this : super.compute();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bf2) {
            bf2 bf2Var = (bf2) obj;
            return getOwner().equals(bf2Var.getOwner()) && getName().equals(bf2Var.getName()) && getSignature().equals(bf2Var.getSignature()) && d2ok.f7l8(getBoundReceiver(), bf2Var.getBoundReceiver());
        }
        if (obj instanceof kotlin.reflect.kja0) {
            return obj.equals(compute());
        }
        return false;
    }

    public int hashCode() {
        return (((getOwner().hashCode() * 31) + getName().hashCode()) * 31) + getSignature().hashCode();
    }

    @Override // kotlin.reflect.kja0
    @kotlin.yz(version = "1.1")
    public boolean isConst() {
        return getReflected().isConst();
    }

    @Override // kotlin.reflect.kja0
    @kotlin.yz(version = "1.1")
    public boolean isLateinit() {
        return getReflected().isLateinit();
    }

    public String toString() {
        kotlin.reflect.zy zyVarCompute = compute();
        if (zyVarCompute != this) {
            return zyVarCompute.toString();
        }
        return "property " + getName() + " (Kotlin reflection is not available)";
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.cdj
    @kotlin.yz(version = "1.1")
    public kotlin.reflect.kja0 getReflected() {
        if (this.syntheticJavaProperty) {
            throw new UnsupportedOperationException("Kotlin reflection is not yet supported for synthetic Java properties");
        }
        return (kotlin.reflect.kja0) super.getReflected();
    }

    @kotlin.yz(version = "1.1")
    public bf2(Object obj) {
        super(obj);
        this.syntheticJavaProperty = false;
    }

    @kotlin.yz(version = "1.4")
    public bf2(Object obj, Class cls, String str, String str2, int i2) {
        super(obj, cls, str, str2, (i2 & 1) == 1);
        this.syntheticJavaProperty = (i2 & 2) == 2;
    }
}

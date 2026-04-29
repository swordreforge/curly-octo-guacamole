package androidx.lifecycle;

import androidx.lifecycle.kja0;

/* JADX INFO: loaded from: classes.dex */
class FullLifecycleObserverAdapter implements fn3e {

    /* JADX INFO: renamed from: k */
    private final ld6 f5000k;

    /* JADX INFO: renamed from: q */
    private final fn3e f5001q;

    /* JADX INFO: renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$k */
    static /* synthetic */ class C0911k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f5002k;

        static {
            int[] iArr = new int[kja0.toq.values().length];
            f5002k = iArr;
            try {
                iArr[kja0.toq.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5002k[kja0.toq.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5002k[kja0.toq.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5002k[kja0.toq.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f5002k[kja0.toq.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f5002k[kja0.toq.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f5002k[kja0.toq.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    FullLifecycleObserverAdapter(ld6 ld6Var, fn3e fn3eVar) {
        this.f5000k = ld6Var;
        this.f5001q = fn3eVar;
    }

    @Override // androidx.lifecycle.fn3e
    public void gvn7(@zy.lvui InterfaceC0954z interfaceC0954z, @zy.lvui kja0.toq toqVar) {
        switch (C0911k.f5002k[toqVar.ordinal()]) {
            case 1:
                this.f5000k.f7l8(interfaceC0954z);
                break;
            case 2:
                this.f5000k.onStart(interfaceC0954z);
                break;
            case 3:
                this.f5000k.t8r(interfaceC0954z);
                break;
            case 4:
                this.f5000k.zurt(interfaceC0954z);
                break;
            case 5:
                this.f5000k.onStop(interfaceC0954z);
                break;
            case 6:
                this.f5000k.onDestroy(interfaceC0954z);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        fn3e fn3eVar = this.f5001q;
        if (fn3eVar != null) {
            fn3eVar.gvn7(interfaceC0954z, toqVar);
        }
    }
}

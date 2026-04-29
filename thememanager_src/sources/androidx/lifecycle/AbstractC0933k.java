package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.C0924e;
import androidx.savedstate.InterfaceC1157n;
import eqxt.AbstractC6008k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.lifecycle.k */
/* JADX INFO: compiled from: AbstractSavedStateViewModelFactory.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0933k extends C0924e.q implements C0924e.toq {

    /* JADX INFO: renamed from: n */
    static final String f5091n = "androidx.lifecycle.savedstate.vm.tag";

    /* JADX INFO: renamed from: q */
    private Bundle f5092q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private androidx.savedstate.zy f51586toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private kja0 f51587zy;

    public AbstractC0933k() {
    }

    @zy.lvui
    /* JADX INFO: renamed from: n */
    private <T extends lrht> T m4447n(@zy.lvui String str, @zy.lvui Class<T> cls) {
        SavedStateHandleController qVar = LegacySavedStateHandleController.toq(this.f51586toq, this.f51587zy, str, this.f5092q);
        T t2 = (T) m4448g(str, cls, qVar.toq());
        t2.m4452l(f5091n, qVar);
        return t2;
    }

    @zy.lvui
    /* JADX INFO: renamed from: g */
    protected abstract <T extends lrht> T m4448g(@zy.lvui String str, @zy.lvui Class<T> cls, @zy.lvui dd ddVar);

    @Override // androidx.lifecycle.C0924e.q
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: q */
    public void mo4425q(@zy.lvui lrht lrhtVar) {
        androidx.savedstate.zy zyVar = this.f51586toq;
        if (zyVar != null) {
            LegacySavedStateHandleController.m4378k(lrhtVar, zyVar, this.f51587zy);
        }
    }

    @Override // androidx.lifecycle.C0924e.toq
    @zy.lvui
    public final <T extends lrht> T toq(@zy.lvui Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        if (this.f51587zy != null) {
            return (T) m4447n(canonicalName, cls);
        }
        throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.C0924e.toq
    @zy.lvui
    public final <T extends lrht> T zy(@zy.lvui Class<T> cls, @zy.lvui AbstractC6008k abstractC6008k) {
        String str = (String) abstractC6008k.mo22253k(C0924e.zy.f5066q);
        if (str != null) {
            return this.f51586toq != null ? (T) m4447n(str, cls) : (T) m4448g(str, cls, x9kr.toq(abstractC6008k));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @SuppressLint({"LambdaLast"})
    public AbstractC0933k(@zy.lvui InterfaceC1157n interfaceC1157n, @zy.dd Bundle bundle) {
        this.f51586toq = interfaceC1157n.getSavedStateRegistry();
        this.f51587zy = interfaceC1157n.getLifecycle();
        this.f5092q = bundle;
    }
}

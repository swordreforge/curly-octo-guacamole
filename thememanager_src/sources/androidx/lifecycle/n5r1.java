package androidx.lifecycle;

import android.annotation.SuppressLint;
import android.app.Application;
import android.os.Bundle;
import androidx.exifinterface.media.C0846k;
import androidx.lifecycle.C0924e;
import androidx.savedstate.InterfaceC1157n;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import eqxt.AbstractC6008k;
import java.lang.reflect.Constructor;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.uv6;

/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0016¢\u0006\u0004\b#\u0010$B\u001b\b\u0016\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b#\u0010'B%\b\u0017\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010&\u001a\u00020%\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b#\u0010(J/\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0004*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0003H\u0017R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0017R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006)"}, d2 = {"Landroidx/lifecycle/n5r1;", "Landroidx/lifecycle/e$q;", "Landroidx/lifecycle/e$toq;", "Landroidx/lifecycle/lrht;", C0846k.zaso, "Ljava/lang/Class;", "modelClass", "Leqxt/k;", C2690k.k.f15972p, "zy", "(Ljava/lang/Class;Leqxt/k;)Landroidx/lifecycle/lrht;", "", InterfaceC1925p.qn, "n", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/lrht;", "toq", "(Ljava/lang/Class;)Landroidx/lifecycle/lrht;", "viewModel", "Lkotlin/was;", "q", "Landroid/app/Application;", "Landroid/app/Application;", com.google.android.exoplayer2.util.wvg.f23308n, "Landroidx/lifecycle/e$toq;", "factory", "Landroid/os/Bundle;", "Landroid/os/Bundle;", "defaultArgs", "Landroidx/lifecycle/kja0;", "Landroidx/lifecycle/kja0;", "lifecycle", "Landroidx/savedstate/zy;", C7704k.y.toq.f95579toq, "Landroidx/savedstate/zy;", "savedStateRegistry", C4991s.f28129n, "()V", "Landroidx/savedstate/n;", "owner", "(Landroid/app/Application;Landroidx/savedstate/n;)V", "(Landroid/app/Application;Landroidx/savedstate/n;Landroid/os/Bundle;)V", "lifecycle-viewmodel-savedstate_release"}, m22787k = 1, mv = {1, 6, 0})
public final class n5r1 extends C0924e.q implements C0924e.toq {

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private androidx.savedstate.zy f5109g;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private kja0 f5110n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private Bundle f5111q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7395n
    private Application f51592toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final C0924e.toq f51593zy;

    public n5r1() {
        this.f51593zy = new C0924e.k();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final <T extends lrht> T m4462n(@InterfaceC7396q String key, @InterfaceC7396q Class<T> modelClass) {
        T t2;
        Application application;
        kotlin.jvm.internal.d2ok.m23075h(key, "key");
        kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
        if (this.f5110n == null) {
            throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        boolean zIsAssignableFrom = toq.class.isAssignableFrom(modelClass);
        Constructor constructorZy = (!zIsAssignableFrom || this.f51592toq == null) ? hyr.zy(modelClass, hyr.f51582toq) : hyr.zy(modelClass, hyr.f5088k);
        if (constructorZy == null) {
            return this.f51592toq != null ? (T) this.f51593zy.toq(modelClass) : (T) C0924e.zy.f51577toq.m4431k().toq(modelClass);
        }
        SavedStateHandleController qVar = LegacySavedStateHandleController.toq(this.f5109g, this.f5110n, key, this.f5111q);
        if (!zIsAssignableFrom || (application = this.f51592toq) == null) {
            dd qVar2 = qVar.toq();
            kotlin.jvm.internal.d2ok.kja0(qVar2, "controller.handle");
            t2 = (T) hyr.m4444q(modelClass, constructorZy, qVar2);
        } else {
            kotlin.jvm.internal.d2ok.qrj(application);
            dd qVar3 = qVar.toq();
            kotlin.jvm.internal.d2ok.kja0(qVar3, "controller.handle");
            t2 = (T) hyr.m4444q(modelClass, constructorZy, application, qVar3);
        }
        t2.m4452l("androidx.lifecycle.savedstate.vm.tag", qVar);
        return t2;
    }

    @Override // androidx.lifecycle.C0924e.q
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    /* JADX INFO: renamed from: q */
    public void mo4425q(@InterfaceC7396q lrht viewModel) {
        kotlin.jvm.internal.d2ok.m23075h(viewModel, "viewModel");
        kja0 kja0Var = this.f5110n;
        if (kja0Var != null) {
            LegacySavedStateHandleController.m4378k(viewModel, this.f5109g, kja0Var);
        }
    }

    @Override // androidx.lifecycle.C0924e.toq
    @InterfaceC7396q
    public <T extends lrht> T toq(@InterfaceC7396q Class<T> modelClass) {
        kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
        String canonicalName = modelClass.getCanonicalName();
        if (canonicalName != null) {
            return (T) m4462n(canonicalName, modelClass);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C0924e.toq
    @InterfaceC7396q
    public <T extends lrht> T zy(@InterfaceC7396q Class<T> modelClass, @InterfaceC7396q AbstractC6008k extras) {
        kotlin.jvm.internal.d2ok.m23075h(modelClass, "modelClass");
        kotlin.jvm.internal.d2ok.m23075h(extras, "extras");
        String str = (String) extras.mo22253k(C0924e.zy.f5066q);
        if (str == null) {
            throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
        }
        if (extras.mo22253k(x9kr.f51601zy) == null || extras.mo22253k(x9kr.f5132q) == null) {
            if (this.f5110n != null) {
                return (T) m4462n(str, modelClass);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        Application application = (Application) extras.mo22253k(C0924e.k.f5060s);
        boolean zIsAssignableFrom = toq.class.isAssignableFrom(modelClass);
        Constructor constructorZy = (!zIsAssignableFrom || application == null) ? hyr.zy(modelClass, hyr.f51582toq) : hyr.zy(modelClass, hyr.f5088k);
        return constructorZy == null ? (T) this.f51593zy.zy(modelClass, extras) : (!zIsAssignableFrom || application == null) ? (T) hyr.m4444q(modelClass, constructorZy, x9kr.toq(extras)) : (T) hyr.m4444q(modelClass, constructorZy, application, x9kr.toq(extras));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n5r1(@InterfaceC7395n Application application, @InterfaceC7396q InterfaceC1157n owner) {
        this(application, owner, null);
        kotlin.jvm.internal.d2ok.m23075h(owner, "owner");
    }

    @SuppressLint({"LambdaLast"})
    public n5r1(@InterfaceC7395n Application application, @InterfaceC7396q InterfaceC1157n owner, @InterfaceC7395n Bundle bundle) {
        C0924e.k kVar;
        kotlin.jvm.internal.d2ok.m23075h(owner, "owner");
        this.f5109g = owner.getSavedStateRegistry();
        this.f5110n = owner.getLifecycle();
        this.f5111q = bundle;
        this.f51592toq = application;
        if (application != null) {
            kVar = C0924e.k.f5059g.toq(application);
        } else {
            kVar = new C0924e.k();
        }
        this.f51593zy = kVar;
    }
}

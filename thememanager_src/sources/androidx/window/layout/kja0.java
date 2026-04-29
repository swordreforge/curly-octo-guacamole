package androidx.window.layout;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import androidx.window.core.f7l8;
import androidx.window.layout.qrj;
import androidx.window.layout.x2;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarDisplayFeature;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import com.market.sdk.reflect.C4991s;
import com.market.sdk.utils.C5019y;
import com.miui.maml.data.VariableNames;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.d3;
import kotlin.jvm.internal.AbstractC6308r;
import kotlin.jvm.internal.d2ok;
import m2t.C6794k;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;
import zy.yz;

/* JADX INFO: compiled from: SidecarAdapter.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\u0013B\u0011\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ(\u0010\u0007\u001a\u00020\u00062\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002H\u0002J\u001c\u0010\b\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003H\u0002J\"\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u000b\u001a\u00020\nJ\u0018\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0010\u001a\u00020\nJ\u001a\u0010\u0013\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\nJ\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0004\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000eJ!\u0010\u0016\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/kja0;", "", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "first", VariableNames.VAR_SECOND, "", "zy", "toq", "sidecarDisplayFeatures", "Landroidx/window/sidecar/SidecarDeviceState;", C6794k.f84369oc, "Landroidx/window/layout/f7l8;", C7704k.y.toq.f95579toq, "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "extensionInfo", "state", "Landroidx/window/layout/fu4;", "n", "k", "q", "feature", "f7l8", "(Landroidx/window/sidecar/SidecarDisplayFeature;Landroidx/window/sidecar/SidecarDeviceState;)Landroidx/window/layout/f7l8;", "Landroidx/window/core/f7l8$toq;", "Landroidx/window/core/f7l8$toq;", "verificationMode", C4991s.f28129n, "(Landroidx/window/core/f7l8$toq;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class kja0 {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final C1334k f53745toq = new C1334k(null);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f53746zy = kja0.class.getSimpleName();

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final f7l8.toq f7162k;

    /* JADX INFO: renamed from: androidx.window.layout.kja0$k */
    /* JADX INFO: compiled from: SidecarAdapter.kt */
    @d3(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0007J\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\fH\u0007R\u001c\u0010\u0014\u001a\n \u0013*\u0004\u0018\u00010\u00120\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Landroidx/window/layout/kja0$k;", "", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", C5019y.f69035jk, "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "zy", "displayFeatures", "Lkotlin/was;", "n", "Landroidx/window/sidecar/SidecarDeviceState;", "sidecarDeviceState", "", "toq", "(Landroidx/window/sidecar/SidecarDeviceState;)I", "k", "posture", "q", "", "kotlin.jvm.PlatformType", "TAG", "Ljava/lang/String;", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C1334k {
        private C1334k() {
        }

        public /* synthetic */ C1334k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        @yz
        /* JADX INFO: renamed from: k */
        public final int m5701k(@InterfaceC7396q SidecarDeviceState sidecarDeviceState) {
            d2ok.m23075h(sidecarDeviceState, "sidecarDeviceState");
            try {
                return sidecarDeviceState.posture;
            } catch (NoSuchFieldError unused) {
                try {
                    Object objInvoke = SidecarDeviceState.class.getMethod("getPosture", new Class[0]).invoke(sidecarDeviceState, new Object[0]);
                    if (objInvoke != null) {
                        return ((Integer) objInvoke).intValue();
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                    return 0;
                }
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @yz
        /* JADX INFO: renamed from: n */
        public final void m5702n(@InterfaceC7396q SidecarWindowLayoutInfo info, @InterfaceC7396q List<SidecarDisplayFeature> displayFeatures) {
            d2ok.m23075h(info, "info");
            d2ok.m23075h(displayFeatures, "displayFeatures");
            try {
                try {
                    info.displayFeatures = displayFeatures;
                } catch (NoSuchFieldError unused) {
                    SidecarWindowLayoutInfo.class.getMethod("setDisplayFeatures", List.class).invoke(info, displayFeatures);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        @SuppressLint({"BanUncheckedReflection"})
        @yz
        /* JADX INFO: renamed from: q */
        public final void m5703q(@InterfaceC7396q SidecarDeviceState sidecarDeviceState, int i2) {
            d2ok.m23075h(sidecarDeviceState, "sidecarDeviceState");
            try {
                try {
                    sidecarDeviceState.posture = i2;
                } catch (NoSuchFieldError unused) {
                    SidecarDeviceState.class.getMethod("setPosture", Integer.TYPE).invoke(sidecarDeviceState, Integer.valueOf(i2));
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
            }
        }

        public final int toq(@InterfaceC7396q SidecarDeviceState sidecarDeviceState) {
            d2ok.m23075h(sidecarDeviceState, "sidecarDeviceState");
            int iM5701k = m5701k(sidecarDeviceState);
            if (iM5701k < 0 || iM5701k > 4) {
                return 0;
            }
            return iM5701k;
        }

        @InterfaceC7396q
        @SuppressLint({"BanUncheckedReflection"})
        @yz
        public final List<SidecarDisplayFeature> zy(@InterfaceC7396q SidecarWindowLayoutInfo info) {
            d2ok.m23075h(info, "info");
            try {
                try {
                    List<SidecarDisplayFeature> list = info.displayFeatures;
                    return list == null ? kotlin.collections.ni7.a9() : list;
                } catch (NoSuchFieldError unused) {
                    Object objInvoke = SidecarWindowLayoutInfo.class.getMethod("getDisplayFeatures", new Class[0]).invoke(info, new Object[0]);
                    if (objInvoke != null) {
                        return (List) objInvoke;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>");
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
                return kotlin.collections.ni7.a9();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.kja0$n */
    /* JADX INFO: compiled from: SidecarAdapter.kt */
    @d3(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "invoke", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C1335n extends AbstractC6308r implements cyoe.x2<SidecarDisplayFeature, Boolean> {
        public static final C1335n INSTANCE = new C1335n();

        C1335n() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7396q SidecarDisplayFeature require) {
            d2ok.m23075h(require, "$this$require");
            return Boolean.valueOf(require.getRect().left == 0 || require.getRect().top == 0);
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.kja0$q */
    /* JADX INFO: compiled from: SidecarAdapter.kt */
    @d3(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "invoke", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class C1336q extends AbstractC6308r implements cyoe.x2<SidecarDisplayFeature, Boolean> {
        public static final C1336q INSTANCE = new C1336q();

        C1336q() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7396q SidecarDisplayFeature require) {
            d2ok.m23075h(require, "$this$require");
            boolean z2 = true;
            if (require.getType() == 1 && require.getRect().width() != 0 && require.getRect().height() != 0) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX INFO: compiled from: SidecarAdapter.kt */
    @d3(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "invoke", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class toq extends AbstractC6308r implements cyoe.x2<SidecarDisplayFeature, Boolean> {
        public static final toq INSTANCE = new toq();

        toq() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7396q SidecarDisplayFeature require) {
            d2ok.m23075h(require, "$this$require");
            boolean z2 = true;
            if (require.getType() != 1 && require.getType() != 2) {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        }
    }

    /* JADX INFO: compiled from: SidecarAdapter.kt */
    @d3(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Landroidx/window/sidecar/SidecarDisplayFeature;", "invoke", "(Landroidx/window/sidecar/SidecarDisplayFeature;)Ljava/lang/Boolean;"}, m22787k = 3, mv = {1, 6, 0}, xi = 48)
    static final class zy extends AbstractC6308r implements cyoe.x2<SidecarDisplayFeature, Boolean> {
        public static final zy INSTANCE = new zy();

        zy() {
            super(1);
        }

        @Override // cyoe.x2
        @InterfaceC7396q
        public final Boolean invoke(@InterfaceC7396q SidecarDisplayFeature require) {
            d2ok.m23075h(require, "$this$require");
            return Boolean.valueOf((require.getRect().width() == 0 && require.getRect().height() == 0) ? false : true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public kja0() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public kja0(@InterfaceC7396q f7l8.toq verificationMode) {
        d2ok.m23075h(verificationMode, "verificationMode");
        this.f7162k = verificationMode;
    }

    private final boolean toq(SidecarDisplayFeature sidecarDisplayFeature, SidecarDisplayFeature sidecarDisplayFeature2) {
        if (d2ok.f7l8(sidecarDisplayFeature, sidecarDisplayFeature2)) {
            return true;
        }
        if (sidecarDisplayFeature == null || sidecarDisplayFeature2 == null || sidecarDisplayFeature.getType() != sidecarDisplayFeature2.getType()) {
            return false;
        }
        return d2ok.f7l8(sidecarDisplayFeature.getRect(), sidecarDisplayFeature2.getRect());
    }

    private final boolean zy(List<SidecarDisplayFeature> list, List<SidecarDisplayFeature> list2) {
        if (list == list2) {
            return true;
        }
        if (list == null || list2 == null || list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        int i2 = 0;
        while (i2 < size) {
            int i3 = i2 + 1;
            if (!toq(list.get(i2), list2.get(i2))) {
                return false;
            }
            i2 = i3;
        }
        return true;
    }

    @InterfaceC7395n
    public final f7l8 f7l8(@InterfaceC7396q SidecarDisplayFeature feature, @InterfaceC7396q SidecarDeviceState deviceState) {
        qrj.toq toqVarM5725k;
        x2.zy zyVar;
        d2ok.m23075h(feature, "feature");
        d2ok.m23075h(deviceState, "deviceState");
        f7l8.C1305k c1305k = androidx.window.core.f7l8.f7075k;
        String TAG = f53746zy;
        d2ok.kja0(TAG, "TAG");
        SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) f7l8.C1305k.toq(c1305k, feature, TAG, this.f7162k, null, 4, null).zy("Type must be either TYPE_FOLD or TYPE_HINGE", toq.INSTANCE).zy("Feature bounds must not be 0", zy.INSTANCE).zy("TYPE_FOLD must have 0 area", C1336q.INSTANCE).zy("Feature be pinned to either left or top", C1335n.INSTANCE).mo5585k();
        if (sidecarDisplayFeature == null) {
            return null;
        }
        int type = sidecarDisplayFeature.getType();
        if (type == 1) {
            toqVarM5725k = qrj.toq.f53755toq.m5725k();
        } else {
            if (type != 2) {
                return null;
            }
            toqVarM5725k = qrj.toq.f53755toq.toq();
        }
        int qVar = f53745toq.toq(deviceState);
        if (qVar == 0 || qVar == 1) {
            return null;
        }
        if (qVar == 2) {
            zyVar = x2.zy.f7184q;
        } else {
            if (qVar != 3 && qVar == 4) {
                return null;
            }
            zyVar = x2.zy.f53766zy;
        }
        Rect rect = feature.getRect();
        d2ok.kja0(rect, "feature.rect");
        return new qrj(new androidx.window.core.toq(rect), toqVarM5725k, zyVar);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final List<f7l8> m5697g(@InterfaceC7396q List<SidecarDisplayFeature> sidecarDisplayFeatures, @InterfaceC7396q SidecarDeviceState deviceState) {
        d2ok.m23075h(sidecarDisplayFeatures, "sidecarDisplayFeatures");
        d2ok.m23075h(deviceState, "deviceState");
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = sidecarDisplayFeatures.iterator();
        while (it.hasNext()) {
            f7l8 f7l8VarF7l8 = f7l8((SidecarDisplayFeature) it.next(), deviceState);
            if (f7l8VarF7l8 != null) {
                arrayList.add(f7l8VarF7l8);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public final boolean m5698k(@InterfaceC7395n SidecarDeviceState sidecarDeviceState, @InterfaceC7395n SidecarDeviceState sidecarDeviceState2) {
        if (d2ok.f7l8(sidecarDeviceState, sidecarDeviceState2)) {
            return true;
        }
        if (sidecarDeviceState == null || sidecarDeviceState2 == null) {
            return false;
        }
        C1334k c1334k = f53745toq;
        return c1334k.toq(sidecarDeviceState) == c1334k.toq(sidecarDeviceState2);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final fu4 m5699n(@InterfaceC7395n SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @InterfaceC7396q SidecarDeviceState state) {
        d2ok.m23075h(state, "state");
        if (sidecarWindowLayoutInfo == null) {
            return new fu4(kotlin.collections.ni7.a9());
        }
        SidecarDeviceState sidecarDeviceState = new SidecarDeviceState();
        C1334k c1334k = f53745toq;
        c1334k.m5703q(sidecarDeviceState, c1334k.toq(state));
        return new fu4(m5697g(c1334k.zy(sidecarWindowLayoutInfo), sidecarDeviceState));
    }

    /* JADX INFO: renamed from: q */
    public final boolean m5700q(@InterfaceC7395n SidecarWindowLayoutInfo sidecarWindowLayoutInfo, @InterfaceC7395n SidecarWindowLayoutInfo sidecarWindowLayoutInfo2) {
        if (d2ok.f7l8(sidecarWindowLayoutInfo, sidecarWindowLayoutInfo2)) {
            return true;
        }
        if (sidecarWindowLayoutInfo == null || sidecarWindowLayoutInfo2 == null) {
            return false;
        }
        C1334k c1334k = f53745toq;
        return zy(c1334k.zy(sidecarWindowLayoutInfo), c1334k.zy(sidecarWindowLayoutInfo2));
    }

    public /* synthetic */ kja0(f7l8.toq toqVar, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this((i2 & 1) != 0 ? f7l8.toq.QUIET : toqVar);
    }
}

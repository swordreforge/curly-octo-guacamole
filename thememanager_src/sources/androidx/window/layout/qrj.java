package androidx.window.layout;

import android.graphics.Rect;
import androidx.window.layout.x2;
import com.android.thememanager.settingssearch.C2690k;
import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: HardwareFoldingFeature.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0002\u000b\u000fB\u001f\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b&\u0010'J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0013\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0016R\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001a\u0010\u0013\u001a\u00020\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u001eR\u0014\u0010\"\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010!R\u0014\u0010%\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010$¨\u0006("}, d2 = {"Landroidx/window/layout/qrj;", "Landroidx/window/layout/x2;", "", "toString", "", C2690k.k.f61039ld6, "", "equals", "", "hashCode", "Landroidx/window/core/toq;", "k", "Landroidx/window/core/toq;", "featureBounds", "Landroidx/window/layout/qrj$toq;", "toq", "Landroidx/window/layout/qrj$toq;", "q", "()Landroidx/window/layout/qrj$toq;", "type", "Landroidx/window/layout/x2$zy;", "zy", "Landroidx/window/layout/x2$zy;", "getState", "()Landroidx/window/layout/x2$zy;", "state", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "bounds", "()Z", "isSeparating", "Landroidx/window/layout/x2$k;", "()Landroidx/window/layout/x2$k;", "occlusionType", "Landroidx/window/layout/x2$toq;", "()Landroidx/window/layout/x2$toq;", "orientation", C4991s.f28129n, "(Landroidx/window/core/toq;Landroidx/window/layout/qrj$toq;Landroidx/window/layout/x2$zy;)V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public final class qrj implements x2 {

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final C1344k f7173q = new C1344k(null);

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final androidx.window.core.toq f7174k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final toq f53753toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final x2.zy f53754zy;

    /* JADX INFO: renamed from: androidx.window.layout.qrj$k */
    /* JADX INFO: compiled from: HardwareFoldingFeature.kt */
    @d3(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/window/layout/qrj$k;", "", "Landroidx/window/core/toq;", "bounds", "Lkotlin/was;", "k", "(Landroidx/window/core/toq;)V", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C1344k {
        private C1344k() {
        }

        public /* synthetic */ C1344k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        public final void m5723k(@InterfaceC7396q androidx.window.core.toq bounds) {
            d2ok.m23075h(bounds, "bounds");
            if (!((bounds.m5600g() == 0 && bounds.toq() == 0) ? false : true)) {
                throw new IllegalArgumentException("Bounds must be non zero".toString());
            }
            if (!(bounds.zy() == 0 || bounds.m5602n() == 0)) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
            }
        }
    }

    /* JADX INFO: compiled from: HardwareFoldingFeature.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/window/layout/qrj$toq;", "", "", "toString", "k", "Ljava/lang/String;", "description", C4991s.f28129n, "(Ljava/lang/String;)V", "toq", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final String f7176k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        public static final C1345k f53755toq = new C1345k(null);

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private static final toq f53756zy = new toq("FOLD");

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        private static final toq f7175q = new toq("HINGE");

        /* JADX INFO: renamed from: androidx.window.layout.qrj$toq$k */
        /* JADX INFO: compiled from: HardwareFoldingFeature.kt */
        @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/qrj$toq$k;", "", "Landroidx/window/layout/qrj$toq;", "FOLD", "Landroidx/window/layout/qrj$toq;", "k", "()Landroidx/window/layout/qrj$toq;", "HINGE", "toq", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
        public static final class C1345k {
            private C1345k() {
            }

            public /* synthetic */ C1345k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }

            @InterfaceC7396q
            /* JADX INFO: renamed from: k */
            public final toq m5725k() {
                return toq.f53756zy;
            }

            @InterfaceC7396q
            public final toq toq() {
                return toq.f7175q;
            }
        }

        private toq(String str) {
            this.f7176k = str;
        }

        @InterfaceC7396q
        public String toString() {
            return this.f7176k;
        }
    }

    public qrj(@InterfaceC7396q androidx.window.core.toq featureBounds, @InterfaceC7396q toq type, @InterfaceC7396q x2.zy state) {
        d2ok.m23075h(featureBounds, "featureBounds");
        d2ok.m23075h(type, "type");
        d2ok.m23075h(state, "state");
        this.f7174k = featureBounds;
        this.f53753toq = type;
        this.f53754zy = state;
        f7173q.m5723k(featureBounds);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!d2ok.f7l8(qrj.class, obj == null ? null : obj.getClass())) {
            return false;
        }
        if (obj == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        }
        qrj qrjVar = (qrj) obj;
        return d2ok.f7l8(this.f7174k, qrjVar.f7174k) && d2ok.f7l8(this.f53753toq, qrjVar.f53753toq) && d2ok.f7l8(getState(), qrjVar.getState());
    }

    @Override // androidx.window.layout.f7l8
    @InterfaceC7396q
    public Rect getBounds() {
        return this.f7174k.m5604s();
    }

    @Override // androidx.window.layout.x2
    @InterfaceC7396q
    public x2.zy getState() {
        return this.f53754zy;
    }

    public int hashCode() {
        return (((this.f7174k.hashCode() * 31) + this.f53753toq.hashCode()) * 31) + getState().hashCode();
    }

    @Override // androidx.window.layout.x2
    /* JADX INFO: renamed from: k */
    public boolean mo5721k() {
        toq toqVar = this.f53753toq;
        toq.C1345k c1345k = toq.f53755toq;
        if (d2ok.f7l8(toqVar, c1345k.toq())) {
            return true;
        }
        return d2ok.f7l8(this.f53753toq, c1345k.m5725k()) && d2ok.f7l8(getState(), x2.zy.f7184q);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final toq m5722q() {
        return this.f53753toq;
    }

    @InterfaceC7396q
    public String toString() {
        return ((Object) qrj.class.getSimpleName()) + " { " + this.f7174k + ", type=" + this.f53753toq + ", state=" + getState() + " }";
    }

    @Override // androidx.window.layout.x2
    @InterfaceC7396q
    public x2.toq toq() {
        return this.f7174k.m5600g() > this.f7174k.toq() ? x2.toq.f7182q : x2.toq.f53764zy;
    }

    @Override // androidx.window.layout.x2
    @InterfaceC7396q
    public x2.C1349k zy() {
        return (this.f7174k.m5600g() == 0 || this.f7174k.toq() == 0) ? x2.C1349k.f53762zy : x2.C1349k.f7180q;
    }
}

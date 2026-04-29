package androidx.window.layout;

import com.market.sdk.reflect.C4991s;
import kotlin.d3;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FoldingFeature.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0003\u000b\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00068&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0011\u001a\u00020\u000e8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Landroidx/window/layout/x2;", "Landroidx/window/layout/f7l8;", "", "k", "()Z", "isSeparating", "Landroidx/window/layout/x2$k;", "zy", "()Landroidx/window/layout/x2$k;", "occlusionType", "Landroidx/window/layout/x2$toq;", "toq", "()Landroidx/window/layout/x2$toq;", "orientation", "Landroidx/window/layout/x2$zy;", "getState", "()Landroidx/window/layout/x2$zy;", "state", "window_release"}, m22787k = 1, mv = {1, 6, 0})
public interface x2 extends f7l8 {

    /* JADX INFO: renamed from: androidx.window.layout.x2$k */
    /* JADX INFO: compiled from: FoldingFeature.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/window/layout/x2$k;", "", "", "toString", "k", "Ljava/lang/String;", "description", C4991s.f28129n, "(Ljava/lang/String;)V", "toq", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class C1349k {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final String f7181k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        public static final k f53761toq = new k(null);

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public static final C1349k f53762zy = new C1349k("NONE");

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        @InterfaceC6765n
        public static final C1349k f7180q = new C1349k("FULL");

        /* JADX INFO: renamed from: androidx.window.layout.x2$k$k */
        /* JADX INFO: compiled from: FoldingFeature.kt */
        @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/window/layout/x2$k$k;", "", "Landroidx/window/layout/x2$k;", "FULL", "Landroidx/window/layout/x2$k;", "NONE", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
        public static final class k {
            private k() {
            }

            public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }
        }

        private C1349k(String str) {
            this.f7181k = str;
        }

        @InterfaceC7396q
        public String toString() {
            return this.f7181k;
        }
    }

    /* JADX INFO: compiled from: FoldingFeature.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/window/layout/x2$toq;", "", "", "toString", "k", "Ljava/lang/String;", "description", C4991s.f28129n, "(Ljava/lang/String;)V", "toq", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class toq {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final String f7183k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        public static final C1350k f53763toq = new C1350k(null);

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public static final toq f53764zy = new toq("VERTICAL");

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        @InterfaceC6765n
        public static final toq f7182q = new toq("HORIZONTAL");

        /* JADX INFO: renamed from: androidx.window.layout.x2$toq$k */
        /* JADX INFO: compiled from: FoldingFeature.kt */
        @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/window/layout/x2$toq$k;", "", "Landroidx/window/layout/x2$toq;", "HORIZONTAL", "Landroidx/window/layout/x2$toq;", "VERTICAL", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
        public static final class C1350k {
            private C1350k() {
            }

            public /* synthetic */ C1350k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }
        }

        private toq(String str) {
            this.f7183k = str;
        }

        @InterfaceC7396q
        public String toString() {
            return this.f7183k;
        }
    }

    /* JADX INFO: compiled from: FoldingFeature.kt */
    @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \t2\u00020\u0001:\u0001\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\n"}, d2 = {"Landroidx/window/layout/x2$zy;", "", "", "toString", "k", "Ljava/lang/String;", "description", C4991s.f28129n, "(Ljava/lang/String;)V", "toq", "window_release"}, m22787k = 1, mv = {1, 6, 0})
    public static final class zy {

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final String f7185k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        public static final C1351k f53765toq = new C1351k(null);

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        @InterfaceC6765n
        public static final zy f53766zy = new zy("FLAT");

        /* JADX INFO: renamed from: q */
        @InterfaceC7396q
        @InterfaceC6765n
        public static final zy f7184q = new zy("HALF_OPENED");

        /* JADX INFO: renamed from: androidx.window.layout.x2$zy$k */
        /* JADX INFO: compiled from: FoldingFeature.kt */
        @d3(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Landroidx/window/layout/x2$zy$k;", "", "Landroidx/window/layout/x2$zy;", "FLAT", "Landroidx/window/layout/x2$zy;", "HALF_OPENED", C4991s.f28129n, "()V", "window_release"}, m22787k = 1, mv = {1, 6, 0})
        public static final class C1351k {
            private C1351k() {
            }

            public /* synthetic */ C1351k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }
        }

        private zy(String str) {
            this.f7185k = str;
        }

        @InterfaceC7396q
        public String toString() {
            return this.f7185k;
        }
    }

    @InterfaceC7396q
    zy getState();

    /* JADX INFO: renamed from: k */
    boolean mo5721k();

    @InterfaceC7396q
    toq toq();

    @InterfaceC7396q
    C1349k zy();
}

package okio;

import java.util.ArrayList;
import java.util.Map;
import kotlin.reflect.C6371n;
import kotlin.reflect.InterfaceC6374q;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: FileMetadata.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class fn3e {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7395n
    private final Long f94268f7l8;

    /* JADX INFO: renamed from: g */
    @InterfaceC7395n
    private final Long f43710g;

    /* JADX INFO: renamed from: k */
    private final boolean f43711k;

    /* JADX INFO: renamed from: n */
    @InterfaceC7395n
    private final Long f43712n;

    /* JADX INFO: renamed from: q */
    @InterfaceC7395n
    private final Long f43713q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f94269toq;

    /* JADX INFO: renamed from: y */
    @InterfaceC7396q
    private final Map<InterfaceC6374q<?>, Object> f43714y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7395n
    private final ncyb f94270zy;

    public fn3e() {
        this(false, false, null, null, null, null, null, null, 255, null);
    }

    public fn3e(boolean z2, boolean z3, @InterfaceC7395n ncyb ncybVar, @InterfaceC7395n Long l2, @InterfaceC7395n Long l3, @InterfaceC7395n Long l4, @InterfaceC7395n Long l5, @InterfaceC7396q Map<InterfaceC6374q<?>, ? extends Object> extras) {
        kotlin.jvm.internal.d2ok.m23075h(extras, "extras");
        this.f43711k = z2;
        this.f94269toq = z3;
        this.f94270zy = ncybVar;
        this.f43713q = l2;
        this.f43712n = l3;
        this.f43710g = l4;
        this.f94268f7l8 = l5;
        this.f43714y = kotlin.collections.nn86.mu(extras);
    }

    @InterfaceC7395n
    public final Long f7l8() {
        return this.f43710g;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public final Long m27615g() {
        return this.f94268f7l8;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final fn3e m27616k(boolean z2, boolean z3, @InterfaceC7395n ncyb ncybVar, @InterfaceC7395n Long l2, @InterfaceC7395n Long l3, @InterfaceC7395n Long l4, @InterfaceC7395n Long l5, @InterfaceC7396q Map<InterfaceC6374q<?>, ? extends Object> extras) {
        kotlin.jvm.internal.d2ok.m23075h(extras, "extras");
        return new fn3e(z2, z3, ncybVar, l2, l3, l4, l5, extras);
    }

    public final boolean ld6() {
        return this.f43711k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final Map<InterfaceC6374q<?>, Object> m27617n() {
        return this.f43714y;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m27618p() {
        return this.f94269toq;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public final Long m27619q() {
        return this.f43712n;
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: s */
    public final ncyb m27620s() {
        return this.f94270zy;
    }

    @InterfaceC7396q
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (this.f43711k) {
            arrayList.add("isRegularFile");
        }
        if (this.f94269toq) {
            arrayList.add("isDirectory");
        }
        if (this.f43713q != null) {
            arrayList.add("byteCount=" + this.f43713q);
        }
        if (this.f43712n != null) {
            arrayList.add("createdAt=" + this.f43712n);
        }
        if (this.f43710g != null) {
            arrayList.add("lastModifiedAt=" + this.f43710g);
        }
        if (this.f94268f7l8 != null) {
            arrayList.add("lastAccessedAt=" + this.f94268f7l8);
        }
        if (!this.f43714y.isEmpty()) {
            arrayList.add("extras=" + this.f43714y);
        }
        return kotlin.collections.a9.uo(arrayList, ", ", "FileMetadata(", ")", 0, null, null, 56, null);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: y */
    public final Long m27621y() {
        return this.f43713q;
    }

    @InterfaceC7395n
    public final <T> T zy(@InterfaceC7396q InterfaceC6374q<? extends T> type) {
        kotlin.jvm.internal.d2ok.m23075h(type, "type");
        Object obj = this.f43714y.get(type);
        if (obj == null) {
            return null;
        }
        return (T) C6371n.m23391k(type, obj);
    }

    public /* synthetic */ fn3e(boolean z2, boolean z3, ncyb ncybVar, Long l2, Long l3, Long l4, Long l5, Map map, int i2, kotlin.jvm.internal.ni7 ni7Var) {
        this((i2 & 1) != 0 ? false : z2, (i2 & 2) == 0 ? z3 : false, (i2 & 4) != 0 ? null : ncybVar, (i2 & 8) != 0 ? null : l2, (i2 & 16) != 0 ? null : l3, (i2 & 32) != 0 ? null : l4, (i2 & 64) == 0 ? l5 : null, (i2 & 128) != 0 ? kotlin.collections.nn86.o1t() : map);
    }
}

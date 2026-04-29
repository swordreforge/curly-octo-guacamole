package okio.internal;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.ni7;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import okio.ncyb;

/* JADX INFO: compiled from: ZipEntry.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ld6 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final int f94275f7l8;

    /* JADX INFO: renamed from: g */
    private final long f43744g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final ncyb f43745k;

    /* JADX INFO: renamed from: n */
    private final long f43746n;

    /* JADX INFO: renamed from: p */
    @InterfaceC7396q
    private final List<ncyb> f43747p;

    /* JADX INFO: renamed from: q */
    private final long f43748q;

    /* JADX INFO: renamed from: s */
    private final long f43749s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f94276toq;

    /* JADX INFO: renamed from: y */
    @InterfaceC7395n
    private final Long f43750y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final String f94277zy;

    public ld6(@InterfaceC7396q ncyb canonicalPath, boolean z2, @InterfaceC7396q String comment, long j2, long j3, long j4, int i2, @InterfaceC7395n Long l2, long j5) {
        d2ok.m23075h(canonicalPath, "canonicalPath");
        d2ok.m23075h(comment, "comment");
        this.f43745k = canonicalPath;
        this.f94276toq = z2;
        this.f94277zy = comment;
        this.f43748q = j2;
        this.f43746n = j3;
        this.f43744g = j4;
        this.f94275f7l8 = i2;
        this.f43750y = l2;
        this.f43749s = j5;
        this.f43747p = new ArrayList();
    }

    @InterfaceC7395n
    public final Long f7l8() {
        return this.f43750y;
    }

    /* JADX INFO: renamed from: g */
    public final long m27694g() {
        return this.f43748q;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final ncyb m27695k() {
        return this.f43745k;
    }

    /* JADX INFO: renamed from: n */
    public final int m27696n() {
        return this.f94275f7l8;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m27697p() {
        return this.f94276toq;
    }

    /* JADX INFO: renamed from: q */
    public final long m27698q() {
        return this.f43746n;
    }

    /* JADX INFO: renamed from: s */
    public final long m27699s() {
        return this.f43744g;
    }

    @InterfaceC7396q
    public final List<ncyb> toq() {
        return this.f43747p;
    }

    /* JADX INFO: renamed from: y */
    public final long m27700y() {
        return this.f43749s;
    }

    @InterfaceC7396q
    public final String zy() {
        return this.f94277zy;
    }

    public /* synthetic */ ld6(ncyb ncybVar, boolean z2, String str, long j2, long j3, long j4, int i2, Long l2, long j5, int i3, ni7 ni7Var) {
        this(ncybVar, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? -1L : j2, (i3 & 16) != 0 ? -1L : j3, (i3 & 32) != 0 ? -1L : j4, (i3 & 64) != 0 ? -1 : i2, (i3 & 128) != 0 ? null : l2, (i3 & 256) == 0 ? j5 : -1L);
    }
}

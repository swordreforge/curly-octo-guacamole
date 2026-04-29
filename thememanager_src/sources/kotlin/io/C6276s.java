package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.collections.a9;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.io.s */
/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6276s {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final File f36365k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private final List<File> f81829toq;

    /* JADX WARN: Multi-variable type inference failed */
    public C6276s(@InterfaceC7396q File root, @InterfaceC7396q List<? extends File> segments) {
        d2ok.m23075h(root, "root");
        d2ok.m23075h(segments, "segments");
        this.f36365k = root;
        this.f81829toq = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C6276s m23004q(C6276s c6276s, File file, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            file = c6276s.f36365k;
        }
        if ((i2 & 2) != 0) {
            list = c6276s.f81829toq;
        }
        return c6276s.zy(file, list);
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6276s)) {
            return false;
        }
        C6276s c6276s = (C6276s) obj;
        return d2ok.f7l8(this.f36365k, c6276s.f36365k) && d2ok.f7l8(this.f81829toq, c6276s.f81829toq);
    }

    @InterfaceC7396q
    public final List<File> f7l8() {
        return this.f81829toq;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public final String m23005g() {
        String path = this.f36365k.getPath();
        d2ok.kja0(path, "root.path");
        return path;
    }

    public int hashCode() {
        return (this.f36365k.hashCode() * 31) + this.f81829toq.hashCode();
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public final File m23006k() {
        return this.f36365k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public final File m23007n() {
        return this.f36365k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public final File m23008p(int i2, int i3) {
        if (i2 < 0 || i2 > i3 || i3 > m23010y()) {
            throw new IllegalArgumentException();
        }
        List<File> listSubList = this.f81829toq.subList(i2, i3);
        String separator = File.separator;
        d2ok.kja0(separator, "separator");
        return new File(a9.uo(listSubList, separator, null, null, 0, null, null, 62, null));
    }

    /* JADX INFO: renamed from: s */
    public final boolean m23009s() {
        String path = this.f36365k.getPath();
        d2ok.kja0(path, "root.path");
        return path.length() > 0;
    }

    @InterfaceC7396q
    public String toString() {
        return "FilePathComponents(root=" + this.f36365k + ", segments=" + this.f81829toq + ')';
    }

    @InterfaceC7396q
    public final List<File> toq() {
        return this.f81829toq;
    }

    /* JADX INFO: renamed from: y */
    public final int m23010y() {
        return this.f81829toq.size();
    }

    @InterfaceC7396q
    public final C6276s zy(@InterfaceC7396q File root, @InterfaceC7396q List<? extends File> segments) {
        d2ok.m23075h(root, "root");
        d2ok.m23075h(segments, "segments");
        return new C6276s(root, segments);
    }
}

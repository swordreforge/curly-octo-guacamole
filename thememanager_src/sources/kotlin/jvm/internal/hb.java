package kotlin.jvm.internal;

import java.util.Collection;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PackageReference.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.yz(version = "1.1")
public final class hb implements InterfaceC6293i {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Class<?> f36412k;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private final String f36413q;

    public hb(@InterfaceC7396q Class<?> jClass, @InterfaceC7396q String moduleName) {
        d2ok.m23075h(jClass, "jClass");
        d2ok.m23075h(moduleName, "moduleName");
        this.f36412k = jClass;
        this.f36413q = moduleName;
    }

    @Override // kotlin.jvm.internal.InterfaceC6293i
    @InterfaceC7396q
    public Class<?> cdj() {
        return this.f36412k;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        return (obj instanceof hb) && d2ok.f7l8(cdj(), ((hb) obj).cdj());
    }

    public int hashCode() {
        return cdj().hashCode();
    }

    @Override // kotlin.reflect.InterfaceC6380y
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public Collection<kotlin.reflect.zy<?>> mo23098k() {
        throw new l05.cdj();
    }

    @InterfaceC7396q
    public String toString() {
        return cdj().toString() + " (Kotlin reflection is not available)";
    }
}

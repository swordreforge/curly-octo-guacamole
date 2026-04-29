package kotlin.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.reflect.k */
/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.ki
final class C6366k implements GenericArrayType, InterfaceC6381z {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Type f36572k;

    public C6366k(@InterfaceC7396q Type elementType) {
        d2ok.m23075h(elementType, "elementType");
        this.f36572k = elementType;
    }

    public boolean equals(@InterfaceC7395n Object obj) {
        return (obj instanceof GenericArrayType) && d2ok.f7l8(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
    }

    @Override // java.lang.reflect.GenericArrayType
    @InterfaceC7396q
    public Type getGenericComponentType() {
        return this.f36572k;
    }

    @Override // java.lang.reflect.Type, kotlin.reflect.InterfaceC6381z
    @InterfaceC7396q
    public String getTypeName() {
        return C6377t.m23407p(this.f36572k) + okhttp3.zurt.f43629h;
    }

    public int hashCode() {
        return getGenericComponentType().hashCode();
    }

    @InterfaceC7396q
    public String toString() {
        return getTypeName();
    }
}

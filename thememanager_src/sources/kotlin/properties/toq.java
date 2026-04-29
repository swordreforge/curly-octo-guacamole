package kotlin.properties;

import kotlin.jvm.internal.d2ok;
import kotlin.reflect.kja0;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: Delegates.kt */
/* JADX INFO: loaded from: classes3.dex */
final class toq<T> implements InterfaceC6325g<Object, T> {

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private T f36483k;

    @Override // kotlin.properties.InterfaceC6325g, kotlin.properties.InterfaceC6327n
    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public T mo23237k(@InterfaceC7395n Object obj, @InterfaceC7396q kja0<?> property) {
        d2ok.m23075h(property, "property");
        T t2 = this.f36483k;
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException("Property " + property.getName() + " should be initialized before get.");
    }

    @InterfaceC7396q
    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append("NotNullProperty(");
        if (this.f36483k != null) {
            str = "value=" + this.f36483k;
        } else {
            str = "value not initialized yet";
        }
        sb.append(str);
        sb.append(')');
        return sb.toString();
    }

    @Override // kotlin.properties.InterfaceC6325g
    public void toq(@InterfaceC7395n Object obj, @InterfaceC7396q kja0<?> property, @InterfaceC7396q T value) {
        d2ok.m23075h(property, "property");
        d2ok.m23075h(value, "value");
        this.f36483k = value;
    }
}

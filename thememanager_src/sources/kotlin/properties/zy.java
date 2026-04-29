package kotlin.properties;

import kotlin.jvm.internal.d2ok;
import kotlin.reflect.kja0;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ObservableProperty.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zy<V> implements InterfaceC6325g<Object, V> {

    /* JADX INFO: renamed from: k */
    private V f36484k;

    public zy(V v2) {
        this.f36484k = v2;
    }

    @Override // kotlin.properties.InterfaceC6325g, kotlin.properties.InterfaceC6327n
    /* JADX INFO: renamed from: k */
    public V mo23237k(@InterfaceC7395n Object obj, @InterfaceC7396q kja0<?> property) {
        d2ok.m23075h(property, "property");
        return this.f36484k;
    }

    /* JADX INFO: renamed from: q */
    protected boolean mo23239q(@InterfaceC7396q kja0<?> property, V v2, V v3) {
        d2ok.m23075h(property, "property");
        return true;
    }

    @InterfaceC7396q
    public String toString() {
        return "ObservableProperty(value=" + this.f36484k + ')';
    }

    @Override // kotlin.properties.InterfaceC6325g
    public void toq(@InterfaceC7395n Object obj, @InterfaceC7396q kja0<?> property, V v2) {
        d2ok.m23075h(property, "property");
        V v3 = this.f36484k;
        if (mo23239q(property, v3, v2)) {
            this.f36484k = v2;
            zy(property, v3, v2);
        }
    }

    protected void zy(@InterfaceC7396q kja0<?> property, V v2, V v3) {
        d2ok.m23075h(property, "property");
    }
}

package androidx.core.os;

import android.os.PersistableBundle;
import kotlin.C6227f;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import kotlin.text.eqxt;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: renamed from: androidx.core.os.i */
/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a?\u0010\u0006\u001a\u00020\u00052.\u0010\u0004\u001a\u0018\u0012\u0014\b\u0001\u0012\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0000\"\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"", "Lkotlin/f;", "", "", "pairs", "Landroid/os/PersistableBundle;", "k", "([Lkotlin/f;)Landroid/os/PersistableBundle;", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0581i {
    @InterfaceC7396q
    @hyr(21)
    /* JADX INFO: renamed from: k */
    public static final PersistableBundle m2724k(@InterfaceC7396q C6227f<String, ? extends Object>... pairs) {
        d2ok.cdj(pairs, "pairs");
        PersistableBundle persistableBundle = new PersistableBundle(pairs.length);
        for (C6227f<String, ? extends Object> c6227f : pairs) {
            String strComponent1 = c6227f.component1();
            Object objComponent2 = c6227f.component2();
            if (objComponent2 == null) {
                persistableBundle.putString(strComponent1, null);
            } else if (objComponent2 instanceof Boolean) {
                persistableBundle.putBoolean(strComponent1, ((Boolean) objComponent2).booleanValue());
            } else if (objComponent2 instanceof Double) {
                persistableBundle.putDouble(strComponent1, ((Number) objComponent2).doubleValue());
            } else if (objComponent2 instanceof Integer) {
                persistableBundle.putInt(strComponent1, ((Number) objComponent2).intValue());
            } else if (objComponent2 instanceof Long) {
                persistableBundle.putLong(strComponent1, ((Number) objComponent2).longValue());
            } else if (objComponent2 instanceof String) {
                persistableBundle.putString(strComponent1, (String) objComponent2);
            } else if (objComponent2 instanceof boolean[]) {
                persistableBundle.putBooleanArray(strComponent1, (boolean[]) objComponent2);
            } else if (objComponent2 instanceof double[]) {
                persistableBundle.putDoubleArray(strComponent1, (double[]) objComponent2);
            } else if (objComponent2 instanceof int[]) {
                persistableBundle.putIntArray(strComponent1, (int[]) objComponent2);
            } else if (objComponent2 instanceof long[]) {
                persistableBundle.putLongArray(strComponent1, (long[]) objComponent2);
            } else {
                if (!(objComponent2 instanceof Object[])) {
                    throw new IllegalArgumentException("Illegal value type " + objComponent2.getClass().getCanonicalName() + " for key \"" + strComponent1 + eqxt.f81913toq);
                }
                Class<?> componentType = objComponent2.getClass().getComponentType();
                if (componentType == null) {
                    d2ok.d2ok();
                }
                d2ok.m23085y(componentType, "value::class.java.componentType!!");
                if (!String.class.isAssignableFrom(componentType)) {
                    throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + strComponent1 + eqxt.f81913toq);
                }
                persistableBundle.putStringArray(strComponent1, (String[]) objComponent2);
            }
        }
        return persistableBundle;
    }
}

package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Field;
import java.util.ArrayList;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.yz;
import l05.InterfaceC6769y;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: DebugMetadata.kt */
/* JADX INFO: loaded from: classes3.dex */
@lv5({"SMAP\nDebugMetadata.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,134:1\n37#2,2:135\n*S KotlinDebug\n*F\n+ 1 DebugMetadata.kt\nkotlin/coroutines/jvm/internal/DebugMetadataKt\n*L\n131#1:135,2\n*E\n"})
public final class f7l8 {

    /* JADX INFO: renamed from: k */
    private static final int f36253k = 1;

    /* JADX INFO: renamed from: k */
    private static final void m22752k(int i2, int i3) {
        if (i3 <= i2) {
            return;
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: " + i2 + ", got " + i3 + ". Please update the Kotlin standard library.").toString());
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6769y(name = "getStackTraceElement")
    /* JADX INFO: renamed from: n */
    public static final StackTraceElement m22753n(@InterfaceC7396q AbstractC6206k abstractC6206k) {
        String strM22755c;
        d2ok.m23075h(abstractC6206k, "<this>");
        InterfaceC6205g qVar = toq(abstractC6206k);
        if (qVar == null) {
            return null;
        }
        m22752k(1, qVar.m22762v());
        int iZy = zy(abstractC6206k);
        int i2 = iZy < 0 ? -1 : qVar.m22758l()[iZy];
        String qVar2 = C6210s.f36254k.toq(abstractC6206k);
        if (qVar2 == null) {
            strM22755c = qVar.m22755c();
        } else {
            strM22755c = qVar2 + '/' + qVar.m22755c();
        }
        return new StackTraceElement(strM22755c, qVar.m22759m(), qVar.m22756f(), i2);
    }

    @InterfaceC7395n
    @yz(version = "1.3")
    @InterfaceC6769y(name = "getSpilledVariableFieldMapping")
    /* JADX INFO: renamed from: q */
    public static final String[] m22754q(@InterfaceC7396q AbstractC6206k abstractC6206k) {
        d2ok.m23075h(abstractC6206k, "<this>");
        InterfaceC6205g qVar = toq(abstractC6206k);
        if (qVar == null) {
            return null;
        }
        m22752k(1, qVar.m22762v());
        ArrayList arrayList = new ArrayList();
        int iZy = zy(abstractC6206k);
        int[] iArrM22757i = qVar.m22757i();
        int length = iArrM22757i.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (iArrM22757i[i2] == iZy) {
                arrayList.add(qVar.m22761s()[i2]);
                arrayList.add(qVar.m22760n()[i2]);
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    private static final InterfaceC6205g toq(AbstractC6206k abstractC6206k) {
        return (InterfaceC6205g) abstractC6206k.getClass().getAnnotation(InterfaceC6205g.class);
    }

    private static final int zy(AbstractC6206k abstractC6206k) {
        try {
            Field declaredField = abstractC6206k.getClass().getDeclaredField("label");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(abstractC6206k);
            Integer num = obj instanceof Integer ? (Integer) obj : null;
            return (num != null ? num.intValue() : 0) - 1;
        } catch (Exception unused) {
            return -1;
        }
    }
}

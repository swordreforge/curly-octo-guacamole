package kt06;

import android.content.Context;
import java.util.concurrent.ConcurrentHashMap;
import kt06.toq;
import zy.dd;

/* JADX INFO: compiled from: ResponsiveStateManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static ConcurrentHashMap<Integer, toq> f37536k = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile zy f82120toq;

    /* JADX INFO: renamed from: k */
    public static zy m24693k() {
        if (f82120toq == null) {
            synchronized (zy.class) {
                if (f82120toq == null) {
                    f82120toq = new zy();
                }
            }
        }
        return f82120toq;
    }

    /* JADX INFO: renamed from: n */
    public void m24694n(Context context) {
        f37536k.remove(Integer.valueOf(context.hashCode()));
    }

    @dd
    /* JADX INFO: renamed from: q */
    public toq m24695q(Context context, toq.C6755k c6755k) {
        if (context == null) {
            return null;
        }
        int iHashCode = context.hashCode();
        toq toqVar = f37536k.get(Integer.valueOf(iHashCode));
        if (toqVar == null) {
            toqVar = new toq();
            f37536k.put(Integer.valueOf(iHashCode), toqVar);
        }
        toqVar.t8r(c6755k);
        return toqVar;
    }

    @dd
    public toq toq(Context context) {
        if (context == null) {
            return null;
        }
        int iHashCode = context.hashCode();
        toq toqVar = f37536k.get(Integer.valueOf(iHashCode));
        if (toqVar != null) {
            return toqVar;
        }
        toq toqVar2 = new toq();
        f37536k.put(Integer.valueOf(iHashCode), toqVar2);
        return toqVar2;
    }

    @Deprecated
    public int zy(Context context) {
        if (context == null) {
            return toq.f82110t8r;
        }
        int iHashCode = context.hashCode();
        toq toqVar = f37536k.get(Integer.valueOf(iHashCode));
        if (toqVar == null) {
            toqVar = new toq();
            f37536k.put(Integer.valueOf(iHashCode), toqVar);
        }
        return toqVar.m24690q();
    }
}

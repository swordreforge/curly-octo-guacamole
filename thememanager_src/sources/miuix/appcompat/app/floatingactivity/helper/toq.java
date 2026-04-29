package miuix.appcompat.app.floatingactivity.helper;

import miuix.appcompat.app.t8r;
import miuix.core.util.C7103y;
import zy.lvui;

/* JADX INFO: compiled from: FloatingHelperFactory.java */
/* JADX INFO: loaded from: classes3.dex */
public class toq {

    /* JADX INFO: renamed from: k */
    public static final int f38836k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f86847toq = 1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f86848zy = 2;

    @lvui
    /* JADX INFO: renamed from: k */
    public static AbstractC6920k m24920k(@lvui t8r t8rVar) {
        int qVar = toq(t8rVar);
        return qVar != 1 ? qVar != 2 ? new C6921n(t8rVar) : new zy(t8rVar) : new C6923q(t8rVar);
    }

    public static int toq(@lvui t8r t8rVar) {
        boolean qVar = C7103y.toq(t8rVar.getIntent());
        if (qVar || !miuix.os.toq.f87881zy) {
            return (qVar || !miuix.os.toq.f87880toq) ? 0 : 1;
        }
        return 2;
    }
}

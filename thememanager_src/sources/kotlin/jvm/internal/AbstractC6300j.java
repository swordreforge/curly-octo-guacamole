package kotlin.jvm.internal;

import mub.InterfaceC7396q;

/* JADX INFO: renamed from: kotlin.jvm.internal.j */
/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6300j<T> {

    /* JADX INFO: renamed from: k */
    private final int f36414k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f81837toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private final T[] f81838zy;

    public AbstractC6300j(int i2) {
        this.f36414k = i2;
        this.f81838zy = (T[]) new Object[i2];
    }

    /* JADX INFO: renamed from: q */
    private static /* synthetic */ void m23114q() {
    }

    @InterfaceC7396q
    protected final T f7l8(@InterfaceC7396q T values, @InterfaceC7396q T result) {
        d2ok.m23075h(values, "values");
        d2ok.m23075h(result, "result");
        kotlin.collections.n5r1 n5r1VarM23351p = new kotlin.ranges.x2(0, this.f36414k - 1).iterator();
        int i2 = 0;
        int i3 = 0;
        while (n5r1VarM23351p.hasNext()) {
            int iNextInt = n5r1VarM23351p.nextInt();
            T t2 = this.f81838zy[iNextInt];
            if (t2 != null) {
                if (i2 < iNextInt) {
                    int i4 = iNextInt - i2;
                    System.arraycopy(values, i2, result, i3, i4);
                    i3 += i4;
                }
                int iZy = zy(t2);
                System.arraycopy(t2, 0, result, i3, iZy);
                i3 += iZy;
                i2 = iNextInt + 1;
            }
        }
        int i5 = this.f36414k;
        if (i2 < i5) {
            System.arraycopy(values, i2, result, i3, i5 - i2);
        }
        return result;
    }

    /* JADX INFO: renamed from: g */
    protected final int m23115g() {
        int iZy = 0;
        kotlin.collections.n5r1 n5r1VarM23351p = new kotlin.ranges.x2(0, this.f36414k - 1).iterator();
        while (n5r1VarM23351p.hasNext()) {
            T t2 = this.f81838zy[n5r1VarM23351p.nextInt()];
            iZy += t2 != null ? zy(t2) : 1;
        }
        return iZy;
    }

    /* JADX INFO: renamed from: k */
    public final void m23116k(@InterfaceC7396q T spreadArgument) {
        d2ok.m23075h(spreadArgument, "spreadArgument");
        T[] tArr = this.f81838zy;
        int i2 = this.f81837toq;
        this.f81837toq = i2 + 1;
        tArr[i2] = spreadArgument;
    }

    /* JADX INFO: renamed from: n */
    protected final void m23117n(int i2) {
        this.f81837toq = i2;
    }

    protected final int toq() {
        return this.f81837toq;
    }

    protected abstract int zy(@InterfaceC7396q T t2);
}

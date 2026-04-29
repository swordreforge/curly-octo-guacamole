package androidx.sqlite.db;

import zy.dd;

/* JADX INFO: compiled from: SimpleSQLiteQuery.java */
/* JADX INFO: loaded from: classes.dex */
public final class toq implements InterfaceC1172g {

    /* JADX INFO: renamed from: k */
    private final String f6358k;

    /* JADX INFO: renamed from: q */
    @dd
    private final Object[] f6359q;

    public toq(String str, @dd Object[] objArr) {
        this.f6358k = str;
        this.f6359q = objArr;
    }

    /* JADX INFO: renamed from: n */
    public static void m5284n(InterfaceC1174n interfaceC1174n, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i2 = 0;
        while (i2 < length) {
            Object obj = objArr[i2];
            i2++;
            toq(interfaceC1174n, i2, obj);
        }
    }

    private static void toq(InterfaceC1174n interfaceC1174n, int i2, Object obj) {
        if (obj == null) {
            interfaceC1174n.b3e(i2);
            return;
        }
        if (obj instanceof byte[]) {
            interfaceC1174n.w831(i2, (byte[]) obj);
            return;
        }
        if (obj instanceof Float) {
            interfaceC1174n.mcp(i2, ((Float) obj).floatValue());
            return;
        }
        if (obj instanceof Double) {
            interfaceC1174n.mcp(i2, ((Double) obj).doubleValue());
            return;
        }
        if (obj instanceof Long) {
            interfaceC1174n.v0af(i2, ((Long) obj).longValue());
            return;
        }
        if (obj instanceof Integer) {
            interfaceC1174n.v0af(i2, ((Integer) obj).intValue());
            return;
        }
        if (obj instanceof Short) {
            interfaceC1174n.v0af(i2, ((Short) obj).shortValue());
            return;
        }
        if (obj instanceof Byte) {
            interfaceC1174n.v0af(i2, ((Byte) obj).byteValue());
            return;
        }
        if (obj instanceof String) {
            interfaceC1174n.tfm(i2, (String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            interfaceC1174n.v0af(i2, ((Boolean) obj).booleanValue() ? 1L : 0L);
            return;
        }
        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i2 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
    }

    @Override // androidx.sqlite.db.InterfaceC1172g
    /* JADX INFO: renamed from: k */
    public int mo5145k() {
        Object[] objArr = this.f6359q;
        if (objArr == null) {
            return 0;
        }
        return objArr.length;
    }

    @Override // androidx.sqlite.db.InterfaceC1172g
    /* JADX INFO: renamed from: q */
    public void mo5147q(InterfaceC1174n interfaceC1174n) {
        m5284n(interfaceC1174n, this.f6359q);
    }

    @Override // androidx.sqlite.db.InterfaceC1172g
    public String zy() {
        return this.f6358k;
    }

    public toq(String str) {
        this(str, null);
    }
}

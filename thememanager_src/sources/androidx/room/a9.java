package androidx.room;

import androidx.sqlite.db.InterfaceC1172g;
import androidx.sqlite.db.InterfaceC1174n;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import zy.uv6;
import zy.yz;

/* JADX INFO: compiled from: RoomSQLiteQuery.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class a9 implements InterfaceC1172g, InterfaceC1174n {

    /* JADX INFO: renamed from: c */
    private static final int f6147c = 4;

    /* JADX INFO: renamed from: e */
    private static final int f6148e = 5;

    /* JADX INFO: renamed from: f */
    private static final int f6149f = 3;

    /* JADX INFO: renamed from: i */
    @yz
    static final int f6150i = 15;

    /* JADX INFO: renamed from: l */
    private static final int f6151l = 2;

    /* JADX INFO: renamed from: r */
    private static final int f6152r = 1;

    /* JADX INFO: renamed from: t */
    @yz
    static final TreeMap<Integer, a9> f6153t = new TreeMap<>();

    /* JADX INFO: renamed from: z */
    @yz
    static final int f6154z = 10;

    /* JADX INFO: renamed from: g */
    @yz
    final String[] f6155g;

    /* JADX INFO: renamed from: h */
    @yz
    int f6156h;

    /* JADX INFO: renamed from: k */
    private volatile String f6157k;

    /* JADX INFO: renamed from: n */
    @yz
    final double[] f6158n;

    /* JADX INFO: renamed from: p */
    @yz
    final int f6159p;

    /* JADX INFO: renamed from: q */
    @yz
    final long[] f6160q;

    /* JADX INFO: renamed from: s */
    private final int[] f6161s;

    /* JADX INFO: renamed from: y */
    @yz
    final byte[][] f6162y;

    /* JADX INFO: renamed from: androidx.room.a9$k */
    /* JADX INFO: compiled from: RoomSQLiteQuery.java */
    static class C1125k implements InterfaceC1174n {
        C1125k() {
        }

        @Override // androidx.sqlite.db.InterfaceC1174n
        public void b3e(int i2) {
            a9.this.b3e(i2);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // androidx.sqlite.db.InterfaceC1174n
        public void mcp(int i2, double d2) {
            a9.this.mcp(i2, d2);
        }

        @Override // androidx.sqlite.db.InterfaceC1174n
        public void pc() {
            a9.this.pc();
        }

        @Override // androidx.sqlite.db.InterfaceC1174n
        public void tfm(int i2, String str) {
            a9.this.tfm(i2, str);
        }

        @Override // androidx.sqlite.db.InterfaceC1174n
        public void v0af(int i2, long j2) {
            a9.this.v0af(i2, j2);
        }

        @Override // androidx.sqlite.db.InterfaceC1174n
        public void w831(int i2, byte[] bArr) {
            a9.this.w831(i2, bArr);
        }
    }

    private a9(int i2) {
        this.f6159p = i2;
        int i3 = i2 + 1;
        this.f6161s = new int[i3];
        this.f6160q = new long[i3];
        this.f6158n = new double[i3];
        this.f6155g = new String[i3];
        this.f6162y = new byte[i3][];
    }

    /* JADX INFO: renamed from: h */
    private static void m5143h() {
        TreeMap<Integer, a9> treeMap = f6153t;
        if (treeMap.size() <= 15) {
            return;
        }
        int size = treeMap.size() - 10;
        Iterator<Integer> it = treeMap.descendingKeySet().iterator();
        while (true) {
            int i2 = size - 1;
            if (size <= 0) {
                return;
            }
            it.next();
            it.remove();
            size = i2;
        }
    }

    public static a9 ld6(InterfaceC1172g interfaceC1172g) {
        a9 a9VarM5144y = m5144y(interfaceC1172g.zy(), interfaceC1172g.mo5145k());
        interfaceC1172g.mo5147q(a9VarM5144y.new C1125k());
        return a9VarM5144y;
    }

    /* JADX INFO: renamed from: y */
    public static a9 m5144y(String str, int i2) {
        TreeMap<Integer, a9> treeMap = f6153t;
        synchronized (treeMap) {
            Map.Entry<Integer, a9> entryCeilingEntry = treeMap.ceilingEntry(Integer.valueOf(i2));
            if (entryCeilingEntry == null) {
                a9 a9Var = new a9(i2);
                a9Var.x2(str, i2);
                return a9Var;
            }
            treeMap.remove(entryCeilingEntry.getKey());
            a9 value = entryCeilingEntry.getValue();
            value.x2(str, i2);
            return value;
        }
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void b3e(int i2) {
        this.f6161s[i2] = 1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // androidx.sqlite.db.InterfaceC1172g
    /* JADX INFO: renamed from: k */
    public int mo5145k() {
        return this.f6156h;
    }

    public void ki() {
        TreeMap<Integer, a9> treeMap = f6153t;
        synchronized (treeMap) {
            treeMap.put(Integer.valueOf(this.f6159p), this);
            m5143h();
        }
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void mcp(int i2, double d2) {
        this.f6161s[i2] = 3;
        this.f6158n[i2] = d2;
    }

    /* JADX INFO: renamed from: p */
    public void m5146p(a9 a9Var) {
        int iMo5145k = a9Var.mo5145k() + 1;
        System.arraycopy(a9Var.f6161s, 0, this.f6161s, 0, iMo5145k);
        System.arraycopy(a9Var.f6160q, 0, this.f6160q, 0, iMo5145k);
        System.arraycopy(a9Var.f6155g, 0, this.f6155g, 0, iMo5145k);
        System.arraycopy(a9Var.f6162y, 0, this.f6162y, 0, iMo5145k);
        System.arraycopy(a9Var.f6158n, 0, this.f6158n, 0, iMo5145k);
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void pc() {
        Arrays.fill(this.f6161s, 1);
        Arrays.fill(this.f6155g, (Object) null);
        Arrays.fill(this.f6162y, (Object) null);
        this.f6157k = null;
    }

    @Override // androidx.sqlite.db.InterfaceC1172g
    /* JADX INFO: renamed from: q */
    public void mo5147q(InterfaceC1174n interfaceC1174n) {
        for (int i2 = 1; i2 <= this.f6156h; i2++) {
            int i3 = this.f6161s[i2];
            if (i3 == 1) {
                interfaceC1174n.b3e(i2);
            } else if (i3 == 2) {
                interfaceC1174n.v0af(i2, this.f6160q[i2]);
            } else if (i3 == 3) {
                interfaceC1174n.mcp(i2, this.f6158n[i2]);
            } else if (i3 == 4) {
                interfaceC1174n.tfm(i2, this.f6155g[i2]);
            } else if (i3 == 5) {
                interfaceC1174n.w831(i2, this.f6162y[i2]);
            }
        }
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void tfm(int i2, String str) {
        this.f6161s[i2] = 4;
        this.f6155g[i2] = str;
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void v0af(int i2, long j2) {
        this.f6161s[i2] = 2;
        this.f6160q[i2] = j2;
    }

    @Override // androidx.sqlite.db.InterfaceC1174n
    public void w831(int i2, byte[] bArr) {
        this.f6161s[i2] = 5;
        this.f6162y[i2] = bArr;
    }

    void x2(String str, int i2) {
        this.f6157k = str;
        this.f6156h = i2;
    }

    @Override // androidx.sqlite.db.InterfaceC1172g
    public String zy() {
        return this.f6157k;
    }
}

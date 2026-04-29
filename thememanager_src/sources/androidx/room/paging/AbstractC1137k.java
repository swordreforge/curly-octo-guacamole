package androidx.room.paging;

import android.database.Cursor;
import androidx.paging.PositionalDataSource;
import androidx.room.AbstractC1141t;
import androidx.room.a9;
import androidx.room.t8r;
import androidx.sqlite.db.InterfaceC1172g;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: androidx.room.paging.k */
/* JADX INFO: compiled from: LimitOffsetDataSource.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public abstract class AbstractC1137k<T> extends PositionalDataSource<T> {

    /* JADX INFO: renamed from: g */
    private final boolean f6209g;

    /* JADX INFO: renamed from: k */
    private final a9 f6210k;

    /* JADX INFO: renamed from: n */
    private final t8r.zy f6211n;

    /* JADX INFO: renamed from: q */
    private final AbstractC1141t f6212q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final String f52382toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final String f52383zy;

    /* JADX INFO: renamed from: androidx.room.paging.k$k */
    /* JADX INFO: compiled from: LimitOffsetDataSource.java */
    class k extends t8r.zy {
        k(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.t8r.zy
        public void toq(@lvui Set<String> set) {
            AbstractC1137k.this.invalidate();
        }
    }

    protected AbstractC1137k(AbstractC1141t abstractC1141t, InterfaceC1172g interfaceC1172g, boolean z2, String... strArr) {
        this(abstractC1141t, a9.ld6(interfaceC1172g), z2, strArr);
    }

    private a9 zy(int i2, int i3) {
        a9 a9VarM5144y = a9.m5144y(this.f52383zy, this.f6210k.mo5145k() + 2);
        a9VarM5144y.m5146p(this.f6210k);
        a9VarM5144y.v0af(a9VarM5144y.mo5145k() - 1, i3);
        a9VarM5144y.v0af(a9VarM5144y.mo5145k(), i2);
        return a9VarM5144y;
    }

    public void f7l8(@lvui PositionalDataSource.LoadRangeParams loadRangeParams, @lvui PositionalDataSource.LoadRangeCallback<T> loadRangeCallback) {
        loadRangeCallback.onResult(m5174g(loadRangeParams.startPosition, loadRangeParams.loadSize));
    }

    @lvui
    /* JADX INFO: renamed from: g */
    public List<T> m5174g(int i2, int i3) {
        a9 a9VarZy = zy(i2, i3);
        if (!this.f6209g) {
            Cursor cursorZurt = this.f6212q.zurt(a9VarZy);
            try {
                return m5175k(cursorZurt);
            } finally {
                cursorZurt.close();
                a9VarZy.ki();
            }
        }
        this.f6212q.zy();
        Cursor cursorZurt2 = null;
        try {
            cursorZurt2 = this.f6212q.zurt(a9VarZy);
            List<T> listM5175k = m5175k(cursorZurt2);
            this.f6212q.o1t();
            return listM5175k;
        } finally {
            if (cursorZurt2 != null) {
                cursorZurt2.close();
            }
            this.f6212q.m5189s();
            a9VarZy.ki();
        }
    }

    /* JADX INFO: renamed from: k */
    protected abstract List<T> m5175k(Cursor cursor);

    /* JADX INFO: renamed from: n */
    public void m5176n(@lvui PositionalDataSource.LoadInitialParams loadInitialParams, @lvui PositionalDataSource.LoadInitialCallback<T> loadInitialCallback) throws Throwable {
        a9 a9VarZy;
        int i2;
        a9 a9Var;
        List<T> listEmptyList = Collections.emptyList();
        this.f6212q.zy();
        Cursor cursorZurt = null;
        try {
            int qVar = toq();
            if (qVar != 0) {
                int iComputeInitialLoadPosition = computeInitialLoadPosition(loadInitialParams, qVar);
                a9VarZy = zy(iComputeInitialLoadPosition, computeInitialLoadSize(loadInitialParams, iComputeInitialLoadPosition, qVar));
                try {
                    cursorZurt = this.f6212q.zurt(a9VarZy);
                    List<T> listM5175k = m5175k(cursorZurt);
                    this.f6212q.o1t();
                    a9Var = a9VarZy;
                    i2 = iComputeInitialLoadPosition;
                    listEmptyList = listM5175k;
                } catch (Throwable th) {
                    th = th;
                    if (cursorZurt != null) {
                        cursorZurt.close();
                    }
                    this.f6212q.m5189s();
                    if (a9VarZy != null) {
                        a9VarZy.ki();
                    }
                    throw th;
                }
            } else {
                i2 = 0;
                a9Var = null;
            }
            if (cursorZurt != null) {
                cursorZurt.close();
            }
            this.f6212q.m5189s();
            if (a9Var != null) {
                a9Var.ki();
            }
            loadInitialCallback.onResult(listEmptyList, i2, qVar);
        } catch (Throwable th2) {
            th = th2;
            a9VarZy = null;
        }
    }

    /* JADX INFO: renamed from: q */
    public boolean m5177q() {
        this.f6212q.x2().m5206p();
        return super.isInvalid();
    }

    public int toq() {
        a9 a9VarM5144y = a9.m5144y(this.f52382toq, this.f6210k.mo5145k());
        a9VarM5144y.m5146p(this.f6210k);
        Cursor cursorZurt = this.f6212q.zurt(a9VarM5144y);
        try {
            if (cursorZurt.moveToFirst()) {
                return cursorZurt.getInt(0);
            }
            return 0;
        } finally {
            cursorZurt.close();
            a9VarM5144y.ki();
        }
    }

    protected AbstractC1137k(AbstractC1141t abstractC1141t, a9 a9Var, boolean z2, String... strArr) {
        this.f6212q = abstractC1141t;
        this.f6210k = a9Var;
        this.f6209g = z2;
        this.f52382toq = "SELECT COUNT(*) FROM ( " + a9Var.zy() + " )";
        this.f52383zy = "SELECT * FROM ( " + a9Var.zy() + " ) LIMIT ? OFFSET ?";
        k kVar = new k(strArr);
        this.f6211n = kVar;
        abstractC1141t.x2().toq(kVar);
    }
}

package androidx.room;

import android.content.Context;
import androidx.room.AbstractC1141t;
import androidx.sqlite.db.InterfaceC1175q;
import java.io.File;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;
import zy.uv6;

/* JADX INFO: renamed from: androidx.room.q */
/* JADX INFO: compiled from: DatabaseConfiguration.java */
/* JADX INFO: loaded from: classes.dex */
public class C1138q {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final AbstractC1141t.zy f52385f7l8;

    /* JADX INFO: renamed from: g */
    public final boolean f6213g;

    /* JADX INFO: renamed from: k */
    @zy.lvui
    public final InterfaceC1175q.zy f6214k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    @zy.dd
    public final File f52386kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public final boolean f52387ld6;

    /* JADX INFO: renamed from: n */
    @zy.dd
    public final List<AbstractC1141t.toq> f6215n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    @zy.dd
    public final String f52388n7h;

    /* JADX INFO: renamed from: p */
    public final boolean f6216p;

    /* JADX INFO: renamed from: q */
    @zy.lvui
    public final AbstractC1141t.q f6217q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private final Set<Integer> f52389qrj;

    /* JADX INFO: renamed from: s */
    @zy.lvui
    public final Executor f6218s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.lvui
    public final Context f52390toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public final boolean f52391x2;

    /* JADX INFO: renamed from: y */
    @zy.lvui
    public final Executor f6219y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    public final String f52392zy;

    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public C1138q(@zy.lvui Context context, @zy.dd String str, @zy.lvui InterfaceC1175q.zy zyVar, @zy.lvui AbstractC1141t.q qVar, @zy.dd List<AbstractC1141t.toq> list, boolean z2, AbstractC1141t.zy zyVar2, @zy.lvui Executor executor, boolean z3, @zy.dd Set<Integer> set) {
        this(context, str, zyVar, qVar, list, z2, zyVar2, executor, executor, false, z3, false, set, null, null);
    }

    /* JADX INFO: renamed from: k */
    public boolean m5178k(int i2, int i3) {
        Set<Integer> set;
        if ((i2 > i3) && this.f52391x2) {
            return false;
        }
        return this.f52387ld6 && ((set = this.f52389qrj) == null || !set.contains(Integer.valueOf(i2)));
    }

    @Deprecated
    public boolean toq(int i2) {
        return m5178k(i2, i2 + 1);
    }

    @Deprecated
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public C1138q(@zy.lvui Context context, @zy.dd String str, @zy.lvui InterfaceC1175q.zy zyVar, @zy.lvui AbstractC1141t.q qVar, @zy.dd List<AbstractC1141t.toq> list, boolean z2, AbstractC1141t.zy zyVar2, @zy.lvui Executor executor, @zy.lvui Executor executor2, boolean z3, boolean z5, boolean z6, @zy.dd Set<Integer> set) {
        this(context, str, zyVar, qVar, list, z2, zyVar2, executor, executor2, z3, z5, z6, set, null, null);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public C1138q(@zy.lvui Context context, @zy.dd String str, @zy.lvui InterfaceC1175q.zy zyVar, @zy.lvui AbstractC1141t.q qVar, @zy.dd List<AbstractC1141t.toq> list, boolean z2, AbstractC1141t.zy zyVar2, @zy.lvui Executor executor, @zy.lvui Executor executor2, boolean z3, boolean z5, boolean z6, @zy.dd Set<Integer> set, @zy.dd String str2, @zy.dd File file) {
        this.f6214k = zyVar;
        this.f52390toq = context;
        this.f52392zy = str;
        this.f6217q = qVar;
        this.f6215n = list;
        this.f6213g = z2;
        this.f52385f7l8 = zyVar2;
        this.f6219y = executor;
        this.f6218s = executor2;
        this.f6216p = z3;
        this.f52387ld6 = z5;
        this.f52391x2 = z6;
        this.f52389qrj = set;
        this.f52388n7h = str2;
        this.f52386kja0 = file;
    }
}

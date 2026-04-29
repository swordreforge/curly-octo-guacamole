package androidx.room;

import androidx.sqlite.db.InterfaceC1175q;
import java.io.File;

/* JADX INFO: compiled from: SQLiteCopyOpenHelperFactory.java */
/* JADX INFO: loaded from: classes.dex */
class d3 implements InterfaceC1175q.zy {

    /* JADX INFO: renamed from: k */
    @zy.dd
    private final String f6164k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @zy.dd
    private final File f52338toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.lvui
    private final InterfaceC1175q.zy f52339zy;

    d3(@zy.dd String str, @zy.dd File file, @zy.lvui InterfaceC1175q.zy zyVar) {
        this.f6164k = str;
        this.f52338toq = file;
        this.f52339zy = zyVar;
    }

    @Override // androidx.sqlite.db.InterfaceC1175q.zy
    /* JADX INFO: renamed from: k */
    public InterfaceC1175q mo5148k(InterfaceC1175q.toq toqVar) {
        return new gvn7(toqVar.f6356k, this.f6164k, this.f52338toq, toqVar.f52463zy.f6355k, this.f52339zy.mo5148k(toqVar));
    }
}

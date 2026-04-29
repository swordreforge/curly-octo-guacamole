package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.state.C0324y;
import androidx.constraintlayout.core.state.helpers.InterfaceC0314n;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.core.widgets.C0342p;
import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: HelperReference.java */
/* JADX INFO: loaded from: classes.dex */
public class zy extends C0318k implements InterfaceC0314n {

    /* JADX INFO: renamed from: a */
    private C0342p f1954a;

    /* JADX INFO: renamed from: a98o, reason: collision with root package name */
    protected ArrayList<Object> f47686a98o;

    /* JADX INFO: renamed from: bf2, reason: collision with root package name */
    protected final C0324y f47687bf2;

    /* JADX INFO: renamed from: i1, reason: collision with root package name */
    final C0324y.n f47688i1;

    public zy(C0324y c0324y, C0324y.n nVar) {
        super(c0324y);
        this.f47686a98o = new ArrayList<>();
        this.f47687bf2 = c0324y;
        this.f47688i1 = nVar;
    }

    @Override // androidx.constraintlayout.core.state.C0318k, androidx.constraintlayout.core.state.InterfaceC0319n, androidx.constraintlayout.core.state.helpers.InterfaceC0314n
    public void apply() {
    }

    public zy g1(Object... objArr) {
        Collections.addAll(this.f47686a98o, objArr);
        return this;
    }

    public C0324y.n gbni() {
        return this.f47688i1;
    }

    @Override // androidx.constraintlayout.core.state.C0318k, androidx.constraintlayout.core.state.InterfaceC0319n
    /* JADX INFO: renamed from: k */
    public C0341n mo1185k() {
        return was();
    }

    public C0342p was() {
        return this.f1954a;
    }

    public void zsr0(C0342p c0342p) {
        this.f1954a = c0342p;
    }
}

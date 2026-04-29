package kt06;

import android.view.View;
import zy.dd;

/* JADX INFO: renamed from: kt06.q */
/* JADX INFO: compiled from: ResponsiveViewSpec.java */
/* JADX INFO: loaded from: classes2.dex */
public class C6754q {

    /* JADX INFO: renamed from: k */
    private int f37519k;

    /* JADX INFO: renamed from: q */
    private int f37520q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f82098toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private View f82099zy;

    public C6754q(int i2) {
        this.f37519k = i2;
    }

    public void f7l8(View view) {
        this.f82099zy = view;
    }

    /* JADX INFO: renamed from: g */
    public void m24681g(int i2) {
        this.f37520q = i2;
    }

    /* JADX INFO: renamed from: k */
    public int m24682k() {
        return this.f37520q;
    }

    /* JADX INFO: renamed from: n */
    public void m24683n(C6753n c6753n) {
        int i2 = c6753n.f82097zy & 7;
        View view = this.f82099zy;
        if (view != null) {
            view.setVisibility(this.f82098toq < i2 ? 0 : 8);
        }
    }

    /* JADX INFO: renamed from: q */
    public int m24684q() {
        return this.f37519k;
    }

    public int toq() {
        return this.f82098toq;
    }

    public View zy() {
        return this.f82099zy;
    }

    public C6754q(int i2, int i3) {
        this.f37519k = i2;
        this.f82098toq = i3;
    }
}

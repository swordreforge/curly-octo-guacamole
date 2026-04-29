package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: LayoutState.java */
/* JADX INFO: loaded from: classes.dex */
class ki {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final int f52147ld6 = 1;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    static final int f52148n7h = 1;

    /* JADX INFO: renamed from: p */
    static final int f5892p = -1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    static final int f52149qrj = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    static final int f52150x2 = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: n */
    int f5895n;

    /* JADX INFO: renamed from: q */
    int f5896q;

    /* JADX INFO: renamed from: s */
    boolean f5897s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    int f52152toq;

    /* JADX INFO: renamed from: y */
    boolean f5898y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f52153zy;

    /* JADX INFO: renamed from: k */
    boolean f5894k = true;

    /* JADX INFO: renamed from: g */
    int f5893g = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    int f52151f7l8 = 0;

    ki() {
    }

    /* JADX INFO: renamed from: k */
    boolean m5004k(RecyclerView.mcp mcpVar) {
        int i2 = this.f52153zy;
        return i2 >= 0 && i2 < mcpVar.m4822q();
    }

    public String toString() {
        return "LayoutState{mAvailable=" + this.f52152toq + ", mCurrentPosition=" + this.f52153zy + ", mItemDirection=" + this.f5896q + ", mLayoutDirection=" + this.f5895n + ", mStartLine=" + this.f5893g + ", mEndLine=" + this.f52151f7l8 + '}';
    }

    View toq(RecyclerView.fu4 fu4Var) {
        View viewM4791h = fu4Var.m4791h(this.f52153zy);
        this.f52153zy += this.f5896q;
        return viewM4791h;
    }
}

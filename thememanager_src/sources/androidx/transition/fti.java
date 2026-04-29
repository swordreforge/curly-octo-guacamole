package androidx.transition;

import android.content.Context;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.jk;

/* JADX INFO: compiled from: Scene.java */
/* JADX INFO: loaded from: classes.dex */
public class fti {

    /* JADX INFO: renamed from: g */
    private Runnable f6425g;

    /* JADX INFO: renamed from: k */
    private Context f6426k;

    /* JADX INFO: renamed from: n */
    private Runnable f6427n;

    /* JADX INFO: renamed from: q */
    private View f6428q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f52493toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private ViewGroup f52494zy;

    public fti(@zy.lvui ViewGroup viewGroup) {
        this.f52493toq = -1;
        this.f52494zy = viewGroup;
    }

    static void f7l8(@zy.lvui ViewGroup viewGroup, @zy.dd fti ftiVar) {
        viewGroup.setTag(jk.f7l8.f52582o05, ftiVar);
    }

    @zy.lvui
    /* JADX INFO: renamed from: q */
    public static fti m5339q(@zy.lvui ViewGroup viewGroup, @zy.gvn7 int i2, @zy.lvui Context context) {
        int i3 = jk.f7l8.f52505b9ub;
        SparseArray sparseArray = (SparseArray) viewGroup.getTag(i3);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            viewGroup.setTag(i3, sparseArray);
        }
        fti ftiVar = (fti) sparseArray.get(i2);
        if (ftiVar != null) {
            return ftiVar;
        }
        fti ftiVar2 = new fti(viewGroup, i2, context);
        sparseArray.put(i2, ftiVar2);
        return ftiVar2;
    }

    @zy.dd
    public static fti zy(@zy.lvui ViewGroup viewGroup) {
        return (fti) viewGroup.getTag(jk.f7l8.f52582o05);
    }

    /* JADX INFO: renamed from: g */
    boolean m5340g() {
        return this.f52493toq > 0;
    }

    /* JADX INFO: renamed from: k */
    public void m5341k() {
        if (this.f52493toq > 0 || this.f6428q != null) {
            m5342n().removeAllViews();
            if (this.f52493toq > 0) {
                LayoutInflater.from(this.f6426k).inflate(this.f52493toq, this.f52494zy);
            } else {
                this.f52494zy.addView(this.f6428q);
            }
        }
        Runnable runnable = this.f6427n;
        if (runnable != null) {
            runnable.run();
        }
        f7l8(this.f52494zy, this);
    }

    @zy.lvui
    /* JADX INFO: renamed from: n */
    public ViewGroup m5342n() {
        return this.f52494zy;
    }

    /* JADX INFO: renamed from: s */
    public void m5343s(@zy.dd Runnable runnable) {
        this.f6425g = runnable;
    }

    public void toq() {
        Runnable runnable;
        if (zy(this.f52494zy) != this || (runnable = this.f6425g) == null) {
            return;
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: y */
    public void m5344y(@zy.dd Runnable runnable) {
        this.f6427n = runnable;
    }

    private fti(ViewGroup viewGroup, int i2, Context context) {
        this.f6426k = context;
        this.f52494zy = viewGroup;
        this.f52493toq = i2;
    }

    public fti(@zy.lvui ViewGroup viewGroup, @zy.lvui View view) {
        this.f52493toq = -1;
        this.f52494zy = viewGroup;
        this.f6428q = view;
    }
}

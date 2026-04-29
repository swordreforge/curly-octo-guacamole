package androidx.viewpager.widget;

import android.database.DataSetObservable;
import android.database.DataSetObserver;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: androidx.viewpager.widget.k */
/* JADX INFO: compiled from: PagerAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1288k {

    /* JADX INFO: renamed from: q */
    public static final int f7045q = -2;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f53692zy = -1;

    /* JADX INFO: renamed from: k */
    private final DataSetObservable f7046k = new DataSetObservable();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private DataSetObserver f53693toq;

    public void cdj(@lvui ViewGroup viewGroup, int i2, @lvui Object obj) {
        m5573h(viewGroup, i2, obj);
    }

    @dd
    public CharSequence f7l8(int i2) {
        return null;
    }

    public void fn3e(@lvui DataSetObserver dataSetObserver) {
        this.f7046k.unregisterObserver(dataSetObserver);
    }

    /* JADX INFO: renamed from: g */
    public int mo5572g(@lvui Object obj) {
        return -1;
    }

    @Deprecated
    /* JADX INFO: renamed from: h */
    public void m5573h(@lvui View view, int i2, @lvui Object obj) {
    }

    /* JADX INFO: renamed from: i */
    public void mo4275i(@lvui ViewGroup viewGroup) {
        t8r(viewGroup);
    }

    @Deprecated
    /* JADX INFO: renamed from: k */
    public void m5574k(@lvui View view, int i2, @lvui Object obj) {
        throw new UnsupportedOperationException("Required method destroyItem was not overridden");
    }

    void ki(DataSetObserver dataSetObserver) {
        synchronized (this) {
            this.f53693toq = dataSetObserver;
        }
    }

    @dd
    public Parcelable kja0() {
        return null;
    }

    public abstract boolean ld6(@lvui View view, @lvui Object obj);

    /* JADX INFO: renamed from: n */
    public abstract int mo5575n();

    public void n7h(@dd Parcelable parcelable, @dd ClassLoader classLoader) {
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public Object mo4276p(@lvui ViewGroup viewGroup, int i2) {
        return m5576s(viewGroup, i2);
    }

    /* JADX INFO: renamed from: q */
    public void mo4277q(@lvui ViewGroup viewGroup) {
        zy(viewGroup);
    }

    public void qrj(@lvui DataSetObserver dataSetObserver) {
        this.f7046k.registerObserver(dataSetObserver);
    }

    @lvui
    @Deprecated
    /* JADX INFO: renamed from: s */
    public Object m5576s(@lvui View view, int i2) {
        throw new UnsupportedOperationException("Required method instantiateItem was not overridden");
    }

    @Deprecated
    public void t8r(@lvui View view) {
    }

    public void toq(@lvui ViewGroup viewGroup, int i2, @lvui Object obj) {
        m5574k(viewGroup, i2, obj);
    }

    public void x2() {
        synchronized (this) {
            DataSetObserver dataSetObserver = this.f53693toq;
            if (dataSetObserver != null) {
                dataSetObserver.onChanged();
            }
        }
        this.f7046k.notifyChanged();
    }

    /* JADX INFO: renamed from: y */
    public float m5577y(int i2) {
        return 1.0f;
    }

    @Deprecated
    public void zy(@lvui View view) {
    }
}

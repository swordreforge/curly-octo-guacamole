package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.Cursor;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: ResourceCursorAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class zy extends AbstractC0773k {

    /* JADX INFO: renamed from: f */
    private LayoutInflater f4328f;

    /* JADX INFO: renamed from: l */
    private int f4329l;

    /* JADX INFO: renamed from: r */
    private int f4330r;

    @Deprecated
    public zy(Context context, int i2, Cursor cursor) {
        super(context, cursor);
        this.f4329l = i2;
        this.f4330r = i2;
        this.f4328f = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public void n7h(int i2) {
        this.f4330r = i2;
    }

    public void qrj(int i2) {
        this.f4329l = i2;
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k
    /* JADX INFO: renamed from: s */
    public View mo604s(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4328f.inflate(this.f4330r, viewGroup, false);
    }

    @Override // androidx.cursoradapter.widget.AbstractC0773k
    /* JADX INFO: renamed from: y */
    public View mo3728y(Context context, Cursor cursor, ViewGroup viewGroup) {
        return this.f4328f.inflate(this.f4329l, viewGroup, false);
    }

    @Deprecated
    public zy(Context context, int i2, Cursor cursor, boolean z2) {
        super(context, cursor, z2);
        this.f4329l = i2;
        this.f4330r = i2;
        this.f4328f = (LayoutInflater) context.getSystemService("layout_inflater");
    }

    public zy(Context context, int i2, Cursor cursor, int i3) {
        super(context, cursor, i3);
        this.f4329l = i2;
        this.f4330r = i2;
        this.f4328f = (LayoutInflater) context.getSystemService("layout_inflater");
    }
}

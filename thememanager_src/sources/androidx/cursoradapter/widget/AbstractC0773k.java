package androidx.cursoradapter.widget;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.FilterQueryProvider;
import android.widget.Filterable;
import androidx.cursoradapter.widget.toq;
import zy.uv6;

/* JADX INFO: renamed from: androidx.cursoradapter.widget.k */
/* JADX INFO: compiled from: CursorAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0773k extends BaseAdapter implements Filterable, toq.InterfaceC0775k {

    /* JADX INFO: renamed from: t */
    public static final int f4308t = 2;

    /* JADX INFO: renamed from: z */
    @Deprecated
    public static final int f4309z = 1;

    /* JADX INFO: renamed from: g */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected Context f4310g;

    /* JADX INFO: renamed from: h */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected androidx.cursoradapter.widget.toq f4311h;

    /* JADX INFO: renamed from: i */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected FilterQueryProvider f4312i;

    /* JADX INFO: renamed from: k */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected boolean f4313k;

    /* JADX INFO: renamed from: n */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected Cursor f4314n;

    /* JADX INFO: renamed from: p */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected DataSetObserver f4315p;

    /* JADX INFO: renamed from: q */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected boolean f4316q;

    /* JADX INFO: renamed from: s */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected k f4317s;

    /* JADX INFO: renamed from: y */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    protected int f4318y;

    /* JADX INFO: renamed from: androidx.cursoradapter.widget.k$k */
    /* JADX INFO: compiled from: CursorAdapter.java */
    private class k extends ContentObserver {
        k() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean z2) {
            AbstractC0773k.this.m3727p();
        }
    }

    /* JADX INFO: renamed from: androidx.cursoradapter.widget.k$toq */
    /* JADX INFO: compiled from: CursorAdapter.java */
    private class toq extends DataSetObserver {
        toq() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            AbstractC0773k abstractC0773k = AbstractC0773k.this;
            abstractC0773k.f4313k = true;
            abstractC0773k.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            AbstractC0773k abstractC0773k = AbstractC0773k.this;
            abstractC0773k.f4313k = false;
            abstractC0773k.notifyDataSetInvalidated();
        }
    }

    @Deprecated
    public AbstractC0773k(Context context, Cursor cursor) {
        m3725g(context, cursor, 1);
    }

    public CharSequence convertToString(Cursor cursor) {
        return cursor == null ? "" : cursor.toString();
    }

    @Deprecated
    protected void f7l8(Context context, Cursor cursor, boolean z2) {
        m3725g(context, cursor, z2 ? 1 : 2);
    }

    /* JADX INFO: renamed from: g */
    void m3725g(Context context, Cursor cursor, int i2) {
        if ((i2 & 1) == 1) {
            i2 |= 2;
            this.f4316q = true;
        } else {
            this.f4316q = false;
        }
        boolean z2 = cursor != null;
        this.f4314n = cursor;
        this.f4313k = z2;
        this.f4310g = context;
        this.f4318y = z2 ? cursor.getColumnIndexOrThrow("_id") : -1;
        if ((i2 & 2) == 2) {
            this.f4317s = new k();
            this.f4315p = new toq();
        } else {
            this.f4317s = null;
            this.f4315p = null;
        }
        if (z2) {
            k kVar = this.f4317s;
            if (kVar != null) {
                cursor.registerContentObserver(kVar);
            }
            DataSetObserver dataSetObserver = this.f4315p;
            if (dataSetObserver != null) {
                cursor.registerDataSetObserver(dataSetObserver);
            }
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        Cursor cursor;
        if (!this.f4313k || (cursor = this.f4314n) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f4313k) {
            return null;
        }
        this.f4314n.moveToPosition(i2);
        if (view == null) {
            view = mo3728y(this.f4310g, this.f4314n, viewGroup);
        }
        mo603q(view, this.f4310g, this.f4314n);
        return view;
    }

    @Override // android.widget.Filterable
    public Filter getFilter() {
        if (this.f4311h == null) {
            this.f4311h = new androidx.cursoradapter.widget.toq(this);
        }
        return this.f4311h;
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        Cursor cursor;
        if (!this.f4313k || (cursor = this.f4314n) == null) {
            return null;
        }
        cursor.moveToPosition(i2);
        return this.f4314n;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        Cursor cursor;
        if (this.f4313k && (cursor = this.f4314n) != null && cursor.moveToPosition(i2)) {
            return this.f4314n.getLong(this.f4318y);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (!this.f4313k) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (this.f4314n.moveToPosition(i2)) {
            if (view == null) {
                view = mo604s(this.f4310g, this.f4314n, viewGroup);
            }
            mo603q(view, this.f4310g, this.f4314n);
            return view;
        }
        throw new IllegalStateException("couldn't move cursor to position " + i2);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public void mo602k(Cursor cursor) {
        Cursor cursorX2 = x2(cursor);
        if (cursorX2 != null) {
            cursorX2.close();
        }
    }

    public void ld6(FilterQueryProvider filterQueryProvider) {
        this.f4312i = filterQueryProvider;
    }

    /* JADX INFO: renamed from: n */
    public FilterQueryProvider m3726n() {
        return this.f4312i;
    }

    /* JADX INFO: renamed from: p */
    protected void m3727p() {
        Cursor cursor;
        if (!this.f4316q || (cursor = this.f4314n) == null || cursor.isClosed()) {
            return;
        }
        this.f4313k = this.f4314n.requery();
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo603q(View view, Context context, Cursor cursor);

    /* JADX INFO: renamed from: s */
    public abstract View mo604s(Context context, Cursor cursor, ViewGroup viewGroup);

    public Cursor toq(CharSequence charSequence) {
        FilterQueryProvider filterQueryProvider = this.f4312i;
        return filterQueryProvider != null ? filterQueryProvider.runQuery(charSequence) : this.f4314n;
    }

    public Cursor x2(Cursor cursor) {
        Cursor cursor2 = this.f4314n;
        if (cursor == cursor2) {
            return null;
        }
        if (cursor2 != null) {
            k kVar = this.f4317s;
            if (kVar != null) {
                cursor2.unregisterContentObserver(kVar);
            }
            DataSetObserver dataSetObserver = this.f4315p;
            if (dataSetObserver != null) {
                cursor2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f4314n = cursor;
        if (cursor != null) {
            k kVar2 = this.f4317s;
            if (kVar2 != null) {
                cursor.registerContentObserver(kVar2);
            }
            DataSetObserver dataSetObserver2 = this.f4315p;
            if (dataSetObserver2 != null) {
                cursor.registerDataSetObserver(dataSetObserver2);
            }
            this.f4318y = cursor.getColumnIndexOrThrow("_id");
            this.f4313k = true;
            notifyDataSetChanged();
        } else {
            this.f4318y = -1;
            this.f4313k = false;
            notifyDataSetInvalidated();
        }
        return cursor2;
    }

    /* JADX INFO: renamed from: y */
    public View mo3728y(Context context, Cursor cursor, ViewGroup viewGroup) {
        return mo604s(context, cursor, viewGroup);
    }

    @Override // androidx.cursoradapter.widget.toq.InterfaceC0775k
    public Cursor zy() {
        return this.f4314n;
    }

    public AbstractC0773k(Context context, Cursor cursor, boolean z2) {
        m3725g(context, cursor, z2 ? 1 : 2);
    }

    public AbstractC0773k(Context context, Cursor cursor, int i2) {
        m3725g(context, cursor, i2);
    }
}

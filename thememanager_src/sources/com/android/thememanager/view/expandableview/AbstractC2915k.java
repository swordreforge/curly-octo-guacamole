package com.android.thememanager.view.expandableview;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.android.thememanager.view.expandableview.PinnedHeaderListView;

/* JADX INFO: renamed from: com.android.thememanager.view.expandableview.k */
/* JADX INFO: compiled from: PinnedBaseAdapter.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2915k extends BaseAdapter implements PinnedHeaderListView.zy {

    /* JADX INFO: renamed from: p */
    private static int f17528p;

    /* JADX INFO: renamed from: s */
    private static int f17529s;

    /* JADX INFO: renamed from: q */
    private SparseArray<Integer> f17533q = new SparseArray<>();

    /* JADX INFO: renamed from: k */
    private SparseArray<Integer> f17531k = new SparseArray<>();

    /* JADX INFO: renamed from: n */
    private SparseArray<Integer> f17532n = new SparseArray<>();

    /* JADX INFO: renamed from: g */
    private int f17530g = -1;

    /* JADX INFO: renamed from: y */
    private int f17534y = -1;

    private int n7h() {
        int i2 = this.f17534y;
        if (i2 >= 0) {
            return i2;
        }
        int iLd6 = ld6();
        this.f17534y = iLd6;
        return iLd6;
    }

    private int qrj(int section) {
        Integer num = this.f17532n.get(section);
        if (num != null) {
            return num.intValue();
        }
        int iM10352q = m10352q(section);
        this.f17532n.put(section, Integer.valueOf(iM10352q));
        return iM10352q;
    }

    public abstract View f7l8(int section, int position, View convertView, ViewGroup parent);

    /* JADX INFO: renamed from: g */
    public abstract long m10349g(int section, int position);

    @Override // android.widget.Adapter, com.android.thememanager.view.expandableview.PinnedHeaderListView.zy
    public final int getCount() {
        int i2 = this.f17530g;
        if (i2 >= 0) {
            return i2;
        }
        int iQrj = 0;
        for (int i3 = 0; i3 < n7h(); i3++) {
            iQrj = iQrj + qrj(i3) + 1;
        }
        this.f17530g = iQrj;
        return iQrj;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int position) {
        return m10350n(getSectionForPosition(position), m10351p(position));
    }

    @Override // android.widget.Adapter
    public final long getItemId(int position) {
        return m10349g(getSectionForPosition(position), m10351p(position));
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getItemViewType(int position) {
        return mo10346k(position) ? m10353s() + zy(getSectionForPosition(position)) : m10354y(getSectionForPosition(position), m10351p(position));
    }

    @Override // com.android.thememanager.view.expandableview.PinnedHeaderListView.zy
    public final int getSectionForPosition(int position) {
        Integer num = this.f17533q.get(position);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < n7h()) {
            int iQrj = qrj(i2) + i3 + 1;
            if (position >= i3 && position < iQrj) {
                this.f17533q.put(position, Integer.valueOf(i2));
                return i2;
            }
            i2++;
            i3 = iQrj;
        }
        return 0;
    }

    @Override // android.widget.Adapter
    public final View getView(int position, View convertView, ViewGroup parent) {
        return mo10346k(position) ? toq(getSectionForPosition(position), convertView, parent) : f7l8(getSectionForPosition(position), m10351p(position), convertView, parent);
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final int getViewTypeCount() {
        return m10353s() + x2();
    }

    @Override // com.android.thememanager.view.expandableview.PinnedHeaderListView.zy
    /* JADX INFO: renamed from: k */
    public final boolean mo10346k(int position) {
        int iQrj = 0;
        for (int i2 = 0; i2 < n7h(); i2++) {
            if (position == iQrj) {
                return true;
            }
            if (position < iQrj) {
                return false;
            }
            iQrj += qrj(i2) + 1;
        }
        return false;
    }

    public abstract int ld6();

    /* JADX INFO: renamed from: n */
    public abstract Object m10350n(int section, int position);

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        this.f17533q.clear();
        this.f17531k.clear();
        this.f17532n.clear();
        this.f17530g = -1;
        this.f17534y = -1;
        super.notifyDataSetChanged();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetInvalidated() {
        this.f17533q.clear();
        this.f17531k.clear();
        this.f17532n.clear();
        this.f17530g = -1;
        this.f17534y = -1;
        super.notifyDataSetInvalidated();
    }

    /* JADX INFO: renamed from: p */
    public int m10351p(int position) {
        Integer num = this.f17531k.get(position);
        if (num != null) {
            return num.intValue();
        }
        int i2 = 0;
        int i3 = 0;
        while (i2 < n7h()) {
            int iQrj = qrj(i2) + i3 + 1;
            if (position >= i3 && position < iQrj) {
                int i4 = (position - i3) - 1;
                this.f17531k.put(position, Integer.valueOf(i4));
                return i4;
            }
            i2++;
            i3 = iQrj;
        }
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public abstract int m10352q(int section);

    /* JADX INFO: renamed from: s */
    public int m10353s() {
        return 1;
    }

    @Override // com.android.thememanager.view.expandableview.PinnedHeaderListView.zy
    public abstract View toq(int section, View convertView, ViewGroup parent);

    public int x2() {
        return 1;
    }

    /* JADX INFO: renamed from: y */
    public int m10354y(int section, int position) {
        return f17528p;
    }

    @Override // com.android.thememanager.view.expandableview.PinnedHeaderListView.zy
    public int zy(int section) {
        return f17529s;
    }
}

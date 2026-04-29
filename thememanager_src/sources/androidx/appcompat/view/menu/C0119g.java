package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.kja0;
import java.util.ArrayList;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.g */
/* JADX INFO: compiled from: MenuAdapter.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class C0119g extends BaseAdapter {

    /* JADX INFO: renamed from: g */
    private final boolean f459g;

    /* JADX INFO: renamed from: k */
    f7l8 f460k;

    /* JADX INFO: renamed from: n */
    private boolean f461n;

    /* JADX INFO: renamed from: q */
    private int f462q = -1;

    /* JADX INFO: renamed from: s */
    private final int f463s;

    /* JADX INFO: renamed from: y */
    private final LayoutInflater f464y;

    public C0119g(f7l8 f7l8Var, LayoutInflater layoutInflater, boolean z2, int i2) {
        this.f459g = z2;
        this.f464y = layoutInflater;
        this.f460k = f7l8Var;
        this.f463s = i2;
        m340k();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f462q < 0 ? (this.f459g ? this.f460k.mcp() : this.f460k.gvn7()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f464y.inflate(this.f463s, viewGroup, false);
        }
        int groupId = getItem(i2).getGroupId();
        int i3 = i2 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.setGroupDividerEnabled(this.f460k.d3() && groupId != (i3 >= 0 ? getItem(i3).getGroupId() : groupId));
        kja0.InterfaceC0124k interfaceC0124k = (kja0.InterfaceC0124k) view;
        if (this.f461n) {
            listMenuItemView.setForceShowIcon(true);
        }
        interfaceC0124k.mo309g(getItem(i2), 0);
        return view;
    }

    /* JADX INFO: renamed from: k */
    void m340k() {
        C0130p c0130pM339z = this.f460k.m339z();
        if (c0130pM339z != null) {
            ArrayList<C0130p> arrayListMcp = this.f460k.mcp();
            int size = arrayListMcp.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (arrayListMcp.get(i2) == c0130pM339z) {
                    this.f462q = i2;
                    return;
                }
            }
        }
        this.f462q = -1;
    }

    /* JADX INFO: renamed from: n */
    public void m341n(boolean z2) {
        this.f461n = z2;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m340k();
        super.notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public C0130p getItem(int i2) {
        ArrayList<C0130p> arrayListMcp = this.f459g ? this.f460k.mcp() : this.f460k.gvn7();
        int i3 = this.f462q;
        if (i3 >= 0 && i2 >= i3) {
            i2++;
        }
        return arrayListMcp.get(i2);
    }

    public f7l8 toq() {
        return this.f460k;
    }

    public boolean zy() {
        return this.f461n;
    }
}

package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.appcompat.view.menu.f7l8;
import androidx.appcompat.widget.C0184b;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public final class ExpandedMenuView extends ListView implements f7l8.toq, kja0, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: n */
    private static final int[] f433n = {R.attr.background, R.attr.divider};

    /* JADX INFO: renamed from: k */
    private f7l8 f434k;

    /* JADX INFO: renamed from: q */
    private int f435q;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listViewStyle);
    }

    @Override // androidx.appcompat.view.menu.kja0
    public int getWindowAnimations() {
        return this.f435q;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        mo314q((C0130p) getAdapter().getItem(i2));
    }

    @Override // androidx.appcompat.view.menu.f7l8.toq
    /* JADX INFO: renamed from: q */
    public boolean mo314q(C0130p c0130p) {
        return this.f434k.dd(c0130p, 0);
    }

    @Override // androidx.appcompat.view.menu.kja0
    public void zy(f7l8 f7l8Var) {
        this.f434k = f7l8Var;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0184b c0184bJp0y = C0184b.jp0y(context, attributeSet, f433n, i2, 0);
        if (c0184bJp0y.mcp(0)) {
            setBackgroundDrawable(c0184bJp0y.m553y(0));
        }
        if (c0184bJp0y.mcp(1)) {
            setDivider(c0184bJp0y.m553y(1));
        }
        c0184bJp0y.d3();
    }
}

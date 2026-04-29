package miuix.appcompat.internal.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import miuix.appcompat.internal.view.menu.f7l8;

/* JADX INFO: loaded from: classes3.dex */
public final class ExpandedMenuView extends ListView implements f7l8.zy, x2, AdapterView.OnItemClickListener {

    /* JADX INFO: renamed from: k */
    private f7l8 f39363k;

    /* JADX INFO: renamed from: q */
    private int f39364q;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
    }

    @Override // miuix.appcompat.internal.view.menu.x2
    public void f7l8(f7l8 f7l8Var) {
        this.f39363k = f7l8Var;
    }

    @Override // miuix.appcompat.internal.view.menu.x2
    public int getWindowAnimations() {
        return this.f39364q;
    }

    @Override // miuix.appcompat.internal.view.menu.x2
    /* JADX INFO: renamed from: k */
    public boolean mo25264k(int i2) {
        return false;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        toq((MenuItemC7036s) getAdapter().getItem(i2), 0);
    }

    @Override // miuix.appcompat.internal.view.menu.f7l8.zy
    public boolean toq(MenuItemC7036s menuItemC7036s, int i2) {
        return this.f39363k.m25348r(menuItemC7036s, i2);
    }

    @Override // miuix.appcompat.internal.view.menu.x2
    /* JADX INFO: renamed from: y */
    public boolean mo25265y() {
        return false;
    }
}

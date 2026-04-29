package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.C0119g;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class MenuPopupWindow extends n5r1 implements hyr {
    private static final String aj = "MenuPopupWindow";
    private static Method bs;
    private hyr be;

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static class MenuDropDownListView extends d2ok {

        /* JADX INFO: renamed from: b */
        private MenuItem f831b;

        /* JADX INFO: renamed from: j */
        final int f832j;

        /* JADX INFO: renamed from: m */
        private hyr f833m;

        /* JADX INFO: renamed from: o */
        final int f834o;

        public MenuDropDownListView(Context context, boolean z2) {
            super(context, z2);
            if (1 == context.getResources().getConfiguration().getLayoutDirection()) {
                this.f832j = 21;
                this.f834o = 22;
            } else {
                this.f832j = 22;
                this.f834o = 21;
            }
        }

        @Override // androidx.appcompat.widget.d2ok
        /* JADX INFO: renamed from: g */
        public /* bridge */ /* synthetic */ boolean mo472g(MotionEvent motionEvent, int i2) {
            return super.mo472g(motionEvent, i2);
        }

        @Override // androidx.appcompat.widget.d2ok, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // androidx.appcompat.widget.d2ok, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // androidx.appcompat.widget.d2ok, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // androidx.appcompat.widget.d2ok, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // androidx.appcompat.widget.d2ok
        /* JADX INFO: renamed from: n */
        public /* bridge */ /* synthetic */ int mo473n(int i2, int i3, int i4, int i5, int i6) {
            return super.mo473n(i2, i3, i4, i5, i6);
        }

        @Override // androidx.appcompat.widget.d2ok, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            int headersCount;
            C0119g c0119g;
            int iPointToPosition;
            int i2;
            if (this.f833m != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    c0119g = (C0119g) headerViewListAdapter.getWrappedAdapter();
                } else {
                    headersCount = 0;
                    c0119g = (C0119g) adapter;
                }
                C0130p item = null;
                if (motionEvent.getAction() != 10 && (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) != -1 && (i2 = iPointToPosition - headersCount) >= 0 && i2 < c0119g.getCount()) {
                    item = c0119g.getItem(i2);
                }
                MenuItem menuItem = this.f831b;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.f7l8 qVar = c0119g.toq();
                    if (menuItem != null) {
                        this.f833m.qrj(qVar, menuItem);
                    }
                    this.f831b = item;
                    if (item != null) {
                        this.f833m.f7l8(qVar, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i2, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i2 == this.f832j) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i2 != this.f834o) {
                return super.onKeyDown(i2, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            (adapter instanceof HeaderViewListAdapter ? (C0119g) ((HeaderViewListAdapter) adapter).getWrappedAdapter() : (C0119g) adapter).toq().m328g(false);
            return true;
        }

        @Override // androidx.appcompat.widget.d2ok, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        @Override // androidx.appcompat.widget.d2ok
        /* JADX INFO: renamed from: q */
        public /* bridge */ /* synthetic */ int mo474q(int i2, boolean z2) {
            return super.mo474q(i2, z2);
        }

        public void qrj() {
            setSelection(-1);
        }

        public void setHoverListener(hyr hyrVar) {
            this.f833m = hyrVar;
        }

        @Override // androidx.appcompat.widget.d2ok, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                bs = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i(aj, "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public MenuPopupWindow(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
    }

    /* JADX INFO: renamed from: a */
    public void m470a(Object obj) {
        this.an.setEnterTransition((Transition) obj);
    }

    public void ch(boolean z2) {
        if (Build.VERSION.SDK_INT > 28) {
            this.an.setTouchModal(z2);
            return;
        }
        Method method = bs;
        if (method != null) {
            try {
                method.invoke(this.an, Boolean.valueOf(z2));
            } catch (Exception unused) {
                Log.i(aj, "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // androidx.appcompat.widget.hyr
    public void f7l8(@zy.lvui androidx.appcompat.view.menu.f7l8 f7l8Var, @zy.lvui MenuItem menuItem) {
        hyr hyrVar = this.be;
        if (hyrVar != null) {
            hyrVar.f7l8(f7l8Var, menuItem);
        }
    }

    @Override // androidx.appcompat.widget.n5r1
    @zy.lvui
    d2ok ki(Context context, boolean z2) {
        MenuDropDownListView menuDropDownListView = new MenuDropDownListView(context, z2);
        menuDropDownListView.setHoverListener(this);
        return menuDropDownListView;
    }

    @Override // androidx.appcompat.widget.hyr
    public void qrj(@zy.lvui androidx.appcompat.view.menu.f7l8 f7l8Var, @zy.lvui MenuItem menuItem) {
        hyr hyrVar = this.be;
        if (hyrVar != null) {
            hyrVar.qrj(f7l8Var, menuItem);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m471x(hyr hyrVar) {
        this.be = hyrVar;
    }

    public void zp(Object obj) {
        this.an.setExitTransition((Transition) obj);
    }
}

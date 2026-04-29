package miuix.appcompat.internal.view.menu.context;

import android.R;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import gb.toq;
import miuix.appcompat.internal.view.menu.f7l8;
import miuix.internal.util.C7164n;
import miuix.internal.util.C7169q;
import miuix.internal.util.n7h;
import miuix.internal.widget.C7177g;

/* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.context.g */
/* JADX INFO: compiled from: ContextMenuPopupWindowImpl.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7025g extends C7177g implements InterfaceC7028q {
    private static final float ac = 0.1f;
    private static final float ad = 0.1f;
    private LinearLayout an;
    private ViewGroup as;
    private MenuItem ax;
    private float az;
    private f7l8 ba;
    private float bg;
    private View bl;
    private int bq;
    private View id;
    private C7026k in;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.context.g$k */
    /* JADX INFO: compiled from: ContextMenuPopupWindowImpl.java */
    class k implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.context.g$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ContextMenuPopupWindowImpl.java */
        class C8099k implements PopupWindow.OnDismissListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ SubMenu f39497k;

            C8099k(SubMenu subMenu) {
                this.f39497k = subMenu;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public void onDismiss() {
                C7025g.this.setOnDismissListener(null);
                C7025g.this.f7l8(this.f39497k);
                C7025g c7025g = C7025g.this;
                c7025g.c8jq(c7025g.bl, C7025g.this.bg, C7025g.this.az);
            }
        }

        k() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i2, long j2) {
            MenuItem item = C7025g.this.in.getItem(i2);
            C7025g.this.ba.m25348r(item, 0);
            if (item.hasSubMenu()) {
                C7025g.this.setOnDismissListener(new C8099k(item.getSubMenu()));
            }
            C7025g.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.context.g$toq */
    /* JADX INFO: compiled from: ContextMenuPopupWindowImpl.java */
    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C7025g.this.ba.m25348r(C7025g.this.ax, 0);
            C7025g.this.dismiss();
        }
    }

    public C7025g(Context context, f7l8 f7l8Var, PopupWindow.OnDismissListener onDismissListener) {
        this(context, f7l8Var, onDismissListener, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c8jq(View view, float f2, float f3) {
        View rootView = view.getRootView();
        Rect rect = new Rect();
        n7h.m25961y(rootView, rect);
        setWidth(oc(rect));
        setHeight(-2);
        this.id.setVisibility(8);
        m25322v(view, f2, f3, rect);
        this.f40470i.forceLayout();
    }

    private int dr() {
        if (this.id.getVisibility() != 0) {
            return 0;
        }
        ViewGroup.LayoutParams layoutParams = this.id.getLayoutParams();
        int i2 = (layoutParams == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) ? 0 : ((ViewGroup.MarginLayoutParams) this.id.getLayoutParams()).topMargin + 0;
        this.id.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
        return this.id.getMeasuredHeight() + i2;
    }

    private int gyi() {
        ListView listView = (ListView) this.f40470i.findViewById(R.id.list);
        if (listView == null) {
            this.f40470i.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            return this.f40470i.getMeasuredHeight() + 0;
        }
        ListAdapter adapter = listView.getAdapter();
        int measuredHeight = 0;
        for (int i2 = 0; i2 < adapter.getCount(); i2++) {
            View view = adapter.getView(i2, null, listView);
            view.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            measuredHeight += view.getMeasuredHeight();
        }
        return measuredHeight;
    }

    /* JADX INFO: renamed from: v */
    private void m25322v(View view, float f2, float f3, Rect rect) {
        Rect rect2 = new Rect();
        n7h.m25961y(view, rect2);
        int iWidth = rect2.left + ((int) f2);
        int i2 = rect2.top + ((int) f3);
        boolean z2 = iWidth <= getWidth();
        boolean z3 = iWidth >= rect.width() - getWidth();
        int iGyi = gyi();
        float fGyi = i2 - (gyi() / 2);
        if (fGyi < rect.height() * 0.1f) {
            fGyi = rect.height() * 0.1f;
        }
        int iDr = iGyi + dr();
        setHeight(iDr);
        m26036j(iDr);
        float f4 = iDr;
        if (fGyi + f4 > rect.height() * 0.9f) {
            fGyi = (rect.height() * 0.9f) - f4;
        }
        if (fGyi < rect.height() * 0.1f) {
            fGyi = rect.height() * 0.1f;
            setHeight((int) (rect.height() * 0.79999995f));
        }
        if (z2) {
            iWidth = this.bq;
        } else if (z3) {
            iWidth = (rect.width() - this.bq) - getWidth();
        }
        showAtLocation(view, 0, iWidth, (int) fGyi);
        C7177g.fti(this.f40469h.getRootView());
    }

    private void xwq3(Context context) {
        if (this.ax == null) {
            this.id.setVisibility(8);
            return;
        }
        ((TextView) this.id.findViewById(R.id.text1)).setText(this.ax.getTitle());
        this.id.setOnClickListener(new toq());
        C7169q.toq(this.id);
    }

    @Override // miuix.appcompat.internal.view.menu.context.InterfaceC7028q
    public void f7l8(Menu menu) {
        this.in.m26047q(menu);
    }

    @Override // miuix.appcompat.internal.view.menu.context.InterfaceC7028q
    /* JADX INFO: renamed from: h */
    public void mo25323h(View view, ViewGroup viewGroup, float f2, float f3) {
        this.bl = view;
        this.as = viewGroup;
        this.bg = f2;
        this.az = f3;
        View rootView = view.getRootView();
        Rect rect = new Rect();
        n7h.m25961y(rootView, rect);
        if (m26035e(view, viewGroup, rect)) {
            setElevation(0.0f);
            m25322v(view, f2, f3, rect);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.context.InterfaceC7028q
    public void qrj(View view, ViewGroup viewGroup, float f2, float f3) {
        if (view == null && (view = this.bl) == null) {
            view = null;
        }
        if (viewGroup == null && (viewGroup = this.as) == null) {
            viewGroup = null;
        }
        mo25323h(view, viewGroup, f2, f3);
    }

    @Override // miuix.internal.widget.C7177g
    protected void vyq(Context context) {
        LinearLayout linearLayout = new LinearLayout(context);
        this.an = linearLayout;
        linearLayout.setOrientation(1);
        this.an.setClipChildren(false);
        this.id = LayoutInflater.from(context).inflate(toq.qrj.f76745qo, (ViewGroup) null, false);
        Drawable drawableM25952s = C7164n.m25952s(context, toq.C6055q.qu9);
        if (drawableM25952s != null) {
            drawableM25952s.getPadding(this.f40486y);
            this.f40469h.setBackground(drawableM25952s);
            this.id.setBackground(drawableM25952s.getConstantState().newDrawable());
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, context.getResources().getDimensionPixelSize(toq.f7l8.f75472m8), 0, 0);
        this.an.addView(this.f40469h, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        this.an.addView(this.id, layoutParams);
        setBackgroundDrawable(null);
        i1(this.an);
    }

    public C7025g(Context context, f7l8 f7l8Var, PopupWindow.OnDismissListener onDismissListener, View view) {
        super(context, view);
        this.ba = f7l8Var;
        C7026k c7026k = new C7026k(context, this.ba);
        this.in = c7026k;
        this.ax = c7026k.m25324n();
        xwq3(context);
        x2(this.in);
        m26034b(new k());
        if (onDismissListener != null) {
            setOnDismissListener(onDismissListener);
        }
        this.bq = context.getResources().getDimensionPixelSize(toq.f7l8.f75527ula6);
    }
}

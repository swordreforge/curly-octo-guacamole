package miuix.internal.widget;

import android.R;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowManager;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import gb.toq;
import java.lang.ref.WeakReference;
import miuix.animation.ViewHoverListener;
import miuix.animation.utils.LogUtils;
import miuix.appcompat.internal.util.C7007y;
import miuix.core.util.C7085q;
import miuix.core.util.t8r;
import miuix.internal.util.C7163k;
import miuix.internal.util.C7164n;
import miuix.internal.util.n7h;
import miuix.internal.widget.C7177g;
import miuix.smooth.SmoothFrameLayout2;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import zy.dd;
import zy.lvui;

/* JADX INFO: renamed from: miuix.internal.widget.g */
/* JADX INFO: compiled from: ListPopup.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7177g extends PopupWindow {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f87823ab = "ListPopupWindow";
    private static final float bb = 8.0f;
    private static final float bp = 8.0f;
    private static final float bv = 0.3f;

    /* JADX INFO: renamed from: a */
    private f7l8 f40462a;

    /* JADX INFO: renamed from: b */
    private int f40463b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private PopupWindow.OnDismissListener f87824bo;

    /* JADX INFO: renamed from: c */
    private int f40464c;

    /* JADX INFO: renamed from: d */
    private WeakReference<View> f40465d;

    /* JADX INFO: renamed from: e */
    private int f40466e;

    /* JADX INFO: renamed from: f */
    private int f40467f;

    /* JADX INFO: renamed from: g */
    private boolean f40468g;

    /* JADX INFO: renamed from: h */
    protected FrameLayout f40469h;

    /* JADX INFO: renamed from: i */
    protected View f40470i;

    /* JADX INFO: renamed from: j */
    protected int f40471j;

    /* JADX INFO: renamed from: k */
    private int f40472k;

    /* JADX INFO: renamed from: l */
    private int f40473l;

    /* JADX INFO: renamed from: m */
    private Rect f40474m;

    /* JADX INFO: renamed from: n */
    private boolean f40475n;

    /* JADX INFO: renamed from: o */
    private int f40476o;

    /* JADX INFO: renamed from: p */
    private Context f40477p;

    /* JADX INFO: renamed from: q */
    private int f40478q;

    /* JADX INFO: renamed from: r */
    private AdapterView.OnItemClickListener f40479r;

    /* JADX INFO: renamed from: s */
    private WeakReference<View> f40480s;

    /* JADX INFO: renamed from: t */
    private ListAdapter f40481t;

    /* JADX INFO: renamed from: u */
    private int f40482u;

    /* JADX INFO: renamed from: v */
    private boolean f40483v;

    /* JADX INFO: renamed from: w */
    private DataSetObserver f40484w;

    /* JADX INFO: renamed from: x */
    protected int f40485x;

    /* JADX INFO: renamed from: y */
    protected final Rect f40486y;

    /* JADX INFO: renamed from: z */
    private ListView f40487z;

    /* JADX INFO: renamed from: miuix.internal.widget.g$f7l8 */
    /* JADX INFO: compiled from: ListPopup.java */
    private static class f7l8 {

        /* JADX INFO: renamed from: k */
        int f40488k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        int f87825toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        boolean f87826zy;

        private f7l8() {
        }

        /* JADX INFO: renamed from: k */
        public void m26042k(int i2) {
            this.f40488k = i2;
            this.f87826zy = true;
        }

        @lvui
        public String toString() {
            return "ContentSize{ w= " + this.f40488k + " h= " + this.f87825toq + " }";
        }

        /* synthetic */ f7l8(k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: miuix.internal.widget.g$k */
    /* JADX INFO: compiled from: ListPopup.java */
    class k extends DataSetObserver {
        k() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void toq(View view) {
            FrameLayout frameLayout = C7177g.this.f40469h;
            if (frameLayout == null || !frameLayout.isAttachedToWindow()) {
                return;
            }
            C7177g.this.zp(view);
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            final View viewLvui;
            C7177g.this.f40462a.f87826zy = false;
            if (!C7177g.this.isShowing() || (viewLvui = C7177g.this.lvui()) == null) {
                return;
            }
            viewLvui.post(new Runnable() { // from class: miuix.internal.widget.n
                @Override // java.lang.Runnable
                public final void run() {
                    this.f40499k.toq(viewLvui);
                }
            });
        }
    }

    /* JADX INFO: renamed from: miuix.internal.widget.g$n */
    /* JADX INFO: compiled from: ListPopup.java */
    class n extends ViewOutlineProvider {
        n() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view.getWidth() == 0 || view.getHeight() == 0) {
                return;
            }
            outline.setAlpha(C7164n.m25950p(view.getContext(), toq.C6055q.qmo, 0.0f));
            if (view.getBackground() != null) {
                view.getBackground().getOutline(outline);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.internal.widget.g$q */
    /* JADX INFO: compiled from: ListPopup.java */
    class q implements View.OnTouchListener {

        /* JADX INFO: renamed from: k */
        int f40492k = -1;

        q() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void toq(View view) {
            if (view instanceof ViewGroup) {
                try {
                    int childCount = ((ViewGroup) view).getChildCount();
                    for (int i2 = 0; i2 < childCount; i2++) {
                        ((ViewGroup) view).getChildAt(i2).setPressed(false);
                    }
                } catch (Exception e2) {
                    Log.e(C7177g.f87823ab, "list onTouch error " + e2);
                }
            }
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(final View view, MotionEvent motionEvent) {
            int firstVisiblePosition;
            int i2;
            int iPointToPosition = C7177g.this.f40487z.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action == 1 || action == 3 || action == 6) {
                    this.f40492k = -1;
                    C7177g.this.f40487z.postDelayed(new Runnable() { // from class: miuix.internal.widget.f7l8
                        @Override // java.lang.Runnable
                        public final void run() {
                            C7177g.q.toq(view);
                        }
                    }, ViewConfiguration.getPressedStateDuration());
                }
            } else if (iPointToPosition != -1 && (firstVisiblePosition = iPointToPosition - C7177g.this.f40487z.getFirstVisiblePosition()) != (i2 = this.f40492k)) {
                if (i2 != -1) {
                    C7177g.this.f40487z.getChildAt(this.f40492k).setPressed(false);
                }
                C7177g.this.f40487z.getChildAt(firstVisiblePosition).setPressed(true);
                this.f40492k = firstVisiblePosition;
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: miuix.internal.widget.g$toq */
    /* JADX INFO: compiled from: ListPopup.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            FrameLayout frameLayout = C7177g.this.f40469h;
            if (frameLayout == null || !frameLayout.isAttachedToWindow()) {
                return;
            }
            C7177g.this.zp(C7177g.this.f40465d != null ? (View) C7177g.this.f40465d.get() : null);
            if (C7177g.this.f40487z == null || C7177g.this.f40462a.f87825toq == C7177g.this.f40487z.getHeight() || C7177g.this.f40487z == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams = C7177g.this.f40487z.getLayoutParams();
            layoutParams.height = C7177g.this.f40462a.f87825toq;
            C7177g.this.f40487z.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: miuix.internal.widget.g$zy */
    /* JADX INFO: compiled from: ListPopup.java */
    class zy implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: k */
        private int f40495k = -1;

        zy() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            int measuredHeight = C7177g.this.f40470i.getMeasuredHeight();
            int i10 = this.f40495k;
            if (i10 == -1 || i10 != measuredHeight) {
                boolean zHyr = true;
                if (C7177g.this.f40487z.getAdapter() != null) {
                    View viewLvui = C7177g.this.lvui();
                    C7177g c7177g = C7177g.this;
                    if (viewLvui == null) {
                        viewLvui = view.getRootView();
                    }
                    View viewM26030r = c7177g.m26030r(viewLvui);
                    Rect rect = new Rect();
                    n7h.m25961y(viewM26030r, rect);
                    zHyr = C7177g.this.hyr(i5 - i3, rect);
                }
                C7177g.this.f40470i.setEnabled(zHyr);
                C7177g.this.f40487z.setVerticalScrollBarEnabled(zHyr);
                this.f40495k = measuredHeight;
            }
        }
    }

    public C7177g(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: a */
    private void m26026a(View view, Rect rect) {
        view.getLocationInWindow(new int[2]);
        Rect rect2 = new Rect();
        n7h.m25961y(view, rect2);
        int iA9 = a9(rect2, rect);
        int iWvg = wvg(view.getLayoutDirection(), rect2, rect);
        int width = getWidth() > 0 ? getWidth() : this.f40462a.f40488k;
        int height = getHeight() > 0 ? getHeight() : this.f40462a.f87825toq;
        Rect rect3 = new Rect();
        rect3.set(0, 0, width, height);
        Log.d("ListPopup", "showWithAnchor getWidth " + getWidth() + " getHeight " + getHeight());
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f40473l, view.getLayoutDirection());
        int i2 = absoluteGravity & 112;
        if ((absoluteGravity & 7) == 5) {
            rect3.offsetTo((rect2.right + iWvg) - rect3.width(), rect2.bottom + iA9);
        } else {
            rect3.offsetTo(rect2.left + iWvg, rect2.bottom + iA9);
        }
        int i3 = 48;
        if (Math.abs(rect3.centerY() - rect2.centerY()) <= 10 ? i2 == 80 : rect3.centerY() <= rect2.centerY()) {
            i3 = 80;
        }
        if (Math.abs(rect3.centerX() - rect2.centerX()) > 10) {
            i3 = rect3.centerX() > rect2.centerX() ? i3 | 3 : i3 | 5;
        }
        int i4 = this.f40467f;
        if (i4 != -1) {
            hb(i4);
        } else {
            hb(i3);
        }
        if (!isShowing()) {
            HapticCompat.m26766g(view, C7385p.f92242jp0y, C7385p.f42272h);
        }
        showAsDropDown(view, iWvg, iA9, this.f40473l);
        fti(this.f40469h.getRootView());
    }

    private int a9(Rect rect, Rect rect2) {
        int i2 = this.f40468g ? this.f40478q : ((-rect.height()) - this.f40486y.top) + this.f40478q;
        int iJp0y = jp0y(rect2);
        int iMin = iJp0y > 0 ? Math.min(this.f40462a.f87825toq, iJp0y) : this.f40462a.f87825toq;
        int i3 = rect2.bottom;
        Rect rect3 = this.f40474m;
        int i4 = (i3 - rect3.top) - rect.bottom;
        int i5 = (rect.top - rect3.bottom) - rect2.top;
        if (iMin + i2 > i4) {
            if (i4 < i5) {
                iHeight = (this.f40468g ? rect.height() : 0) + iMin;
            } else if (this.f40468g) {
                iHeight = rect.height();
            }
            i2 -= iHeight;
        }
        int i6 = rect.bottom + i2;
        int i7 = rect2.top;
        int i8 = this.f40474m.top;
        if (i6 < i7 + i8) {
            int i9 = (i7 + i8) - i6;
            setHeight(iMin - i9);
            i2 += i9;
        }
        int i10 = i6 + iMin;
        int i11 = rect2.bottom;
        int i12 = this.f40474m.bottom;
        if (i10 > i11 - i12) {
            setHeight(iMin - (i10 - (i11 - i12)));
        }
        return i2;
    }

    private boolean a98o() {
        return this.f40483v && (Build.VERSION.SDK_INT > 29 || !C7163k.m25944k(this.f40477p));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m26027c() {
        PopupWindow.OnDismissListener onDismissListener = this.f87824bo;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void eqxt(Configuration configuration) {
        this.f40469h.post(new toq());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m26028f(View view) {
        dismiss();
    }

    public static void fti(View view) {
        WindowManager.LayoutParams layoutParams;
        if (view == null || (layoutParams = (WindowManager.LayoutParams) view.getLayoutParams()) == null) {
            return;
        }
        layoutParams.flags |= 2;
        layoutParams.dimAmount = bv;
        ((WindowManager) view.getContext().getSystemService("window")).updateViewLayout(view, layoutParams);
    }

    private void hb(int i2) {
        int i3 = toq.cdj.f34730z;
        if (i2 == 51) {
            i3 = toq.cdj.f75271mcp;
        } else if (i2 == 83) {
            i3 = toq.cdj.f34724t;
        } else if (i2 == 53) {
            i3 = toq.cdj.f75168a9;
        } else if (i2 == 85) {
            i3 = toq.cdj.f75242jk;
        } else if (i2 == 48) {
            i3 = toq.cdj.f75216fti;
        } else if (i2 == 80) {
            i3 = toq.cdj.f75289o1t;
        } else if (i2 == 17) {
            i3 = toq.cdj.f75341wvg;
        }
        setAnimationStyle(i3);
    }

    private int jk(Rect rect, Rect rect2) {
        boolean z2;
        int i2;
        int i3 = rect.right;
        boolean z3 = this.f40475n;
        int i4 = ((z3 ? this.f40472k : 0) + i3) - this.f40462a.f40488k;
        int i5 = rect2.left;
        Rect rect3 = this.f40474m;
        int i6 = rect3.left;
        if (i4 < i5 + i6) {
            i2 = (i5 + i6) - i4;
            z2 = true;
        } else {
            z2 = false;
            i2 = 0;
        }
        if (z2) {
            return i2;
        }
        int i7 = z3 ? this.f40472k : 0;
        int i8 = i3 + i7;
        int i9 = rect2.right;
        int i10 = rect3.right;
        int i11 = i8 > i9 - i10 ? (i9 - i10) - i8 : i7;
        return i11 != 0 ? i11 + this.f40486y.right : i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lrht(AdapterView adapterView, View view, int i2, long j2) {
        int headerViewsCount = i2 - this.f40487z.getHeaderViewsCount();
        if (this.f40479r == null || headerViewsCount < 0 || headerViewsCount >= this.f40481t.getCount()) {
            return;
        }
        this.f40479r.onItemClick(adapterView, view, headerViewsCount, j2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public View lvui() {
        WeakReference<View> weakReference = this.f40465d;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    private int mcp(Rect rect, Rect rect2) {
        boolean z2;
        int i2;
        int i3 = rect.left;
        boolean z3 = this.f40475n;
        int i4 = (z3 ? this.f40472k : 0) + i3 + this.f40462a.f40488k;
        int i5 = rect2.right;
        Rect rect3 = this.f40474m;
        int i6 = rect3.right;
        if (i4 > i5 - i6) {
            i2 = (i5 - i6) - i4;
            z2 = true;
        } else {
            z2 = false;
            i2 = 0;
        }
        if (z2) {
            return i2;
        }
        int i7 = z3 ? this.f40472k : 0;
        int i8 = i3 + i7;
        int i9 = rect2.left;
        int i10 = rect3.left;
        int i11 = i8 < i9 + i10 ? (i9 + i10) - i8 : i7;
        return i11 != 0 ? i11 - this.f40486y.left : i11;
    }

    private Rect n5r1(@lvui View view) {
        Rect rect = new Rect();
        View rootView = view.getRootView();
        if (rootView != null) {
            view = rootView;
        }
        view.getWindowVisibleDisplayFrame(rect);
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public View m26030r(@lvui View view) {
        View view2 = this.f40480s.get();
        return view2 != null ? view2 : view.getRootView();
    }

    /* JADX INFO: renamed from: t */
    private int m26031t(Rect rect, Rect rect2) {
        int i2;
        int iCenterX = rect.centerX();
        int i3 = rect.left;
        int i4 = this.f40462a.f40488k;
        int i5 = i3 + i4;
        int i6 = (i4 / 2) + i3;
        int i7 = rect2.right;
        Rect rect3 = this.f40474m;
        int i8 = rect3.right;
        boolean z2 = false;
        if (i5 > i7 - i8) {
            z2 = true;
            i2 = (i7 - i8) - i5;
        } else {
            i2 = 0;
        }
        if (z2) {
            return i2;
        }
        int i9 = iCenterX - i6;
        return i3 + i9 >= rect2.left + rect3.left ? i9 : i2;
    }

    private void uv6(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i3 = 0;
        int i4 = 0;
        int measuredHeight = 0;
        View view = null;
        for (int i5 = 0; i5 < count; i5++) {
            int itemViewType = listAdapter.getItemViewType(i5);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i5, view, viewGroup);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            measuredHeight += view.getMeasuredHeight();
            if (!this.f40462a.f87826zy) {
                int measuredWidth = view.getMeasuredWidth();
                if (measuredWidth >= i2) {
                    this.f40462a.m26042k(i2);
                } else if (measuredWidth > i4) {
                    i4 = measuredWidth;
                }
            }
        }
        f7l8 f7l8Var = this.f40462a;
        if (!f7l8Var.f87826zy) {
            f7l8Var.m26042k(i4);
        }
        this.f40462a.f87825toq = measuredHeight;
    }

    private int wvg(int i2, Rect rect, Rect rect2) {
        int absoluteGravity = Gravity.getAbsoluteGravity(this.f40473l, i2) & 7;
        return absoluteGravity != 1 ? absoluteGravity != 5 ? mcp(rect, rect2) : jk(rect, rect2) : m26031t(rect, rect2);
    }

    /* JADX INFO: renamed from: x */
    private void m26032x(View view, Rect rect, Rect rect2) {
        DisplayCutout displayCutout;
        int i2 = Build.VERSION.SDK_INT;
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets != null) {
            if (i2 >= 30) {
                Insets insets = rootWindowInsets.getInsets(WindowInsets$Type.systemBars() | WindowInsets$Type.displayCutout());
                this.f40474m.set(insets.left, insets.top, insets.right, insets.bottom);
            } else {
                Rect rect3 = new Rect();
                if (i2 >= 28 && (displayCutout = rootWindowInsets.getDisplayCutout()) != null) {
                    rect3.set(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                }
                this.f40474m.set(Math.max(rect3.left, rootWindowInsets.getSystemWindowInsetLeft()), Math.max(rect3.top, rootWindowInsets.getSystemWindowInsetTop()), Math.max(rect3.right, rootWindowInsets.getSystemWindowInsetRight()), Math.max(rect3.bottom, rootWindowInsets.getSystemWindowInsetBottom()));
            }
        }
        Rect rect4 = this.f40474m;
        rect4.left = Math.max(this.f40476o, rect4.left - rect.left);
        Rect rect5 = this.f40474m;
        rect5.right = Math.max(this.f40476o, rect5.right - Math.max(0, rect2.width() - rect.right));
        Rect rect6 = this.f40474m;
        rect6.top = Math.max(0, rect6.top - rect.top);
        Rect rect7 = this.f40474m;
        rect7.bottom = Math.max(0, rect7.bottom - Math.max(0, rect2.height() - rect.bottom));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zp(View view) {
        if (view == null) {
            return;
        }
        View viewM26030r = m26030r(view);
        Rect rect = new Rect();
        n7h.m25961y(viewM26030r, rect);
        m26032x(viewM26030r, rect, n5r1(view));
        int iJp0y = jp0y(rect);
        int iOc = oc(rect);
        int i2 = this.f40462a.f87825toq;
        int i3 = (iJp0y <= 0 || i2 <= iJp0y) ? i2 : iJp0y;
        Rect rect2 = new Rect();
        n7h.m25961y(view, rect2);
        update(view, wvg(view.getLayoutDirection(), rect2, rect), a9(rect2, rect), iOc, i3);
    }

    /* JADX INFO: renamed from: b */
    public void m26034b(AdapterView.OnItemClickListener onItemClickListener) {
        this.f40479r = onItemClickListener;
    }

    protected void bf2(View view) {
        int i2 = Build.VERSION.SDK_INT;
        if (C7085q.cdj(this.f40477p)) {
            view.setOutlineProvider(null);
            return;
        }
        view.setOutlineProvider(new n());
        if (i2 >= 28) {
            view.setOutlineSpotShadowColor(this.f40477p.getColor(toq.C6050g.je1q));
        }
    }

    public void d2ok(@lvui View view, ViewGroup viewGroup) {
        View viewM26030r = m26030r(view);
        Rect rect = new Rect();
        n7h.m25961y(viewM26030r, rect);
        setWidth(oc(rect));
        int i2 = this.f40462a.f87825toq;
        int iJp0y = jp0y(rect);
        if (i2 > iJp0y) {
            i2 = iJp0y;
        }
        setHeight(i2);
        m26026a(view, rect);
    }

    protected int d3(Rect rect) {
        int i2 = this.f40466e;
        int iWidth = rect.width();
        Rect rect2 = this.f40474m;
        return Math.min(i2, (iWidth - rect2.left) - rect2.right);
    }

    public ListView dd() {
        return this.f40487z;
    }

    @Override // android.widget.PopupWindow
    public void dismiss() {
        super.dismiss();
        C7007y.m25247q(this.f40477p, this);
    }

    /* JADX INFO: renamed from: e */
    protected boolean m26035e(View view, ViewGroup viewGroup, Rect rect) {
        if (view == null) {
            Log.e(f87823ab, "show: anchor is null");
            return false;
        }
        Log.d("ListPopup", "prepareShow");
        if (this.f40470i == null) {
            View viewInflate = LayoutInflater.from(this.f40477p).inflate(toq.qrj.f76732mu, (ViewGroup) null);
            this.f40470i = viewInflate;
            viewInflate.addOnLayoutChangeListener(new zy());
        }
        if (this.f40469h.getChildCount() != 1 || this.f40469h.getChildAt(0) != this.f40470i) {
            this.f40469h.removeAllViews();
            this.f40469h.addView(this.f40470i);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40470i.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            layoutParams.gravity = 16;
        }
        if (a98o()) {
            setElevation(this.f40485x + this.f40482u);
        }
        ListView listView = (ListView) this.f40470i.findViewById(R.id.list);
        this.f40487z = listView;
        if (listView == null) {
            Log.e(f87823ab, "list not found");
            return false;
        }
        listView.setOnTouchListener(new q());
        this.f40487z.setOnItemClickListener(new AdapterView.OnItemClickListener() { // from class: miuix.internal.widget.toq
            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView adapterView, View view2, int i2, long j2) {
                this.f40504k.lrht(adapterView, view2, i2, j2);
            }
        });
        this.f40487z.setAdapter(this.f40481t);
        setWidth(oc(rect));
        int iJp0y = jp0y(rect);
        setHeight(iJp0y > 0 ? Math.min(this.f40462a.f87825toq, iJp0y) : -2);
        ((InputMethodManager) this.f40477p.getApplicationContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        return true;
    }

    public void ek5k(View view) {
        this.f40480s = new WeakReference<>(view);
    }

    protected int gvn7(Rect rect) {
        int i2 = this.f40464c;
        int iWidth = rect.width();
        Rect rect2 = this.f40474m;
        return Math.min(i2, (iWidth - rect2.left) - rect2.right);
    }

    protected boolean hyr(int i2, Rect rect) {
        int iJp0y = jp0y(rect);
        int i3 = this.f40462a.f87825toq;
        return i3 > i2 || i3 > iJp0y;
    }

    protected void i1(View view) {
        super.setContentView(view);
    }

    /* JADX INFO: renamed from: j */
    public void m26036j(int i2) {
        this.f40462a.f87825toq = i2;
    }

    protected int jp0y(Rect rect) {
        int i2 = this.f40471j;
        int iHeight = rect.height();
        Rect rect2 = this.f40474m;
        return Math.min(i2, (iHeight - rect2.top) - rect2.bottom);
    }

    /* JADX INFO: renamed from: k */
    public int m26037k() {
        return this.f40472k;
    }

    public void kja0(View view, ViewGroup viewGroup) {
        if (view == null) {
            return;
        }
        View viewM26030r = m26030r(view);
        Rect rect = new Rect();
        n7h.m25961y(viewM26030r, rect);
        m26032x(viewM26030r, rect, n5r1(view));
        if (m26035e(view, viewGroup, rect)) {
            m26026a(view, rect);
        }
    }

    /* JADX INFO: renamed from: l */
    public Rect m26038l() {
        return this.f40474m;
    }

    /* JADX INFO: renamed from: m */
    public void m26039m(int i2) {
        this.f40473l = i2;
    }

    /* JADX INFO: renamed from: n */
    public void m26040n(int i2) {
        this.f40478q = i2;
        this.f40468g = true;
    }

    public int ncyb() {
        return this.f40463b;
    }

    public void nn86(int i2) {
        this.f40467f = i2;
    }

    /* JADX INFO: renamed from: o */
    public void mo25461o(int i2) {
        this.f40462a.m26042k(i2);
    }

    protected int oc(Rect rect) {
        if (!this.f40462a.f87826zy) {
            uv6(this.f40481t, null, this.f40477p, gvn7(rect));
        }
        int iMax = Math.max(this.f40462a.f40488k, d3(rect));
        Rect rect2 = this.f40486y;
        int i2 = iMax + rect2.left + rect2.right;
        this.f40462a.m26042k(i2);
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public int m26041p() {
        return this.f40478q;
    }

    @Override // android.widget.PopupWindow
    public void setOnDismissListener(PopupWindow.OnDismissListener onDismissListener) {
        this.f87824bo = onDismissListener;
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i2, int i3, int i4) {
        super.showAsDropDown(view, i2, i3, i4);
        this.f40465d = new WeakReference<>(view);
        C7007y.m25246n(this.f40477p, this);
    }

    @Override // android.widget.PopupWindow
    public void showAtLocation(View view, int i2, int i3, int i4) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        int width = getWidth() > 0 ? getWidth() : this.f40462a.f40488k;
        int height = getHeight() > 0 ? getHeight() : this.f40462a.f87825toq;
        Rect rect2 = new Rect();
        rect2.set(i3, i4, width + i3, height + i4);
        Log.d("ListPopup", "showAtLocation getWidth " + getWidth() + " getHeight " + getHeight());
        int i5 = rect2.top > rect.centerY() ? 48 : rect2.bottom <= rect.centerY() ? 80 : 0;
        int i6 = rect2.left;
        int i7 = rect.left;
        if (i6 >= i7 && rect2.right > rect.right) {
            i5 |= 3;
        } else if (rect2.right <= rect.right && i6 < i7) {
            i5 |= 5;
        }
        if (i5 == 0 && rect.contains(rect2)) {
            i5 = 17;
        }
        int i8 = this.f40467f;
        if (i8 != -1) {
            hb(i8);
        } else {
            hb(i5);
        }
        super.showAtLocation(view, i2, i3, i4);
        C7007y.m25246n(this.f40477p, this);
    }

    public void toq(int i2) {
        this.f40472k = i2;
        this.f40475n = true;
    }

    @Override // android.widget.PopupWindow
    public void update(int i2, int i3, int i4, int i5, boolean z2) {
        Object objLvui = lvui();
        if ((objLvui instanceof ViewHoverListener) && ((ViewHoverListener) objLvui).isHover()) {
            LogUtils.debug("popupWindow update return", objLvui);
        } else {
            LogUtils.debug("popupWindow update execute", objLvui);
            super.update(i2, i3, i4, i5, z2);
        }
    }

    protected void vyq(Context context) {
        Drawable drawableM25952s = C7164n.m25952s(this.f40477p, toq.C6055q.qu9);
        if (drawableM25952s != null) {
            drawableM25952s.getPadding(this.f40486y);
            this.f40469h.setBackground(drawableM25952s);
        }
        setBackgroundDrawable(new ColorDrawable(0));
        i1(this.f40469h);
    }

    public void x2(ListAdapter listAdapter) {
        ListAdapter listAdapter2 = this.f40481t;
        if (listAdapter2 != null) {
            listAdapter2.unregisterDataSetObserver(this.f40484w);
        }
        this.f40481t = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f40484w);
        }
    }

    public int x9kr() {
        return this.f40476o;
    }

    public void y9n(int i2) {
        this.f40471j = i2;
    }

    public void yz(boolean z2) {
        this.f40483v = z2;
    }

    /* JADX INFO: renamed from: miuix.internal.widget.g$g */
    /* JADX INFO: compiled from: ListPopup.java */
    private class g extends SmoothFrameLayout2 {
        public g(@lvui Context context) {
            super(context);
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            C7177g.this.eqxt(configuration);
        }

        public g(@lvui Context context, @dd AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public g(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
        }
    }

    public C7177g(Context context, View view) {
        super(context);
        this.f40473l = 8388661;
        this.f40467f = -1;
        this.f40463b = 0;
        this.f40483v = true;
        this.f40484w = new k();
        this.f40477p = context;
        setHeight(-2);
        this.f40480s = new WeakReference<>(view);
        Resources resources = context.getResources();
        t8r t8rVarM25607s = C7085q.m25607s(this.f40477p);
        Log.d("ListPopup", "new windowInfo w " + t8rVarM25607s.f87381zy.x + " h " + t8rVarM25607s.f87381zy.y);
        this.f40476o = context.getResources().getDimensionPixelSize(toq.f7l8.f75527ula6);
        Rect rect = new Rect();
        this.f40474m = rect;
        int i2 = this.f40476o;
        rect.set(i2, i2, i2, i2);
        if (view != null) {
            Rect rect2 = new Rect();
            n7h.m25961y(view, rect2);
            Point point = t8rVarM25607s.f87381zy;
            m26032x(view, rect2, new Rect(0, 0, point.x, point.y));
        }
        int width = view != null ? view.getWidth() : t8rVarM25607s.f87381zy.x;
        int height = view != null ? view.getHeight() : t8rVarM25607s.f87381zy.y;
        this.f40464c = Math.min(width, resources.getDimensionPixelSize(toq.f7l8.mv));
        this.f40466e = Math.min(width, resources.getDimensionPixelSize(toq.f7l8.e9));
        this.f40471j = Math.min(height, resources.getDimensionPixelSize(toq.f7l8.dwra));
        int i3 = (int) (this.f40477p.getResources().getDisplayMetrics().density * 8.0f);
        this.f40472k = i3;
        this.f40478q = i3;
        this.f40486y = new Rect();
        this.f40462a = new f7l8(null);
        setFocusable(true);
        setOutsideTouchable(true);
        this.f40469h = new g(context);
        ((SmoothFrameLayout2) this.f40469h).setCornerRadius(context.getResources().getDimensionPixelSize(toq.f7l8.b972));
        this.f40469h.setOnClickListener(new View.OnClickListener() { // from class: miuix.internal.widget.zy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f40509k.m26028f(view2);
            }
        });
        vyq(context);
        setAnimationStyle(toq.cdj.f34730z);
        this.f40485x = C7164n.m25953y(this.f40477p, toq.C6055q.a5);
        super.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: miuix.internal.widget.q
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f40502k.m26027c();
            }
        });
        this.f40463b = context.getResources().getDimensionPixelSize(toq.f7l8.f75545wwp);
        this.f40482u = context.getResources().getDimensionPixelSize(toq.f7l8.td);
    }
}

package miuix.popupwidget.widget;

import android.R;
import android.content.Context;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.tfm;
import miuix.core.util.C7080i;

/* JADX INFO: renamed from: miuix.popupwidget.widget.y */
/* JADX INFO: compiled from: ListPopupWindow.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7267y {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final int f88065a9 = -2;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final String f88066d3 = "ListPopupWindow";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    private static final int f88067eqxt = 250;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final int f88068fti = 0;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final int f88069gvn7 = 2;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final int f88070jk = -1;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final int f88071jp0y = 1;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final int f88072mcp = 1;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final boolean f88073oc = false;

    /* JADX INFO: renamed from: t */
    public static final int f41086t = 0;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private View f88074cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private C7264k f88075f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private Drawable f88076fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private Runnable f88077fu4;

    /* JADX INFO: renamed from: g */
    private Context f41087g;

    /* JADX INFO: renamed from: h */
    private boolean f41088h;

    /* JADX INFO: renamed from: i */
    private View f41089i;

    /* JADX INFO: renamed from: k */
    private final y f41090k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f88078ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private boolean f88079kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f88080ld6;

    /* JADX INFO: renamed from: n */
    int f41091n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f88081n7h;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private AdapterView.OnItemSelectedListener f88082ni7;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private Rect f88083o1t;

    /* JADX INFO: renamed from: p */
    private int f41092p;

    /* JADX INFO: renamed from: q */
    private final q f41093q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f88084qrj;

    /* JADX INFO: renamed from: s */
    private zy f41094s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private DataSetObserver f88085t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final f7l8 f88086toq;

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private boolean f88087wvg;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f88088x2;

    /* JADX INFO: renamed from: y */
    private ListAdapter f41095y;

    /* JADX INFO: renamed from: z */
    private Handler f41096z;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private AdapterView.OnItemClickListener f88089zurt;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final g f88090zy;

    /* JADX INFO: renamed from: miuix.popupwidget.widget.y$f7l8 */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class f7l8 implements View.OnTouchListener {
        private f7l8() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int action = motionEvent.getAction();
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (action == 0 && C7267y.this.f88075f7l8 != null && C7267y.this.f88075f7l8.isShowing() && x3 >= 0 && x3 < C7267y.this.f88075f7l8.m26417n() && y3 >= 0 && y3 < C7267y.this.f88075f7l8.m26419q()) {
                C7267y.this.f41096z.postDelayed(C7267y.this.f41090k, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            C7267y.this.f41096z.removeCallbacks(C7267y.this.f41090k);
            return false;
        }

        /* synthetic */ f7l8(C7267y c7267y, k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.y$g */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class g implements AbsListView.OnScrollListener {
        private g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || C7267y.this.wvg() || C7267y.this.f88075f7l8.getContentView() == null) {
                return;
            }
            C7267y.this.f41096z.removeCallbacks(C7267y.this.f41090k);
            C7267y.this.f41090k.run();
        }

        /* synthetic */ g(C7267y c7267y, k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.y$k */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewM26447s = C7267y.this.m26447s();
            if (viewM26447s == null || viewM26447s.getWindowToken() == null) {
                return;
            }
            C7267y.this.m26443m();
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.y$n */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class n extends DataSetObserver {
        private n() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (C7267y.this.mcp()) {
                C7267y.this.m26443m();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            C7267y.this.m26449y(true);
        }

        /* synthetic */ n(C7267y c7267y, k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.y$q */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class q implements Runnable {
        private q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C7267y.this.m26438g();
        }

        /* synthetic */ q(C7267y c7267y, k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.y$toq */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    class toq implements AdapterView.OnItemSelectedListener {
        toq() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            zy zyVar;
            if (i2 == -1 || (zyVar = C7267y.this.f41094s) == null) {
                return;
            }
            zyVar.f41106k = false;
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.y$y */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class y implements Runnable {
        private y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C7267y.this.f41094s == null || C7267y.this.f41094s.getCount() <= C7267y.this.f41094s.getChildCount()) {
                return;
            }
            int childCount = C7267y.this.f41094s.getChildCount();
            C7267y c7267y = C7267y.this;
            if (childCount <= c7267y.f41091n) {
                c7267y.f88075f7l8.setInputMethodMode(2);
                C7267y.this.m26443m();
            }
        }

        /* synthetic */ y(C7267y c7267y, k kVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.y$zy */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    private static class zy extends ListView {

        /* JADX INFO: renamed from: g */
        static final int f41104g = -1;

        /* JADX INFO: renamed from: n */
        public static final int f41105n = -1;

        /* JADX INFO: renamed from: k */
        private boolean f41106k;

        /* JADX INFO: renamed from: q */
        private boolean f41107q;

        public zy(Context context, boolean z2) {
            super(context, null, R.attr.dropDownListViewStyle);
            this.f41107q = z2;
            setCacheColorHint(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public int zy(int i2, boolean z2) {
            int iMin;
            ListAdapter adapter = getAdapter();
            if (adapter != null && !isInTouchMode()) {
                int count = adapter.getCount();
                if (!getAdapter().areAllItemsEnabled()) {
                    if (z2) {
                        iMin = Math.max(0, i2);
                        while (iMin < count && !adapter.isEnabled(iMin)) {
                            iMin++;
                        }
                    } else {
                        iMin = Math.min(i2, count - 1);
                        while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                            iMin--;
                        }
                    }
                    if (iMin < 0 || iMin >= count) {
                        return -1;
                    }
                    return iMin;
                }
                if (i2 >= 0 && i2 < count) {
                    return i2;
                }
            }
            return -1;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean hasFocus() {
            return this.f41107q || super.hasFocus();
        }

        @Override // android.view.View
        public boolean hasWindowFocus() {
            return this.f41107q || super.hasWindowFocus();
        }

        @Override // android.view.View
        public boolean isFocused() {
            return this.f41107q || super.isFocused();
        }

        @Override // android.view.View
        public boolean isInTouchMode() {
            return (this.f41107q && this.f41106k) || super.isInTouchMode();
        }

        /* JADX INFO: renamed from: q */
        final int m26452q(int i2, int i3, int i4, int i5, int i6) {
            int listPaddingTop = getListPaddingTop();
            int listPaddingBottom = getListPaddingBottom();
            int dividerHeight = getDividerHeight();
            Drawable divider = getDivider();
            ListAdapter adapter = getAdapter();
            if (adapter == null) {
                return listPaddingTop + listPaddingBottom;
            }
            int measuredHeight = listPaddingTop + listPaddingBottom;
            if (dividerHeight <= 0 || divider == null) {
                dividerHeight = 0;
            }
            int count = adapter.getCount();
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            View view = null;
            while (i7 < count) {
                int itemViewType = adapter.getItemViewType(i7);
                if (itemViewType != i8) {
                    view = null;
                    i8 = itemViewType;
                }
                view = adapter.getView(i7, view, this);
                int i10 = view.getLayoutParams().height;
                view.measure(i2, i10 > 0 ? View.MeasureSpec.makeMeasureSpec(i10, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
                if (i7 > 0) {
                    measuredHeight += dividerHeight;
                }
                measuredHeight += view.getMeasuredHeight();
                if (measuredHeight >= i5) {
                    return (i6 < 0 || i7 <= i6 || i9 <= 0 || measuredHeight == i5) ? i5 : i9;
                }
                if (i6 >= 0 && i7 >= i6) {
                    i9 = measuredHeight;
                }
                i7++;
            }
            return measuredHeight;
        }
    }

    public C7267y(Context context) {
        this(context, null, R.attr.listPopupWindowStyle);
    }

    private void gvn7() {
        View view = this.f88074cdj;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f88074cdj);
            }
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: n */
    private int m26433n() {
        int measuredHeight;
        int iMakeMeasureSpec;
        View view;
        int i2 = 0;
        if (this.f41094s == null) {
            Context context = this.f41087g;
            this.f88077fu4 = new k();
            zy zyVar = new zy(context, !this.f88087wvg);
            this.f41094s = zyVar;
            Drawable drawable = this.f88076fn3e;
            if (drawable != null) {
                zyVar.setSelector(drawable);
            }
            this.f41094s.setAdapter(this.f41095y);
            this.f41094s.setOnItemClickListener(this.f88089zurt);
            this.f41094s.setFocusable(true);
            this.f41094s.setFocusableInTouchMode(true);
            this.f41094s.setOnItemSelectedListener(new toq());
            this.f41094s.setOnScrollListener(this.f88090zy);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f88082ni7;
            if (onItemSelectedListener != null) {
                this.f41094s.setOnItemSelectedListener(onItemSelectedListener);
            }
            zy zyVar2 = this.f41094s;
            View view2 = this.f88074cdj;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i3 = this.f88078ki;
                if (i3 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(zyVar2, layoutParams);
                } else if (i3 != 1) {
                    Log.e(f88066d3, "Invalid hint position " + this.f88078ki);
                } else {
                    linearLayout.addView(zyVar2, layoutParams);
                    linearLayout.addView(view2);
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(this.f88080ld6, Integer.MIN_VALUE), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = zyVar2;
            }
            this.f88075f7l8.setContentView(view);
        } else {
            View view3 = this.f88074cdj;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f88075f7l8.getBackground();
        if (background != null) {
            background.getPadding(this.f88083o1t);
            Rect rect = this.f88083o1t;
            int i4 = rect.top;
            i2 = rect.bottom + i4;
            if (!this.f88081n7h) {
                this.f88084qrj = -i4;
            }
        } else {
            this.f88083o1t.setEmpty();
        }
        int iM26439h = m26439h(m26447s(), this.f88084qrj);
        if (this.f88079kja0 || this.f41092p == -1) {
            return iM26439h + i2;
        }
        int i5 = this.f88080ld6;
        if (i5 == -2) {
            int i6 = this.f41087g.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f88083o1t;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i6 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i5 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i5, 1073741824);
        } else {
            int i7 = this.f41087g.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f88083o1t;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7 - (rect3.left + rect3.right), 1073741824);
        }
        int iM26452q = this.f41094s.m26452q(iMakeMeasureSpec, 0, -1, iM26439h - measuredHeight, -1);
        if (iM26452q > 0) {
            measuredHeight += i2;
        }
        return iM26452q + measuredHeight;
    }

    public boolean a9(int i2, KeyEvent keyEvent) {
        if (!mcp() || this.f41094s.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.f41094s.onKeyUp(i2, keyEvent);
        if (zOnKeyUp && (i2 == 23 || i2 == 66)) {
            m26449y(true);
        }
        return zOnKeyUp;
    }

    /* JADX INFO: renamed from: c */
    public void m26435c(PopupWindow.OnDismissListener onDismissListener) {
        this.f88075f7l8.setOnDismissListener(onDismissListener);
    }

    public C7264k cdj() {
        return this.f88075f7l8;
    }

    public void d2ok(Drawable drawable) {
        this.f88075f7l8.setBackgroundDrawable(drawable);
    }

    public void d3(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f88085t8r;
        if (dataSetObserver == null) {
            this.f88085t8r = new n(this, null);
        } else {
            ListAdapter listAdapter2 = this.f41095y;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f41095y = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f88085t8r);
        }
        zy zyVar = this.f41094s;
        if (zyVar != null) {
            zyVar.setAdapter(this.f41095y);
        }
    }

    public void dd(boolean z2) {
        this.f41088h = z2;
    }

    /* JADX INFO: renamed from: e */
    public void m26436e(View view) {
        boolean zMcp = mcp();
        if (zMcp) {
            gvn7();
        }
        this.f88074cdj = view;
        if (zMcp) {
            m26443m();
        }
    }

    public void eqxt(int i2) {
        this.f88075f7l8.setAnimationStyle(i2);
    }

    /* JADX INFO: renamed from: f */
    public void m26437f(boolean z2) {
        this.f88087wvg = true;
        this.f88075f7l8.setFocusable(z2);
    }

    public void f7l8() {
        m26449y(true);
    }

    public int fn3e() {
        if (mcp()) {
            return this.f41094s.getSelectedItemPosition();
        }
        return -1;
    }

    public boolean fti(int i2) {
        if (!mcp()) {
            return false;
        }
        if (this.f88089zurt == null) {
            return true;
        }
        zy zyVar = this.f41094s;
        this.f88089zurt.onItemClick(zyVar, zyVar.getChildAt(i2 - zyVar.getFirstVisiblePosition()), i2, zyVar.getAdapter().getItemId(i2));
        return true;
    }

    public int fu4() {
        if (this.f88081n7h) {
            return this.f88084qrj;
        }
        return 0;
    }

    /* JADX INFO: renamed from: g */
    public void m26438g() {
        zy zyVar = this.f41094s;
        if (zyVar != null) {
            zyVar.f41106k = true;
            zyVar.requestLayout();
        }
    }

    /* JADX INFO: renamed from: h */
    public int m26439h(View view, int i2) {
        Rect rect = new Rect();
        view.getWindowVisibleDisplayFrame(rect);
        int i3 = C7080i.qrj(this.f41087g).y;
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        int iM26420s = this.f88075f7l8.m26420s(((i3 - (rootWindowInsets != null ? tfm.eqxt(rootWindowInsets).m3466g(tfm.qrj.m3498s() | tfm.qrj.zy()).f3601q : 0)) - (iArr[1] + view.getHeight())) - i2, (iArr[1] - rect.top) + i2);
        if (this.f88075f7l8.getBackground() == null) {
            return iM26420s;
        }
        this.f88075f7l8.getBackground().getPadding(this.f88083o1t);
        Rect rect2 = this.f88083o1t;
        return iM26420s - (rect2.top + rect2.bottom);
    }

    public void hb(int i2) {
        this.f88075f7l8.setSoftInputMode(i2);
    }

    public void hyr(Drawable drawable) {
        this.f88076fn3e = drawable;
    }

    /* JADX INFO: renamed from: i */
    public long m26440i() {
        if (mcp()) {
            return this.f41094s.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    /* JADX INFO: renamed from: j */
    public void m26441j(int i2) {
        this.f88084qrj = i2;
        this.f88081n7h = true;
    }

    public boolean jk(int i2, KeyEvent keyEvent) {
        if (mcp() && i2 != 62 && (this.f41094s.getSelectedItemPosition() >= 0 || (i2 != 66 && i2 != 23))) {
            int selectedItemPosition = this.f41094s.getSelectedItemPosition();
            boolean z2 = !this.f88075f7l8.isAboveAnchor();
            ListAdapter listAdapter = this.f41095y;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                int iZy = zAreAllItemsEnabled ? 0 : this.f41094s.zy(0, true);
                int count = zAreAllItemsEnabled ? listAdapter.getCount() - 1 : this.f41094s.zy(listAdapter.getCount() - 1, false);
                i3 = iZy;
                i4 = count;
            }
            if ((z2 && i2 == 19 && selectedItemPosition <= i3) || (!z2 && i2 == 20 && selectedItemPosition >= i4)) {
                m26438g();
                this.f88075f7l8.setInputMethodMode(1);
                m26443m();
                return true;
            }
            this.f41094s.f41106k = false;
            if (this.f41094s.onKeyDown(i2, keyEvent)) {
                this.f88075f7l8.setInputMethodMode(2);
                this.f41094s.requestFocusFromTouch();
                m26443m();
                if (i2 == 19 || i2 == 20 || i2 == 23 || i2 == 66) {
                    return true;
                }
            } else if (z2 && i2 == 20) {
                if (selectedItemPosition == i4) {
                    return true;
                }
            } else if (!z2 && i2 == 19 && selectedItemPosition == i3) {
                return true;
            }
        }
        return false;
    }

    public void jp0y() {
        this.f41096z.post(this.f88077fu4);
    }

    public int ki() {
        return this.f88078ki;
    }

    public ListView kja0() {
        return this.f41094s;
    }

    /* JADX INFO: renamed from: l */
    public void m26442l(int i2) {
        this.f88075f7l8.setInputMethodMode(i2);
    }

    public Drawable ld6() {
        return this.f88075f7l8.getBackground();
    }

    public void lrht(AdapterView.OnItemClickListener onItemClickListener) {
        this.f88089zurt = onItemClickListener;
    }

    public void lvui(int i2) {
        Drawable background = this.f88075f7l8.getBackground();
        if (background == null) {
            m26444o(i2);
            return;
        }
        background.getPadding(this.f88083o1t);
        Rect rect = this.f88083o1t;
        this.f88080ld6 = rect.left + rect.right + i2;
    }

    /* JADX INFO: renamed from: m */
    public void m26443m() {
        int iM26433n = m26433n();
        int i2 = this.f88080ld6;
        if (i2 != -1) {
            if (i2 == -2) {
                this.f88075f7l8.ki(m26447s().getWidth());
            } else {
                this.f88075f7l8.ki(i2);
            }
        }
        int i3 = this.f41092p;
        if (i3 != -1) {
            if (i3 == -2) {
                this.f88075f7l8.kja0(iM26433n);
            } else {
                this.f88075f7l8.kja0(i3);
            }
        }
        this.f88075f7l8.setFocusable(true);
        if (this.f88075f7l8.isShowing()) {
            this.f88075f7l8.setOutsideTouchable((this.f41088h || this.f88079kja0) ? false : true);
            this.f88075f7l8.update(m26447s(), this.f88088x2, this.f88084qrj, this.f88080ld6, iM26433n);
            return;
        }
        this.f88075f7l8.setWindowLayoutMode(-1, -1);
        this.f88075f7l8.setOutsideTouchable((this.f41088h || this.f88079kja0) ? false : true);
        this.f88075f7l8.setTouchInterceptor(this.f88086toq);
        this.f88075f7l8.mcp(m26447s(), this.f88088x2, this.f88084qrj);
        this.f41094s.setSelection(-1);
        if (!this.f88087wvg || this.f41094s.isInTouchMode()) {
            m26438g();
        }
        if (this.f88087wvg) {
            return;
        }
        this.f41096z.post(this.f41093q);
    }

    public boolean mcp() {
        return this.f88075f7l8.isShowing();
    }

    void n5r1(int i2) {
        this.f41091n = i2;
    }

    public int n7h() {
        return this.f88075f7l8.getInputMethodMode();
    }

    public void ncyb(int i2) {
        this.f88088x2 = i2;
    }

    public int ni7() {
        return this.f88075f7l8.getSoftInputMode();
    }

    public void nn86(int i2) {
        zy zyVar = this.f41094s;
        if (!mcp() || zyVar == null) {
            return;
        }
        zyVar.f41106k = false;
        zyVar.setSelection(i2);
        if (zyVar.getChoiceMode() != 0) {
            zyVar.setItemChecked(i2, true);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m26444o(int i2) {
        this.f88080ld6 = i2;
    }

    public boolean o1t() {
        return this.f88079kja0;
    }

    public void oc(View view) {
        this.f41089i = view;
    }

    /* JADX INFO: renamed from: p */
    public int m26445p() {
        return this.f88075f7l8.getAnimationStyle();
    }

    public int qrj() {
        return this.f88088x2;
    }

    /* JADX INFO: renamed from: r */
    public void m26446r(boolean z2) {
        this.f88079kja0 = z2;
    }

    /* JADX INFO: renamed from: s */
    public View m26447s() {
        return this.f41089i;
    }

    /* JADX INFO: renamed from: t */
    public boolean m26448t() {
        return this.f88087wvg;
    }

    public Object t8r() {
        if (mcp()) {
            return this.f41094s.getSelectedItem();
        }
        return null;
    }

    public void uv6(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f88082ni7 = onItemSelectedListener;
    }

    public void vyq(int i2) {
        this.f88078ki = i2;
    }

    public boolean wvg() {
        return this.f88075f7l8.getInputMethodMode() == 2;
    }

    public int x2() {
        return this.f41092p;
    }

    public void x9kr(int i2) {
        this.f41092p = i2;
    }

    /* JADX INFO: renamed from: y */
    public void m26449y(boolean z2) {
        this.f88075f7l8.m26416k(z2);
        gvn7();
        this.f41094s = null;
        this.f41096z.removeCallbacks(this.f41090k);
    }

    /* JADX INFO: renamed from: z */
    public int m26450z() {
        return this.f88080ld6;
    }

    public View zurt() {
        if (mcp()) {
            return this.f41094s.getSelectedView();
        }
        return null;
    }

    public C7267y(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.listPopupWindowStyle);
    }

    public C7267y(Context context, AttributeSet attributeSet, int i2) {
        k kVar = null;
        this.f41090k = new y(this, kVar);
        this.f88086toq = new f7l8(this, kVar);
        this.f88090zy = new g(this, kVar);
        this.f41093q = new q(this, kVar);
        this.f41091n = Integer.MAX_VALUE;
        this.f41092p = -2;
        this.f88080ld6 = -2;
        this.f88079kja0 = false;
        this.f41088h = false;
        this.f88078ki = 0;
        this.f41096z = new Handler();
        this.f88083o1t = new Rect();
        this.f41087g = context;
        this.f88075f7l8 = new C7264k(context, attributeSet, i2);
    }
}

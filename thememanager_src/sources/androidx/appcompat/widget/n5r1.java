package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.C0683f;
import java.lang.reflect.Method;
import p030n.C7397k;
import zy.InterfaceC7828g;
import zy.uv6;

/* JADX INFO: compiled from: ListPopupWindow.java */
/* JADX INFO: loaded from: classes.dex */
public class n5r1 implements androidx.appcompat.view.menu.cdj {
    public static final int ac = -2;
    public static final int ad = 0;
    public static final int am = 1;
    private static Method as = null;
    public static final int ax = 1;
    public static final int ay = 2;
    private static Method az = null;
    public static final int ba = 0;
    private static Method bg = null;
    static final int bl = 250;
    public static final int bq = -1;
    private static final String id = "ListPopupWindow";
    private static final boolean in = false;

    /* JADX INFO: renamed from: a */
    private AdapterView.OnItemClickListener f1112a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    final Handler f46927ab;
    PopupWindow an;

    /* JADX INFO: renamed from: b */
    private Drawable f1113b;
    private final Rect bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final f7l8 f46928bo;
    private Rect bp;
    private boolean bv;

    /* JADX INFO: renamed from: c */
    int f1114c;

    /* JADX INFO: renamed from: d */
    private final RunnableC0210q f1115d;

    /* JADX INFO: renamed from: e */
    private View f1116e;

    /* JADX INFO: renamed from: f */
    private boolean f1117f;

    /* JADX INFO: renamed from: g */
    private int f1118g;

    /* JADX INFO: renamed from: h */
    private int f1119h;

    /* JADX INFO: renamed from: i */
    private boolean f1120i;

    /* JADX INFO: renamed from: j */
    private int f1121j;

    /* JADX INFO: renamed from: k */
    private Context f1122k;

    /* JADX INFO: renamed from: l */
    private boolean f1123l;

    /* JADX INFO: renamed from: m */
    private View f1124m;

    /* JADX INFO: renamed from: n */
    d2ok f1125n;

    /* JADX INFO: renamed from: o */
    private DataSetObserver f1126o;

    /* JADX INFO: renamed from: p */
    private int f1127p;

    /* JADX INFO: renamed from: q */
    private ListAdapter f1128q;

    /* JADX INFO: renamed from: r */
    private int f1129r;

    /* JADX INFO: renamed from: s */
    private int f1130s;

    /* JADX INFO: renamed from: t */
    private boolean f1131t;

    /* JADX INFO: renamed from: u */
    final RunnableC0211y f1132u;

    /* JADX INFO: renamed from: v */
    private final C0207g f1133v;

    /* JADX INFO: renamed from: w */
    private Runnable f1134w;

    /* JADX INFO: renamed from: x */
    private AdapterView.OnItemSelectedListener f1135x;

    /* JADX INFO: renamed from: y */
    private int f1136y;

    /* JADX INFO: renamed from: z */
    private boolean f1137z;

    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class f7l8 implements View.OnTouchListener {
        f7l8() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = n5r1.this.an) != null && popupWindow.isShowing() && x3 >= 0 && x3 < n5r1.this.an.getWidth() && y3 >= 0 && y3 < n5r1.this.an.getHeight()) {
                n5r1 n5r1Var = n5r1.this;
                n5r1Var.f46927ab.postDelayed(n5r1Var.f1132u, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            n5r1 n5r1Var2 = n5r1.this;
            n5r1Var2.f46927ab.removeCallbacks(n5r1Var2.f1132u);
            return false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.n5r1$g */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class C0207g implements AbsListView.OnScrollListener {
        C0207g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i2, int i3, int i4) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i2) {
            if (i2 != 1 || n5r1.this.gvn7() || n5r1.this.an.getContentView() == null) {
                return;
            }
            n5r1 n5r1Var = n5r1.this;
            n5r1Var.f46927ab.removeCallbacks(n5r1Var.f1132u);
            n5r1.this.f1132u.run();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.n5r1$k */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    class C0208k extends dd {
        C0208k(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.dd
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public n5r1 toq() {
            return n5r1.this;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.n5r1$n */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class C0209n extends DataSetObserver {
        C0209n() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (n5r1.this.isShowing()) {
                n5r1.this.mo318g();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            n5r1.this.dismiss();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.n5r1$q */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class RunnableC0210q implements Runnable {
        RunnableC0210q() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n5r1.this.m668h();
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT8r = n5r1.this.t8r();
            if (viewT8r == null || viewT8r.getWindowToken() == null) {
                return;
            }
            n5r1.this.mo318g();
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.n5r1$y */
    /* JADX INFO: compiled from: ListPopupWindow.java */
    private class RunnableC0211y implements Runnable {
        RunnableC0211y() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d2ok d2okVar = n5r1.this.f1125n;
            if (d2okVar == null || !C0683f.zsr0(d2okVar) || n5r1.this.f1125n.getCount() <= n5r1.this.f1125n.getChildCount()) {
                return;
            }
            int childCount = n5r1.this.f1125n.getChildCount();
            n5r1 n5r1Var = n5r1.this;
            if (childCount <= n5r1Var.f1114c) {
                n5r1Var.an.setInputMethodMode(2);
                n5r1.this.mo318g();
            }
        }
    }

    /* JADX INFO: compiled from: ListPopupWindow.java */
    class zy implements AdapterView.OnItemSelectedListener {
        zy() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j2) {
            d2ok d2okVar;
            if (i2 == -1 || (d2okVar = n5r1.this.f1125n) == null) {
                return;
            }
            d2okVar.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                as = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i(id, "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                az = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i(id, "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public n5r1(@zy.lvui Context context) {
        this(context, null, C7397k.toq.f92883ix);
    }

    private void dd() {
        View view = this.f1116e;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f1116e);
            }
        }
    }

    private void ek5k(boolean z2) {
        if (Build.VERSION.SDK_INT > 28) {
            this.an.setIsClippedToScreen(z2);
            return;
        }
        Method method = as;
        if (method != null) {
            try {
                method.invoke(this.an, Boolean.valueOf(z2));
            } catch (Exception unused) {
                Log.i(id, "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    private static boolean fti(int i2) {
        return i2 == 66 || i2 == 23;
    }

    private int fu4(View view, int i2, boolean z2) {
        return this.an.getMaxAvailableHeight(view, i2, z2);
    }

    private int kja0() {
        int measuredHeight;
        int i2;
        int iMakeMeasureSpec;
        View view;
        int i3;
        if (this.f1125n == null) {
            Context context = this.f1122k;
            this.f1134w = new toq();
            d2ok d2okVarKi = ki(context, !this.bv);
            this.f1125n = d2okVarKi;
            Drawable drawable = this.f1113b;
            if (drawable != null) {
                d2okVarKi.setSelector(drawable);
            }
            this.f1125n.setAdapter(this.f1128q);
            this.f1125n.setOnItemClickListener(this.f1112a);
            this.f1125n.setFocusable(true);
            this.f1125n.setFocusableInTouchMode(true);
            this.f1125n.setOnItemSelectedListener(new zy());
            this.f1125n.setOnScrollListener(this.f1133v);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1135x;
            if (onItemSelectedListener != null) {
                this.f1125n.setOnItemSelectedListener(onItemSelectedListener);
            }
            d2ok d2okVar = this.f1125n;
            View view2 = this.f1116e;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i4 = this.f1121j;
                if (i4 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(d2okVar, layoutParams);
                } else if (i4 != 1) {
                    Log.e(id, "Invalid hint position " + this.f1121j);
                } else {
                    linearLayout.addView(d2okVar, layoutParams);
                    linearLayout.addView(view2);
                }
                int i5 = this.f1136y;
                if (i5 >= 0) {
                    i3 = Integer.MIN_VALUE;
                } else {
                    i5 = 0;
                    i3 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i5, i3), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = d2okVar;
            }
            this.an.setContentView(view);
        } else {
            View view3 = this.f1116e;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.an.getBackground();
        if (background != null) {
            background.getPadding(this.bb);
            Rect rect = this.bb;
            int i6 = rect.top;
            i2 = rect.bottom + i6;
            if (!this.f1120i) {
                this.f1127p = -i6;
            }
        } else {
            this.bb.setEmpty();
            i2 = 0;
        }
        int iFu4 = fu4(t8r(), this.f1127p, this.an.getInputMethodMode() == 2);
        if (this.f1123l || this.f1118g == -1) {
            return iFu4 + i2;
        }
        int i7 = this.f1136y;
        if (i7 == -2) {
            int i8 = this.f1122k.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.bb;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i8 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i7 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i7, 1073741824);
        } else {
            int i9 = this.f1122k.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.bb;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i9 - (rect3.left + rect3.right), 1073741824);
        }
        int iMo473n = this.f1125n.mo473n(iMakeMeasureSpec, 0, -1, iFu4 - measuredHeight, -1);
        if (iMo473n > 0) {
            measuredHeight += i2 + this.f1125n.getPaddingTop() + this.f1125n.getPaddingBottom();
        }
        return iMo473n + measuredHeight;
    }

    public int a9() {
        return this.f1136y;
    }

    public void a98o(int i2) {
        this.f1119h = i2;
    }

    /* JADX INFO: renamed from: b */
    public void m664b(int i2) {
        d2ok d2okVar = this.f1125n;
        if (!isShowing() || d2okVar == null) {
            return;
        }
        d2okVar.setListSelectionHidden(false);
        d2okVar.setSelection(i2);
        if (d2okVar.getChoiceMode() != 0) {
            d2okVar.setItemChecked(i2, true);
        }
    }

    public void bf2(int i2) {
        this.an.setSoftInputMode(i2);
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: c */
    public void m665c(boolean z2) {
        this.f1117f = z2;
    }

    public View.OnTouchListener cdj(View view) {
        return new C0208k(view);
    }

    public boolean d2ok(int i2, @zy.lvui KeyEvent keyEvent) {
        if (!isShowing() || this.f1125n.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.f1125n.onKeyUp(i2, keyEvent);
        if (zOnKeyUp && fti(i2)) {
            dismiss();
        }
        return zOnKeyUp;
    }

    public boolean d3() {
        return this.bv;
    }

    @Override // androidx.appcompat.view.menu.cdj
    public void dismiss() {
        this.an.dismiss();
        dd();
        this.an.setContentView(null);
        this.f1125n = null;
        this.f46927ab.removeCallbacks(this.f1132u);
    }

    /* JADX INFO: renamed from: e */
    public void m666e(Drawable drawable) {
        this.f1113b = drawable;
    }

    public boolean eqxt(int i2, @zy.lvui KeyEvent keyEvent) {
        if (i2 != 4 || !isShowing()) {
            return false;
        }
        View view = this.f1124m;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m667f(@zy.dd Rect rect) {
        this.bp = rect != null ? new Rect(rect) : null;
    }

    @zy.dd
    public Rect fn3e() {
        if (this.bp != null) {
            return new Rect(this.bp);
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.cdj
    /* JADX INFO: renamed from: g */
    public void mo318g() {
        int iKja0 = kja0();
        boolean zGvn7 = gvn7();
        androidx.core.widget.cdj.m3621q(this.an, this.f1119h);
        if (this.an.isShowing()) {
            if (C0683f.zsr0(t8r())) {
                int width = this.f1136y;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t8r().getWidth();
                }
                int i2 = this.f1118g;
                if (i2 == -1) {
                    if (!zGvn7) {
                        iKja0 = -1;
                    }
                    if (zGvn7) {
                        this.an.setWidth(this.f1136y == -1 ? -1 : 0);
                        this.an.setHeight(0);
                    } else {
                        this.an.setWidth(this.f1136y == -1 ? -1 : 0);
                        this.an.setHeight(-1);
                    }
                } else if (i2 != -2) {
                    iKja0 = i2;
                }
                this.an.setOutsideTouchable((this.f1117f || this.f1123l) ? false : true);
                this.an.update(t8r(), this.f1130s, this.f1127p, width < 0 ? -1 : width, iKja0 < 0 ? -1 : iKja0);
                return;
            }
            return;
        }
        int width2 = this.f1136y;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t8r().getWidth();
        }
        int i3 = this.f1118g;
        if (i3 == -1) {
            iKja0 = -1;
        } else if (i3 != -2) {
            iKja0 = i3;
        }
        this.an.setWidth(width2);
        this.an.setHeight(iKja0);
        ek5k(true);
        this.an.setOutsideTouchable((this.f1117f || this.f1123l) ? false : true);
        this.an.setTouchInterceptor(this.f46928bo);
        if (this.f1131t) {
            androidx.core.widget.cdj.zy(this.an, this.f1137z);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = az;
            if (method != null) {
                try {
                    method.invoke(this.an, this.bp);
                } catch (Exception e2) {
                    Log.e(id, "Could not invoke setEpicenterBounds on PopupWindow", e2);
                }
            }
        } else {
            this.an.setEpicenterBounds(this.bp);
        }
        androidx.core.widget.cdj.m3620n(this.an, t8r(), this.f1130s, this.f1127p, this.f1129r);
        this.f1125n.setSelection(-1);
        if (!this.bv || this.f1125n.isInTouchMode()) {
            m668h();
        }
        if (this.bv) {
            return;
        }
        this.f46927ab.post(this.f1115d);
    }

    @zy.dd
    public Drawable getBackground() {
        return this.an.getBackground();
    }

    public boolean gvn7() {
        return this.an.getInputMethodMode() == 2;
    }

    /* JADX INFO: renamed from: h */
    public void m668h() {
        d2ok d2okVar = this.f1125n;
        if (d2okVar != null) {
            d2okVar.setListSelectionHidden(true);
            d2okVar.requestLayout();
        }
    }

    public void hb(@zy.dd PopupWindow.OnDismissListener onDismissListener) {
        this.an.setOnDismissListener(onDismissListener);
    }

    public void hyr(int i2) {
        this.f1129r = i2;
    }

    @zy.hb
    /* JADX INFO: renamed from: i */
    public int m669i() {
        return this.an.getAnimationStyle();
    }

    public void i1(int i2) {
        this.f1136y = i2;
    }

    @Override // androidx.appcompat.view.menu.cdj
    public boolean isShowing() {
        return this.an.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void m670j(@zy.dd AdapterView.OnItemClickListener onItemClickListener) {
        this.f1112a = onItemClickListener;
    }

    public int jk() {
        return this.an.getSoftInputMode();
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public boolean jp0y() {
        return this.f1123l;
    }

    /* JADX INFO: renamed from: k */
    public int m671k() {
        return this.f1130s;
    }

    @zy.lvui
    d2ok ki(Context context, boolean z2) {
        return new d2ok(context, z2);
    }

    /* JADX INFO: renamed from: l */
    public void m672l(int i2) {
        Drawable background = this.an.getBackground();
        if (background == null) {
            i1(i2);
            return;
        }
        background.getPadding(this.bb);
        Rect rect = this.bb;
        this.f1136y = rect.left + rect.right + i2;
    }

    public void lrht(int i2) {
        if (i2 < 0 && -2 != i2 && -1 != i2) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f1118g = i2;
    }

    public boolean lvui(int i2) {
        if (!isShowing()) {
            return false;
        }
        if (this.f1112a == null) {
            return true;
        }
        d2ok d2okVar = this.f1125n;
        this.f1112a.onItemClick(d2okVar, d2okVar.getChildAt(i2 - d2okVar.getFirstVisiblePosition()), i2, d2okVar.getAdapter().getItemId(i2));
        return true;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: m */
    public void m673m(boolean z2) {
        this.f1131t = true;
        this.f1137z = z2;
    }

    @zy.dd
    public View mcp() {
        if (isShowing()) {
            return this.f1125n.getSelectedView();
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public void m674n(int i2) {
        this.f1127p = i2;
        this.f1120i = true;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public void n5r1(boolean z2) {
        this.f1123l = z2;
    }

    @Override // androidx.appcompat.view.menu.cdj
    @zy.dd
    public ListView n7h() {
        return this.f1125n;
    }

    public void ncyb(@zy.hb int i2) {
        this.an.setAnimationStyle(i2);
    }

    public int ni7() {
        return this.an.getInputMethodMode();
    }

    public void nn86(boolean z2) {
        this.bv = z2;
        this.an.setFocusable(z2);
    }

    /* JADX INFO: renamed from: o */
    public void m675o(@zy.dd AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.f1135x = onItemSelectedListener;
    }

    @zy.dd
    public Object o1t() {
        if (isShowing()) {
            return this.f1125n.getSelectedItem();
        }
        return null;
    }

    public boolean oc(int i2, @zy.lvui KeyEvent keyEvent) {
        if (isShowing() && i2 != 62 && (this.f1125n.getSelectedItemPosition() >= 0 || !fti(i2))) {
            int selectedItemPosition = this.f1125n.getSelectedItemPosition();
            boolean z2 = !this.an.isAboveAnchor();
            ListAdapter listAdapter = this.f1128q;
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                int iMo474q = zAreAllItemsEnabled ? 0 : this.f1125n.mo474q(0, true);
                int count = zAreAllItemsEnabled ? listAdapter.getCount() - 1 : this.f1125n.mo474q(listAdapter.getCount() - 1, false);
                i3 = iMo474q;
                i4 = count;
            }
            if ((z2 && i2 == 19 && selectedItemPosition <= i3) || (!z2 && i2 == 20 && selectedItemPosition >= i4)) {
                m668h();
                this.an.setInputMethodMode(1);
                mo318g();
                return true;
            }
            this.f1125n.setListSelectionHidden(false);
            if (this.f1125n.onKeyDown(i2, keyEvent)) {
                this.an.setInputMethodMode(2);
                this.f1125n.requestFocusFromTouch();
                mo318g();
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

    /* JADX INFO: renamed from: p */
    public int m676p() {
        if (this.f1120i) {
            return this.f1127p;
        }
        return 0;
    }

    /* JADX INFO: renamed from: r */
    public void m677r() {
        this.f46927ab.post(this.f1134w);
    }

    public void setBackgroundDrawable(@zy.dd Drawable drawable) {
        this.an.setBackgroundDrawable(drawable);
    }

    /* JADX INFO: renamed from: t */
    public int m678t() {
        if (isShowing()) {
            return this.f1125n.getSelectedItemPosition();
        }
        return -1;
    }

    @zy.dd
    public View t8r() {
        return this.f1124m;
    }

    public void toq(int i2) {
        this.f1130s = i2;
    }

    public void uv6(int i2) {
        this.an.setInputMethodMode(i2);
    }

    void vyq(int i2) {
        this.f1114c = i2;
    }

    public long wvg() {
        if (isShowing()) {
            return this.f1125n.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public void x2(@zy.dd ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f1126o;
        if (dataSetObserver == null) {
            this.f1126o = new C0209n();
        } else {
            ListAdapter listAdapter2 = this.f1128q;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f1128q = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f1126o);
        }
        d2ok d2okVar = this.f1125n;
        if (d2okVar != null) {
            d2okVar.setAdapter(this.f1128q);
        }
    }

    public void x9kr(@zy.dd View view) {
        this.f1124m = view;
    }

    public void y9n(@zy.dd View view) {
        boolean zIsShowing = isShowing();
        if (zIsShowing) {
            dd();
        }
        this.f1116e = view;
        if (zIsShowing) {
            mo318g();
        }
    }

    public void yz(int i2) {
        this.f1121j = i2;
    }

    /* JADX INFO: renamed from: z */
    public int m679z() {
        return this.f1121j;
    }

    public int zurt() {
        return this.f1118g;
    }

    public n5r1(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92883ix);
    }

    public n5r1(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, @InterfaceC7828g int i2) {
        this(context, attributeSet, i2, 0);
    }

    public n5r1(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, @InterfaceC7828g int i2, @zy.hb int i3) {
        this.f1118g = -2;
        this.f1136y = -2;
        this.f1119h = 1002;
        this.f1129r = 0;
        this.f1123l = false;
        this.f1117f = false;
        this.f1114c = Integer.MAX_VALUE;
        this.f1121j = 0;
        this.f1132u = new RunnableC0211y();
        this.f46928bo = new f7l8();
        this.f1133v = new C0207g();
        this.f1115d = new RunnableC0210q();
        this.bb = new Rect();
        this.f1122k = context;
        this.f46927ab = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7397k.qrj.d9i, i2, i3);
        this.f1130s = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7397k.qrj.ae4, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(C7397k.qrj.ie, 0);
        this.f1127p = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f1120i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C0194i c0194i = new C0194i(context, attributeSet, i2, i3);
        this.an = c0194i;
        c0194i.setInputMethodMode(1);
    }
}

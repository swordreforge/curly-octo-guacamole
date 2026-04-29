package miuix.popupwidget.widget;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Insets;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.DisplayCutout;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowInsets;
import android.view.WindowInsets$Type;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.core.view.C0683f;
import androidx.core.view.C0685g;
import androidx.core.view.tfm;
import c25.toq;
import java.util.Locale;
import miuix.core.util.C7080i;
import miuix.internal.util.C7162g;
import miuix.popupwidget.widget.zy;
import miuix.smooth.SmoothFrameLayout2;
import zy.lvui;

/* JADX INFO: compiled from: DropDownPopupWindow.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final String f88091o1t = "DropDownPopupWindow";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final float f88092wvg = 0.3f;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f88093cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private InterfaceC7275y f88094f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f88095fn3e;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private int f88096fu4;

    /* JADX INFO: renamed from: g */
    private View f41108g;

    /* JADX INFO: renamed from: h */
    private int f41109h;

    /* JADX INFO: renamed from: i */
    private int f41110i;

    /* JADX INFO: renamed from: k */
    private Context f41111k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f88097ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f88098kja0;

    /* JADX INFO: renamed from: n */
    private View f41112n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f88100n7h;

    /* JADX INFO: renamed from: q */
    private f7l8 f41114q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private boolean f88102qrj;

    /* JADX INFO: renamed from: s */
    private InterfaceC7274s f41115s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f88103t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private PopupWindow f88104toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private ValueAnimator f88105x2;

    /* JADX INFO: renamed from: y */
    private InterfaceC7268g f41116y;

    /* JADX INFO: renamed from: z */
    private int f41117z;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private View f88107zy;

    /* JADX INFO: renamed from: p */
    private int f41113p = 300;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f88099ld6 = 300;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private ValueAnimator.AnimatorUpdateListener f88106zurt = new C7269k();

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private Animator.AnimatorListener f88101ni7 = new toq();

    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    private class f7l8 extends SmoothFrameLayout2 {
        public f7l8(Context context, AttributeSet attributeSet, int i2) {
            super(context, attributeSet, i2);
            setCornerRadius(context.getResources().getDimension(toq.C1385g.f54405ij));
        }

        @Override // android.view.View
        protected void onConfigurationChanged(Configuration configuration) {
            super.onConfigurationChanged(configuration);
            zy.this.cdj(configuration);
        }

        @Override // android.view.View
        public boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 != 4 || keyEvent.getAction() != 1) {
                return false;
            }
            zy.this.ki();
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            if (!super.onTouchEvent(motionEvent) && motionEvent.getAction() == 1) {
                zy.this.ki();
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.zy$g */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    public interface InterfaceC7268g extends InterfaceC7274s {
        /* JADX INFO: renamed from: q */
        boolean mo26464q(View view, View view2);
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.zy$k */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    class C7269k implements ValueAnimator.AnimatorUpdateListener {
        C7269k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) zy.this.f88105x2.getAnimatedValue()).floatValue();
            if (zy.this.f41116y != null) {
                zy.this.f41116y.zy(zy.this.f41114q, fFloatValue);
            }
            if (zy.this.f88094f7l8 != null) {
                zy.this.f88094f7l8.zy(zy.this.f41112n, fFloatValue);
            }
        }
    }

    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    public static class ld6 extends x2 {

        /* JADX INFO: renamed from: q */
        private ListView f41120q;

        /* JADX INFO: renamed from: miuix.popupwidget.widget.zy$ld6$k */
        /* JADX INFO: compiled from: DropDownPopupWindow.java */
        class ViewOnTouchListenerC7270k implements View.OnTouchListener {

            /* JADX INFO: renamed from: k */
            int f41121k = -1;

            ViewOnTouchListenerC7270k() {
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
                        Log.e(zy.f88091o1t, "list onTouch error " + e2);
                    }
                }
            }

            @Override // android.view.View.OnTouchListener
            public boolean onTouch(final View view, MotionEvent motionEvent) {
                int firstVisiblePosition;
                int i2;
                int iPointToPosition = ld6.this.f41120q.pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 || action == 3 || action == 6) {
                        this.f41121k = -1;
                        ld6.this.f41120q.postDelayed(new Runnable() { // from class: miuix.popupwidget.widget.q
                            @Override // java.lang.Runnable
                            public final void run() {
                                zy.ld6.ViewOnTouchListenerC7270k.toq(view);
                            }
                        }, ViewConfiguration.getPressedStateDuration());
                    }
                } else if (iPointToPosition != -1 && (firstVisiblePosition = iPointToPosition - ld6.this.f41120q.getFirstVisiblePosition()) != (i2 = this.f41121k)) {
                    if (i2 != -1) {
                        ld6.this.f41120q.getChildAt(this.f41121k).setPressed(false);
                    }
                    ld6.this.f41120q.getChildAt(firstVisiblePosition).setPressed(true);
                    this.f41121k = firstVisiblePosition;
                }
                return false;
            }
        }

        public ld6(zy zyVar) {
            super(zyVar, toq.x2.f55336a9);
        }

        @Override // miuix.popupwidget.widget.zy.x2
        /* JADX INFO: renamed from: g */
        protected void mo26465g(View view) {
            ListView listView = (ListView) view.findViewById(R.id.list);
            this.f41120q = listView;
            listView.setOnTouchListener(new ViewOnTouchListenerC7270k());
        }

        /* JADX INFO: renamed from: y */
        public ListView m26466y() {
            m26469n();
            return this.f41120q;
        }

        public ld6(zy zyVar, int i2) {
            super(zyVar, i2);
        }

        public ld6(Context context) {
            this(context, toq.x2.f55336a9);
        }

        public ld6(Context context, int i2) {
            super(context, i2);
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.zy$n */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    class C7271n extends ViewOutlineProvider {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f41123k;

        C7271n(View view) {
            this.f41123k = view;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (view.getWidth() == 0 || view.getHeight() == 0) {
                return;
            }
            outline.setAlpha(0.7f);
            if (this.f41123k.getBackground() != null) {
                this.f41123k.getBackground().getOutline(outline);
            }
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.zy$p */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    public static class C7272p implements InterfaceC7268g {
        @Override // miuix.popupwidget.widget.zy.InterfaceC7274s
        /* JADX INFO: renamed from: k */
        public void mo26426k() {
        }

        @Override // miuix.popupwidget.widget.zy.InterfaceC7274s
        public void onDismiss() {
        }

        @Override // miuix.popupwidget.widget.zy.InterfaceC7268g
        /* JADX INFO: renamed from: q */
        public boolean mo26464q(View view, View view2) {
            return false;
        }

        @Override // miuix.popupwidget.widget.zy.InterfaceC7274s
        public void zy(View view, float f2) {
            Drawable background = view == null ? null : view.getBackground();
            if (background != null) {
                background.setAlpha((int) (f2 * 255.0f));
            }
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.zy$q */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    class ViewOnTouchListenerC7273q implements View.OnTouchListener {
        ViewOnTouchListenerC7273q() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            int x3 = (int) motionEvent.getX();
            int y3 = (int) motionEvent.getY();
            if (motionEvent.getAction() != 0) {
                return false;
            }
            if (x3 >= 0 && x3 < zy.this.f88107zy.getWidth() && y3 >= 0 && y3 < zy.this.f88107zy.getHeight()) {
                return false;
            }
            zy.this.ki();
            return true;
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.zy$s */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    public interface InterfaceC7274s {
        /* JADX INFO: renamed from: k */
        void mo26426k();

        void onDismiss();

        void zy(View view, float f2);
    }

    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    class toq implements Animator.AnimatorListener {
        toq() {
        }

        /* JADX INFO: renamed from: k */
        private void m26468k() {
            if (zy.this.f88102qrj) {
                zy.this.o1t();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m26468k();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m26468k();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (!zy.this.f88102qrj || zy.this.f41115s == null) {
                return;
            }
            zy.this.f41115s.onDismiss();
        }
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.zy$y */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    public interface InterfaceC7275y extends InterfaceC7274s {
        View toq();
    }

    /* JADX INFO: renamed from: miuix.popupwidget.widget.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    class ViewOnAttachStateChangeListenerC8107zy implements View.OnAttachStateChangeListener {
        ViewOnAttachStateChangeListenerC8107zy() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@lvui View view) {
            if (Build.VERSION.SDK_INT >= 28) {
                zy.this.n7h(zy.this.fn3e(view));
            }
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@lvui View view) {
        }
    }

    public zy(Context context, AttributeSet attributeSet, int i2) {
        this.f41111k = context;
        this.f88104toq = new PopupWindow(context, attributeSet, 0, i2);
        f7l8 f7l8Var = new f7l8(context, attributeSet, i2);
        this.f41114q = f7l8Var;
        f7l8Var.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC8107zy());
        this.f88104toq.setAnimationStyle(C7162g.m25943k() ? toq.n7h.f7518y : 0);
        ni7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cdj(Configuration configuration) {
        this.f41114q.post(new Runnable() { // from class: miuix.popupwidget.widget.toq
            @Override // java.lang.Runnable
            public final void run() {
                this.f41085k.fu4();
            }
        });
    }

    private void d3() {
        View view = this.f41108g;
        if (view == null || this.f41117z == 0) {
            return;
        }
        int height = view.getRootView().getHeight();
        int i2 = Build.VERSION.SDK_INT;
        WindowInsets rootWindowInsets = this.f41108g.getRootWindowInsets();
        if (rootWindowInsets != null) {
            if (i2 >= 30) {
                Insets insets = rootWindowInsets.getInsets(WindowInsets$Type.systemBars());
                this.f41110i = insets.top;
                this.f88103t8r = insets.bottom;
            } else {
                this.f41110i = rootWindowInsets.getSystemWindowInsetTop();
                this.f88103t8r = rootWindowInsets.getSystemWindowInsetBottom();
            }
        }
        this.f41109h = (height - this.f41110i) - this.f88103t8r;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Rect fn3e(View view) {
        Rect rect = new Rect();
        tfm tfmVarM3178x = C0683f.m3178x(view);
        if (tfmVarM3178x != null) {
            C0685g c0685gM3470n = tfmVarM3178x.m3470n();
            if (c0685gM3470n == null) {
                Activity activityT8r = t8r(view);
                if (activityT8r != null) {
                    int i2 = Build.VERSION.SDK_INT;
                    DisplayCutout cutout = i2 >= 29 ? activityT8r.getWindowManager().getDefaultDisplay().getCutout() : null;
                    if (cutout != null && i2 >= 28) {
                        rect.left = cutout.getSafeInsetLeft();
                        rect.right = cutout.getSafeInsetRight();
                    }
                }
                return rect;
            }
            rect.left = c0685gM3470n.m3281q();
            rect.right = c0685gM3470n.m3280n();
        }
        return rect;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void fu4() {
        zurt();
        n7h(fn3e(this.f41114q));
    }

    private void gvn7(float f2, float f3, int i2) {
        ValueAnimator valueAnimator = this.f88105x2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (this.f41116y == null && this.f88094f7l8 == null) {
            return;
        }
        ValueAnimator valueAnimator2 = this.f88105x2;
        if (valueAnimator2 == null) {
            this.f88105x2 = ValueAnimator.ofFloat(f2, f3);
        } else {
            valueAnimator2.setFloatValues(f2, f3);
        }
        this.f88105x2.setDuration(C7162g.m25943k() ? i2 : 0L);
        this.f88105x2.addUpdateListener(this.f88106zurt);
        this.f88105x2.addListener(this.f88101ni7);
        this.f88105x2.start();
    }

    /* JADX INFO: renamed from: h */
    private int[] m26454h(int i2, Rect rect) {
        int i3;
        int width;
        int i4;
        int i5;
        int[] iArr = new int[2];
        this.f41108g.getLocationInWindow(iArr);
        int i6 = this.f88098kja0;
        if (i2 > i6) {
            i2 = i6;
        }
        int i7 = iArr[1];
        if (i2 == i6) {
            i4 = rect.left;
            if (i4 <= 0) {
                i4 = this.f88097ki;
            }
        } else {
            if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) != 1) {
                width = this.f88093cdj;
                int i8 = iArr[0];
                int i9 = width - (i8 + i2);
                i3 = this.f88097ki;
                boolean z2 = i9 < i3;
                boolean z3 = i8 < i3;
                if (z3 || !z2) {
                    i4 = (z2 || !z3) ? i8 : i3;
                }
                i2 += i3;
                i4 = width - i2;
            } else {
                boolean z5 = (iArr[0] + this.f41108g.getWidth()) - i2 < this.f88097ki;
                int width2 = this.f88093cdj - (iArr[0] + this.f41108g.getWidth());
                i3 = this.f88097ki;
                boolean z6 = width2 < i3;
                if (z5 || !z6) {
                    if (z6 || !z5) {
                        width = iArr[0] + this.f41108g.getWidth();
                        i4 = width - i2;
                    }
                } else {
                    width = this.f88093cdj;
                    i2 += i3;
                    i4 = width - i2;
                }
            }
        }
        int i10 = this.f41117z;
        int i11 = this.f88096fu4;
        int i12 = (i10 - i7) - i11;
        int i13 = this.f88103t8r;
        if (i12 < i13 && (i7 = i7 - (i13 - ((i10 - i7) - i11))) < (i5 = this.f41110i)) {
            i7 = i5;
        }
        return new int[]{i4, i7};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n7h(Rect rect) {
        if (this.f41108g == null || this.f88107zy == null) {
            return;
        }
        oc(rect);
        d3();
        int width = this.f88104toq.getWidth();
        InterfaceC7275y interfaceC7275y = this.f88094f7l8;
        if (interfaceC7275y != null) {
            View qVar = interfaceC7275y.toq();
            this.f41112n = qVar;
            if (qVar != null) {
                width = fti(this.f41114q, qVar, this.f88095fn3e, this.f88100n7h, this.f41116y);
            }
        }
        int i2 = this.f88098kja0;
        if (width > i2) {
            width = i2;
        }
        int i3 = this.f88096fu4;
        int i4 = this.f41109h;
        if (i3 > i4) {
            this.f88104toq.setHeight(i4);
        } else {
            this.f88104toq.setHeight(-2);
        }
        this.f88104toq.setWidth(width);
        int height = this.f88104toq.getHeight();
        View view = this.f41108g;
        if (view != null && view.isAttachedToWindow()) {
            int[] iArrM26454h = m26454h(width, rect);
            this.f88104toq.update(iArrM26454h[0], iArrM26454h[1], width, height);
        } else if (this.f41114q.isAttachedToWindow()) {
            this.f88104toq.update(0, 0, width, height);
        }
    }

    private void ni7() {
        zurt();
        this.f88104toq.setWidth(-2);
        this.f88104toq.setHeight(-2);
        this.f88104toq.setSoftInputMode(3);
        this.f88104toq.setOutsideTouchable(false);
        this.f88104toq.setFocusable(true);
        this.f88104toq.setOutsideTouchable(true);
        this.f41114q.setFocusableInTouchMode(true);
        this.f88104toq.setContentView(this.f41114q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o1t() {
        PopupWindow popupWindow = this.f88104toq;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        InterfaceC7268g interfaceC7268g = this.f41116y;
        if (interfaceC7268g != null) {
            interfaceC7268g.onDismiss();
        }
        InterfaceC7275y interfaceC7275y = this.f88094f7l8;
        if (interfaceC7275y != null) {
            interfaceC7275y.onDismiss();
        }
        InterfaceC7274s interfaceC7274s = this.f41115s;
        if (interfaceC7274s != null) {
            interfaceC7274s.onDismiss();
        }
        this.f88102qrj = false;
    }

    private void oc(Rect rect) {
        int i2 = rect.left;
        if (i2 > 0) {
            this.f88098kja0 = (this.f88093cdj - i2) - this.f88097ki;
            return;
        }
        int i3 = rect.right;
        if (i3 > 0) {
            this.f88098kja0 = (this.f88093cdj - i3) - this.f88097ki;
        } else {
            this.f88098kja0 = this.f88093cdj - (this.f88097ki * 2);
        }
    }

    private Activity t8r(View view) {
        Context context = ((ViewGroup) view.getRootView()).getChildAt(0).getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        return null;
    }

    /* JADX INFO: renamed from: z */
    private int m26461z(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f88098kja0, Integer.MIN_VALUE);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = adapter.getCount();
        int measuredHeight = 0;
        int i2 = 0;
        int i3 = 0;
        View view = null;
        for (int i4 = 0; i4 < count; i4++) {
            int itemViewType = adapter.getItemViewType(i4);
            if (itemViewType != i3) {
                view = null;
                i3 = itemViewType;
            }
            view = adapter.getView(i4, view, listView);
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            measuredHeight += view.getMeasuredHeight();
            if (measuredWidth > i2) {
                i2 = measuredWidth;
            }
        }
        this.f88096fu4 = measuredHeight;
        return i2;
    }

    private void zurt() {
        this.f88095fn3e = this.f41111k.getResources().getDimensionPixelSize(toq.C1385g.f46176do);
        this.f88097ki = this.f41111k.getResources().getDimensionPixelSize(toq.C1385g.f54410jbh);
        this.f88100n7h = this.f41111k.getResources().getDimensionPixelSize(toq.C1385g.f54480ukdy);
        this.f88093cdj = C7080i.qrj(this.f41111k).x;
        this.f41117z = C7080i.qrj(this.f41111k).y;
    }

    public void a9(PopupWindow.OnDismissListener onDismissListener) {
        this.f88104toq.setOnDismissListener(onDismissListener);
    }

    public int fti(FrameLayout frameLayout, View view, int i2, int i3, InterfaceC7268g interfaceC7268g) {
        int measuredWidth;
        if (view == null) {
            return -2;
        }
        if (i2 > 0) {
            view.setElevation(i2);
        }
        int i4 = Build.VERSION.SDK_INT;
        view.setOutlineProvider(new C7271n(view));
        if (i4 >= 28) {
            view.setOutlineSpotShadowColor(this.f41111k.getColor(toq.C1387n.f54937xwq3));
        }
        if (view instanceof ListView) {
            measuredWidth = m26461z((ListView) view);
        } else {
            view.measure(0, 0);
            measuredWidth = view.getMeasuredWidth();
            this.f88096fu4 = view.getMeasuredHeight();
        }
        return measuredWidth < i3 ? i3 : measuredWidth;
    }

    /* JADX INFO: renamed from: i */
    public Context m26462i() {
        return this.f41111k;
    }

    public void jk(InterfaceC7274s interfaceC7274s) {
        this.f41115s = interfaceC7274s;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void jp0y() {
        /*
            r9 = this;
            android.widget.PopupWindow r0 = r9.f88104toq
            boolean r0 = r0.isShowing()
            r1 = 0
            if (r0 == 0) goto L1b
            android.view.View r0 = r9.f41108g
            if (r0 == 0) goto L14
            android.widget.PopupWindow r2 = r9.f88104toq
            r2.update(r0, r1, r1)
            goto Lb3
        L14:
            android.widget.PopupWindow r0 = r9.f88104toq
            r0.update(r1, r1)
            goto Lb3
        L1b:
            miuix.popupwidget.widget.zy$y r0 = r9.f88094f7l8
            r2 = -2
            if (r0 == 0) goto L36
            android.view.View r5 = r0.toq()
            r9.f41112n = r5
            if (r5 == 0) goto L36
            miuix.popupwidget.widget.zy$f7l8 r4 = r9.f41114q
            int r6 = r9.f88095fn3e
            int r7 = r9.f88100n7h
            miuix.popupwidget.widget.zy$g r8 = r9.f41116y
            r3 = r9
            int r0 = r3.fti(r4, r5, r6, r7, r8)
            goto L37
        L36:
            r0 = r2
        L37:
            int r3 = r9.f88098kja0
            if (r0 <= r3) goto L3c
            r0 = r3
        L3c:
            android.view.View r3 = r9.f41112n
            r9.f88107zy = r3
            android.widget.PopupWindow r3 = r9.f88104toq
            miuix.popupwidget.widget.zy$q r4 = new miuix.popupwidget.widget.zy$q
            r4.<init>()
            r3.setTouchInterceptor(r4)
            miuix.popupwidget.widget.zy$g r3 = r9.f41116y
            if (r3 == 0) goto L51
            r3.mo26426k()
        L51:
            android.widget.PopupWindow r3 = r9.f88104toq
            r3.setWidth(r0)
            android.widget.PopupWindow r3 = r9.f88104toq
            r3.setHeight(r2)
            android.widget.PopupWindow r3 = r9.f88104toq
            android.view.View r4 = r9.f88107zy
            if (r4 != 0) goto L63
            r4 = 0
            goto L67
        L63:
            float r4 = r4.getElevation()
        L67:
            r3.setElevation(r4)
            miuix.popupwidget.widget.zy$f7l8 r3 = r9.f41114q
            r3.removeAllViews()
            miuix.popupwidget.widget.zy$f7l8 r3 = r9.f41114q
            android.view.View r4 = r9.f88107zy
            r3.addView(r4)
            android.view.View r3 = r9.f41108g
            if (r3 == 0) goto L9e
            boolean r3 = r3.isAttachedToWindow()
            if (r3 == 0) goto L9e
            android.widget.PopupWindow r3 = r9.f88104toq
            r3.setHeight(r2)
            android.view.View r2 = r9.f41108g
            android.graphics.Rect r2 = r9.fn3e(r2)
            int[] r0 = r9.m26454h(r0, r2)
            android.widget.PopupWindow r2 = r9.f88104toq
            android.view.View r3 = r9.f88107zy
            r4 = r0[r1]
            r5 = 1
            r0 = r0[r5]
            r2.showAtLocation(r3, r1, r4, r0)
            android.view.View r0 = r9.f41108g
            goto Laa
        L9e:
            android.widget.PopupWindow r0 = r9.f88104toq
            android.view.View r2 = r9.f88107zy
            r3 = 8388659(0x800033, float:1.1755015E-38)
            r0.showAtLocation(r2, r3, r1, r1)
            android.view.View r0 = r9.f88107zy
        Laa:
            if (r0 == 0) goto Lb3
            int r1 = miuix.view.C7385p.f92242jp0y
            int r2 = miuix.view.C7385p.f42272h
            miuix.view.HapticCompat.m26766g(r0, r1, r2)
        Lb3:
            android.view.View r0 = r9.f88107zy
            if (r0 == 0) goto Lc1
            android.view.View r0 = r0.getRootView()
            r1 = 1050253722(0x3e99999a, float:0.3)
            r9.kja0(r0, r1)
        Lc1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.popupwidget.widget.zy.jp0y():void");
    }

    public void ki() {
        this.f88102qrj = true;
        o1t();
    }

    public void kja0(View view, float f2) {
        if (view == null) {
            Log.w(f88091o1t, "can't change window dim with null view");
            return;
        }
        WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams) view.getLayoutParams();
        if (layoutParams == null) {
            return;
        }
        layoutParams.flags |= 2;
        layoutParams.dimAmount = f2;
        ((WindowManager) view.getContext().getSystemService("window")).updateViewLayout(view, layoutParams);
    }

    public void mcp(InterfaceC7275y interfaceC7275y) {
        this.f88094f7l8 = interfaceC7275y;
    }

    /* JADX INFO: renamed from: t */
    public void m26463t(InterfaceC7268g interfaceC7268g) {
        this.f41116y = interfaceC7268g;
    }

    public void wvg(View view) {
        this.f41108g = view;
    }

    /* JADX INFO: compiled from: DropDownPopupWindow.java */
    public static class x2 implements InterfaceC7275y {

        /* JADX INFO: renamed from: k */
        private int f41126k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Context f88109toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private View f88110zy;

        public x2(zy zyVar, int i2) {
            this(zyVar.m26462i(), i2);
            zyVar.mcp(this);
        }

        /* JADX INFO: renamed from: g */
        protected void mo26465g(View view) {
        }

        @Override // miuix.popupwidget.widget.zy.InterfaceC7274s
        /* JADX INFO: renamed from: k */
        public void mo26426k() {
        }

        /* JADX INFO: renamed from: n */
        protected void m26469n() {
            if (this.f88110zy == null) {
                View viewInflate = LayoutInflater.from(this.f88109toq).inflate(this.f41126k, (ViewGroup) null);
                this.f88110zy = viewInflate;
                mo26465g(viewInflate);
            }
        }

        @Override // miuix.popupwidget.widget.zy.InterfaceC7274s
        public void onDismiss() {
        }

        @Override // miuix.popupwidget.widget.zy.InterfaceC7275y
        public View toq() {
            m26469n();
            return this.f88110zy;
        }

        @Override // miuix.popupwidget.widget.zy.InterfaceC7274s
        public void zy(View view, float f2) {
            if (view != null) {
                view.setTranslationY((-view.getHeight()) * (1.0f - f2));
            }
        }

        public x2(Context context, int i2) {
            this.f88109toq = context;
            this.f41126k = i2;
        }
    }
}

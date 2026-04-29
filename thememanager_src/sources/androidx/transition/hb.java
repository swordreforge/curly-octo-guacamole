package androidx.transition;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.C0683f;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import zy.uv6;

/* JADX INFO: compiled from: ViewOverlayApi14.java */
/* JADX INFO: loaded from: classes.dex */
class hb implements InterfaceC1236o {

    /* JADX INFO: renamed from: k */
    protected C1213k f6446k;

    /* JADX INFO: renamed from: androidx.transition.hb$k */
    /* JADX INFO: compiled from: ViewOverlayApi14.java */
    static class C1213k extends ViewGroup {

        /* JADX INFO: renamed from: s */
        static Method f6447s;

        /* JADX INFO: renamed from: g */
        hb f6448g;

        /* JADX INFO: renamed from: k */
        ViewGroup f6449k;

        /* JADX INFO: renamed from: n */
        ArrayList<Drawable> f6450n;

        /* JADX INFO: renamed from: q */
        View f6451q;

        /* JADX INFO: renamed from: y */
        private boolean f6452y;

        static {
            try {
                Class cls = Integer.TYPE;
                f6447s = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        C1213k(Context context, ViewGroup viewGroup, View view, hb hbVar) {
            super(context);
            this.f6450n = null;
            this.f6449k = viewGroup;
            this.f6451q = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f6448g = hbVar;
        }

        /* JADX INFO: renamed from: n */
        private void m5351n(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f6449k.getLocationOnScreen(iArr2);
            this.f6451q.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* JADX INFO: renamed from: q */
        private void m5352q() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f6450n;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f6452y = true;
                    this.f6449k.removeView(this);
                }
            }
        }

        private void zy() {
            if (this.f6452y) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            this.f6449k.getLocationOnScreen(new int[2]);
            this.f6451q.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f6451q.getWidth(), this.f6451q.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f6450n;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f6450n.get(i2).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void f7l8(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f6450n;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m5352q();
            }
        }

        @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: g */
        protected ViewParent m5353g(int i2, int i3, Rect rect) {
            if (this.f6449k == null || f6447s == null) {
                return null;
            }
            try {
                m5351n(new int[2]);
                f6447s.invoke(this.f6449k, Integer.valueOf(i2), Integer.valueOf(i3), rect);
                return null;
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
                return null;
            } catch (InvocationTargetException e3) {
                e3.printStackTrace();
                return null;
            }
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
            if (this.f6449k == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f6449k == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            m5351n(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@zy.lvui Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* JADX INFO: renamed from: k */
        public void m5354k(Drawable drawable) {
            zy();
            if (this.f6450n == null) {
                this.f6450n = new ArrayList<>();
            }
            if (this.f6450n.contains(drawable)) {
                return;
            }
            this.f6450n.add(drawable);
            invalidate(drawable.getBounds());
            drawable.setCallback(this);
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        }

        public void toq(View view) {
            zy();
            if (view.getParent() instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view.getParent();
                if (viewGroup != this.f6449k && viewGroup.getParent() != null && C0683f.zsr0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f6449k.getLocationOnScreen(iArr2);
                    C0683f.gc3c(view, iArr[0] - iArr2[0]);
                    C0683f.zkd(view, iArr[1] - iArr2[1]);
                }
                viewGroup.removeView(view);
                if (view.getParent() != null) {
                    viewGroup.removeView(view);
                }
            }
            super.addView(view);
        }

        @Override // android.view.View
        protected boolean verifyDrawable(@zy.lvui Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f6450n) != null && arrayList.contains(drawable));
        }

        /* JADX INFO: renamed from: y */
        public void m5355y(View view) {
            super.removeView(view);
            m5352q();
        }
    }

    hb(Context context, ViewGroup viewGroup, View view) {
        this.f6446k = new C1213k(context, viewGroup, view, this);
    }

    /* JADX INFO: renamed from: g */
    static ViewGroup m5349g(View view) {
        while (view != null) {
            if (view.getId() == 16908290 && (view instanceof ViewGroup)) {
                return (ViewGroup) view;
            }
            if (view.getParent() instanceof ViewGroup) {
                view = (ViewGroup) view.getParent();
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    static hb m5350n(View view) {
        ViewGroup viewGroupM5349g = m5349g(view);
        if (viewGroupM5349g == null) {
            return null;
        }
        int childCount = viewGroupM5349g.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroupM5349g.getChildAt(i2);
            if (childAt instanceof C1213k) {
                return ((C1213k) childAt).f6448g;
            }
        }
        return new C1195f(viewGroupM5349g.getContext(), viewGroupM5349g, view);
    }

    @Override // androidx.transition.InterfaceC1236o
    /* JADX INFO: renamed from: k */
    public void mo5305k(@zy.lvui Drawable drawable) {
        this.f6446k.m5354k(drawable);
    }

    @Override // androidx.transition.InterfaceC1236o
    public void toq(@zy.lvui Drawable drawable) {
        this.f6446k.f7l8(drawable);
    }
}

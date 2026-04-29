package com.google.android.material.internal;

import android.annotation.SuppressLint;
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
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: ViewOverlayApi14.java */
/* JADX INFO: loaded from: classes2.dex */
class zurt implements fu4 {

    /* JADX INFO: renamed from: k */
    protected C4059k f24644k;

    /* JADX INFO: renamed from: com.google.android.material.internal.zurt$k */
    /* JADX INFO: compiled from: ViewOverlayApi14.java */
    @SuppressLint({"ViewConstructor", "PrivateApi"})
    static class C4059k extends ViewGroup {

        /* JADX INFO: renamed from: s */
        static Method f24645s;

        /* JADX INFO: renamed from: g */
        zurt f24646g;

        /* JADX INFO: renamed from: k */
        ViewGroup f24647k;

        /* JADX INFO: renamed from: n */
        ArrayList<Drawable> f24648n;

        /* JADX INFO: renamed from: q */
        View f24649q;

        /* JADX INFO: renamed from: y */
        private boolean f24650y;

        static {
            try {
                Class cls = Integer.TYPE;
                f24645s = ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", cls, cls, Rect.class);
            } catch (NoSuchMethodException unused) {
            }
        }

        C4059k(Context context, ViewGroup viewGroup, View view, zurt zurtVar) {
            super(context);
            this.f24648n = null;
            this.f24647k = viewGroup;
            this.f24649q = view;
            setRight(viewGroup.getWidth());
            setBottom(viewGroup.getHeight());
            viewGroup.addView(this);
            this.f24646g = zurtVar;
        }

        /* JADX INFO: renamed from: n */
        private void m14631n(int[] iArr) {
            int[] iArr2 = new int[2];
            int[] iArr3 = new int[2];
            this.f24647k.getLocationOnScreen(iArr2);
            this.f24649q.getLocationOnScreen(iArr3);
            iArr[0] = iArr3[0] - iArr2[0];
            iArr[1] = iArr3[1] - iArr2[1];
        }

        /* JADX INFO: renamed from: q */
        private void m14632q() {
            if (getChildCount() == 0) {
                ArrayList<Drawable> arrayList = this.f24648n;
                if (arrayList == null || arrayList.size() == 0) {
                    this.f24650y = true;
                    this.f24647k.removeView(this);
                }
            }
        }

        private void zy() {
            if (this.f24650y) {
                throw new IllegalStateException("This overlay was disposed already. Please use a new one via ViewGroupUtils.getOverlay()");
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void dispatchDraw(Canvas canvas) {
            this.f24647k.getLocationOnScreen(new int[2]);
            this.f24649q.getLocationOnScreen(new int[2]);
            canvas.translate(r0[0] - r1[0], r0[1] - r1[1]);
            canvas.clipRect(new Rect(0, 0, this.f24649q.getWidth(), this.f24649q.getHeight()));
            super.dispatchDraw(canvas);
            ArrayList<Drawable> arrayList = this.f24648n;
            int size = arrayList == null ? 0 : arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f24648n.get(i2).draw(canvas);
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            return false;
        }

        public void f7l8(Drawable drawable) {
            ArrayList<Drawable> arrayList = this.f24648n;
            if (arrayList != null) {
                arrayList.remove(drawable);
                invalidate(drawable.getBounds());
                drawable.setCallback(null);
                m14632q();
            }
        }

        @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: g */
        protected ViewParent m14633g(int i2, int i3, Rect rect) {
            if (this.f24647k == null || f24645s == null) {
                return null;
            }
            try {
                m14631n(new int[2]);
                f24645s.invoke(this.f24647k, Integer.valueOf(i2), Integer.valueOf(i3), rect);
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
            if (this.f24647k == null) {
                return null;
            }
            rect.offset(iArr[0], iArr[1]);
            if (this.f24647k == null) {
                invalidate(rect);
                return null;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            int[] iArr2 = new int[2];
            m14631n(iArr2);
            rect.offset(iArr2[0], iArr2[1]);
            return super.invalidateChildInParent(iArr, rect);
        }

        @Override // android.view.View, android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(@lvui Drawable drawable) {
            invalidate(drawable.getBounds());
        }

        /* JADX INFO: renamed from: k */
        public void m14634k(Drawable drawable) {
            zy();
            if (this.f24648n == null) {
                this.f24648n = new ArrayList<>();
            }
            if (this.f24648n.contains(drawable)) {
                return;
            }
            this.f24648n.add(drawable);
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
                if (viewGroup != this.f24647k && viewGroup.getParent() != null && C0683f.zsr0(viewGroup)) {
                    int[] iArr = new int[2];
                    int[] iArr2 = new int[2];
                    viewGroup.getLocationOnScreen(iArr);
                    this.f24647k.getLocationOnScreen(iArr2);
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
        protected boolean verifyDrawable(@lvui Drawable drawable) {
            ArrayList<Drawable> arrayList;
            return super.verifyDrawable(drawable) || ((arrayList = this.f24648n) != null && arrayList.contains(drawable));
        }

        /* JADX INFO: renamed from: y */
        public void m14635y(View view) {
            super.removeView(view);
            m14632q();
        }
    }

    zurt(Context context, ViewGroup viewGroup, View view) {
        this.f24644k = new C4059k(context, viewGroup, view, this);
    }

    /* JADX INFO: renamed from: n */
    static zurt m14630n(View view) {
        ViewGroup viewGroupF7l8 = C4058z.f7l8(view);
        if (viewGroupF7l8 == null) {
            return null;
        }
        int childCount = viewGroupF7l8.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroupF7l8.getChildAt(i2);
            if (childAt instanceof C4059k) {
                return ((C4059k) childAt).f24646g;
            }
        }
        return new t8r(viewGroupF7l8.getContext(), viewGroupF7l8, view);
    }

    @Override // com.google.android.material.internal.fu4
    /* JADX INFO: renamed from: k */
    public void mo14541k(@lvui Drawable drawable) {
        this.f24644k.m14634k(drawable);
    }

    @Override // com.google.android.material.internal.fu4
    public void toq(@lvui Drawable drawable) {
        this.f24644k.f7l8(drawable);
    }
}

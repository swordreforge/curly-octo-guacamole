package com.android.thememanager.view;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.view.C0683f;
import androidx.customview.widget.C0779q;
import java.util.List;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.view.t */
/* JADX INFO: compiled from: PickerSlideBackHelper.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class C2940t {

    /* JADX INFO: renamed from: q */
    public static final int f17679q = 0;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    public static final String f61541zy = "PickerSlideBackHelper";

    /* JADX INFO: renamed from: k */
    @InterfaceC7395n
    private toq f17680k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f61540toq = new k(null);

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    private static final androidx.lifecycle.fti<Integer> f17678n = new androidx.lifecycle.fti<>();

    /* JADX INFO: renamed from: com.android.thememanager.view.t$k */
    /* JADX INFO: compiled from: PickerSlideBackHelper.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        @l05.qrj
        public static /* synthetic */ void toq() {
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: k */
        public final androidx.lifecycle.fti<Integer> m10425k() {
            return C2940t.f17678n;
        }
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: n */
    public static final androidx.lifecycle.fti<Integer> m10423n() {
        return f61540toq.m10425k();
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ toq m10424q(C2940t c2940t, DraggableFrameLayout draggableFrameLayout, float f2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            f2 = 1.0f;
        }
        return c2940t.zy(draggableFrameLayout, f2);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final toq toq(@InterfaceC7396q DraggableFrameLayout slideBackViewGroup) {
        kotlin.jvm.internal.d2ok.m23075h(slideBackViewGroup, "slideBackViewGroup");
        return m10424q(this, slideBackViewGroup, 0.0f, 2, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public final toq zy(@InterfaceC7396q DraggableFrameLayout slideBackViewGroup, float f2) {
        kotlin.jvm.internal.d2ok.m23075h(slideBackViewGroup, "slideBackViewGroup");
        toq toqVar = new toq(slideBackViewGroup, f2);
        this.f17680k = toqVar;
        kotlin.jvm.internal.d2ok.qrj(toqVar);
        return toqVar;
    }

    /* JADX INFO: renamed from: com.android.thememanager.view.t$toq */
    /* JADX INFO: compiled from: PickerSlideBackHelper.kt */
    public static final class toq {

        /* JADX INFO: renamed from: g */
        @InterfaceC7396q
        public static final String f17681g = "PickerSlideViewDragHolder";

        /* JADX INFO: renamed from: n */
        @InterfaceC7396q
        public static final k f17682n = new k(null);

        /* JADX INFO: renamed from: k */
        @InterfaceC7396q
        private final DraggableFrameLayout f17683k;

        /* JADX INFO: renamed from: q */
        private long f17684q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @InterfaceC7396q
        private final C7943toq f61542toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @InterfaceC7396q
        private final C0779q f61543zy;

        /* JADX INFO: renamed from: com.android.thememanager.view.t$toq$k */
        /* JADX INFO: compiled from: PickerSlideBackHelper.kt */
        public static final class k {
            private k() {
            }

            public /* synthetic */ k(kotlin.jvm.internal.ni7 ni7Var) {
                this();
            }
        }

        /* JADX INFO: renamed from: com.android.thememanager.view.t$toq$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: PickerSlideBackHelper.kt */
        public final class C7943toq extends C0779q.zy {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ toq f17685g;

            /* JADX INFO: renamed from: k */
            @InterfaceC7396q
            private final DraggableFrameLayout f17686k;

            /* JADX INFO: renamed from: n */
            private boolean f17687n;

            /* JADX INFO: renamed from: q */
            private int f17688q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            private final int f61544toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            private int f61545zy;

            public C7943toq(@InterfaceC7396q toq toqVar, DraggableFrameLayout mSlideWrapperViewGroup) {
                kotlin.jvm.internal.d2ok.m23075h(mSlideWrapperViewGroup, "mSlideWrapperViewGroup");
                this.f17685g = toqVar;
                this.f17686k = mSlideWrapperViewGroup;
                this.f61544toq = ViewConfiguration.get(mSlideWrapperViewGroup.getContext()).getScaledMinimumFlingVelocity() * 2;
            }

            /* JADX INFO: renamed from: h */
            private final boolean m10429h() {
                return SystemClock.uptimeMillis() - this.f17685g.f17684q <= ((long) ViewConfiguration.getTapTimeout()) && kja0();
            }

            private final boolean kja0() {
                return false;
            }

            private final void n7h(View view, int i2) {
                if (this.f17687n) {
                    this.f17685g.f17683k.qrj();
                }
                this.f17685g.f17683k.setExecuteContentAnim(true);
                this.f17685g.f17683k.fu4(this.f17687n);
                this.f17685g.m10428q().m3742c(view.getLeft(), i2);
                this.f17686k.invalidate();
            }

            @Override // androidx.customview.widget.C0779q.zy
            /* JADX INFO: renamed from: k */
            public int mo3751k(@InterfaceC7396q View child, int i2, int i3) {
                kotlin.jvm.internal.d2ok.m23075h(child, "child");
                return child.getLeft();
            }

            @Override // androidx.customview.widget.C0779q.zy
            public void ld6(@InterfaceC7396q View changedView, int i2, int i3, int i4, int i5) {
                kotlin.jvm.internal.d2ok.m23075h(changedView, "changedView");
                C2940t.f61540toq.m10425k().cdj(Integer.valueOf(i3));
            }

            @Override // androidx.customview.widget.C0779q.zy
            /* JADX INFO: renamed from: n */
            public int mo3752n(@InterfaceC7396q View child) {
                kotlin.jvm.internal.d2ok.m23075h(child, "child");
                if (kja0()) {
                    return 0;
                }
                return this.f17686k.getHeight();
            }

            @Override // androidx.customview.widget.C0779q.zy
            /* JADX INFO: renamed from: p */
            public void mo3753p(int i2) {
                if (i2 != 0) {
                    if (i2 != 1) {
                        return;
                    }
                    this.f17685g.f17683k.eqxt();
                } else {
                    if (this.f17687n) {
                        this.f17687n = false;
                        this.f17685g.f17683k.f7l8();
                    }
                    this.f17685g.f17683k.setExecuteContentAnim(false);
                }
            }

            @Override // androidx.customview.widget.C0779q.zy
            public boolean qrj(@InterfaceC7396q View child, int i2) {
                kotlin.jvm.internal.d2ok.m23075h(child, "child");
                return true;
            }

            @Override // androidx.customview.widget.C0779q.zy
            /* JADX INFO: renamed from: s */
            public void mo3755s(@InterfaceC7396q View capturedChild, int i2) {
                kotlin.jvm.internal.d2ok.m23075h(capturedChild, "capturedChild");
                this.f17688q = capturedChild.getHeight();
                this.f61545zy = capturedChild.getTop();
                if (capturedChild.getTranslationY() == 0.0f) {
                    return;
                }
                C0683f.zkd(capturedChild, (int) capturedChild.getTranslationY());
                capturedChild.setTranslationY(0.0f);
            }

            @Override // androidx.customview.widget.C0779q.zy
            public int toq(@InterfaceC7396q View child, int i2, int i3) {
                kotlin.jvm.internal.d2ok.m23075h(child, "child");
                return Integer.max(this.f61545zy + 0, i2);
            }

            @Override // androidx.customview.widget.C0779q.zy
            public void x2(@InterfaceC7396q View releasedChild, float f2, float f3) {
                int i2;
                kotlin.jvm.internal.d2ok.m23075h(releasedChild, "releasedChild");
                this.f17687n = false;
                if (Math.abs(f3) >= this.f61544toq) {
                    if (f3 > 0.0f) {
                        this.f17687n = true;
                        i2 = this.f61545zy + this.f17688q;
                    } else {
                        i2 = this.f61545zy;
                    }
                } else if (m10429h()) {
                    i2 = this.f61545zy;
                } else {
                    int top = releasedChild.getTop();
                    int i3 = this.f61545zy;
                    int i4 = this.f17688q;
                    if ((top - i3) / i4 >= 0.5f) {
                        this.f17687n = true;
                        i2 = i3 + i4;
                    } else {
                        i2 = i3;
                    }
                }
                n7h(releasedChild, i2);
            }
        }

        public toq(@InterfaceC7396q DraggableFrameLayout mDraggableFrame, float f2) {
            kotlin.jvm.internal.d2ok.m23075h(mDraggableFrame, "mDraggableFrame");
            this.f17683k = mDraggableFrame;
            C7943toq c7943toq = new C7943toq(this, mDraggableFrame);
            this.f61542toq = c7943toq;
            C0779q c0779qM3735h = C0779q.m3735h(mDraggableFrame, f2, c7943toq);
            kotlin.jvm.internal.d2ok.kja0(c0779qM3735h, "create(...)");
            this.f61543zy = c0779qM3735h;
        }

        /* JADX INFO: renamed from: n */
        public final boolean m10427n(@InterfaceC7396q View view, @InterfaceC7396q MotionEvent event) {
            kotlin.jvm.internal.d2ok.m23075h(view, "view");
            kotlin.jvm.internal.d2ok.m23075h(event, "event");
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i2 = iArr[0];
            int width = view.getWidth() + i2;
            int i3 = iArr[1];
            return ((float) i2) <= event.getRawX() && event.getRawX() <= ((float) width) && ((float) i3) <= event.getRawY() && event.getRawY() <= ((float) (view.getHeight() + i3));
        }

        @InterfaceC7396q
        /* JADX INFO: renamed from: q */
        public final C0779q m10428q() {
            return this.f61543zy;
        }

        public final boolean zy(@InterfaceC7396q MotionEvent event) {
            kotlin.jvm.internal.d2ok.m23075h(event, "event");
            if (event.getAction() == 0) {
                this.f17684q = SystemClock.uptimeMillis();
            }
            if (this.f17683k.getMCanDragSlideView() == null) {
                return false;
            }
            List<View> mCanDragSlideView = this.f17683k.getMCanDragSlideView();
            kotlin.jvm.internal.d2ok.qrj(mCanDragSlideView);
            for (View view : mCanDragSlideView) {
                if (event.getAction() == 0 && m10427n(view, event)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ toq(DraggableFrameLayout draggableFrameLayout, float f2, int i2, kotlin.jvm.internal.ni7 ni7Var) {
            this(draggableFrameLayout, (i2 & 2) != 0 ? 1.0f : f2);
        }
    }
}

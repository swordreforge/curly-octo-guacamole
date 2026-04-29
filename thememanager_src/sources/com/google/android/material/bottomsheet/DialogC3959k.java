package com.google.android.material.bottomsheet;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.app.DialogC0107y;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.accessibility.ki;
import androidx.core.view.eqxt;
import androidx.core.view.tfm;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.color.kja0;
import com.google.android.material.shape.C4108p;
import ij.C6095k;
import zy.dd;
import zy.gvn7;
import zy.hb;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.bottomsheet.k */
/* JADX INFO: compiled from: BottomSheetDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class DialogC3959k extends DialogC0107y {

    /* JADX INFO: renamed from: g */
    private FrameLayout f24020g;

    /* JADX INFO: renamed from: h */
    boolean f24021h;

    /* JADX INFO: renamed from: i */
    private boolean f24022i;

    /* JADX INFO: renamed from: l */
    @lvui
    private BottomSheetBehavior.AbstractC3952g f24023l;

    /* JADX INFO: renamed from: n */
    private BottomSheetBehavior<FrameLayout> f24024n;

    /* JADX INFO: renamed from: p */
    boolean f24025p;

    /* JADX INFO: renamed from: r */
    private boolean f24026r;

    /* JADX INFO: renamed from: s */
    private FrameLayout f24027s;

    /* JADX INFO: renamed from: t */
    private BottomSheetBehavior.AbstractC3952g f24028t;

    /* JADX INFO: renamed from: y */
    private CoordinatorLayout f24029y;

    /* JADX INFO: renamed from: z */
    private boolean f24030z;

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.k$g */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    private static class g extends BottomSheetBehavior.AbstractC3952g {

        /* JADX INFO: renamed from: k */
        private final boolean f24031k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final boolean f67438toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final tfm f67439zy;

        /* synthetic */ g(View view, tfm tfmVar, k kVar) {
            this(view, tfmVar);
        }

        /* JADX INFO: renamed from: q */
        private void m14161q(View view) {
            if (view.getTop() < this.f67439zy.ki()) {
                DialogC3959k.m14157h(view, this.f24031k);
                view.setPadding(view.getPaddingLeft(), this.f67439zy.ki() - view.getTop(), view.getPaddingRight(), view.getPaddingBottom());
            } else if (view.getTop() != 0) {
                DialogC3959k.m14157h(view, this.f67438toq);
                view.setPadding(view.getPaddingLeft(), 0, view.getPaddingRight(), view.getPaddingBottom());
            }
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3952g
        /* JADX INFO: renamed from: k */
        void mo14154k(@lvui View view) {
            m14161q(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3952g
        public void toq(@lvui View view, float f2) {
            m14161q(view);
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3952g
        public void zy(@lvui View view, int i2) {
            m14161q(view);
        }

        private g(@lvui View view, @lvui tfm tfmVar) {
            this.f67439zy = tfmVar;
            boolean z2 = (view.getSystemUiVisibility() & 8192) != 0;
            this.f67438toq = z2;
            C4108p c4108pZp = BottomSheetBehavior.m14139b(view).zp();
            ColorStateList colorStateListM14869z = c4108pZp != null ? c4108pZp.m14869z() : C0683f.m3172r(view);
            if (colorStateListM14869z != null) {
                this.f24031k = kja0.ld6(colorStateListM14869z.getDefaultColor());
            } else if (view.getBackground() instanceof ColorDrawable) {
                this.f24031k = kja0.ld6(((ColorDrawable) view.getBackground()).getColor());
            } else {
                this.f24031k = z2;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.k$k */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    class k implements eqxt {
        k() {
        }

        @Override // androidx.core.view.eqxt
        /* JADX INFO: renamed from: k */
        public tfm mo151k(View view, tfm tfmVar) {
            if (DialogC3959k.this.f24028t != null) {
                DialogC3959k.this.f24024n.mu(DialogC3959k.this.f24028t);
            }
            if (tfmVar != null) {
                DialogC3959k dialogC3959k = DialogC3959k.this;
                dialogC3959k.f24028t = new g(dialogC3959k.f24027s, tfmVar, null);
                DialogC3959k.this.f24024n.vyq(DialogC3959k.this.f24028t);
            }
            return tfmVar;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.k$n */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    class n extends BottomSheetBehavior.AbstractC3952g {
        n() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3952g
        public void toq(@lvui View view, float f2) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.AbstractC3952g
        public void zy(@lvui View view, int i2) {
            if (i2 == 5) {
                DialogC3959k.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.k$q */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    class q implements View.OnTouchListener {
        q() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.k$toq */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            DialogC3959k dialogC3959k = DialogC3959k.this;
            if (dialogC3959k.f24021h && dialogC3959k.isShowing() && DialogC3959k.this.cdj()) {
                DialogC3959k.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomsheet.k$zy */
    /* JADX INFO: compiled from: BottomSheetDialog.java */
    class zy extends C0701k {
        zy() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, @lvui ki kiVar) {
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            if (!DialogC3959k.this.f24021h) {
                kiVar.se(false);
            } else {
                kiVar.m3052k(1048576);
                kiVar.se(true);
            }
        }

        @Override // androidx.core.view.C0701k
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            if (i2 == 1048576) {
                DialogC3959k dialogC3959k = DialogC3959k.this;
                if (dialogC3959k.f24021h) {
                    dialogC3959k.cancel();
                    return true;
                }
            }
            return super.performAccessibilityAction(view, i2, bundle);
        }
    }

    public DialogC3959k(@lvui Context context) {
        this(context, 0);
        this.f24026r = getContext().getTheme().obtainStyledAttributes(new int[]{C6095k.zy.b3fl}).getBoolean(0, false);
    }

    /* JADX INFO: renamed from: h */
    public static void m14157h(@lvui View view, boolean z2) {
        int systemUiVisibility = view.getSystemUiVisibility();
        view.setSystemUiVisibility(z2 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
    }

    private View ki(int i2, @dd View view, @dd ViewGroup.LayoutParams layoutParams) {
        m14158p();
        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.f24020g.findViewById(C6095k.y.f79948cfr);
        if (i2 != 0 && view == null) {
            view = getLayoutInflater().inflate(i2, (ViewGroup) coordinatorLayout, false);
        }
        if (this.f24026r) {
            C0683f.kx3(this.f24027s, new k());
        }
        this.f24027s.removeAllViews();
        if (layoutParams == null) {
            this.f24027s.addView(view);
        } else {
            this.f24027s.addView(view, layoutParams);
        }
        coordinatorLayout.findViewById(C6095k.y.yvs).setOnClickListener(new toq());
        C0683f.zwy(this.f24027s, new zy());
        this.f24027s.setOnTouchListener(new q());
        return this.f24020g;
    }

    /* JADX INFO: renamed from: p */
    private FrameLayout m14158p() {
        if (this.f24020g == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), C6095k.ld6.f79274a9, null);
            this.f24020g = frameLayout;
            this.f24029y = (CoordinatorLayout) frameLayout.findViewById(C6095k.y.f79948cfr);
            FrameLayout frameLayout2 = (FrameLayout) this.f24020g.findViewById(C6095k.y.f80014ktq);
            this.f24027s = frameLayout2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehaviorM14139b = BottomSheetBehavior.m14139b(frameLayout2);
            this.f24024n = bottomSheetBehaviorM14139b;
            bottomSheetBehaviorM14139b.vyq(this.f24023l);
            this.f24024n.zsr0(this.f24021h);
        }
        return this.f24020g;
    }

    private static int zy(@lvui Context context, int i2) {
        if (i2 != 0) {
            return i2;
        }
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(C6095k.zy.f80199i9jn, typedValue, true) ? typedValue.resourceId : C6095k.n7h.yz5;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        BottomSheetBehavior<FrameLayout> bottomSheetBehaviorLd6 = ld6();
        if (!this.f24025p || bottomSheetBehaviorLd6.bo() == 5) {
            super.cancel();
        } else {
            bottomSheetBehaviorLd6.sok(5);
        }
    }

    boolean cdj() {
        if (!this.f24030z) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(new int[]{R.attr.windowCloseOnTouchOutside});
            this.f24022i = typedArrayObtainStyledAttributes.getBoolean(0, true);
            typedArrayObtainStyledAttributes.recycle();
            this.f24030z = true;
        }
        return this.f24022i;
    }

    public void kja0(boolean z2) {
        this.f24025p = z2;
    }

    @lvui
    public BottomSheetBehavior<FrameLayout> ld6() {
        if (this.f24024n == null) {
            m14158p();
        }
        return this.f24024n;
    }

    void n7h() {
        this.f24024n.mu(this.f24023l);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Window window = getWindow();
        if (window != null) {
            boolean z2 = this.f24026r && Color.alpha(window.getNavigationBarColor()) < 255;
            FrameLayout frameLayout = this.f24020g;
            if (frameLayout != null) {
                frameLayout.setFitsSystemWindows(!z2);
            }
            CoordinatorLayout coordinatorLayout = this.f24029y;
            if (coordinatorLayout != null) {
                coordinatorLayout.setFitsSystemWindows(!z2);
            }
            if (z2) {
                window.getDecorView().setSystemUiVisibility(768);
            }
        }
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    @Override // android.app.Dialog
    protected void onStart() {
        super.onStart();
        BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f24024n;
        if (bottomSheetBehavior == null || bottomSheetBehavior.bo() != 5) {
            return;
        }
        this.f24024n.sok(4);
    }

    public boolean qrj() {
        return this.f24026r;
    }

    @Override // android.app.Dialog
    public void setCancelable(boolean z2) {
        super.setCancelable(z2);
        if (this.f24021h != z2) {
            this.f24021h = z2;
            BottomSheetBehavior<FrameLayout> bottomSheetBehavior = this.f24024n;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.zsr0(z2);
            }
        }
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z2) {
        super.setCanceledOnTouchOutside(z2);
        if (z2 && !this.f24021h) {
            this.f24021h = true;
        }
        this.f24022i = z2;
        this.f24030z = true;
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog
    public void setContentView(@gvn7 int i2) {
        super.setContentView(ki(i2, null, null));
    }

    public boolean x2() {
        return this.f24025p;
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog
    public void setContentView(View view) {
        super.setContentView(ki(0, view, null));
    }

    @Override // androidx.appcompat.app.DialogC0107y, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        super.setContentView(ki(0, view, layoutParams));
    }

    public DialogC3959k(@lvui Context context, @hb int i2) {
        super(context, zy(context, i2));
        this.f24021h = true;
        this.f24022i = true;
        this.f24023l = new n();
        m253n(1);
        this.f24026r = getContext().getTheme().obtainStyledAttributes(new int[]{C6095k.zy.b3fl}).getBoolean(0, false);
    }

    protected DialogC3959k(@lvui Context context, boolean z2, DialogInterface.OnCancelListener onCancelListener) {
        super(context, z2, onCancelListener);
        this.f24021h = true;
        this.f24022i = true;
        this.f24023l = new n();
        m253n(1);
        this.f24021h = z2;
        this.f24026r = getContext().getTheme().obtainStyledAttributes(new int[]{C6095k.zy.b3fl}).getBoolean(0, false);
    }
}

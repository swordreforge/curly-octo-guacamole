package androidx.appcompat.widget;

import android.text.TextUtils;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityManager;
import androidx.core.view.C0683f;
import zy.uv6;

/* JADX INFO: compiled from: TooltipCompatHandler.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
class zp implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: c */
    private static zp f1223c = null;

    /* JADX INFO: renamed from: f */
    private static zp f1224f = null;

    /* JADX INFO: renamed from: l */
    private static final long f1225l = 3000;

    /* JADX INFO: renamed from: r */
    private static final long f1226r = 15000;

    /* JADX INFO: renamed from: t */
    private static final long f1227t = 2500;

    /* JADX INFO: renamed from: z */
    private static final String f1228z = "TooltipCompatHandler";

    /* JADX INFO: renamed from: h */
    private C0221x f1230h;

    /* JADX INFO: renamed from: i */
    private boolean f1231i;

    /* JADX INFO: renamed from: k */
    private final View f1232k;

    /* JADX INFO: renamed from: n */
    private final int f1233n;

    /* JADX INFO: renamed from: p */
    private int f1234p;

    /* JADX INFO: renamed from: q */
    private final CharSequence f1235q;

    /* JADX INFO: renamed from: s */
    private int f1236s;

    /* JADX INFO: renamed from: g */
    private final Runnable f1229g = new RunnableC0225k();

    /* JADX INFO: renamed from: y */
    private final Runnable f1237y = new toq();

    /* JADX INFO: renamed from: androidx.appcompat.widget.zp$k */
    /* JADX INFO: compiled from: TooltipCompatHandler.java */
    class RunnableC0225k implements Runnable {
        RunnableC0225k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zp.this.f7l8(false);
        }
    }

    /* JADX INFO: compiled from: TooltipCompatHandler.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            zp.this.zy();
        }
    }

    private zp(View view, CharSequence charSequence) {
        this.f1232k = view;
        this.f1235q = charSequence;
        this.f1233n = androidx.core.view.ch.zy(ViewConfiguration.get(view.getContext()));
        toq();
        view.setOnLongClickListener(this);
        view.setOnHoverListener(this);
    }

    /* JADX INFO: renamed from: g */
    public static void m745g(View view, CharSequence charSequence) {
        zp zpVar = f1224f;
        if (zpVar != null && zpVar.f1232k == view) {
            m747n(null);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            new zp(view, charSequence);
            return;
        }
        zp zpVar2 = f1223c;
        if (zpVar2 != null && zpVar2.f1232k == view) {
            zpVar2.zy();
        }
        view.setOnLongClickListener(null);
        view.setLongClickable(false);
        view.setOnHoverListener(null);
    }

    /* JADX INFO: renamed from: k */
    private void m746k() {
        this.f1232k.removeCallbacks(this.f1229g);
    }

    /* JADX INFO: renamed from: n */
    private static void m747n(zp zpVar) {
        zp zpVar2 = f1224f;
        if (zpVar2 != null) {
            zpVar2.m746k();
        }
        f1224f = zpVar;
        if (zpVar != null) {
            zpVar.m748q();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m748q() {
        this.f1232k.postDelayed(this.f1229g, ViewConfiguration.getLongPressTimeout());
    }

    private void toq() {
        this.f1236s = Integer.MAX_VALUE;
        this.f1234p = Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: y */
    private boolean m749y(MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        if (Math.abs(x3 - this.f1236s) <= this.f1233n && Math.abs(y3 - this.f1234p) <= this.f1233n) {
            return false;
        }
        this.f1236s = x3;
        this.f1234p = y3;
        return true;
    }

    void f7l8(boolean z2) {
        long j2;
        int longPressTimeout;
        long j3;
        if (C0683f.zsr0(this.f1232k)) {
            m747n(null);
            zp zpVar = f1223c;
            if (zpVar != null) {
                zpVar.zy();
            }
            f1223c = this;
            this.f1231i = z2;
            C0221x c0221x = new C0221x(this.f1232k.getContext());
            this.f1230h = c0221x;
            c0221x.m736n(this.f1232k, this.f1236s, this.f1234p, this.f1231i, this.f1235q);
            this.f1232k.addOnAttachStateChangeListener(this);
            if (this.f1231i) {
                j3 = f1227t;
            } else {
                if ((C0683f.m3158d(this.f1232k) & 1) == 1) {
                    j2 = 3000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                } else {
                    j2 = 15000;
                    longPressTimeout = ViewConfiguration.getLongPressTimeout();
                }
                j3 = j2 - ((long) longPressTimeout);
            }
            this.f1232k.removeCallbacks(this.f1237y);
            this.f1232k.postDelayed(this.f1237y, j3);
        }
    }

    @Override // android.view.View.OnHoverListener
    public boolean onHover(View view, MotionEvent motionEvent) {
        if (this.f1230h != null && this.f1231i) {
            return false;
        }
        AccessibilityManager accessibilityManager = (AccessibilityManager) this.f1232k.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action != 7) {
            if (action == 10) {
                toq();
                zy();
            }
        } else if (this.f1232k.isEnabled() && this.f1230h == null && m749y(motionEvent)) {
            m747n(this);
        }
        return false;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(View view) {
        this.f1236s = view.getWidth() / 2;
        this.f1234p = view.getHeight() / 2;
        f7l8(true);
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        zy();
    }

    void zy() {
        if (f1223c == this) {
            f1223c = null;
            C0221x c0221x = this.f1230h;
            if (c0221x != null) {
                c0221x.zy();
                this.f1230h = null;
                toq();
                this.f1232k.removeOnAttachStateChangeListener(this);
            } else {
                Log.e(f1228z, "sActiveHandler.mPopup == null");
            }
        }
        if (f1224f == this) {
            m747n(null);
        }
        this.f1232k.removeCallbacks(this.f1237y);
    }
}

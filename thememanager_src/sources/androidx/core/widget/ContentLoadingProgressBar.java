package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import zy.dd;
import zy.ek5k;
import zy.lvui;

/* JADX INFO: loaded from: classes.dex */
public class ContentLoadingProgressBar extends ProgressBar {

    /* JADX INFO: renamed from: h */
    private static final int f4208h = 500;

    /* JADX INFO: renamed from: p */
    private static final int f4209p = 500;

    /* JADX INFO: renamed from: g */
    boolean f4210g;

    /* JADX INFO: renamed from: k */
    long f4211k;

    /* JADX INFO: renamed from: n */
    boolean f4212n;

    /* JADX INFO: renamed from: q */
    boolean f4213q;

    /* JADX INFO: renamed from: s */
    private final Runnable f4214s;

    /* JADX INFO: renamed from: y */
    private final Runnable f4215y;

    public ContentLoadingProgressBar(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f7l8() {
        this.f4213q = false;
        this.f4211k = -1L;
        setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ek5k
    /* JADX INFO: renamed from: g */
    public void m3599g() {
        this.f4210g = true;
        removeCallbacks(this.f4214s);
        this.f4212n = false;
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j2 = this.f4211k;
        long j3 = jCurrentTimeMillis - j2;
        if (j3 >= 500 || j2 == -1) {
            setVisibility(8);
        } else {
            if (this.f4213q) {
                return;
            }
            postDelayed(this.f4215y, 500 - j3);
            this.f4213q = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @ek5k
    public void ld6() {
        this.f4211k = -1L;
        this.f4210g = false;
        removeCallbacks(this.f4215y);
        this.f4213q = false;
        if (this.f4212n) {
            return;
        }
        postDelayed(this.f4214s, 500L);
        this.f4212n = true;
    }

    /* JADX INFO: renamed from: s */
    private void m3602s() {
        removeCallbacks(this.f4215y);
        removeCallbacks(this.f4214s);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m3603y() {
        this.f4212n = false;
        if (this.f4210g) {
            return;
        }
        this.f4211k = System.currentTimeMillis();
        setVisibility(0);
    }

    /* JADX INFO: renamed from: n */
    public void m3604n() {
        post(new Runnable() { // from class: androidx.core.widget.g
            @Override // java.lang.Runnable
            public final void run() {
                this.f4249k.m3599g();
            }
        });
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        m3602s();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m3602s();
    }

    /* JADX INFO: renamed from: p */
    public void m3605p() {
        post(new Runnable() { // from class: androidx.core.widget.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f4285k.ld6();
            }
        });
    }

    public ContentLoadingProgressBar(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f4211k = -1L;
        this.f4213q = false;
        this.f4212n = false;
        this.f4210g = false;
        this.f4215y = new Runnable() { // from class: androidx.core.widget.f7l8
            @Override // java.lang.Runnable
            public final void run() {
                this.f4247k.f7l8();
            }
        };
        this.f4214s = new Runnable() { // from class: androidx.core.widget.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f4305k.m3603y();
            }
        };
    }
}

package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.toq;
import com.bumptech.glide.gifdecoder.InterfaceC2974k;
import com.bumptech.glide.load.engine.bitmap_recycle.InterfaceC3008n;
import com.bumptech.glide.load.n7h;
import com.bumptech.glide.load.resource.gif.f7l8;
import com.bumptech.glide.util.qrj;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: GifDrawable.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy extends Drawable implements f7l8.toq, Animatable, androidx.vectordrawable.graphics.drawable.toq {

    /* JADX INFO: renamed from: f */
    private static final int f18809f = 119;

    /* JADX INFO: renamed from: l */
    public static final int f18810l = 0;

    /* JADX INFO: renamed from: r */
    public static final int f18811r = -1;

    /* JADX INFO: renamed from: g */
    private boolean f18812g;

    /* JADX INFO: renamed from: h */
    private boolean f18813h;

    /* JADX INFO: renamed from: i */
    private Paint f18814i;

    /* JADX INFO: renamed from: k */
    private final C3132k f18815k;

    /* JADX INFO: renamed from: n */
    private boolean f18816n;

    /* JADX INFO: renamed from: p */
    private int f18817p;

    /* JADX INFO: renamed from: q */
    private boolean f18818q;

    /* JADX INFO: renamed from: s */
    private int f18819s;

    /* JADX INFO: renamed from: t */
    private List<toq.AbstractC1258k> f18820t;

    /* JADX INFO: renamed from: y */
    private boolean f18821y;

    /* JADX INFO: renamed from: z */
    private Rect f18822z;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.gif.zy$k */
    /* JADX INFO: compiled from: GifDrawable.java */
    static final class C3132k extends Drawable.ConstantState {

        /* JADX INFO: renamed from: k */
        @yz
        final f7l8 f18823k;

        C3132k(f7l8 f7l8Var) {
            this.f18823k = f7l8Var;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @lvui
        public Drawable newDrawable() {
            return new zy(this);
        }
    }

    @Deprecated
    public zy(Context context, InterfaceC2974k interfaceC2974k, InterfaceC3008n interfaceC3008n, n7h<Bitmap> n7hVar, int i2, int i3, Bitmap bitmap) {
        this(context, interfaceC2974k, n7hVar, i2, i3, bitmap);
    }

    private void fn3e() {
        qrj.m11260k(!this.f18812g, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.f18815k.f18823k.m11038g() == 1) {
            invalidateSelf();
        } else {
            if (this.f18818q) {
                return;
            }
            this.f18818q = true;
            this.f18815k.f18823k.zurt(this);
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: g */
    private Rect m11056g() {
        if (this.f18822z == null) {
            this.f18822z = new Rect();
        }
        return this.f18822z;
    }

    /* JADX INFO: renamed from: h */
    private void m11057h() {
        this.f18819s = 0;
    }

    private Paint ld6() {
        if (this.f18814i == null) {
            this.f18814i = new Paint(2);
        }
        return this.f18814i;
    }

    private void n7h() {
        List<toq.AbstractC1258k> list = this.f18820t;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f18820t.get(i2).toq(this);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private Drawable.Callback m11058q() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private void zurt() {
        this.f18818q = false;
        this.f18815k.f18823k.ni7(this);
    }

    public void cdj(n7h<Bitmap> n7hVar, Bitmap bitmap) {
        this.f18815k.f18823k.cdj(n7hVar, bitmap);
    }

    @Override // androidx.vectordrawable.graphics.drawable.toq
    public void clearAnimationCallbacks() {
        List<toq.AbstractC1258k> list = this.f18820t;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@lvui Canvas canvas) {
        if (this.f18812g) {
            return;
        }
        if (this.f18813h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), m11056g());
            this.f18813h = false;
        }
        canvas.drawBitmap(this.f18815k.f18823k.zy(), (Rect) null, m11056g(), ld6());
    }

    public Bitmap f7l8() {
        return this.f18815k.f18823k.m11040n();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f18815k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f18815k.f18823k.m11043s();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f18815k.f18823k.qrj();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    /* JADX INFO: renamed from: i */
    public void m11059i() {
        qrj.m11260k(!this.f18818q, "You cannot restart a currently running animation.");
        this.f18815k.f18823k.ki();
        start();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f18818q;
    }

    @Override // com.bumptech.glide.load.resource.gif.f7l8.toq
    /* JADX INFO: renamed from: k */
    public void mo11047k() {
        if (m11058q() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (m11062s() == m11063y() - 1) {
            this.f18819s++;
        }
        int i2 = this.f18817p;
        if (i2 == -1 || this.f18819s < i2) {
            return;
        }
        n7h();
        stop();
    }

    void ki(boolean z2) {
        this.f18818q = z2;
    }

    public void kja0() {
        this.f18812g = true;
        this.f18815k.f18823k.m11039k();
    }

    /* JADX INFO: renamed from: n */
    public ByteBuffer m11060n() {
        return this.f18815k.f18823k.toq();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f18813h = true;
    }

    /* JADX INFO: renamed from: p */
    public n7h<Bitmap> m11061p() {
        return this.f18815k.f18823k.m11044y();
    }

    boolean qrj() {
        return this.f18812g;
    }

    /* JADX INFO: renamed from: s */
    public int m11062s() {
        return this.f18815k.f18823k.m11042q();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        ld6().setAlpha(i2);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        ld6().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        qrj.m11260k(!this.f18812g, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.f18821y = z2;
        if (!z2) {
            zurt();
        } else if (this.f18816n) {
            fn3e();
        }
        return super.setVisible(z2, z3);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f18816n = true;
        m11057h();
        if (this.f18821y) {
            fn3e();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f18816n = false;
        zurt();
    }

    public void t8r(int i2) {
        if (i2 <= 0 && i2 != -1 && i2 != 0) {
            throw new IllegalArgumentException("Loop count must be greater than 0, or equal to GlideDrawable.LOOP_FOREVER, or equal to GlideDrawable.LOOP_INTRINSIC");
        }
        if (i2 != 0) {
            this.f18817p = i2;
        } else {
            int iM11041p = this.f18815k.f18823k.m11041p();
            this.f18817p = iM11041p != 0 ? iM11041p : -1;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.toq
    public void toq(@lvui toq.AbstractC1258k abstractC1258k) {
        if (abstractC1258k == null) {
            return;
        }
        if (this.f18820t == null) {
            this.f18820t = new ArrayList();
        }
        this.f18820t.add(abstractC1258k);
    }

    public int x2() {
        return this.f18815k.f18823k.x2();
    }

    /* JADX INFO: renamed from: y */
    public int m11063y() {
        return this.f18815k.f18823k.m11038g();
    }

    @Override // androidx.vectordrawable.graphics.drawable.toq
    public boolean zy(@lvui toq.AbstractC1258k abstractC1258k) {
        List<toq.AbstractC1258k> list = this.f18820t;
        if (list == null || abstractC1258k == null) {
            return false;
        }
        return list.remove(abstractC1258k);
    }

    public zy(Context context, InterfaceC2974k interfaceC2974k, n7h<Bitmap> n7hVar, int i2, int i3, Bitmap bitmap) {
        this(new C3132k(new f7l8(com.bumptech.glide.zy.m11283n(context), interfaceC2974k, i2, i3, n7hVar, bitmap)));
    }

    zy(C3132k c3132k) {
        this.f18821y = true;
        this.f18817p = -1;
        this.f18815k = (C3132k) qrj.m11262q(c3132k);
    }

    @yz
    zy(f7l8 f7l8Var, Paint paint) {
        this(new C3132k(f7l8Var));
        this.f18814i = paint;
    }
}

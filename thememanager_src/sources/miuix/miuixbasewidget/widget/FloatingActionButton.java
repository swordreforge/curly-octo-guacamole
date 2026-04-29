package miuix.miuixbasewidget.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import miuix.animation.Folme;
import miuix.animation.IHoverStyle;
import miuix.animation.base.AnimConfig;
import miuix.miuixbasewidget.widget.C7196k;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import vwb.toq;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class FloatingActionButton extends ImageView {

    /* JADX INFO: renamed from: f */
    private static final int f40595f = 25;

    /* JADX INFO: renamed from: l */
    private static final float f40596l = 23.0f;

    /* JADX INFO: renamed from: r */
    private static final float f40597r = 6.0f;

    /* JADX INFO: renamed from: t */
    private static final float f40598t = 0.0f;

    /* JADX INFO: renamed from: z */
    private static final int f40599z = 218103808;

    /* JADX INFO: renamed from: g */
    private Drawable f40600g;

    /* JADX INFO: renamed from: h */
    private boolean f40601h;

    /* JADX INFO: renamed from: i */
    private C7193k f40602i;

    /* JADX INFO: renamed from: k */
    private C7196k f40603k;

    /* JADX INFO: renamed from: n */
    private final boolean f40604n;

    /* JADX INFO: renamed from: p */
    private int f40605p;

    /* JADX INFO: renamed from: q */
    private miuix.miuixbasewidget.widget.toq f40606q;

    /* JADX INFO: renamed from: s */
    private boolean f40607s;

    /* JADX INFO: renamed from: y */
    private int f40608y;

    /* JADX INFO: renamed from: miuix.miuixbasewidget.widget.FloatingActionButton$k */
    class C7193k extends Drawable {

        /* JADX INFO: renamed from: k */
        private Drawable f40609k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private Paint f87834toq = new Paint();

        C7193k(Drawable drawable) {
            this.f40609k = drawable;
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@lvui Canvas canvas) {
            int width = FloatingActionButton.this.getWidth();
            int paddingLeft = FloatingActionButton.this.getPaddingLeft();
            int paddingTop = FloatingActionButton.this.getPaddingTop();
            int paddingRight = (((width - paddingLeft) - FloatingActionButton.this.getPaddingRight()) / 2) * 2;
            this.f40609k.setBounds(paddingLeft, paddingTop, paddingLeft + paddingRight, paddingRight + paddingTop);
            this.f40609k.draw(canvas);
        }

        @Override // android.graphics.drawable.Drawable
        @dd
        public Drawable.ConstantState getConstantState() {
            return this.f40609k.getConstantState();
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return this.f40609k.getOpacity();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i2) {
            this.f40609k.setAlpha(i2);
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@dd ColorFilter colorFilter) {
            this.f40609k.setColorFilter(colorFilter);
        }
    }

    public FloatingActionButton(Context context) {
        this(context, null);
    }

    private Drawable getDefaultBackground() {
        if (this.f40600g == null) {
            this.f40608y = getContext().getResources().getColor(toq.C7709g.f95851mu);
            this.f40607s = true;
            this.f40600g = toq();
        }
        return this.f40600g;
    }

    /* JADX INFO: renamed from: k */
    private int m26097k(int i2) {
        return Color.argb(25, Color.red(i2), Math.max(0, Color.green(i2) - 30), Color.blue(i2));
    }

    /* JADX INFO: renamed from: n */
    private void m26098n() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = (((getWidth() - paddingLeft) - getPaddingRight()) / 2) * 2;
        this.f40602i.setBounds(paddingLeft, paddingTop, paddingLeft + width, width + paddingTop);
    }

    /* JADX INFO: renamed from: q */
    private void m26099q() {
        this.f40606q = new miuix.miuixbasewidget.widget.toq(getContext(), this.f40603k);
    }

    private Drawable toq() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new toq(this));
        if (this.f40604n) {
            this.f40603k.f40637k = this.f40601h ? this.f40605p : m26097k(this.f40608y);
            if (this.f40606q == null) {
                m26099q();
            }
        } else {
            miuix.miuixbasewidget.widget.toq toqVar = this.f40606q;
            if (toqVar != null) {
                toqVar.toq(this, false, 2);
            }
            this.f40606q = null;
        }
        shapeDrawable.getPaint().setColor(this.f40608y);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f40602i});
        ShapeDrawable shapeDrawable2 = new ShapeDrawable(new toq(this));
        shapeDrawable2.getPaint().setColor(f40599z);
        LayerDrawable layerDrawable2 = new LayerDrawable(new Drawable[]{layerDrawable, shapeDrawable2});
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(ImageView.PRESSED_ENABLED_STATE_SET, layerDrawable2);
        stateListDrawable.addState(ImageView.ENABLED_SELECTED_STATE_SET, layerDrawable2);
        stateListDrawable.addState(ImageView.EMPTY_STATE_SET, layerDrawable);
        return stateListDrawable;
    }

    private void zy() {
        if (getBackground() != null) {
            this.f40607s = false;
        } else if (this.f40607s) {
            super.setBackground(toq());
        } else {
            super.setBackground(getDefaultBackground());
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        miuix.miuixbasewidget.widget.toq toqVar;
        if (this.f40604n && (toqVar = this.f40606q) != null) {
            toqVar.m26110k(canvas, getHeight());
        }
        super.draw(canvas);
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        miuix.miuixbasewidget.widget.toq toqVar = this.f40606q;
        if (toqVar != null) {
            toqVar.zy(configuration);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(Canvas canvas) {
        m26098n();
        super.onDraw(canvas);
    }

    @Override // android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        miuix.miuixbasewidget.widget.toq toqVar = this.f40606q;
        if (toqVar != null) {
            toqVar.m26111n(i2, i3, i4, i5);
            if (this.f40604n) {
                this.f40606q.toq(this, true, 2);
            } else {
                this.f40606q.toq(this, false, 2);
            }
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        HapticCompat.m26766g(this, C7385p.f92238fti, C7385p.f42278s);
        return super.performClick();
    }

    @Override // android.view.View
    public void setBackground(Drawable drawable) {
        this.f40607s = false;
        if (drawable == null) {
            drawable = getDefaultBackground();
        }
        super.setBackground(drawable);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i2) {
        if (!this.f40607s || this.f40608y != i2) {
            this.f40608y = i2;
            super.setBackground(toq());
        }
        this.f40607s = true;
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        this.f40607s = false;
        if (i2 == 0) {
            super.setBackground(getDefaultBackground());
        } else {
            super.setBackgroundResource(i2);
        }
    }

    private static class toq extends OvalShape {

        /* JADX INFO: renamed from: k */
        private WeakReference<View> f40610k;

        public toq() {
            this.f40610k = new WeakReference<>(null);
        }

        @Override // android.graphics.drawable.shapes.OvalShape, android.graphics.drawable.shapes.RectShape, android.graphics.drawable.shapes.Shape
        public void draw(Canvas canvas, Paint paint) {
            View view = this.f40610k.get();
            if (view != null) {
                int width = view.getWidth();
                int paddingLeft = view.getPaddingLeft();
                int paddingTop = view.getPaddingTop();
                canvas.drawCircle(paddingLeft + r1, paddingTop + r1, ((width - paddingLeft) - view.getPaddingRight()) / 2, paint);
            }
        }

        public toq(View view) {
            this.f40610k = new WeakReference<>(view);
        }
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingActionButton(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C7196k c7196kM26106k = new C7196k.k(f40596l).m26106k();
        this.f40603k = c7196kM26106k;
        c7196kM26106k.f40638n = 0.0f;
        c7196kM26106k.f40636g = f40597r;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.kja0.u5, i2, toq.n7h.t8o);
        this.f40604n = typedArrayObtainStyledAttributes.getBoolean(toq.kja0.ewa, true);
        int i3 = toq.kja0.vv3;
        this.f40607s = typedArrayObtainStyledAttributes.hasValue(i3);
        this.f40608y = typedArrayObtainStyledAttributes.getColor(i3, context.getResources().getColor(toq.C7709g.f95814ikck));
        int i4 = toq.kja0.xtsf;
        this.f40601h = typedArrayObtainStyledAttributes.hasValue(i4);
        this.f40605p = typedArrayObtainStyledAttributes.getColor(i4, this.f40608y);
        typedArrayObtainStyledAttributes.recycle();
        this.f40602i = new C7193k(getContext().getResources().getDrawable(toq.C7715y.f96940mi1u));
        zy();
        Folme.useAt(this).touch().setTint(0).handleTouchOf(this, new AnimConfig[0]);
        Folme.useAt(this).hover().setEffect(IHoverStyle.HoverEffect.FLOATED_WRAPPED).handleHoverOf(this, new AnimConfig[0]);
    }
}

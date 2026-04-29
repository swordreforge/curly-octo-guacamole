package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import x2.C7748k;
import zy.InterfaceC7833l;
import zy.dd;
import zy.lvui;
import zy.x2;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: h */
    private static final int[] f1289h = {R.attr.colorBackground};

    /* JADX INFO: renamed from: i */
    private static final InterfaceC0243n f1290i;

    /* JADX INFO: renamed from: g */
    int f1291g;

    /* JADX INFO: renamed from: k */
    private boolean f1292k;

    /* JADX INFO: renamed from: n */
    int f1293n;

    /* JADX INFO: renamed from: p */
    private final InterfaceC0244q f1294p;

    /* JADX INFO: renamed from: q */
    private boolean f1295q;

    /* JADX INFO: renamed from: s */
    final Rect f1296s;

    /* JADX INFO: renamed from: y */
    final Rect f1297y;

    /* JADX INFO: renamed from: androidx.cardview.widget.CardView$k */
    class C0239k implements InterfaceC0244q {

        /* JADX INFO: renamed from: k */
        private Drawable f1298k;

        C0239k() {
        }

        @Override // androidx.cardview.widget.InterfaceC0244q
        public View f7l8() {
            return CardView.this;
        }

        @Override // androidx.cardview.widget.InterfaceC0244q
        /* JADX INFO: renamed from: g */
        public boolean mo784g() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // androidx.cardview.widget.InterfaceC0244q
        /* JADX INFO: renamed from: k */
        public void mo785k(int i2, int i3, int i4, int i5) {
            CardView.this.f1296s.set(i2, i3, i4, i5);
            CardView cardView = CardView.this;
            Rect rect = cardView.f1297y;
            CardView.super.setPadding(i2 + rect.left, i3 + rect.top, i4 + rect.right, i5 + rect.bottom);
        }

        @Override // androidx.cardview.widget.InterfaceC0244q
        /* JADX INFO: renamed from: n */
        public void mo786n(int i2, int i3) {
            CardView cardView = CardView.this;
            if (i2 > cardView.f1293n) {
                CardView.super.setMinimumWidth(i2);
            }
            CardView cardView2 = CardView.this;
            if (i3 > cardView2.f1291g) {
                CardView.super.setMinimumHeight(i3);
            }
        }

        @Override // androidx.cardview.widget.InterfaceC0244q
        /* JADX INFO: renamed from: q */
        public Drawable mo787q() {
            return this.f1298k;
        }

        @Override // androidx.cardview.widget.InterfaceC0244q
        public void toq(Drawable drawable) {
            this.f1298k = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // androidx.cardview.widget.InterfaceC0244q
        public boolean zy() {
            return CardView.this.getUseCompatPadding();
        }
    }

    static {
        toq toqVar = new toq();
        f1290i = toqVar;
        toqVar.x2();
    }

    public CardView(@lvui Context context) {
        this(context, null);
    }

    @lvui
    public ColorStateList getCardBackgroundColor() {
        return f1290i.mo806n(this.f1294p);
    }

    public float getCardElevation() {
        return f1290i.mo809s(this.f1294p);
    }

    @InterfaceC7833l
    public int getContentPaddingBottom() {
        return this.f1297y.bottom;
    }

    @InterfaceC7833l
    public int getContentPaddingLeft() {
        return this.f1297y.left;
    }

    @InterfaceC7833l
    public int getContentPaddingRight() {
        return this.f1297y.right;
    }

    @InterfaceC7833l
    public int getContentPaddingTop() {
        return this.f1297y.top;
    }

    public float getMaxCardElevation() {
        return f1290i.mo808q(this.f1294p);
    }

    public boolean getPreventCornerOverlap() {
        return this.f1295q;
    }

    public float getRadius() {
        return f1290i.toq(this.f1294p);
    }

    public boolean getUseCompatPadding() {
        return this.f1292k;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        if (f1290i instanceof toq) {
            super.onMeasure(i2, i3);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        if (mode == Integer.MIN_VALUE || mode == 1073741824) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.qrj(this.f1294p)), View.MeasureSpec.getSize(i2)), mode);
        }
        int mode2 = View.MeasureSpec.getMode(i3);
        if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
            i3 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.mo804g(this.f1294p)), View.MeasureSpec.getSize(i3)), mode2);
        }
        super.onMeasure(i2, i3);
    }

    public void setCardBackgroundColor(@x2 int i2) {
        f1290i.n7h(this.f1294p, ColorStateList.valueOf(i2));
    }

    public void setCardElevation(float f2) {
        f1290i.zy(this.f1294p, f2);
    }

    public void setContentPadding(@InterfaceC7833l int i2, @InterfaceC7833l int i3, @InterfaceC7833l int i4, @InterfaceC7833l int i5) {
        this.f1297y.set(i2, i3, i4, i5);
        f1290i.ld6(this.f1294p);
    }

    public void setMaxCardElevation(float f2) {
        f1290i.kja0(this.f1294p, f2);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i2) {
        this.f1291g = i2;
        super.setMinimumHeight(i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i2) {
        this.f1293n = i2;
        super.setMinimumWidth(i2);
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
    }

    public void setPreventCornerOverlap(boolean z2) {
        if (z2 != this.f1295q) {
            this.f1295q = z2;
            f1290i.f7l8(this.f1294p);
        }
    }

    public void setRadius(float f2) {
        f1290i.mo805k(this.f1294p, f2);
    }

    public void setUseCompatPadding(boolean z2) {
        if (this.f1292k != z2) {
            this.f1292k = z2;
            f1290i.mo807p(this.f1294p);
        }
    }

    public CardView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C7748k.k.f99905f7l8);
    }

    public void setCardBackgroundColor(@dd ColorStateList colorStateList) {
        f1290i.n7h(this.f1294p, colorStateList);
    }

    public CardView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int color;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i2);
        Rect rect = new Rect();
        this.f1297y = rect;
        this.f1296s = new Rect();
        C0239k c0239k = new C0239k();
        this.f1294p = c0239k;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7748k.n.f45619k, i2, C7748k.q.f99917toq);
        int i3 = C7748k.n.f45622q;
        if (typedArrayObtainStyledAttributes.hasValue(i3)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(i3);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f1289h);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(C7748k.toq.f99919toq);
            } else {
                color = getResources().getColor(C7748k.toq.f45627k);
            }
            colorStateListValueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(C7748k.n.f45620n, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(C7748k.n.f45618g, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(C7748k.n.f99910f7l8, 0.0f);
        this.f1292k = typedArrayObtainStyledAttributes.getBoolean(C7748k.n.f45623s, false);
        this.f1295q = typedArrayObtainStyledAttributes.getBoolean(C7748k.n.f45624y, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7748k.n.f45621p, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7748k.n.f99915x2, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7748k.n.f99912n7h, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7748k.n.f99913qrj, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7748k.n.f99911ld6, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f1293n = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7748k.n.f99914toq, 0);
        this.f1291g = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7748k.n.f99916zy, 0);
        typedArrayObtainStyledAttributes.recycle();
        f1290i.mo810y(c0239k, context, colorStateList, dimension, dimension2, f2);
    }
}

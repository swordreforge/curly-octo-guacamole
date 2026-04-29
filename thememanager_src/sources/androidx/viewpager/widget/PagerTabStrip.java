package androidx.viewpager.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.core.content.C0498q;
import androidx.core.view.C0683f;
import zy.dd;
import zy.fn3e;
import zy.lvui;
import zy.n7h;
import zy.x2;

/* JADX INFO: loaded from: classes.dex */
public class PagerTabStrip extends PagerTitleStrip {
    private static final int ac = 32;
    private static final int as = 3;
    private static final int ax = 64;
    private static final int az = 16;
    private static final int ba = 32;
    private static final int bg = 6;
    private static final String bl = "PagerTabStrip";
    private static final int bq = 1;

    /* JADX INFO: renamed from: a */
    private int f6974a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f53683ab;
    private float an;

    /* JADX INFO: renamed from: b */
    private int f6975b;
    private boolean bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f53684bo;
    private int bp;
    private boolean bv;

    /* JADX INFO: renamed from: d */
    private final Rect f6976d;
    private float id;
    private int in;

    /* JADX INFO: renamed from: m */
    private int f6977m;

    /* JADX INFO: renamed from: u */
    private int f6978u;

    /* JADX INFO: renamed from: v */
    private final Paint f6979v;

    /* JADX INFO: renamed from: w */
    private int f6980w;

    /* JADX INFO: renamed from: x */
    private int f6981x;

    /* JADX INFO: renamed from: androidx.viewpager.widget.PagerTabStrip$k */
    class ViewOnClickListenerC1278k implements View.OnClickListener {
        ViewOnClickListenerC1278k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PagerTabStrip.this.f6992k.setCurrentItem(r2.getCurrentItem() - 1);
        }
    }

    class toq implements View.OnClickListener {
        toq() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ViewPager viewPager = PagerTabStrip.this.f6992k;
            viewPager.setCurrentItem(viewPager.getCurrentItem() + 1);
        }
    }

    public PagerTabStrip(@lvui Context context) {
        this(context, null);
    }

    public boolean getDrawFullUnderline() {
        return this.f53683ab;
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    int getMinHeight() {
        return Math.max(super.getMinHeight(), this.f6978u);
    }

    @x2
    public int getTabIndicatorColor() {
        return this.f6977m;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int height = getHeight();
        int left = this.f6994n.getLeft() - this.f53684bo;
        int right = this.f6994n.getRight() + this.f53684bo;
        int i2 = height - this.f6975b;
        this.f6979v.setColor((this.f6980w << 24) | (this.f6977m & C0683f.f50797t8r));
        float f2 = height;
        canvas.drawRect(left, i2, right, f2, this.f6979v);
        if (this.f53683ab) {
            this.f6979v.setColor((-16777216) | (this.f6977m & C0683f.f50797t8r));
            canvas.drawRect(getPaddingLeft(), height - this.bp, getWidth() - getPaddingRight(), f2, this.f6979v);
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0 && this.bv) {
            return false;
        }
        float x3 = motionEvent.getX();
        float y3 = motionEvent.getY();
        if (action == 0) {
            this.an = x3;
            this.id = y3;
            this.bv = false;
        } else if (action != 1) {
            if (action == 2 && (Math.abs(x3 - this.an) > this.in || Math.abs(y3 - this.id) > this.in)) {
                this.bv = true;
            }
        } else if (x3 < this.f6994n.getLeft() - this.f53684bo) {
            ViewPager viewPager = this.f6992k;
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        } else if (x3 > this.f6994n.getRight() + this.f53684bo) {
            ViewPager viewPager2 = this.f6992k;
            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1);
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundColor(@x2 int i2) {
        super.setBackgroundColor(i2);
        if (this.bb) {
            return;
        }
        this.f53683ab = (i2 & (-16777216)) == 0;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        if (this.bb) {
            return;
        }
        this.f53683ab = drawable == null;
    }

    @Override // android.view.View
    public void setBackgroundResource(@fn3e int i2) {
        super.setBackgroundResource(i2);
        if (this.bb) {
            return;
        }
        this.f53683ab = i2 == 0;
    }

    public void setDrawFullUnderline(boolean z2) {
        this.f53683ab = z2;
        this.bb = true;
        invalidate();
    }

    @Override // android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        int i6 = this.f6974a;
        if (i5 < i6) {
            i5 = i6;
        }
        super.setPadding(i2, i3, i4, i5);
    }

    public void setTabIndicatorColor(@x2 int i2) {
        this.f6977m = i2;
        this.f6979v.setColor(i2);
        invalidate();
    }

    public void setTabIndicatorColorResource(@n7h int i2) {
        setTabIndicatorColor(C0498q.m2252g(getContext(), i2));
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    public void setTextSpacing(int i2) {
        int i3 = this.f6981x;
        if (i2 < i3) {
            i2 = i3;
        }
        super.setTextSpacing(i2);
    }

    @Override // androidx.viewpager.widget.PagerTitleStrip
    void zy(int i2, float f2, boolean z2) {
        Rect rect = this.f6976d;
        int height = getHeight();
        int left = this.f6994n.getLeft() - this.f53684bo;
        int right = this.f6994n.getRight() + this.f53684bo;
        int i3 = height - this.f6975b;
        rect.set(left, i3, right, height);
        super.zy(i2, f2, z2);
        this.f6980w = (int) (Math.abs(f2 - 0.5f) * 2.0f * 255.0f);
        rect.union(this.f6994n.getLeft() - this.f53684bo, i3, this.f6994n.getRight() + this.f53684bo, height);
        invalidate(rect);
    }

    public PagerTabStrip(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        Paint paint = new Paint();
        this.f6979v = paint;
        this.f6976d = new Rect();
        this.f6980w = 255;
        this.f53683ab = false;
        this.bb = false;
        int i2 = this.f6988f;
        this.f6977m = i2;
        paint.setColor(i2);
        float f2 = context.getResources().getDisplayMetrics().density;
        this.f6975b = (int) ((3.0f * f2) + 0.5f);
        this.f6974a = (int) ((6.0f * f2) + 0.5f);
        this.f6981x = (int) (64.0f * f2);
        this.f53684bo = (int) ((16.0f * f2) + 0.5f);
        this.bp = (int) ((1.0f * f2) + 0.5f);
        this.f6978u = (int) ((f2 * 32.0f) + 0.5f);
        this.in = ViewConfiguration.get(context).getScaledTouchSlop();
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        setTextSpacing(getTextSpacing());
        setWillNotDraw(false);
        this.f6996q.setFocusable(true);
        this.f6996q.setOnClickListener(new ViewOnClickListenerC1278k());
        this.f6989g.setFocusable(true);
        this.f6989g.setOnClickListener(new toq());
        if (getBackground() == null) {
            this.f53683ab = true;
        }
    }
}

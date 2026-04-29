package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.C0394g;

/* JADX INFO: loaded from: classes.dex */
public class MockView extends View {

    /* JADX INFO: renamed from: g */
    private boolean f2535g;

    /* JADX INFO: renamed from: h */
    private int f2536h;

    /* JADX INFO: renamed from: i */
    private int f2537i;

    /* JADX INFO: renamed from: k */
    private Paint f2538k;

    /* JADX INFO: renamed from: n */
    private Paint f2539n;

    /* JADX INFO: renamed from: p */
    private Rect f2540p;

    /* JADX INFO: renamed from: q */
    private Paint f2541q;

    /* JADX INFO: renamed from: s */
    protected String f2542s;

    /* JADX INFO: renamed from: t */
    private int f2543t;

    /* JADX INFO: renamed from: y */
    private boolean f2544y;

    /* JADX INFO: renamed from: z */
    private int f2545z;

    public MockView(Context context) {
        super(context);
        this.f2538k = new Paint();
        this.f2541q = new Paint();
        this.f2539n = new Paint();
        this.f2535g = true;
        this.f2544y = true;
        this.f2542s = null;
        this.f2540p = new Rect();
        this.f2536h = Color.argb(255, 0, 0, 0);
        this.f2537i = Color.argb(255, 200, 200, 200);
        this.f2545z = Color.argb(255, 50, 50, 50);
        this.f2543t = 4;
        m1609k(context, null);
    }

    /* JADX INFO: renamed from: k */
    private void m1609k(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, C0394g.qrj.aof);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.gr) {
                    this.f2542s = typedArrayObtainStyledAttributes.getString(index);
                } else if (index == C0394g.qrj.sxpt) {
                    this.f2535g = typedArrayObtainStyledAttributes.getBoolean(index, this.f2535g);
                } else if (index == C0394g.qrj.kzk) {
                    this.f2536h = typedArrayObtainStyledAttributes.getColor(index, this.f2536h);
                } else if (index == C0394g.qrj.mz) {
                    this.f2545z = typedArrayObtainStyledAttributes.getColor(index, this.f2545z);
                } else if (index == C0394g.qrj.rg) {
                    this.f2537i = typedArrayObtainStyledAttributes.getColor(index, this.f2537i);
                } else if (index == C0394g.qrj.yza) {
                    this.f2544y = typedArrayObtainStyledAttributes.getBoolean(index, this.f2544y);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.f2542s == null) {
            try {
                this.f2542s = context.getResources().getResourceEntryName(getId());
            } catch (Exception unused) {
            }
        }
        this.f2538k.setColor(this.f2536h);
        this.f2538k.setAntiAlias(true);
        this.f2541q.setColor(this.f2537i);
        this.f2541q.setAntiAlias(true);
        this.f2539n.setColor(this.f2545z);
        this.f2543t = Math.round(this.f2543t * (getResources().getDisplayMetrics().xdpi / 160.0f));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f2535g) {
            width--;
            height--;
            float f2 = width;
            float f3 = height;
            canvas.drawLine(0.0f, 0.0f, f2, f3, this.f2538k);
            canvas.drawLine(0.0f, f3, f2, 0.0f, this.f2538k);
            canvas.drawLine(0.0f, 0.0f, f2, 0.0f, this.f2538k);
            canvas.drawLine(f2, 0.0f, f2, f3, this.f2538k);
            canvas.drawLine(f2, f3, 0.0f, f3, this.f2538k);
            canvas.drawLine(0.0f, f3, 0.0f, 0.0f, this.f2538k);
        }
        String str = this.f2542s;
        if (str == null || !this.f2544y) {
            return;
        }
        this.f2541q.getTextBounds(str, 0, str.length(), this.f2540p);
        float fWidth = (width - this.f2540p.width()) / 2.0f;
        float fHeight = ((height - this.f2540p.height()) / 2.0f) + this.f2540p.height();
        this.f2540p.offset((int) fWidth, (int) fHeight);
        Rect rect = this.f2540p;
        int i2 = rect.left;
        int i3 = this.f2543t;
        rect.set(i2 - i3, rect.top - i3, rect.right + i3, rect.bottom + i3);
        canvas.drawRect(this.f2540p, this.f2539n);
        canvas.drawText(this.f2542s, fWidth, fHeight, this.f2541q);
    }

    public MockView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2538k = new Paint();
        this.f2541q = new Paint();
        this.f2539n = new Paint();
        this.f2535g = true;
        this.f2544y = true;
        this.f2542s = null;
        this.f2540p = new Rect();
        this.f2536h = Color.argb(255, 0, 0, 0);
        this.f2537i = Color.argb(255, 200, 200, 200);
        this.f2545z = Color.argb(255, 50, 50, 50);
        this.f2543t = 4;
        m1609k(context, attrs);
    }

    public MockView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2538k = new Paint();
        this.f2541q = new Paint();
        this.f2539n = new Paint();
        this.f2535g = true;
        this.f2544y = true;
        this.f2542s = null;
        this.f2540p = new Rect();
        this.f2536h = Color.argb(255, 0, 0, 0);
        this.f2537i = Color.argb(255, 200, 200, 200);
        this.f2545z = Color.argb(255, 50, 50, 50);
        this.f2543t = 4;
        m1609k(context, attrs);
    }
}

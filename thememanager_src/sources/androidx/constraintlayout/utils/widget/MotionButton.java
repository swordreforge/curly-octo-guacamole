package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import androidx.constraintlayout.widget.C0394g;
import zy.hyr;

/* JADX INFO: loaded from: classes.dex */
public class MotionButton extends AppCompatButton {

    /* JADX INFO: renamed from: g */
    private float f2546g;

    /* JADX INFO: renamed from: h */
    RectF f2547h;

    /* JADX INFO: renamed from: p */
    ViewOutlineProvider f2548p;

    /* JADX INFO: renamed from: s */
    private Path f2549s;

    /* JADX INFO: renamed from: y */
    private float f2550y;

    /* JADX INFO: renamed from: androidx.constraintlayout.utils.widget.MotionButton$k */
    class C0388k extends ViewOutlineProvider {
        C0388k() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), (Math.min(r3, r4) * MotionButton.this.f2546g) / 2.0f);
        }
    }

    class toq extends ViewOutlineProvider {
        toq() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.f2550y);
        }
    }

    public MotionButton(Context context) {
        super(context);
        this.f2546g = 0.0f;
        this.f2550y = Float.NaN;
        zy(context, null);
    }

    private void zy(Context context, AttributeSet attrs) {
        setPadding(0, 0, 0, 0);
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.pku);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.ewa) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == C0394g.qrj.gxqa) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }

    public float getRound() {
        return this.f2550y;
    }

    public float getRoundPercent() {
        return this.f2546g;
    }

    @hyr(21)
    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.f2550y = round;
            float f2 = this.f2546g;
            this.f2546g = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z2 = this.f2550y != round;
        this.f2550y = round;
        if (round != 0.0f) {
            if (this.f2549s == null) {
                this.f2549s = new Path();
            }
            if (this.f2547h == null) {
                this.f2547h = new RectF();
            }
            if (this.f2548p == null) {
                toq toqVar = new toq();
                this.f2548p = toqVar;
                setOutlineProvider(toqVar);
            }
            setClipToOutline(true);
            this.f2547h.set(0.0f, 0.0f, getWidth(), getHeight());
            this.f2549s.reset();
            Path path = this.f2549s;
            RectF rectF = this.f2547h;
            float f3 = this.f2550y;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    @hyr(21)
    public void setRoundPercent(float round) {
        boolean z2 = this.f2546g != round;
        this.f2546g = round;
        if (round != 0.0f) {
            if (this.f2549s == null) {
                this.f2549s = new Path();
            }
            if (this.f2547h == null) {
                this.f2547h = new RectF();
            }
            if (this.f2548p == null) {
                C0388k c0388k = new C0388k();
                this.f2548p = c0388k;
                setOutlineProvider(c0388k);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.f2546g) / 2.0f;
            this.f2547h.set(0.0f, 0.0f, width, height);
            this.f2549s.reset();
            this.f2549s.addRoundRect(this.f2547h, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z2) {
            invalidateOutline();
        }
    }

    public MotionButton(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2546g = 0.0f;
        this.f2550y = Float.NaN;
        zy(context, attrs);
    }

    public MotionButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2546g = 0.0f;
        this.f2550y = Float.NaN;
        zy(context, attrs);
    }
}

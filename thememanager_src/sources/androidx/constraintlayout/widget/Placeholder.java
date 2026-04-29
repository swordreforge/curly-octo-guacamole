package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.core.widgets.C0341n;
import androidx.constraintlayout.widget.C0394g;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.miui.clock.module.toq;

/* JADX INFO: loaded from: classes.dex */
public class Placeholder extends View {

    /* JADX INFO: renamed from: k */
    private int f2687k;

    /* JADX INFO: renamed from: n */
    private int f2688n;

    /* JADX INFO: renamed from: q */
    private View f2689q;

    public Placeholder(Context context) {
        super(context);
        this.f2687k = -1;
        this.f2689q = null;
        this.f2688n = 4;
        m1629k(null);
    }

    /* JADX INFO: renamed from: k */
    private void m1629k(AttributeSet attrs) {
        super.setVisibility(this.f2688n);
        this.f2687k = -1;
        if (attrs != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, C0394g.qrj.qb8);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == C0394g.qrj.r3w) {
                    this.f2687k = typedArrayObtainStyledAttributes.getResourceId(index, this.f2687k);
                } else if (index == C0394g.qrj.wq) {
                    this.f2688n = typedArrayObtainStyledAttributes.getInt(index, this.f2688n);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public View getContent() {
        return this.f2689q;
    }

    public int getEmptyVisibility() {
        return this.f2688n;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, toq.zy.f72001ld6, toq.zy.f72001ld6, toq.zy.f72001ld6);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public void setContentId(int id) {
        View viewFindViewById;
        if (this.f2687k == id) {
            return;
        }
        View view = this.f2689q;
        if (view != null) {
            view.setVisibility(0);
            ((ConstraintLayout.toq) this.f2689q.getLayoutParams()).f48474bf2 = false;
            this.f2689q = null;
        }
        this.f2687k = id;
        if (id == -1 || (viewFindViewById = ((View) getParent()).findViewById(id)) == null) {
            return;
        }
        viewFindViewById.setVisibility(8);
    }

    public void setEmptyVisibility(int visibility) {
        this.f2688n = visibility;
    }

    public void toq(ConstraintLayout container) {
        if (this.f2689q == null) {
            return;
        }
        ConstraintLayout.toq toqVar = (ConstraintLayout.toq) getLayoutParams();
        ConstraintLayout.toq toqVar2 = (ConstraintLayout.toq) this.f2689q.getLayoutParams();
        toqVar2.f48518y2.m1330w(0);
        C0341n.toq toqVarGvn7 = toqVar.f48518y2.gvn7();
        C0341n.toq toqVar3 = C0341n.toq.FIXED;
        if (toqVarGvn7 != toqVar3) {
            toqVar.f48518y2.m2t(toqVar2.f48518y2.m1313a());
        }
        if (toqVar.f48518y2.bf2() != toqVar3) {
            toqVar.f48518y2.pc(toqVar2.f48518y2.jk());
        }
        toqVar2.f48518y2.m1330w(8);
    }

    public void zy(ConstraintLayout container) {
        if (this.f2687k == -1 && !isInEditMode()) {
            setVisibility(this.f2688n);
        }
        View viewFindViewById = container.findViewById(this.f2687k);
        this.f2689q = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.toq) viewFindViewById.getLayoutParams()).f48474bf2 = true;
            this.f2689q.setVisibility(0);
            setVisibility(0);
        }
    }

    public Placeholder(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f2687k = -1;
        this.f2689q = null;
        this.f2688n = 4;
        m1629k(attrs);
    }

    public Placeholder(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f2687k = -1;
        this.f2689q = null;
        this.f2688n = 4;
        m1629k(attrs);
    }

    public Placeholder(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr);
        this.f2687k = -1;
        this.f2689q = null;
        this.f2688n = 4;
        m1629k(attrs);
    }
}

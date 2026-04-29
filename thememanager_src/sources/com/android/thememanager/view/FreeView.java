package com.android.thememanager.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.android.thememanager.basemodule.utils.y9n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class FreeView extends View {

    /* JADX INFO: renamed from: k */
    private GestureDetector f17273k;

    /* JADX INFO: renamed from: n */
    private Paint f17274n;

    /* JADX INFO: renamed from: q */
    private List<toq> f17275q;

    public static abstract class toq {
        /* JADX INFO: renamed from: g */
        protected void m10241g(long time) {
        }

        /* JADX INFO: renamed from: k */
        protected boolean m10242k(Point p2) {
            return false;
        }

        /* JADX INFO: renamed from: n */
        protected void m10243n(Point p2) {
        }

        /* JADX INFO: renamed from: q */
        public boolean m10244q(MotionEvent e2) {
            if (e2.getPointerCount() != 1) {
                return false;
            }
            Point point = new Point();
            point.x = (int) (((double) e2.getX()) + 0.5d);
            point.y = (int) (((double) e2.getY()) + 0.5d);
            if (!m10242k(point)) {
                return false;
            }
            m10243n(point);
            return true;
        }

        protected abstract void toq(Canvas canvas, Paint paint);

        public void zy(Canvas canvas, Paint paint, long currentTime) {
            m10241g(currentTime);
            toq(canvas, paint);
        }
    }

    private class zy implements GestureDetector.OnGestureListener {
        private zy() {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent e2) {
            return true;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent e2) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
            return false;
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public void onShowPress(MotionEvent e2) {
        }

        @Override // android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent e2) {
            for (int size = FreeView.this.f17275q.size() - 1; size >= 0; size--) {
                if (((toq) FreeView.this.f17275q.get(size)).m10244q(e2)) {
                    return true;
                }
            }
            return false;
        }
    }

    public FreeView(Context context) {
        super(context);
        this.f17275q = new ArrayList();
        zy();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f17275q.isEmpty()) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        Iterator<toq> it = this.f17275q.iterator();
        while (it.hasNext()) {
            it.next().zy(canvas, this.f17274n, jCurrentTimeMillis);
        }
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return this.f17273k.onTouchEvent(event);
    }

    public void toq(toq view) {
        y9n.m7255s();
        if (view != null) {
            this.f17275q.add(view);
            invalidate();
        }
    }

    protected void zy() {
        this.f17273k = new GestureDetector(getContext(), new zy());
        this.f17274n = new Paint();
        setFocusable(true);
    }

    public FreeView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17275q = new ArrayList();
        zy();
    }

    public FreeView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17275q = new ArrayList();
        zy();
    }
}

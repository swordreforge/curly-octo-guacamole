package com.android.thememanager.recommend.view;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1824r;

/* JADX INFO: renamed from: com.android.thememanager.recommend.view.q */
/* JADX INFO: compiled from: GuideMamlWidget.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2452q {

    /* JADX INFO: renamed from: k */
    private static final String f14457k = "GuideMamlWidget";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f60734toq = "guideShowed";

    /* JADX INFO: renamed from: com.android.thememanager.recommend.view.q$k */
    /* JADX INFO: compiled from: GuideMamlWidget.java */
    static class k extends ColorDrawable {

        /* JADX INFO: renamed from: k */
        private final Paint f14458k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Path f60735toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private boolean f60736zy;

        k(int color, int x3, int y3, int radius) {
            super(color);
            Paint paint = new Paint();
            this.f14458k = paint;
            Path path = new Path();
            this.f60735toq = path;
            this.f60736zy = false;
            path.addCircle(x3, y3, radius, Path.Direction.CW);
            path.setFillType(Path.FillType.EVEN_ODD);
            paint.setAntiAlias(true);
            paint.setColor(color);
        }

        @Override // android.graphics.drawable.ColorDrawable, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (!this.f60736zy) {
                this.f60736zy = true;
                Rect bounds = getBounds();
                this.f60735toq.addRect(bounds.left, bounds.top, bounds.right, bounds.bottom, Path.Direction.CW);
            }
            canvas.drawPath(this.f60735toq, this.f14458k);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public static void f7l8(final Activity activity, final View anchor) {
        if (!C1819o.eqxt(activity)) {
            Log.w(f14457k, "invalid activity");
            return;
        }
        final C1824r c1824rM7203y = C1824r.m7203y();
        if (c1824rM7203y.zy(f60734toq, false)) {
            Log.w(f14457k, "showed guide maml widget.");
        } else {
            final ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            anchor.post(new Runnable() { // from class: com.android.thememanager.recommend.view.k
                @Override // java.lang.Runnable
                public final void run() {
                    C2452q.m8811g(anchor, activity, viewGroup, c1824rM7203y);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m8811g(View view, Activity activity, final ViewGroup viewGroup, final C1824r c1824r) {
        int measuredHeight = view.getMeasuredHeight();
        int measuredWidth = view.getMeasuredWidth();
        final FrameLayout frameLayout = (FrameLayout) activity.getLayoutInflater().inflate(R.layout.rc_guide_maml_widget, viewGroup, false);
        final View viewFindViewById = frameLayout.findViewById(R.id.guideText);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) viewFindViewById.getLayoutParams();
        int[] iArr = {0, 0};
        view.getLocationOnScreen(iArr);
        boolean z2 = 1 == activity.getResources().getConfiguration().getLayoutDirection();
        layoutParams.topMargin = iArr[1] + measuredHeight;
        if (z2) {
            layoutParams.rightMargin = ((viewGroup.getMeasuredWidth() - iArr[0]) - view.getMeasuredWidth()) - (measuredWidth / 8);
            layoutParams.gravity = 5;
        } else {
            layoutParams.leftMargin = iArr[0] - (measuredWidth / 8);
        }
        viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: com.android.thememanager.recommend.view.toq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C2452q.m8814q(viewGroup, frameLayout, c1824r, view2);
            }
        });
        final int measuredWidth2 = iArr[0] + (view.getMeasuredWidth() / 2);
        final int i2 = measuredHeight / 2;
        final int i3 = iArr[1] + i2;
        frameLayout.setBackground(new k(-1308622848, measuredWidth2, i3, i2));
        frameLayout.setOnTouchListener(new View.OnTouchListener() { // from class: com.android.thememanager.recommend.view.zy
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return C2452q.m8813n(measuredWidth2, i3, i2, viewFindViewById, view2, motionEvent);
            }
        });
        viewGroup.addView(frameLayout, -1, -1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ boolean m8813n(int i2, int i3, int i4, View view, View view2, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 && Math.sqrt(Math.pow(motionEvent.getX() - i2, 2.0d) + Math.pow(motionEvent.getY() - i3, 2.0d)) < i4) {
            view.callOnClick();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m8814q(ViewGroup viewGroup, FrameLayout frameLayout, C1824r c1824r, View view) {
        viewGroup.removeView(frameLayout);
        c1824r.m7206p(f60734toq, true).m7204k();
    }
}

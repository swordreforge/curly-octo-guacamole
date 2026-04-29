package zwy;

import android.R;
import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: zwy.k */
/* JADX INFO: compiled from: InsetDialogOnTouchListener.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class ViewOnTouchListenerC7823k implements View.OnTouchListener {

    /* JADX INFO: renamed from: g */
    private final int f46149g;

    /* JADX INFO: renamed from: k */
    @lvui
    private final Dialog f46150k;

    /* JADX INFO: renamed from: n */
    private final int f46151n;

    /* JADX INFO: renamed from: q */
    private final int f46152q;

    public ViewOnTouchListenerC7823k(@lvui Dialog dialog, @lvui Rect rect) {
        this.f46150k = dialog;
        this.f46152q = rect.left;
        this.f46151n = rect.top;
        this.f46149g = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(@lvui View view, @lvui MotionEvent motionEvent) {
        View viewFindViewById = view.findViewById(R.id.content);
        int left = this.f46152q + viewFindViewById.getLeft();
        int width = viewFindViewById.getWidth() + left;
        if (new RectF(left, this.f46151n + viewFindViewById.getTop(), width, viewFindViewById.getHeight() + r3).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            motionEventObtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            motionEventObtain.setAction(0);
            int i2 = this.f46149g;
            motionEventObtain.setLocation((-i2) - 1, (-i2) - 1);
        }
        view.performClick();
        return this.f46150k.onTouchEvent(motionEventObtain);
    }
}

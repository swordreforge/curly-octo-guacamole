package miuix.viewpager.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import androidx.viewpager.widget.OriginalViewPager;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class ViewPager extends OriginalViewPager {
    boolean zm;

    public ViewPager(@lvui Context context) {
        super(context);
        this.zm = true;
    }

    public boolean nn86() {
        return this.zm;
    }

    @Override // androidx.viewpager.widget.OriginalViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!this.zm) {
            return false;
        }
        try {
            return super.onInterceptTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            Log.e("ViewPager", "Catch IllegalArgumentException:" + e2);
            return false;
        }
    }

    @Override // androidx.viewpager.widget.OriginalViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.zm) {
            return false;
        }
        try {
            return super.onTouchEvent(motionEvent);
        } catch (IllegalArgumentException e2) {
            Log.e("ViewPager", "Catch IllegalArgumentException:" + e2);
            return false;
        }
    }

    public void setDraggable(boolean z2) {
        this.zm = z2;
    }

    public ViewPager(@lvui Context context, @dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zm = true;
    }
}

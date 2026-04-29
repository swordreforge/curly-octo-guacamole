package miuix.animation.controller;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.AbsListView;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes3.dex */
public class ListViewTouchListener implements View.OnTouchListener {
    private int mTouchSlop;
    private WeakHashMap<View, View.OnTouchListener> mListeners = new WeakHashMap<>();
    private Rect mRect = new Rect();
    private float mDownX = Float.MAX_VALUE;
    private float mDownY = Float.MAX_VALUE;

    ListViewTouchListener(AbsListView absListView) {
        this.mTouchSlop = ViewConfiguration.get(absListView.getContext()).getScaledTouchSlop();
    }

    private View getTouchedItemView(AbsListView absListView, MotionEvent motionEvent) {
        int x3 = (int) motionEvent.getX();
        int y3 = (int) motionEvent.getY();
        int childCount = absListView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = absListView.getChildAt(i2);
            childAt.getLocalVisibleRect(this.mRect);
            this.mRect.offset(childAt.getLeft(), childAt.getTop());
            if (this.mRect.contains(x3, y3)) {
                return childAt;
            }
        }
        return null;
    }

    private void notifyItemListeners(AbsListView absListView, MotionEvent motionEvent, boolean z2) {
        View touchedItemView = getTouchedItemView(absListView, motionEvent);
        for (Map.Entry<View, View.OnTouchListener> entry : this.mListeners.entrySet()) {
            View key = entry.getKey();
            entry.getValue().onTouch(key, !z2 && key == touchedItemView ? motionEvent : null);
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.mDownX = motionEvent.getRawX();
            this.mDownY = motionEvent.getRawY();
        } else {
            if (actionMasked == 2) {
                if (motionEvent.getRawY() - this.mDownY > this.mTouchSlop || motionEvent.getRawX() - this.mDownX > this.mTouchSlop) {
                    z2 = true;
                }
                notifyItemListeners((AbsListView) view, motionEvent, z2);
                return false;
            }
            this.mDownY = Float.MAX_VALUE;
            this.mDownX = Float.MAX_VALUE;
        }
        z2 = false;
        notifyItemListeners((AbsListView) view, motionEvent, z2);
        return false;
    }

    public void putListener(View view, View.OnTouchListener onTouchListener) {
        this.mListeners.put(view, onTouchListener);
    }
}

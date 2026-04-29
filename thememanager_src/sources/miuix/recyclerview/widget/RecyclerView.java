package miuix.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.recyclerview.widget.SpringRecyclerView;
import ncyb.C7401k;
import vss1.C7707k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class RecyclerView extends SpringRecyclerView {

    /* JADX INFO: renamed from: m */
    private static final int f41537m = 300;

    /* JADX INFO: renamed from: o */
    private final C7707k f41538o;

    public RecyclerView(@lvui Context context) {
        this(context, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C7707k c7707k = this.f41538o;
        if (c7707k != null && Build.VERSION.SDK_INT >= 30) {
            c7707k.f7l8(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public boolean fling(int i2, int i3) {
        if (Math.abs(i2) < 300) {
            i2 = 0;
        }
        if (Math.abs(i3) < 300) {
            i3 = 0;
        }
        if (i2 == 0 && i3 == 0) {
            return false;
        }
        return super.fling(i2, i3);
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z2, int i2, @dd Rect rect) {
        super.onFocusChanged(z2, i2, rect);
        C7707k c7707k = this.f41538o;
        if (c7707k == null || Build.VERSION.SDK_INT < 30) {
            return;
        }
        c7707k.m28117q(z2);
    }

    @Override // androidx.recyclerview.widget.SpringRecyclerView, androidx.recyclerview.widget.RecyclerView
    public void onScrollStateChanged(int i2) {
        super.onScrollStateChanged(i2);
        C7707k c7707k = this.f41538o;
        if (c7707k == null || Build.VERSION.SDK_INT < 30) {
            return;
        }
        c7707k.m28116n(this, i2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void onScrolled(int i2, int i3) {
        C7707k c7707k = this.f41538o;
        if (c7707k != null && Build.VERSION.SDK_INT >= 30) {
            c7707k.toq(i2, i3);
        }
        super.onScrolled(i2, i3);
    }

    public RecyclerView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C7401k.k.f93342ki);
    }

    public RecyclerView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        setItemAnimator(new C7318k());
        if (Build.VERSION.SDK_INT > 30) {
            this.f41538o = new C7707k(this);
        } else {
            this.f41538o = null;
        }
    }
}

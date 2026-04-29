package androidx.viewpager.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

/* JADX INFO: loaded from: classes.dex */
public class WallpaperViewPager extends ViewPager {
    public WallpaperViewPager(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: e */
    public View[] m5571e() {
        int childCount = getChildCount();
        if (childCount <= 0) {
            return null;
        }
        View[] viewArr = new View[childCount];
        for (int i2 = 0; i2 < childCount; i2++) {
            viewArr[i2] = getChildAt(i2);
        }
        return viewArr;
    }

    public int getCount() {
        AbstractC1288k adapter = getAdapter();
        return adapter == null ? super.getChildCount() : adapter.mo5575n();
    }

    public View getCurrentView() {
        return vyq(getCurrentItem());
    }

    public View vyq(int position) {
        ViewPager.C1281g c1281gM5566z = super.m5566z(position);
        if (c1281gM5566z != null) {
            Object obj = c1281gM5566z.f7038k;
            if (obj instanceof View) {
                return (View) obj;
            }
        }
        if (c1281gM5566z == null) {
            return null;
        }
        Object obj2 = c1281gM5566z.f7038k;
        if (obj2 instanceof Fragment) {
            return ((Fragment) obj2).getView();
        }
        return null;
    }

    public WallpaperViewPager(Context context, AttributeSet attrs) {
        super(context, attrs);
    }
}

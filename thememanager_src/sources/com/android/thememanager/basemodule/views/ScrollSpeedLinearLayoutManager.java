package com.android.thememanager.basemodule.views;

import android.content.Context;
import android.util.Log;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.t8r;
import androidx.viewpager2.widget.ViewPager2;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
public class ScrollSpeedLinearLayoutManager extends LinearLayoutManager {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57836toq = "ScrollLayoutManager";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f57837zy = 500;

    /* JADX INFO: renamed from: k */
    private C1847k f10568k;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.ScrollSpeedLinearLayoutManager$k */
    private static class C1847k extends t8r {

        /* JADX INFO: renamed from: fu4, reason: collision with root package name */
        private int f57838fu4;

        public C1847k(Context context) {
            super(context);
            this.f57838fu4 = 500;
        }

        public void a9(int scrollTime) {
            this.f57838fu4 = scrollTime;
        }

        @Override // androidx.recyclerview.widget.t8r
        protected int fu4(int dx) {
            return this.f57838fu4;
        }
    }

    public ScrollSpeedLinearLayoutManager(Context context) {
        super(context);
        this.f10568k = new C1847k(context);
    }

    /* JADX INFO: renamed from: k */
    public static void m7323k(ViewPager2 viewPager) {
        try {
            int childCount = viewPager.getChildCount();
            RecyclerView recyclerView = null;
            int i2 = 0;
            while (true) {
                if (i2 < childCount) {
                    if (viewPager.getChildAt(i2) != null && (viewPager.getChildAt(i2) instanceof RecyclerView)) {
                        recyclerView = (RecyclerView) viewPager.getChildAt(i2);
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
            if (recyclerView == null) {
                Log.e(f57836toq, "not find recyclerview");
            }
            recyclerView.setOverScrollMode(2);
            ScrollSpeedLinearLayoutManager scrollSpeedLinearLayoutManager = new ScrollSpeedLinearLayoutManager(viewPager.getContext());
            scrollSpeedLinearLayoutManager.setOrientation(0);
            recyclerView.setLayoutManager(scrollSpeedLinearLayoutManager);
            Field declaredField = ViewPager2.class.getDeclaredField("mLayoutManager");
            declaredField.setAccessible(true);
            declaredField.set(viewPager, scrollSpeedLinearLayoutManager);
            Field declaredField2 = ViewPager2.class.getDeclaredField("mPageTransformerAdapter");
            declaredField2.setAccessible(true);
            Object obj = declaredField2.get(viewPager);
            if (obj != null) {
                Field declaredField3 = obj.getClass().getDeclaredField("mLayoutManager");
                declaredField3.setAccessible(true);
                declaredField3.set(obj, scrollSpeedLinearLayoutManager);
            }
            Field declaredField4 = ViewPager2.class.getDeclaredField("mScrollEventAdapter");
            declaredField4.setAccessible(true);
            Object obj2 = declaredField4.get(viewPager);
            if (obj2 != null) {
                Field declaredField5 = obj2.getClass().getDeclaredField("mLayoutManager");
                declaredField5.setAccessible(true);
                declaredField5.set(obj2, scrollSpeedLinearLayoutManager);
            }
        } catch (Exception e2) {
            Log.e(f57836toq, e2.getMessage());
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC1048h
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.mcp state, int position) {
        this.f10568k.cdj(position);
        startSmoothScroll(this.f10568k);
    }
}

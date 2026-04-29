package com.android.thememanager.v9.view;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.util.gc3c;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeDetailToolbar extends FrameLayout {

    /* JADX INFO: renamed from: g */
    private LinearLayout f17182g;

    /* JADX INFO: renamed from: k */
    private ColorStateList f17183k;

    /* JADX INFO: renamed from: n */
    private toq f17184n;

    /* JADX INFO: renamed from: q */
    private LinearLayout.LayoutParams f17185q;

    /* JADX INFO: renamed from: com.android.thememanager.v9.view.ThemeDetailToolbar$k */
    class ViewOnClickListenerC2875k implements View.OnClickListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f17186k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ TextView f17188q;

        ViewOnClickListenerC2875k(final int val$fi, final TextView val$tabView) {
            this.f17186k = val$fi;
            this.f17188q = val$tabView;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            ThemeDetailToolbar.this.toq(this.f17186k);
            if (ThemeDetailToolbar.this.f17184n != null) {
                ThemeDetailToolbar.this.f17184n.m10211k(this.f17188q, this.f17186k);
            }
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void m10211k(TextView view, int position);
    }

    public ThemeDetailToolbar(@lvui Context context) {
        this(context, null);
    }

    public void setOnBackClickListener(@dd View.OnClickListener listener) {
        findViewById(R.id.back).setOnClickListener(listener);
    }

    public void setOnTabClickListener(toq onTabClickListener) {
        this.f17184n = onTabClickListener;
    }

    public void setTabStrings(int[] ids) {
        this.f17182g.removeAllViews();
        if (ids == null) {
            return;
        }
        for (int i2 = 0; i2 < ids.length; i2++) {
            int i3 = ids[i2];
            TextView textView = new TextView(getContext());
            textView.setText(i3);
            textView.setTextColor(this.f17183k);
            textView.setTextSize(15.0f);
            textView.setGravity(17);
            LinearLayout.LayoutParams layoutParams = this.f17185q;
            layoutParams.weight = 1.0f;
            this.f17182g.addView(textView, layoutParams);
            textView.setOnClickListener(new ViewOnClickListenerC2875k(i2, textView));
        }
    }

    public void setTabVisible(int index, boolean visible) {
        int childCount = this.f17182g.getChildCount();
        if (childCount == 0) {
            return;
        }
        this.f17182g.getChildAt(Math.min(Math.max(index, 0), childCount - 1)).setVisibility(visible ? 0 : 8);
    }

    public void toq(int index) {
        int childCount = this.f17182g.getChildCount();
        if (childCount == 0) {
            return;
        }
        int iMin = Math.min(Math.max(index, 0), childCount - 1);
        int i2 = 0;
        while (i2 < childCount) {
            this.f17182g.getChildAt(i2).setSelected(i2 == iMin);
            i2++;
        }
    }

    public ThemeDetailToolbar(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public ThemeDetailToolbar(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f17183k = kja0.f7l8(R.color.action_bar_theme_tab_text_color);
        this.f17185q = new LinearLayout.LayoutParams(0, -1);
        LayoutInflater.from(context).inflate(R.layout.resource_detail_online_theme_toolbar, (ViewGroup) this, true);
        setBackgroundResource(R.drawable.shape_background_with_bottom_line);
        setPadding(0, gc3c.qrj(getResources()), 0, 0);
        setClickable(true);
        this.f17182g = (LinearLayout) findViewById(R.id.tabs);
        toq(0);
    }
}

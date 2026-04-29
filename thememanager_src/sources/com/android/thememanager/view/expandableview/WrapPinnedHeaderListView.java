package com.android.thememanager.view.expandableview;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListAdapter;
import com.android.thememanager.view.expandableview.PinnedHeaderListView;

/* JADX INFO: loaded from: classes2.dex */
public class WrapPinnedHeaderListView extends FrameLayout {

    /* JADX INFO: renamed from: k */
    private PinnedHeaderListView f17525k;

    /* JADX INFO: renamed from: q */
    private View f17526q;

    /* JADX INFO: renamed from: com.android.thememanager.view.expandableview.WrapPinnedHeaderListView$k */
    class C2914k implements PinnedHeaderListView.InterfaceC2913k {
        C2914k() {
        }

        @Override // com.android.thememanager.view.expandableview.PinnedHeaderListView.InterfaceC2913k
        /* JADX INFO: renamed from: k */
        public void mo10344k(String contentDes, int height, boolean isShow) {
            WrapPinnedHeaderListView.this.f17526q.getLayoutParams().height = height;
            WrapPinnedHeaderListView.this.setPlaceContentDescription(contentDes);
            WrapPinnedHeaderListView.this.setPlaceViewVisibility(isShow);
        }
    }

    public WrapPinnedHeaderListView(Context context) {
        super(context);
        m10348q(context, null, 0);
    }

    /* JADX INFO: renamed from: q */
    private void m10348q(Context context, AttributeSet attrs, int defStyle) {
        PinnedHeaderListView pinnedHeaderListView = new PinnedHeaderListView(context);
        this.f17525k = pinnedHeaderListView;
        addView(pinnedHeaderListView);
        this.f17526q = new FrameLayout(context);
        addView(this.f17526q, new FrameLayout.LayoutParams(-1, 138));
        this.f17526q.setBackgroundColor(Color.parseColor("#00000000"));
        this.f17526q.setFocusableInTouchMode(true);
        this.f17526q.setClickable(true);
        this.f17526q.setImportantForAccessibility(2);
        this.f17525k.setOnHeaderViewUpdateListener(new C2914k());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceContentDescription(CharSequence contentDescription) {
        this.f17526q.setContentDescription(contentDescription);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceViewVisibility(boolean isShow) {
        if (!isShow) {
            this.f17526q.setVisibility(8);
        } else {
            this.f17526q.setVisibility(0);
            this.f17526q.setImportantForAccessibility(1);
        }
    }

    public PinnedHeaderListView getListView() {
        return this.f17525k;
    }

    public void setAdapter(ListAdapter adapter) {
        this.f17525k.setAdapter(adapter);
    }

    public void setEmptyView(View emptyView) {
        this.f17525k.setEmptyView(emptyView);
    }

    public void setOnItemClickListener(AdapterView.OnItemClickListener listener) {
        this.f17525k.setOnItemClickListener(listener);
    }

    public WrapPinnedHeaderListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        m10348q(context, attrs, 0);
    }

    public WrapPinnedHeaderListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        m10348q(context, attrs, defStyle);
    }
}

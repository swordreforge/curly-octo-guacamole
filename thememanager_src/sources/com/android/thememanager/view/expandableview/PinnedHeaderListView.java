package com.android.thememanager.view.expandableview;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class PinnedHeaderListView extends ListView implements AbsListView.OnScrollListener {

    /* JADX INFO: renamed from: g */
    private int f17515g;

    /* JADX INFO: renamed from: h */
    private int f17516h;

    /* JADX INFO: renamed from: i */
    private int f17517i;

    /* JADX INFO: renamed from: k */
    private AbsListView.OnScrollListener f17518k;

    /* JADX INFO: renamed from: n */
    private View f17519n;

    /* JADX INFO: renamed from: p */
    private int f17520p;

    /* JADX INFO: renamed from: q */
    private zy f17521q;

    /* JADX INFO: renamed from: s */
    private boolean f17522s;

    /* JADX INFO: renamed from: y */
    private float f17523y;

    /* JADX INFO: renamed from: z */
    private InterfaceC2913k f17524z;

    /* JADX INFO: renamed from: com.android.thememanager.view.expandableview.PinnedHeaderListView$k */
    public interface InterfaceC2913k {
        /* JADX INFO: renamed from: k */
        void mo10344k(String contentDes, int height, boolean isShow);
    }

    public static abstract class toq implements AdapterView.OnItemClickListener {
        /* JADX INFO: renamed from: k */
        public abstract void m10345k(AdapterView<?> adapterView, View view, int section, int position, long id);

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int rawPosition, long id) {
            AbstractC2915k abstractC2915k = adapterView.getAdapter().getClass().equals(HeaderViewListAdapter.class) ? (AbstractC2915k) ((HeaderViewListAdapter) adapterView.getAdapter()).getWrappedAdapter() : (AbstractC2915k) adapterView.getAdapter();
            int sectionForPosition = abstractC2915k.getSectionForPosition(rawPosition);
            int iM10351p = abstractC2915k.m10351p(rawPosition);
            if (iM10351p == -1) {
                toq(adapterView, view, sectionForPosition, id);
            } else {
                m10345k(adapterView, view, sectionForPosition, iM10351p, id);
            }
        }

        public abstract void toq(AdapterView<?> adapterView, View view, int section, long id);
    }

    public interface zy {
        int getCount();

        int getSectionForPosition(int position);

        /* JADX INFO: renamed from: k */
        boolean mo10346k(int position);

        View toq(int section, View convertView, ViewGroup parent);

        int zy(int section);
    }

    public PinnedHeaderListView(Context context) {
        super(context);
        this.f17515g = 0;
        this.f17522s = true;
        this.f17520p = 0;
        super.setOnScrollListener(this);
    }

    /* JADX INFO: renamed from: k */
    private void m10342k(View header) {
        if (header.isLayoutRequested()) {
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), this.f17516h);
            ViewGroup.LayoutParams layoutParams = header.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = new ViewGroup.LayoutParams(-2, -2);
                header.setLayoutParams(layoutParams);
            }
            int i2 = layoutParams.height;
            header.measure(iMakeMeasureSpec, i2 > 0 ? View.MeasureSpec.makeMeasureSpec(i2, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            header.layout(0, 0, header.getMeasuredWidth(), header.getMeasuredHeight());
        }
    }

    /* JADX INFO: renamed from: q */
    private List<CharSequence> m10343q(View view) {
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
        try {
            accessibilityEventObtain.setClassName(getClass().getName());
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
            view.dispatchPopulateAccessibilityEvent(accessibilityEventObtain);
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(accessibilityEventObtain.getText());
            return arrayList;
        } finally {
            accessibilityEventObtain.recycle();
        }
    }

    private String toq(View view) {
        List<CharSequence> listM10343q = m10343q(view);
        String str = "";
        for (int i2 = 0; i2 < listM10343q.size(); i2++) {
            str = i2 == 0 ? str + ((Object) listM10343q.get(i2)) : (str + ",") + ((Object) listM10343q.get(i2));
        }
        return str;
    }

    private View zy(int section, View oldView) {
        boolean z2 = section != this.f17520p || oldView == null;
        View qVar = this.f17521q.toq(section, oldView, this);
        if (z2) {
            m10342k(qVar);
            this.f17520p = section;
        }
        return qVar;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.f17521q == null || !this.f17522s || this.f17519n == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(0.0f, this.f17523y);
        canvas.clipRect(0, 0, getWidth(), this.f17519n.getMeasuredHeight());
        this.f17519n.draw(canvas);
        canvas.restoreToCount(iSave);
    }

    public View getCurrentHeader() {
        return this.f17519n;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.f17516h = View.MeasureSpec.getMode(widthMeasureSpec);
        this.f17517i = View.MeasureSpec.getMode(heightMeasureSpec);
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        AbsListView.OnScrollListener onScrollListener = this.f17518k;
        if (onScrollListener != null) {
            onScrollListener.onScroll(view, firstVisibleItem, visibleItemCount, totalItemCount);
        }
        zy zyVar = this.f17521q;
        if (zyVar == null || zyVar.getCount() == 0 || !this.f17522s || firstVisibleItem < getHeaderViewsCount()) {
            this.f17519n = null;
            this.f17523y = 0.0f;
            for (int i2 = firstVisibleItem; i2 < firstVisibleItem + visibleItemCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt != null) {
                    childAt.setVisibility(0);
                }
            }
            return;
        }
        int headerViewsCount = firstVisibleItem - getHeaderViewsCount();
        int sectionForPosition = this.f17521q.getSectionForPosition(headerViewsCount);
        int iZy = this.f17521q.zy(sectionForPosition);
        View viewZy = zy(sectionForPosition, this.f17515g == iZy ? this.f17519n : null);
        this.f17519n = viewZy;
        m10342k(viewZy);
        this.f17515g = iZy;
        if (this.f17524z != null) {
            this.f17524z.mo10344k(toq(this.f17519n), this.f17519n.getMeasuredHeight(), true);
        }
        this.f17523y = 0.0f;
        for (int i3 = headerViewsCount; i3 < headerViewsCount + visibleItemCount; i3++) {
            if (this.f17521q.mo10346k(i3)) {
                View childAt2 = getChildAt(i3 - headerViewsCount);
                float top = childAt2.getTop();
                float measuredHeight = this.f17519n.getMeasuredHeight();
                childAt2.setVisibility(0);
                if (measuredHeight >= top && top > 0.0f) {
                    this.f17523y = top - this.f17519n.getHeight();
                } else if (top <= 0.0f) {
                    childAt2.setVisibility(4);
                }
            }
        }
        invalidate();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        AbsListView.OnScrollListener onScrollListener = this.f17518k;
        if (onScrollListener != null) {
            onScrollListener.onScrollStateChanged(view, scrollState);
        }
    }

    public void setOnHeaderViewUpdateListener(InterfaceC2913k listener) {
        this.f17524z = listener;
    }

    public void setOnItemClickListener(toq listener) {
        super.setOnItemClickListener((AdapterView.OnItemClickListener) listener);
    }

    @Override // android.widget.AbsListView
    public void setOnScrollListener(AbsListView.OnScrollListener l2) {
        this.f17518k = l2;
    }

    public void setPinHeaders(boolean shouldPin) {
        this.f17522s = shouldPin;
    }

    @Override // android.widget.AdapterView
    public void setAdapter(ListAdapter adapter) {
        this.f17519n = null;
        this.f17521q = (zy) adapter;
        super.setAdapter(adapter);
    }

    public PinnedHeaderListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f17515g = 0;
        this.f17522s = true;
        this.f17520p = 0;
        super.setOnScrollListener(this);
    }

    public PinnedHeaderListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f17515g = 0;
        this.f17522s = true;
        this.f17520p = 0;
        super.setOnScrollListener(this);
    }
}

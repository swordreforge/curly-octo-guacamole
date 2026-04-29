package com.android.thememanager.basemodule.views.nav;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class NavViewContainer extends LinearLayout {

    /* JADX INFO: renamed from: g */
    protected View.OnClickListener f10600g;

    /* JADX INFO: renamed from: k */
    private InterfaceC1856q f10601k;

    /* JADX INFO: renamed from: n */
    protected int f10602n;

    /* JADX INFO: renamed from: q */
    protected NavItemView f10603q;

    /* JADX INFO: renamed from: s */
    private GestureDetector f10604s;

    /* JADX INFO: renamed from: y */
    protected View.OnTouchListener f10605y;

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.nav.NavViewContainer$k */
    class ViewOnClickListenerC1855k implements View.OnClickListener {
        ViewOnClickListenerC1855k() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v2) {
            int iIntValue = ((Integer) v2.getTag()).intValue();
            NavViewContainer navViewContainer = NavViewContainer.this;
            if (iIntValue == navViewContainer.f10602n) {
                return;
            }
            navViewContainer.setSelectedPosition(iIntValue);
            if (NavViewContainer.this.f10601k != null) {
                NavViewContainer.this.f10601k.mo6323k(iIntValue);
            }
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.basemodule.views.nav.NavViewContainer$q */
    public interface InterfaceC1856q {
        /* JADX INFO: renamed from: k */
        void mo6323k(int position);

        void toq();
    }

    class toq implements View.OnTouchListener {
        toq() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View v2, MotionEvent event) {
            return NavViewContainer.this.f10604s.onTouchEvent(event);
        }
    }

    class zy extends GestureDetector.SimpleOnGestureListener {
        zy() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e2) {
            if (NavViewContainer.this.f10601k != null) {
                NavViewContainer.this.f10601k.toq();
            }
            return super.onDoubleTap(e2);
        }
    }

    public NavViewContainer(Context context) {
        super(context);
        this.f10602n = -1;
        this.f10600g = new ViewOnClickListenerC1855k();
        this.f10605y = new toq();
        this.f10604s = new GestureDetector(getContext(), new zy());
        zy();
    }

    public int getSelectedPosition() {
        return this.f10602n;
    }

    public NavItemView getSelectedView() {
        return this.f10603q;
    }

    /* JADX INFO: renamed from: n */
    public void m7341n(int position) {
        if (position >= getChildCount()) {
            return;
        }
        getChildAt(position).callOnClick();
    }

    /* JADX INFO: renamed from: q */
    public abstract void mo7342q(ArrayList<C1857k> navList);

    public void setOnItemClickListener(InterfaceC1856q listener) {
        this.f10601k = listener;
    }

    public void setSelectedPosition(int position) {
        this.f10602n = position;
    }

    protected abstract void zy();

    public NavViewContainer(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f10602n = -1;
        this.f10600g = new ViewOnClickListenerC1855k();
        this.f10605y = new toq();
        this.f10604s = new GestureDetector(getContext(), new zy());
        zy();
    }

    public NavViewContainer(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f10602n = -1;
        this.f10600g = new ViewOnClickListenerC1855k();
        this.f10605y = new toq();
        this.f10604s = new GestureDetector(getContext(), new zy());
        zy();
    }
}

package com.android.thememanager.settings.personalize.holder;

import android.app.Activity;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.lifecycle.InterfaceC0928g;
import androidx.recyclerview.widget.RecyclerView;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BottomViewHolder extends RecyclerView.fti implements InterfaceC0928g {

    /* JADX INFO: renamed from: s */
    private static final String f15228s = "BottomViewHolder";

    /* JADX INFO: renamed from: g */
    private Rect f15229g;

    /* JADX INFO: renamed from: k */
    protected Activity f15230k;

    /* JADX INFO: renamed from: n */
    private int f15231n;

    /* JADX INFO: renamed from: q */
    private boolean f15232q;

    /* JADX INFO: renamed from: y */
    private ViewTreeObserver.OnScrollChangedListener f15233y;

    /* JADX INFO: renamed from: com.android.thememanager.settings.personalize.holder.BottomViewHolder$k */
    class ViewTreeObserverOnGlobalLayoutListenerC2558k implements ViewTreeObserver.OnGlobalLayoutListener {
        ViewTreeObserverOnGlobalLayoutListenerC2558k() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (BottomViewHolder.this.itemView.getHeight() > 0) {
                BottomViewHolder bottomViewHolder = BottomViewHolder.this;
                bottomViewHolder.f15231n = bottomViewHolder.itemView.getHeight() / 2;
                BottomViewHolder.this.itemView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            }
        }
    }

    class toq implements ViewTreeObserver.OnScrollChangedListener {
        toq() {
        }

        @Override // android.view.ViewTreeObserver.OnScrollChangedListener
        public void onScrollChanged() {
            if (BottomViewHolder.this.f15232q || BottomViewHolder.this.f15231n <= 0) {
                return;
            }
            BottomViewHolder bottomViewHolder = BottomViewHolder.this;
            bottomViewHolder.itemView.getLocalVisibleRect(bottomViewHolder.f15229g);
            if (BottomViewHolder.this.f15229g.top != 0 || BottomViewHolder.this.f15229g.bottom < BottomViewHolder.this.f15231n) {
                return;
            }
            C1708s.f7l8().ld6().cdj(C1706p.kja0("personalize", BottomViewHolder.this.o1t(), ""));
            BottomViewHolder.this.f15232q = true;
            BottomViewHolder.this.itemView.getViewTreeObserver().removeOnScrollChangedListener(this);
        }
    }

    public BottomViewHolder(Activity activity, View itemView) {
        super(itemView);
        this.f15229g = new Rect();
        this.f15233y = new toq();
        this.f15230k = activity;
    }

    /* JADX INFO: renamed from: n */
    public void m9059n() {
        if (!this.f15232q) {
            try {
                this.itemView.getViewTreeObserver().addOnScrollChangedListener(this.f15233y);
            } catch (Exception e2) {
                Log.e(f15228s, e2.getLocalizedMessage());
            }
        }
        if (this.f15231n <= 0) {
            this.itemView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC2558k());
        }
    }

    public abstract String o1t();

    public void zy() {
        try {
            this.itemView.getViewTreeObserver().removeOnScrollChangedListener(this.f15233y);
        } catch (Exception e2) {
            Log.e(f15228s, e2.getLocalizedMessage());
        }
    }
}

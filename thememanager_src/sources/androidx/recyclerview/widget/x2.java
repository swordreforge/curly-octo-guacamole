package androidx.recyclerview.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: DividerItemDecoration.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 extends RecyclerView.kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int[] f52315f7l8 = {R.attr.listDivider};

    /* JADX INFO: renamed from: g */
    private static final String f6107g = "DividerItem";

    /* JADX INFO: renamed from: n */
    public static final int f6108n = 1;

    /* JADX INFO: renamed from: q */
    public static final int f6109q = 0;

    /* JADX INFO: renamed from: k */
    private Drawable f6110k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f52316toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Rect f52317zy = new Rect();

    public x2(Context context, int i2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(f52315f7l8);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(0);
        this.f6110k = drawable;
        if (drawable == null) {
            Log.w(f6107g, "@android:attr/listDivider was not set in the theme used for this DividerItemDecoration. Please set that attribute all call setDrawable()");
        }
        typedArrayObtainStyledAttributes.recycle();
        n7h(i2);
    }

    private void ld6(Canvas canvas, RecyclerView recyclerView) {
        int width;
        int paddingLeft;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingLeft = recyclerView.getPaddingLeft();
            width = recyclerView.getWidth() - recyclerView.getPaddingRight();
            canvas.clipRect(paddingLeft, recyclerView.getPaddingTop(), width, recyclerView.getHeight() - recyclerView.getPaddingBottom());
        } else {
            width = recyclerView.getWidth();
            paddingLeft = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getDecoratedBoundsWithMargins(childAt, this.f52317zy);
            int iRound = this.f52317zy.bottom + Math.round(childAt.getTranslationY());
            this.f6110k.setBounds(paddingLeft, iRound - this.f6110k.getIntrinsicHeight(), width, iRound);
            this.f6110k.draw(canvas);
        }
        canvas.restore();
    }

    /* JADX INFO: renamed from: p */
    private void m5123p(Canvas canvas, RecyclerView recyclerView) {
        int height;
        int paddingTop;
        canvas.save();
        if (recyclerView.getClipToPadding()) {
            paddingTop = recyclerView.getPaddingTop();
            height = recyclerView.getHeight() - recyclerView.getPaddingBottom();
            canvas.clipRect(recyclerView.getPaddingLeft(), paddingTop, recyclerView.getWidth() - recyclerView.getPaddingRight(), height);
        } else {
            height = recyclerView.getHeight();
            paddingTop = 0;
        }
        int childCount = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = recyclerView.getChildAt(i2);
            recyclerView.getLayoutManager().getDecoratedBoundsWithMargins(childAt, this.f52317zy);
            int iRound = this.f52317zy.right + Math.round(childAt.getTranslationX());
            this.f6110k.setBounds(iRound - this.f6110k.getIntrinsicWidth(), paddingTop, iRound, height);
            this.f6110k.draw(canvas);
        }
        canvas.restore();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    public void f7l8(Canvas canvas, RecyclerView recyclerView, RecyclerView.mcp mcpVar) {
        if (recyclerView.getLayoutManager() == null || this.f6110k == null) {
            return;
        }
        if (this.f52316toq == 1) {
            ld6(canvas, recyclerView);
        } else {
            m5123p(canvas, recyclerView);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.kja0
    /* JADX INFO: renamed from: n */
    public void mo4711n(Rect rect, View view, RecyclerView recyclerView, RecyclerView.mcp mcpVar) {
        Drawable drawable = this.f6110k;
        if (drawable == null) {
            rect.set(0, 0, 0, 0);
        } else if (this.f52316toq == 1) {
            rect.set(0, 0, 0, drawable.getIntrinsicHeight());
        } else {
            rect.set(0, 0, drawable.getIntrinsicWidth(), 0);
        }
    }

    public void n7h(int i2) {
        if (i2 != 0 && i2 != 1) {
            throw new IllegalArgumentException("Invalid orientation. It should be either HORIZONTAL or VERTICAL");
        }
        this.f52316toq = i2;
    }

    public void qrj(@zy.lvui Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Drawable cannot be null.");
        }
        this.f6110k = drawable;
    }

    @zy.dd
    public Drawable x2() {
        return this.f6110k;
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import p030n.C7397k;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {

    /* JADX INFO: renamed from: k */
    private final fn3e f751k;

    public AppCompatRatingBar(@zy.lvui Context context) {
        this(context, null);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        Bitmap qVar = this.f751k.toq();
        if (qVar != null) {
            setMeasuredDimension(View.resolveSizeAndState(qVar.getWidth() * getNumStars(), i2, 0), getMeasuredHeight());
        }
    }

    public AppCompatRatingBar(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92917mj);
    }

    public AppCompatRatingBar(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C0214o.m692k(this, getContext());
        fn3e fn3eVar = new fn3e(this);
        this.f751k = fn3eVar;
        fn3eVar.zy(attributeSet, i2);
    }
}

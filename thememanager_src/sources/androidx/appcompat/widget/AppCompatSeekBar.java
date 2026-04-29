package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p030n.C7397k;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatSeekBar extends SeekBar {

    /* JADX INFO: renamed from: k */
    private final fu4 f752k;

    public AppCompatSeekBar(@zy.lvui Context context) {
        this(context, null);
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.f752k.m595y();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        this.f752k.x2();
    }

    @Override // android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected synchronized void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f752k.f7l8(canvas);
    }

    public AppCompatSeekBar(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, C7397k.toq.f92990xblq);
    }

    public AppCompatSeekBar(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        C0214o.m692k(this, getContext());
        fu4 fu4Var = new fu4(this);
        this.f752k = fu4Var;
        fu4Var.zy(attributeSet, i2);
    }
}

package miuix.smooth;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;

/* JADX INFO: renamed from: miuix.smooth.q */
/* JADX INFO: compiled from: SmoothContainerDrawableForCardView.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7335q extends SmoothContainerDrawable2 {

    /* JADX INFO: renamed from: r */
    private RectF f41682r = new RectF();

    /* JADX INFO: renamed from: l */
    private Path f41681l = new Path();

    @Override // miuix.smooth.SmoothContainerDrawable2, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (Build.VERSION.SDK_INT < 30) {
            outline.setRoundRect(toq(), m26589n());
            return;
        }
        this.f41681l.reset();
        Rect qVar = toq();
        RectF rectF = this.f41682r;
        rectF.left = qVar.left;
        rectF.top = qVar.top;
        rectF.right = qVar.right;
        rectF.bottom = qVar.bottom;
        this.f41681l.addRoundRect(rectF, m26589n(), m26589n(), Path.Direction.CW);
        outline.setPath(this.f41681l);
    }
}

package androidx.cardview.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.cardview.widget.f7l8;
import zy.hyr;

/* JADX INFO: renamed from: androidx.cardview.widget.k */
/* JADX INFO: compiled from: CardViewApi17Impl.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(17)
class C0242k extends zy {

    /* JADX INFO: renamed from: androidx.cardview.widget.k$k */
    /* JADX INFO: compiled from: CardViewApi17Impl.java */
    class k implements f7l8.InterfaceC0240k {
        k() {
        }

        @Override // androidx.cardview.widget.f7l8.InterfaceC0240k
        /* JADX INFO: renamed from: k */
        public void mo797k(Canvas canvas, RectF rectF, float f2, Paint paint) {
            canvas.drawRoundRect(rectF, f2, f2, paint);
        }
    }

    C0242k() {
    }

    @Override // androidx.cardview.widget.zy, androidx.cardview.widget.InterfaceC0243n
    public void x2() {
        f7l8.f47016t8r = new k();
    }
}

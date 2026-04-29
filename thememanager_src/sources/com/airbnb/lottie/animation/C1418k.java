package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.view.C0683f;
import com.airbnb.lottie.utils.f7l8;
import zy.lvui;

/* JADX INFO: renamed from: com.airbnb.lottie.animation.k */
/* JADX INFO: compiled from: LPaint.java */
/* JADX INFO: loaded from: classes.dex */
public class C1418k extends Paint {
    public C1418k() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i2) {
        if (Build.VERSION.SDK_INT >= 30) {
            super.setAlpha(f7l8.m6240q(i2, 0, 255));
        } else {
            setColor((f7l8.m6240q(i2, 0, 255) << 24) | (getColor() & C0683f.f50797t8r));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(@lvui LocaleList localeList) {
    }

    public C1418k(int i2) {
        super(i2);
    }

    public C1418k(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C1418k(int i2, PorterDuff.Mode mode) {
        super(i2);
        setXfermode(new PorterDuffXfermode(mode));
    }
}

package mj;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import gb.toq;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: renamed from: mj.k */
/* JADX INFO: compiled from: PlaceholderDrawable.java */
/* JADX INFO: loaded from: classes3.dex */
public class C7391k extends Drawable {

    /* JADX INFO: renamed from: k */
    public int f42317k = -1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public int f92300toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private Rect f92301zy;

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f92300toq;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f42317k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Rect rect2 = this.f92301zy;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                String name = xmlPullParser.getName();
                if (name.equals("size")) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, toq.ki.nn);
                    this.f42317k = typedArrayObtainAttributes.getDimensionPixelSize(toq.ki.pwo, -1);
                    this.f92300toq = typedArrayObtainAttributes.getDimensionPixelSize(toq.ki.afni, -1);
                    typedArrayObtainAttributes.recycle();
                } else if (name.equals("padding")) {
                    TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, toq.ki.dci);
                    this.f92301zy = new Rect(typedArrayObtainAttributes2.getDimensionPixelOffset(toq.ki.dew6, 0), typedArrayObtainAttributes2.getDimensionPixelOffset(toq.ki.ppa, 0), typedArrayObtainAttributes2.getDimensionPixelOffset(toq.ki.yhe, 0), typedArrayObtainAttributes2.getDimensionPixelOffset(toq.ki.tk5o, 0));
                    typedArrayObtainAttributes2.recycle();
                } else {
                    Log.w("drawable", "Bad element under <placeholder>: " + name);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}

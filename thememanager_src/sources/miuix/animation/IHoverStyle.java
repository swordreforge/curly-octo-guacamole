package miuix.animation;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.MotionEvent;
import android.view.View;
import miuix.animation.base.AnimConfig;

/* JADX INFO: loaded from: classes3.dex */
public interface IHoverStyle extends IStateContainer {

    public enum HoverEffect {
        NORMAL,
        FLOATED,
        FLOATED_WRAPPED
    }

    public enum HoverType {
        ENTER,
        EXIT
    }

    void addMagicPoint(Point point);

    void clearMagicPoint();

    IHoverStyle clearTintColor();

    int getFeedbackColor();

    float getFeedbackRadius();

    int getPointerShapeType();

    void handleHoverOf(View view, AnimConfig... animConfigArr);

    void hoverEnter(MotionEvent motionEvent, AnimConfig... animConfigArr);

    void hoverEnter(AnimConfig... animConfigArr);

    void hoverExit(MotionEvent motionEvent, AnimConfig... animConfigArr);

    void hoverExit(AnimConfig... animConfigArr);

    void hoverMove(View view, MotionEvent motionEvent, AnimConfig... animConfigArr);

    void ignoreHoverOf(View view);

    boolean isMagicView();

    boolean isWrapped();

    void onMotionEvent(MotionEvent motionEvent);

    void onMotionEventEx(View view, MotionEvent motionEvent, AnimConfig... animConfigArr);

    IHoverStyle setAlpha(float f2, HoverType... hoverTypeArr);

    IHoverStyle setBackgroundColor(float f2, float f3, float f4, float f5);

    IHoverStyle setBackgroundColor(int i2);

    IHoverStyle setCorner(float f2);

    IHoverStyle setEffect(HoverEffect hoverEffect);

    void setFeedbackColor(int i2);

    void setFeedbackRadius(float f2);

    void setHotXOffset(int i2);

    void setHotYOffset(int i2);

    void setHoverEnter();

    void setHoverExit();

    void setMagicView(boolean z2);

    IHoverStyle setParentView(View view);

    void setPointerHide(boolean z2);

    void setPointerShape(Bitmap bitmap);

    void setPointerShapeType(int i2);

    IHoverStyle setScale(float f2, HoverType... hoverTypeArr);

    IHoverStyle setTint(float f2, float f3, float f4, float f5);

    IHoverStyle setTint(int i2);

    IHoverStyle setTintMode(int i2);

    IHoverStyle setTranslate(float f2, HoverType... hoverTypeArr);

    void setWrapped(boolean z2);
}

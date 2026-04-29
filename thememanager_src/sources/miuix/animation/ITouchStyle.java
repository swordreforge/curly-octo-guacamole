package miuix.animation;

import android.graphics.RectF;
import android.support.v4.media.MediaDescriptionCompat;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import miuix.animation.base.AnimConfig;
import zy.a9;

/* JADX INFO: loaded from: classes3.dex */
public interface ITouchStyle extends IStateContainer {

    public enum TouchMode {
        NORMAL,
        ROUND_CORNERS
    }

    public enum TouchRectGravity {
        TOP_LEFT,
        TOP_CENTER,
        CENTER_LEFT,
        CENTER_IN_PARENT
    }

    public enum TouchType {
        UP,
        DOWN
    }

    void bindViewOfListItem(View view, AnimConfig... animConfigArr);

    ITouchStyle clearTintColor();

    void handleTouchOf(View view, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener, AnimConfig... animConfigArr);

    void handleTouchOf(View view, View.OnClickListener onClickListener, AnimConfig... animConfigArr);

    void handleTouchOf(View view, boolean z2, AnimConfig... animConfigArr);

    void handleTouchOf(View view, AnimConfig... animConfigArr);

    void ignoreTouchOf(View view);

    void onMotionEvent(MotionEvent motionEvent);

    void onMotionEventEx(View view, MotionEvent motionEvent, AnimConfig... animConfigArr);

    ITouchStyle setAlpha(float f2, TouchType... touchTypeArr);

    ITouchStyle setBackgroundColor(float f2, float f3, float f4, float f5);

    ITouchStyle setBackgroundColor(int i2);

    ITouchStyle setScale(float f2, TouchType... touchTypeArr);

    ITouchStyle setTint(float f2, float f3, float f4, float f5);

    ITouchStyle setTint(int i2);

    ITouchStyle setTintMode(@a9(from = -1, to = MediaDescriptionCompat.BT_FOLDER_TYPE_ARTISTS) int i2);

    void setTouchDown();

    ITouchStyle setTouchPadding(float f2, float f3, float f4, float f5);

    ITouchStyle setTouchRadius(float f2);

    ITouchStyle setTouchRadius(float f2, float f3, float f4, float f5);

    ITouchStyle setTouchRect(RectF rectF, TouchRectGravity touchRectGravity);

    void setTouchUp();

    void touchDown(AnimConfig... animConfigArr);

    void touchUp(AnimConfig... animConfigArr);

    ITouchStyle useVarFont(TextView textView, int i2, int i3, int i4);
}

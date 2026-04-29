package miuix.animation.property;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.exoplayer2.offline.zurt;
import miuix.animation.C6839R;

/* JADX INFO: loaded from: classes3.dex */
public class ViewPropertyExt {
    public static final BackgroundProperty BACKGROUND;
    public static final ForegroundProperty FOREGROUND;

    public static class BackgroundProperty extends ViewProperty implements IIntValueProperty<View> {
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return 0.0f;
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
        }

        private BackgroundProperty() {
            super("background");
        }

        @Override // miuix.animation.property.IIntValueProperty
        public int getIntValue(View view) {
            Drawable background = view.getBackground();
            if (background instanceof ColorDrawable) {
                return ((ColorDrawable) background).getColor();
            }
            return 0;
        }

        @Override // miuix.animation.property.IIntValueProperty
        public void setIntValue(View view, int i2) {
            view.setBackgroundColor(i2);
        }
    }

    public static class ForegroundProperty extends ViewProperty implements IIntValueProperty<View> {
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return 0.0f;
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
        }

        private ForegroundProperty() {
            super(zurt.f65087bo);
        }

        @Override // miuix.animation.property.IIntValueProperty
        public int getIntValue(View view) {
            Object tag = view.getTag(C6839R.id.miuix_animation_tag_foreground_color);
            if (tag instanceof Integer) {
                return ((Integer) tag).intValue();
            }
            return 0;
        }

        @Override // miuix.animation.property.IIntValueProperty
        public void setIntValue(View view, int i2) {
            view.setTag(C6839R.id.miuix_animation_tag_foreground_color, Integer.valueOf(i2));
            Drawable foreground = view.getForeground();
            if (foreground != null) {
                foreground.invalidateSelf();
            }
        }
    }

    static {
        FOREGROUND = new ForegroundProperty();
        BACKGROUND = new BackgroundProperty();
    }

    private ViewPropertyExt() {
    }
}

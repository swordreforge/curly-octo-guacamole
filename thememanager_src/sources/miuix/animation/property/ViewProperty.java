package miuix.animation.property;

import android.view.View;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.miui.maml.folme.AnimatedProperty;
import miuix.animation.C6839R;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ViewProperty extends FloatProperty<View> {
    public static final ViewProperty TRANSLATION_X = new ViewProperty("translationX") { // from class: miuix.animation.property.ViewProperty.1
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getTranslationX();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setTranslationX(f2);
        }
    };
    public static final ViewProperty TRANSLATION_Y = new ViewProperty("translationY") { // from class: miuix.animation.property.ViewProperty.2
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getTranslationY();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setTranslationY(f2);
        }
    };
    public static final ViewProperty TRANSLATION_Z = new ViewProperty("translationZ") { // from class: miuix.animation.property.ViewProperty.3
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getTranslationZ();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setTranslationZ(f2);
        }
    };
    public static final ViewProperty SCALE_X = new ViewProperty("scaleX") { // from class: miuix.animation.property.ViewProperty.4
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getScaleX();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setScaleX(f2);
        }
    };
    public static final ViewProperty SCALE_Y = new ViewProperty("scaleY") { // from class: miuix.animation.property.ViewProperty.5
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getScaleY();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setScaleY(f2);
        }
    };
    public static final ViewProperty ROTATION = new ViewProperty("rotation") { // from class: miuix.animation.property.ViewProperty.6
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getRotation();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setRotation(f2);
        }
    };
    public static final ViewProperty ROTATION_X = new ViewProperty("rotationX") { // from class: miuix.animation.property.ViewProperty.7
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getRotationX();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setRotationX(f2);
        }
    };
    public static final ViewProperty ROTATION_Y = new ViewProperty("rotationY") { // from class: miuix.animation.property.ViewProperty.8
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getRotationY();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setRotationY(f2);
        }
    };

    /* JADX INFO: renamed from: X */
    public static final ViewProperty f38713X = new ViewProperty(AnimatedProperty.PROPERTY_NAME_X) { // from class: miuix.animation.property.ViewProperty.9
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getX();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setX(f2);
        }
    };

    /* JADX INFO: renamed from: Y */
    public static final ViewProperty f38714Y = new ViewProperty(AnimatedProperty.PROPERTY_NAME_Y) { // from class: miuix.animation.property.ViewProperty.10
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getY();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setY(f2);
        }
    };

    /* JADX INFO: renamed from: Z */
    public static final ViewProperty f38715Z = new ViewProperty("z") { // from class: miuix.animation.property.ViewProperty.11
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getZ();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setZ(f2);
        }
    };
    public static final ViewProperty HEIGHT = new ViewProperty(InterfaceC1925p.byf) { // from class: miuix.animation.property.ViewProperty.12
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            int height = view.getHeight();
            Float f2 = (Float) view.getTag(C6839R.id.miuix_animation_tag_set_height);
            if (f2 != null) {
                return f2.floatValue();
            }
            if (height == 0 && ViewProperty.isInInitLayout(view)) {
                height = view.getMeasuredHeight();
            }
            return height;
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.getLayoutParams().height = (int) f2;
            view.setTag(C6839R.id.miuix_animation_tag_set_height, Float.valueOf(f2));
            view.requestLayout();
        }
    };
    public static final ViewProperty WIDTH = new ViewProperty("width") { // from class: miuix.animation.property.ViewProperty.13
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            int width = view.getWidth();
            Float f2 = (Float) view.getTag(C6839R.id.miuix_animation_tag_set_width);
            if (f2 != null) {
                return f2.floatValue();
            }
            if (width == 0 && ViewProperty.isInInitLayout(view)) {
                width = view.getMeasuredWidth();
            }
            return width;
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.getLayoutParams().width = (int) f2;
            view.setTag(C6839R.id.miuix_animation_tag_set_width, Float.valueOf(f2));
            view.requestLayout();
        }
    };
    public static final ViewProperty ALPHA = new ViewProperty("alpha") { // from class: miuix.animation.property.ViewProperty.14
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getAlpha();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setAlpha(f2);
        }
    };
    public static final ViewProperty AUTO_ALPHA = new ViewProperty("autoAlpha") { // from class: miuix.animation.property.ViewProperty.15
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getAlpha();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setAlpha(f2);
            boolean z2 = Math.abs(f2) <= 0.00390625f;
            if (view.getVisibility() != 0 && f2 > 0.0f && !z2) {
                view.setVisibility(0);
            } else if (z2) {
                view.setVisibility(8);
            }
        }
    };
    public static final ViewProperty SCROLL_X = new ViewProperty("scrollX") { // from class: miuix.animation.property.ViewProperty.16
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getScrollX();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setScrollX((int) f2);
        }
    };
    public static final ViewProperty SCROLL_Y = new ViewProperty("scrollY") { // from class: miuix.animation.property.ViewProperty.17
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getScrollY();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setScrollY((int) f2);
        }
    };
    public static final ViewProperty FOREGROUND = new ViewProperty("deprecated_foreground") { // from class: miuix.animation.property.ViewProperty.18
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return 0.0f;
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
        }
    };
    public static final ViewProperty BACKGROUND = new ViewProperty("deprecated_background") { // from class: miuix.animation.property.ViewProperty.19
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return 0.0f;
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
        }
    };
    public static final ViewProperty ELEVATION = new ViewProperty("elevation") { // from class: miuix.animation.property.ViewProperty.20
        @Override // miuix.animation.property.FloatProperty
        public float getValue(View view) {
            return view.getElevation();
        }

        @Override // miuix.animation.property.FloatProperty
        public void setValue(View view, float f2) {
            view.setElevation(f2);
        }
    };

    public ViewProperty(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean isInInitLayout(View view) {
        return view.getTag(C6839R.id.miuix_animation_tag_init_layout) != null;
    }

    @Override // miuix.animation.property.FloatProperty
    public String toString() {
        return "ViewProperty{mPropertyName='" + this.mPropertyName + "'}";
    }
}

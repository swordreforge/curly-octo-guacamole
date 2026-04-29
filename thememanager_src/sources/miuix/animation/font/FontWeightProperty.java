package miuix.animation.font;

import android.annotation.TargetApi;
import android.view.View;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Objects;
import miuix.animation.property.ISpecificProperty;
import miuix.animation.property.ViewProperty;

/* JADX INFO: loaded from: classes3.dex */
@TargetApi(26)
public class FontWeightProperty extends ViewProperty implements ISpecificProperty {
    private static final String NAME = "fontweight";
    private float mCurWeight;
    private int mFontType;
    private WeakReference<TextView> mTextViewRef;

    public FontWeightProperty(TextView textView, int i2) {
        super(NAME);
        this.mCurWeight = Float.MAX_VALUE;
        this.mTextViewRef = new WeakReference<>(textView);
        this.mFontType = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        TextView textView = this.mTextViewRef.get();
        return textView != null && textView.equals(((FontWeightProperty) obj).mTextViewRef.get());
    }

    public float getScaledTextSize() {
        TextView textView = this.mTextViewRef.get();
        if (textView != null) {
            return textView.getTextSize() / textView.getResources().getDisplayMetrics().scaledDensity;
        }
        return 0.0f;
    }

    @Override // miuix.animation.property.ISpecificProperty
    public float getSpecificValue(float f2) {
        TextView textView = this.mTextViewRef.get();
        if (f2 >= VarFontUtils.MIN_WGHT || textView == null) {
            return f2;
        }
        return VarFontUtils.getScaleWeight((int) f2, getScaledTextSize(), this.mFontType, VarFontUtils.getSysFontScale(textView.getContext()));
    }

    public TextView getTextView() {
        return this.mTextViewRef.get();
    }

    public int hashCode() {
        TextView textView = this.mTextViewRef.get();
        return textView != null ? Objects.hash(Integer.valueOf(super.hashCode()), textView) : Objects.hash(Integer.valueOf(super.hashCode()), this.mTextViewRef);
    }

    @Override // miuix.animation.property.FloatProperty
    public float getValue(View view) {
        return this.mCurWeight;
    }

    @Override // miuix.animation.property.FloatProperty
    public void setValue(View view, float f2) {
        this.mCurWeight = f2;
        TextView textView = this.mTextViewRef.get();
        if (textView != null) {
            VarFontUtils.setVariationFont(textView, (int) f2);
        }
    }
}

package com.google.android.material.theme;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.app.C0101p;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.radiobutton.MaterialRadioButton;
import com.google.android.material.textfield.MaterialAutoCompleteTextView;
import com.google.android.material.textview.MaterialTextView;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class MaterialComponentsViewInflater extends C0101p {
    @Override // androidx.appcompat.app.C0101p
    @lvui
    protected AppCompatTextView kja0(Context context, AttributeSet attributeSet) {
        return new MaterialTextView(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0101p
    @lvui
    protected AppCompatRadioButton ld6(Context context, AttributeSet attributeSet) {
        return new MaterialRadioButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0101p
    @lvui
    /* JADX INFO: renamed from: n */
    protected AppCompatCheckBox mo218n(Context context, AttributeSet attributeSet) {
        return new MaterialCheckBox(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0101p
    @lvui
    /* JADX INFO: renamed from: q */
    protected AppCompatButton mo220q(@lvui Context context, @lvui AttributeSet attributeSet) {
        return new MaterialButton(context, attributeSet);
    }

    @Override // androidx.appcompat.app.C0101p
    @lvui
    protected AppCompatAutoCompleteTextView zy(@lvui Context context, @dd AttributeSet attributeSet) {
        return new MaterialAutoCompleteTextView(context, attributeSet);
    }
}

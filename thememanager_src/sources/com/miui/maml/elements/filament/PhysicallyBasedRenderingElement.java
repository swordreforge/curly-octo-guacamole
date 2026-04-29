package com.miui.maml.elements.filament;

import android.view.View;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.Expression;
import com.miui.maml.elements.ViewHolderScreenElement;
import org.w3c.dom.Element;

/* JADX INFO: loaded from: classes3.dex */
public class PhysicallyBasedRenderingElement extends ViewHolderScreenElement {
    public static final String TAG_NAME = "Pbr";

    public interface IPbrCreator {
        PhysicallyBasedRenderingElement createRealPbrElement(Element element, ScreenElementRoot screenElementRoot);
    }

    public PhysicallyBasedRenderingElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
    }

    @Override // com.miui.maml.elements.ViewHolderScreenElement
    protected View getView() {
        return null;
    }

    public void updateUniform(String str, String str2, boolean z2, Expression[] expressionArr) {
    }
}

package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.router.recommend.entity.UIElement;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PersonalizeRecommendTitleElement.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class PersonalizeRecommendTitleElement extends UIElement {

    @InterfaceC7396q
    private final String title;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PersonalizeRecommendTitleElement(@InterfaceC7396q String title) {
        super(134);
        d2ok.m23075h(title, "title");
        this.title = title;
    }

    @InterfaceC7396q
    public final String getTitle() {
        return this.title;
    }
}

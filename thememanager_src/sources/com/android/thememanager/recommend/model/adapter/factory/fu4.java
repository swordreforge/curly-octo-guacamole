package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.IconSubjectsProductElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: IconSubjectsElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class fu4 extends qrj {

    /* JADX INFO: renamed from: n */
    private static final int f13547n = 4;

    /* JADX INFO: renamed from: k */
    private final int f13548k;

    /* JADX INFO: renamed from: q */
    private boolean f13549q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f60630toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f60631zy;

    public fu4(boolean isFirstCard, boolean hasMore, int size, int position) {
        this.f13549q = isFirstCard;
        this.f60630toq = hasMore;
        this.f60631zy = position;
        this.f13548k = size;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ArrayList arrayList = new ArrayList();
        if (card.products != null) {
            for (int i2 = 0; i2 < card.products.size(); i2++) {
                IconSubjectsProductElement iconSubjectsProductElement = new IconSubjectsProductElement(card.products.get(i2));
                if (this.f13549q && (i2 == 0 || i2 == 1)) {
                    iconSubjectsProductElement.setFirst(true);
                }
                arrayList.add(iconSubjectsProductElement);
            }
        }
        return arrayList;
    }
}

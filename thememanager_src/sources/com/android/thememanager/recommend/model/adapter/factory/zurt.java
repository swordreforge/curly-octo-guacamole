package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.recommend.model.entity.element.DividerElement;
import com.android.thememanager.recommend.model.entity.element.IconChosenElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: IconChosenElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class zurt extends qrj {

    /* JADX INFO: renamed from: k */
    private List<UICard> f13571k;

    /* JADX INFO: renamed from: q */
    private boolean f13572q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f60644toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f60645zy;

    public zurt(List<UICard> cards, boolean isFirstPage, boolean hasMore, int position) {
        this.f13571k = cards;
        this.f60644toq = hasMore;
        this.f60645zy = position;
        this.f13572q = isFirstPage;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        boolean z2 = false;
        boolean z3 = this.f60645zy == 0 && this.f13572q;
        int size = this.f13571k.size();
        int i2 = this.f60645zy;
        int i3 = size - 1;
        boolean z5 = i2 == i3 && !this.f60644toq;
        if (!z5 && i2 < i3 && this.f13571k.get(i2 + 1).cardTypeOrdinal != 102) {
            z2 = true;
        }
        ArrayList arrayList = new ArrayList();
        IconChosenElement iconChosenElement = new IconChosenElement();
        iconChosenElement.setTitle(card.title);
        iconChosenElement.setLink(card.link);
        iconChosenElement.setProducts(card.products);
        iconChosenElement.setTotalCount(card.productCount);
        iconChosenElement.setSubjectUuid(card.subjectUuid);
        iconChosenElement.setTrackId(card.trackId);
        iconChosenElement.setShowPrice(card.showPrice);
        iconChosenElement.setFirstCard(z3);
        iconChosenElement.setLastCard(z5);
        iconChosenElement.setHasMoreOtherCard(z2);
        arrayList.add(iconChosenElement);
        if ((this.f60644toq || this.f13571k.size() - 1 != this.f60645zy || this.f13571k.size() < 4) && z2) {
            arrayList.add(new DividerElement());
        }
        return arrayList;
    }
}

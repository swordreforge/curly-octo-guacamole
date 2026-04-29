package com.android.thememanager.recommend.model.adapter.factory;

import android.text.TextUtils;
import com.android.thememanager.recommend.model.entity.element.BottomLoadMoreElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import java.util.List;

/* JADX INFO: compiled from: BottomLoadMoreElementFactory.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 extends qrj {

    /* JADX INFO: renamed from: k */
    private qrj f13546k;

    public f7l8(qrj factory) {
        this.f13546k = factory;
    }

    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        List<UIElement> listMo8509k = this.f13546k.mo8509k(card);
        if (!listMo8509k.isEmpty() && !TextUtils.isEmpty(card.subjectUuid) && !TextUtils.isEmpty(card.title)) {
            listMo8509k.add(new BottomLoadMoreElement(card.subjectUuid, card.title, card.trackId));
        }
        return listMo8509k;
    }
}

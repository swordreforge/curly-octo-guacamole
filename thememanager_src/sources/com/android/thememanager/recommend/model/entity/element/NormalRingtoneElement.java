package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.recommend.model.entity.PlayingElement;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class NormalRingtoneElement extends UIElement implements PlayingElement.IPlaying {
    private final String cardId;
    private final List<String> eids;
    private final String expLayer;
    private final boolean isShowDivider;
    private final PlayingElement playingElement;
    private final UIProduct product;

    public NormalRingtoneElement(UIProduct product, boolean isShowDivider, String expLayer, List<String> eids, String cardId) {
        super(18);
        this.isShowDivider = isShowDivider;
        this.product = product;
        this.expLayer = expLayer;
        this.eids = eids;
        this.cardId = cardId;
        this.playingElement = new PlayingElement();
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        NormalRingtoneElement normalRingtoneElement = (NormalRingtoneElement) o2;
        return this.isShowDivider == normalRingtoneElement.isShowDivider && isPlaying() == normalRingtoneElement.isPlaying() && this.product.equals(normalRingtoneElement.product);
    }

    public String getCardId() {
        return this.cardId;
    }

    public List<String> getEids() {
        return this.eids;
    }

    public String getExpLayer() {
        return this.expLayer;
    }

    public UIProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isShowDivider), this.product, Boolean.valueOf(isPlaying()));
    }

    @Override // com.android.thememanager.recommend.model.entity.PlayingElement.IPlaying
    public boolean isPlaying() {
        return this.playingElement.isPlaying();
    }

    public boolean isShowDivider() {
        return this.isShowDivider;
    }

    @Override // com.android.thememanager.recommend.model.entity.PlayingElement.IPlaying
    public boolean setPlaying(String uuid) {
        return this.playingElement.setPlaying(uuid, this.product.uuid);
    }

    public NormalRingtoneElement(int cardType, UIProduct product, boolean isShowDivider, String expLayer, List<String> eids, String cardId) {
        super(cardType);
        this.isShowDivider = isShowDivider;
        this.product = product;
        this.expLayer = expLayer;
        this.eids = eids;
        this.cardId = cardId;
        this.playingElement = new PlayingElement();
    }
}

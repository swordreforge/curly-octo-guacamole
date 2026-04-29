package com.android.thememanager.recommend.model.entity.element;

import com.android.thememanager.recommend.model.entity.PlayingElement;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public class NormalSecondRingtoneElement extends UIElement implements PlayingElement.IPlaying {
    private final boolean isFirstCardPosition;
    private final boolean isShowDivider;
    private final PlayingElement playingElement;
    private final UIProduct product;

    public NormalSecondRingtoneElement(UIProduct product, boolean isShowDivider, boolean isFirstCardPosition) {
        super(101);
        this.isShowDivider = isShowDivider;
        this.product = product;
        this.isFirstCardPosition = isFirstCardPosition;
        this.playingElement = new PlayingElement();
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        NormalSecondRingtoneElement normalSecondRingtoneElement = (NormalSecondRingtoneElement) o2;
        return this.isShowDivider == normalSecondRingtoneElement.isShowDivider && this.playingElement.isPlaying() == normalSecondRingtoneElement.isPlaying() && this.isFirstCardPosition == normalSecondRingtoneElement.isFirstCardPosition && this.product.equals(normalSecondRingtoneElement.product);
    }

    public UIProduct getProduct() {
        return this.product;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(this.isShowDivider), this.product, Boolean.valueOf(this.isFirstCardPosition), Boolean.valueOf(this.playingElement.isPlaying()));
    }

    public boolean isFirstCardPosition() {
        return this.isFirstCardPosition;
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
}

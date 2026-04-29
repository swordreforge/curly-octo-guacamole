package com.android.thememanager.recommend.model.entity.element;

import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.recommend.model.entity.PlayingElement;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeSearchElement extends UIElement implements PlayingElement.IPlaying, IStatus {
    private boolean mDownloaded;
    private boolean mHasMore;
    private jp0y<? super ThemeStatus> mObserverInner;
    private jp0y<? super ThemeStatus> mObserverOuter;
    private boolean mOutdated;
    private int mReqBoughtState;
    private Resource mResource;
    private fti<ThemeStatus> mThemeStatus;
    private final PlayingElement playingElement;
    private boolean showOperation;
    private List<UIProduct> uiProductList;

    public ThemeSearchElement(int category, List<UIProduct> uiProductList, boolean hasMore) {
        super(category);
        this.uiProductList = uiProductList;
        this.mHasMore = hasMore;
        this.playingElement = new PlayingElement();
        if (C1807g.lvui()) {
            this.mResource = createResource(getProduct());
            if (this.mThemeStatus == null) {
                this.mThemeStatus = new fti<>(new ThemeStatus(this.mResource.getAssemblyId()));
            }
        }
    }

    private Resource createResource(UIProduct product) {
        if (product == null) {
            return null;
        }
        Resource resource = new Resource();
        resource.setOnlineId(product.uuid);
        resource.setProductId(product.productUuid);
        resource.setAssemblyId(product.productUuid);
        resource.getOnlineInfo().setTitle(product.name);
        resource.setProductBought(product.productBought);
        resource.setOriginPrice(product.originPriceInCent);
        resource.setProductPrice(product.currentPriceInCent);
        Resource resourceM8481j = C2320q.m8481j("fonts", resource);
        this.mOutdated = C2320q.hyr("fonts", resourceM8481j);
        this.mDownloaded = C2320q.dd("fonts", resourceM8481j);
        return resourceM8481j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerThemeStatusObserver$0(ThemeStatus themeStatus) {
        int i2 = themeStatus.status;
        if (i2 == 34 || i2 == 50) {
            this.mDownloaded = true;
            this.mOutdated = false;
        }
        jp0y<? super ThemeStatus> jp0yVar = this.mObserverOuter;
        if (jp0yVar != null) {
            jp0yVar.toq(themeStatus);
        }
    }

    public UIProduct getProduct() {
        List<UIProduct> list = this.uiProductList;
        if (list == null || list.isEmpty()) {
            return null;
        }
        return this.uiProductList.get(0);
    }

    public List<UIProduct> getProductList() {
        return this.uiProductList;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public Resource getResource() {
        return this.mResource;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IStatus
    public int getStatus() {
        return this.mThemeStatus.m4388g().status;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IStatus
    public String getTaskId() {
        return this.mResource.getAssemblyId();
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IStatus
    public fti<ThemeStatus> getThemeStatus() {
        return this.mThemeStatus;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public boolean holdShowing() {
        return this.mThemeStatus.m4388g().status == 144 || this.mThemeStatus.m4388g().status == 32;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public boolean isDownloaded() {
        return this.mDownloaded;
    }

    public boolean isHasMore() {
        return this.mHasMore;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public boolean isOutdated() {
        return this.mOutdated;
    }

    @Override // com.android.thememanager.recommend.model.entity.PlayingElement.IPlaying
    public boolean isPlaying() {
        if (getCardTypeOrdinal() == 107) {
            return this.playingElement.isPlaying();
        }
        return false;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public boolean isShowOperation() {
        return this.showOperation;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IStatus
    public void refresh() {
        this.mResource = createResource(getProduct());
        this.mThemeStatus.m4388g().status = 0;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IStatus
    public void registerThemeStatusObserver(InterfaceC0954z owner, @lvui jp0y<? super ThemeStatus> observer) {
        this.mObserverOuter = observer;
        if (this.mObserverInner == null) {
            this.mObserverInner = new jp0y() { // from class: com.android.thememanager.recommend.model.entity.element.zy
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    this.f13576k.lambda$registerThemeStatusObserver$0((ThemeStatus) obj);
                }
            };
        }
        this.mThemeStatus.m4391p(owner, this.mObserverInner);
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IStatus
    public void removeThemeStatusObserver() {
        this.mThemeStatus.kja0(this.mObserverInner);
        this.mObserverInner = null;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IStatus
    public int reqBoughtState() {
        return this.mReqBoughtState;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public void setDownloaded(boolean downloaded) {
        this.mDownloaded = downloaded;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public void setOutdated(boolean outdated) {
        this.mOutdated = outdated;
    }

    @Override // com.android.thememanager.recommend.model.entity.PlayingElement.IPlaying
    public boolean setPlaying(String uuid) {
        if (getCardTypeOrdinal() != 107) {
            return false;
        }
        UIProduct product = getProduct();
        return this.playingElement.setPlaying(uuid, product == null ? null : product.uuid);
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IStatus
    public void setReqBoughtState(int state) {
        this.mReqBoughtState = state;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public void setShowOperation(boolean showOperation) {
        this.showOperation = showOperation;
    }
}

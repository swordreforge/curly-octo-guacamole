package com.android.thememanager.recommend.model.entity.element;

import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fti;
import androidx.lifecycle.jp0y;
import com.android.thememanager.C2320q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.router.app.entity.ThemeStatus;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class IconSubjectsProductElement extends UIElement implements IStatus {
    private boolean isFirst;
    private boolean mDownloaded;
    private jp0y<? super ThemeStatus> mObserverInner;
    private jp0y<? super ThemeStatus> mObserverOuter;
    private boolean mOutdated;
    private int mReqBoughtState;
    private Resource mResource;
    private boolean mShowOperation;
    private fti<ThemeStatus> mThemeStatus;
    private UIProduct mUiProduct;

    public IconSubjectsProductElement(UIProduct uiProduct) {
        super(115);
        this.mUiProduct = uiProduct;
        if (C1807g.m7081r()) {
            this.mResource = createAndInitResourceState(uiProduct);
            if (this.mThemeStatus == null) {
                this.mThemeStatus = new fti<>(new ThemeStatus(this.mResource.getAssemblyId()));
            }
        }
    }

    private Resource createAndInitResourceState(UIProduct product) {
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
        resource.setCategory(product.productType);
        Resource resourceM8481j = C2320q.m8481j("icons", resource);
        this.mOutdated = C2320q.hyr("icons", resourceM8481j);
        this.mDownloaded = C2320q.dd("icons", resourceM8481j);
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
        return this.mUiProduct;
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

    public boolean isFirst() {
        return this.isFirst;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public boolean isOutdated() {
        return this.mOutdated;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public boolean isShowOperation() {
        return this.mShowOperation;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IStatus
    public void refresh() {
        this.mResource = createAndInitResourceState(this.mUiProduct);
        this.mThemeStatus.m4388g().status = 0;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IStatus
    public void registerThemeStatusObserver(InterfaceC0954z owner, @lvui jp0y<? super ThemeStatus> observer) {
        this.mObserverOuter = observer;
        if (this.mObserverInner == null) {
            this.mObserverInner = new jp0y() { // from class: com.android.thememanager.recommend.model.entity.element.k
                @Override // androidx.lifecycle.jp0y
                public final void toq(Object obj) {
                    this.f13574k.lambda$registerThemeStatusObserver$0((ThemeStatus) obj);
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

    public void setFirst(boolean isFirst) {
        this.isFirst = isFirst;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public void setOutdated(boolean outdated) {
        this.mOutdated = outdated;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IStatus
    public void setReqBoughtState(int state) {
        this.mReqBoughtState = state;
    }

    @Override // com.android.thememanager.recommend.model.entity.element.IElement
    public void setShowOperation(boolean showOperation) {
        this.mShowOperation = showOperation;
    }
}

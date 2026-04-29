package com.android.thememanager.model;

import android.text.TextUtils;
import bf2.toq;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1795s;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.detail.theme.model.OnlineResourceDetail;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.io.File;
import java.util.List;
import java.util.Objects;
import p001b.InterfaceC1356n;

/* JADX INFO: loaded from: classes2.dex */
public class LargeIconElement {
    public static final String DEFAULT_LARGE_ICON_PRODUCT_ID = "default_large_icon_product_id";
    public static final String MORE_PURCHASE_LARGE_ICON_ID = "more_purchase_large_icon_product_id";
    public String author;
    public int currentPriceInCent;
    public boolean enableIconMask = true;
    public boolean hasBought;
    public String id;
    public boolean isInvalid;
    public boolean isOfficialIcons;
    public String name;
    public int originPriceInCent;
    public String packageName;
    public String packageTitle;
    public String previewUrl;
    public String preview_1_1;
    public String preview_1_2;
    public String preview_2_1;
    public String preview_2_2;
    public String productId;
    public String signature;
    public int type;
    public int uiVersion;
    public String uuid;

    public static LargeIconElement create(UIProduct product, int type) {
        LargeIconElement largeIconElement = new LargeIconElement();
        largeIconElement.type = type;
        String str = product.uuid;
        largeIconElement.id = str;
        largeIconElement.uuid = str;
        largeIconElement.author = product.designerName;
        largeIconElement.productId = product.productUuid;
        largeIconElement.name = product.name;
        largeIconElement.previewUrl = product.imageUrl;
        largeIconElement.currentPriceInCent = product.currentPriceInCent;
        largeIconElement.originPriceInCent = product.originPriceInCent;
        Boolean bool = product.isPurchased;
        largeIconElement.hasBought = bool != null && bool.booleanValue();
        return largeIconElement;
    }

    public static Resource createResource() {
        return new Resource();
    }

    public static String getDefaultIconPathByPackageNames(String realPackage) {
        return new File(toq.toq().getFilesDir() + "/largeicons", "icon_largeicons_" + realPackage).getAbsolutePath();
    }

    public boolean equals(Object o2) {
        if (this == o2) {
            return true;
        }
        if (o2 == null || getClass() != o2.getClass()) {
            return false;
        }
        LargeIconElement largeIconElement = (LargeIconElement) o2;
        return this.type == largeIconElement.type && this.uiVersion == largeIconElement.uiVersion && this.hasBought == largeIconElement.hasBought && this.originPriceInCent == largeIconElement.originPriceInCent && this.currentPriceInCent == largeIconElement.currentPriceInCent && this.isOfficialIcons == largeIconElement.isOfficialIcons && this.isInvalid == largeIconElement.isInvalid && Objects.equals(this.id, largeIconElement.id) && Objects.equals(this.uuid, largeIconElement.uuid) && Objects.equals(this.productId, largeIconElement.productId) && Objects.equals(this.name, largeIconElement.name) && Objects.equals(this.author, largeIconElement.author) && Objects.equals(this.signature, largeIconElement.signature) && Objects.equals(this.packageTitle, largeIconElement.packageTitle) && Objects.equals(this.packageName, largeIconElement.packageName) && Objects.equals(this.previewUrl, largeIconElement.previewUrl) && Objects.equals(this.preview_1_1, largeIconElement.preview_1_1) && Objects.equals(this.preview_2_1, largeIconElement.preview_2_1) && Objects.equals(this.preview_1_2, largeIconElement.preview_1_2) && Objects.equals(this.preview_2_2, largeIconElement.preview_2_2);
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.type), this.id, this.uuid, this.productId, this.name, this.author, this.signature, this.packageTitle, this.packageName, Integer.valueOf(this.uiVersion), this.previewUrl, this.preview_1_1, this.preview_2_1, this.preview_1_2, this.preview_2_2, Boolean.valueOf(this.hasBought), Integer.valueOf(this.originPriceInCent), Integer.valueOf(this.currentPriceInCent), Boolean.valueOf(this.isOfficialIcons), Boolean.valueOf(this.isInvalid));
    }

    public static LargeIconElement create(OnlineResourceDetail detail, LargeIconElement element, String realPackageName) {
        if (element == null) {
            element = new LargeIconElement();
        }
        element.name = detail.name;
        element.productId = detail.productId;
        element.packageName = detail.productPackageName;
        element.previewUrl = detail.imageUrl;
        element.author = detail.designerName;
        element.uiVersion = detail.uiVersion;
        if (detail.isOfficialIcons == 1) {
            element.id = DEFAULT_LARGE_ICON_PRODUCT_ID;
            element.uuid = detail.getId();
            element.preview_1_1 = getDefaultIconPathByPackageNames(realPackageName);
            element.isOfficialIcons = true;
        } else {
            element.preview_1_1 = detail.largeIconsUrl_1x1;
            element.id = detail.getId();
            element.uuid = detail.getId();
        }
        element.preview_2_1 = detail.largeIconsUrl_2x1;
        element.preview_1_2 = detail.largeIconsUrl_1x2;
        element.preview_2_2 = detail.largeIconsUrl_2x2;
        element.currentPriceInCent = detail.productPrice;
        element.originPriceInCent = detail.originPrice;
        element.enableIconMask = detail.enableIconMask;
        element.hasBought = detail.bought;
        element.isInvalid = true;
        return element;
    }

    public static OnlineResourceDetail create(LargeIconElement largeIconElement) {
        OnlineResourceDetail onlineResourceDetail = new OnlineResourceDetail();
        onlineResourceDetail.name = largeIconElement.name;
        onlineResourceDetail.productPackageName = largeIconElement.packageName;
        onlineResourceDetail.imageUrl = largeIconElement.previewUrl;
        onlineResourceDetail.productId = largeIconElement.productId;
        String str = largeIconElement.author;
        onlineResourceDetail.designerName = str;
        if (largeIconElement.isOfficialIcons) {
            onlineResourceDetail.isOfficialIcons = 1;
        } else {
            onlineResourceDetail.isOfficialIcons = 0;
        }
        String str2 = largeIconElement.id;
        onlineResourceDetail.moduleId = str2;
        String str3 = largeIconElement.uuid;
        onlineResourceDetail.packId = str3;
        if (str3 == null) {
            onlineResourceDetail.packId = str2;
        }
        onlineResourceDetail.largeIconsUrl_1x1 = largeIconElement.preview_1_1;
        onlineResourceDetail.largeIconsUrl_2x1 = largeIconElement.preview_2_1;
        onlineResourceDetail.largeIconsUrl_1x2 = largeIconElement.preview_1_2;
        onlineResourceDetail.largeIconsUrl_2x2 = largeIconElement.preview_2_2;
        onlineResourceDetail.productPrice = largeIconElement.currentPriceInCent;
        onlineResourceDetail.originPrice = largeIconElement.originPriceInCent;
        onlineResourceDetail.bought = largeIconElement.hasBought;
        onlineResourceDetail.designerName = str;
        onlineResourceDetail.uiVersion = largeIconElement.uiVersion;
        onlineResourceDetail.isOfficialIcons = TextUtils.equals(str2, DEFAULT_LARGE_ICON_PRODUCT_ID) ? 1 : 0;
        onlineResourceDetail.enableIconMask = largeIconElement.enableIconMask;
        return onlineResourceDetail;
    }

    public static LargeIconElement create(Resource resource) {
        C1795s c1795s = new C1795s(resource, C1791k.getInstance("largeicons"));
        LargeIconElement largeIconElement = new LargeIconElement();
        largeIconElement.uuid = resource.getOnlineId();
        largeIconElement.id = resource.getOnlineId();
        largeIconElement.productId = resource.getAssemblyId();
        largeIconElement.name = resource.getTitle();
        largeIconElement.hasBought = resource.isProductBought();
        largeIconElement.packageName = resource.getLocalInfo().getLargeIconPackageName();
        largeIconElement.originPriceInCent = resource.getOriginPrice();
        largeIconElement.currentPriceInCent = resource.getProductPrice();
        largeIconElement.author = resource.getLocalInfo().getAuthor();
        largeIconElement.uiVersion = resource.getLocalInfo().getPlatform();
        List<String> listM6967n = c1795s.m6967n();
        if (y9n.mcp(listM6967n)) {
            listM6967n = c1795s.m6969q();
        }
        if (!y9n.mcp(listM6967n)) {
            largeIconElement.previewUrl = listM6967n.get(0);
        }
        for (String str : c1795s.m6969q()) {
            if (str.contains(InterfaceC1356n.f7200k)) {
                largeIconElement.preview_1_1 = str;
            } else if (str.contains(InterfaceC1356n.f53839zy)) {
                largeIconElement.preview_1_2 = str;
            } else if (str.contains(InterfaceC1356n.f53838toq)) {
                largeIconElement.preview_2_1 = str;
            } else if (str.contains(InterfaceC1356n.f7201q)) {
                largeIconElement.preview_2_2 = str;
            }
        }
        return largeIconElement;
    }
}

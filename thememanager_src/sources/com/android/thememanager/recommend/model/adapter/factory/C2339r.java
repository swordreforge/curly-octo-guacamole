package com.android.thememanager.recommend.model.adapter.factory;

import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.recommend.model.entity.element.ThemeSearchElement;
import com.android.thememanager.router.recommend.entity.UICard;
import com.android.thememanager.router.recommend.entity.UIElement;
import com.android.thememanager.router.recommend.entity.UIProduct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.android.thememanager.recommend.model.adapter.factory.r */
/* JADX INFO: compiled from: ResourceSearchElement.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2339r extends qrj {

    /* JADX INFO: renamed from: g */
    private static final int f13559g = 2;

    /* JADX INFO: renamed from: n */
    private static final int f13560n = 2;

    /* JADX INFO: renamed from: q */
    private static final int f13561q = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int f60639toq = 3;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f60640zy = 2;

    /* JADX INFO: renamed from: k */
    private boolean f13562k;

    public C2339r(boolean hasMore) {
        this.f13562k = hasMore;
    }

    /* JADX INFO: renamed from: q */
    private List<UIElement> m8510q(List<UIProduct> uiProductList) {
        ArrayList arrayList = new ArrayList();
        if (com.android.thememanager.basemodule.utils.y9n.mcp(uiProductList)) {
            return arrayList;
        }
        for (UIProduct uIProduct : uiProductList) {
            if (uIProduct != null && !p029m.zy.toq(uIProduct.productType)) {
                String str = uIProduct.productType;
                str.hashCode();
                if (!str.equals(InterfaceC1789q.fd23)) {
                    return arrayList;
                }
                arrayList.add(new com.android.thememanager.t8r(uIProduct));
            }
        }
        return arrayList;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int toq(java.util.List<com.android.thememanager.router.recommend.entity.UIProduct> r6, java.lang.String r7) {
        /*
            r5 = this;
            int r0 = r7.hashCode()
            r1 = 4
            r2 = 3
            r3 = 1
            r4 = 2
            switch(r0) {
                case -1653227778: goto L48;
                case -453956702: goto L3e;
                case -33677854: goto L34;
                case 64982: goto L2a;
                case 2163791: goto L20;
                case 69491450: goto L16;
                case 79789481: goto Lc;
                default: goto Lb;
            }
        Lb:
            goto L52
        Lc:
            java.lang.String r0 = "THEME"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L52
            r7 = 6
            goto L53
        L16:
            java.lang.String r0 = "ICONS"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L52
            r7 = r1
            goto L53
        L20:
            java.lang.String r0 = "FONT"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L52
            r7 = r4
            goto L53
        L2a:
            java.lang.String r0 = "AOD"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L52
            r7 = r2
            goto L53
        L34:
            java.lang.String r0 = "WALLPAPER"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L52
            r7 = 5
            goto L53
        L3e:
            java.lang.String r0 = "RINGTONE"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L52
            r7 = r3
            goto L53
        L48:
            java.lang.String r0 = "VIDEO_WALLPAPER"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L52
            r7 = 0
            goto L53
        L52:
            r7 = -1
        L53:
            if (r7 == 0) goto L60
            if (r7 == r3) goto L5e
            if (r7 == r4) goto L5e
            if (r7 == r2) goto L60
            if (r7 == r1) goto L60
            goto L61
        L5e:
            r2 = r3
            goto L61
        L60:
            r2 = r4
        L61:
            int r6 = r6.size()
            int r6 = r6 + r2
            int r6 = r6 - r3
            int r6 = r6 / r2
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.recommend.model.adapter.factory.C2339r.toq(java.util.List, java.lang.String):int");
    }

    private boolean zy(String category) {
        category.hashCode();
        return category.equals(InterfaceC1789q.fd23);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.android.thememanager.recommend.model.adapter.factory.qrj
    /* JADX INFO: renamed from: k */
    public List<UIElement> mo8509k(UICard card) {
        ThemeSearchElement themeSearchElement;
        ThemeSearchElement themeSearchElement2;
        ArrayList arrayList = new ArrayList();
        List<UIProduct> list = card.products;
        if (list != null && list.size() != 0) {
            if (zy(list.get(0).productType)) {
                return m8510q(list);
            }
            int qVar = toq(list, list.get(0).productType);
            int i2 = 0;
            while (i2 < qVar) {
                UIProduct uIProduct = list.get(i2);
                ArrayList arrayList2 = new ArrayList();
                String str = uIProduct.productType;
                byte b2 = -1;
                switch (str.hashCode()) {
                    case -1653227778:
                        if (str.equals("VIDEO_WALLPAPER")) {
                            b2 = 1;
                        }
                        break;
                    case -453956702:
                        if (str.equals("RINGTONE")) {
                            b2 = 3;
                        }
                        break;
                    case -33677854:
                        if (str.equals("WALLPAPER")) {
                            b2 = 0;
                        }
                        break;
                    case 64982:
                        if (str.equals("AOD")) {
                            b2 = 4;
                        }
                        break;
                    case 2163791:
                        if (str.equals("FONT")) {
                            b2 = 2;
                        }
                        break;
                    case 69491450:
                        if (str.equals(InterfaceC1789q.e1v)) {
                            b2 = 5;
                        }
                        break;
                    case 79789481:
                        if (str.equals("THEME")) {
                            b2 = 6;
                        }
                        break;
                }
                if (b2 == 0) {
                    themeSearchElement = new ThemeSearchElement(104, i2 == qVar + (-1) ? list.subList(i2 * 3, list.size()) : list.subList(i2 * 3, (i2 + 1) * 3), this.f13562k);
                } else if (b2 != 1) {
                    if (b2 == 2) {
                        arrayList2.add(uIProduct);
                        themeSearchElement2 = new ThemeSearchElement(106, arrayList2, this.f13562k);
                    } else if (b2 == 3) {
                        arrayList2.add(uIProduct);
                        themeSearchElement2 = new ThemeSearchElement(107, arrayList2, this.f13562k);
                    } else if (b2 == 4) {
                        themeSearchElement = new ThemeSearchElement(108, i2 == qVar + (-1) ? list.subList(i2 * 2, list.size()) : list.subList(i2 * 2, (i2 + 1) * 2), this.f13562k);
                    } else if (b2 != 5) {
                        themeSearchElement = new ThemeSearchElement(103, i2 == qVar + (-1) ? list.subList(i2 * 3, list.size()) : list.subList(i2 * 3, (i2 + 1) * 3), this.f13562k);
                    } else {
                        themeSearchElement = new ThemeSearchElement(116, i2 == qVar + (-1) ? list.subList(i2 * 2, list.size()) : list.subList(i2 * 2, (i2 + 1) * 2), this.f13562k);
                    }
                    themeSearchElement = themeSearchElement2;
                } else {
                    themeSearchElement = new ThemeSearchElement(105, i2 == qVar + (-1) ? list.subList(i2 * 2, list.size()) : list.subList(i2 * 2, (i2 + 1) * 2), this.f13562k);
                }
                arrayList.add(themeSearchElement);
                i2++;
            }
        }
        return arrayList;
    }
}

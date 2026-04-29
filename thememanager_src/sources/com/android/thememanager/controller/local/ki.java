package com.android.thememanager.controller.local;

import android.text.TextUtils;
import com.android.thememanager.basemodule.local.C1743g;
import com.android.thememanager.basemodule.local.C1751n;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1804f;
import com.android.thememanager.fu4;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.ltg8;
import java.io.File;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import miui.os.Build;
import miuix.core.util.C7083n;
import p001b.InterfaceC1356n;

/* JADX INFO: compiled from: ThemeJSONDataParser.java */
/* JADX INFO: loaded from: classes2.dex */
public class ki extends C1751n implements InterfaceC1789q {
    public ki(fu4 context) {
        super(context.getNewResourceContext());
    }

    private void cdj(Resource resource) {
        if (resource == null) {
            return;
        }
        List<String> buildInThumbnails = resource.getBuildInThumbnails();
        if (buildInThumbnails != null) {
            if ("largeicons".equals(this.f10033k.getResourceCode())) {
                resource.setBuildInThumbnails((List) buildInThumbnails.stream().filter(new Predicate() { // from class: com.android.thememanager.controller.local.cdj
                    @Override // java.util.function.Predicate
                    public final boolean test(Object obj) {
                        return ki.t8r((String) obj);
                    }
                }).collect(Collectors.toList()));
            } else {
                for (int size = buildInThumbnails.size() - 1; size > 0; size--) {
                    buildInThumbnails.remove(size);
                }
            }
        }
        if (g1.m9739c(this.f10033k.getResourceCode(), resource.getMetaPath())) {
            String qVar = ltg8.toq();
            if (TextUtils.isEmpty(qVar)) {
                return;
            }
            fn3e(resource, qVar, true);
            fn3e(resource, qVar, false);
            return;
        }
        if (com.android.thememanager.basemodule.resource.n7h.zy(resource)) {
            String strKja0 = C1804f.toq().kja0();
            fn3e(resource, strKja0, true);
            fn3e(resource, strKja0, false);
        }
    }

    private static void fn3e(Resource r2, String suffix, boolean forThumbnails) {
        List<String> buildInThumbnails = forThumbnails ? r2.getBuildInThumbnails() : r2.getBuildInPreviews();
        if (buildInThumbnails != null) {
            for (int i2 = 0; i2 < buildInThumbnails.size(); i2++) {
                String str = InterfaceC1789q.yj1 + suffix + "_" + C7083n.m25584g(buildInThumbnails.get(i2));
                if (new File(str).exists()) {
                    buildInThumbnails.set(i2, str);
                }
            }
        }
    }

    /* JADX INFO: renamed from: i */
    private static void m7510i(Resource r2, boolean forThumbnails) {
        List<String> buildInThumbnails = forThumbnails ? r2.getBuildInThumbnails() : r2.getBuildInPreviews();
        if (buildInThumbnails != null) {
            for (int i2 = 0; i2 < buildInThumbnails.size(); i2++) {
                File file = new File(buildInThumbnails.get(i2));
                String name = file.getName();
                int iLastIndexOf = name.lastIndexOf(".");
                File file2 = new File(file.getParent(), iLastIndexOf > 0 ? name.substring(0, iLastIndexOf) + "_" + ki() + name.substring(iLastIndexOf) : name + "_" + ki());
                if (file2.exists()) {
                    buildInThumbnails.set(i2, file2.getAbsolutePath());
                }
            }
        }
    }

    private static String ki() {
        String str = Build.MODEL;
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "unknown")) {
            str = Build.PRODUCT;
        }
        return str.replace(' ', '_');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean t8r(String str) {
        return str.contains(InterfaceC1356n.f7201q);
    }

    @Override // com.android.thememanager.basemodule.local.C1751n, com.android.thememanager.basemodule.local.AbstractC1753q
    /* JADX INFO: renamed from: k */
    public Resource mo6852k(File file) throws C1743g {
        String resourceCode = this.f10033k.getResourceCode();
        Resource resourceMo6852k = super.mo6852k(file);
        boolean zEquals = file.getAbsolutePath().equals(p001b.toq.t8r(resourceCode));
        if ("theme".equals(resourceCode)) {
            if (!zEquals && !"theme".equals(C1792n.m6942o(resourceMo6852k))) {
                return null;
            }
        } else if (!g1.m9748l(resourceMo6852k.getLocalPlatform(), resourceCode)) {
            return null;
        }
        cdj(resourceMo6852k);
        if (ch.n5r1(file.getAbsolutePath())) {
            m7510i(resourceMo6852k, true);
            m7510i(resourceMo6852k, false);
        }
        return resourceMo6852k;
    }
}

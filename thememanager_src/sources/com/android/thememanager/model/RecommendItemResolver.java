package com.android.thememanager.model;

import android.content.Intent;
import bf2.toq;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.x9kr;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.fu4;
import com.android.thememanager.model.RecommendItem;
import java.io.Serializable;
import java.util.ArrayList;
import miui.settings.splitlib.zy;
import p001b.InterfaceC1357q;

/* JADX INFO: loaded from: classes2.dex */
public class RecommendItemResolver implements InterfaceC1357q {
    private boolean mIsBelt;
    private RecommendItem mRecommendItem;
    private fu4 mResourceContext;

    /* JADX INFO: renamed from: com.android.thememanager.model.RecommendItemResolver$1 */
    static /* synthetic */ class C22141 {

        /* JADX INFO: renamed from: $SwitchMap$com$android$thememanager$model$RecommendItem$RecommendType */
        static final /* synthetic */ int[] f13022xab24ca3e;

        static {
            int[] iArr = new int[RecommendItem.RecommendType.values().length];
            f13022xab24ca3e = iArr;
            try {
                iArr[RecommendItem.RecommendType.SINGLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13022xab24ca3e[RecommendItem.RecommendType.PAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13022xab24ca3e[RecommendItem.RecommendType.PACK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13022xab24ca3e[RecommendItem.RecommendType.LINK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13022xab24ca3e[RecommendItem.RecommendType.SEARCH.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13022xab24ca3e[RecommendItem.RecommendType.CUSTOMIZE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13022xab24ca3e[RecommendItem.RecommendType.LOCAL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public RecommendItemResolver(RecommendItem recommendItem, fu4 resourceContext) {
        this(recommendItem, resourceContext, false);
    }

    private Intent getForwardListIntent() {
        Intent intent = new Intent();
        intent.setClassName(this.mResourceContext.getTabActivityPackage(), this.mResourceContext.getTabActivityClass());
        intent.putExtra(InterfaceC1357q.f53865ek5k, (Serializable) this.mRecommendItem.getPageGroups());
        intent.putExtra(InterfaceC1357q.f53927oc, this.mRecommendItem.getContentId());
        intent.putExtra(InterfaceC1357q.f53866eqxt, this.mRecommendItem.getTitle());
        if (this.mIsBelt) {
            intent.putExtra("REQUEST_RESOURCE_CODE", this.mResourceContext.getResourceCode());
        }
        return intent;
    }

    public static Intent getForwardLocalIntent(String resourceCode) {
        return getForwardLocalIntent(C2082k.zy().m8001n().m10535g(resourceCode));
    }

    private Intent getForwardSearchIntent() {
        Intent intent = new Intent("android.intent.action.SEARCH");
        intent.setClassName(this.mResourceContext.getSearchActivityPackage(), this.mResourceContext.getSearchActivityClass());
        intent.putExtra(InterfaceC1357q.f53866eqxt, this.mRecommendItem.getTitle());
        intent.putExtra(InterfaceC1357q.f53927oc, this.mRecommendItem.getContentId());
        if (this.mIsBelt) {
            intent.putExtra("REQUEST_RESOURCE_CODE", this.mResourceContext.getResourceCode());
        }
        intent.setFlags(536870912);
        return intent;
    }

    private Intent getForwardSingleIntent() {
        Intent intent = new Intent();
        intent.setClassName(this.mResourceContext.getDetailActivityPackage(), this.mResourceContext.getDetailActivityClass());
        intent.putExtra(InterfaceC1357q.f53893jp0y, 0);
        intent.putExtra(InterfaceC1357q.f53879gvn7, 0);
        intent.putExtra(InterfaceC1357q.f53965y2, 4);
        intent.putExtra(InterfaceC1357q.f53927oc, this.mRecommendItem.getContentId());
        intent.putExtra(InterfaceC1357q.f53866eqxt, this.mRecommendItem.getTitle());
        if (this.mIsBelt) {
            intent.putExtra("REQUEST_RESOURCE_CODE", this.mResourceContext.getResourceCode());
        }
        return intent;
    }

    private Intent getForwardWebIntent() {
        Intent intentZy;
        if ((this.mRecommendItem.getFlags() & 1) != 0) {
            intentZy = new Intent();
            intentZy.setClassName(this.mResourceContext.getWebActivityPackage(), this.mResourceContext.getWebActivityClass());
            intentZy.putExtra(InterfaceC1357q.f53885i1, this.mRecommendItem.getContentId());
            intentZy.putExtra(InterfaceC1357q.f53842a98o, this.mRecommendItem.getFlags());
            if (this.mIsBelt) {
                intentZy.putExtra("REQUEST_RESOURCE_CODE", this.mResourceContext.getResourceCode());
            }
        } else {
            intentZy = x9kr.zy(this.mRecommendItem.getContentId());
        }
        intentZy.putExtra(InterfaceC1357q.f53927oc, this.mRecommendItem.getContentId());
        intentZy.putExtra(InterfaceC1357q.f53866eqxt, this.mRecommendItem.getTitle());
        return intentZy;
    }

    protected Intent getForwardCustomizeIntent() {
        if (this.mResourceContext.getCustomizeActivityPackage() == null || this.mResourceContext.getCustomizeActivityClass() == null) {
            return null;
        }
        Intent intent = new Intent();
        intent.setClassName(this.mResourceContext.getCustomizeActivityPackage(), this.mResourceContext.getCustomizeActivityClass());
        return intent;
    }

    public Intent getForwardIntent() {
        switch (C22141.f13022xab24ca3e[this.mRecommendItem.getItemType().ordinal()]) {
            case 1:
                return getForwardSingleIntent();
            case 2:
            case 3:
                return getForwardListIntent();
            case 4:
                return getForwardWebIntent();
            case 5:
                return getForwardSearchIntent();
            case 6:
                return getForwardCustomizeIntent();
            case 7:
                return getForwardLocalIntent(this.mResourceContext);
            default:
                return null;
        }
    }

    public RecommendItemResolver(RecommendItem recommendItem, fu4 resourceContext, boolean isBelt) {
        this.mRecommendItem = recommendItem;
        this.mResourceContext = resourceContext;
        this.mIsBelt = isBelt;
    }

    public static Intent getForwardLocalIntent(fu4 resourceContext) {
        String string = C2082k.zy().toq().getString(R.string.resource_my);
        ArrayList arrayList = new ArrayList();
        PageGroup pageGroup = new PageGroup();
        pageGroup.setResourceCode(resourceContext.getResourceCode());
        pageGroup.setTitle(string);
        Page page = new Page();
        page.setKey(String.format(InterfaceC1925p.vx4g, resourceContext.getResourceStamp()));
        pageGroup.addPage(page);
        arrayList.add(pageGroup);
        Intent intent = new Intent();
        intent.setClassName(resourceContext.getTabActivityPackage(), resourceContext.getTabActivityClass());
        intent.putExtra(InterfaceC1357q.f53865ek5k, arrayList);
        intent.putExtra(InterfaceC1357q.f53866eqxt, string);
        return C1807g.lvui() ? zy.m24752k(toq.toq(), intent, toq.toq().getString(R.string.personalize_title)) : intent;
    }
}

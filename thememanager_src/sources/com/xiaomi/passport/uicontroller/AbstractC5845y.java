package com.xiaomi.passport.uicontroller;

import com.xiaomi.accountsdk.futureservice.AbstractC5505k;

/* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.y */
/* JADX INFO: compiled from: UIControllerFuture.java */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC5845y<ModelDataType, UIDataType> extends AbstractC5505k<ModelDataType, UIDataType> {

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.y$k */
    /* JADX INFO: compiled from: UIControllerFuture.java */
    public interface k<UIDataType> extends AbstractC5505k.zy<UIDataType> {
    }

    protected AbstractC5845y(k<UIDataType> kVar) {
        super(kVar);
    }

    /* JADX INFO: renamed from: p */
    protected abstract UIDataType mo20492p(ModelDataType modeldatatype) throws Throwable;

    @Override // com.xiaomi.accountsdk.futureservice.AbstractC5505k
    protected final UIDataType toq(ModelDataType modeldatatype) throws Throwable {
        return mo20492p(modeldatatype);
    }
}

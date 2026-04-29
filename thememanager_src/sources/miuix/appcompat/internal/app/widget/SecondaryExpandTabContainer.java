package miuix.appcompat.internal.app.widget;

import android.content.Context;
import gb.toq;

/* JADX INFO: loaded from: classes3.dex */
public class SecondaryExpandTabContainer extends SecondaryTabContainerView {
    public SecondaryExpandTabContainer(Context context) {
        super(context);
        setContentHeight(getTabContainerHeight());
    }

    @Override // miuix.appcompat.internal.app.widget.SecondaryTabContainerView
    protected int getDefaultTabTextStyle() {
        return toq.C6055q.f76538i1;
    }

    @Override // miuix.appcompat.internal.app.widget.SecondaryTabContainerView
    protected int getTabActivatedTextStyle() {
        return toq.C6055q.f34922j;
    }

    @Override // miuix.appcompat.internal.app.widget.SecondaryTabContainerView
    int getTabContainerHeight() {
        return -2;
    }
}

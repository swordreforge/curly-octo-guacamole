package miuix.animation.internal;

import java.util.Collection;
import miuix.animation.IAnimTarget;
import miuix.animation.base.AnimConfig;
import miuix.animation.base.AnimConfigLink;
import miuix.animation.controller.AnimState;
import miuix.animation.listener.ListenerNotifier;
import miuix.animation.listener.UpdateInfo;

/* JADX INFO: loaded from: classes3.dex */
public class NotifyManager {
    private AnimConfig mConfig = new AnimConfig();
    ListenerNotifier mNotifier;
    ListenerNotifier mSetToNotifier;
    IAnimTarget mTarget;

    public NotifyManager(IAnimTarget iAnimTarget) {
        this.mTarget = iAnimTarget;
        this.mSetToNotifier = new ListenerNotifier(iAnimTarget);
        this.mNotifier = new ListenerNotifier(iAnimTarget);
    }

    public ListenerNotifier getNotifier() {
        return this.mNotifier;
    }

    public void setToNotify(AnimState animState, AnimConfigLink animConfigLink) {
        if (animConfigLink == null) {
            return;
        }
        Object tag = animState.getTag();
        this.mConfig.copy(animState.getConfig());
        animConfigLink.addTo(this.mConfig);
        if (!this.mSetToNotifier.addListeners(tag, this.mConfig)) {
            this.mConfig.clear();
            return;
        }
        this.mSetToNotifier.notifyBegin(tag, tag);
        Collection<UpdateInfo> collectionValues = this.mTarget.animManager.mUpdateMap.values();
        this.mSetToNotifier.notifyPropertyBegin(tag, tag, collectionValues);
        this.mSetToNotifier.notifyUpdate(tag, tag, collectionValues);
        this.mSetToNotifier.notifyPropertyEnd(tag, tag, collectionValues);
        this.mSetToNotifier.notifyEndAll(tag, tag);
        this.mSetToNotifier.removeListeners(tag);
        this.mConfig.clear();
    }
}

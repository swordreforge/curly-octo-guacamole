package com.miui.maml.folme;

import com.miui.maml.elements.AnimatedScreenElement;
import com.miui.maml.elements.FunctionElement;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;

/* JADX INFO: loaded from: classes3.dex */
public class MamlTransitionListener extends TransitionListener {
    private AnimatedScreenElement mTarget;
    public CopyOnWriteArraySet<FunctionElement> mUpdateCallback = new CopyOnWriteArraySet<>();
    public CopyOnWriteArraySet<FunctionElement> mBeginCallback = new CopyOnWriteArraySet<>();
    public CopyOnWriteArraySet<FunctionElement> mCompleteCallback = new CopyOnWriteArraySet<>();

    public MamlTransitionListener(AnimatedScreenElement animatedScreenElement) {
        this.mTarget = animatedScreenElement;
    }

    @Override // miuix.animation.listener.TransitionListener
    public void onBegin(Object obj) {
        Iterator<FunctionElement> it = this.mBeginCallback.iterator();
        while (it.hasNext()) {
            it.next().perform();
        }
    }

    @Override // miuix.animation.listener.TransitionListener
    public void onComplete(Object obj) {
        this.mTarget.mToProperties.clear();
        Iterator<FunctionElement> it = this.mCompleteCallback.iterator();
        while (it.hasNext()) {
            it.next().perform();
        }
    }

    @Override // miuix.animation.listener.TransitionListener
    public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
        for (UpdateInfo updateInfo : collection) {
            Object obj2 = updateInfo.property;
            if (obj2 instanceof IAnimatedProperty) {
                ((IAnimatedProperty) obj2).setVelocityValue(this.mTarget, (float) updateInfo.velocity);
            }
            if (updateInfo.isCompleted) {
                this.mTarget.mToProperties.remove(obj2);
            }
        }
        Iterator<FunctionElement> it = this.mUpdateCallback.iterator();
        while (it.hasNext()) {
            it.next().perform();
        }
    }
}

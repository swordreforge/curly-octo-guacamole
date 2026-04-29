package com.miui.maml.folme;

import java.lang.ref.WeakReference;
import java.util.Collection;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;

/* JADX INFO: loaded from: classes3.dex */
public class TransitionListenerWrapper extends TransitionListener {
    private WeakReference<MamlTransitionListener> mRef;

    public TransitionListenerWrapper(MamlTransitionListener mamlTransitionListener) {
        if (mamlTransitionListener != null) {
            this.mRef = new WeakReference<>(mamlTransitionListener);
        }
    }

    public MamlTransitionListener getListener() {
        WeakReference<MamlTransitionListener> weakReference = this.mRef;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // miuix.animation.listener.TransitionListener
    public void onBegin(Object obj) {
        MamlTransitionListener listener = getListener();
        if (listener != null) {
            listener.onBegin(obj);
        }
    }

    @Override // miuix.animation.listener.TransitionListener
    public void onComplete(Object obj) {
        MamlTransitionListener listener = getListener();
        if (listener != null) {
            listener.onComplete(obj);
        }
    }

    @Override // miuix.animation.listener.TransitionListener
    public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
        MamlTransitionListener listener = getListener();
        if (listener != null) {
            listener.onUpdate(obj, collection);
        }
    }
}

package miuix.animation.controller;

import android.graphics.Color;
import android.view.View;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import miuix.animation.IAnimTarget;
import miuix.animation.IBlinkStyle;
import miuix.animation.base.AnimConfig;
import miuix.animation.internal.BlinkStateObserver;
import miuix.animation.internal.BlinkStateSubject;
import miuix.animation.listener.TransitionListener;
import miuix.animation.property.ViewPropertyExt;
import pnt2.toq;

/* JADX INFO: loaded from: classes3.dex */
public class FolmeBlink extends FolmeBase implements IBlinkStyle, BlinkStateSubject {
    int flashcount;
    private List<BlinkStateObserver> mBlinkStateObserverList;
    private Runnable mBlinkTask;
    private long mInterval;
    private int mLimitCount;
    private AnimConfig mStopConfig;
    private AnimConfig mToHighlightConfig;
    private AnimConfig mToNormalConfig;

    public FolmeBlink(IAnimTarget... iAnimTargetArr) {
        super(iAnimTargetArr);
        this.mInterval = 0L;
        this.mLimitCount = 1;
        this.mBlinkStateObserverList = new CopyOnWriteArrayList();
        this.mToHighlightConfig = new AnimConfig().setEase(6, 600.0f);
        this.mToNormalConfig = new AnimConfig().setEase(16, 400.0f);
        this.mStopConfig = new AnimConfig().setEase(6, 100.0f);
        this.mBlinkTask = new Runnable() { // from class: miuix.animation.controller.FolmeBlink.1
            @Override // java.lang.Runnable
            public void run() {
                IFolmeStateStyle iFolmeStateStyle = FolmeBlink.this.mState;
                iFolmeStateStyle.to(iFolmeStateStyle.getState(IBlinkStyle.BlinkType.HIGHLIGHT), FolmeBlink.this.mToHighlightConfig);
            }
        };
        this.flashcount = 0;
        setTintColor();
        this.mToNormalConfig.addListeners(new TransitionListener() { // from class: miuix.animation.controller.FolmeBlink.6
            @Override // miuix.animation.listener.TransitionListener
            public void onComplete(Object obj) {
                super.onComplete(obj);
                FolmeBlink folmeBlink = FolmeBlink.this;
                folmeBlink.flashcount++;
                Object targetObject = folmeBlink.mState.getTarget().getTargetObject();
                FolmeBlink folmeBlink2 = FolmeBlink.this;
                if (folmeBlink2.flashcount == folmeBlink2.mLimitCount || targetObject == null) {
                    FolmeBlink.this.notifyState(true);
                } else {
                    FolmeBlink.this.startBlink(new AnimConfig[0]);
                }
            }
        });
        this.mToHighlightConfig.addListeners(new TransitionListener() { // from class: miuix.animation.controller.FolmeBlink.7
            @Override // miuix.animation.listener.TransitionListener
            public void onComplete(Object obj) {
                super.onComplete(obj);
                IFolmeStateStyle iFolmeStateStyle = FolmeBlink.this.mState;
                iFolmeStateStyle.to(iFolmeStateStyle.getState(IBlinkStyle.BlinkType.NORMAL), FolmeBlink.this.mToNormalConfig);
            }
        });
        this.mStopConfig.addListeners(new TransitionListener() { // from class: miuix.animation.controller.FolmeBlink.8
            @Override // miuix.animation.listener.TransitionListener
            public void onCancel(Object obj) {
                super.onCancel(obj);
                FolmeBlink.this.mState.cancel(ViewPropertyExt.FOREGROUND);
                FolmeBlink.this.mState.clean();
            }

            @Override // miuix.animation.listener.TransitionListener
            public void onComplete(Object obj) {
                super.onComplete(obj);
                FolmeBlink.this.mState.cancel(ViewPropertyExt.FOREGROUND);
                FolmeBlink.this.mState.clean();
            }
        });
    }

    private void setTintColor() {
        int iArgb = Color.argb(20, 0, 0, 0);
        Object targetObject = this.mState.getTarget().getTargetObject();
        if (targetObject instanceof View) {
            iArgb = ((View) targetObject).getResources().getColor(toq.C7609k.f43958k);
        }
        ViewPropertyExt.ForegroundProperty foregroundProperty = ViewPropertyExt.FOREGROUND;
        this.mState.getState(IBlinkStyle.BlinkType.HIGHLIGHT).add(foregroundProperty, iArgb);
        this.mState.getState(IBlinkStyle.BlinkType.NORMAL).add(foregroundProperty, 0.0d);
    }

    @Override // miuix.animation.internal.BlinkStateSubject
    public void attach(BlinkStateObserver blinkStateObserver) {
        this.mBlinkStateObserverList.add(blinkStateObserver);
    }

    @Override // miuix.animation.internal.BlinkStateSubject
    public void detach(BlinkStateObserver blinkStateObserver) {
        this.mBlinkStateObserverList.remove(blinkStateObserver);
    }

    @Override // miuix.animation.internal.BlinkStateSubject
    public void notifyState(boolean z2) {
        Iterator<BlinkStateObserver> it = this.mBlinkStateObserverList.iterator();
        while (it.hasNext()) {
            it.next().updateBlinkState(z2);
        }
    }

    @Override // miuix.animation.IBlinkStyle
    public IBlinkStyle resetConfig() {
        this.mToHighlightConfig.setEase(6, 600.0f).addListeners(new TransitionListener() { // from class: miuix.animation.controller.FolmeBlink.2
            @Override // miuix.animation.listener.TransitionListener
            public void onComplete(Object obj) {
                super.onComplete(obj);
                IFolmeStateStyle iFolmeStateStyle = FolmeBlink.this.mState;
                iFolmeStateStyle.to(iFolmeStateStyle.getState(IBlinkStyle.BlinkType.NORMAL), FolmeBlink.this.mToNormalConfig);
            }
        });
        this.mToNormalConfig.setEase(16, 400.0f).addListeners(new TransitionListener() { // from class: miuix.animation.controller.FolmeBlink.3
            @Override // miuix.animation.listener.TransitionListener
            public void onComplete(Object obj) {
                super.onComplete(obj);
                FolmeBlink folmeBlink = FolmeBlink.this;
                folmeBlink.flashcount++;
                Object targetObject = folmeBlink.mState.getTarget().getTargetObject();
                FolmeBlink folmeBlink2 = FolmeBlink.this;
                if (folmeBlink2.flashcount == folmeBlink2.mLimitCount || targetObject == null) {
                    FolmeBlink.this.notifyState(true);
                } else {
                    FolmeBlink.this.startBlink(new AnimConfig[0]);
                }
            }
        });
        this.mInterval = 0L;
        this.mLimitCount = 1;
        return this;
    }

    @Override // miuix.animation.IBlinkStyle
    public IBlinkStyle setInterval(long j2) {
        this.mInterval = j2;
        return this;
    }

    @Override // miuix.animation.IBlinkStyle
    public IBlinkStyle setLimitCount(int i2) {
        this.mLimitCount = i2;
        return this;
    }

    @Override // miuix.animation.IBlinkStyle
    public IBlinkStyle setToHighlightConfig(AnimConfig animConfig) {
        this.mToHighlightConfig = animConfig;
        animConfig.addListeners(new TransitionListener() { // from class: miuix.animation.controller.FolmeBlink.4
            @Override // miuix.animation.listener.TransitionListener
            public void onComplete(Object obj) {
                super.onComplete(obj);
                IFolmeStateStyle iFolmeStateStyle = FolmeBlink.this.mState;
                iFolmeStateStyle.to(iFolmeStateStyle.getState(IBlinkStyle.BlinkType.NORMAL), FolmeBlink.this.mToNormalConfig);
            }
        });
        return this;
    }

    @Override // miuix.animation.IBlinkStyle
    public IBlinkStyle setToNormalConfig(AnimConfig animConfig) {
        this.mToNormalConfig = animConfig;
        animConfig.addListeners(new TransitionListener() { // from class: miuix.animation.controller.FolmeBlink.5
            @Override // miuix.animation.listener.TransitionListener
            public void onComplete(Object obj) {
                super.onComplete(obj);
                FolmeBlink folmeBlink = FolmeBlink.this;
                folmeBlink.flashcount++;
                Object targetObject = folmeBlink.mState.getTarget().getTargetObject();
                FolmeBlink folmeBlink2 = FolmeBlink.this;
                if (folmeBlink2.flashcount == folmeBlink2.mLimitCount || targetObject == null) {
                    FolmeBlink.this.notifyState(true);
                } else {
                    FolmeBlink.this.startBlink(new AnimConfig[0]);
                }
            }
        });
        return this;
    }

    @Override // miuix.animation.IBlinkStyle
    public void startBlink(AnimConfig... animConfigArr) {
        if (animConfigArr.length > 0) {
            setToHighlightConfig(animConfigArr[0]);
            if (animConfigArr.length > 1) {
                setToNormalConfig(animConfigArr[1]);
            }
        }
        if (this.mBlinkTask != null) {
            this.mState.getTarget().handler.postDelayed(this.mBlinkTask, this.flashcount == 0 ? 0L : this.mInterval);
        }
    }

    @Override // miuix.animation.IBlinkStyle
    public void stopBlink() {
        this.mState.getTarget().handler.removeCallbacks(this.mBlinkTask);
        IFolmeStateStyle iFolmeStateStyle = this.mState;
        iFolmeStateStyle.to(iFolmeStateStyle.getState(IBlinkStyle.BlinkType.NORMAL), this.mStopConfig);
    }

    @Override // miuix.animation.IBlinkStyle
    public void startBlink(int i2, AnimConfig... animConfigArr) {
        this.mLimitCount = i2;
        if (animConfigArr.length > 0) {
            setToHighlightConfig(animConfigArr[0]);
            if (animConfigArr.length > 1) {
                setToNormalConfig(animConfigArr[1]);
            }
        }
        startBlink(new AnimConfig[0]);
    }
}

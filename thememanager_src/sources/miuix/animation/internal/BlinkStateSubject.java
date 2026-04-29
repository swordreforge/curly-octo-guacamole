package miuix.animation.internal;

/* JADX INFO: loaded from: classes3.dex */
public interface BlinkStateSubject {
    void attach(BlinkStateObserver blinkStateObserver);

    void detach(BlinkStateObserver blinkStateObserver);

    void notifyState(boolean z2);
}

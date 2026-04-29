package kotlin;

import kotlin.internal.InterfaceC6234g;

/* JADX INFO: renamed from: kotlin.q */
/* JADX INFO: compiled from: CharCode.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class C6329q {
    @i9jn(markerClass = {ki.class})
    @InterfaceC6234g
    @yz(version = "1.5")
    /* JADX INFO: renamed from: k */
    private static final char m23248k(int i2) {
        if (i2 >= 0 && i2 <= 65535) {
            return (char) i2;
        }
        throw new IllegalArgumentException("Invalid Char code: " + i2);
    }

    private static final int toq(char c2) {
        return c2;
    }

    @i9jn(markerClass = {ki.class})
    @kotlin.internal.f7l8
    @InterfaceC6234g
    @yz(version = "1.5")
    public static /* synthetic */ void zy(char c2) {
    }
}

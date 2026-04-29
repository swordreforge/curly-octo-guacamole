package kotlin.internal;

import androidx.exifinterface.media.C0846k;
import kotlin.internal.jdk8.C6237k;
import kotlin.jvm.internal.d2ok;
import kotlin.nn86;
import kotlin.wvg;
import kotlin.yz;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: PlatformImplementations.kt */
/* JADX INFO: loaded from: classes3.dex */
public final class qrj {

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final x2 f36293k = new C6237k();

    @nn86
    @yz(version = "1.2")
    /* JADX INFO: renamed from: k */
    public static final boolean m22878k(int i2, int i3, int i4) {
        return wvg.f36764p.m23802s(i2, i3, i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @InterfaceC6234g
    private static final /* synthetic */ <T> T toq(Object obj) throws ClassNotFoundException {
        try {
            d2ok.m23086z(1, C0846k.zaso);
            return obj;
        } catch (ClassCastException e2) {
            ClassLoader classLoader = obj.getClass().getClassLoader();
            d2ok.m23086z(4, C0846k.zaso);
            ClassLoader classLoader2 = Object.class.getClassLoader();
            if (d2ok.f7l8(classLoader, classLoader2)) {
                throw e2;
            }
            throw new ClassNotFoundException("Instance class was loaded from a different classloader: " + classLoader + ", base type classloader: " + classLoader2, e2);
        }
    }
}

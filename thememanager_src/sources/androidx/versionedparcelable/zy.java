package androidx.versionedparcelable;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: ParcelUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final String f6932k = "a";

    private zy() {
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static void f7l8(InterfaceC1269y interfaceC1269y, OutputStream outputStream) {
        f7l8 f7l8Var = new f7l8(null, outputStream);
        f7l8Var.bek6(interfaceC1269y);
        f7l8Var.mo5502k();
    }

    /* JADX INFO: renamed from: g */
    public static void m5522g(@lvui Bundle bundle, @lvui String str, @lvui List<? extends InterfaceC1269y> list) {
        Bundle bundle2 = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator<? extends InterfaceC1269y> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m5526y(it.next()));
        }
        bundle2.putParcelableArrayList(f6932k, arrayList);
        bundle.putParcelable(str, bundle2);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: k */
    public static <T extends InterfaceC1269y> T m5523k(InputStream inputStream) {
        return (T) new f7l8(inputStream, null).yz();
    }

    /* JADX INFO: renamed from: n */
    public static void m5524n(@lvui Bundle bundle, @lvui String str, @dd InterfaceC1269y interfaceC1269y) {
        if (interfaceC1269y == null) {
            return;
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable(f6932k, m5526y(interfaceC1269y));
        bundle.putParcelable(str, bundle2);
    }

    @dd
    /* JADX INFO: renamed from: q */
    public static <T extends InterfaceC1269y> List<T> m5525q(Bundle bundle, String str) {
        ArrayList arrayList = new ArrayList();
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            bundle2.setClassLoader(zy.class.getClassLoader());
            Iterator it = bundle2.getParcelableArrayList(f6932k).iterator();
            while (it.hasNext()) {
                arrayList.add(toq((Parcelable) it.next()));
            }
            return arrayList;
        } catch (RuntimeException unused) {
            return null;
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static <T extends InterfaceC1269y> T toq(Parcelable parcelable) {
        if (parcelable instanceof ParcelImpl) {
            return (T) ((ParcelImpl) parcelable).getVersionedParcel();
        }
        throw new IllegalArgumentException("Invalid parcel");
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    /* JADX INFO: renamed from: y */
    public static Parcelable m5526y(InterfaceC1269y interfaceC1269y) {
        return new ParcelImpl(interfaceC1269y);
    }

    @dd
    public static <T extends InterfaceC1269y> T zy(@lvui Bundle bundle, @lvui String str) {
        try {
            Bundle bundle2 = (Bundle) bundle.getParcelable(str);
            if (bundle2 == null) {
                return null;
            }
            bundle2.setClassLoader(zy.class.getClassLoader());
            return (T) toq(bundle2.getParcelable(f6932k));
        } catch (RuntimeException unused) {
            return null;
        }
    }
}

package com.android.thememanager.lockscreen.lock.color.picker;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import cnbm.C1404k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.miui.miwallpaper.material.utils.C5284q;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.d2ok;
import kotlin.jvm.internal.lv5;
import kotlin.jvm.internal.ni7;
import kotlin.oc;
import miuix.device.C7106k;
import mub.InterfaceC7396q;
import zy.hyr;

/* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.color.picker.k */
/* JADX INFO: compiled from: AutoColorPicker.kt */
/* JADX INFO: loaded from: classes2.dex */
@lv5({"SMAP\nAutoColorPicker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AutoColorPicker.kt\ncom/android/thememanager/lockscreen/lock/color/picker/AutoColorPicker\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,165:1\n215#2,2:166\n*S KotlinDebug\n*F\n+ 1 AutoColorPicker.kt\ncom/android/thememanager/lockscreen/lock/color/picker/AutoColorPicker\n*L\n77#1:166,2\n*E\n"})
public abstract class AbstractC2097k {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    public static final k f60343toq = new k(null);

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f60344zy = -1;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    private final Context f12360k;

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.color.picker.k$k */
    /* JADX INFO: compiled from: AutoColorPicker.kt */
    public static final class k {
        private k() {
        }

        public /* synthetic */ k(ni7 ni7Var) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.lockscreen.lock.color.picker.k$toq */
    /* JADX INFO: compiled from: AutoColorPicker.kt */
    public /* synthetic */ class toq {

        /* JADX INFO: renamed from: k */
        public static final /* synthetic */ int[] f12361k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final /* synthetic */ int[] f60345toq;

        static {
            int[] iArr = new int[x2.values().length];
            try {
                iArr[x2.CLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x2.STATUS_BAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x2.MAGAZINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f12361k = iArr;
            int[] iArr2 = new int[n7h.values().length];
            try {
                iArr2[n7h.PHONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[n7h.PORT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[n7h.LAND.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[n7h.SMALL.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            f60345toq = iArr2;
        }
    }

    public AbstractC2097k(@InterfaceC7396q Context context) {
        d2ok.m23075h(context, "context");
        this.f12360k = context;
    }

    public static /* synthetic */ boolean ld6(AbstractC2097k abstractC2097k, Bitmap bitmap, String str, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: isDarkImage");
        }
        if ((i4 & 4) != 0) {
            i2 = -1;
        }
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        return abstractC2097k.m8062p(bitmap, str, i2, i3);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Map m8060n(AbstractC2097k abstractC2097k, Bitmap bitmap, String str, int i2, int i3, int i4, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getColorPalette");
        }
        if ((i4 & 4) != 0) {
            i2 = -1;
        }
        if ((i4 & 8) != 0) {
            i3 = -1;
        }
        return abstractC2097k.m8063q(bitmap, str, i2, i3);
    }

    @InterfaceC7396q
    protected final String f7l8(@InterfaceC7396q x2 which) {
        d2ok.m23075h(which, "which");
        return m8065y(toq(), which);
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    protected final Context m8061g() {
        return this.f12360k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: k */
    public abstract String mo8059k();

    @hyr(31)
    /* JADX INFO: renamed from: p */
    protected final boolean m8062p(@InterfaceC7396q Bitmap wallpaper, @InterfaceC7396q String rectWhich, int i2, int i3) {
        d2ok.m23075h(wallpaper, "wallpaper");
        d2ok.m23075h(rectWhich, "rectWhich");
        try {
            return C1404k.m5868q(this.f12360k, wallpaper, mo8059k(), i2, i3, rectWhich);
        } catch (Exception e2) {
            Log.e(com.android.thememanager.lockscreen.lock.color.picker.toq.f12365k, "isDarkImage: ", e2);
            return false;
        }
    }

    @InterfaceC7396q
    @hyr(30)
    /* JADX INFO: renamed from: q */
    protected final Map<String, Integer> m8063q(@InterfaceC7396q Bitmap wallpaper, @InterfaceC7396q String rectWhich, int i2, int i3) {
        Map mapM5870y;
        d2ok.m23075h(wallpaper, "wallpaper");
        d2ok.m23075h(rectWhich, "rectWhich");
        try {
            mapM5870y = C1404k.m5870y(this.f12360k, wallpaper, mo8059k(), i2, i3, rectWhich, null);
        } catch (Exception e2) {
            Log.w(com.android.thememanager.lockscreen.lock.color.picker.toq.f12365k, "getColorPalette: ", e2);
            mapM5870y = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (mapM5870y != null) {
            for (Map.Entry entry : mapM5870y.entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if ((key instanceof String) && (value instanceof Integer)) {
                    linkedHashMap.put(key, value);
                }
            }
        }
        return linkedHashMap;
    }

    @InterfaceC7396q
    public abstract ColorData qrj(@InterfaceC7396q Bitmap bitmap);

    /* JADX INFO: renamed from: s */
    protected int mo8064s() {
        return -1;
    }

    @InterfaceC7396q
    protected final n7h toq() {
        return !C1807g.m7081r() ? n7h.PHONE : (C1807g.lvui() || (C1807g.zurt() && C7106k.jp0y(this.f12360k))) ? C1819o.ncyb(this.f12360k) ? n7h.LAND : n7h.PORT : n7h.SMALL;
    }

    protected final boolean x2() {
        n7h qVar = toq();
        return qVar == n7h.SMALL || qVar == n7h.PHONE;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: y */
    protected final String m8065y(@InterfaceC7396q n7h type, @InterfaceC7396q x2 which) {
        d2ok.m23075h(type, "type");
        d2ok.m23075h(which, "which");
        Log.i(com.android.thememanager.lockscreen.lock.color.picker.toq.f12365k, "getRectWhichString: " + type.name() + ',' + which.name());
        if (which == x2.DEFAULT) {
            return "";
        }
        int i2 = toq.f60345toq[type.ordinal()];
        if (i2 == 1 || i2 == 2) {
            int i3 = toq.f12361k[which.ordinal()];
            return i3 != 1 ? i3 != 2 ? i3 != 3 ? "" : "magazine_script_rect" : "status_bar_rect" : "clock_style_rect";
        }
        if (i2 == 3) {
            int i4 = toq.f12361k[which.ordinal()];
            return i4 != 1 ? i4 != 2 ? i4 != 3 ? "" : C5284q.f72226ncyb : C5284q.f72222lvui : C5284q.f29572r;
        }
        if (i2 != 4) {
            throw new oc();
        }
        int i5 = toq.f12361k[which.ordinal()];
        return i5 != 1 ? i5 != 2 ? i5 != 3 ? "" : C5284q.f29558c : C5284q.f29566l : C5284q.f72224n5r1;
    }

    protected int zy() {
        return -1;
    }
}

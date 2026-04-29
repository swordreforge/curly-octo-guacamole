package androidx.core.database;

import android.database.Cursor;
import kotlin.d3;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;
import v5yj.C7704k;

/* JADX INFO: renamed from: androidx.core.database.k */
/* JADX INFO: compiled from: Cursor.kt */
/* JADX INFO: loaded from: classes.dex */
@d3(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0017\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001e\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0010*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¨\u0006\u0015"}, d2 = {"Landroid/database/Cursor;", "", "index", "", "k", "", "toq", "(Landroid/database/Cursor;I)Ljava/lang/Double;", "", "zy", "(Landroid/database/Cursor;I)Ljava/lang/Float;", "q", "(Landroid/database/Cursor;I)Ljava/lang/Integer;", "", "n", "(Landroid/database/Cursor;I)Ljava/lang/Long;", "", C7704k.y.toq.f95579toq, "(Landroid/database/Cursor;I)Ljava/lang/Short;", "", "f7l8", "core-ktx_release"}, m22787k = 2, mv = {1, 4, 0})
public final class C0511k {
    @InterfaceC7395n
    public static final String f7l8(@InterfaceC7396q Cursor getStringOrNull, int i2) {
        d2ok.cdj(getStringOrNull, "$this$getStringOrNull");
        if (getStringOrNull.isNull(i2)) {
            return null;
        }
        return getStringOrNull.getString(i2);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: g */
    public static final Short m2372g(@InterfaceC7396q Cursor getShortOrNull, int i2) {
        d2ok.cdj(getShortOrNull, "$this$getShortOrNull");
        if (getShortOrNull.isNull(i2)) {
            return null;
        }
        return Short.valueOf(getShortOrNull.getShort(i2));
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: k */
    public static final byte[] m2373k(@InterfaceC7396q Cursor getBlobOrNull, int i2) {
        d2ok.cdj(getBlobOrNull, "$this$getBlobOrNull");
        if (getBlobOrNull.isNull(i2)) {
            return null;
        }
        return getBlobOrNull.getBlob(i2);
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: n */
    public static final Long m2374n(@InterfaceC7396q Cursor getLongOrNull, int i2) {
        d2ok.cdj(getLongOrNull, "$this$getLongOrNull");
        if (getLongOrNull.isNull(i2)) {
            return null;
        }
        return Long.valueOf(getLongOrNull.getLong(i2));
    }

    @InterfaceC7395n
    /* JADX INFO: renamed from: q */
    public static final Integer m2375q(@InterfaceC7396q Cursor getIntOrNull, int i2) {
        d2ok.cdj(getIntOrNull, "$this$getIntOrNull");
        if (getIntOrNull.isNull(i2)) {
            return null;
        }
        return Integer.valueOf(getIntOrNull.getInt(i2));
    }

    @InterfaceC7395n
    public static final Double toq(@InterfaceC7396q Cursor getDoubleOrNull, int i2) {
        d2ok.cdj(getDoubleOrNull, "$this$getDoubleOrNull");
        if (getDoubleOrNull.isNull(i2)) {
            return null;
        }
        return Double.valueOf(getDoubleOrNull.getDouble(i2));
    }

    @InterfaceC7395n
    public static final Float zy(@InterfaceC7396q Cursor getFloatOrNull, int i2) {
        d2ok.cdj(getFloatOrNull, "$this$getFloatOrNull");
        if (getFloatOrNull.isNull(i2)) {
            return null;
        }
        return Float.valueOf(getFloatOrNull.getFloat(i2));
    }
}

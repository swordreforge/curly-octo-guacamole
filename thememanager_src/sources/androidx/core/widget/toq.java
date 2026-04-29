package androidx.core.widget;

import android.os.Build;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: AutoSizeableTextView.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public interface toq {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public static final boolean f50989toq;

    static {
        f50989toq = Build.VERSION.SDK_INT >= 27;
    }

    int getAutoSizeMaxTextSize();

    int getAutoSizeMinTextSize();

    int getAutoSizeStepGranularity();

    int[] getAutoSizeTextAvailableSizes();

    int getAutoSizeTextType();

    void setAutoSizeTextTypeUniformWithConfiguration(int i2, int i3, int i4, int i5) throws IllegalArgumentException;

    void setAutoSizeTextTypeUniformWithPresetSizes(@lvui int[] iArr, int i2) throws IllegalArgumentException;

    void setAutoSizeTextTypeWithDefaults(int i2);
}

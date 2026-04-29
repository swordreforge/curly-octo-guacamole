package androidx.core.graphics;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface$CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import androidx.constraintlayout.core.motion.utils.zurt;
import androidx.core.content.res.C0500g;
import androidx.core.provider.C0605y;
import java.io.IOException;
import java.io.InputStream;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: TypefaceCompatApi29Impl.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(29)
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class a9 extends fti {
    private Font ld6(@lvui FontFamily fontFamily, int i2) {
        FontStyle fontStyle = new FontStyle((i2 & 1) != 0 ? zurt.InterfaceC0294y.f1767p : 400, (i2 & 2) != 0 ? 1 : 0);
        Font font = fontFamily.getFont(0);
        int iX2 = x2(fontStyle, font.getStyle());
        for (int i3 = 1; i3 < fontFamily.getSize(); i3++) {
            Font font2 = fontFamily.getFont(i3);
            int iX22 = x2(fontStyle, font2.getStyle());
            if (iX22 < iX2) {
                font = font2;
                iX2 = iX22;
            }
        }
        return font;
    }

    private static int x2(@lvui FontStyle fontStyle, @lvui FontStyle fontStyle2) {
        return (Math.abs(fontStyle.getWeight() - fontStyle2.getWeight()) / 100) + (fontStyle.getSlant() == fontStyle2.getSlant() ? 0 : 2);
    }

    @Override // androidx.core.graphics.fti
    @dd
    /* JADX INFO: renamed from: n */
    public Typeface mo2384n(Context context, Resources resources, int i2, String str, int i3) {
        try {
            Font fontBuild = new Font.Builder(resources, i2).build();
            return new Typeface$CustomFallbackBuilder(new FontFamily.Builder(fontBuild).build()).setStyle(fontBuild.getStyle()).build();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.core.graphics.fti
    /* JADX INFO: renamed from: q */
    protected Typeface mo2385q(Context context, InputStream inputStream) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.fti
    @dd
    public Typeface toq(Context context, C0500g.q qVar, Resources resources, int i2) {
        try {
            FontFamily.Builder builder = null;
            for (C0500g.n nVar : qVar.m2284k()) {
                try {
                    Font fontBuild = new Font.Builder(resources, nVar.toq()).setWeight(nVar.m2282n()).setSlant(nVar.m2280g() ? 1 : 0).setTtcIndex(nVar.zy()).setFontVariationSettings(nVar.m2283q()).build();
                    if (builder == null) {
                        builder = new FontFamily.Builder(fontBuild);
                    } else {
                        builder.addFont(fontBuild);
                    }
                } catch (IOException unused) {
                }
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface$CustomFallbackBuilder(fontFamilyBuild).setStyle(ld6(fontFamilyBuild, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }

    @Override // androidx.core.graphics.fti
    /* JADX INFO: renamed from: y */
    protected C0605y.zy mo2386y(C0605y.zy[] zyVarArr, int i2) {
        throw new RuntimeException("Do not use this function in API 29 or later.");
    }

    @Override // androidx.core.graphics.fti
    @dd
    public Typeface zy(Context context, @dd CancellationSignal cancellationSignal, @lvui C0605y.zy[] zyVarArr, int i2) {
        ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor;
        ContentResolver contentResolver = context.getContentResolver();
        try {
            FontFamily.Builder builder = null;
            for (C0605y.zy zyVar : zyVarArr) {
                try {
                    parcelFileDescriptorOpenFileDescriptor = contentResolver.openFileDescriptor(zyVar.m2823q(), "r", cancellationSignal);
                } catch (IOException unused) {
                }
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                    }
                } else {
                    try {
                        Font fontBuild = new Font.Builder(parcelFileDescriptorOpenFileDescriptor).setWeight(zyVar.m2822n()).setSlant(zyVar.m2821g() ? 1 : 0).setTtcIndex(zyVar.zy()).build();
                        if (builder == null) {
                            builder = new FontFamily.Builder(fontBuild);
                        } else {
                            builder.addFont(fontBuild);
                        }
                    } catch (Throwable th) {
                        try {
                            parcelFileDescriptorOpenFileDescriptor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                parcelFileDescriptorOpenFileDescriptor.close();
            }
            if (builder == null) {
                return null;
            }
            FontFamily fontFamilyBuild = builder.build();
            return new Typeface$CustomFallbackBuilder(fontFamilyBuild).setStyle(ld6(fontFamilyBuild, i2).getStyle()).build();
        } catch (Exception unused2) {
            return null;
        }
    }
}

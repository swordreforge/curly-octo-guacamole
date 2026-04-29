package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import java.util.function.IntFunction;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.g */
/* JADX INFO: compiled from: AppCompatButton$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class InspectionCompanionC0191g implements InspectionCompanion {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f46863f7l8;

    /* JADX INFO: renamed from: g */
    private int f1020g;

    /* JADX INFO: renamed from: k */
    private boolean f1021k = false;

    /* JADX INFO: renamed from: n */
    private int f1022n;

    /* JADX INFO: renamed from: q */
    private int f1023q;

    /* JADX INFO: renamed from: s */
    private int f1024s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46864toq;

    /* JADX INFO: renamed from: y */
    private int f1025y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46865zy;

    /* JADX INFO: renamed from: androidx.appcompat.widget.g$k */
    /* JADX INFO: compiled from: AppCompatButton$InspectionCompanion.java */
    class k implements IntFunction<String> {
        k() {
        }

        @Override // java.util.function.IntFunction
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String apply(int i2) {
            return i2 != 0 ? i2 != 1 ? String.valueOf(i2) : "uniform" : "none";
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui AppCompatButton appCompatButton, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1021k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.f46864toq, appCompatButton.getAutoSizeMaxTextSize());
        propertyReader.readInt(this.f46865zy, appCompatButton.getAutoSizeMinTextSize());
        propertyReader.readInt(this.f1023q, appCompatButton.getAutoSizeStepGranularity());
        propertyReader.readIntEnum(this.f1022n, appCompatButton.getAutoSizeTextType());
        propertyReader.readObject(this.f1020g, appCompatButton.getBackgroundTintList());
        propertyReader.readObject(this.f46863f7l8, appCompatButton.getBackgroundTintMode());
        propertyReader.readObject(this.f1025y, appCompatButton.getCompoundDrawableTintList());
        propertyReader.readObject(this.f1024s, appCompatButton.getCompoundDrawableTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46864toq = propertyMapper.mapInt("autoSizeMaxTextSize", C7397k.toq.f92875hyr);
        this.f46865zy = propertyMapper.mapInt("autoSizeMinTextSize", C7397k.toq.f42482f);
        this.f1023q = propertyMapper.mapInt("autoSizeStepGranularity", C7397k.toq.f92905lrht);
        this.f1022n = propertyMapper.mapIntEnum("autoSizeTextType", C7397k.toq.f92970uv6, new k());
        this.f1020g = propertyMapper.mapObject("backgroundTint", C7397k.toq.f92873hb);
        this.f46863f7l8 = propertyMapper.mapObject("backgroundTintMode", C7397k.toq.f42486j);
        this.f1025y = propertyMapper.mapObject("drawableTint", C7397k.toq.f92820bek6);
        this.f1024s = propertyMapper.mapObject("drawableTintMode", C7397k.toq.f92835cv06);
        this.f1021k = true;
    }
}

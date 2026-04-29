package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import java.util.function.IntFunction;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: AppCompatTextView$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class mcp implements InspectionCompanion {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f46922f7l8;

    /* JADX INFO: renamed from: g */
    private int f1101g;

    /* JADX INFO: renamed from: k */
    private boolean f1102k = false;

    /* JADX INFO: renamed from: n */
    private int f1103n;

    /* JADX INFO: renamed from: q */
    private int f1104q;

    /* JADX INFO: renamed from: s */
    private int f1105s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46923toq;

    /* JADX INFO: renamed from: y */
    private int f1106y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46924zy;

    /* JADX INFO: renamed from: androidx.appcompat.widget.mcp$k */
    /* JADX INFO: compiled from: AppCompatTextView$InspectionCompanion.java */
    class C0205k implements IntFunction<String> {
        C0205k() {
        }

        @Override // java.util.function.IntFunction
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public String apply(int i2) {
            return i2 != 0 ? i2 != 1 ? String.valueOf(i2) : "uniform" : "none";
        }
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui AppCompatTextView appCompatTextView, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1102k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.f46923toq, appCompatTextView.getAutoSizeMaxTextSize());
        propertyReader.readInt(this.f46924zy, appCompatTextView.getAutoSizeMinTextSize());
        propertyReader.readInt(this.f1104q, appCompatTextView.getAutoSizeStepGranularity());
        propertyReader.readIntEnum(this.f1103n, appCompatTextView.getAutoSizeTextType());
        propertyReader.readObject(this.f1101g, appCompatTextView.getBackgroundTintList());
        propertyReader.readObject(this.f46922f7l8, appCompatTextView.getBackgroundTintMode());
        propertyReader.readObject(this.f1106y, appCompatTextView.getCompoundDrawableTintList());
        propertyReader.readObject(this.f1105s, appCompatTextView.getCompoundDrawableTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46923toq = propertyMapper.mapInt("autoSizeMaxTextSize", C7397k.toq.f92875hyr);
        this.f46924zy = propertyMapper.mapInt("autoSizeMinTextSize", C7397k.toq.f42482f);
        this.f1104q = propertyMapper.mapInt("autoSizeStepGranularity", C7397k.toq.f92905lrht);
        this.f1103n = propertyMapper.mapIntEnum("autoSizeTextType", C7397k.toq.f92970uv6, new C0205k());
        this.f1101g = propertyMapper.mapObject("backgroundTint", C7397k.toq.f92873hb);
        this.f46922f7l8 = propertyMapper.mapObject("backgroundTintMode", C7397k.toq.f42486j);
        this.f1106y = propertyMapper.mapObject("drawableTint", C7397k.toq.f92820bek6);
        this.f1105s = propertyMapper.mapObject("drawableTintMode", C7397k.toq.f92835cv06);
        this.f1102k = true;
    }
}

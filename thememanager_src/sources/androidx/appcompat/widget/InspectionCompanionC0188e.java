package androidx.appcompat.widget;

import android.R;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.e */
/* JADX INFO: compiled from: SearchView$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class InspectionCompanionC0188e implements InspectionCompanion {

    /* JADX INFO: renamed from: k */
    private boolean f1006k = false;

    /* JADX INFO: renamed from: n */
    private int f1007n;

    /* JADX INFO: renamed from: q */
    private int f1008q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46854toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46855zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui SearchView searchView, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1006k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readInt(this.f46854toq, searchView.getImeOptions());
        propertyReader.readInt(this.f46855zy, searchView.getMaxWidth());
        propertyReader.readBoolean(this.f1008q, searchView.lvui());
        propertyReader.readObject(this.f1007n, searchView.getQueryHint());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46854toq = propertyMapper.mapInt("imeOptions", R.attr.imeOptions);
        this.f46855zy = propertyMapper.mapInt("maxWidth", R.attr.maxWidth);
        this.f1008q = propertyMapper.mapBoolean("iconifiedByDefault", C7397k.toq.f92864ga);
        this.f1007n = propertyMapper.mapObject("queryHint", C7397k.toq.f92895kq2f);
        this.f1006k = true;
    }
}

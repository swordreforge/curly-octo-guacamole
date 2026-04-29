package androidx.appcompat.widget;

import android.R;
import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.j */
/* JADX INFO: compiled from: SwitchCompat$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class InspectionCompanionC0195j implements InspectionCompanion {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f46885f7l8;

    /* JADX INFO: renamed from: g */
    private int f1055g;

    /* JADX INFO: renamed from: k */
    private boolean f1056k = false;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f46886ld6;

    /* JADX INFO: renamed from: n */
    private int f1057n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f46887n7h;

    /* JADX INFO: renamed from: p */
    private int f1058p;

    /* JADX INFO: renamed from: q */
    private int f1059q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f46888qrj;

    /* JADX INFO: renamed from: s */
    private int f1060s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46889toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f46890x2;

    /* JADX INFO: renamed from: y */
    private int f1061y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46891zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui SwitchCompat switchCompat, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1056k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f46889toq, switchCompat.getTextOff());
        propertyReader.readObject(this.f46891zy, switchCompat.getTextOn());
        propertyReader.readObject(this.f1059q, switchCompat.getThumbDrawable());
        propertyReader.readBoolean(this.f1057n, switchCompat.getShowText());
        propertyReader.readBoolean(this.f1055g, switchCompat.getSplitTrack());
        propertyReader.readInt(this.f46885f7l8, switchCompat.getSwitchMinWidth());
        propertyReader.readInt(this.f1061y, switchCompat.getSwitchPadding());
        propertyReader.readInt(this.f1060s, switchCompat.getThumbTextPadding());
        propertyReader.readObject(this.f1058p, switchCompat.getThumbTintList());
        propertyReader.readObject(this.f46886ld6, switchCompat.getThumbTintMode());
        propertyReader.readObject(this.f46890x2, switchCompat.getTrackDrawable());
        propertyReader.readObject(this.f46888qrj, switchCompat.getTrackTintList());
        propertyReader.readObject(this.f46887n7h, switchCompat.getTrackTintMode());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46889toq = propertyMapper.mapObject("textOff", R.attr.textOff);
        this.f46891zy = propertyMapper.mapObject("textOn", R.attr.textOn);
        this.f1059q = propertyMapper.mapObject("thumb", R.attr.thumb);
        this.f1057n = propertyMapper.mapBoolean("showText", C7397k.toq.f92904lk);
        this.f1055g = propertyMapper.mapBoolean("splitTrack", C7397k.toq.f92960tjz5);
        this.f46885f7l8 = propertyMapper.mapInt("switchMinWidth", C7397k.toq.f92969uo);
        this.f1061y = propertyMapper.mapInt("switchPadding", C7397k.toq.f92913m8);
        this.f1060s = propertyMapper.mapInt("thumbTextPadding", C7397k.toq.b2);
        this.f1058p = propertyMapper.mapObject("thumbTint", C7397k.toq.x7o);
        this.f46886ld6 = propertyMapper.mapObject("thumbTintMode", C7397k.toq.z8);
        this.f46890x2 = propertyMapper.mapObject("track", C7397k.toq.oaex);
        this.f46888qrj = propertyMapper.mapObject("trackTint", C7397k.toq.vh);
        this.f46887n7h = propertyMapper.mapObject("trackTintMode", C7397k.toq.jyr);
        this.f1056k = true;
    }
}

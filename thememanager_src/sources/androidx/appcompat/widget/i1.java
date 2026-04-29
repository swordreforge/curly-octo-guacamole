package androidx.appcompat.widget;

import android.view.inspector.InspectionCompanion;
import android.view.inspector.PropertyMapper;
import android.view.inspector.PropertyReader;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: compiled from: Toolbar$InspectionCompanion.java */
/* JADX INFO: loaded from: classes.dex */
@zy.hyr(29)
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public final class i1 implements InspectionCompanion {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private int f46873cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f46874f7l8;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private int f46875fn3e;

    /* JADX INFO: renamed from: g */
    private int f1046g;

    /* JADX INFO: renamed from: h */
    private int f1047h;

    /* JADX INFO: renamed from: i */
    private int f1048i;

    /* JADX INFO: renamed from: k */
    private boolean f1049k = false;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private int f46876ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private int f46877kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f46878ld6;

    /* JADX INFO: renamed from: n */
    private int f1050n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int f46879n7h;

    /* JADX INFO: renamed from: p */
    private int f1051p;

    /* JADX INFO: renamed from: q */
    private int f1052q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f46880qrj;

    /* JADX INFO: renamed from: s */
    private int f1053s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private int f46881t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f46882toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f46883x2;

    /* JADX INFO: renamed from: y */
    private int f1054y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f46884zy;

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void readProperties(@zy.lvui Toolbar toolbar, @zy.lvui PropertyReader propertyReader) {
        if (!this.f1049k) {
            throw new InspectionCompanion.UninitializedPropertyMapException();
        }
        propertyReader.readObject(this.f46882toq, toolbar.getCollapseContentDescription());
        propertyReader.readObject(this.f46884zy, toolbar.getCollapseIcon());
        propertyReader.readInt(this.f1052q, toolbar.getContentInsetEnd());
        propertyReader.readInt(this.f1050n, toolbar.getContentInsetEndWithActions());
        propertyReader.readInt(this.f1046g, toolbar.getContentInsetLeft());
        propertyReader.readInt(this.f46874f7l8, toolbar.getContentInsetRight());
        propertyReader.readInt(this.f1054y, toolbar.getContentInsetStart());
        propertyReader.readInt(this.f1053s, toolbar.getContentInsetStartWithNavigation());
        propertyReader.readObject(this.f1051p, toolbar.getLogo());
        propertyReader.readObject(this.f46878ld6, toolbar.getLogoDescription());
        propertyReader.readObject(this.f46883x2, toolbar.getMenu());
        propertyReader.readObject(this.f46880qrj, toolbar.getNavigationContentDescription());
        propertyReader.readObject(this.f46879n7h, toolbar.getNavigationIcon());
        propertyReader.readResourceId(this.f46877kja0, toolbar.getPopupTheme());
        propertyReader.readObject(this.f1047h, toolbar.getSubtitle());
        propertyReader.readObject(this.f46873cdj, toolbar.getTitle());
        propertyReader.readInt(this.f46876ki, toolbar.getTitleMarginBottom());
        propertyReader.readInt(this.f46881t8r, toolbar.getTitleMarginEnd());
        propertyReader.readInt(this.f1048i, toolbar.getTitleMarginStart());
        propertyReader.readInt(this.f46875fn3e, toolbar.getTitleMarginTop());
    }

    public void mapProperties(@zy.lvui PropertyMapper propertyMapper) {
        this.f46882toq = propertyMapper.mapObject("collapseContentDescription", C7397k.toq.f92993xwq3);
        this.f46884zy = propertyMapper.mapObject("collapseIcon", C7397k.toq.f42498v);
        this.f1052q = propertyMapper.mapInt("contentInsetEnd", C7397k.toq.f93009zsr0);
        this.f1050n = propertyMapper.mapInt("contentInsetEndWithActions", C7397k.toq.f92944py);
        this.f1046g = propertyMapper.mapInt("contentInsetLeft", C7397k.toq.f92879i9jn);
        this.f46874f7l8 = propertyMapper.mapInt("contentInsetRight", C7397k.toq.f92906ltg8);
        this.f1054y = propertyMapper.mapInt("contentInsetStart", C7397k.toq.f92951r8s8);
        this.f1053s = propertyMapper.mapInt("contentInsetStartWithNavigation", C7397k.toq.f92911m4);
        this.f1051p = propertyMapper.mapObject("logo", C7397k.toq.f92929nnh);
        this.f46878ld6 = propertyMapper.mapObject("logoDescription", C7397k.toq.f92965uf);
        this.f46883x2 = propertyMapper.mapObject("menu", C7397k.toq.f92822bih);
        this.f46880qrj = propertyMapper.mapObject("navigationContentDescription", C7397k.toq.f92934o5);
        this.f46879n7h = propertyMapper.mapObject("navigationIcon", C7397k.toq.f93000yw);
        this.f46877kja0 = propertyMapper.mapResourceId("popupTheme", C7397k.toq.f92853f1bi);
        this.f1047h = propertyMapper.mapObject("subtitle", C7397k.toq.f93003z4j7);
        this.f46873cdj = propertyMapper.mapObject("title", C7397k.toq.k4jz);
        this.f46876ki = propertyMapper.mapInt("titleMarginBottom", C7397k.toq.nc);
        this.f46881t8r = propertyMapper.mapInt("titleMarginEnd", C7397k.toq.erbd);
        this.f1048i = propertyMapper.mapInt("titleMarginStart", C7397k.toq.zxq);
        this.f46875fn3e = propertyMapper.mapInt("titleMarginTop", C7397k.toq.e4e);
        this.f1049k = true;
    }
}

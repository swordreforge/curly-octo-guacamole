package com.android.thememanager.maml;

import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.C1922n;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.util.C2789j;
import ek5k.C6002g;
import fnq8.InterfaceC6042k;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import qo.C7618k;
import tfm.C7674k;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: InformationDataProducer.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 implements InterfaceC2148q, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private static final int f12567g = 6;

    /* JADX INFO: renamed from: h */
    public static final String f12568h;

    /* JADX INFO: renamed from: i */
    static final /* synthetic */ boolean f12569i = false;

    /* JADX INFO: renamed from: n */
    private static final String f12570n = "f7l8";

    /* JADX INFO: renamed from: p */
    public static final String f12571p = "action";

    /* JADX INFO: renamed from: s */
    static final String f12572s = "information";

    /* JADX INFO: renamed from: y */
    private static final int f12573y = 10;

    /* JADX INFO: renamed from: k */
    private com.android.thememanager.maml.model.toq f12574k = (com.android.thememanager.maml.model.toq) ikck.zy.m22379k(com.android.thememanager.maml.model.toq.class);

    /* JADX INFO: renamed from: q */
    private InterfaceC6042k f12575q = new fnq8.toq();

    /* JADX INFO: renamed from: com.android.thememanager.maml.f7l8$k */
    /* JADX INFO: compiled from: InformationDataProducer.java */
    public interface InterfaceC2135k {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f60413f7l8 = 17;

        /* JADX INFO: renamed from: g */
        public static final int f12576g = 16;

        /* JADX INFO: renamed from: k */
        public static final int f12577k = -1;

        /* JADX INFO: renamed from: n */
        public static final int f12578n = 3;

        /* JADX INFO: renamed from: p */
        public static final int f12579p = 33;

        /* JADX INFO: renamed from: q */
        public static final int f12580q = 2;

        /* JADX INFO: renamed from: s */
        public static final int f12581s = 32;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final int f60414toq = 0;

        /* JADX INFO: renamed from: y */
        public static final int f12582y = 18;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final int f60415zy = 1;
    }

    /* JADX INFO: compiled from: InformationDataProducer.java */
    public interface toq {

        /* JADX INFO: renamed from: k */
        public static final String f12583k = "addInformation";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f60416toq = "updateInformationList";

        /* JADX INFO: renamed from: com.android.thememanager.maml.f7l8$toq$k */
        /* JADX INFO: compiled from: InformationDataProducer.java */
        public interface InterfaceC2136k {

            /* JADX INFO: renamed from: k */
            public static final String f12584k = "information";

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            public static final String f60417toq = "information_list";
        }
    }

    /* JADX INFO: compiled from: InformationDataProducer.java */
    public interface zy {

        /* JADX INFO: renamed from: k */
        public static final String f12585k = "image_id";

        /* JADX INFO: renamed from: n */
        public static final String f12586n = "type";

        /* JADX INFO: renamed from: q */
        public static final String f12587q = "duration";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final String f60418toq = "begin";

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final String f60419zy = "number";
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append("content://com.miui.maml.provider");
        String str = File.separator;
        sb.append(str);
        sb.append("information");
        sb.append(str);
        f12568h = sb.toString();
    }

    f7l8() {
    }

    private Cursor f7l8(int id) {
        Cursor cursorMo22270q = this.f12575q.mo22270q(id);
        m8170g(cursorMo22270q);
        return cursorMo22270q;
    }

    /* JADX INFO: renamed from: g */
    private void m8170g(Cursor cursor) {
        if (cursor != null) {
            while (cursor.moveToNext()) {
                String string = cursor.getString(cursor.getColumnIndex("_image"));
                if (!TextUtils.isEmpty(string) && !new File(string).exists()) {
                    this.f12574k.m8182g(cursor.getString(cursor.getColumnIndex("_image_online_url")), string);
                }
            }
            cursor.moveToFirst();
        }
    }

    private void ld6(int id, @lvui C7618k information, int action, @lvui Uri paramsUri) {
        String str = action != 2 ? action != 3 ? information.tvmUrl : information.cmUrl : information.isLiked ? information.dislikeUrl : information.likeUrl;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        final zurt zurtVar = new zurt(str, 32, zurt.EnumC1946k.API_PROXY);
        zurtVar.addParameter("time", String.valueOf((int) (System.currentTimeMillis() / 1000)));
        if (action != 2) {
            if (action != 3) {
                String queryParameter = paramsUri.getQueryParameter("duration");
                String queryParameter2 = paramsUri.getQueryParameter("type");
                if (queryParameter != null) {
                    zurtVar.addParameter("duration", queryParameter);
                }
                if (queryParameter2 != null) {
                    zurtVar.addParameter("type", queryParameter2);
                }
            } else {
                String queryParameter3 = paramsUri.getQueryParameter("duration");
                if (queryParameter3 != null) {
                    zurtVar.addParameter("duration", queryParameter3);
                }
            }
        }
        C6002g.x2().execute(new Runnable() { // from class: com.android.thememanager.maml.g
            @Override // java.lang.Runnable
            public final void run() {
                f7l8.m8174s(zurtVar);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    private Cursor m8172p(@lvui C7618k information) {
        tfm.zy zyVarKja0 = this.f12574k.kja0(information.imageId, !information.isLiked);
        if (zyVarKja0 == null) {
            return null;
        }
        information.isLiked = zyVarKja0.isLike;
        information.likeNumber = zyVarKja0.count;
        this.f12575q.mo22268k(information);
        return this.f12575q.f7l8(information.imageId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m8174s(zurt zurtVar) {
        try {
            C1915g.f7l8(zurtVar);
        } catch (C1922n | IOException e2) {
            C2789j.qrj(f12570n, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public /* synthetic */ void m8175y() {
        this.f12574k.m8183p(10, this.f12575q);
    }

    @Override // com.android.thememanager.maml.InterfaceC2148q
    /* JADX INFO: renamed from: k */
    public synchronized Bundle mo8176k(@lvui String method, @dd String arg, @dd Bundle extras) {
        byte b2 = -1;
        int iHashCode = method.hashCode();
        if (iHashCode != -2008623135) {
            if (iHashCode == -1705204277 && method.equals(toq.f12583k)) {
                b2 = 0;
            }
        } else if (method.equals(toq.f60416toq)) {
            b2 = 1;
        }
        if (b2 != 0) {
            if (b2 == 1 && extras != null) {
                Serializable serializable = extras.getSerializable(toq.InterfaceC2136k.f60417toq);
                if (serializable instanceof ArrayList) {
                    ArrayList arrayList = (ArrayList) serializable;
                    if (!arrayList.isEmpty()) {
                        this.f12575q.toq(arrayList);
                    }
                }
            }
        } else if (extras != null) {
            Serializable serializable2 = extras.getSerializable("information");
            if (serializable2 instanceof C7674k) {
                C7674k c7674k = (C7674k) serializable2;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(c7674k);
                this.f12575q.mo22267g(arrayList2);
                this.f12574k.f7l8(c7674k);
            }
        }
        return null;
    }

    @Override // com.android.thememanager.maml.InterfaceC2148q
    public String toq(@lvui Uri uri) {
        return "vnd.android.cursor.dir/api-wallpaper-recommend";
    }

    @Override // com.android.thememanager.maml.InterfaceC2148q
    public synchronized Cursor zy(@lvui Uri uri, @dd String[] projection, @dd String selection, @dd String[] selectionArgs, @dd String sortOrder) {
        Cursor cursorMo22269n;
        int i2;
        String path = uri.getPath();
        Cursor cursorF7l8 = null;
        if (path == null) {
            return null;
        }
        this.f12574k.m8184y();
        String str = "information" + File.separator;
        Uri uri2 = Uri.parse(path.substring(path.indexOf(str) + str.length()));
        String queryParameter = uri2.getQueryParameter("action");
        if (queryParameter != null && !queryParameter.isEmpty()) {
            int iIntValue = Integer.valueOf(queryParameter).intValue();
            int count = this.f12575q.getCount();
            if (count == 0) {
                this.f12574k.m8183p(10, this.f12575q);
                count = this.f12575q.getCount();
            }
            if (count == 0) {
                return null;
            }
            int iX2 = this.f12574k.x2();
            if (iIntValue == 32) {
                String queryParameter2 = uri2.getQueryParameter(zy.f60418toq);
                int i3 = 0;
                int iIntValue2 = queryParameter2 != null ? Integer.valueOf(queryParameter2).intValue() : 0;
                if (iIntValue2 != 1) {
                    i3 = iIntValue2;
                }
                String queryParameter3 = uri2.getQueryParameter("number");
                int iIntValue3 = queryParameter3 != null ? Integer.valueOf(queryParameter3).intValue() : 10;
                i2 = i3 + iIntValue3;
                if (count < i2) {
                    this.f12574k.m8183p(10, this.f12575q);
                    count = this.f12575q.getCount();
                }
                cursorMo22269n = this.f12575q.mo22269n(i3, iIntValue3);
                m8170g(cursorMo22269n);
            } else {
                C7618k c7618kZy = this.f12575q.zy(iX2);
                if (iIntValue == -1) {
                    if (iX2 > 2) {
                        iX2--;
                    }
                    cursorF7l8 = f7l8(iX2);
                    this.f12574k.ki(iX2);
                } else if (iIntValue == 0) {
                    cursorF7l8 = f7l8(iX2);
                } else if (iIntValue == 1) {
                    if (iX2 < count) {
                        iX2++;
                    }
                    cursorF7l8 = f7l8(iX2);
                    this.f12574k.ki(iX2);
                } else {
                    if (iIntValue != 2) {
                        if (iIntValue == 33) {
                            String queryParameter4 = uri2.getQueryParameter(zy.f12585k);
                            if (queryParameter4 != null && !queryParameter4.isEmpty()) {
                                return m8172p(this.f12575q.mo22271y(queryParameter4));
                            }
                            return null;
                        }
                        switch (iIntValue) {
                            case 16:
                                String queryParameter5 = uri2.getQueryParameter(zy.f12585k);
                                if (queryParameter5 != null) {
                                    this.f12574k.t8r(queryParameter5);
                                    cursorF7l8 = this.f12575q.f7l8(queryParameter5);
                                    m8170g(cursorF7l8);
                                }
                                return cursorF7l8;
                            case 17:
                                String strQrj = this.f12574k.qrj();
                                if (strQrj != null) {
                                    cursorF7l8 = this.f12575q.f7l8(strQrj);
                                    m8170g(cursorF7l8);
                                }
                                return cursorF7l8;
                            case 18:
                                String queryParameter6 = uri2.getQueryParameter(zy.f12585k);
                                if (queryParameter6 != null) {
                                    cursorF7l8 = this.f12575q.f7l8(queryParameter6);
                                    m8170g(cursorF7l8);
                                }
                                return cursorF7l8;
                        }
                    }
                    cursorF7l8 = m8172p(c7618kZy);
                }
                ld6(iX2, c7618kZy, iIntValue, uri2);
                cursorMo22269n = cursorF7l8;
                i2 = iX2;
            }
            if (count - i2 < 6) {
                C6002g.x2().execute(new Runnable() { // from class: com.android.thememanager.maml.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f12619k.m8175y();
                    }
                });
            }
            return cursorMo22269n;
        }
        return null;
    }
}

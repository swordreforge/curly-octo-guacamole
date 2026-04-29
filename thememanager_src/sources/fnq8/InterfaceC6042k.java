package fnq8;

import android.database.Cursor;
import java.util.List;
import qo.C7618k;
import tfm.C7674k;
import zy.lvui;

/* JADX INFO: renamed from: fnq8.k */
/* JADX INFO: compiled from: IInformationDao.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC6042k {
    Cursor f7l8(@lvui String imageId);

    /* JADX INFO: renamed from: g */
    void mo22267g(@lvui List<C7674k> informationList);

    int getCount();

    /* JADX INFO: renamed from: k */
    void mo22268k(@lvui C7618k informationModel);

    /* JADX INFO: renamed from: n */
    Cursor mo22269n(int from, int number);

    /* JADX INFO: renamed from: q */
    Cursor mo22270q(int id);

    void toq(@lvui List<C7618k> informationList);

    /* JADX INFO: renamed from: y */
    C7618k mo22271y(@lvui String imageId);

    C7618k zy(int id);
}

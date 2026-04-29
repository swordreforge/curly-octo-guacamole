package t8iq;

import android.text.TextUtils;
import bo.C1377k;
import com.android.thememanager.controller.online.C1915g;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.ld6;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p037u.zy;

/* JADX INFO: renamed from: t8iq.k */
/* JADX INFO: compiled from: HttpLogPoster.java */
/* JADX INFO: loaded from: classes2.dex */
public class C7672k implements zy<C1377k> {

    /* JADX INFO: renamed from: k */
    public static final String f44343k = "actions";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f94879toq = "t";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f94880zy = "d";

    @Override // p037u.zy
    /* JADX INFO: renamed from: k */
    public boolean mo28028k(Collection<C1377k> collection) {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        try {
            for (C1377k c1377k : collection) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("t", c1377k.zy());
                jSONObject2.put(f94880zy, c1377k.toq());
                jSONArray.put(jSONObject2);
            }
            jSONObject.put("actions", jSONArray);
            try {
                String strF7l8 = C1915g.f7l8(ld6.vq("dot", jSONObject.toString()));
                if (TextUtils.isEmpty(strF7l8)) {
                    return false;
                }
                return new JSONObject(strF7l8).getInt(InterfaceC1925p.i55) == 0;
            } catch (Exception e2) {
                e2.printStackTrace();
                return false;
            }
        } catch (JSONException e3) {
            e3.printStackTrace();
            return false;
        }
    }
}

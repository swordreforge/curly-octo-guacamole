package com.android.thememanager.controller.online;

import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1808h;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.model.Page;
import com.android.thememanager.model.PageGroup;
import com.android.thememanager.model.PageItem;
import com.android.thememanager.model.RecommendItem;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.ek5k;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.android.thememanager.controller.online.y */
/* JADX INFO: compiled from: OnlineJSONDataParser.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1944y extends f7l8 implements InterfaceC1925p, com.android.thememanager.basemodule.resource.constants.toq {
    public C1944y(com.android.thememanager.fu4 context) {
        super(context);
    }

    public static Pair<Integer, JSONObject> cdj(InputStream is) {
        String strM7603y;
        try {
            strM7603y = ni7.m7603y(is);
        } catch (Exception unused) {
            strM7603y = null;
        }
        return ki(strM7603y);
    }

    /* JADX INFO: renamed from: i */
    private boolean m7648i(PageItem.ItemType type) {
        return type == PageItem.ItemType.SHOPWINDOW || type == PageItem.ItemType.SHOPWINDOWNEW || type == PageItem.ItemType.MULTIPLEBUTTON || type == PageItem.ItemType.TITLENEW;
    }

    public static Pair<Integer, JSONObject> ki(String content) {
        int iOptInt = -1;
        JSONObject jSONObjectOptJSONObject = null;
        if (TextUtils.isEmpty(content)) {
            Log.i("Theme", "parseBaseJsonData: content is empty");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(content);
                iOptInt = jSONObject.optInt(InterfaceC1925p.i55, -1);
                jSONObjectOptJSONObject = jSONObject.optJSONObject(InterfaceC1925p.vqy);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return new Pair<>(Integer.valueOf(iOptInt), jSONObjectOptJSONObject);
    }

    private boolean t8r(PageItem.ItemType type) {
        return type == PageItem.ItemType.SHOPWINDOW || type == PageItem.ItemType.SHOPWINDOWNEW || type == PageItem.ItemType.MULTIPLEBUTTON || type == PageItem.ItemType.TITLENEW || type == PageItem.ItemType.BUTTON;
    }

    @Override // com.android.thememanager.controller.online.f7l8
    /* JADX INFO: renamed from: g */
    public Map<String, Resource> mo7539g(File file) throws JSONException, IOException {
        HashMap map = new HashMap();
        JSONObject jSONObjectZy = ek5k.zy(file);
        Iterator<String> itKeys = jSONObjectZy.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = jSONObjectZy.getString(next);
            Resource resource = new Resource();
            resource.setOnlineId(string);
            map.put(next, resource);
        }
        return map;
    }

    /* JADX INFO: renamed from: h */
    public Resource m7649h(JSONObject json) throws JSONException {
        char c2;
        String str;
        Resource resource = new Resource();
        String string = json.getString("moduleId");
        String strOptString = json.optString(InterfaceC1925p.v5fy);
        resource.setOnlineId(string);
        resource.setAssemblyId(strOptString);
        resource.setVideoUrl(!json.isNull(InterfaceC1925p.y6xt) ? json.optString(InterfaceC1925p.y6xt) : null, json.isNull(InterfaceC1925p.ocl) ? null : json.optString(InterfaceC1925p.ocl));
        String string2 = json.getString(InterfaceC1925p.j8wd);
        if (this.f10928k.isThumbnailPngFormat()) {
            str = String.format(InterfaceC1925p.fy7, Integer.valueOf(this.f10928k.getThumbnailImageWidth()));
            c2 = 1;
        } else {
            c2 = 1;
            str = String.format(InterfaceC1925p.ohc0, Integer.valueOf(this.f10928k.getThumbnailImageWidth()), 90);
        }
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(this.f10928k.getPreviewImageWidth());
        objArr[c2] = 70;
        String str2 = String.format(InterfaceC1925p.ohc0, objArr);
        if (this.f10928k.getResourceFormat() == 3) {
            str = "";
        }
        ArrayList arrayList = new ArrayList();
        String strOptString2 = json.optString(InterfaceC1925p.b1ty);
        PathEntry pathEntry = new PathEntry();
        pathEntry.setLocalPath(ch.gvn7(strOptString2));
        pathEntry.setOnlinePath(string2 + str + strOptString2);
        arrayList.add(pathEntry);
        resource.setThumbnails(arrayList);
        ArrayList arrayList2 = new ArrayList();
        String str3 = InterfaceC1925p.dqa;
        JSONArray jSONArrayOptJSONArray = json.optJSONArray(InterfaceC1925p.dqa);
        if (jSONArrayOptJSONArray != null) {
            int i2 = 0;
            while (i2 < jSONArrayOptJSONArray.length()) {
                String string3 = jSONArrayOptJSONArray.getString(i2);
                JSONArray jSONArray = jSONArrayOptJSONArray;
                PathEntry pathEntry2 = new PathEntry();
                pathEntry2.setLocalPath(ch.gvn7(string3));
                pathEntry2.setOnlinePath(string2 + str2 + string3);
                arrayList2.add(pathEntry2);
                i2++;
                jSONArrayOptJSONArray = jSONArray;
                str3 = str3;
            }
        }
        String str4 = str3;
        resource.setPreviews(arrayList2);
        String str5 = String.format(InterfaceC1925p.ohc0, Integer.valueOf(this.f10928k.getPreviewImageWidth()), 90);
        String strOptString3 = json.optString(InterfaceC1925p.khz);
        if (!TextUtils.isEmpty(strOptString3)) {
            PathEntry pathEntry3 = new PathEntry();
            pathEntry3.setLocalPath(ch.gvn7(strOptString3));
            pathEntry3.setOnlinePath(string2 + str5 + strOptString3);
            resource.setMainDescPic(pathEntry3);
        }
        String strOptString4 = json.optString(InterfaceC1925p.jk2);
        if (!TextUtils.isEmpty(strOptString4)) {
            PathEntry pathEntry4 = new PathEntry();
            pathEntry4.setLocalPath(ch.gvn7(strOptString4));
            pathEntry4.setOnlinePath(string2 + str5 + strOptString4);
            resource.setHeaderDescPic(pathEntry4);
        }
        resource.getOnlineInfo().setTitle(json.optString("name"));
        resource.getOnlineInfo().setBrief(json.optString(InterfaceC1925p.tvyk));
        resource.getOnlineInfo().setDescription(json.optString("description"));
        resource.getOnlineInfo().setPlatform(json.optInt(InterfaceC1925p.lj));
        resource.getOnlineInfo().setAuthor(json.optString("author"));
        resource.getOnlineInfo().setDesigner(json.optString("designer"));
        resource.getOnlineInfo().setVersion(json.optString("version"));
        resource.getOnlineInfo().setUpdatedTime(json.optLong(InterfaceC1925p.ba7));
        resource.getOnlineInfo().setSize(json.optLong(InterfaceC1925p.pkq2));
        resource.getOnlineInfo().setTags(json.optString("tags"));
        if (!json.isNull("like")) {
            resource.getOnlineInfo().setLike(Boolean.valueOf(json.optBoolean("like")));
        }
        if (!json.isNull(InterfaceC1925p.nzoy)) {
            resource.getOnlineInfo().setLikeCount(Integer.valueOf(json.optInt(InterfaceC1925p.nzoy)));
        }
        String strOptString5 = json.optString("productId");
        if (TextUtils.isEmpty(strOptString5)) {
            strOptString5 = strOptString;
        }
        resource.setProductId(strOptString5);
        resource.setProductPrice(json.optInt(InterfaceC1925p.srp, -1));
        resource.setOriginPrice(json.optInt(InterfaceC1925p.ooq6, -1));
        resource.setScore((float) json.optDouble("score", -1.0d));
        resource.setProductBought(json.optBoolean(InterfaceC1925p.j0, false));
        resource.setOnShelf(json.optBoolean(InterfaceC1925p.blj, true));
        resource.setTrialDialogTitle(json.optString(InterfaceC1925p.ucas));
        resource.setTrialDialogMessage(json.optString(InterfaceC1925p.f5));
        resource.setTrialTime(json.optLong(InterfaceC1925p.jom, -1L));
        String strOptString6 = json.optString("category");
        if (strOptString6 != null) {
            resource.setCategory(strOptString6);
        }
        HashSet hashSet = new HashSet();
        hashSet.add(InterfaceC1925p.y6xt);
        hashSet.add(InterfaceC1925p.ocl);
        hashSet.add("moduleId");
        hashSet.add(InterfaceC1925p.v5fy);
        hashSet.add(InterfaceC1925p.j8wd);
        hashSet.add(InterfaceC1925p.b1ty);
        hashSet.add(str4);
        hashSet.add("name");
        hashSet.add("description");
        hashSet.add(InterfaceC1925p.lj);
        hashSet.add("author");
        hashSet.add("designer");
        hashSet.add("version");
        hashSet.add(InterfaceC1925p.ba7);
        hashSet.add(InterfaceC1925p.pkq2);
        hashSet.add("productId");
        hashSet.add(InterfaceC1925p.srp);
        hashSet.add(InterfaceC1925p.ooq6);
        hashSet.add("score");
        hashSet.add(InterfaceC1925p.j0);
        hashSet.add(InterfaceC1925p.jom);
        hashSet.add("category");
        HashSet hashSet2 = new HashSet();
        hashSet2.add(InterfaceC1925p.eov);
        hashSet2.add(InterfaceC1925p.tvyk);
        hashSet2.add(InterfaceC1925p.rr7);
        hashSet2.add("tags");
        hashSet2.add(InterfaceC1925p.ve1q);
        hashSet2.add(InterfaceC1925p.esx1);
        hashSet2.add(InterfaceC1925p.x41);
        hashSet2.add(InterfaceC1925p.pavv);
        hashSet2.add("like");
        hashSet2.add(InterfaceC1925p.nzoy);
        Iterator<String> itKeys = json.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (!hashSet.contains(next) && !hashSet2.contains(next)) {
                resource.getOnlineInfo().putExtraMeta(next, json.get(next).toString());
            }
        }
        return resource;
    }

    @Override // com.android.thememanager.controller.online.f7l8
    /* JADX INFO: renamed from: k */
    public Map<String, Resource> mo7540k(File file) throws JSONException, IOException {
        HashMap map = new HashMap();
        JSONObject jSONObjectZy = ek5k.zy(file);
        Iterator<String> itKeys = jSONObjectZy.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            String string = jSONObjectZy.getString(next);
            Resource resource = new Resource();
            resource.setOnlineId(string);
            map.put(next, resource);
        }
        return map;
    }

    protected RecommendItem kja0(PageItem.ItemType itemType, JSONObject jsonRecommend, int showType) throws JSONException {
        RecommendItem recommendItem = new RecommendItem();
        if (m7648i(itemType)) {
            recommendItem.setWidthCount(jsonRecommend.getInt(InterfaceC1925p.f8i));
            recommendItem.setHeightCount(jsonRecommend.getInt(InterfaceC1925p.arkx));
            String recommendImageCacheFolder = this.f10928k.getRecommendImageCacheFolder();
            String str = String.format(itemType == PageItem.ItemType.MULTIPLEBUTTON ? InterfaceC1925p.fy7 : InterfaceC1925p.ohc0, Integer.valueOf((showType & PageItem.ItemShowType.SHOW_TYPE_SCROLL_BIT) == 0 ? this.f10928k.getRecommendImageWidth() * recommendItem.getWidthCount() : y9n.zurt().x), 90);
            recommendItem.setOnlineThumbnail(jsonRecommend.getString("picUrlRoot") + str + jsonRecommend.getString(InterfaceC1925p.dci));
            StringBuilder sb = new StringBuilder();
            sb.append(recommendImageCacheFolder);
            sb.append(ch.gvn7(recommendItem.getOnlineThumbnail()));
            recommendItem.setLocalThumbnail(sb.toString());
        }
        try {
            recommendItem.setItemType(RecommendItem.RecommendType.valueOf(jsonRecommend.getString(InterfaceC1925p.ppa).toUpperCase(Locale.ENGLISH)));
            recommendItem.setResourceStamp(jsonRecommend.getString("category"));
            recommendItem.setContentId(jsonRecommend.getString("relatedId"));
            recommendItem.setItemId(jsonRecommend.getString("id"));
            recommendItem.setTitle(jsonRecommend.getString("title"));
            recommendItem.setLoginRequried(jsonRecommend.optBoolean(InterfaceC1925p.afni));
            recommendItem.setFlags(jsonRecommend.optLong(InterfaceC1925p.pwo));
            int iOptInt = jsonRecommend.optInt(InterfaceC1925p.jua8, 1);
            JSONArray jSONArray = jsonRecommend.getJSONArray(InterfaceC1925p.ffiu);
            for (int i2 = 0; i2 < jSONArray.length() && i2 < iOptInt; i2++) {
                recommendItem.addPageGroup(qrj(jSONArray.getJSONObject(i2)));
            }
            return recommendItem;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.android.thememanager.controller.online.f7l8
    /* JADX INFO: renamed from: n */
    public a98o.zy<Resource> mo7541n(File file) throws JSONException, IOException {
        a98o.zy<Resource> zyVar = new a98o.zy<>();
        JSONObject jSONObjectZy = ek5k.zy(file);
        if (jSONObjectZy.has(InterfaceC1925p.vqy)) {
            jSONObjectZy = jSONObjectZy.optJSONObject(InterfaceC1925p.vqy);
        }
        String str = null;
        Iterator<String> itKeys = jSONObjectZy.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (InterfaceC1925p.ta9a.equals(next)) {
                zyVar.setLast(jSONObjectZy.getBoolean(next));
            } else {
                str = next;
            }
        }
        JSONArray jSONArray = jSONObjectZy.getJSONArray(str);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            zyVar.add(m7649h(jSONArray.getJSONObject(i2)));
        }
        return zyVar;
    }

    protected PageItem n7h(JSONObject jsonItem) throws JSONException {
        String value;
        PageItem pageItem = new PageItem();
        pageItem.setIndex(jsonItem.getInt("index"));
        pageItem.setName(jsonItem.getString("name"));
        try {
            pageItem.setType(PageItem.ItemType.valueOf(jsonItem.getString("type").toUpperCase(Locale.ENGLISH)));
            pageItem.setValue(jsonItem.getString("value"));
            pageItem.setShowType(jsonItem.optInt(InterfaceC1925p.enbq));
            pageItem.setRecommendMaxCol(jsonItem.optInt(InterfaceC1925p.nvs3, -1));
            pageItem.setResourceStamp(jsonItem.optString("category"));
            int i2 = 0;
            if (t8r(pageItem.getType())) {
                JSONArray jSONArray = jsonItem.getJSONArray(InterfaceC1925p.wp);
                if (jSONArray.length() == 0 && pageItem.getType() != PageItem.ItemType.TITLENEW) {
                    return null;
                }
                while (i2 < jSONArray.length()) {
                    RecommendItem recommendItemKja0 = kja0(pageItem.getType(), jSONArray.getJSONObject(i2), pageItem.getShowType());
                    if (recommendItemKja0 != null) {
                        pageItem.addRecommendItem(recommendItemKja0);
                    }
                    i2++;
                }
            } else if (pageItem.getType() == PageItem.ItemType.HOTWORDS && (value = pageItem.getValue()) != null) {
                String[] strArrSplit = value.split(";");
                while (i2 < strArrSplit.length) {
                    if (!TextUtils.isEmpty(strArrSplit[i2].trim())) {
                        RecommendItem recommendItem = new RecommendItem();
                        recommendItem.setItemType(RecommendItem.RecommendType.SEARCH);
                        recommendItem.setResourceStamp(this.f10928k.getResourceStamp());
                        recommendItem.setTitle(strArrSplit[i2]);
                        pageItem.addRecommendItem(recommendItem);
                    }
                    i2++;
                }
            }
            return pageItem;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.android.thememanager.controller.online.f7l8
    /* JADX INFO: renamed from: q */
    public Resource mo7543q(File file) throws JSONException, IOException {
        return m7649h(ek5k.zy(file));
    }

    public PageGroup qrj(JSONObject jsonGroup) throws JSONException {
        PageGroup pageGroup = new PageGroup();
        pageGroup.setTitle(jsonGroup.getString("title"));
        JSONArray jSONArray = jsonGroup.getJSONArray(InterfaceC1925p.lge8);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i2);
            Page page = new Page();
            page.setTitle(jSONObject.getString("title"));
            page.setKey(jSONObject.getString(InterfaceC1925p.rkxl));
            String strOptString = jSONObject.optString(InterfaceC1925p.lo);
            if (!TextUtils.isEmpty(strOptString)) {
                page.setListUrl(ld6.m7571m(InterfaceC1925p.rkfn + strOptString));
            }
            String strOptString2 = jSONObject.optString(InterfaceC1925p.vx);
            if (!TextUtils.isEmpty(strOptString2)) {
                page.setItemUrl(ld6.nn86(InterfaceC1925p.rkfn + strOptString2));
            }
            pageGroup.addPage(page);
        }
        return pageGroup;
    }

    @Override // com.android.thememanager.controller.online.f7l8
    public CommonResponse toq(File file, Class pageClass) throws JSONException, IOException {
        JSONObject jSONObjectZy = ek5k.zy(file);
        if (jSONObjectZy != null) {
            return (CommonResponse) C1808h.m7086k().kja0(jSONObjectZy.toString(), CommonResponse.type(CommonResponse.class, pageClass));
        }
        return null;
    }

    @Override // com.android.thememanager.controller.online.f7l8
    public List<PageItem> zy(File file) throws JSONException, IOException {
        ArrayList arrayList = new ArrayList();
        JSONObject jSONObjectZy = ek5k.zy(file);
        String string = jSONObjectZy.getString("picUrlRoot");
        JSONArray jSONArray = jSONObjectZy.getJSONArray(InterfaceC1925p.xq);
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            PageItem pageItemN7h = n7h(jSONArray.getJSONObject(i2));
            if (pageItemN7h != null) {
                if (pageItemN7h.getType() == PageItem.ItemType.PICTURE) {
                    pageItemN7h.setValue(string + InterfaceC1925p.ohc0 + pageItemN7h.getValue());
                }
                arrayList.add(pageItemN7h);
            }
        }
        return arrayList;
    }
}

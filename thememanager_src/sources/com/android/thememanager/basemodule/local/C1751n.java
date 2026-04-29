package com.android.thememanager.basemodule.local;

import android.util.JsonReader;
import android.util.JsonToken;
import android.util.JsonWriter;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.fu4;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import miuix.core.util.C7083n;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.local.n */
/* JADX INFO: compiled from: LocalJSONDataParser.java */
/* JADX INFO: loaded from: classes.dex */
public class C1751n extends AbstractC1753q {

    /* JADX INFO: renamed from: a */
    private static final String f10006a = "extraMeta";
    private static final int a7kc = 46;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f57564ab = "screenRatio";
    private static final String ac = "check_bought";
    private static final String ad = "price";
    private static final int afw = 38;
    private static final int aj = 1;
    private static final String am = "miuiAdapterVersion";
    private static final String an = "iconsCount";
    private static final int ar = 4;

    @Deprecated
    private static final String as = "title";
    private static final String ax = "supportHomeSearchBar";
    private static final String ay = "isBackUpVersion";

    @Deprecated
    private static final String az = "buildInThumbnails";

    /* JADX INFO: renamed from: b */
    private static final String f10007b = "subResources";

    @Deprecated
    private static final String ba = "buildInPreviews";
    private static final String bb = "packageVersion";
    private static final int bc = 5;
    private static final int bd = 7;
    private static final int be = 0;

    @Deprecated
    private static final String bg = "description";

    @Deprecated
    private static final String bl = "designer";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f57565bo = "rightsPath";
    private static final String bp = "packageName";
    private static final String bq = "bought";
    private static final int bs = 2;
    private static final int bu = 6;
    private static final String bv = "officialIcons";

    /* JADX INFO: renamed from: c */
    private static final String f10008c = "builtInThumbnails";
    private static final int cecm = 48;
    private static final int cw14 = 21;

    /* JADX INFO: renamed from: d */
    private static final String f10009d = "onlinePath";
    private static final int d1cy = 26;
    private static final int dy = 14;

    /* JADX INFO: renamed from: e */
    private static final String f10010e = "builtInPreviews";
    private static final int eht = 40;

    @Deprecated
    private static final int ei = 29;

    /* JADX INFO: renamed from: f */
    private static final String f10011f = "descriptions";
    private static final int fn2 = 43;

    /* JADX INFO: renamed from: g */
    private static final String f10012g = "assemblyId";

    /* JADX INFO: renamed from: h */
    private static final String f10013h = "size";
    private static final int hp = 20;

    /* JADX INFO: renamed from: i */
    private static final String f10014i = "updatedTime";
    private static final String id = "fontWeight";

    @Deprecated
    private static final String in = "author";

    /* JADX INFO: renamed from: j */
    private static final String f10015j = "thumbnails";
    private static final int k0 = 3;
    private static final int k6e = 16;
    private static final int k84 = 47;
    private static final Map<String, Integer> kdv1;

    /* JADX INFO: renamed from: l */
    private static final String f10016l = "titles";
    private static final int ls9 = 36;
    private static final int lw58 = 42;

    /* JADX INFO: renamed from: m */
    private static final String f10017m = "parentResources";
    private static final int mjvl = 19;

    /* JADX INFO: renamed from: n */
    private static final String f10018n = "onlineId";
    private static final int n5ij = 41;
    private static final int ndjo = 25;
    private static final int nq0z = 45;

    /* JADX INFO: renamed from: o */
    private static final String f10019o = "previews";
    private static final int oyp = 39;

    /* JADX INFO: renamed from: p */
    private static final String f10020p = "platform";

    /* JADX INFO: renamed from: q */
    private static final String f10021q = "localId";
    private static final int q7k9 = 24;
    private static final int qns = 37;

    /* JADX INFO: renamed from: r */
    private static final String f10022r = "designers";

    /* JADX INFO: renamed from: s */
    private static final String f10023s = "hash";
    private static final int s8y = 18;
    private static final int sk1t = 13;

    /* JADX INFO: renamed from: t */
    private static final String f10024t = "authors";
    private static final int tgs = 10;
    private static final int th6 = 23;
    private static final int tlhn = 8;

    /* JADX INFO: renamed from: u */
    private static final String f10025u = "contentPath";
    private static final int us2t = 44;
    private static final int ut = 34;

    /* JADX INFO: renamed from: v */
    private static final String f10026v = "downloadPath";
    private static final int vb6 = 15;

    /* JADX INFO: renamed from: w */
    private static final String f10027w = "resourceCode";
    private static final int w97r = 9;
    private static final int wh6 = 35;

    @Deprecated
    private static final int wra = 30;

    /* JADX INFO: renamed from: x */
    private static final String f10028x = "metaPath";

    @Deprecated
    private static final int xhv = 32;
    private static final int xk5 = 17;

    @Deprecated
    private static final int xqx = 27;
    private static final int xy8 = 22;

    /* JADX INFO: renamed from: y */
    private static final String f10029y = "productId";
    private static final int yl25 = 11;

    /* JADX INFO: renamed from: z */
    private static final String f10030z = "version";
    private static final int zm = 33;
    private static final int zmmu = 12;

    @Deprecated
    private static final int zr5t = 28;

    @Deprecated
    private static final int zsl = 31;

    static {
        HashMap map = new HashMap();
        kdv1 = map;
        map.put(f10021q, 1);
        map.put("onlineId", 2);
        map.put("assemblyId", 3);
        map.put("productId", 4);
        map.put("hash", 5);
        map.put("platform", 6);
        map.put("packageName", 47);
        map.put("officialIcons", 48);
        map.put("size", 7);
        map.put(f10014i, 8);
        map.put("version", 9);
        map.put(f10024t, 10);
        map.put(f10022r, 11);
        map.put(f10016l, 12);
        map.put(f10011f, 13);
        map.put(f10008c, 14);
        map.put(f10010e, 15);
        map.put(f10015j, 16);
        map.put(f10019o, 17);
        map.put(f10017m, 18);
        map.put(f10007b, 19);
        map.put(f10006a, 20);
        map.put(f10028x, 21);
        map.put(f10025u, 22);
        map.put(f57565bo, 23);
        map.put(f10026v, 24);
        map.put("onlinePath", 25);
        map.put("resourceCode", 26);
        map.put("author", 27);
        map.put("designer", 28);
        map.put("title", 29);
        map.put("description", 30);
        map.put(az, 31);
        map.put(ba, 32);
        map.put(f57564ab, 33);
        map.put(ax, 34);
        map.put(bb, 35);
        map.put(an, 36);
        map.put("fontWeight", 37);
        map.put(bq, 38);
        map.put(ac, 39);
        map.put("price", 40);
        map.put(am, 41);
        map.put(ay, 42);
        map.put(com.android.thememanager.controller.local.qrj.f57930ni7, 43);
        map.put(com.android.thememanager.controller.local.qrj.f57932t8r, 44);
        map.put(com.android.thememanager.controller.local.qrj.f10909i, 45);
        map.put(com.android.thememanager.controller.local.qrj.f57924fn3e, 46);
    }

    public C1751n(C1791k context) {
        super(context);
    }

    private List<PathEntry> f7l8(JsonReader reader) throws IOException {
        ArrayList arrayList = new ArrayList();
        reader.beginArray();
        while (reader.hasNext()) {
            reader.beginObject();
            PathEntry pathEntry = new PathEntry();
            while (reader.hasNext()) {
                String strNextName = reader.nextName();
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                } else if (PathEntry.LOCAL_PATH.equals(strNextName)) {
                    pathEntry.setLocalPath(m6849p(reader.nextString()));
                } else if ("onlinePath".equals(strNextName)) {
                    pathEntry.setOnlinePath(reader.nextString());
                } else {
                    reader.skipValue();
                }
            }
            arrayList.add(pathEntry);
            reader.endObject();
        }
        reader.endArray();
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    private Map<String, List<String>> m6847g(JsonReader reader) throws IOException {
        HashMap map = new HashMap();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (reader.peek() == JsonToken.NULL) {
                reader.skipValue();
            } else {
                map.put(strNextName, m6848n(reader));
            }
        }
        reader.endObject();
        return map;
    }

    private void kja0(JsonWriter writer, List<RelatedResource> relatedResources) throws IOException {
        writer.beginArray();
        for (RelatedResource relatedResource : relatedResources) {
            writer.beginObject();
            writer.name(f10021q).value(relatedResource.getLocalId());
            writer.name("resourceCode").value(relatedResource.getResourceCode());
            writer.name(f10006a);
            n7h(writer, relatedResource.getExtraMeta());
            writer.name(f10028x).value(relatedResource.getMetaPath());
            writer.name(f10025u).value(relatedResource.getContentPath());
            writer.endObject();
        }
        writer.endArray();
    }

    private void ld6(JsonWriter writer, List<String> buildInImagePaths) throws IOException {
        writer.beginArray();
        Iterator<String> it = buildInImagePaths.iterator();
        while (it.hasNext()) {
            writer.value(it.next());
        }
        writer.endArray();
    }

    /* JADX INFO: renamed from: n */
    private List<String> m6848n(JsonReader reader) throws IOException {
        ArrayList arrayList = new ArrayList();
        reader.beginArray();
        while (reader.hasNext()) {
            arrayList.add(m6849p(reader.nextString()));
        }
        reader.endArray();
        return arrayList;
    }

    private void n7h(JsonWriter writer, Map<String, String> map) throws IOException {
        writer.beginObject();
        for (String str : map.keySet()) {
            writer.name(str).value(map.get(str));
        }
        writer.endObject();
    }

    /* JADX INFO: renamed from: p */
    private String m6849p(String originPath) {
        return (originPath == null || !originPath.startsWith("/storage")) ? C1792n.m6944q(originPath) : C7083n.m25584g(originPath);
    }

    private void qrj(JsonWriter writer, List<PathEntry> imagePaths) throws IOException {
        writer.beginArray();
        for (PathEntry pathEntry : imagePaths) {
            writer.beginObject();
            writer.name(PathEntry.LOCAL_PATH).value(pathEntry.getLocalPath());
            writer.name("onlinePath").value(pathEntry.getOnlinePath());
            writer.endObject();
        }
        writer.endArray();
    }

    /* JADX INFO: renamed from: s */
    private List<RelatedResource> m6850s(JsonReader reader) throws IOException {
        ArrayList arrayList = new ArrayList();
        reader.beginArray();
        while (reader.hasNext()) {
            reader.beginObject();
            RelatedResource relatedResource = new RelatedResource();
            while (reader.hasNext()) {
                String strNextName = reader.nextName();
                if (reader.peek() == JsonToken.NULL) {
                    reader.skipValue();
                } else {
                    int iZy = zy(strNextName);
                    if (iZy == 1) {
                        relatedResource.setLocalId(reader.nextString());
                    } else if (iZy != 26) {
                        switch (iZy) {
                            case 20:
                                relatedResource.setExtraMeta(m6851y(reader));
                                break;
                            case 21:
                                relatedResource.setMetaPath(reader.nextString());
                                break;
                            case 22:
                                relatedResource.setContentPath(reader.nextString());
                                break;
                            default:
                                reader.skipValue();
                                break;
                        }
                    } else {
                        relatedResource.setResourceCode(reader.nextString());
                    }
                }
            }
            arrayList.add(relatedResource);
            reader.endObject();
        }
        reader.endArray();
        return arrayList;
    }

    private void x2(JsonWriter writer, Map<String, List<String>> buildInImagePathsMap) throws IOException {
        writer.beginObject();
        for (String str : buildInImagePathsMap.keySet()) {
            writer.name(str);
            ld6(writer, buildInImagePathsMap.get(str));
        }
        writer.endObject();
    }

    /* JADX INFO: renamed from: y */
    private Map<String, String> m6851y(JsonReader reader) throws IOException {
        HashMap map = new HashMap();
        reader.beginObject();
        while (reader.hasNext()) {
            String strNextName = reader.nextName();
            if (reader.peek() != JsonToken.NULL) {
                map.put(strNextName, reader.nextString());
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return map;
    }

    private static int zy(String tag) {
        Integer num = kdv1.get(tag);
        if (num != null) {
            return num.intValue();
        }
        return 0;
    }

    @Override // com.android.thememanager.basemodule.local.AbstractC1753q
    /* JADX INFO: renamed from: k */
    public Resource mo6852k(File file) throws C1743g {
        Resource resourceM6853q = m6853q(file);
        resourceM6853q.setModifiedTime(file.lastModified());
        if (C1792n.m6933f(resourceM6853q.getLocalId())) {
            resourceM6853q.setModifiedTime(Long.MAX_VALUE);
        }
        fu4.m7066g(resourceM6853q);
        fu4.m7068n(resourceM6853q);
        return resourceM6853q;
    }

    /* JADX INFO: renamed from: q */
    public final Resource m6853q(File file) throws C1743g {
        JsonReader jsonReader;
        Resource resource = new Resource();
        JsonReader jsonReader2 = null;
        try {
            try {
                jsonReader = new JsonReader(new BufferedReader(new FileReader(file)));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                if (jsonReader.peek() != JsonToken.NULL) {
                    switch (zy(strNextName)) {
                        case 1:
                            resource.setLocalId(jsonReader.nextString());
                            break;
                        case 2:
                            resource.setOnlineId(jsonReader.nextString());
                            break;
                        case 3:
                            resource.setAssemblyId(jsonReader.nextString());
                            break;
                        case 4:
                            resource.setProductId(jsonReader.nextString());
                            break;
                        case 5:
                            resource.setHash(jsonReader.nextString());
                            break;
                        case 6:
                            resource.setLocalPlatform(jsonReader.nextInt());
                            break;
                        case 7:
                            resource.getLocalInfo().setSize(jsonReader.nextLong());
                            break;
                        case 8:
                            resource.getLocalInfo().setUpdatedTime(jsonReader.nextLong());
                            break;
                        case 9:
                            resource.getLocalInfo().setVersion(jsonReader.nextString());
                            break;
                        case 10:
                            resource.getLocalInfo().setAuthors(m6851y(jsonReader));
                            break;
                        case 11:
                            resource.getLocalInfo().setDesigners(m6851y(jsonReader));
                            break;
                        case 12:
                            resource.getLocalInfo().setTitles(m6851y(jsonReader));
                            break;
                        case 13:
                            resource.getLocalInfo().setDescriptions(m6851y(jsonReader));
                            break;
                        case 14:
                            resource.setBuildInThumbnailsMap(m6847g(jsonReader));
                            break;
                        case 15:
                            resource.setBuildInPreviewsMap(m6847g(jsonReader));
                            break;
                        case 16:
                            resource.setThumbnails(f7l8(jsonReader));
                            break;
                        case 17:
                            resource.setPreviews(f7l8(jsonReader));
                            break;
                        case 18:
                            resource.setParentResources(m6850s(jsonReader));
                            break;
                        case 19:
                            resource.setSubResources(m6850s(jsonReader));
                            break;
                        case 20:
                            resource.getLocalInfo().setExtraMeta(m6851y(jsonReader));
                            break;
                        case 21:
                            resource.setMetaPath(jsonReader.nextString());
                            break;
                        case 22:
                            resource.setContentPath(jsonReader.nextString());
                            break;
                        case 23:
                            resource.setRightsPath(jsonReader.nextString());
                            break;
                        case 24:
                        case 25:
                        case 26:
                        default:
                            jsonReader.skipValue();
                            break;
                        case 27:
                            resource.getLocalInfo().putAuthor("fallback", jsonReader.nextString());
                            break;
                        case 28:
                            resource.getLocalInfo().putDesigner("fallback", jsonReader.nextString());
                            break;
                        case 29:
                            resource.getLocalInfo().putTitle("fallback", jsonReader.nextString());
                            break;
                        case 30:
                            resource.getLocalInfo().putDescription("fallback", jsonReader.nextString());
                            break;
                        case 31:
                            resource.putBuildInThumbnails("fallback", m6848n(jsonReader));
                            break;
                        case 32:
                            resource.putBuildInPreviews("fallback", m6848n(jsonReader));
                            break;
                        case 33:
                            resource.getLocalInfo().setScreenRatio(jsonReader.nextString());
                            break;
                        case 34:
                            resource.setSupportHomeSearchBar(jsonReader.nextBoolean());
                            break;
                        case 35:
                            resource.setPackageVersion(jsonReader.nextString());
                            break;
                        case 36:
                            resource.setIconsCount(Integer.valueOf(jsonReader.nextInt()));
                            break;
                        case 37:
                            resource.setFormatFontWeightList(jsonReader.nextString());
                            break;
                        case 38:
                            resource.setProductBought(jsonReader.nextBoolean());
                            break;
                        case 39:
                            resource.setCheckBoughtStatus(jsonReader.nextBoolean());
                            break;
                        case 40:
                            resource.setProductPrice(jsonReader.nextInt());
                            break;
                        case 41:
                            resource.setMiuiAdapterVersion(jsonReader.nextString());
                            break;
                        case 42:
                            resource.setIsBackUpVersion(jsonReader.nextBoolean());
                            break;
                        case 43:
                            resource.setThemeType(jsonReader.nextInt());
                            break;
                        case 44:
                            resource.setSmallFrameCount(jsonReader.nextInt());
                            break;
                        case 45:
                            resource.setAllFrameCount(jsonReader.nextInt());
                            break;
                        case 46:
                            resource.setFrameRate(jsonReader.nextInt());
                            break;
                        case 47:
                            resource.getLocalInfo().setLageIconPackageName(jsonReader.nextString());
                            break;
                        case 48:
                            resource.getLocalInfo().setIsOfficial(jsonReader.nextBoolean());
                            break;
                    }
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            try {
                jsonReader.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            C1792n.yz(resource, file);
            return resource;
        } catch (IOException e4) {
            e = e4;
            throw new C1743g(e.getMessage());
        } catch (Throwable th2) {
            th = th2;
            jsonReader2 = jsonReader;
            if (jsonReader2 != null) {
                try {
                    jsonReader2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }

    @Override // com.android.thememanager.basemodule.local.AbstractC1753q
    public void toq(File file, Resource resource) throws C1743g {
        JsonWriter jsonWriter;
        JsonWriter jsonWriter2 = null;
        try {
            try {
                jsonWriter = new JsonWriter(new BufferedWriter(new FileWriter(file)));
            } catch (IOException e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            jsonWriter.setIndent("  ");
            jsonWriter.beginObject();
            jsonWriter.name(f10021q).value(resource.getLocalId());
            jsonWriter.name("onlineId").value(resource.getOnlineId());
            jsonWriter.name("assemblyId").value(resource.getAssemblyId());
            jsonWriter.name("productId").value(resource.getProductId());
            jsonWriter.name("hash").value(resource.getHash());
            jsonWriter.name("platform").value(resource.getLocalPlatform());
            jsonWriter.name("size").value(resource.getLocalInfo().getSize());
            jsonWriter.name(f10014i).value(resource.getLocalInfo().getUpdatedTime());
            jsonWriter.name("version").value(resource.getLocalInfo().getVersion());
            jsonWriter.name(f10024t);
            n7h(jsonWriter, resource.getLocalInfo().getAuthors());
            jsonWriter.name(f10022r);
            n7h(jsonWriter, resource.getLocalInfo().getDesigners());
            jsonWriter.name(f10016l);
            n7h(jsonWriter, resource.getLocalInfo().getTitles());
            jsonWriter.name(f10011f);
            n7h(jsonWriter, resource.getLocalInfo().getDescriptions());
            jsonWriter.name(f10008c);
            x2(jsonWriter, resource.getBuildInThumbnailsMap());
            jsonWriter.name(f10010e);
            x2(jsonWriter, resource.getBuildInPreviewsMap());
            jsonWriter.name(f10015j);
            qrj(jsonWriter, resource.getThumbnails());
            jsonWriter.name(f10019o);
            qrj(jsonWriter, resource.getPreviews());
            jsonWriter.name(f10017m);
            kja0(jsonWriter, resource.getParentResources());
            jsonWriter.name(f10007b);
            kja0(jsonWriter, resource.getSubResources());
            jsonWriter.name(f10006a);
            n7h(jsonWriter, resource.getLocalInfo().getExtraMeta());
            jsonWriter.name(f10028x).value(resource.getMetaPath());
            jsonWriter.name(f10025u).value(resource.getContentPath());
            jsonWriter.name(f57565bo).value(resource.getRightsPath());
            jsonWriter.name(f57564ab).value(resource.getLocalInfo().getScreenRatio());
            jsonWriter.name(ax).value(resource.isSupportHomeSearchBar());
            jsonWriter.name(bb).value(resource.getPackageVersion());
            jsonWriter.name("packageName").value(resource.getLocalInfo().getLargeIconPackageName());
            jsonWriter.name("officialIcons").value(resource.getLocalInfo().isOfficial());
            jsonWriter.name(an).value(resource.getIconsCount());
            jsonWriter.name("fontWeight").value(resource.getFormatFontWeightList());
            jsonWriter.name("price").value(resource.getProductPrice());
            jsonWriter.name(ay).value(resource.getIsBackUpVersion());
            jsonWriter.name(com.android.thememanager.controller.local.qrj.f57930ni7).value(resource.getThemeType());
            if (C1807g.ncyb()) {
                jsonWriter.name(com.android.thememanager.controller.local.qrj.f57932t8r).value(resource.getSmallFrameCount());
                jsonWriter.name(com.android.thememanager.controller.local.qrj.f10909i).value(resource.getAllFrameCount());
                jsonWriter.name(com.android.thememanager.controller.local.qrj.f57924fn3e).value(resource.getRate());
            }
            if (resource.hasCheckBoughtStatus()) {
                jsonWriter.name(bq).value(resource.isProductBought());
                jsonWriter.name(ac).value(true);
            }
            jsonWriter.name(am).value(resource.getMiuiAdapterVersion());
            jsonWriter.endObject();
            try {
                jsonWriter.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
        } catch (IOException e4) {
            e = e4;
            jsonWriter2 = jsonWriter;
            throw new C1743g(e.getMessage());
        } catch (Throwable th2) {
            th = th2;
            jsonWriter2 = jsonWriter;
            if (jsonWriter2 != null) {
                try {
                    jsonWriter2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }
}

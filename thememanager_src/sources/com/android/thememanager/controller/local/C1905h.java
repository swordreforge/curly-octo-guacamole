package com.android.thememanager.controller.local;

import android.text.TextUtils;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.local.AbstractC1753q;
import com.android.thememanager.basemodule.local.C1743g;
import com.android.thememanager.basemodule.local.C1751n;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1794q;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.resource.model.ResourceInfo;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.controller.local.C1909n;
import com.android.thememanager.controller.strategy.C1955s;
import com.android.thememanager.fu4;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.util.ch;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: com.android.thememanager.controller.local.h */
/* JADX INFO: compiled from: ThemeImportService.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1905h implements InterfaceC1789q {

    /* JADX INFO: renamed from: h */
    public static int f10870h;

    /* JADX INFO: renamed from: i */
    public static int f10871i;

    /* JADX INFO: renamed from: k */
    protected fu4 f10873k;

    /* JADX INFO: renamed from: n */
    protected AbstractC1753q f10874n;

    /* JADX INFO: renamed from: q */
    protected com.android.thememanager.controller.x2 f10876q;

    /* JADX INFO: renamed from: s */
    protected Map<String, String> f10877s;

    /* JADX INFO: renamed from: y */
    protected Map<String, String> f10878y;

    /* JADX INFO: renamed from: g */
    protected com.android.thememanager.controller.strategy.zy f10872g = new C1955s();

    /* JADX INFO: renamed from: p */
    protected Map<String, Map<String, String>> f10875p = new HashMap();

    /* JADX INFO: renamed from: com.android.thememanager.controller.local.h$k */
    /* JADX INFO: compiled from: ThemeImportService.java */
    class k implements ch.InterfaceC2766g {
        k() {
        }

        @Override // com.android.thememanager.util.ch.InterfaceC2766g
        /* JADX INFO: renamed from: k */
        public void mo7497k(String path, long size, String hash) {
            ch.ek5k(path, hash);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.local.h$toq */
    /* JADX INFO: compiled from: ThemeImportService.java */
    protected static class toq {

        /* JADX INFO: renamed from: k */
        public File f10880k;

        /* JADX INFO: renamed from: n */
        public long f10881n;

        /* JADX INFO: renamed from: q */
        public boolean f10882q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f57906toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public long f57907zy;

        protected toq() {
        }
    }

    public C1905h(fu4 context) {
        this.f10873k = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001f, code lost:
    
        android.util.Log.w("ThemeImportService", "getSrcFolderName: " + r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003c, code lost:
    
        r2 = r2.substring(0, r2.lastIndexOf("/"));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String cdj(java.io.File r6) {
        /*
            r5 = this;
            java.lang.String r0 = "/"
            java.lang.String r1 = "ThemeImportService"
            r2 = 0
            java.util.zip.ZipInputStream r3 = new java.util.zip.ZipInputStream     // Catch: java.lang.Exception -> L4b
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L4b
            r4.<init>(r6)     // Catch: java.lang.Exception -> L4b
            r3.<init>(r4)     // Catch: java.lang.Exception -> L4b
        Lf:
            java.util.zip.ZipEntry r6 = r3.getNextEntry()     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L3d
            java.lang.String r2 = r6.getName()     // Catch: java.lang.Throwable -> L41
            boolean r6 = r2.contains(r0)     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto Lf
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r6.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = "getSrcFolderName: "
            r6.append(r4)     // Catch: java.lang.Throwable -> L41
            r6.append(r2)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L41
            android.util.Log.w(r1, r6)     // Catch: java.lang.Throwable -> L41
            int r6 = r2.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L41
            r0 = 0
            java.lang.String r6 = r2.substring(r0, r6)     // Catch: java.lang.Throwable -> L41
            r2 = r6
        L3d:
            r3.close()     // Catch: java.lang.Exception -> L4b
            goto L50
        L41:
            r6 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L46
            goto L4a
        L46:
            r0 = move-exception
            r6.addSuppressed(r0)     // Catch: java.lang.Exception -> L4b
        L4a:
            throw r6     // Catch: java.lang.Exception -> L4b
        L4b:
            java.lang.String r6 = "get folder failed!"
            android.util.Log.e(r1, r6)
        L50:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "getFolderName: "
            r6.append(r0)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            android.util.Log.w(r1, r6)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.controller.local.C1905h.cdj(java.io.File):java.lang.String");
    }

    private void ld6(File folder) {
        if (folder == null) {
            return;
        }
        File file = new File(folder, InterfaceC1789q.igu);
        int i2 = 0;
        if (!file.exists()) {
            String[] strArr = InterfaceC1789q.kzk;
            int length = strArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                File file2 = new File(folder, strArr[i3]);
                if (file2.exists()) {
                    file.delete();
                    file2.renameTo(file);
                    break;
                }
                i3++;
            }
        }
        File file3 = new File(folder, InterfaceC1789q.xd);
        if (!file3.exists()) {
            String[] strArr2 = InterfaceC1789q.gr;
            int length2 = strArr2.length;
            while (true) {
                if (i2 >= length2) {
                    break;
                }
                File file4 = new File(folder, strArr2[i2]);
                if (file4.exists()) {
                    file3.delete();
                    file4.renameTo(file3);
                    break;
                }
                i2++;
            }
        }
        if (file.exists() || !file3.exists()) {
            return;
        }
        try {
            file.createNewFile();
            ch.ek5k(file.getAbsolutePath(), ch.wvg(file3.getAbsolutePath()));
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    private boolean mcp(File folder, Resource parent, Resource resource) {
        String resourceCode = this.f10873k.getResourceCode();
        File file = new File(folder, p001b.toq.f7l8(resourceCode));
        return m7494t(folder, parent) && (file.exists() && o1t(folder, file, parent, resource, resourceCode));
    }

    private boolean o1t(File folder, File file, Resource parent, Resource resource, String code) {
        Resource resourceZy = zy(folder, file, parent, resource, code);
        RelatedResource relatedResourceFn3e = fn3e(code, parent.getSubResources());
        if (relatedResourceFn3e == null) {
            relatedResourceFn3e = new RelatedResource();
            relatedResourceFn3e.setLocalId(resourceZy.getLocalId());
            relatedResourceFn3e.setResourceCode(code);
            parent.addSubResources(relatedResourceFn3e);
        }
        File file2 = new File(new C1794q(relatedResourceFn3e, C1791k.getInstance(this.f10873k.getResourceCode())).m6956k());
        file2.getParentFile().mkdirs();
        file2.delete();
        file.renameTo(file2);
        String str = this.f10875p.get(folder.getAbsolutePath()).get(code);
        if (!TextUtils.isEmpty(str)) {
            C1821p.m7183g(new File(str), new File(new ResourceResolver(resourceZy, this.f10873k).getRightsPath()));
        }
        this.f10876q.m7690k().mo7473g(resourceZy);
        return true;
    }

    private void oc(Resource resource, File packageFile) {
        resource.setPackageVersion(new com.android.thememanager.basemodule.resource.toq(packageFile).m6972k());
    }

    private Resource toq(File folder, Resource parent, Resource resource, toq eb) {
        RelatedResource next;
        Resource resourceZy;
        Iterator<RelatedResource> it = resource.getParentResources().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getResourceCode().equals(zurt())) {
                break;
            }
        }
        if (next != null && (resourceZy = C1792n.zy(next, this.f10873k.getNewResourceContext())) != null) {
            parent = resourceZy;
        }
        File file = new File(folder, "description.xml");
        if (file.exists()) {
            d3(resource, file);
            file.delete();
        }
        File file2 = new File(folder, com.android.thememanager.basemodule.resource.constants.toq.lvt);
        if (file2.exists()) {
            oc(resource, file2);
            file2.delete();
        }
        File file3 = new File(folder, com.android.thememanager.basemodule.resource.constants.toq.kx);
        if (file3.exists()) {
            file3.delete();
        }
        File file4 = new File(folder, com.android.thememanager.basemodule.resource.constants.toq.xdbo);
        if (file4.exists()) {
            file4.delete();
        }
        m7484g(parent, resource);
        String localId = parent.getLocalId();
        if (localId == null) {
            localId = this.f10872g.mo7689k();
        }
        parent.setLocalId(localId);
        parent.setHash(eb.f57906toq);
        parent.getLocalInfo().setSize(eb.f57907zy);
        String str = this.f10875p.get(folder.getAbsolutePath()).get(zurt());
        if (!TextUtils.isEmpty(str)) {
            C1821p.m7183g(new File(str), new File(new ResourceResolver(parent, this.f10873k).getRightsPath()));
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (true) {
            String[] strArr = InterfaceC1789q.e6z;
            if (i2 >= strArr.length) {
                dd(folder, new ResourceResolver(parent, this.f10873k).getBuildInImageFolder(), parent, arrayList, true);
                RelatedResource relatedResource = new RelatedResource();
                relatedResource.setLocalId(parent.getLocalId());
                relatedResource.setResourceCode(zurt());
                f7l8(new C1794q(relatedResource, C1791k.getInstance(this.f10873k.getResourceCode())).m6956k());
                return parent;
            }
            arrayList.add(p001b.toq.m5743p(strArr[i2]));
            i2++;
        }
    }

    private void x9kr(Resource resource, File folder) {
        if (folder.exists()) {
            resource.getLocalInfo().setLageIconPackageName(cdj(folder));
        }
    }

    private Resource zy(File folder, File file, Resource parent, Resource resource, String code) {
        String localId = resource.getLocalId();
        if (localId == null) {
            localId = this.f10872g.mo7689k();
        }
        resource.setLocalId(localId);
        if ("largeicons".equals(code)) {
            x9kr(parent, file);
        }
        resource.getLocalInfo().setLageIconPackageName(parent.getLocalInfo().getLargeIconPackageName());
        resource.getLocalInfo().setIsOfficial(parent.getLocalInfo().isOfficial());
        resource.setHash(ch.wvg(file.getAbsolutePath()));
        resource.getLocalInfo().setSize(file.length());
        dd(folder, new ResourceResolver(resource, this.f10873k).getBuildInImageFolder(), resource, this.f10873k.getBuildInImagePrefixes(), false);
        if (fn3e(zurt(), resource.getParentResources()) == null) {
            RelatedResource relatedResource = new RelatedResource();
            relatedResource.setLocalId(parent.getLocalId());
            relatedResource.setResourceCode(zurt());
            resource.addParentResources(relatedResource);
        }
        return resource;
    }

    protected String a9(Resource resource) throws C1909n {
        return jp0y(resource);
    }

    protected void d2ok(File folder) throws Throwable {
        this.f10875p.put(folder.getAbsolutePath(), n7h(new File(folder, com.android.thememanager.basemodule.resource.constants.toq.q28p)));
    }

    protected void d3(Resource resource, File manifest) {
        qrj qrjVar = new qrj(manifest);
        ResourceInfo localInfo = resource.getLocalInfo();
        ResourceInfo onlineInfo = resource.getOnlineInfo();
        resource.setLocalPlatform(qrjVar.m7530y());
        resource.setSupportHomeSearchBar(qrjVar.m7524h());
        resource.setFontWeightList(qrjVar.m7526n());
        localInfo.setVersion(qrjVar.qrj());
        localInfo.setScreenRatio(qrjVar.m7529s());
        localInfo.setAuthors(qrjVar.toq());
        localInfo.setDesigners(qrjVar.m7528q());
        localInfo.setTitles(qrjVar.x2());
        localInfo.setDescriptions(qrjVar.zy());
        localInfo.setMiuiAdapterVersion(qrjVar.f7l8());
        localInfo.setIsBackUpVersion(qrjVar.n7h());
        resource.setSensorVideoMessage(qrjVar.m7523g(), qrjVar.m7525k(), qrjVar.m7527p(), 0);
        if (onlineInfo.getUpdatedTime() != 0) {
            localInfo.setUpdatedTime(onlineInfo.getUpdatedTime());
        }
        resource.getLocalInfo().setIsOfficial(qrjVar.kja0());
        com.android.thememanager.basemodule.utils.fu4.m7066g(resource);
    }

    protected void dd(File folder, String targetFolder, Resource resource, List<String> prefixes, boolean isBundle) {
        resource.clearBuildInThumbnails();
        resource.clearBuildInPreviews();
        File file = new File(folder, "preview");
        if (file.exists() && file.isDirectory()) {
            new File(targetFolder).mkdirs();
            Pattern patternCompile = Pattern.compile(com.android.thememanager.basemodule.resource.constants.toq.vy5c);
            HashMap map = new HashMap();
            for (File file2 : file.listFiles()) {
                String name = file2.getName();
                Matcher matcher = patternCompile.matcher(name);
                if (matcher.find()) {
                    String strGroup = matcher.group(1);
                    List<String> arrayList = map.get(strGroup);
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                        map.put(strGroup, arrayList);
                    }
                    arrayList.add(name);
                }
            }
            if (isBundle) {
                prefixes.add(0, com.android.thememanager.basemodule.resource.constants.toq.pwca);
            }
            m7492r(file, targetFolder, resource, prefixes, map);
            List<String> buildInThumbnails = resource.getBuildInThumbnails("preview");
            if (buildInThumbnails != null) {
                resource.putBuildInThumbnails("fallback", buildInThumbnails);
                resource.getBuildInThumbnailsMap().remove("preview");
            }
            List<String> buildInPreviews = resource.getBuildInPreviews("preview");
            if (buildInPreviews != null) {
                resource.putBuildInPreviews("fallback", buildInPreviews);
                resource.getBuildInPreviewsMap().remove("preview");
            }
            com.android.thememanager.basemodule.utils.fu4.m7068n(resource);
        }
    }

    protected void eqxt(File folder) {
        this.f10875p.remove(folder.getAbsolutePath());
    }

    protected boolean f7l8(String filePath) {
        try {
            File file = new File(filePath);
            file.getParentFile().mkdirs();
            file.delete();
            file.createNewFile();
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    protected RelatedResource fn3e(String code, List<RelatedResource> relatedResources) {
        for (RelatedResource relatedResource : relatedResources) {
            if (code.equals(relatedResource.getResourceCode())) {
                return relatedResource;
            }
        }
        return null;
    }

    public String fti(Resource resource) throws C1909n {
        try {
            try {
                this.f10874n = new C1751n(this.f10873k.getNewResourceContext());
                this.f10878y = t8r();
                this.f10877s = qrj();
                int resourceFormat = this.f10873k.getResourceFormat();
                return resourceFormat != 1 ? resourceFormat != 2 ? resourceFormat != 3 ? resourceFormat != 4 ? resourceFormat != 5 ? null : a9(resource) : gvn7(resource) : fu4(resource) : jk(resource) : m7496z(resource);
            } catch (RuntimeException e2) {
                e2.printStackTrace();
                throw new C1909n(C1909n.k.OTHER);
            }
        } finally {
            new File(resource.getDownloadPath()).delete();
        }
    }

    protected String fu4(Resource resource) throws C1909n {
        return null;
    }

    /* JADX INFO: renamed from: g */
    protected void m7484g(Resource target, Resource source) {
        target.setAssemblyId(source.getAssemblyId());
        target.setProductId(source.getProductId());
        target.setLocalPlatform(source.getLocalPlatform());
        target.getLocalInfo().updateFrom(source.getLocalInfo());
        target.setFontWeightList(source.getFontWeightList());
        target.setMiuiAdapterVersion(source.getMiuiAdapterVersion());
        target.setIsBackUpVersion(source.getIsBackUpVersion());
        target.getLocalInfo().setLageIconPackageName(source.getLocalInfo().getLargeIconPackageName());
        target.getLocalInfo().setIsOfficial(source.getLocalInfo().isOfficial());
        target.setSensorVideoMessage(source.getRate(), source.getAllFrameCount(), source.getSmallFrameCount(), 0);
    }

    protected String gvn7(Resource resource) throws C1909n {
        return jp0y(resource);
    }

    /* JADX INFO: renamed from: h */
    protected toq m7485h(Resource resource) throws Throwable {
        toq toqVar = new toq();
        File fileM7488l = m7488l(resource);
        if (fileM7488l == null || !fileM7488l.isDirectory()) {
            throw new C1909n(C1909n.k.UNZIP);
        }
        C1906i c1906i = new C1906i(fileM7488l);
        if (c1906i.ld6()) {
            toqVar.f10880k = ni7(c1906i, fileM7488l, resource);
            toqVar.f57906toq = c1906i.m7504s();
            toqVar.f57907zy = c1906i.m7503p();
            toqVar.f10882q = true;
            toqVar.f10881n = c1906i.m7503p() - new File(resource.getDownloadPath()).length();
        } else {
            toqVar.f10880k = fileM7488l;
            toqVar.f57906toq = ch.wvg(resource.getDownloadPath());
            toqVar.f57907zy = new File(resource.getDownloadPath()).length();
        }
        return toqVar;
    }

    /* JADX INFO: renamed from: i */
    protected String m7486i(toq eb, Resource resource) {
        ThemeApplication qVar = C2082k.zy().toq();
        if (!eb.f10882q) {
            return null;
        }
        f10870h++;
        f10871i = (int) (((long) f10871i) + eb.f10881n);
        return String.format(qVar.getString(R.string.resource_delta_update_total), Integer.valueOf(f10870h), ch.f7l8(f10871i));
    }

    protected String jk(Resource resource) throws C1909n {
        return null;
    }

    protected String jp0y(Resource resource) throws Throwable {
        toq toqVarM7485h = m7485h(resource);
        File file = toqVarM7485h.f10880k;
        d2ok(file);
        Resource qVar = toq(file, new Resource(), resource, toqVarM7485h);
        mcp(file, qVar, resource);
        C1821p.ki(file.getAbsolutePath());
        m7487k(qVar, zurt());
        eqxt(file);
        return m7486i(toqVarM7485h, resource);
    }

    /* JADX INFO: renamed from: k */
    protected boolean m7487k(Resource resource, String resourceCode) {
        RelatedResource relatedResource = new RelatedResource();
        relatedResource.setLocalId(resource.getLocalId());
        relatedResource.setResourceCode(resourceCode);
        File file = new File(new C1794q(relatedResource, C1791k.getInstance(this.f10873k.getResourceCode())).toq());
        try {
            file.getParentFile().mkdirs();
            this.f10874n.toq(file, resource);
            return true;
        } catch (C1743g unused) {
            return false;
        }
    }

    protected String ki(String code) {
        String str = this.f10877s.get(code);
        return str == null ? code : str;
    }

    protected List<String> kja0(String code) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(p001b.toq.m5743p(code));
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    protected File m7488l(Resource resource) throws Throwable {
        String str;
        String str2 = new ResourceResolver(resource, this.f10873k).getDownloadFolder() + com.android.thememanager.basemodule.resource.constants.toq.ytul;
        if (resource.getOnlineId() != null) {
            str = str2 + resource.getOnlineId();
        } else {
            str = str2 + ch.mcp(resource.getDownloadPath());
        }
        String strN7h = C1821p.n7h(str);
        try {
            ch.ch(resource.getDownloadPath(), strN7h, new k());
            File file = new File(strN7h);
            ld6(file);
            return file;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    protected List<String> lvui(File folder, String targetFolder, List<String> images, String locale, String prefix, boolean isThumbnail) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (String str : images) {
            if (str.startsWith(String.format(com.android.thememanager.basemodule.resource.constants.toq.upv, locale, prefix))) {
                if (isThumbnail) {
                    File file = new File(folder, str);
                    String name = file.getName();
                    arrayList.add(name);
                    C1821p.m7183g(file, new File(targetFolder + name));
                }
            } else if (str.startsWith(String.format(com.android.thememanager.basemodule.resource.constants.toq.tsz9, locale, prefix))) {
                File file2 = new File(folder, str);
                String name2 = file2.getName();
                arrayList2.add(name2);
                C1821p.m7183g(file2, new File(targetFolder + name2));
            }
        }
        Collections.sort(arrayList);
        Collections.sort(arrayList2);
        if (isThumbnail) {
            arrayList2.addAll(0, arrayList);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: n */
    protected Resource m7489n(File folder, Resource resource, toq eb) {
        String localId = resource.getLocalId();
        if (localId == null) {
            localId = this.f10872g.mo7689k();
        }
        resource.setLocalId(localId);
        resource.setHash(eb.f57906toq);
        resource.getLocalInfo().setSize(eb.f57907zy);
        String str = this.f10875p.get(folder.getAbsolutePath()).get(this.f10873k.getResourceCode());
        if (!TextUtils.isEmpty(str)) {
            String rightsPath = new ResourceResolver(resource, this.f10873k).getRightsPath();
            C1821p.m7191y(rightsPath);
            C1821p.m7183g(new File(str), new File(rightsPath));
        }
        File file = new File(folder, "description.xml");
        if (file.exists()) {
            d3(resource, file);
            file.delete();
        }
        File file2 = new File(folder, com.android.thememanager.basemodule.resource.constants.toq.lvt);
        if (file2.exists()) {
            oc(resource, file2);
            file2.delete();
        }
        File file3 = new File(folder, com.android.thememanager.basemodule.resource.constants.toq.kx);
        if (file3.exists()) {
            file3.delete();
        }
        File file4 = new File(folder, com.android.thememanager.basemodule.resource.constants.toq.xdbo);
        if (file4.exists()) {
            file4.delete();
        }
        dd(folder, new ResourceResolver(resource, this.f10873k).getBuildInImageFolder(), resource, this.f10873k.getBuildInImagePrefixes(), true);
        return resource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0053 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.util.Map<java.lang.String, java.lang.String> n7h(java.io.File r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r6 == 0) goto L5c
            boolean r1 = r6.isDirectory()
            if (r1 == 0) goto L5c
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "rightsDescription"
            r1.<init>(r6, r2)
            boolean r6 = r1.isFile()
            if (r6 == 0) goto L5c
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3b
            java.lang.Object r6 = r2.readObject()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L50
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L50
            r2.close()     // Catch: java.io.IOException -> L2f
            goto L33
        L2f:
            r0 = move-exception
            r0.printStackTrace()
        L33:
            r0 = r6
            goto L4c
        L35:
            r6 = move-exception
            goto L3f
        L37:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L51
        L3b:
            r2 = move-exception
            r4 = r2
            r2 = r6
            r6 = r4
        L3f:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L50
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L48
            goto L4c
        L48:
            r6 = move-exception
            r6.printStackTrace()
        L4c:
            r1.delete()
            goto L5c
        L50:
            r6 = move-exception
        L51:
            if (r2 == 0) goto L5b
            r2.close()     // Catch: java.io.IOException -> L57
            goto L5b
        L57:
            r0 = move-exception
            r0.printStackTrace()
        L5b:
            throw r6
        L5c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.controller.local.C1905h.n7h(java.io.File):java.util.Map");
    }

    public void ncyb(com.android.thememanager.controller.x2 controller) {
        this.f10876q = controller;
    }

    protected File ni7(C1906i manager, File folder, Resource resource) throws C1909n {
        Resource resourceKja0 = C1792n.kja0(resource, this.f10873k.getNewResourceContext());
        if (resourceKja0 != null) {
            resource = resourceKja0;
        }
        if (!manager.f7l8().equals(resource.getHash())) {
            throw new C1909n(C1909n.k.PATCH);
        }
        File file = new File(folder.getParent(), folder.getName() + ".original");
        File file2 = new File(folder.getParent(), folder.getName() + ".updated");
        m7490p(file, resource);
        try {
            try {
                manager.m7502k("description.xml");
                manager.n7h(file, file2);
                return file2;
            } catch (t8r e2) {
                e2.printStackTrace();
                C1821p.ki(file2.getAbsolutePath());
                throw new C1909n(C1909n.k.PATCH);
            }
        } finally {
            C1821p.ki(file.getAbsolutePath());
            C1821p.ki(folder.getAbsolutePath());
        }
    }

    /* JADX INFO: renamed from: p */
    protected void m7490p(File folder, Resource resource) {
        folder.mkdirs();
        List<RelatedResource> subResources = resource.getSubResources();
        if (subResources.size() > 0) {
            for (RelatedResource relatedResource : subResources) {
                File file = new File(new C1794q(relatedResource, C1791k.getInstance(this.f10873k.getResourceCode())).m6956k());
                File file2 = new File(folder, ki(relatedResource.getResourceCode()));
                file2.getParentFile().mkdirs();
                C1821p.m7183g(file, file2);
                ResourceResolver resourceResolver = new ResourceResolver(C1792n.zy(relatedResource, this.f10873k.getNewResourceContext()), this.f10873k);
                m7495y(folder, resourceResolver.getBuildInThumbnailsMap());
                m7495y(folder, resourceResolver.getBuildInPreviewsMap());
            }
        } else {
            File file3 = new File(new ResourceResolver(resource, this.f10873k).getContentPath());
            File file4 = new File(folder, ki(this.f10873k.getResourceCode()));
            file4.getParentFile().mkdirs();
            C1821p.m7183g(file3, file4);
        }
        ResourceResolver resourceResolver2 = new ResourceResolver(resource, this.f10873k);
        m7495y(folder, resourceResolver2.getBuildInThumbnailsMap());
        m7495y(folder, resourceResolver2.getBuildInPreviewsMap());
        m7493s(folder, resource);
    }

    /* JADX INFO: renamed from: q */
    protected Resource m7491q(File folder, File file, Resource parent, String code) {
        Resource resourceZy;
        Resource resource = new Resource();
        resource.getLocalInfo().setScreenRatio(parent.getLocalInfo().getScreenRatio());
        RelatedResource relatedResourceFn3e = fn3e(code, parent.getSubResources());
        if (relatedResourceFn3e != null && (resourceZy = C1792n.zy(relatedResourceFn3e, this.f10873k.getNewResourceContext())) != null) {
            resource = resourceZy;
        }
        if ("largeicons".equals(code)) {
            x9kr(parent, file);
        }
        m7484g(resource, parent);
        String localId = resource.getLocalId();
        if (localId == null) {
            localId = this.f10872g.mo7689k();
        }
        resource.setLocalId(localId);
        resource.setHash(ch.wvg(file.getAbsolutePath()));
        resource.getLocalInfo().setSize(file.length());
        String str = this.f10875p.get(folder.getAbsolutePath()).get(code);
        if (!TextUtils.isEmpty(str)) {
            C1821p.m7183g(new File(str), new File(new ResourceResolver(resource, this.f10873k).getRightsPath()));
        }
        dd(folder, new ResourceResolver(parent, this.f10873k).getBuildInImageFolder(), resource, kja0(code), false);
        if (fn3e(zurt(), resource.getParentResources()) == null) {
            RelatedResource relatedResource = new RelatedResource();
            relatedResource.setLocalId(parent.getLocalId());
            relatedResource.setResourceCode(zurt());
            resource.addParentResources(relatedResource);
        }
        return resource;
    }

    protected Map<String, String> qrj() {
        return p001b.toq.m5742n();
    }

    /* JADX INFO: renamed from: r */
    protected void m7492r(File folder, String targetFolder, Resource resource, List<String> prefixes, Map<String, List<String>> imagesMap) {
        for (String str : imagesMap.keySet()) {
            List<String> list = imagesMap.get(str);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            resource.putBuildInThumbnails(str, arrayList);
            resource.putBuildInPreviews(str, arrayList2);
            for (String str2 : prefixes) {
                arrayList.addAll(lvui(folder, targetFolder, list, str, str2, true));
                arrayList2.addAll(lvui(folder, targetFolder, list, str, str2, false));
            }
        }
    }

    /* JADX INFO: renamed from: s */
    protected void m7493s(File folder, Resource resource) {
        try {
            new File(folder, "description.xml").createNewFile();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: t */
    protected boolean m7494t(File folder, Resource parent) {
        boolean z2;
        loop0: while (true) {
            z2 = true;
            for (String str : this.f10878y.keySet()) {
                File file = new File(folder, str);
                if (file.exists()) {
                    if (!wvg(folder, file, parent, x2(str)) || !z2) {
                        z2 = false;
                    }
                }
            }
        }
        for (File file2 : folder.listFiles()) {
            if (file2.isFile()) {
                z2 = wvg(folder, file2, parent, x2(file2.getName())) && z2;
            }
        }
        return z2;
    }

    protected Map<String, String> t8r() {
        return p001b.toq.m5746y();
    }

    protected boolean wvg(File folder, File file, Resource parent, String code) {
        Resource resourceM7491q = m7491q(folder, file, parent, code);
        RelatedResource relatedResourceFn3e = fn3e(code, parent.getSubResources());
        if (relatedResourceFn3e == null) {
            relatedResourceFn3e = new RelatedResource();
            relatedResourceFn3e.setLocalId(resourceM7491q.getLocalId());
            relatedResourceFn3e.setResourceCode(code);
            relatedResourceFn3e.setLargeIconPackage(parent.getLocalInfo().getLargeIconPackageName());
            parent.addSubResources(relatedResourceFn3e);
        }
        File file2 = new File(new C1794q(relatedResourceFn3e, C1791k.getInstance(this.f10873k.getResourceCode())).m6956k());
        file2.getParentFile().mkdirs();
        file2.delete();
        file.renameTo(file2);
        m7487k(resourceM7491q, code);
        return true;
    }

    protected String x2(String identity) {
        String str = this.f10878y.get(identity);
        return str == null ? identity : str;
    }

    /* JADX INFO: renamed from: y */
    protected void m7495y(File folder, Map<String, List<String>> buildInImagesMap) {
        File file = new File(folder, "preview");
        file.mkdirs();
        Iterator<Map.Entry<String, List<String>>> it = buildInImagesMap.entrySet().iterator();
        while (it.hasNext()) {
            Iterator<String> it2 = it.next().getValue().iterator();
            while (it2.hasNext()) {
                File file2 = new File(it2.next());
                C1821p.m7183g(file2, new File(file, file2.getName()));
            }
        }
    }

    /* JADX INFO: renamed from: z */
    protected String m7496z(Resource resource) throws Throwable {
        toq toqVarM7485h = m7485h(resource);
        File file = toqVarM7485h.f10880k;
        d2ok(file);
        Resource resourceM7489n = m7489n(file, resource, toqVarM7485h);
        f7l8(new ResourceResolver(resourceM7489n, this.f10873k).getContentPath());
        m7494t(file, resourceM7489n);
        C1821p.ki(file.getAbsolutePath());
        this.f10876q.m7690k().mo7473g(resourceM7489n);
        eqxt(file);
        return m7486i(toqVarM7485h, resourceM7489n);
    }

    protected String zurt() {
        return "theme";
    }
}

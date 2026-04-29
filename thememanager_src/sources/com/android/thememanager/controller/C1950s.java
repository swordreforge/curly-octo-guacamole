package com.android.thememanager.controller;

import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.basemodule.local.AbstractC1753q;
import com.android.thememanager.basemodule.local.C1743g;
import com.android.thememanager.basemodule.local.C1751n;
import com.android.thememanager.basemodule.network.theme.model.CommonResponse;
import com.android.thememanager.basemodule.resource.C1791k;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.resource.C1794q;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.RelatedResource;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.lvui;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.controller.local.C1907k;
import com.android.thememanager.controller.online.C1944y;
import com.android.thememanager.controller.online.EnumC1933t;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.controller.online.zurt;
import com.android.thememanager.controller.strategy.AbstractC1951g;
import com.android.thememanager.controller.strategy.C1952k;
import com.android.thememanager.controller.strategy.C1954q;
import com.android.thememanager.controller.strategy.C1956y;
import com.android.thememanager.fu4;
import com.android.thememanager.model.ListParams;
import com.android.thememanager.model.PageItem;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.util.C2755a;
import com.android.thememanager.util.bwp;
import com.android.thememanager.util.cache.C2764k;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.tfm;
import ek5k.C6002g;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import zy.dd;

/* JADX INFO: renamed from: com.android.thememanager.controller.s */
/* JADX INFO: compiled from: MemoryDataManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C1950s extends ld6 implements com.android.thememanager.basemodule.resource.constants.toq, InterfaceC1925p {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    public static final long f57995ab = 3600000;
    protected static final long an = 0;
    public static final long bb = 86400000;
    protected static final long bl = 3600000;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    protected static final String f57996bo = "ResourceDataManager";
    protected static final long bp = 300000;
    protected static final long bv = 300000;

    /* JADX INFO: renamed from: d */
    public static final long f11064d = 0;
    protected static final long id = 3600000;
    protected static final long in = 3600000;

    /* JADX INFO: renamed from: v */
    private static final String f11065v = "_old";

    /* JADX INFO: renamed from: w */
    public static final long f11066w = 300000;

    /* JADX INFO: renamed from: a */
    private AbstractC1753q f11067a;

    /* JADX INFO: renamed from: b */
    private C1954q f11068b;

    /* JADX INFO: renamed from: c */
    private C2764k<String, List<Resource>> f11069c;

    /* JADX INFO: renamed from: e */
    private com.android.thememanager.util.cache.toq f11070e;

    /* JADX INFO: renamed from: f */
    private List<Resource> f11071f;

    /* JADX INFO: renamed from: g */
    protected List<Resource> f11072g;

    /* JADX INFO: renamed from: h */
    private Map<String, Resource> f11073h;

    /* JADX INFO: renamed from: i */
    private Map<String, Resource> f11074i;

    /* JADX INFO: renamed from: j */
    private long f11075j;

    /* JADX INFO: renamed from: l */
    private Set<String> f11076l;

    /* JADX INFO: renamed from: m */
    private C1956y f11077m;

    /* JADX INFO: renamed from: n */
    protected List<Resource> f11078n;

    /* JADX INFO: renamed from: o */
    private AbstractC1951g f11079o;

    /* JADX INFO: renamed from: p */
    private Map<String, Resource> f11080p;

    /* JADX INFO: renamed from: r */
    private Set<String> f11081r;

    /* JADX INFO: renamed from: s */
    protected Map<String, List<a98o.zy<Resource>>> f11082s;

    /* JADX INFO: renamed from: t */
    private final Map<String, Resource> f11083t;

    /* JADX INFO: renamed from: u */
    private com.android.thememanager.controller.online.ld6 f11084u;

    /* JADX INFO: renamed from: x */
    private com.android.thememanager.controller.online.f7l8 f11085x;

    /* JADX INFO: renamed from: y */
    protected List<Resource> f11086y;

    /* JADX INFO: renamed from: z */
    private Map<String, Resource> f11087z;

    /* JADX INFO: renamed from: com.android.thememanager.controller.s$k */
    /* JADX INFO: compiled from: MemoryDataManager.java */
    class k implements Runnable {
        k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1950s.this.m7681o();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.s$toq */
    /* JADX INFO: compiled from: MemoryDataManager.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1950s.this.cdj(false, false);
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.controller.s$zy */
    /* JADX INFO: compiled from: MemoryDataManager.java */
    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1950s.this.cdj(false, true);
        }
    }

    public C1950s(fu4 context) {
        super(context);
        this.f11078n = new ArrayList();
        this.f11072g = new ArrayList();
        this.f11086y = new CopyOnWriteArrayList();
        this.f11082s = new HashMap();
        this.f11080p = new HashMap();
        this.f11073h = new HashMap();
        this.f11074i = new HashMap();
        this.f11087z = new HashMap();
        this.f11083t = new HashMap();
        this.f11081r = new HashSet();
        this.f11076l = new HashSet();
        this.f11071f = new ArrayList();
        this.f11069c = new C2764k<>(5);
        this.f11070e = new com.android.thememanager.util.cache.toq();
        this.f11079o = new C1952k();
        this.f11077m = new C1956y();
        this.f11068b = new C1954q();
        m7684x();
    }

    /* JADX INFO: renamed from: a */
    private String m7673a(Resource resource) {
        Resource resourceKja0 = C1792n.kja0(resource, this.f11062k.getNewResourceContext());
        if (resourceKja0 != null) {
            return resource.getHash() + ":" + resourceKja0.getHash();
        }
        return resource.getHash() + ":" + resource.getHash();
    }

    private List<Resource> bf2(boolean forceRefresh, boolean asyncLinkOnline, boolean forceAll, boolean removeDuplicated) {
        if (forceRefresh || gyi() || zp()) {
            synchronized (this) {
                if (!forceRefresh) {
                    if (gyi() || zp()) {
                    }
                }
                Log.i(f57996bo, "refreshing local resources");
                mo7472v();
                x9kr(removeDuplicated);
                toq();
                if (asyncLinkOnline) {
                    new Thread(new k()).start();
                } else {
                    m7681o();
                }
            }
        }
        return forceAll ? this.f11078n : this.f11086y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void bo() {
        hyr(false);
    }

    /* JADX INFO: renamed from: c */
    private zurt m7674c(List<String> hashs) {
        return this.f11084u.ki(hashs);
    }

    private boolean ch(List<RelatedResource> relatedResources) {
        Iterator<RelatedResource> it = relatedResources.iterator();
        while (it.hasNext()) {
            C1794q c1794q = new C1794q(it.next(), C1791k.getInstance(this.f11062k.getResourceCode()));
            String qVar = c1794q.toq();
            if (!TextUtils.isEmpty(qVar) && new File(qVar).exists()) {
                String strM6956k = c1794q.m6956k();
                if (TextUtils.isEmpty(strM6956k) || new File(strM6956k).exists()) {
                }
            }
            return false;
        }
        return true;
    }

    /* JADX INFO: renamed from: d */
    private boolean m7675d(Resource resource) {
        fu4 fu4VarM10535g = this.f11062k;
        if (!resource.getParentResources().isEmpty()) {
            RelatedResource relatedResource = resource.getParentResources().get(0);
            C1794q c1794q = new C1794q(relatedResource, C1791k.getInstance(this.f11062k.getResourceCode()));
            try {
                fu4VarM10535g = C2082k.zy().m8001n().m10535g(relatedResource.getResourceCode());
                resource = ((C1751n) mo7672b(fu4VarM10535g)).m6853q(new File(c1794q.toq()));
            } catch (C1743g e2) {
                e2.printStackTrace();
            }
        }
        ResourceResolver resourceResolver = new ResourceResolver(resource, fu4VarM10535g);
        String metaPath = resourceResolver.getMetaPath();
        boolean z2 = TextUtils.isEmpty(metaPath) || !new File(metaPath).exists() || new File(metaPath).delete();
        String contentPath = resourceResolver.getContentPath();
        if (!TextUtils.isEmpty(contentPath) && new File(contentPath).exists()) {
            z2 = new File(contentPath).delete() && z2;
        }
        if (!fu4VarM10535g.isSelfDescribing()) {
            String buildInImageFolder = resourceResolver.getBuildInImageFolder();
            if (!TextUtils.isEmpty(buildInImageFolder) && new File(buildInImageFolder).exists()) {
                z2 = C1821p.ki(buildInImageFolder) && z2;
            }
            Iterator<RelatedResource> it = resource.getSubResources().iterator();
            while (it.hasNext()) {
                C1794q c1794q2 = new C1794q(it.next(), C1791k.getInstance(fu4VarM10535g.getResourceCode()));
                String qVar = c1794q2.toq();
                if (!TextUtils.isEmpty(qVar) && new File(qVar).exists()) {
                    z2 = new File(qVar).delete() && z2;
                }
                String strM6956k = c1794q2.m6956k();
                if (!TextUtils.isEmpty(strM6956k) && new File(strM6956k).exists()) {
                    z2 = new File(strM6956k).delete() && z2;
                }
            }
        }
        return z2;
    }

    private void dd() {
        x9kr(true);
    }

    private boolean dr(String path, long invalidTime) {
        return System.currentTimeMillis() - new File(path).lastModified() > invalidTime || bf2.toq.m5812n();
    }

    /* JADX INFO: renamed from: e */
    private zurt m7676e(String id2) {
        return this.f11084u.mcp(id2);
    }

    private List<String> ek5k() {
        return new ArrayList(this.f11083t.keySet());
    }

    /* JADX INFO: renamed from: f */
    private String m7677f(List<String> hashs) {
        StringBuilder sb = new StringBuilder();
        Iterator<String> it = hashs.iterator();
        while (it.hasNext()) {
            sb.append(it.next());
            sb.append(",");
        }
        return this.f11062k.getAssociationCacheFolder() + ch.gvn7(sb.substring(0, sb.length() - 1));
    }

    private synchronized void fnq8(Resource newResource, String id2) {
        if (newResource != null) {
            if (!TextUtils.isEmpty(newResource.getOnlineId())) {
                Resource resource = this.f11073h.get(id2);
                if (resource == null) {
                    this.f11072g.add(newResource);
                    dd();
                } else {
                    resource.mergeOnlineProperties(newResource);
                }
                Resource resource2 = this.f11074i.get(id2);
                if (resource2 != null) {
                    resource2.mergeOnlineProperties(newResource);
                }
            }
        }
    }

    private boolean gyi() {
        if (this.f11075j < com.android.thememanager.controller.online.ld6.bo()) {
            return true;
        }
        boolean z2 = false;
        Iterator<String> it = this.f11062k.getSourceFolders().iterator();
        while (it.hasNext()) {
            String strM9678o = ch.m9678o(it.next());
            if (new File(strM9678o).exists() && this.f11070e.m9659q(strM9678o)) {
                z2 = true;
            }
        }
        return z2;
    }

    private zurt hb(ListParams params) {
        zurt listUrl = params.getListUrl();
        if (listUrl == null) {
            return null;
        }
        zurt zurtVarM28252clone = listUrl.m28252clone();
        zurtVarM28252clone.addParameter("page", String.valueOf(params.getPage()));
        com.android.thememanager.controller.online.ld6.m7572n(zurtVarM28252clone);
        return zurtVarM28252clone;
    }

    private void hyr(boolean forceRefresh) {
        List<String> listEk5k = ek5k();
        if (listEk5k.isEmpty()) {
            return;
        }
        zurt zurtVarUv6 = uv6(listEk5k, this.f11062k.getResourceStamp().equals(InterfaceC1789q.q68) ? g1.m9749m() : "");
        String strLrht = lrht(listEk5k);
        if ((forceRefresh || dr(strLrht, 3600000L)) && ikck(zurtVarUv6, strLrht)) {
            g1.f7l8();
        }
        Map<String, Resource> mapQkj8 = qkj8(strLrht);
        if (mapQkj8 != null) {
            Log.i(f57996bo, "checking updatable resources");
            synchronized (this) {
                this.f11081r.clear();
                this.f11076l.clear();
                for (Map.Entry<String, Resource> entry : mapQkj8.entrySet()) {
                    if (this.f11083t.get(entry.getKey()) != null) {
                        String onlineId = entry.getValue().getOnlineId();
                        this.f11076l.add(onlineId);
                        Resource resource = this.f11074i.get(onlineId);
                        if (resource != null) {
                            this.f11081r.add(resource.getLocalId());
                        }
                    }
                }
            }
            toq();
        }
    }

    private boolean ikck(zurt url, String path) {
        return new com.android.thememanager.controller.online.toq(url.getUrlId()).toq(url, path);
    }

    /* JADX INFO: renamed from: j */
    private void m7678j(List<String> list, boolean isThumbnails) {
        if (list == null) {
            return;
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            String str = list.get(i2);
            String strM10007q = tfm.m10007q(tfm.m10009y(str), str, isThumbnails);
            if (!TextUtils.isEmpty(strM10007q)) {
                list.set(i2, strM10007q);
            }
        }
    }

    /* JADX INFO: renamed from: l */
    private void m7679l(boolean forceRefresh) {
        List<String> listM7680m = m7680m();
        if (listM7680m.isEmpty()) {
            return;
        }
        zurt zurtVarM7674c = m7674c(listM7680m);
        String strM7677f = m7677f(listM7680m);
        if (forceRefresh || dr(strM7677f, 0L)) {
            ikck(zurtVarM7674c, strM7677f);
        }
        Map<String, Resource> mapVq = vq(strM7677f);
        if (mapVq != null) {
            Log.i(f57996bo, "checking associable resources");
            boolean z2 = false;
            ArrayList arrayList = new ArrayList();
            for (Map.Entry<String, Resource> entry : mapVq.entrySet()) {
                Resource resource = this.f11083t.get(entry.getKey());
                if (resource != null) {
                    resource.setOnlineId(entry.getValue().getOnlineId());
                    arrayList.add(resource);
                    z2 = true;
                }
            }
            if (z2) {
                eqxt(arrayList);
                synchronized (this) {
                    dd();
                }
                toq();
            }
        }
    }

    private String lrht(List<String> hashs) {
        return this.f11062k.getVersionCacheFolder() + "version";
    }

    /* JADX INFO: renamed from: m */
    private List<String> m7680m() {
        ArrayList arrayList = new ArrayList();
        synchronized (this.f11083t) {
            for (String str : this.f11083t.keySet()) {
                Resource resource = this.f11083t.get(str);
                if (resource != null && resource.getOnlineId() == null) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    private void mu(File file, Resource resource) throws C1743g {
        this.f11067a.toq(file, resource);
    }

    private void n5r1() {
        if (y9n.m7250l()) {
            C6002g.x2().execute(new Runnable() { // from class: com.android.thememanager.controller.y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11097k.bo();
                }
            });
        } else {
            hyr(false);
        }
    }

    private void ncyb() {
        if (y9n.m7250l()) {
            C6002g.x2().execute(new Runnable() { // from class: com.android.thememanager.controller.f7l8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10845k.m7683u();
                }
            });
        } else {
            m7679l(false);
        }
    }

    private boolean nmn5(Resource resource) {
        return System.currentTimeMillis() - resource.getModifiedTime() <= 3600000;
    }

    private String nn86(zurt url) {
        return this.f11062k.getListCacheFolder() + ch.gvn7(url.getUrlId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public void m7681o() {
        if (!this.f11062k.isSelfDescribing() || this.f11062k.isVersionSupported()) {
            HashMap map = new HashMap();
            synchronized (this) {
                for (Resource resource : this.f11078n) {
                    String metaPath = new ResourceResolver(resource, this.f11062k).getMetaPath();
                    if (!ch.vyq(metaPath) && !ch.n5r1(metaPath)) {
                        map.put(m7673a(resource), resource);
                    }
                }
            }
            synchronized (this.f11083t) {
                this.f11083t.clear();
                this.f11083t.putAll(map);
            }
            map.clear();
            if (!this.f11062k.isSelfDescribing()) {
                ncyb();
            }
            if (this.f11062k.isVersionSupported()) {
                n5r1();
            }
        }
    }

    private Map<String, Resource> qkj8(String path) {
        return this.f11085x.x2(path);
    }

    private synchronized void qo(Resource newResource) {
        if (newResource != null) {
            if (newResource.isLike() != null) {
                if (newResource.isLike().booleanValue()) {
                    EnumC1933t.LIKE.add(newResource.getOnlineId());
                }
            }
        }
    }

    private synchronized void tfm(String path, ListParams params) {
        Log.i(f57996bo, "refreshing online resources");
        List<a98o.zy<Resource>> arrayList = this.f11082s.get(params.getListUrl().getUrlId());
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f11082s.put(params.getListUrl().getUrlId(), arrayList);
        }
        if (arrayList.size() <= params.getPage()) {
            for (int size = arrayList.size(); size <= params.getPage(); size++) {
                arrayList.add(new a98o.zy<>());
            }
        }
        arrayList.get(params.getPage());
        a98o.zy<Resource> zyVarLd6 = this.f11085x.ld6(path);
        arrayList.set(params.getPage(), zyVarLd6);
        if (zyVarLd6 != null) {
            for (int i2 = 0; i2 < zyVarLd6.size(); i2++) {
                Resource resource = zyVarLd6.get(i2);
                Resource resource2 = this.f11073h.get(resource.getOnlineId());
                if (resource2 != null) {
                    resource2.mergeOnlineProperties(resource);
                    zyVarLd6.set(i2, resource2);
                } else {
                    this.f11072g.add(resource);
                }
            }
        }
        dd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m7683u() {
        m7679l(false);
    }

    private zurt uv6(List<String> hashs, String curComponentOnlineIdsJson) {
        return this.f11084u.zurt(hashs, curComponentOnlineIdsJson);
    }

    private Map<String, Resource> vq(String path) {
        return this.f11085x.f7l8(path);
    }

    private String vyq(String id2) {
        return this.f11062k.getDetailCacheFolder() + id2;
    }

    private void x9kr(boolean removeDuplicated) {
        Log.i(f57996bo, "building index");
        this.f11080p.clear();
        this.f11074i.clear();
        ArrayList arrayList = new ArrayList();
        for (Resource resource : this.f11078n) {
            this.f11080p.put(resource.getLocalId(), resource);
            String onlineId = resource.getOnlineId();
            if (onlineId != null) {
                Resource resource2 = this.f11074i.get(onlineId);
                if (resource2 == null) {
                    this.f11074i.put(onlineId, resource);
                } else if (resource2.getModifiedTime() < resource.getModifiedTime()) {
                    this.f11074i.put(onlineId, resource);
                    arrayList.add(resource2);
                    Log.i(f57996bo, resource2.getLocalId() + " is duplicated with " + resource.getLocalId());
                } else {
                    arrayList.add(resource);
                    Log.i(f57996bo, resource.getLocalId() + " is duplicated with " + resource2.getLocalId());
                }
            }
        }
        if (removeDuplicated) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                fti((Resource) it.next());
            }
        }
        this.f11073h.clear();
        this.f11087z.clear();
        for (Resource resource3 : this.f11072g) {
            this.f11073h.put(resource3.getOnlineId(), resource3);
            Resource resource4 = this.f11074i.get(resource3.getOnlineId());
            if (resource4 != null) {
                resource3.mergeLocalProperties(resource4);
                this.f11087z.put(resource4.getLocalId(), resource3);
            } else {
                resource3.clearLocalProperties();
            }
        }
        this.f11069c.clear();
    }

    private boolean zp() {
        Iterator it = new ArrayList(this.f11071f).iterator();
        while (it.hasNext()) {
            if (t8iq((Resource) it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.android.thememanager.controller.ld6
    public void a9(zurt url) {
        String strYz = yz(url);
        if (strYz != null) {
            File file = new File(strYz);
            if (file.exists()) {
                file.delete();
            }
        }
    }

    protected com.android.thememanager.controller.online.ld6 a98o() {
        return new com.android.thememanager.controller.online.ld6(this.f11062k);
    }

    /* JADX INFO: renamed from: b */
    protected AbstractC1753q mo7672b(fu4 resContext) {
        return resContext.isSelfDescribing() ? new com.android.thememanager.controller.local.f7l8(resContext) : new C1751n(resContext.getNewResourceContext());
    }

    protected Resource c8jq(File file) throws C1743g {
        Resource resourceMo6852k = this.f11067a.mo6852k(file);
        if (resourceMo6852k == null) {
            return null;
        }
        String contentPath = new ResourceResolver(resourceMo6852k, this.f11062k).getContentPath();
        if (!TextUtils.isEmpty(contentPath)) {
            File file2 = new File(contentPath);
            if (file2.exists()) {
                resourceMo6852k.setModifiedTime(file2.lastModified());
            }
            if (ch.hyr(resourceMo6852k.getLocalId())) {
                resourceMo6852k.setModifiedTime(Long.MAX_VALUE);
            }
        }
        List<String> qVar = new C1907k().toq(file, resourceMo6852k);
        if (qVar.size() > 0) {
            resourceMo6852k.setBuildInThumbnails(qVar);
            resourceMo6852k.setBuildInPreviews(qVar);
            Map<String, List<String>> buildInThumbnailsMap = resourceMo6852k.getBuildInThumbnailsMap();
            buildInThumbnailsMap.put("fallback", qVar);
            resourceMo6852k.setBuildInPreviewsMap(buildInThumbnailsMap);
        }
        return resourceMo6852k;
    }

    @Override // com.android.thememanager.controller.ld6
    public List<Resource> cdj(boolean forceRefresh, boolean asyncLinkOnline) {
        return ki(forceRefresh, asyncLinkOnline, false);
    }

    @Override // com.android.thememanager.controller.ld6
    public void d3(List<Resource> localResources) {
        Resource resourceT8r;
        if (localResources == null || localResources.isEmpty()) {
            return;
        }
        HashMap map = new HashMap();
        for (Resource resource : localResources) {
            if (TextUtils.isEmpty(resource.getOnlineId())) {
                map.put(m7673a(resource), resource);
            }
        }
        if (!map.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = map.keySet().iterator();
            while (it.hasNext()) {
                arrayList.add((String) it.next());
            }
            zurt zurtVarM7674c = m7674c(arrayList);
            String strM7677f = m7677f(arrayList);
            ikck(zurtVarM7674c, strM7677f);
            Map<String, Resource> mapVq = vq(strM7677f);
            if (mapVq != null && !mapVq.isEmpty()) {
                for (Map.Entry<String, Resource> entry : mapVq.entrySet()) {
                    Resource resource2 = (Resource) map.get(entry.getKey());
                    if (resource2 != null) {
                        resource2.setOnlineId(entry.getValue().getOnlineId());
                    }
                }
            }
        }
        for (Resource resource3 : localResources) {
            String onlineId = resource3.getOnlineId();
            if (!TextUtils.isEmpty(onlineId) && (resourceT8r = t8r(onlineId)) != null) {
                resource3.mergeOnlineProperties(resourceT8r);
            }
        }
    }

    @dd
    public Resource d8wk(Resource newResource, String id2, boolean asyncLoadLocalResource) {
        Resource resource;
        fnq8(newResource, id2);
        qo(newResource);
        Resource resource2 = this.f11073h.get(id2);
        if (resource2 != null && resource2.getLocalId() == null && resource2.getOnlineId() != null && (resource = this.f11074i.get(resource2.getOnlineId())) != null) {
            resource2.mergeLocalProperties(resource);
        }
        toq();
        if (asyncLoadLocalResource) {
            C6002g.m22240g(new zy());
        } else {
            cdj(false, true);
        }
        return resource2;
    }

    @Override // com.android.thememanager.controller.ld6
    public boolean eqxt(List<Resource> resources) {
        Log.i(f57996bo, "updating local resources");
        boolean z2 = true;
        for (Resource resource : resources) {
            try {
                mu(new File(new ResourceResolver(resource, this.f11062k).getMetaPath()), resource);
            } catch (C1743g unused) {
                z2 = false;
            }
        }
        bf2(false, true, false, false);
        return z2;
    }

    @Override // com.android.thememanager.controller.ld6
    public boolean f7l8(List<Resource> resources) {
        Log.i(f57996bo, "creating local resources");
        boolean z2 = true;
        for (Resource resource : resources) {
            File file = new File(new ResourceResolver(resource, this.f11062k).getMetaPath());
            try {
                file.getParentFile().mkdirs();
                mu(file, resource);
            } catch (C1743g unused) {
                z2 = false;
            }
            String localId = resource.getLocalId();
            if (localId != null) {
                this.f11081r.remove(localId);
                Resource resource2 = this.f11080p.get(localId);
                if (resource2 != null) {
                    resource2.mergeLocalProperties(resource);
                }
            }
            String onlineId = resource.getOnlineId();
            if (onlineId != null) {
                Resource resource3 = this.f11073h.get(onlineId);
                if (resource3 != null) {
                    resource3.mergeLocalProperties(resource);
                }
                this.f11076l.remove(onlineId);
            }
        }
        return z2;
    }

    @Override // com.android.thememanager.controller.ld6
    public a98o.zy<Resource> fn3e(ListParams params) {
        return zurt(params, false);
    }

    @Override // com.android.thememanager.controller.ld6
    public boolean fti(Resource resource) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(resource);
        return jp0y(arrayList);
    }

    @Override // com.android.thememanager.controller.ld6
    public a98o.zy<Resource> fu4(zurt url) {
        String str = this.f11062k.getListCacheFolder() + ch.gvn7(url.getUrlId());
        if (dr(str, 300000L)) {
            com.android.thememanager.controller.online.ld6.m7572n(url);
            ikck(url, str);
        }
        return this.f11085x.ld6(str);
    }

    @Override // com.android.thememanager.controller.ld6
    /* JADX INFO: renamed from: g */
    public boolean mo7473g(Resource resource) {
        return f7l8(Collections.singletonList(resource));
    }

    @Override // com.android.thememanager.controller.ld6
    public void gvn7(Resource localResource) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(localResource);
        d3(arrayList);
    }

    @Override // com.android.thememanager.controller.ld6
    /* JADX INFO: renamed from: h */
    public List<Resource> mo7474h(boolean forceRefresh) {
        return cdj(forceRefresh, true);
    }

    @Override // com.android.thememanager.controller.ld6
    /* JADX INFO: renamed from: i */
    public Resource mo7475i(String id2, boolean forceRefresh) {
        zurt zurtVarM7676e = m7676e(id2);
        String strVyq = vyq(id2);
        if (forceRefresh || dr(strVyq, 300000L)) {
            ikck(zurtVarM7676e, strVyq);
        }
        return wo(this.f11085x.m7542p(strVyq), id2);
    }

    protected com.android.thememanager.controller.online.f7l8 i1() {
        return new C1944y(this.f11062k);
    }

    @Override // com.android.thememanager.controller.ld6
    public boolean jk(Resource resource) {
        return (wvg(resource) & 2) != 0;
    }

    @Override // com.android.thememanager.controller.ld6
    public boolean jp0y(List<Resource> resources) {
        Log.i(f57996bo, "deleting local resources");
        boolean z2 = true;
        for (Resource resource : resources) {
            boolean zM7675d = m7675d(resource);
            String localId = resource.getLocalId();
            Resource resource2 = this.f11080p.get(localId);
            if (resource2 != null) {
                synchronized (this) {
                    this.f11078n.remove(resource2);
                    this.f11086y.remove(resource2);
                }
            }
            if (localId != null) {
                this.f11081r.remove(localId);
            }
            String onlineId = resource.getOnlineId();
            if (onlineId != null) {
                this.f11076l.remove(onlineId);
            }
            Resource resource3 = this.f11087z.get(localId);
            if (resource3 != null) {
                resource3.clearLocalProperties();
            }
            z2 = zM7675d;
        }
        bf2(false, true, false, false);
        return z2;
    }

    @Override // com.android.thememanager.controller.ld6
    public List<Resource> ki(boolean forceRefresh, boolean asyncLinkOnline, boolean forceAll) {
        return bf2(forceRefresh, asyncLinkOnline, forceAll, true);
    }

    @Override // com.android.thememanager.controller.ld6
    public List<Resource> kja0() {
        return mo7474h(false);
    }

    @Override // com.android.thememanager.controller.ld6
    @dd
    public Resource ld6() {
        mo7474h(false);
        String strT8r = p001b.toq.t8r(this.f11062k.getResourceCode());
        for (Resource resource : this.f11080p.values()) {
            if (strT8r.equals(resource.getMetaPath())) {
                return resource;
            }
        }
        return null;
    }

    protected boolean lv5(Resource resource) {
        return true;
    }

    @Override // com.android.thememanager.controller.ld6
    public boolean mcp(Resource resource) {
        return (wvg(resource) & 4) != 0;
    }

    @Override // com.android.thememanager.controller.AbstractC1949q
    /* JADX INFO: renamed from: n */
    public void mo7670n(fu4 context) {
        super.mo7670n(context);
        m7684x();
    }

    @Override // com.android.thememanager.controller.ld6
    public Resource n7h(String onlineId) {
        mo7474h(false);
        return this.f11074i.get(onlineId);
    }

    @Override // com.android.thememanager.controller.ld6
    public a98o.zy<Resource> ni7(ListParams params, boolean forceRefresh, boolean asyncLinkLocal) {
        zurt zurtVarHb = hb(params);
        String strNn86 = nn86(zurtVarHb);
        if (params.getPage() != 0 || forceRefresh || dr(strNn86, 300000L)) {
            boolean zIkck = ikck(zurtVarHb, strNn86);
            if (forceRefresh && !zIkck) {
                return null;
            }
        }
        tfm(strNn86, params);
        a98o.zy<Resource> zyVar = this.f11082s.get(params.getListUrl().getUrlId()).get(params.getPage());
        toq();
        if (asyncLinkLocal) {
            new Thread(new toq()).start();
        } else {
            cdj(false, false);
        }
        return zyVar;
    }

    @Override // com.android.thememanager.controller.ld6
    public List<PageItem> o1t(zurt url, boolean forceRefresh) {
        String str = this.f11062k.getPageCacheFolder() + ch.gvn7(url.getUrlId());
        if (forceRefresh || dr(str, 3600000L)) {
            com.android.thememanager.controller.online.ld6.m7572n(url);
            ikck(url, str);
        }
        return this.f11085x.m7544s(str);
    }

    @Override // com.android.thememanager.controller.ld6
    public boolean oc(Resource resource) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(resource);
        return eqxt(arrayList);
    }

    @Override // com.android.thememanager.controller.ld6
    /* JADX INFO: renamed from: p */
    public <T> CommonResponse<T> mo7476p(zurt url, boolean forceRefresh, Class<T> pageClass) {
        String strYz = yz(url);
        if (forceRefresh || dr(strYz, 300000L)) {
            com.android.thememanager.controller.online.ld6.m7572n(url);
            ikck(url, strYz);
        }
        return this.f11085x.m7545y(strYz, pageClass);
    }

    @Override // com.android.thememanager.controller.ld6
    public Resource qrj(String id2) {
        mo7474h(false);
        return this.f11080p.get(id2);
    }

    @Override // com.android.thememanager.controller.ld6
    /* JADX INFO: renamed from: s */
    public <T> CommonResponse<T> mo7477s(zurt url, Class<T> pageClass) {
        return mo7476p(url, false, pageClass);
    }

    @Override // com.android.thememanager.controller.ld6
    /* JADX INFO: renamed from: t */
    public boolean mo7478t(Resource resource) {
        return (wvg(resource) & 1) != 0;
    }

    protected boolean t8iq(Resource resource) {
        if (resource == null) {
            return false;
        }
        ResourceResolver resourceResolver = new ResourceResolver(resource, this.f11062k);
        String metaPath = resourceResolver.getMetaPath();
        if (!TextUtils.isEmpty(metaPath) && new File(metaPath).exists()) {
            String contentPath = resourceResolver.getContentPath();
            return !TextUtils.isEmpty(contentPath) && new File(contentPath).exists() && ch(resource.getSubResources()) && ch(resource.getParentResources());
        }
        return false;
    }

    @Override // com.android.thememanager.controller.ld6
    public Resource t8r(String id2) {
        return mo7475i(id2, false);
    }

    /* JADX INFO: renamed from: v */
    protected void mo7472v() {
        this.f11078n.clear();
        this.f11086y.clear();
        this.f11071f.clear();
        Iterator<String> it = this.f11062k.getSourceFolders().iterator();
        while (it.hasNext()) {
            String strM9678o = ch.m9678o(it.next());
            this.f11086y.addAll(y2(strM9678o));
            this.f11070e.zy(strM9678o);
        }
        this.f11075j = System.currentTimeMillis();
    }

    @dd
    public Resource wo(Resource newResource, String id2) {
        return d8wk(newResource, id2, false);
    }

    @Override // com.android.thememanager.controller.ld6
    public int wvg(Resource resource) {
        Resource resource2;
        Resource resource3;
        String localId = resource.getLocalId();
        String onlineId = resource.getOnlineId();
        int i2 = 1;
        if (localId == null) {
            if (onlineId == null || (resource3 = this.f11074i.get(onlineId)) == null) {
                i2 = 0;
            } else {
                resource.mergeLocalProperties(resource3);
            }
        }
        if (onlineId != null) {
            i2 |= 2;
        } else if (localId != null && (resource2 = this.f11087z.get(localId)) != null) {
            resource.mergeOnlineProperties(resource2);
            i2 |= 2;
        }
        return ((localId == null || !this.f11081r.contains(localId)) && (onlineId == null || !this.f11076l.contains(onlineId))) ? i2 : i2 | 4;
    }

    /* JADX INFO: renamed from: x */
    protected void m7684x() {
        this.f11067a = y9n();
        this.f11085x = i1();
        this.f11084u = a98o();
    }

    @Override // com.android.thememanager.controller.ld6
    public int x2() {
        return this.f11081r.size();
    }

    protected boolean xwq3(Resource r2) {
        if (!com.android.thememanager.util.toq.f7l8()) {
            return false;
        }
        String localId = r2.getLocalId();
        List<RelatedResource> parentResources = r2.getParentResources();
        if (parentResources != null && !parentResources.isEmpty()) {
            localId = parentResources.get(0).getLocalId();
        }
        return com.android.thememanager.basemodule.resource.n7h.f10223k.equals(localId) || com.android.thememanager.basemodule.resource.n7h.f57692zy.equals(localId) || com.android.thememanager.basemodule.resource.n7h.f57690toq.equals(localId) || com.android.thememanager.basemodule.resource.n7h.f10226q.equals(localId) || com.android.thememanager.basemodule.resource.n7h.f10224n.equals(localId) || com.android.thememanager.basemodule.resource.n7h.f57685f7l8.equals(localId) || com.android.thememanager.basemodule.resource.n7h.f10221g.equals(localId) || com.android.thememanager.basemodule.resource.n7h.f10228y.equals(localId) || (com.android.thememanager.controller.local.kja0.n7h().booleanValue() && com.android.thememanager.controller.local.kja0.f7l8().contains(localId));
    }

    @Override // com.android.thememanager.controller.ld6
    /* JADX INFO: renamed from: y */
    public List<Resource> mo7479y(String keyword) {
        mo7474h(false);
        List<Resource> list = this.f11069c.get(keyword);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            for (Resource resource : this.f11078n) {
                if (this.f11079o.mo7686k(keyword, resource)) {
                    arrayList.add(resource);
                }
            }
        }
        List<Resource> listMo7685k = this.f11068b.mo7685k(arrayList);
        this.f11069c.put(keyword, listMo7685k);
        return listMo7685k;
    }

    @zy.y9n
    protected List<Resource> y2(String dataFolder) {
        ArrayList arrayList = new ArrayList();
        if ((lvui.o1t(bf2.toq.toq()) || !lvui.wvg()) && !ch.vyq(dataFolder)) {
            Log.d(f57996bo, "loadLocalResources: no storage permissions ");
            return arrayList;
        }
        File file = new File(dataFolder);
        if (!file.exists() || !file.isDirectory()) {
            return arrayList;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            Log.e(C2755a.f16307g, "Load resource in wrong folder path: " + file.getAbsolutePath());
            return arrayList;
        }
        for (File file2 : fileArrListFiles) {
            try {
                Resource resourceC8jq = c8jq(file2);
                if (resourceC8jq != null && !xwq3(resourceC8jq)) {
                    if (t8iq(resourceC8jq)) {
                        this.f11078n.add(resourceC8jq);
                        if (lv5(resourceC8jq)) {
                            arrayList.add(resourceC8jq);
                        }
                        if (g1.m9739c(this.f11062k.getResourceCode(), resourceC8jq.getMetaPath())) {
                            com.android.thememanager.basemodule.utils.fu4.m7068n(resourceC8jq);
                            if (!C1807g.zurt() || !TextUtils.equals(this.f11062k.getResourceCode(), "theme")) {
                                m7678j(resourceC8jq.getBuildInPreviews(), false);
                            }
                            m7678j(resourceC8jq.getBuildInThumbnails(), true);
                        }
                    } else if (nmn5(resourceC8jq)) {
                        this.f11071f.add(resourceC8jq);
                    }
                }
            } catch (C1743g unused) {
                file2.delete();
            }
        }
        if (bwp.ni7(this.f11062k.getResourceCode()) && arrayList.size() > 0 && ch.vyq(new ResourceResolver((Resource) arrayList.get(0), this.f11062k).getMetaPath())) {
            List<Resource> listMo7685k = this.f11077m.mo7685k(arrayList);
            this.f11077m.mo7685k(this.f11078n);
            return listMo7685k;
        }
        List<Resource> listMo7685k2 = this.f11068b.mo7685k(arrayList);
        this.f11068b.mo7685k(this.f11078n);
        return listMo7685k2;
    }

    protected AbstractC1753q y9n() {
        return mo7672b(this.f11062k);
    }

    public String yz(zurt url) {
        return this.f11062k.getPageCacheFolder() + ch.gvn7(url.getUrlId());
    }

    @Override // com.android.thememanager.controller.ld6
    /* JADX INFO: renamed from: z */
    public List<PageItem> mo7480z(zurt url) {
        return o1t(url, false);
    }

    @Override // com.android.thememanager.controller.ld6
    public a98o.zy<Resource> zurt(ListParams params, boolean forceRefresh) {
        return ni7(params, forceRefresh, false);
    }
}

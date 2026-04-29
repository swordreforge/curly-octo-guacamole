package a98o;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: a98o.k */
/* JADX INFO: compiled from: DataGroup.java */
/* JADX INFO: loaded from: classes.dex */
public class C0004k<T> extends ArrayList<T> {
    private static final long serialVersionUID = 1;
    private Map<String, Object> extraMeta = new HashMap();
    private String id;
    private int page;
    private boolean reachBottom;
    private boolean reachTop;
    private String title;

    public Map<String, Object> getExtraMeta() {
        return this.extraMeta;
    }

    public String getId() {
        return this.id;
    }

    public int getPage() {
        return this.page;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isReachBottom() {
        return this.reachBottom;
    }

    public boolean isReachTop() {
        return this.reachTop;
    }

    public void putExtraMeta(String key, Object value) {
        this.extraMeta.put(key, value);
    }

    public void setExtraMeta(Map<String, Object> extraMeta) {
        this.extraMeta = extraMeta;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public void setReachBottom(boolean reachBottom) {
        this.reachBottom = reachBottom;
    }

    public void setReachTop(boolean reachTop) {
        this.reachTop = reachTop;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Object getExtraMeta(String key) {
        return this.extraMeta.get(key);
    }
}

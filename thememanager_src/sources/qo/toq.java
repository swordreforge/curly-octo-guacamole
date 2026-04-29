package qo;

import java.io.Serializable;
import java.util.List;

/* JADX INFO: compiled from: UserActionModel.java */
/* JADX INFO: loaded from: classes2.dex */
public class toq implements Serializable {
    private static final long serialVersionUID = 1;
    public List<C7619k> userActions;

    /* JADX INFO: renamed from: qo.toq$k */
    /* JADX INFO: compiled from: UserActionModel.java */
    public static class C7619k implements Serializable {
        public static final String ACTION = "_action";
        public static final String CONTENT = "_content";
        public static final String GUID = "_guid";
        public static final String ID = "_id";
        public static final String MODULE_ID = "_moduleId";
        private static final long serialVersionUID = 1;
        public String action;
        public String content;
        public String guid;
        public String moduleId;

        public C7619k(String action, String content, String guid, String moduleId) {
            this.action = action;
            this.content = content;
            this.guid = guid;
            this.moduleId = moduleId;
        }
    }

    public toq(List<C7619k> userActions) {
        this.userActions = userActions;
    }
}

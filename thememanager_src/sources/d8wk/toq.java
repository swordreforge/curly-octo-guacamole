package d8wk;

import java.io.Serializable;

/* JADX INFO: compiled from: ToutiaoNewsInfoRequestDomain.java */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class toq implements Serializable {
    private static final long serialVersionUID = 1;
    public int ImgNum;
    public String Pid;
    public String Reqid;
    public String Resolution;
    public String Uid;
    public String UidType;

    public toq(String pid, String uid, String reqid, String resolution, String uidType, int imgNum) {
        this.Pid = pid;
        this.Uid = uid;
        this.Reqid = reqid;
        this.Resolution = resolution;
        this.UidType = uidType;
        this.ImgNum = imgNum;
    }
}

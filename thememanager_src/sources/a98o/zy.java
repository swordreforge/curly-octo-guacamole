package a98o;

import java.util.ArrayList;

/* JADX INFO: compiled from: PagingList.java */
/* JADX INFO: loaded from: classes.dex */
public class zy<T> extends ArrayList<T> {
    private static final long serialVersionUID = 1;
    private boolean first;
    private boolean last;

    public boolean isFirst() {
        return this.first;
    }

    public boolean isLast() {
        return this.last;
    }

    public void setFirst(boolean first) {
        this.first = first;
    }

    public void setLast(boolean last) {
        this.last = last;
    }
}

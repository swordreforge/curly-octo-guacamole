package miuix.animation.utils;

import miuix.animation.utils.LinkNode;

/* JADX INFO: loaded from: classes3.dex */
public class LinkNode<T extends LinkNode> {
    public T next;

    public void addToTail(T t2) {
        T t3 = this;
        while (t3 != t2) {
            T t4 = t3.next;
            if (t4 == null) {
                t3.next = t2;
                return;
            }
            t3 = t4;
        }
    }

    public T destroy() {
        while (remove() != null) {
        }
        return null;
    }

    public T remove() {
        T t2 = this.next;
        this.next = null;
        return t2;
    }

    public int size() {
        int i2 = 0;
        LinkNode<T> linkNode = this;
        while (true) {
            linkNode = linkNode.next;
            if (linkNode == null) {
                return i2;
            }
            i2++;
        }
    }
}

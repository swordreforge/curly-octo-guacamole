package com.xiaomi.push.service;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class cdj {

    /* JADX INFO: renamed from: k */
    private static Object f33726k = new Object();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static Map<String, Queue<String>> f73558toq = new HashMap();

    /* JADX INFO: renamed from: k */
    public static boolean m21563k(XMPushService xMPushService, String str, String str2) {
        synchronized (f33726k) {
            SharedPreferences sharedPreferences = xMPushService.getSharedPreferences("push_message_ids", 0);
            Queue<String> queue = f73558toq.get(str);
            if (queue == null) {
                String[] strArrSplit = sharedPreferences.getString(str, "").split(",");
                LinkedList linkedList = new LinkedList();
                for (String str3 : strArrSplit) {
                    linkedList.add(str3);
                }
                f73558toq.put(str, linkedList);
                queue = linkedList;
            }
            if (queue.contains(str2)) {
                return true;
            }
            queue.add(str2);
            if (queue.size() > 25) {
                queue.poll();
            }
            String strM21305q = com.xiaomi.push.n5r1.m21305q(queue, ",");
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putString(str, strM21305q);
            editorEdit.commit();
            return false;
        }
    }
}

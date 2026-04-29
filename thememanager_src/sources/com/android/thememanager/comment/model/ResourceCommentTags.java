package com.android.thememanager.comment.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ResourceCommentTags implements Serializable {
    private static final long serialVersionUID = 1;
    public CommentTags commentTags;

    public static class CommentTags implements Serializable {
        public ArrayList<Tag> score1;
        public ArrayList<Tag> score2;
        public ArrayList<Tag> score3;
        public ArrayList<Tag> score4;
        public ArrayList<Tag> score5;
    }

    public static class Tag implements Serializable {
        public String content;
        public String id;
        public int score;
        public boolean selected;
    }

    public static List<Tag> generateCommentTags(@lvui List<String> tags) {
        ArrayList arrayList = new ArrayList(tags.size());
        for (String str : tags) {
            Tag tag = new Tag();
            tag.content = str;
            tag.selected = false;
            arrayList.add(tag);
        }
        return arrayList;
    }
}

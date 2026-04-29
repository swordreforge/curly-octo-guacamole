package com.android.thememanager.model;

/* JADX INFO: loaded from: classes2.dex */
public class Update {
    private Action action;
    private File patch;
    private File source;
    private File target;

    public enum Action {
        UPDATE,
        CREATE,
        DELETE,
        REPLACE,
        KEEP
    }

    public static class File {
        private String digest;
        private String name;

        public String getDigest() {
            return this.digest;
        }

        public String getName() {
            return this.name;
        }

        public void setDigest(String digest) {
            this.digest = digest;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public Action getAction() {
        return this.action;
    }

    public File getPatch() {
        return this.patch;
    }

    public File getSource() {
        return this.source;
    }

    public File getTarget() {
        return this.target;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public void setPatch(File patch) {
        this.patch = patch;
    }

    public void setSource(File source) {
        this.source = source;
    }

    public void setTarget(File target) {
        this.target = target;
    }
}

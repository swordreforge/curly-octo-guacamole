package com.miui.maml.elements;

import android.text.Html;
import android.text.TextUtils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class MusicLyricParser {
    public static final String CRLF = "\r\n";
    private static final int INTERVAL_OF_LAST = 8000;
    private static final int LINE_PARSE_IGNORE = 1;
    private static final int LINE_PARSE_REGULAR = 2;
    private static final int LINE_PARSE_STOP = 0;
    public static final int MAX_VALID_TIME = 18000000;
    private static final String TAG_ALBUM = "al";
    private static final String TAG_ARTIST = "ar";
    private static final String TAG_EDITOR = "by";
    private static final Pattern TAG_EXTRA_LRC = Pattern.compile("<[0-9]{0,2}:[0-9]{0,2}:[0-9]{0,2}>");
    private static final String TAG_OFFSET = "offset";
    private static final String TAG_TITLE = "ti";
    private static final String TAG_VERSION = "ve";

    static class EntityCompator implements Comparator<LyricEntity> {
        EntityCompator() {
        }

        @Override // java.util.Comparator
        public int compare(LyricEntity lyricEntity, LyricEntity lyricEntity2) {
            return lyricEntity.time - lyricEntity2.time;
        }
    }

    public static class Lyric {
        private final LyricEntity EMPTY_AFTER;
        private final ArrayList<LyricEntity> mEntityList;
        private final LyricHeader mHeader;
        private boolean mIsModified;
        private int mOriginHeaderOffset;
        private LyricLocator mLyricLocator = new LyricLocator();
        private final long mOpenTime = System.currentTimeMillis();
        private final LyricEntity EMPTY_BEFORE = new LyricEntity(-1, "\n");

        class LyricLine {
            CharSequence lyric;
            int pos;

            LyricLine() {
            }
        }

        class LyricLocator {
            final int CRLF_LENGTH = 2;
            String mFullLyric;
            ArrayList<LyricLine> mLyricLines;
            int[] mTimeArr;

            LyricLocator() {
            }

            private int getLineNumber(long j2) {
                int i2 = 0;
                while (true) {
                    int[] iArr = this.mTimeArr;
                    if (i2 >= iArr.length) {
                        return -1;
                    }
                    if (j2 >= iArr[i2]) {
                        if (j2 < (i2 < iArr.length + (-1) ? iArr[i2 + 1] : Long.MAX_VALUE)) {
                            return i2;
                        }
                    }
                    i2++;
                }
            }

            private void inflateLyricLines(ArrayList<CharSequence> arrayList) {
                int[] iArr = this.mTimeArr;
                if (iArr == null || arrayList == null || iArr.length != arrayList.size()) {
                    this.mTimeArr = null;
                    this.mLyricLines = null;
                    return;
                }
                this.mLyricLines = new ArrayList<>();
                int i2 = 0;
                while (i2 < this.mTimeArr.length) {
                    CharSequence charSequence = arrayList.get(i2);
                    LyricLine lyricLine = Lyric.this.new LyricLine();
                    lyricLine.lyric = charSequence;
                    LyricLine lyricLine2 = i2 > 0 ? this.mLyricLines.get(i2 - 1) : null;
                    lyricLine.pos = lyricLine2 != null ? lyricLine2.pos + lyricLine2.lyric.length() + this.CRLF_LENGTH : 0;
                    this.mLyricLines.add(lyricLine);
                    i2++;
                }
                this.mFullLyric = "";
                for (int i3 = 0; i3 < this.mLyricLines.size(); i3++) {
                    this.mFullLyric += ((Object) this.mLyricLines.get(i3).lyric) + MusicLyricParser.CRLF;
                }
            }

            String getAfterLines(long j2) {
                if (this.mTimeArr == null) {
                    return null;
                }
                int lineNumber = getLineNumber(j2);
                if (lineNumber < 0) {
                    return this.mFullLyric;
                }
                if (lineNumber >= this.mTimeArr.length - 1) {
                    return null;
                }
                LyricLine lyricLine = this.mLyricLines.get(lineNumber);
                return this.mFullLyric.substring(lyricLine.pos + lyricLine.lyric.length() + this.CRLF_LENGTH, this.mFullLyric.length());
            }

            String getBeforeLines(long j2) {
                int lineNumber;
                if (this.mTimeArr != null && (lineNumber = getLineNumber(j2)) > 0) {
                    return this.mFullLyric.substring(0, this.mLyricLines.get(lineNumber).pos - this.CRLF_LENGTH);
                }
                return null;
            }

            String getLastLine(long j2) {
                int lineNumber;
                if (this.mTimeArr == null || (lineNumber = getLineNumber(j2)) <= 0) {
                    return null;
                }
                LyricLine lyricLine = this.mLyricLines.get(lineNumber - 1);
                String str = this.mFullLyric;
                int i2 = lyricLine.pos;
                return str.substring(i2, lyricLine.lyric.length() + i2);
            }

            String getLine(long j2) {
                int lineNumber;
                if (this.mTimeArr == null || (lineNumber = getLineNumber(j2)) == -1) {
                    return null;
                }
                LyricLine lyricLine = this.mLyricLines.get(lineNumber);
                String str = this.mFullLyric;
                int i2 = lyricLine.pos;
                return str.substring(i2, lyricLine.lyric.length() + i2);
            }

            String getNextLine(long j2) {
                int lineNumber;
                if (this.mTimeArr == null || (lineNumber = getLineNumber(j2)) < -1 || lineNumber >= this.mTimeArr.length - 1) {
                    return null;
                }
                LyricLine lyricLine = this.mLyricLines.get(lineNumber + 1);
                String str = this.mFullLyric;
                int i2 = lyricLine.pos;
                return str.substring(i2, lyricLine.lyric.length() + i2);
            }

            void set(int[] iArr, ArrayList<CharSequence> arrayList) {
                this.mTimeArr = iArr;
                inflateLyricLines(arrayList);
            }
        }

        public Lyric(LyricHeader lyricHeader, ArrayList<LyricEntity> arrayList, boolean z2) {
            this.mHeader = lyricHeader;
            this.mOriginHeaderOffset = lyricHeader.offset;
            this.mEntityList = arrayList;
            this.mIsModified = z2;
            this.EMPTY_AFTER = new LyricEntity(arrayList.size(), "\n");
        }

        private long getTimeFromLyricShot(int i2, double d2) {
            int size = size() - 1;
            return i2 >= size ? ((long) (this.mEntityList.get(size).time + ((i2 - size) * 8000))) + ((long) (d2 * 8000.0d)) : (long) (((double) this.mEntityList.get(i2).time) + (((double) (this.mEntityList.get(i2 + 1).time - this.mEntityList.get(i2).time)) * d2));
        }

        public void addOffset(int i2) {
            this.mHeader.offset += i2;
            this.mIsModified = true;
        }

        public void correctLyric(LyricShot lyricShot, int i2, double d2) {
            int i3;
            int size = size();
            if (i2 < 0 || i2 > size || (i3 = lyricShot.lineIndex) < 0 || i3 > size) {
                return;
            }
            long timeFromLyricShot = getTimeFromLyricShot(i3, lyricShot.percent);
            long timeFromLyricShot2 = getTimeFromLyricShot(i2, d2);
            boolean z2 = true;
            int i4 = lyricShot.lineIndex;
            if (i2 > i4 || (i2 == i4 && d2 > lyricShot.percent)) {
                z2 = false;
            }
            if (z2 || timeFromLyricShot <= timeFromLyricShot2) {
                if (!z2 || timeFromLyricShot >= timeFromLyricShot2) {
                    addOffset((int) (timeFromLyricShot - timeFromLyricShot2));
                }
            }
        }

        public void decorate() {
            ArrayList<LyricEntity> arrayList;
            int size;
            if (!this.mEntityList.isEmpty() && (size = (arrayList = this.mEntityList).size()) > 0) {
                if (arrayList.get(0).isDecorated()) {
                    return;
                }
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList.get(i2).decorate();
                }
            }
        }

        public String getAfterLines(long j2) {
            return this.mLyricLocator.getAfterLines(j2);
        }

        public String getBeforeLines(long j2) {
            return this.mLyricLocator.getBeforeLines(j2);
        }

        public String getLastLine(long j2) {
            return this.mLyricLocator.getLastLine(j2);
        }

        public String getLine(long j2) {
            return this.mLyricLocator.getLine(j2);
        }

        public LyricEntity getLyricContent(int i2) {
            return i2 < 0 ? this.EMPTY_BEFORE : i2 >= this.mEntityList.size() ? this.EMPTY_AFTER : this.mEntityList.get(i2);
        }

        public LyricShot getLyricShot(long j2) {
            int i2 = this.mHeader.offset;
            if (this.mEntityList.get(0).time + i2 > j2) {
                return new LyricShot(0, 0.0d);
            }
            for (int i3 = 1; i3 < this.mEntityList.size(); i3++) {
                int i4 = this.mEntityList.get(i3).time + i2;
                if (i4 > j2) {
                    int i5 = i3 - 1;
                    int i6 = this.mEntityList.get(i5).time + i2;
                    return new LyricShot(i5, i4 > i6 ? (j2 - ((long) i6)) / ((double) (i4 - i6)) : 0.0d);
                }
            }
            long j3 = j2 - ((long) (this.mEntityList.get(size() - 1).time + i2));
            if (j3 < 8000) {
                return new LyricShot(size() - 1, j3 / 8000.0d);
            }
            return new LyricShot(this.mEntityList.size(), 0.0d);
        }

        public String getNextLine(long j2) {
            return this.mLyricLocator.getNextLine(j2);
        }

        public long getOpenTime() {
            return this.mOpenTime;
        }

        public ArrayList<CharSequence> getStringArr() {
            if (this.mEntityList.isEmpty()) {
                return null;
            }
            ArrayList<CharSequence> arrayList = new ArrayList<>(this.mEntityList.size());
            Iterator<LyricEntity> it = this.mEntityList.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().lyric);
            }
            return arrayList;
        }

        public int[] getTimeArr() {
            if (this.mEntityList.isEmpty()) {
                return null;
            }
            int[] iArr = new int[this.mEntityList.size()];
            int i2 = 0;
            Iterator<LyricEntity> it = this.mEntityList.iterator();
            while (it.hasNext()) {
                iArr[i2] = it.next().time + this.mHeader.offset;
                i2++;
            }
            return iArr;
        }

        public boolean isModified() {
            return this.mIsModified;
        }

        public void recycleContent() {
            this.mEntityList.clear();
        }

        public void resetHeaderOffset() {
            this.mHeader.offset = this.mOriginHeaderOffset;
        }

        public void set(int[] iArr, ArrayList<CharSequence> arrayList) {
            this.mLyricLocator.set(iArr, arrayList);
        }

        public int size() {
            return this.mEntityList.size();
        }
    }

    public static class LyricEntity {
        private static final String HTML_BR_PATTERN = "%s<br/>";
        public CharSequence lyric;
        public int time;

        public LyricEntity(int i2, String str) {
            this.time = i2;
            this.lyric = str;
        }

        public void decorate() {
            this.lyric = Html.fromHtml(String.format(HTML_BR_PATTERN, this.lyric));
        }

        public boolean isDecorated() {
            return !(this.lyric instanceof String);
        }
    }

    public static class LyricHeader {
        public String album;
        public String artist;
        public String editor;
        public int offset;
        public String title;
        public String version;
    }

    public static class LyricShot {
        public int lineIndex;
        public double percent;

        public LyricShot(int i2, double d2) {
            this.lineIndex = i2;
            this.percent = d2;
        }
    }

    private static void correctTime(Lyric lyric) {
        if (lyric == null) {
            return;
        }
        ArrayList arrayList = lyric.mEntityList;
        int size = arrayList.size();
        if (size > 1 && ((LyricEntity) arrayList.get(0)).time == ((LyricEntity) arrayList.get(1)).time) {
            ((LyricEntity) arrayList.get(0)).time = ((LyricEntity) arrayList.get(1)).time / 2;
        }
        int i2 = 1;
        while (i2 < size - 1) {
            int i3 = i2 + 1;
            if (((LyricEntity) arrayList.get(i2)).time == ((LyricEntity) arrayList.get(i3)).time) {
                ((LyricEntity) arrayList.get(i2)).time = (((LyricEntity) arrayList.get(i2 - 1)).time + ((LyricEntity) arrayList.get(i3)).time) / 2;
            }
            i2 = i3;
        }
    }

    private static Lyric doParse(String str) throws IOException {
        LyricHeader lyricHeader = new LyricHeader();
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = str.split(CRLF);
        boolean z2 = false;
        if (strArrSplit != null) {
            boolean z3 = false;
            for (String str2 : strArrSplit) {
                int line = parseLine(str2, lyricHeader, arrayList);
                if (line == 0) {
                    break;
                }
                if (line == 1) {
                    z3 = true;
                }
            }
            z2 = z3;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        Collections.sort(arrayList, new EntityCompator());
        return new Lyric(lyricHeader, arrayList, z2);
    }

    private static int parseEntity(String[] strArr, ArrayList<LyricEntity> arrayList, String str) {
        try {
            int i2 = (int) (Double.parseDouble(strArr[strArr.length - 1]) * 1000.0d);
            int i3 = 0;
            int i4 = 60;
            for (int length = strArr.length - 2; length >= 0; length--) {
                int i5 = Integer.parseInt(strArr[length]) * i4;
                i4 *= 60;
                i3 += i5;
            }
            int i6 = i2 + (i3 * 1000);
            if (i6 < 18000000) {
                arrayList.add(new LyricEntity(i6, str));
            }
            return 2;
        } catch (NumberFormatException unused) {
            return 1;
        }
    }

    private static int parseHeader(String str, LyricHeader lyricHeader) {
        int iIndexOf = str.indexOf(":");
        if (iIndexOf < 0 || iIndexOf >= str.length() - 1) {
            return 1;
        }
        String strSubstring = str.substring(0, iIndexOf);
        String strSubstring2 = str.substring(iIndexOf + 1);
        if (strSubstring.equals(TAG_ALBUM)) {
            lyricHeader.album = strSubstring2;
        } else if (strSubstring.equals(TAG_ARTIST)) {
            lyricHeader.artist = strSubstring2;
        } else if (strSubstring.equals(TAG_TITLE)) {
            lyricHeader.title = strSubstring2;
        } else if (strSubstring.equals(TAG_EDITOR)) {
            lyricHeader.editor = strSubstring2;
        } else if (strSubstring.equals(TAG_VERSION)) {
            lyricHeader.version = strSubstring2;
        } else {
            if (!strSubstring.equals("offset")) {
                return 1;
            }
            try {
                lyricHeader.offset = Integer.parseInt(strSubstring2);
            } catch (NumberFormatException unused) {
                return 1;
            }
        }
        return 2;
    }

    private static int parseLine(String str, LyricHeader lyricHeader, ArrayList<LyricEntity> arrayList) {
        String strReplaceAll;
        int iLastIndexOf;
        String strTrim = str.trim();
        if (TextUtils.isEmpty(strTrim) || (iLastIndexOf = (strReplaceAll = TAG_EXTRA_LRC.matcher(strTrim).replaceAll("")).lastIndexOf("]")) == -1) {
            return 1;
        }
        String strSubstring = strReplaceAll.substring(iLastIndexOf + 1);
        int iIndexOf = strReplaceAll.indexOf("[");
        if (iIndexOf == -1) {
            return 1;
        }
        String[] strArrSplit = strReplaceAll.substring(iIndexOf, iLastIndexOf).split("]");
        int entity = 2;
        for (String str2 : strArrSplit) {
            if (str2.startsWith("[")) {
                String strSubstring2 = str2.substring(1);
                String[] strArrSplit2 = strSubstring2.split(":");
                if (strArrSplit2.length >= 2) {
                    entity = TextUtils.isDigitsOnly(strArrSplit2[0]) ? parseEntity(strArrSplit2, arrayList, strSubstring) : parseHeader(strSubstring2, lyricHeader);
                }
            }
        }
        return entity;
    }

    public static Lyric parseLyric(String str) {
        Lyric lyricDoParse = null;
        if (str == null) {
            return null;
        }
        try {
            lyricDoParse = doParse(str);
            correctTime(lyricDoParse);
            return lyricDoParse;
        } catch (Exception e2) {
            e2.printStackTrace();
            return lyricDoParse;
        }
    }
}

package com.miui.maml.elements;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.media.Rating;
import android.os.Handler;
import android.support.v4.media.MediaMetadataCompat;
import android.text.TextUtils;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.miui.maml.ScreenElementRoot;
import com.miui.maml.data.IndexedVariable;
import com.miui.maml.data.Variables;
import com.miui.maml.elements.ButtonScreenElement;
import com.miui.maml.elements.MusicController;
import com.miui.maml.elements.MusicLyricParser;
import com.miui.maml.util.MamlLog;
import java.util.ArrayList;
import org.w3c.dom.Element;
import zy.hyr;

/* JADX INFO: loaded from: classes3.dex */
public class MusicControlScreenElement extends ElementGroup implements ButtonScreenElement.ButtonActionListener {
    private static final String BUTTON_MUSIC_NEXT = "music_next";
    private static final String BUTTON_MUSIC_PAUSE = "music_pause";
    private static final String BUTTON_MUSIC_PLAY = "music_play";
    private static final String BUTTON_MUSIC_PREV = "music_prev";
    private static final String ELE_MUSIC_ALBUM_COVER = "music_album_cover";
    private static final String ELE_MUSIC_DISPLAY = "music_display";
    private static final int FRAMERATE_PLAYING = 30;
    private static final String LOG_TAG = "MusicControlScreenE";
    public static final String METADATA_KEY_LYRIC = "android.media.metadata.LYRIC";
    private static final String MIUI_PLAYER_PACKAGE_NAME = "com.miui.player";
    public static final int MUSIC_STATE_PLAY = 1;
    public static final int MUSIC_STATE_STOP = 0;
    public static final int PLAYSTATE_NONE = 0;
    public static final String TAG_NAME = "MusicControl";
    private AlbumInfo mAlbumInfo;
    private IndexedVariable mAlbumVar;
    private IndexedVariable mArtistVar;
    private IndexedVariable mArtworkVar;
    private boolean mAutoShow;
    private ButtonScreenElement mButtonNext;
    private ButtonScreenElement mButtonPause;
    private ButtonScreenElement mButtonPlay;
    private ButtonScreenElement mButtonPrev;
    private Bitmap mDefaultAlbumCoverBm;
    private Runnable mDelayToSetArtworkRunnable;
    private boolean mDisableNext;
    private IndexedVariable mDisableNextVar;
    private boolean mDisablePlay;
    private IndexedVariable mDisablePlayVar;
    private boolean mDisablePrev;
    private IndexedVariable mDisablePrevVar;
    private IndexedVariable mDurationVar;
    private boolean mEnableLyric;
    private boolean mEnableProgress;
    private ImageScreenElement mImageAlbumCover;
    private MusicLyricParser.Lyric mLyric;
    private IndexedVariable mLyricAfterVar;
    private IndexedVariable mLyricBeforeVar;
    private IndexedVariable mLyricCurrentLineProgressVar;
    private IndexedVariable mLyricCurrentVar;
    private IndexedVariable mLyricLastVar;
    private IndexedVariable mLyricNextVar;
    private IndexedVariable mLyricPrevVar;
    private MediaMetadata mMetadata;
    private Context mMiuiMusicContext;
    private MusicController mMusicController;
    private IndexedVariable mMusicStateVar;
    private MusicController.OnClientUpdateListener mMusicUpdateListener;
    private boolean mNeedUpdateLyric;
    private boolean mNeedUpdateProgress;
    private boolean mNeedUpdateUserRating;
    private IndexedVariable mPlayerClassVar;
    private IndexedVariable mPlayerPackageVar;
    private boolean mPlaying;
    private IndexedVariable mPositionVar;
    private Runnable mResetMusicControllerRunable;
    private String mSender;
    private SpectrumVisualizerScreenElement mSpectrumVisualizer;
    private TextScreenElement mTextDisplay;
    private IndexedVariable mTitleVar;
    private int mUpdateProgressInterval;
    private Runnable mUpdateProgressRunnable;
    private int mUserRatingStyle;
    private IndexedVariable mUserRatingStyleVar;
    private float mUserRatingValue;
    private IndexedVariable mUserRatingValueVar;

    private static class AlbumInfo {
        String album;
        String artist;
        String title;

        private AlbumInfo() {
        }

        boolean update(String str, String str2, String str3) {
            if (str != null) {
                str = str.trim();
            }
            if (str2 != null) {
                str2 = str2.trim();
            }
            if (str3 != null) {
                str3 = str3.trim();
            }
            boolean z2 = (TextUtils.equals(str, this.title) && TextUtils.equals(str2, this.artist) && TextUtils.equals(str3, this.album)) ? false : true;
            if (z2) {
                this.title = str;
                this.artist = str2;
                this.album = str3;
            }
            return z2;
        }
    }

    public MusicControlScreenElement(Element element, ScreenElementRoot screenElementRoot) {
        super(element, screenElementRoot);
        this.mAlbumInfo = new AlbumInfo();
        this.mMusicUpdateListener = new MusicController.OnClientUpdateListener() { // from class: com.miui.maml.elements.MusicControlScreenElement.1
            private boolean mClientChanged;

            @Override // com.miui.maml.elements.MusicController.OnClientUpdateListener
            public void onClientChange() {
                this.mClientChanged = true;
                MusicControlScreenElement.this.resetAll();
                MusicControlScreenElement.this.readPackageName();
                StringBuilder sb = new StringBuilder();
                sb.append("clientChange: ");
                sb.append(MusicControlScreenElement.this.mPlayerPackageVar != null ? MusicControlScreenElement.this.mPlayerPackageVar.getString() : "null");
                sb.append("/");
                sb.append(MusicControlScreenElement.this.mPlayerClassVar != null ? MusicControlScreenElement.this.mPlayerClassVar.getString() : "null");
                MamlLog.m17850d(MusicControlScreenElement.LOG_TAG, sb.toString());
            }

            @Override // com.miui.maml.elements.MusicController.OnClientUpdateListener
            @hyr(api = 21)
            public void onClientMetadataUpdate(MediaMetadata mediaMetadata) {
                boolean zUpdate;
                MusicControlScreenElement.this.mMetadata = mediaMetadata;
                if (MusicControlScreenElement.this.mMetadata == null) {
                    return;
                }
                String string = MusicControlScreenElement.this.mMetadata.getString(MediaMetadataCompat.METADATA_KEY_TITLE);
                String string2 = MusicControlScreenElement.this.mMetadata.getString(MediaMetadataCompat.METADATA_KEY_ARTIST);
                String string3 = MusicControlScreenElement.this.mMetadata.getString(MediaMetadataCompat.METADATA_KEY_ALBUM);
                MamlLog.m17850d(MusicControlScreenElement.LOG_TAG, "\ntitle: " + string + ", artist: " + string2 + ", album: " + string3);
                if (string == null && string2 == null && string3 == null) {
                    zUpdate = false;
                } else {
                    zUpdate = MusicControlScreenElement.this.mAlbumInfo.update(string, string2, string3);
                    MusicControlScreenElement.this.updateAlbum(string, string2, string3);
                }
                Bitmap bitmap = MusicControlScreenElement.this.mMetadata.getBitmap(MediaMetadataCompat.METADATA_KEY_ART);
                StringBuilder sb = new StringBuilder();
                sb.append("artwork: ");
                sb.append(bitmap != null ? bitmap.toString() : "null");
                MamlLog.m17850d(MusicControlScreenElement.LOG_TAG, sb.toString());
                if (bitmap != null || zUpdate) {
                    if (bitmap == null) {
                        MusicControlScreenElement.this.delayToSetDefaultArtwork(500L);
                    } else {
                        MusicControlScreenElement.this.updateArtwork(bitmap);
                    }
                }
                String string4 = MusicControlScreenElement.this.mMetadata.getString(MusicControlScreenElement.METADATA_KEY_LYRIC);
                MamlLog.m17850d(MusicControlScreenElement.LOG_TAG, "raw lyric: " + string4);
                MusicLyricParser.Lyric lyric = MusicLyricParser.parseLyric(string4);
                if (lyric != null) {
                    lyric.decorate();
                }
                if (lyric != null || zUpdate) {
                    MusicControlScreenElement.this.mLyric = lyric;
                    MusicControlScreenElement.this.updateLyric(lyric);
                }
                MusicControlScreenElement musicControlScreenElement = MusicControlScreenElement.this;
                musicControlScreenElement.requestFramerate(musicControlScreenElement.mLyric != null ? 30.0f : 0.0f);
                long j2 = MusicControlScreenElement.this.mMetadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                long estimatedMediaPosition = MusicControlScreenElement.this.mMusicController.getEstimatedMediaPosition();
                MamlLog.m17850d(MusicControlScreenElement.LOG_TAG, "duration: " + j2 + ", position: " + estimatedMediaPosition);
                if ((j2 >= 0 && estimatedMediaPosition >= 0) || zUpdate) {
                    MusicControlScreenElement.this.updateProgress(j2, estimatedMediaPosition);
                }
                Rating rating = MusicControlScreenElement.this.mMetadata.getRating(MediaMetadataCompat.METADATA_KEY_USER_RATING);
                MamlLog.m17850d(MusicControlScreenElement.LOG_TAG, "rating: " + rating);
                MusicControlScreenElement.this.updateUserRating(rating);
                if (this.mClientChanged) {
                    return;
                }
                onClientChange();
            }

            @Override // com.miui.maml.elements.MusicController.OnClientUpdateListener
            public void onClientPlaybackActionUpdate(long j2) {
                MamlLog.m17850d(MusicControlScreenElement.LOG_TAG, "transportControlFlags: " + j2);
                if (!((128 & j2) != 0)) {
                    MusicControlScreenElement.this.resetUserRating();
                }
                MusicControlScreenElement.this.mDisablePlay = j2 != 0 && (519 & j2) == 0;
                MusicControlScreenElement.this.mDisablePrev = j2 != 0 && (16 & j2) == 0;
                MusicControlScreenElement.this.mDisableNext = j2 != 0 && (j2 & 32) == 0;
                MusicControlScreenElement musicControlScreenElement = MusicControlScreenElement.this;
                if (musicControlScreenElement.mHasName) {
                    musicControlScreenElement.mDisablePlayVar.set(MusicControlScreenElement.this.mDisablePlay ? 1.0d : 0.0d);
                    MusicControlScreenElement.this.mDisablePrevVar.set(MusicControlScreenElement.this.mDisablePrev ? 1.0d : 0.0d);
                    MusicControlScreenElement.this.mDisableNextVar.set(MusicControlScreenElement.this.mDisableNext ? 1.0d : 0.0d);
                }
            }

            @Override // com.miui.maml.elements.MusicController.OnClientUpdateListener
            public void onClientPlaybackStateUpdate(int i2) {
                onStateUpdate(i2);
                MamlLog.m17850d(MusicControlScreenElement.LOG_TAG, "stateUpdate: " + i2);
            }

            @Override // com.miui.maml.elements.MusicController.OnClientUpdateListener
            public void onSessionDestroyed() {
                if (MusicControlScreenElement.this.mAutoShow) {
                    MusicControlScreenElement.this.show(false);
                }
                MusicControlScreenElement.this.onMusicStateChange(false);
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x0029  */
            /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            protected void onStateUpdate(int r5) {
                /*
                    r4 = this;
                    r0 = 0
                    r1 = 1
                    if (r5 == 0) goto L21
                    if (r5 == r1) goto L16
                    r2 = 2
                    if (r5 == r2) goto L16
                    r2 = 3
                    if (r5 == r2) goto Ld
                    goto L26
                Ld:
                    com.miui.maml.elements.MusicControlScreenElement r5 = com.miui.maml.elements.MusicControlScreenElement.this
                    java.lang.String r0 = "state_play"
                    r5.performAction(r0)
                    r0 = r1
                    goto L27
                L16:
                    com.miui.maml.elements.MusicControlScreenElement r5 = com.miui.maml.elements.MusicControlScreenElement.this
                    java.lang.String r2 = "state_stop"
                    r5.performAction(r2)
                    r3 = r1
                    r1 = r0
                    r0 = r3
                    goto L27
                L21:
                    com.miui.maml.elements.MusicControlScreenElement r5 = com.miui.maml.elements.MusicControlScreenElement.this
                    com.miui.maml.elements.MusicControlScreenElement.access$800(r5)
                L26:
                    r1 = r0
                L27:
                    if (r0 == 0) goto L2e
                    com.miui.maml.elements.MusicControlScreenElement r5 = com.miui.maml.elements.MusicControlScreenElement.this
                    com.miui.maml.elements.MusicControlScreenElement.access$900(r5, r1)
                L2e:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.miui.maml.elements.MusicControlScreenElement.C51901.onStateUpdate(int):void");
            }
        };
        this.mDelayToSetArtworkRunnable = new Runnable() { // from class: com.miui.maml.elements.MusicControlScreenElement.2
            @Override // java.lang.Runnable
            public void run() {
                MusicControlScreenElement musicControlScreenElement = MusicControlScreenElement.this;
                musicControlScreenElement.updateArtwork(musicControlScreenElement.mDefaultAlbumCoverBm);
            }
        };
        this.mResetMusicControllerRunable = new Runnable() { // from class: com.miui.maml.elements.MusicControlScreenElement.3
            @Override // java.lang.Runnable
            public void run() {
                if (MusicControlScreenElement.this.mMusicController != null) {
                    MusicControlScreenElement.this.mMusicController.reset();
                }
            }
        };
        this.mUpdateProgressRunnable = new Runnable() { // from class: com.miui.maml.elements.MusicControlScreenElement.4
            @Override // java.lang.Runnable
            @hyr(api = 21)
            public void run() {
                if (!MusicControlScreenElement.this.mPlaying || MusicControlScreenElement.this.mMetadata == null) {
                    return;
                }
                long j2 = MusicControlScreenElement.this.mMetadata.getLong(MediaMetadataCompat.METADATA_KEY_DURATION);
                long estimatedMediaPosition = MusicControlScreenElement.this.mMusicController.getEstimatedMediaPosition();
                if (j2 <= 0 || estimatedMediaPosition < 0) {
                    return;
                }
                MusicControlScreenElement.this.mDurationVar.set(j2);
                MusicControlScreenElement.this.mPositionVar.set(estimatedMediaPosition);
                if (MusicControlScreenElement.this.mNeedUpdateLyric && MusicControlScreenElement.this.mLyric != null) {
                    MusicControlScreenElement.this.updateLyricVar(estimatedMediaPosition);
                }
                MusicControlScreenElement.this.requestUpdate();
                MusicControlScreenElement.this.getContext().getHandler().postDelayed(this, MusicControlScreenElement.this.mUpdateProgressInterval);
            }
        };
        this.mButtonPrev = (ButtonScreenElement) findElement(BUTTON_MUSIC_PREV);
        this.mButtonNext = (ButtonScreenElement) findElement(BUTTON_MUSIC_NEXT);
        this.mButtonPlay = (ButtonScreenElement) findElement(BUTTON_MUSIC_PLAY);
        this.mButtonPause = (ButtonScreenElement) findElement(BUTTON_MUSIC_PAUSE);
        this.mTextDisplay = (TextScreenElement) findElement(ELE_MUSIC_DISPLAY);
        this.mImageAlbumCover = (ImageScreenElement) findElement(ELE_MUSIC_ALBUM_COVER);
        this.mSpectrumVisualizer = findSpectrumVisualizer(this);
        setupButton(this.mButtonPrev);
        setupButton(this.mButtonNext);
        setupButton(this.mButtonPlay);
        setupButton(this.mButtonPause);
        ButtonScreenElement buttonScreenElement = this.mButtonPause;
        boolean z2 = false;
        if (buttonScreenElement != null) {
            buttonScreenElement.show(false);
        }
        if (this.mImageAlbumCover != null) {
            String attribute = element.getAttribute("defAlbumCover");
            if (!TextUtils.isEmpty(attribute)) {
                this.mDefaultAlbumCoverBm = getContext().mResourceManager.getBitmap(attribute);
            }
            Bitmap bitmap = this.mDefaultAlbumCoverBm;
            if (bitmap != null) {
                bitmap.setDensity(this.mRoot.getResourceDensity());
            }
        }
        this.mAutoShow = Boolean.parseBoolean(element.getAttribute("autoShow"));
        boolean z3 = Boolean.parseBoolean(element.getAttribute("enableLyric"));
        this.mEnableLyric = z3;
        this.mEnableProgress = z3 ? true : Boolean.parseBoolean(element.getAttribute("enableProgress"));
        this.mUpdateProgressInterval = getAttrAsInt(element, "updateProgressInterval", 1000);
        if (this.mHasName) {
            Variables variables = getVariables();
            this.mMusicStateVar = new IndexedVariable(this.mName + ".music_state", variables, true);
            this.mTitleVar = new IndexedVariable(this.mName + ".title", variables, false);
            this.mArtistVar = new IndexedVariable(this.mName + ".artist", variables, false);
            this.mAlbumVar = new IndexedVariable(this.mName + ".album", variables, false);
            if (this.mEnableLyric) {
                this.mLyricCurrentVar = new IndexedVariable(this.mName + ".lyric_current", variables, false);
                this.mLyricBeforeVar = new IndexedVariable(this.mName + ".lyric_before", variables, false);
                this.mLyricAfterVar = new IndexedVariable(this.mName + ".lyric_after", variables, false);
                this.mLyricLastVar = new IndexedVariable(this.mName + ".lyric_last", variables, false);
                this.mLyricPrevVar = new IndexedVariable(this.mName + ".lyric_prev", variables, false);
                this.mLyricNextVar = new IndexedVariable(this.mName + ".lyric_next", variables, false);
                this.mLyricCurrentLineProgressVar = new IndexedVariable(this.mName + ".lyric_current_line_progress", variables, true);
            }
            if (this.mEnableProgress) {
                this.mDurationVar = new IndexedVariable(this.mName + ".music_duration", variables, true);
                this.mPositionVar = new IndexedVariable(this.mName + ".music_position", variables, true);
            }
            this.mUserRatingStyleVar = new IndexedVariable(this.mName + ".user_rating_style", variables, true);
            this.mUserRatingValueVar = new IndexedVariable(this.mName + ".user_rating_value", variables, true);
            this.mDisablePlayVar = new IndexedVariable(this.mName + ".disable_play", variables, true);
            this.mDisablePrevVar = new IndexedVariable(this.mName + ".disable_prev", variables, true);
            this.mDisableNextVar = new IndexedVariable(this.mName + ".disable_next", variables, true);
            this.mArtworkVar = new IndexedVariable(this.mName + ".artwork", variables, false);
            this.mPlayerPackageVar = new IndexedVariable(this.mName + ".package", variables, false);
            this.mPlayerClassVar = new IndexedVariable(this.mName + ".class", variables, false);
        }
        this.mNeedUpdateLyric = this.mEnableLyric && this.mHasName;
        if (this.mEnableProgress && this.mHasName) {
            z2 = true;
        }
        this.mNeedUpdateProgress = z2;
        this.mNeedUpdateUserRating = this.mHasName;
        try {
            this.mMiuiMusicContext = getContext().mContext.createPackageContext(MIUI_PLAYER_PACKAGE_NAME, 2);
        } catch (Exception e2) {
            MamlLog.m17852e(LOG_TAG, "fail to get MiuiMusic preference", e2);
        }
        this.mMusicController = new MusicController(getContext().mContext, getContext().getHandler());
        String rootTag = this.mRoot.getRootTag();
        this.mSender = "maml";
        if ("gadget".equalsIgnoreCase(rootTag)) {
            this.mSender = "home_widget";
        } else if (InterfaceC1789q.qwyf.equalsIgnoreCase(rootTag)) {
            this.mSender = "notification_bar";
        } else if ("lockscreen".equalsIgnoreCase(rootTag)) {
            this.mSender = "lockscreen";
        }
    }

    private void cancelSetDefaultArtwork() {
        getContext().getHandler().removeCallbacks(this.mDelayToSetArtworkRunnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void delayToSetDefaultArtwork(long j2) {
        Handler handler = getContext().getHandler();
        handler.removeCallbacks(this.mDelayToSetArtworkRunnable);
        handler.postDelayed(this.mDelayToSetArtworkRunnable, j2);
    }

    private SpectrumVisualizerScreenElement findSpectrumVisualizer(ElementGroup elementGroup) {
        SpectrumVisualizerScreenElement spectrumVisualizerScreenElementFindSpectrumVisualizer;
        for (ScreenElement screenElement : elementGroup.getElements()) {
            if (screenElement instanceof SpectrumVisualizerScreenElement) {
                return (SpectrumVisualizerScreenElement) screenElement;
            }
            if ((screenElement instanceof ElementGroup) && (spectrumVisualizerScreenElementFindSpectrumVisualizer = findSpectrumVisualizer((ElementGroup) screenElement)) != null) {
                return spectrumVisualizerScreenElementFindSpectrumVisualizer;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onMusicStateChange(boolean z2) {
        if (z2 && this.mAutoShow && !isVisible()) {
            show(true);
        }
        this.mPlaying = z2;
        IndexedVariable indexedVariable = this.mMusicStateVar;
        if (indexedVariable != null) {
            indexedVariable.set(z2 ? 1.0d : 0.0d);
        }
        ButtonScreenElement buttonScreenElement = this.mButtonPause;
        if (buttonScreenElement != null) {
            buttonScreenElement.show(z2);
        }
        ButtonScreenElement buttonScreenElement2 = this.mButtonPlay;
        if (buttonScreenElement2 != null) {
            buttonScreenElement2.show(!z2);
        }
        if (this.mNeedUpdateProgress) {
            startProgressUpdate(z2, z2 ? 100L : 0L);
        }
        SpectrumVisualizerScreenElement spectrumVisualizerScreenElement = this.mSpectrumVisualizer;
        if (spectrumVisualizerScreenElement != null) {
            spectrumVisualizerScreenElement.enableUpdate(z2 && this.mResumed);
        }
        requestFramerate((!z2 || this.mLyric == null) ? 0.0f : 30.0f);
        requestUpdate();
        MamlLog.m17850d(LOG_TAG, "music state change: playing=" + z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetAll() {
        updateAlbum(null, null, null);
        resetProgress();
        resetLyric();
        resetUserRating();
        updateArtwork(this.mDefaultAlbumCoverBm);
        resetPackageName();
        resetMusicState();
    }

    private void resetLyric() {
        if (this.mNeedUpdateLyric) {
            this.mLyricBeforeVar.set((Object) null);
            this.mLyricAfterVar.set((Object) null);
            this.mLyricLastVar.set((Object) null);
            this.mLyricPrevVar.set((Object) null);
            this.mLyricNextVar.set((Object) null);
            this.mLyricCurrentVar.set((Object) null);
        }
    }

    private void resetMusicState() {
        onMusicStateChange(false);
    }

    private void resetPackageName() {
        IndexedVariable indexedVariable = this.mPlayerPackageVar;
        if (indexedVariable != null) {
            indexedVariable.set((Object) null);
        }
        IndexedVariable indexedVariable2 = this.mPlayerClassVar;
        if (indexedVariable2 != null) {
            indexedVariable2.set((Object) null);
        }
    }

    private void resetProgress() {
        if (this.mNeedUpdateProgress) {
            this.mDurationVar.set(0.0d);
            this.mPositionVar.set(0.0d);
        }
        if (this.mNeedUpdateLyric) {
            this.mLyricCurrentLineProgressVar.set(0.0d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetUserRating() {
        if (this.mNeedUpdateUserRating) {
            this.mUserRatingStyle = 0;
            this.mUserRatingValue = 0.0f;
            this.mUserRatingStyleVar.set(0.0d);
            this.mUserRatingValueVar.set(0.0d);
        }
    }

    private boolean sendMediaKeyEvent(int i2, String str) {
        int i3 = BUTTON_MUSIC_PREV.equals(str) ? 88 : BUTTON_MUSIC_NEXT.equals(str) ? 87 : (BUTTON_MUSIC_PLAY.equals(str) || BUTTON_MUSIC_PAUSE.equals(str)) ? 85 : 0;
        if (i3 == 88 && this.mDisablePrev) {
            return false;
        }
        if (i3 == 87 && this.mDisableNext) {
            return false;
        }
        if (i3 == 85 && this.mDisablePlay) {
            return false;
        }
        if (this.mMusicController.sendMediaKeyEvent(i2, i3)) {
            return true;
        }
        MamlLog.m17850d(LOG_TAG, "fail to dispatch by media controller, send to MiuiMusic.");
        if (i2 == 0) {
            return true;
        }
        Intent intent = null;
        if (BUTTON_MUSIC_PLAY.equals(str) || BUTTON_MUSIC_PAUSE.equals(str)) {
            intent = new Intent("com.miui.player.musicservicecommand.togglepause");
        } else if (BUTTON_MUSIC_PREV.equals(str)) {
            intent = new Intent("com.miui.player.musicservicecommand.previous");
        } else if (BUTTON_MUSIC_NEXT.equals(str)) {
            intent = new Intent("com.miui.player.musicservicecommand.next");
        }
        if (intent == null) {
            return false;
        }
        intent.setPackage(MIUI_PLAYER_PACKAGE_NAME);
        intent.putExtra("intent_sender", this.mSender);
        this.mRoot.getContext().mContext.startService(intent);
        getContext().getHandler().postDelayed(this.mResetMusicControllerRunable, 1000L);
        return true;
    }

    private void setupButton(ButtonScreenElement buttonScreenElement) {
        if (buttonScreenElement != null) {
            buttonScreenElement.setListener(this);
            buttonScreenElement.setParent(this);
        }
    }

    private void startProgressUpdate(boolean z2, long j2) {
        getContext().getHandler().removeCallbacks(this.mUpdateProgressRunnable);
        if (z2) {
            if (j2 > 0) {
                getContext().getHandler().postDelayed(this.mUpdateProgressRunnable, j2);
            } else {
                getContext().getHandler().post(this.mUpdateProgressRunnable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAlbum(String str, String str2, String str3) {
        if (this.mHasName) {
            this.mTitleVar.set(str);
            this.mArtistVar.set(str2);
            this.mAlbumVar.set(str3);
        }
        if (this.mTextDisplay != null) {
            if (TextUtils.isEmpty(str)) {
                str = str2;
            } else if (!TextUtils.isEmpty(str2)) {
                str = String.format("%s   %s", str, str2);
            }
            this.mTextDisplay.setText(str);
        }
        requestUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateArtwork(Bitmap bitmap) {
        cancelSetDefaultArtwork();
        if (this.mHasName) {
            this.mArtworkVar.set(bitmap);
        }
        ImageScreenElement imageScreenElement = this.mImageAlbumCover;
        if (imageScreenElement != null) {
            imageScreenElement.setBitmap(bitmap);
        }
        requestUpdate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLyric(MusicLyricParser.Lyric lyric) {
        if (this.mNeedUpdateLyric) {
            if (lyric == null) {
                resetLyric();
                return;
            }
            int[] timeArr = lyric.getTimeArr();
            ArrayList<CharSequence> stringArr = lyric.getStringArr();
            MusicLyricParser.Lyric lyric2 = this.mLyric;
            if (lyric2 != null) {
                lyric2.set(timeArr, stringArr);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLyricVar(long j2) {
        this.mLyricCurrentLineProgressVar.set(this.mLyric.getLyricShot(j2).percent);
        this.mLyricCurrentVar.set(this.mLyric.getLine(j2));
        this.mLyricBeforeVar.set(this.mLyric.getBeforeLines(j2));
        this.mLyricAfterVar.set(this.mLyric.getAfterLines(j2));
        String lastLine = this.mLyric.getLastLine(j2);
        this.mLyricLastVar.set(lastLine);
        this.mLyricPrevVar.set(lastLine);
        this.mLyricNextVar.set(this.mLyric.getNextLine(j2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress(long j2, long j3) {
        if (this.mNeedUpdateProgress) {
            if (j2 <= 0 || j3 < 0) {
                resetProgress();
                return;
            }
            this.mDurationVar.set(j2);
            this.mPositionVar.set(j3);
            if (this.mNeedUpdateLyric) {
                if (this.mLyric != null) {
                    updateLyricVar(j3);
                } else {
                    resetLyric();
                }
            }
            requestUpdate();
            startProgressUpdate(this.mPlaying, 0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateUserRating(Rating rating) {
        if (this.mNeedUpdateUserRating) {
            if (rating == null) {
                resetUserRating();
                return;
            }
            int ratingStyle = rating.getRatingStyle();
            this.mUserRatingStyle = ratingStyle;
            switch (ratingStyle) {
                case 1:
                    this.mUserRatingValue = rating.hasHeart() ? 1.0f : 0.0f;
                    break;
                case 2:
                    this.mUserRatingValue = rating.isThumbUp() ? 1.0f : 0.0f;
                    break;
                case 3:
                case 4:
                case 5:
                    this.mUserRatingValue = rating.getStarRating();
                    break;
                case 6:
                    this.mUserRatingValue = rating.getPercentRating();
                    break;
                default:
                    this.mUserRatingValue = 0.0f;
                    break;
            }
            this.mUserRatingStyleVar.set(this.mUserRatingStyle);
            this.mUserRatingValueVar.set(this.mUserRatingValue);
            requestUpdate();
        }
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void finish() {
        super.finish();
        IndexedVariable indexedVariable = this.mArtworkVar;
        if (indexedVariable != null) {
            indexedVariable.set((Object) null);
        }
        this.mMusicController.unregisterListener();
        this.mMusicController.finish();
        Handler handler = getContext().getHandler();
        handler.removeCallbacks(this.mUpdateProgressRunnable);
        handler.removeCallbacks(this.mDelayToSetArtworkRunnable);
        handler.removeCallbacks(this.mResetMusicControllerRunable);
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void init() {
        super.init();
        initByPreference();
        this.mMusicController.registerListener(this.mMusicUpdateListener);
        if (!this.mMusicController.isMusicActive()) {
            onMusicStateChange(false);
            return;
        }
        if (this.mAutoShow) {
            show(true);
        }
        onMusicStateChange(true);
    }

    public void initByPreference() {
        SharedPreferences sharedPreferences;
        Context context = this.mMiuiMusicContext;
        if (context != null) {
            try {
                sharedPreferences = context.getSharedPreferences("MiuiMusic", 4);
            } catch (IllegalStateException unused) {
                sharedPreferences = null;
            }
            if (sharedPreferences != null) {
                updateAlbum(sharedPreferences.getString("songName", null), sharedPreferences.getString("artistName", null), sharedPreferences.getString("albumName", null));
                updateArtwork(this.mDefaultAlbumCoverBm);
            }
        }
    }

    @Override // com.miui.maml.elements.ButtonScreenElement.ButtonActionListener
    public boolean onButtonDoubleClick(String str) {
        return false;
    }

    @Override // com.miui.maml.elements.ButtonScreenElement.ButtonActionListener
    public boolean onButtonDown(String str) {
        return sendMediaKeyEvent(0, str);
    }

    @Override // com.miui.maml.elements.ButtonScreenElement.ButtonActionListener
    public boolean onButtonLongClick(String str) {
        return false;
    }

    @Override // com.miui.maml.elements.ButtonScreenElement.ButtonActionListener
    public boolean onButtonUp(String str) {
        if (!sendMediaKeyEvent(1, str)) {
            return false;
        }
        if (BUTTON_MUSIC_PREV.equals(str) || BUTTON_MUSIC_NEXT.equals(str)) {
            cancelSetDefaultArtwork();
            getContext().getHandler().removeCallbacks(this.mUpdateProgressRunnable);
        }
        return true;
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    protected void onVisibilityChange(boolean z2) {
        super.onVisibilityChange(z2);
        boolean z3 = false;
        if (!z2) {
            requestFramerate(0.0f);
            SpectrumVisualizerScreenElement spectrumVisualizerScreenElement = this.mSpectrumVisualizer;
            if (spectrumVisualizerScreenElement != null) {
                spectrumVisualizerScreenElement.enableUpdate(false);
                return;
            }
            return;
        }
        requestUpdate();
        SpectrumVisualizerScreenElement spectrumVisualizerScreenElement2 = this.mSpectrumVisualizer;
        if (spectrumVisualizerScreenElement2 != null) {
            if (this.mPlaying && this.mResumed) {
                z3 = true;
            }
            spectrumVisualizerScreenElement2.enableUpdate(z3);
        }
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.AnimatedScreenElement, com.miui.maml.elements.ScreenElement
    public void pause() {
        super.pause();
        SpectrumVisualizerScreenElement spectrumVisualizerScreenElement = this.mSpectrumVisualizer;
        if (spectrumVisualizerScreenElement != null) {
            spectrumVisualizerScreenElement.enableUpdate(false);
        }
    }

    public void ratingHeart() {
        if (this.mUserRatingStyle == 1) {
            Rating ratingNewHeartRating = Rating.newHeartRating(!(this.mUserRatingValue == 1.0f));
            this.mMusicController.rating(ratingNewHeartRating);
            updateUserRating(ratingNewHeartRating);
        }
    }

    protected void readPackageName() {
        if (this.mPlayerPackageVar == null || this.mPlayerClassVar == null) {
            return;
        }
        String clientPackageName = this.mMusicController.getClientPackageName();
        MamlLog.m17850d(LOG_TAG, "readPackage: " + clientPackageName);
        if (clientPackageName != null) {
            Intent launchIntentForPackage = this.mRoot.getContext().mContext.getPackageManager().getLaunchIntentForPackage(clientPackageName);
            if (launchIntentForPackage != null) {
                ComponentName component = launchIntentForPackage.getComponent();
                this.mPlayerPackageVar.set(component.getPackageName());
                this.mPlayerClassVar.set(component.getClassName());
            } else {
                this.mPlayerPackageVar.set(clientPackageName);
                this.mPlayerClassVar.set((Object) null);
                MamlLog.m17854w(LOG_TAG, "set player info fail.");
            }
        }
    }

    @Override // com.miui.maml.elements.ElementGroup, com.miui.maml.elements.ScreenElement
    public void resume() {
        super.resume();
        requestUpdate();
        SpectrumVisualizerScreenElement spectrumVisualizerScreenElement = this.mSpectrumVisualizer;
        if (spectrumVisualizerScreenElement != null) {
            spectrumVisualizerScreenElement.enableUpdate(this.mPlaying);
        }
    }

    public void seekTo(double d2) {
        this.mMusicController.seekTo((long) (d2 * this.mDurationVar.getDouble()));
    }
}

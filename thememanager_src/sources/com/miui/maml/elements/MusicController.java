package com.miui.maml.elements;

import android.content.Context;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.MediaSessionManager;
import android.media.session.PlaybackState;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import com.miui.maml.util.MamlLog;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MusicController {
    private static final String TAG = "MAML_MusicController";
    private Context mContext;
    private Handler mHandler;
    private MediaController mMediaController;
    private MediaSessionManager mSessionManager;
    private OnClientUpdateListener mUpdateListener;
    private MediaSessionManager.OnActiveSessionsChangedListener mSessionsChangedListener = new MediaSessionManager.OnActiveSessionsChangedListener() { // from class: com.miui.maml.elements.MusicController.1
        @Override // android.media.session.MediaSessionManager.OnActiveSessionsChangedListener
        public void onActiveSessionsChanged(List<MediaController> list) {
            MusicController.this.resetMediaController(list);
            MamlLog.m17850d(MusicController.TAG, "onActiveSessionsChanged");
        }
    };
    private MediaController.Callback mMediaCallback = new MediaController.Callback() { // from class: com.miui.maml.elements.MusicController.2
        @Override // android.media.session.MediaController.Callback
        public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
            super.onAudioInfoChanged(playbackInfo);
        }

        @Override // android.media.session.MediaController.Callback
        public void onExtrasChanged(Bundle bundle) {
            super.onExtrasChanged(bundle);
        }

        @Override // android.media.session.MediaController.Callback
        public void onMetadataChanged(MediaMetadata mediaMetadata) {
            super.onMetadataChanged(mediaMetadata);
            MamlLog.m17850d(MusicController.TAG, "onMetadataChanged");
            if (MusicController.this.mUpdateListener != null) {
                MusicController.this.mUpdateListener.onClientMetadataUpdate(mediaMetadata);
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onPlaybackStateChanged(PlaybackState playbackState) {
            super.onPlaybackStateChanged(playbackState);
            MamlLog.m17850d(MusicController.TAG, "onPlaybackStateChanged");
            if (MusicController.this.mUpdateListener != null) {
                if (playbackState == null) {
                    MusicController.this.mUpdateListener.onClientPlaybackStateUpdate(0);
                } else {
                    MusicController.this.mUpdateListener.onClientPlaybackStateUpdate(playbackState.getState());
                    MusicController.this.mUpdateListener.onClientPlaybackActionUpdate(playbackState.getActions());
                }
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueChanged(List<MediaSession.QueueItem> list) {
            super.onQueueChanged(list);
        }

        @Override // android.media.session.MediaController.Callback
        public void onQueueTitleChanged(CharSequence charSequence) {
            super.onQueueTitleChanged(charSequence);
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionDestroyed() {
            super.onSessionDestroyed();
            MamlLog.m17850d(MusicController.TAG, "onSessionDestroyed");
            if (MusicController.this.mUpdateListener != null) {
                MusicController.this.mUpdateListener.onSessionDestroyed();
            }
        }

        @Override // android.media.session.MediaController.Callback
        public void onSessionEvent(String str, Bundle bundle) {
            super.onSessionEvent(str, bundle);
            MamlLog.m17850d(MusicController.TAG, "onSessionEvent");
        }
    };

    public interface OnClientUpdateListener {
        void onClientChange();

        void onClientMetadataUpdate(MediaMetadata mediaMetadata);

        void onClientPlaybackActionUpdate(long j2);

        void onClientPlaybackStateUpdate(int i2);

        void onSessionDestroyed();
    }

    public MusicController(Context context, Handler handler) {
        Context applicationContext = context.getApplicationContext();
        this.mContext = applicationContext;
        this.mHandler = handler;
        this.mSessionManager = (MediaSessionManager) applicationContext.getSystemService("media_session");
        init();
    }

    private void clearMediaController() {
        MamlLog.m17850d(TAG, "clearMediaController");
        if (this.mMediaController != null) {
            OnClientUpdateListener onClientUpdateListener = this.mUpdateListener;
            if (onClientUpdateListener != null) {
                onClientUpdateListener.onClientChange();
            }
            try {
                this.mMediaController.unregisterCallback(this.mMediaCallback);
            } catch (Exception unused) {
                MamlLog.m17851e(TAG, "unregister MediaController.Callback failed");
            }
            this.mMediaController = null;
        }
    }

    private void initMediaController() {
        MamlLog.m17850d(TAG, "initMediaController");
        MediaController mediaController = this.mMediaController;
        if (mediaController != null) {
            try {
                mediaController.registerCallback(this.mMediaCallback, this.mHandler);
            } catch (Exception unused) {
                MamlLog.m17851e(TAG, "register MediaController.Callback failed");
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resetMediaController(List<MediaController> list) {
        MamlLog.m17850d(TAG, "resetMediaController");
        clearMediaController();
        if (list != null) {
            if (list.size() > 0) {
                this.mMediaController = list.get(0);
            }
            initMediaController();
            updateInfoToListener();
        }
    }

    private void updateInfoToListener() {
        OnClientUpdateListener onClientUpdateListener;
        MamlLog.m17850d(TAG, "updateInfoToListener");
        if (this.mMediaController == null || (onClientUpdateListener = this.mUpdateListener) == null) {
            return;
        }
        onClientUpdateListener.onClientChange();
        PlaybackState playbackState = this.mMediaController.getPlaybackState();
        if (playbackState != null) {
            this.mUpdateListener.onClientPlaybackStateUpdate(playbackState.getState());
        }
        this.mUpdateListener.onClientMetadataUpdate(this.mMediaController.getMetadata());
    }

    public void finish() {
        MamlLog.m17850d(TAG, "finish");
        this.mSessionManager.removeOnActiveSessionsChangedListener(this.mSessionsChangedListener);
        clearMediaController();
    }

    public String getClientPackageName() {
        MediaController mediaController = this.mMediaController;
        if (mediaController != null) {
            return mediaController.getPackageName();
        }
        return null;
    }

    public long getEstimatedMediaPosition() {
        PlaybackState playbackState;
        MediaController mediaController = this.mMediaController;
        if (mediaController == null || (playbackState = mediaController.getPlaybackState()) == null) {
            return 0L;
        }
        return playbackState.getPosition();
    }

    public void init() {
        MamlLog.m17850d(TAG, "init");
        resetMediaController(this.mSessionManager.getActiveSessions(null));
        this.mSessionManager.addOnActiveSessionsChangedListener(this.mSessionsChangedListener, null, this.mHandler);
    }

    public boolean isMusicActive() {
        PlaybackState playbackState;
        MediaController mediaController = this.mMediaController;
        if (mediaController == null || (playbackState = mediaController.getPlaybackState()) == null) {
            return false;
        }
        int state = playbackState.getState();
        return state == 3 || state == 6;
    }

    public void rating(Rating rating) {
        try {
            MediaController mediaController = this.mMediaController;
            if (mediaController != null) {
                mediaController.getTransportControls().setRating(rating);
            }
        } catch (Exception e2) {
            MamlLog.m17854w(TAG, "RATING_KEY_BY_USER: failed: " + e2);
        }
    }

    public void registerListener(OnClientUpdateListener onClientUpdateListener) {
        this.mUpdateListener = onClientUpdateListener;
        updateInfoToListener();
    }

    public void reset() {
        resetMediaController(this.mSessionManager.getActiveSessions(null));
    }

    public boolean seekTo(long j2) {
        try {
            MediaController mediaController = this.mMediaController;
            if (mediaController == null) {
                return false;
            }
            mediaController.getTransportControls().seekTo(j2);
            return true;
        } catch (Exception e2) {
            MamlLog.m17854w(TAG, " seekTo failed: " + e2);
            return false;
        }
    }

    public boolean sendMediaKeyEvent(int i2, int i3) {
        try {
            if (this.mMediaController == null) {
                return false;
            }
            KeyEvent keyEvent = new KeyEvent(i2, i3);
            keyEvent.setSource(4098);
            return this.mMediaController.dispatchMediaButtonEvent(keyEvent);
        } catch (Exception e2) {
            MamlLog.m17854w(TAG, "Send media key event failed: " + e2);
            return false;
        }
    }

    public void unregisterListener() {
        this.mUpdateListener = null;
    }
}

package com.example.carltonapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import com.google.android.youtube.player.YouTubePlayerView;

public class WatchFootballActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_watch_football);

        VideoView mVideoView = (VideoView) findViewById(R.id.videoview);

        String mediaName = "carltonvid";
        Uri videoUri = Uri.parse("android.resource://" + getPackageName() + "/raw/" + mediaName);
        mVideoView.setVideoURI(videoUri);

        MediaController controller = new MediaController(this);
        controller.setMediaPlayer(mVideoView);
        mVideoView.setMediaController(controller);
        mVideoView.start();


    }
}

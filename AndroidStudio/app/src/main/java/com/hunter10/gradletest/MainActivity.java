package com.hunter10.gradletest;

import android.app.Activity;
import android.os.Bundle;
import com.unity3d.player.UnityPlayer;
import com.unity3d.player.UnityPlayerActivity;

public class MainActivity extends UnityPlayerActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        UnityPlayer.UnitySendMessage("Main Camera", "CallFromNative", "Message Test!");
    }
}

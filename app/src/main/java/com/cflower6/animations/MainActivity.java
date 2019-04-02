package com.cflower6.animations;

import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    public void fade(View view){
        ImageView goku = (ImageView) findViewById(R.id.goku);
        ImageView gokuSSJ = (ImageView) findViewById(R.id.ssj);
        goku.animate().alpha(0f).setDuration(2000);
        gokuSSJ.animate().alpha(1f).setDuration(2000);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}

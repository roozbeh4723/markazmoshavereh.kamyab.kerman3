package com.markazmoshavereh.kamyab.kerman1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.RadioButton;
import android.widget.Toast;
import android.widget.VideoView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VideoView vv=findViewById(R.id.vv);
        Button btnsave=findViewById(R.id.btnsave);
        Button btncancel=findViewById(R.id.btncancel);
        RadioButton ratman=findViewById(R.id.ratman);
        RadioButton ratwoman=findViewById(R.id.ratwoman);

        String url="https://hw7.cdn.asset.aparat.com/aparat-video/048790840f4c75a3081496b539a2ce5726832123-144p.mp4";
        vv.setMediaController(new MediaController(this));
        vv.setVideoURI(Uri.parse(url));
        vv.start();
        WebView web = findViewById(R.id.web);
        web.getSettings().setJavaScriptEnabled(true);
        web.setWebViewClient(new WebViewClient());
        web.loadUrl("https://www.nedayemehr.ir/psychological-counseling-centers");
        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"اطلاعات با موفقیت ذخیره شد!لهف هدهفgit",Toast.LENGTH_LONG).show();           }
        });
        btncancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"انصراف!" ,Toast.LENGTH_SHORT).show();
            }
        });
        ratman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"woman" ,Toast.LENGTH_LONG).show();
            }
        });
    }
}
package com.maptech.about;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class AboutActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView contactWhatsAppIcon = findViewById(R.id.contactWhatsAppIcon);
        ImageView contactTelegramIcon = findViewById(R.id.contactTelegramIcon);

        contactWhatsAppIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openWhatsApp();
            }
        });

        contactTelegramIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTelegram();
            }
        });
    }

    private void openWhatsApp() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://wa.me/+15513366369"));
        startActivity(intent);
    }

    private void openTelegram() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://t.me/maptechgh"));
        startActivity(intent);
    }
}

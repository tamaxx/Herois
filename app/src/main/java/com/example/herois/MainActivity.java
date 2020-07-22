package com.example.herois;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void RedirecionarBatman(View v){

        Intent batman = new Intent(this, BatmanActivity.class);
        startActivity(batman);

    }

    public void RedirecionarLanterna(View v){

        Intent lanterna = new Intent(this, LanternaActivity.class);
        startActivity(lanterna);

    }

    public void RedirecionarSuperman(View v){

        Intent superman = new Intent(this, SupermanActivity.class);
        startActivity(superman);

    }

    public void RedirecionarMaravilha(View v){

        Intent maravilha = new Intent(this, MaravilhaActivity.class);
        startActivity(maravilha);

    }

    public void RedirecionarSite(View v){
        Uri site = Uri.parse("https://www.dccomics.com/characters/justice-league");
        Intent saiba_mais = new Intent(Intent.ACTION_VIEW, site);
        startActivity(saiba_mais);
    }
}

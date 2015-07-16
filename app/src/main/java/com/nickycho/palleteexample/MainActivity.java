package com.nickycho.palleteexample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.graphics.Palette;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.drawable.dragonball);

        Palette palette = Palette.from(bitmap).generate();
        Palette.Swatch vibrantSwatch = palette.getVibrantSwatch();
        Palette.Swatch vibrantDarkSwatch = palette.getDarkVibrantSwatch();
        Palette.Swatch vibrantLightSwatch = palette.getLightVibrantSwatch();
        Palette.Swatch mutedSwatch = palette.getMutedSwatch();
        Palette.Swatch mutedDarkSwatch = palette.getDarkMutedSwatch();
        Palette.Swatch mutedLightSwatch = palette.getLightMutedSwatch();

        TextView vibrantTv = (TextView) findViewById(R.id.vibrantTv);
        TextView vibrantDarkTv = (TextView) findViewById(R.id.vibrantDarkTv);
        TextView vibrantLightTv = (TextView) findViewById(R.id.vibrantLightTv);
        TextView mutedTv = (TextView) findViewById(R.id.mutedTv);
        TextView mutedDarkTv = (TextView) findViewById(R.id.mutedDarkTv);
        TextView mutedLightTv = (TextView) findViewById(R.id.mutedLightTv);


        vibrantTv.setTextColor(vibrantSwatch.getTitleTextColor());
        vibrantTv.setBackgroundColor(vibrantSwatch.getRgb());

        vibrantDarkTv.setTextColor(vibrantDarkSwatch.getTitleTextColor());
        vibrantDarkTv.setBackgroundColor(vibrantDarkSwatch.getRgb());

        vibrantLightTv.setTextColor(vibrantLightSwatch.getTitleTextColor());
        vibrantLightTv.setBackgroundColor(vibrantLightSwatch.getRgb());

        mutedTv.setTextColor(mutedSwatch.getTitleTextColor());
        mutedTv.setBackgroundColor(mutedSwatch.getRgb());

        mutedDarkTv.setTextColor(mutedDarkSwatch.getTitleTextColor());
        mutedDarkTv.setBackgroundColor(mutedDarkSwatch.getRgb());

        mutedLightTv.setTextColor(mutedLightSwatch.getTitleTextColor());
        mutedLightTv.setBackgroundColor(mutedLightSwatch.getRgb());


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

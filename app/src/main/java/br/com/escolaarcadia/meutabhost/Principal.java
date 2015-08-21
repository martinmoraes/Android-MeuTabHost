package br.com.escolaarcadia.meutabhost;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TabHost;

public class Principal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        TabHost tabHost = (TabHost) findViewById(R.id.otabhost);
        tabHost.setup();

        TabHost.TabSpec tab1 = tabHost.newTabSpec("TAB_1");
        tab1.setContent(R.id.home);
        tab1.setIndicator("", getResources().getDrawable(R.mipmap.home));
        tabHost.addTab(tab1);

        TabHost.TabSpec tab2 = tabHost.newTabSpec("TAB_2");
        tab2.setContent(R.id.procurar);
        tab2.setIndicator("", getResources().getDrawable(R.mipmap.lupa));
        tabHost.addTab(tab2);

        TabHost.TabSpec tab3 = tabHost.newTabSpec("TAB_3");
        tab3.setContent(R.id.camera);
        tab3.setIndicator("", getResources().getDrawable(R.mipmap.camera));
        tabHost.addTab(tab3);

        TabHost.TabSpec tab4 = tabHost.newTabSpec("TAB_4");
        tab4.setContent(R.id.seguir);
        tab4.setIndicator("", getResources().getDrawable(R.mipmap.seguindo));
        tabHost.addTab(tab4);

        TabHost.TabSpec tab5 = tabHost.newTabSpec("TAB_5");
        tab5.setContent(R.id.perfil);
        tab5.setIndicator("", getResources().getDrawable(R.mipmap.perfil));
        tabHost.addTab(tab5);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_principal, menu);
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

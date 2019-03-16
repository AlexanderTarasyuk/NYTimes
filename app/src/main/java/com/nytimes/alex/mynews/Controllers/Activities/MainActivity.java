package com.nytimes.alex.mynews.Controllers.Activities;

import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.nytimes.alex.mynews.Adapters.PageAdapter;
import com.nytimes.alex.mynews.R;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity implements  NavigationView.OnNavigationItemSelectedListener {

    //FOR DESIGN
    private Toolbar mToolbar;
    private DrawerLayout mDrawerLayout;
    private NavigationView mNavigationView;

    // For data
    public static final String SECTION = "SECTION";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.configureToolbar();
        this.configureDrawerLayout();
        this.configureNavigationView();
        this.configureViewPager();
    }

    // -------------
    // ACTION
    // -------------

    // Handle actions on menu items
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_activity_main_search:
                startActivity(new Intent(this, SearchActivity.class));
                return true;
            case R.id.menu_params_notifications:
                startActivity(new Intent(this, NotifActivity.class));
                return true;
            case R.id.menu_params_about:
                Toast.makeText(this, item.getTitle() + "clicked !", Toast.LENGTH_LONG).show();
                return true;
            case R.id.menu_params_help:
                Toast.makeText(this, item.getTitle() + "clicked !", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // inflate the menu and add it to the Toolbar
        getMenuInflater().inflate(R.menu.menu_activity_main, menu);
        return true;
    }

    @Override
    public void onBackPressed() {
        // Handle back click to close menu
        if (this.mDrawerLayout.isDrawerOpen(GravityCompat.START)){
            this.mDrawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle Navigation Drawer Item Click

        int id= item.getItemId();

        switch (id){
            case R.id.activity_main_drawer_automobiles:
                sendData(getString(R.string.automobiles));
            case R.id.activity_main_drawer_movies:
                sendData(getString(R.string.movies));
            case R.id.activity_main_drawer_science:
                sendData(getString(R.string.science));
            case R.id.activity_main_drawer_technology:
                sendData(getString(R.string.technology));
            case R.id.activity_main_drawer_world:
                sendData(getString(R.string.world));
            default:
                break;
        }

        this.mDrawerLayout.closeDrawer(GravityCompat.START);

        return true;
    }

    // -------------
    // CONFIGURATION
    // -------------

    // Configure Toolbar
    private void configureToolbar() {
        // Get the toolbar view inside the activity layout
        this.mToolbar = (Toolbar) findViewById(R.id.activity_main_toolbar);
        // Sets the Toolbar
        setSupportActionBar(mToolbar);
    }

    // Configure Drawer Layout
    private void configureDrawerLayout(){
        this.mDrawerLayout = (DrawerLayout) findViewById(R.id.activity_main_drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        mDrawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    // Configure NavigationView
    private void configureNavigationView(){
        this.mNavigationView = (NavigationView) findViewById(R.id.activity_main_nav_view);
        mNavigationView.setNavigationItemSelectedListener(this);
    }

    // Configure ViewPager
    private void configureViewPager(){
        ViewPager pager = (ViewPager) findViewById(R.id.activity_main_viewpager);
        pager.setAdapter(new PageAdapter(getSupportFragmentManager()));
        TabLayout tabs = (TabLayout) findViewById(R.id.activity_main_tabs);
        tabs.setupWithViewPager(pager);
        tabs.setTabMode(TabLayout.MODE_FIXED);
    }

    // ----------------
    // NAV DRAWER DATA
    // ----------------

    private void sendData(String section){
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);
        intent.putExtra("QUERY", "null");
        intent.putExtra("FROM_DATE", "20000101");
        intent.putExtra("TO_DATE", getCurrentDay());
        intent.putExtra("CHECKBOXES", "news_desk(\""+section+"\")");
        startActivity(intent);
    }

    // getCurrentDay inside a String
    private String getCurrentDay(){
        Date curDate = new Date();

        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
        String dateToStr = format.format(curDate);

        return dateToStr;
    }
}

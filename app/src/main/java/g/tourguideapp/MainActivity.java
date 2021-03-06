package g.tourguideapp;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    FragmentManager manager = getSupportFragmentManager();
    ImageView menuArrow;
    TextView helpText;
    TextView welcomeText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        menuArrow = (ImageView) findViewById(R.id.arrow);
        helpText = (TextView) findViewById(R.id.main_help_text);
        welcomeText = (TextView) findViewById(R.id.main_welcome_text);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_events) {
            menuArrow.setVisibility(View.INVISIBLE);
            helpText.setVisibility(View.INVISIBLE);
            welcomeText.setVisibility(View.INVISIBLE);
            Events events = new Events();
            manager.beginTransaction().replace(R.id.fragment, events).commit();
        } else if (id == R.id.nav_museums) {
            menuArrow.setVisibility(View.INVISIBLE);
            helpText.setVisibility(View.INVISIBLE);
            welcomeText.setVisibility(View.INVISIBLE);
            Museums museums = new Museums();
            manager.beginTransaction().replace(R.id.fragment, museums).commit();
        } else if (id == R.id.nav_other_atractions) {
            menuArrow.setVisibility(View.INVISIBLE);
            helpText.setVisibility(View.INVISIBLE);
            welcomeText.setVisibility(View.INVISIBLE);
            OtherAtractions otherAtractions = new OtherAtractions();
            manager.beginTransaction().replace(R.id.fragment, otherAtractions).commit();
        } else if (id == R.id.nav_restaurants) {
            menuArrow.setVisibility(View.INVISIBLE);
            helpText.setVisibility(View.INVISIBLE);
            welcomeText.setVisibility(View.INVISIBLE);
            Restaurants restaurants = new Restaurants();
            manager.beginTransaction().replace(R.id.fragment, restaurants).commit();
        } else if (id == R.id.fragment_main) {
            menuArrow.setVisibility(View.VISIBLE);
            helpText.setVisibility(View.VISIBLE);
            welcomeText.setVisibility(View.VISIBLE);
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}

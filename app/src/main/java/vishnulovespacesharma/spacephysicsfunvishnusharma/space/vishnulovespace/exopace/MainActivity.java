package vishnulovespacesharma.spacephysicsfunvishnusharma.space.vishnulovespace.exopace;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout myDrawerLayout;
    private ActionBarDrawerToggle myActionToggle;
    private NavigationView navigationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myDrawerLayout = findViewById(R.id.drawer_layout);
        navigationView =findViewById(R.id.nav_id);
        myActionToggle = new ActionBarDrawerToggle(this,myDrawerLayout,R.string.open,R.string.close);

        myDrawerLayout.addDrawerListener(myActionToggle);
        myActionToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                myDrawerLayout.closeDrawers();
                int id = item.getItemId();
                if(id == R.id.Exoplanets){
                    Intent intent = new Intent(MainActivity.this,ExoplanetIntro.class);
                    startActivity(intent);
                    return true;
                }
                if(id == R.id.dis_from_earth){
                    Intent intent = new Intent(MainActivity.this,DistanceFromEarth.class);
                    startActivity(intent);
                    return true;
                }
                if(id == R.id.inclination){
                    Intent intent = new Intent(MainActivity.this,Inclination.class);
                    startActivity(intent);
                    return true;
                }
                if(id == R.id.orbital_period){
                    Intent intent = new Intent(MainActivity.this,OrbitalPeriod.class);
                    startActivity(intent);
                    return true;
                }
                if(id == R.id.orphan_planet){
                    Intent intent = new Intent(MainActivity.this,RoguePlanet.class);
                    startActivity(intent);
                    return true;
                }
                if(id == R.id.facts){
                    Intent intent = new Intent(MainActivity.this,Results.class);
                    startActivity(intent);
                    return true;
                }


                return true;
            }
        });
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id1 = item.getItemId();
        if(myActionToggle.onOptionsItemSelected(item))
        {
                return true;

        }
        return super.onOptionsItemSelected(item);
    }
}

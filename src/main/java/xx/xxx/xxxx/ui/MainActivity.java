package xx.xxx.xxxx.ui;

import android.app.Activity;

import android.app.ActionBar;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.widget.DrawerLayout;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import xx.xxx.xxxx.R;
import xx.xxx.xxxx.ui.adapter.ViewPagerAdapter;

public class MainActivity extends Activity
        implements NavigationDrawerFragment.NavigationDrawerCallbacks {

    /**
     * Fragment managing the behaviors, interactions and presentation of the navigation drawer.
     */
    private NavigationDrawerFragment mNavigationDrawerFragment;
    /**
     * Used to store the last screen title. For use in {@link #restoreActionBar()}.
     */
    private CharSequence mTitle;

    ViewPager viewPager ;
    ActionBar actionBar;
    Button btn1,btn2,btn3;

    boolean e1= false,e2= false,e3= false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mNavigationDrawerFragment = (NavigationDrawerFragment)
                getFragmentManager().findFragmentById(R.id.navigation_drawer);


        // Set up the drawer.
        mNavigationDrawerFragment.setUp(
                R.id.navigation_drawer,
                (DrawerLayout) findViewById(R.id.drawer_layout));

        //Set action bar
        actionBar = getActionBar();
        actionBar.setBackgroundDrawable((getResources().getDrawable(R.drawable.barrasuperior)));
        actionBar.setDisplayShowTitleEnabled(false);

        //ViewPager
       // viewPager = (ViewPager) findViewById(R.id.viewPager);

       // ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(this);
       // viewPager.setAdapter(viewPagerAdapter);

        //Buttons
        //Btn1
        btn1 = (Button)findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "btn1", Toast.LENGTH_SHORT).show();
            }
        });

        //Btn2
        btn2 = (Button)findViewById(R.id.btn2);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "btn2", Toast.LENGTH_SHORT).show();
            }
        });

        //Btn3
        btn3 = (Button)findViewById(R.id.btn3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "btn3", Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    protected void onResume() {
        super.onResume();

        if(e1 == true){
            if (e1 == true && e2 == true){
                if (e1 == true && e2 == true && e3== true){
                    startActivity(new Intent(this,ConversationActivity.class));
                }
            }
        }

    }

    @Override
    public void onNavigationDrawerItemSelected(int position) {
        // update the main content by replacing fragments
        switch (position){
            case 0:
                e1 = false;
                e2 = false;
                e3 = false;
                break;
            case 1:
                e1 = false;
                e2 = false;
                e3 = false;
                break;
            case 2:
                e1 = false;
                e2 = false;
                e3 = false;
                break;
            case 3:
                e1 = false;
                e2 = false;
                e3 = false;
                break;
            case 4:
                e1 = false;
                e2 = false;
                e3 = false;
                break;
            case 5:
                e1 = false;
                e2 = false;
                e3 = false;
                break;
            case 6:
                e1 = false;
                e2 = false;
                e3 = false;
                break;
            case 7:
                e1 = false;
                e2 = false;
                e3 = false;
                break;
            case 8:
                e1 = false;
                e2 = false;
                e3 = false;
                break;
            case 9:
                Toast.makeText(this, "e1: "+e1+" e2: "+e2+" e3: "+e3, Toast.LENGTH_SHORT).show();
                e3 = true;
                if(e1 == true && e2 == true && e3 == true) startActivity(new Intent(this,ConversationActivity.class));
                break;
            case 10:
                Toast.makeText(this, "e1: "+e1+" e2: "+e2+" e3: "+e3, Toast.LENGTH_SHORT).show();
                e2 = true;
                break;
            case 11:
                Toast.makeText(this, "e1: "+e1+" e2: "+e2+" e3: "+e3, Toast.LENGTH_SHORT).show();
                e1 = true;
                break;
        }
    }


    public void restoreActionBar() {
        ActionBar actionBar = getActionBar();
        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_STANDARD);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setTitle(mTitle);
    }


}

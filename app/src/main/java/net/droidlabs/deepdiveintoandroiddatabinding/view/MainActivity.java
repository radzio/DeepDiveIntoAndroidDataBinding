package net.droidlabs.deepdiveintoandroiddatabinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import net.droidlabs.deepdiveintoandroiddatabinding.App;
import net.droidlabs.deepdiveintoandroiddatabinding.R;
import net.droidlabs.deepdiveintoandroiddatabinding.databinding.ActivityMainBinding;
import net.droidlabs.deepdiveintoandroiddatabinding.services.Navigator;
import net.droidlabs.deepdiveintoandroiddatabinding.viewmodel.MainViewModel;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity
{
    private ActivityMainBinding binding;

    @Inject
    MainViewModel mainViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        this.initAndBindViewModel();
        this.initSupportActionBar();
        this.initNavigationDrawer();
    }

    private void initAndBindViewModel()
    {
        App.component(this).inject(this);
        this.binding.setViewModel(mainViewModel);
        this.binding.setNavigator(new Navigator(this));
    }

    private void initNavigationDrawer()
    {
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        this.binding.drawerLayout.setDrawerListener(toggle);
        toggle.syncState();
    }

    private void initSupportActionBar()
    {
        this.setSupportActionBar(binding.toolbar);
    }

    @Override
    public void onBackPressed()
    {
        if (this.binding.drawerLayout.isDrawerOpen(GravityCompat.START))
        {
            this.binding.drawerLayout.closeDrawer(GravityCompat.START);
        }
        else
        {
            super.onBackPressed();
        }
    }
}

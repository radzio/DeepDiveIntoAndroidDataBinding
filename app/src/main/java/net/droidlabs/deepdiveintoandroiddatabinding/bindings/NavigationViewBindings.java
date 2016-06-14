package net.droidlabs.deepdiveintoandroiddatabinding.bindings;

import android.databinding.BindingAdapter;
import android.support.design.widget.NavigationView;
import android.view.MenuItem;
import net.droidlabs.deepdiveintoandroiddatabinding.services.Navigator;

public class NavigationViewBindings
{
    @BindingAdapter({"navigator"})
    public static void bindNaviagor(final NavigationView navigationView, final Navigator navigator)
    {
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(MenuItem item)
            {
                return navigator.onItemSelected(item.getItemId());
            }
        });
    }
}

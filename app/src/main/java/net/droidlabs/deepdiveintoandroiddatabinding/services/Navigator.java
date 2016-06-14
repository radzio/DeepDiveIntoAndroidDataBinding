package net.droidlabs.deepdiveintoandroiddatabinding.services;

import android.content.Context;
import android.content.Intent;
import net.droidlabs.deepdiveintoandroiddatabinding.R;
import net.droidlabs.deepdiveintoandroiddatabinding.view.TwoWayBindingActivity;

public class Navigator
{
    private final Context context;

    public Navigator(Context context)
    {
        this.context = context;
    }

    public boolean onItemSelected(int id)
    {
        if(id == R.id.nav_custom_to_way_databinging)
        {
            this.context.startActivity(new Intent(this.context, TwoWayBindingActivity.class));
            return true;
        }

        return false;
    }
}

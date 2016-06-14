package net.droidlabs.deepdiveintoandroiddatabinding;

import android.app.Application;
import android.content.Context;
import net.droidlabs.deepdiveintoandroiddatabinding.di.DiComponent;

public class App extends Application
{
    private DiComponent component;

    @Override
    public void onCreate()
    {
        super.onCreate();
        this.buildComponentAndInject();
    }

    public static DiComponent component(Context context)
    {
        return ((App) context.getApplicationContext()).component;
    }

    private void buildComponentAndInject()
    {
        this.component = DiComponent.Initializer.init(this);
        this.component.inject(this);
    }
}

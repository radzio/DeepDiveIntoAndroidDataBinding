package net.droidlabs.deepdiveintoandroiddatabinding.di;

import android.content.Context;
import dagger.Module;
import dagger.Provides;
import net.droidlabs.deepdiveintoandroiddatabinding.services.ISendService;
import net.droidlabs.deepdiveintoandroiddatabinding.services.SendService;

@Module
public class AppModule
{
    private Context context;

    public AppModule(Context context)
    {
        this.context = context;
    }

    @Provides
    public ISendService provideSendService()
    {
        return new SendService(this.context);
    }
}

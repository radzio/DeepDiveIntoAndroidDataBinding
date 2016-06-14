package net.droidlabs.deepdiveintoandroiddatabinding.di;

import dagger.Component;
import net.droidlabs.deepdiveintoandroiddatabinding.App;
import net.droidlabs.deepdiveintoandroiddatabinding.view.MainActivity;

import javax.inject.Singleton;

@Singleton
@Component(modules = {
        AppModule.class})
public interface DiComponent
{
    void inject(App app);

    void inject(MainActivity mainActivity);


    final class Initializer
    {
        private Initializer()
        {

        }

        public static DiComponent init(App app)
        {
            return DaggerDiComponent.builder()
                    .appModule(new AppModule(app))
                    .build();
        }
    }
}
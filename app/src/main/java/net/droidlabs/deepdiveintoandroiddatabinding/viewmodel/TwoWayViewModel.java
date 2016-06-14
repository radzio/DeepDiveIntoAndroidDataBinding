package net.droidlabs.deepdiveintoandroiddatabinding.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import net.droidlabs.deepdiveintoandroiddatabinding.BR;

public class TwoWayViewModel extends BaseObservable
{
    private int color;

    public void setColor(int color)
    {
        this.color = color;
        this.notifyPropertyChanged(BR.color);
    }

    @Bindable
    public int getColor()
    {
        return this.color;
    }
}

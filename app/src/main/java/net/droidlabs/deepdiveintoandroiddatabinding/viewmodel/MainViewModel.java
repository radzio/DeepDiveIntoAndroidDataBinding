package net.droidlabs.deepdiveintoandroiddatabinding.viewmodel;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.view.View;
import net.droidlabs.deepdiveintoandroiddatabinding.BR;
import net.droidlabs.deepdiveintoandroiddatabinding.services.ISendService;

import javax.inject.Inject;

public class MainViewModel extends BaseObservable
{
    private final ISendService sendService;

    private String twoWayText;

    @Inject
    public MainViewModel(ISendService sendService)
    {
        this.sendService = sendService;
    }

    public void sendAction()
    {
        this.sendService.send();
    }

    public void sendAction(View view)
    {
        this.sendService.send();
    }

    public void setTwoWayText(String twoWayText)
    {
        this.twoWayText = twoWayText;
        this.notifyPropertyChanged(BR.twoWayText);
    }

    @Bindable
    public String getTwoWayText()
    {
        return this.twoWayText;
    }
}

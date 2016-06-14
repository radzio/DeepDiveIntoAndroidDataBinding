package net.droidlabs.deepdiveintoandroiddatabinding.view;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import net.droidlabs.deepdiveintoandroiddatabinding.R;
import net.droidlabs.deepdiveintoandroiddatabinding.databinding.ActivityTwoWayBinding;
import net.droidlabs.deepdiveintoandroiddatabinding.viewmodel.TwoWayViewModel;

public class TwoWayBindingActivity extends AppCompatActivity
{
    private ActivityTwoWayBinding binding;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.binding = DataBindingUtil.setContentView(this, R.layout.activity_two_way);
        this.binding.setViewModel(new TwoWayViewModel());
    }
}

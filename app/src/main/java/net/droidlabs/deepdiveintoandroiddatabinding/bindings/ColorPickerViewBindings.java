package net.droidlabs.deepdiveintoandroiddatabinding.bindings;

import android.databinding.*;
import com.github.danielnilsson9.colorpickerview.view.ColorPickerView;

public abstract class ColorPickerViewBindings
{
    @BindingAdapter("color")
    public static void setColor(ColorPickerView view, int color)
    {
        if (color != view.getColor())
        {
            view.setColor(color);
        }
    }

    @InverseBindingAdapter(attribute = "color", event = "colorAttrChanged")
    public static int getColor(ColorPickerView view)
    {
        return view.getColor();
    }

    @BindingAdapter("colorAttrChanged")
    public static void setColorListener(ColorPickerView view, final InverseBindingListener colorChange)
    {
        if (colorChange == null)
        {
            view.setOnColorChangedListener(null);
        }
        else
        {
            view.setOnColorChangedListener(new ColorPickerView.OnColorChangedListener()
            {
                @Override
                public void onColorChanged(int newColor)
                {
                    colorChange.onChange();
                }
            });
        }
    }
}

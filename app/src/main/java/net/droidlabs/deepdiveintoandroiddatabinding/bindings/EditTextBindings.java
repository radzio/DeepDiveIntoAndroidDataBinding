package net.droidlabs.deepdiveintoandroiddatabinding.bindings;

import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.graphics.Color;
import android.support.annotation.ColorInt;
import android.widget.EditText;

public class EditTextBindings
{
    private static String convertIntColorToString(@ColorInt int color)
    {
        return String.format("#%06X", (0xFFFFFF & color));
    }

    @ColorInt
    private static int convertHexColorToColor(String color)
    {
        try
        {
            return Color.parseColor(color);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return 0;
    }

    @BindingAdapter("android:text")
    public static void setText(EditText view, int value)
    {
        boolean setValue = view.getText().length() == 0;
        try
        {
            if (!setValue)
            {
                setValue = convertHexColorToColor(view.getText().toString()) != value;
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        if (setValue)
        {
            view.setText(convertIntColorToString(value));
        }
    }

    @InverseBindingAdapter(attribute = "android:text")
    public static int getText(EditText view)
    {
        try
        {
            return convertHexColorToColor(view.getText().toString());
        }
        catch (NumberFormatException e)
        {
            return 0;
        }
    }
}

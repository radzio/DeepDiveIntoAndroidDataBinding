package net.droidlabs.deepdiveintoandroiddatabinding.services;

import android.content.Context;
import android.widget.Toast;

public class SendService implements ISendService
{
    private final Context context;

    public SendService(Context context)
    {
        this.context = context;
    }

    @Override
    public void send()
    {
        Toast.makeText(this.context, "Message was sent!", Toast.LENGTH_SHORT).show();
    }
}

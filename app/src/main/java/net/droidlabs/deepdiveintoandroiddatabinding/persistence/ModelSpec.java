package net.droidlabs.deepdiveintoandroiddatabinding.persistence;

import android.net.Uri;
import com.yahoo.squidb.annotations.ColumnSpec;
import com.yahoo.squidb.annotations.ModelMethod;
import com.yahoo.squidb.annotations.TableModelSpec;

@TableModelSpec(className = "Model", tableName = "models")
public class ModelSpec
{
    public static final Uri CONTENT_URI = Uri.parse("content://com.yahoo.squidb.sample/tasks");

    @ColumnSpec(constraints = "NOT NULL")
    String title;

    @ColumnSpec(defaultValue = "0")
    long completionDate;

    @ColumnSpec(defaultValue = "0")
    long dueDate;

    @ColumnSpec(defaultValue = "0")
    int priority;

    @ModelMethod
    public static boolean isCompleted(Model instance)
    {
        return instance.getCompletionDate() > 0;
    }
}
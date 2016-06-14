package net.droidlabs.deepdiveintoandroiddatabinding.persistence;

import android.content.Context;
import com.yahoo.squidb.data.SquidDatabase;
import com.yahoo.squidb.data.adapter.SQLiteDatabaseWrapper;
import com.yahoo.squidb.sql.Index;
import com.yahoo.squidb.sql.Table;

public class Database extends SquidDatabase
{

    private static final int VERSION = 2;

    public Database(Context context)
    {
        super(context);
    }

    @Override
    public String getName()
    {
        return "hello-squidb-tasks.db";
    }

    @Override
    protected int getVersion()
    {
        return VERSION;
    }

    @Override
    protected Table[] getTables()
    {
        return new Table[]{
                Model.TABLE
        };
    }

    @Override
    protected Index[] getIndexes()
    {
        return new Index[]{
                Model.TABLE.index("tag_taskid_idx", Model.ID)
        };
    }

    @Override
    protected boolean onUpgrade(SQLiteDatabaseWrapper db, int oldVersion, int newVersion)
    {
        return false;
    }

}
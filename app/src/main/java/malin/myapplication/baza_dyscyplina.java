package malin.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by Malin on 07.05.2017.
 */

public class baza_dyscyplina extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;

    public baza_dyscyplina(Context context)
    {
        super(context, "dyscyplinaDB", null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase database)
    {
        String DATABASE_CREATE = "create table dyscyplina" + "(_id integer primary key autoincrement," +
                "nazwa text not null," + "kategoria text not null, " + "popularnosc int not null)";
        database.execSQL(DATABASE_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL("DROP TABLE IF EXISTS dyscyplina");
        onCreate(db);
    }
}

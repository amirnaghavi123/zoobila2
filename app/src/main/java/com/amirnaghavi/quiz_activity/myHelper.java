package com.amirnaghavi.quiz_activity;

import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.widget.Toast;

/**
 * Created by amir on 2015-07-06.
 */
public class myHelper extends SQLiteOpenHelper {

    private Context context;


    private static final String CREATE_TABLE =
            "CREATE TABLE "+
                    Constants.TABLE_NAME + " (" +
                    Constants.UID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    Constants.GAME_TYPE + " TEXT, " +
                    Constants.QUESTION + " TEXT, " +
                    Constants.OPTION_A + " TEXT, " +
                    Constants.OPTION_B + " TEXT, " +
                    Constants.OPTION_C + " TEXT, " +
                    Constants.OPTION_D + " TEXT, " +
                    Constants.ANSWER + " TEXT);" ;

    private static final String DROP_TABLE = "DROP TABLE IF EXISTS " + Constants.TABLE_NAME;

    public myHelper(Context context){
        super (context, Constants.DATABASE_NAME, null, Constants.DATABASE_VERSION);
        this.context = context;
    }



    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            db.execSQL(CREATE_TABLE);
            Toast.makeText(context, "onCreate() called", Toast.LENGTH_LONG).show();
        } catch (SQLException e) {
            Toast.makeText(context, "exception onCreate() db", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        try {
            db.execSQL(DROP_TABLE);
            onCreate(db);
            Toast.makeText(context, "onUpgrade called", Toast.LENGTH_LONG).show();
        } catch (SQLException e) {
            Toast.makeText(context, "exception onUpgrade() db", Toast.LENGTH_LONG).show();
        }

    }
}

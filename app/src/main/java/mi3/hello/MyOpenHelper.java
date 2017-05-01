package mi3.hello;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class MyOpenHelper extends SQLiteOpenHelper{

    Context context;
    public MyOpenHelper(Context context) {
       super(context, "data.sqlite", null, 1);
        this.context = context;
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE member (mode INTEGER, money INTEGER, etc VARCHAR(50));");
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("CREATE TABLE member (name VARCHAR(20), money INTEGER, etc VARCHAR(50));");
    }
}

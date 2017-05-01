package mi3.hello;


import android.app.Activity;
import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.app.Activity;
import android.database.Cursor;


public class MainActivity extends AppCompatActivity {
    String databaseName = "Database";
    String tableName = "Table";
    TextView status;
    boolean databaseCreated = false;
    boolean tableCreated = false;
    SQLiteDatabase db;
    SQLiteDatabase db2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyOpenHelper helper = new MyOpenHelper(this);

        TextView tb = (TextView)findViewById(R.id.a);
        SQLiteDatabase db = helper.getWritableDatabase();

        db.execSQL("insert into member(name, money, etc) values ('apple', 10000, 'a');");

    }

}

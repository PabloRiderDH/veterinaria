import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper     {
    private static final String DATABASE_NAME = "miBaseDeDatos";
    private static final int DATABASE_VERSION = 1;

    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Crea las tablas necesarias cuando se crea la base de datos por primera vez
        db.execSQL("CREATE TABLE IF NOT EXISTS miTabla (_id INTEGER PRIMARY KEY AUTOINCREMENT, nombre TEXT);");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Maneja las actualizaciones de la base de datos si es necesario
    }
}

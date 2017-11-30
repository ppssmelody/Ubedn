package anandjamts.ubedn;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by T on 11/29/2017.
 */

public class DBHandler extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "УБЭДН";
    // Contacts table name
    private static final String TABLE_STANTS = "Дэд станц";
    private static final String NO = "№";
    private static final String RP = "РП дугаар";
    private static final String YCHNO = "яч№";
    private static final String FIDER_NER = "Фидерийн нэр";
    private static final String TOOLUURIIN_MARK = "тоолуурын марк";
    private static final String TOOLUURIIN_DUGAAR = "тоолуурын дугаар";
    private static final String GUIDLIIN_TR_IIN_MARK = "Гүйдлийн тр-рын Марк";
    private static final String GUIDLIIN_TR_IIN_C_FAZ_NO = "Гүйдлийн тр-рын С фаз №";
    private static final String GUIDLIIN_TR_IIN_A_FAZ_NO = "Гүйдлийн тр-рын А фаз №";
    private static final String GUIDLIIN_TR_IIN_KO = "Гүйдлийн тр-рын коэф";
    private static final String HUCHDELIIN_TR_IIN_MARK = "Хүчдэлийн тр-рын марк";
    private static final String HUCHDELIIN_TR_IIN_DUGAAR = "Хүчдэлийн тр-рын дугаар";
    private static final String HUCHDELIIN_TR_IIN_KO = "Хүчдэлийн тр-рын коэф";
    private static final String LATS_NO = "Лац№";
    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    public DBHandler(Context context, String name, SQLiteDatabase.CursorFactory factory, int version, DatabaseErrorHandler errorHandler) {
        super(context, name, factory, version, errorHandler);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String CREATE_STANTS_TABLE = "CREATE TABLE" + TABLE_STANTS + "("
        + NO + " INTEGER," + RP + " TEXT NOT NULL," + YCHNO + " INTEGER," + FIDER_NER + " TEXT NOT NULL," + TOOLUURIIN_MARK + "TEXT NOT NULL,"
        + TOOLUURIIN_DUGAAR + "DECIMAL NOT NULL," + GUIDLIIN_TR_IIN_MARK + " TEXT,"
        + GUIDLIIN_TR_IIN_C_FAZ_NO + "DECIMAL," + GUIDLIIN_TR_IIN_A_FAZ_NO + "DECIMAL,"
        + GUIDLIIN_TR_IIN_KO + "INTEGER," + HUCHDELIIN_TR_IIN_MARK + " TEXT,"
        + HUCHDELIIN_TR_IIN_DUGAAR + " DECIMAL," + HUCHDELIIN_TR_IIN_KO + " INTEGER,"
        + LATS_NO + " DECIMAL" + ")";
        sqLiteDatabase.execSQL(CREATE_STANTS_TABLE);
    }
    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        try {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_STANTS);
            onCreate(sqLiteDatabase);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void addINFO(Stants stants){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(NO,stants.getno());
        values.put(RP,stants.getRP());
        values.put(YCHNO,stants.getychno());
        values.put(FIDER_NER,stants.getfiderner());
        values.put(TOOLUURIIN_MARK,stants.gettooluuriinMark());
        values.put(TOOLUURIIN_DUGAAR,stants.gettooluuriinDugaar());
        values.put(GUIDLIIN_TR_IIN_MARK,stants.getgtrMark());
        values.put(GUIDLIIN_TR_IIN_C_FAZ_NO,stants.getgtrCFazNo());
        values.put(GUIDLIIN_TR_IIN_A_FAZ_NO,stants.getgtrAFazNo());
        values.put(GUIDLIIN_TR_IIN_KO,stants.getgtrKo());
        values.put(HUCHDELIIN_TR_IIN_MARK,stants.gethtrMark());
        values.put(HUCHDELIIN_TR_IIN_DUGAAR,stants.gethtrDugaar());
        values.put(HUCHDELIIN_TR_IIN_KO,stants.gethtrKo());
        values.put(LATS_NO,stants.getlatsNo());

        db.insert(TABLE_STANTS,null,values);
        db.close();
    }
    public Stants getStants(String rp){
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor cursor = db.query(TABLE_STANTS,null,null,null,RP,null,null);
        String[] columnNames = cursor.getColumnNames();
        Cursor c = db.rawQuery("SELECT * FROM "+TABLE_STANTS, null);
        try {
            String[] columnNames1 = c.getColumnNames();
        } finally {
            c.close();
        }
    }
}

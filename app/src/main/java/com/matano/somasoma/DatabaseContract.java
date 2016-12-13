package com.matano.somasoma;

import android.provider.BaseColumns;

/**
 * Created by matano on 26/11/16.
 */

public final class DatabaseContract
{
    private static final String TEXT_TYPE = " TEXT";
    private static final String INT_TYPE = " INTEGER";
    private static final String COMMA = ",";

    private DatabaseContract()
    {
    }

    public static class DatabaseEntry implements BaseColumns
    {
        private static final String TABLE_NAME = "entry";
        private static final String COLUMN_SEMESTER = "semester";
        private static final String COLUMN_SUBJECT = "subject";
        private static final String COLUMN_UNIT = "unit";
        private static final String COLUMN_TOPIC = "topic";
        private static final String COLUMN_URL = "url";

        public static final String SQL_CREATE_ENTRY =
                "CREATE TABLE " + DatabaseEntry.TABLE_NAME + " ( " +
                        DatabaseEntry.COLUMN_SEMESTER + TEXT_TYPE + COMMA +
                        DatabaseEntry.COLUMN_SUBJECT + TEXT_TYPE + COMMA +
                        DatabaseEntry.COLUMN_UNIT + INT_TYPE + COMMA +
                        DatabaseEntry.COLUMN_TOPIC + TEXT_TYPE + COMMA +
                        DatabaseEntry.COLUMN_URL + TEXT_TYPE + " )";

        public static final String SQL_DELETE_ENTRY =
                "DROP TABLE IF EXISTS " + DatabaseEntry.TABLE_NAME;

    }


}

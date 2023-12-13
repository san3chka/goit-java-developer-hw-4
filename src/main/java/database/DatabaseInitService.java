package database;

import database.service.Service;
import prefs.Prefs;

public class DatabaseInitService {
    public static void main(String[] args) {
        Database database = Database.getInstance();
        Service service = new Service();

        String initDbSqlFilePath = new Prefs().getString(Prefs.INIT_DB_SQL_FILE_PATH);

        service.executeUpdate(database, initDbSqlFilePath);
    }
}

package database;

import database.classesForQueries.LongestProject;
import database.classesForQueries.MaxProjectCountClient;
import database.classesForQueries.PrintProjectPrices;
import database.classesForQueries.YoungestEldestWorker;
import database.service.Service;
import prefs.Prefs;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {
    private static final Database DATABASE = Database.getInstance();

    public List<MaxProjectCountClient> findMaxProjectsClient() {
        List<MaxProjectCountClient> result = new ArrayList<>();
        String filePath = new Prefs().getString(Prefs.FIND_MAX_PROJECTS_CLIENT_DB_SQL_FILE_PATH);

        try (Statement st = DATABASE.getConnection().createStatement();
             ResultSet rs = st.executeQuery(new Service().readSqlAndReturnString(filePath))) {

            while (rs.next()) {
                String name = rs.getString("name");
                int projectCount = rs.getInt("project_count");

                MaxProjectCountClient var = new MaxProjectCountClient(
                        name,
                        projectCount
                );

                result.add(var);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<LongestProject> findLongestProject() {
        List<LongestProject> result = new ArrayList<>();
        String filePath = new Prefs().getString(Prefs.FIND_LONGEST_PROJECT_DB_SQL_FILE_PATH);

        try (Statement st = DATABASE.getConnection().createStatement();
             ResultSet rs = st.executeQuery(new Service().readSqlAndReturnString(filePath))) {

            while (rs.next()) {
                int projectId = rs.getInt("project_id");
                int clientId = rs.getInt("client_id");
                LocalDate startDate = rs.getDate("start_date").toLocalDate();
                LocalDate finishDate = rs.getDate("finish_date").toLocalDate();
                int monthDuration = rs.getInt("month_duration");

                LongestProject var = new LongestProject(
                        projectId,
                        clientId,
                        startDate,
                        finishDate,
                        monthDuration
                );

                result.add(var);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<PrintProjectPrices> printProjectPrices() {
        List<PrintProjectPrices> result = new ArrayList<>();
        String filePath = new Prefs().getString(Prefs.PRINT_PROJECT_PRICES_DB_SQL_FILE_PATH);

        try (Statement st = DATABASE.getConnection().createStatement();
             ResultSet rs = st.executeQuery(new Service().readSqlAndReturnString(filePath))) {

            while (rs.next()) {
                int projectId = rs.getInt("project_id");
                int price = rs.getInt("price");

                PrintProjectPrices var = new PrintProjectPrices(
                        projectId,
                        price
                );

                result.add(var);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }

    public List<YoungestEldestWorker> findYoungestEldestWorker() {
        List<YoungestEldestWorker> result = new ArrayList<>();
        String filePath = new Prefs().getString(Prefs.FIND_YOUNGEST_ELDEST_WORKER_DB_SQL_FILE_PATH);

        try (Statement st = DATABASE.getConnection().createStatement();
             ResultSet rs = st.executeQuery(new Service().readSqlAndReturnString(filePath))) {

            while (rs.next()) {
                String type = rs.getString("type");
                String name = rs.getString("name");
                LocalDate birthday = rs.getDate("birthday").toLocalDate();

                YoungestEldestWorker var = new YoungestEldestWorker(
                        type,
                        name,
                        birthday
                );

                result.add(var);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return result;
    }
}

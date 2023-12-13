import database.DatabaseQueryService;
import database.classesForQueries.LongestProject;
import database.classesForQueries.MaxProjectCountClient;
import database.classesForQueries.PrintProjectPrices;
import database.classesForQueries.YoungestEldestWorker;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LongestProject> list1 = new DatabaseQueryService().findLongestProject();
        for(LongestProject s : list1) {
            System.out.println(s);
        }

        System.out.println("-----------------------");

        List<MaxProjectCountClient> list2 = new DatabaseQueryService().findMaxProjectsClient();
        for(MaxProjectCountClient s : list2) {
            System.out.println(s);
        }

        System.out.println("-----------------------");

        List<PrintProjectPrices> list3 = new DatabaseQueryService().printProjectPrices();
        for(PrintProjectPrices s : list3) {
            System.out.println(s);
        }

        System.out.println("-----------------------");

        List<YoungestEldestWorker> list4 = new DatabaseQueryService().findYoungestEldestWorker();
        for(YoungestEldestWorker s : list4) {
            System.out.println(s);
        }
    }
}
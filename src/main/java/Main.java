import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
        List<Employee> list = Utils.parseCSV(columnMapping, fileName);
        String json = Utils.listToJson(list);
        Utils.writeString(json,"data.json");

        List<Employee> list2 = Utils.parseXML("data.xml");
        String json2 = Utils.listToJson(list2);
        Utils.writeString(json2,"data2.json");

    }
}

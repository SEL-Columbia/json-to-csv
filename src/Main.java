import com.jsontocsv.parser.JsonFlattener;
import com.jsontocsv.writer.CSVWriter;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        JsonFlattener parser = new JsonFlattener();
        CSVWriter writer = new CSVWriter();

        List<Map<String, String>> flatJson = parser.parseJson(jsonValue());
        writer.writeAsCSV(flatJson, "sample.csv");
    }

    private static String jsonValue() {
        return "[\n" +
                "    {\n" +
                "        \"studentName\": \"Foo\",\n" +
                "        \"Age\": \"12\",\n" +
                "        \"subjects\": [\n" +
                "            {\n" +
                "                \"name\": \"English\",\n" +
                "                \"marks\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"History\",\n" +
                "                \"marks\": \"50\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"studentName\": \"Bar\",\n" +
                "        \"Age\": \"12\",\n" +
                "        \"subjects\": [\n" +
                "            {\n" +
                "                \"name\": \"English\",\n" +
                "                \"marks\": \"40\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"History\",\n" +
                "                \"marks\": \"50\"\n" +
                "            },\n" +
                "            {\n" +
                "                \"name\": \"Science\",\n" +
                "                \"marks\": \"40\"\n" +
                "            }\n" +
                "        ]\n" +
                "    },\n" +
                "    {\n" +
                "        \"studentName\": \"Baz\",\n" +
                "        \"Age\": \"12\",\n" +
                "        \"subjects\": []\n" +
                "    }\n" +
                "]";
    }
}

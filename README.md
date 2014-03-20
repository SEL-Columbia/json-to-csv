####JSON To CSV Converter


This code can be used for generating a flat CSV file from a list of JSON Objects. The [JSONFlattener](https://github.com/kumaranvram/json-to-csv/blob/master/src/com/lasercode/parser/JsonFlattener.java) will create list of key-value pairs for the generated JSON. The [CSVWriter](https://github.com/kumaranvram/json-to-csv/blob/master/src/com/lasercode/printer/CsvWriter.java) would write the key value pairs to the specified file.

For example, consider the JSON format:
````json
[
    {
        "studentName": "Foo",
        "Age": "12",
        "subjects": [
            {
                "name": "English",
                "marks": "40"
            },
            {
                "name": "History",
                "marks": "50"
            }
        ]
    },
    {
        "studentName": "Bar",
        "Age": "12",
        "subjects": [
            {
                "name": "English",
                "marks": "40"
            },
            {
                "name": "History",
                "marks": "50"
            },
            {
                "name": "Science",
                "marks": "40"
            }
        ]
    },
    {
        "studentName": "Baz",
        "Age": "12",
        "subjects": []
    }
]
````

would generate a CSV as below:

| Age | studentName | subjects1marks | subjects1name | subjects2marks | subjects2name | subjects3marks | subjects3name |
|-----|-------------|----------------|---------------|----------------|---------------|----------------|---------------|
| 12  | Foo         | 40             | English       | 50             | History       |                |               |
| 12  | Bar         | 40             | English       | 50             | History       | 40             | Science       |
| 12  | Baz         |                |               |                |               |                |               |


The column names would dynamically be generated based on the keys in the JSON object.

The sample output file can be seen [here](https://github.com/kumaranvram/json-to-csv/blob/master/sample.csv).

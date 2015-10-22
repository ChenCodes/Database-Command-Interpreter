package db61b;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;


/** FIXME
 * @author Yuxi Chen
 */


/** Tests basic functionality including:
* 1. The row class
*/
public class BasicTests {
    @Test
    public void testRowGet() {
        Row r = new Row(new String[]{"Jack", "is", "writing", "this", "test."});
        assertEquals("Jack", r.get(0));
        Row m = new Row(new String[]{"Jack", "is", "writing", "this", "test."});
        assertEquals(true, r.equals(m));

    }

    @Test
    public void testRowSize() {
        Row r = new Row(new String[]{"Jack", "is", "writing", "this", "test."});
        assertEquals(5, r.size());

    }

    @Test
    public void testRowEquals() {
        Row r = new Row(new String[]{"Jack", "is", "writing", "this", "test."});
        Row m = new Row(new String[]{"Jack", "is", "writing", "this", "test."});
        assertEquals(true, r.equals(m));
    }

    @Test
    public void testTableColumns() {
        String[] titles = {"Name", "SID", "Year"};
        Table newTable = new Table(titles);
        assertEquals(3, newTable.columns());
        Table z = new Table(new String[]{"Name", "Surname", "Grade"});
        Row a = new Row(new String[]{"Jason", "Knowles", "B"});
        Row b = new Row(new String[]{"Shana", "Brown", "B"});
        Row c = new Row(new String[]{"Yangfan", "Chan", "B"});
        Row d = new Row(new String[]{"Valerie", "Chan", "B"});
        z.add(a);
        z.add(b);
        z.add(c);
        z.add(d);
    }


    @Test
    public void testTableGetTitle() {
        String[] titles = {"Name", "SID", "Year"};
        Table newTable = new Table(titles);
        assertEquals("SID", newTable.getTitle(1));
        assertEquals(2, newTable.findColumn("Year"));
        Table z = new Table(new String[]{"Name", "Surname", "Grade"});
        Row a = new Row(new String[]{"Jason", "Knowles", "B"});
        Row b = new Row(new String[]{"Shana", "Brown", "B"});
        Row c = new Row(new String[]{"Yangfan", "Chan", "B"});
        Row d = new Row(new String[]{"Valerie", "Chan", "B"});
        z.add(a);
        z.add(b);
        z.add(c);
        z.add(d);
    }

    @Test
    public void testTableFindColumn() {
        String[] titles = {"Name", "SID", "Year"};
        Table newTable = new Table(titles);
        assertEquals(2, newTable.findColumn("Year"));

    }

    @Test
    public void testTablePrint() {
        Table z = new Table(new String[]{"Name", "Surname", "Grade"});
        Row a = new Row(new String[]{"Jason", "Knowles", "B"});
        Row b = new Row(new String[]{"Shana", "Brown", "B"});
        Row c = new Row(new String[]{"Yangfan", "Chan", "B"});
        Row d = new Row(new String[]{"Valerie", "Chan", "B"});
        z.add(a);
        z.add(b);
        z.add(c);
        z.add(d);
        z.print();
    }

    @Test
    public void testTableWrite() {
        Table z = new Table(new String[]{"Name", "Surname", "Grade"});
        Row a = new Row(new String[]{"Jason", "Knowles", "B"});
        Row b = new Row(new String[]{"Shana", "Brown", "B"});
        Row c = new Row(new String[]{"Yangfan", "Chan", "B"});
        Row d = new Row(new String[]{"Valerie", "Chan", "B"});
        z.add(a);
        z.add(b);
        z.add(c);
        z.add(d);
        z.writeTable("hello");
    }



    @Test
    public void testColumnGetName() {
        Table z = new Table(new String[]{"Name", "Surname", "Grade"});
        Row a = new Row(new String[]{"Jason", "Knowles", "B"});
        Row b = new Row(new String[]{"Shana", "Brown", "B"});
        Row c = new Row(new String[]{"Yangfan", "Chan", "B"});
        Row d = new Row(new String[]{"Valerie", "Chan", "B"});
        z.add(a);
        z.add(b);
        z.add(c);
        z.add(d);
        Column newColumn = new Column("Surname", z);
        assertEquals("Surname", newColumn.getName());
    }

    @Test
    public void testColumnGetFrom() {
        Table z = new Table(new String[]{"Name", "Surname", "Grade"});
        Row a = new Row(new String[]{"Jason", "Knowles", "B"});
        Row b = new Row(new String[]{"Shana", "Brown", "B"});
        Row c = new Row(new String[]{"Yangfan", "Chan", "B"});
        Row d = new Row(new String[]{"Valerie", "Chan", "B"});
        z.add(a);
        z.add(b);
        z.add(c);
        z.add(d);
        Column newColumn = new Column("Surname", z);
        assertEquals("Brown", newColumn.getFrom(b));



    }
    @Test
    public void testDatabasePut() {
        String[] titles = {"Name", "SID", "Year"};
        Table newTable = new Table(titles);
        Row e = new Row(new String[]{"Jason", "12345", "2013"});
        Row f = new Row(new String[]{"Shana", "23456", "2014"});
        Row g = new Row(new String[]{"Yangfan", "34567", "2012"});
        Row h = new Row(new String[]{"Valerie", "45678", "2011"});

        Table z = new Table(new String[]{"Name", "Surname", "Grade"});
        Row a = new Row(new String[]{"Jason", "Knowles", "B"});
        Row b = new Row(new String[]{"Shana", "Brown", "B"});
        Row c = new Row(new String[]{"Yangfan", "Chan", "B"});
        Row d = new Row(new String[]{"Valerie", "Chan", "B"});
        z.add(a);
        z.add(b);
        z.add(c);
        z.add(d);

        Database database1 = new Database();
        database1.put("TABLEZ", z);
        database1.put("NEWTABLE", newTable);

    }

    @Test
    public void testDatabaseGet() {
        String[] titles = {"Name", "SID", "Year"};
        Table newTable = new Table(titles);
        Row e = new Row(new String[]{"Jason", "12345", "2013"});
        Row f = new Row(new String[]{"Shana", "23456", "2014"});
        Row g = new Row(new String[]{"Yangfan", "34567", "2012"});
        Row h = new Row(new String[]{"Valerie", "45678", "2011"});

        Table z = new Table(new String[]{"Name", "Surname", "Grade"});
        Row a = new Row(new String[]{"Jason", "Knowles", "B"});
        Row b = new Row(new String[]{"Shana", "Brown", "B"});
        Row c = new Row(new String[]{"Yangfan", "Chan", "B"});
        Row d = new Row(new String[]{"Valerie", "Chan", "B"});
        z.add(a);
        z.add(b);
        z.add(c);
        z.add(d);

        Database database1 = new Database();
        database1.put("TABLEZ", z);
        database1.put("NEWTABLE", newTable);

        assertEquals(z, database1.get("TABLEZ"));
        assertEquals(newTable, database1.get("NEWTABLE"));
    }

    @Test
    public void testCondition() {
        String[] titles = {"Name", "SID", "Year"};
        Table newTable = new Table(titles);

        Row e = new Row(new String[]{"Jason", "12345", "2013"});
        Row f = new Row(new String[]{"Shana", "23456", "2014"});
        Row g = new Row(new String[]{"Yangfan", "34567", "2012"});
        Row h = new Row(new String[]{"Valerie", "45678", "2011"});
        newTable.add(e);
        newTable.add(f);
        newTable.add(g);
        newTable.add(h);

        Column sidColumn = new Column("SID", newTable);
        Column nameColumn = new Column("Name", newTable);
        Column yearColumn = new Column("Year", newTable);

        String comparison = ">";
        String number = "2012";

        List<Condition> listConditions = new ArrayList<Condition>();
        Condition sidYear = new Condition(sidColumn, comparison, yearColumn);
        Condition numberCompare = new Condition(yearColumn, comparison, number);
        listConditions.add(sidYear);
        listConditions.add(numberCompare);

        assertEquals(false, Condition.test(listConditions, e));
        assertEquals(true, Condition.test(listConditions, f));
    }

    @Test
    public void testTableSelect() {
        String[] titles = {"Name", "SID", "Year"};
        Table newTable = new Table(titles);

        Row e = new Row(new String[]{"Jason", "12345", "2013"});
        Row f = new Row(new String[]{"Shana", "23456", "2014"});
        Row g = new Row(new String[]{"Yangfan", "34567", "2012"});
        Row h = new Row(new String[]{"Valerie", "45678", "2011"});
        newTable.add(e);
        newTable.add(f);
        newTable.add(g);
        newTable.add(h);

        List<String> columnTitles = new ArrayList<String>();
        String columnTitle = "SID";
        columnTitles.add(columnTitle);

        String comparison = ">";
        String number = "2012";
        Column sidColumn = new Column("SID", newTable);
        Column nameColumn = new Column("Name", newTable);
        Column yearColumn = new Column("Year", newTable);
        List<Condition> listConditions = new ArrayList<Condition>();
        Condition sidYear = new Condition(sidColumn, comparison, yearColumn);
        Condition numberCompare = new Condition(yearColumn, comparison, number);
        listConditions.add(sidYear);
        listConditions.add(numberCompare);

        Table selectTable = newTable.select(columnTitles, listConditions);
        assertEquals(1, selectTable.columns());
    }

    @Test
    public void testTwoTableSelect() {
        String[] titles = {"SID", "Lastname", "Firstname",
            "SemEnter", "YearEnter", "Major"};
        Table students = new Table(titles);
        Row a = new Row(new String[]{"101", "Knowles",
            "Jason", "F", "2003", "EECS"});
        Row b = new Row(new String[]{"102", "Chan", "Valerie",
            "S", "2003", "Math"});
        Row c = new Row(new String[]{"103", "Xavier", "Jonathan",
            "S", "2004", "LSUnd"});
        Row d = new Row(new String[]{"104", "Armstrong", "Thomas",
            "F", "2003", "EECS"});
        Row e = new Row(new String[]{"105", "Brown", "Shana", "S",
            "2004", "EECS"});
        Row f = new Row(new String[]{"106", "Chan", "Yangfan", "F",
            "2003", "LSUnd"});
        students.add(a);
        students.add(b);
        students.add(c);
        students.add(d);
        students.add(e);
        students.add(f);
        String[] titles2 = {"SID", "CCN", "Grade"};
        Table enrolled = new Table(titles2);
        Row a2 = new Row(new String[]{"101", "21228", "B"});
        Row b2 = new Row(new String[]{"101", "21105", "B+"});
        Row c2 = new Row(new String[]{"101", "21232", "A-"});
        Row d2 = new Row(new String[]{"101", "21001", "B"});
        Row e2 = new Row(new String[]{"102", "21231", "A"});
        Row f2 = new Row(new String[]{"102", "21105", "A-"});
        Row g2 = new Row(new String[]{"102", "21229", "A"});
        Row h2 = new Row(new String[]{"102", "21001", "B+"});
        Row i2 = new Row(new String[]{"103", "21105", "B+"});
        Row j2 = new Row(new String[]{"103", "21005", "B+"});
        Row k2 = new Row(new String[]{"104", "21228", "A-"});
        enrolled.add(a2);
        enrolled.add(b2);
        enrolled.add(c2);
        enrolled.add(d2);
        enrolled.add(e2);
        enrolled.add(f2);
        enrolled.add(g2);
        enrolled.add(h2);
        enrolled.add(i2);
        enrolled.add(j2);
        enrolled.add(j2);
        enrolled.add(k2);
        List<Condition> currentConditions = new ArrayList<Condition>();
        String[] allColumns = {"SID", "CCN", "Grade", "Lastname",
            "Firstname", "SemEnter", "YearEnter", "Major" };
        List<String> allColumns1 = new ArrayList<String>();
        for (String item : allColumns) {
            allColumns1.add((String) item);
        }
        Table combined = students.select(enrolled,
            allColumns1, currentConditions);
        System.out.println("This is the cartesian product of the two tables");
        combined.print();
    }




    public static void main(String[] args) {
        System.exit(ucb.junit.textui.runClasses(BasicTests.class));
    }
}

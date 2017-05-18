package lv.tele2.javacourses;

public abstract class Record {
    private static int recordCount;
    private int id;

    public Record() {
        recordCount++;
        id = recordCount;
    }

    public int getId() {
        return id;
    }

    public abstract boolean contains(String str);
}

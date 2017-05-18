package lv.tele2.javacourses;


import asg.cliche.Command;

public class Note extends Record {
    private String note;

    public String getNote() {
        return note;
    }

    @Command
    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Note{" +
                "id='" + getId() + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

    @Override
    public boolean contains(String str) {
        return note.toLowerCase().contains(str.toLowerCase());
    }
}

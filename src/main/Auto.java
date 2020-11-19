package main;

public class Auto {
    public String mark;
    public String model;
   private int year;
    public boolean isFourMatic;

    public void printFullName (){
        System.out.println(mark + " " + model);
    }
    public int getYear(){
        return year;
    }

    public void setYear(int year) {
        if (year >= 1988 && year <= 2020)
            this.year = year;

    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public boolean isFourMatic() {
        return isFourMatic;
    }

    public void setFourMatic(boolean fourMatic) {
        isFourMatic = fourMatic;
    }
}
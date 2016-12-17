package com.example.snark_55.crimer;
import java.util.Date;

public class Crime {
    Date dat;
    boolean isSolved;
    String title;
    Crime(Date d, boolean b,String t){
        dat=d;
        isSolved=b;
        title=t;
    }
    Crime(boolean b,String t){
        dat=new Date(2016,01,01);
        isSolved=b;
        title=t;
    }
    public String getTitle(){return title;}
    public Date getDate(){return dat;}
    public Boolean getB(){return isSolved;}
    public void setTitle(String s){title=s;}
    public void setDate(Date d){dat=d;}
    public void setB(Boolean b){isSolved=b;}
}

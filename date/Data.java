package date;
//import java.util.Date;
public class Data {
    private long millisec;
    private long sec;
    private long cursec;
    private long min;
    private long curmin;
    private long hour;
    private long curhour;
    private long day;
    private long curday;
    private long save;
    private long curmonth;
    private long year;
    private long curyear;

    public Data(){

    }

    public Data(long millisec){
        this.millisec=millisec;
    }

    public void setMillisec(long millisec) {
        this.millisec = millisec;
    }
    @Override
    public String toString() {
        this.sec=millisec/1000;
        this.cursec=this.sec%60;
        this.min=this.sec/60;
        this.curmin=this.min%60;
        this.hour=this.min/60;
        this.curhour=this.hour%24;
        this.day=this.hour/24;
        this.year=this.day/365;
        this.save=(this.day-(365*this.year));
        this.curmonth=this.save/30;
        this.curday=this.day%30;
        this.curyear=this.year+1970;
        this.curmonth=(this.curmonth==0)?1:this.curmonth;
        this.curday=(this.curday==0)?1:this.curday;
        return "Data{" +
                "showdate=" + this.curyear+"-year,"+this.curmonth+"(month), " +this.curday+"(day), "+(this.curhour)+":"+curmin+":"+cursec+'}';

    }
 }

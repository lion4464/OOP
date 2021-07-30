package Stopwatch;

public class Stopwatch {
    private long StartTime;
    private long EndTime;

    public Stopwatch() {
    this.StartTime=System.nanoTime();
    }


    //========== get started time==============
    public long getStartTime() {
        return StartTime;
    }
//============get End time===================
    public long getEndTime() {
        return EndTime;
    }
//================set startTime==============
    public void start() {
        this.StartTime = System.nanoTime();
    }
//===============set EndTime==================
    public void stop() {
        this.EndTime = System.nanoTime();
    }
//==========Calculate Execution time=================

    public void getElapsedTime() {
        System.out.println("ElapsedTime = " + (this.EndTime-this.StartTime)+"nano sekund" );
    }
}

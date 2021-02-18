package VisitCount;

public class UserStats {
    private long visitCount =0;

    public UserStats(){}

    public UserStats(long visitCount){
        setVisitCount(visitCount);
    }

    public long getVisitCount() {
        return visitCount;
    }

    public void setVisitCount(long visitCount ){
        this.visitCount = visitCount;
    }

}

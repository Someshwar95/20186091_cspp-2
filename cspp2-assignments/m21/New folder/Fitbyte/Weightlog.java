public class Weightlog {
    private String date;
    private String time;
    private String weight;
    private String fatpercentage;

    Weightlog() {
    }

    Weightlog(String[] wt) {
        date = wt[0];
        time = wt[1];
        weight = wt[2];
        fatpercentage = wt[3];
    }

    public String getdate() {
        return date;
    }
    public void setdate(String dt) {
        date = dt;
    }

    public String gettime() {
        return time;
    }
    public void settime(String tme) {
        time = tme;
    }

    public String getweight() {
        return weight;
    }
    public void setweight(String wgt) {
        weight = wgt;
    }

    public String getfatpercentage() {
        return fatpercentage;
    }
    public void setfatpercentage(String fatpercent) {
        fatpercentage = fatpercent;
    }
    public String toString() {
        return "Date:" +
               date + "\n" + "Time:" + time + "\n" + "Weight:" +
               weight + "\n" + "Fat:" + fatpercentage;
    }
}
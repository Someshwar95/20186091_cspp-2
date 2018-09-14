import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for solution.
 */
class Show {
    String moviename;
    String date;
    String[] seats;
    public Show(String moviename, String dateandtime, String[] seats) {
        moviename = moviename;
        date = dateandtime;
        seats = seats;
    }
}
class Patron {
    String name;
    String pnumber;
    public Patron(String name, String pnumber) {
        name = name;
        pnumber = pnumber;
    }
}
class BookYourShow {
    public Show[] allshows;
    public int allshowscount;
    public Patron[] allpatrons;
    public int allpatronscount;
    public BookYourShow() {
        allshows = new Show[10];
        allshowscount = 0;

    }
    public void addAShow(Show show) {
        allshows[allshowscount++] = show;

    }
    public void bookAShow(String moviename, String date, 
        Patron pa, String[] seats) {
        Show checkshow = getAShow(moviename,date);
        if(checkshow != null){
            int flag = 0;
            for(int i=0;i<seats.length;i++){
                for(int j=0;j<checkshow.seats.length;j++) {
                    if(seats[i].equals(checkshow.seats[j])){
                        checkshow.seats[j] = "N/A";
                        flag = 1;
                    }
                }
            }
            for(int p=0;p<allshowscount;p++){
                if(allshows[p].moviename.equals(checkshow.moviename)&&
                    allshows[p].date.equals(checkshow.date)){
                    allshows[p] = checkshow;
                }
            }
            if(flag==1) {
                allpatrons[allpatronscount++]=pa;
            }
        }

    }
    public Show getAShow(String moviename, String date) {
        for (int i=0;i<allshowscount;i++) {
            if(allshows[i].moviename.equals(moviename)&&
                allshows[i].date.equals(date)) {
                return allshows[i];
            }
        }
        return null;

    }
    public void printTicket(String moviename,String date,String pnumber) {
        Show checkshow = getAShow(moviename,date);
        if(checkshow != null) {
            for(int i=0;i<allpatronscount;i++){
                if(allpatrons[i].pnumber.equals(pnumber)){
                    System.out.println(pnumber + " " +moviename + " " + date);
                    break;
                }
            }
        }

    }
    public void showAll() {
        for (int i=0;i<allshowscount;i++) {
            String st = allshows[i].moviename + "," + allshows[i].date + ",";
            String onlyseats = "[";
            for (int j=0;j<allshows[i].seats.length;j++) {
                onlyseats += allshows[i].seats[j];
                if(i<allshows[i].seats.length-1) {
                    onlyseats += ",";
                }
                
            }
            onlyseats += "]";
            st += onlyseats;
            System.out.println(st);
        }
    }
}

public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }

    /**
     * main method to drive program.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        BookYourShow bys = new BookYourShow();
        Scanner scan = new Scanner(System.in);
        int testCases = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < testCases; i++) {
            String[] tokens = scan.nextLine().
                replace("[", "").replace("]", "").split(",");
                System.out.println(Arrays.toString(tokens));
            String[] check = tokens[0].split(" ");
            switch (check[0]) {
                case "add":
                    int k = 2;
                    String[] seats = new String[tokens.length - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.addAShow(new Show(check[1], tokens[1], seats));
                break;

                case "book":
                    k = 2 + 2;
                    seats = new String[tokens.length - 2 - 2];
                    for (int j = 0; j < seats.length; j++) {
                        seats[j] = tokens[k++];
                    }
                    bys.bookAShow(check[1], tokens[1],
                        new Patron(tokens[2], tokens[2 + 1]), seats);
                break;

                case "get":
                    Show show = bys.getAShow(check[1], tokens[1]);
                    if (show != null) {
                       System.out.println(show);
                    } else {
                        System.out.println("No show");
                    }
                break;

                case "print":
                    bys.printTicket(check[1], tokens[1], tokens[2]);
                break;

                case "showAll":
                    bys.showAll();
                break;

                default:
                break;
            }
        }
    }
}

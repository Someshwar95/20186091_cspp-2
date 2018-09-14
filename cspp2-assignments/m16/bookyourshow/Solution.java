import java.util.Scanner;
import java.util.Arrays;

/**
 * Class for solution.
 */
class Show {
    public String moviename;
    public String date;
    public String[] seats;
    public Show(final String moviename, final String dateandtime, final String[] seats) {
        this.moviename = moviename;
        this.date = dateandtime;
        this.seats = seats;
    }
}
/**.
 * Class for patron.
 */
class Patron {
    /**.
     * { var_description }
     */
    public String name;
    /**.
     * { var_description }
     */
    public String pnumber;
    /**.
     * Constructs the object.
     *
     * @param      name     The name
     * @param      pnumber  The pnumber
     */
    public Patron(final String name, final String pnumber) {
        this.name = name;
        this.pnumber = pnumber;
    }
}
/**.
 * Class for book your show.
 */
class BookYourShow {
    /**.
     * { var_description }
     */
    public Show[] allshows;
    /**.
     * { var_description }
     */
    public int allshowscount;
    /**.
     * { var_description }
     */
    public Patron[] allpatrons;
    /**.
     * { var_description }
     */
    public int allpatronscount;
    /**.
     * Constructs the object.
     */
    public BookYourShow() {
        allshows = new Show[10];
        allshowscount = 0;
        allpatrons = new Patron[10];
        allpatronscount = 0;

    }
    /**.
     * Adds a show.
     *
     * @param      show  The show
     */
    public void addAShow(final Show show) {
        allshows[allshowscount++] = show;

    }
    /**.
     * { function_description }
     *
     * @param      moviename  The moviename
     * @param      date       The date
     * @param      pa         { parameter_description }
     * @param      seats      The seats
     */
    public void bookAShow(final String moviename, final String date,
        final Patron pa, final String[] seats) {
        Show checkshow = getAShow(moviename, date);
        if (allshowscount == 0) {
            System.out.println("No show");
        } else {
            if (checkshow != null) {
            int flag = 0;
            for (int i = 0; i < seats.length; i++) {
                for (int j = 0; j < checkshow.seats.length; j++) {
                    if (seats[i].equals(checkshow.seats[j])) {
                        checkshow.seats[j] = "N/A";
                        flag = 1;
                    }
                }
            }
            for (int p = 0; p < allshowscount; p++) {
                if (allshows[p].moviename.equals(checkshow.moviename) &&
                    allshows[p].date.equals(checkshow.date)) {
                    allshows[p] = checkshow;
                }
            }
            if (flag == 1) {
                allpatrons[allpatronscount++] = pa;
            }
        } else {
            System.out.println("No show");
        }

        }
    }
    /**.
     * Gets a show.
     *
     * @param      moviename  The moviename
     * @param      showdate   The showdate
     *
     * @return     A show.
     */
    public Show getAShow(final String moviename, final String showdate) {
        for (int i = 0; i < allshowscount; i++) {
            if (allshows[i].moviename.equals(moviename)
                && allshows[i].date.equals(showdate)) {
                return allshows[i];
            }
        }
        return null;

    }
    /**.
     * { function_description }
     *
     * @param      moviename  The moviename
     * @param      date       The date
     * @param      pnumber    The pnumber
     */
    public void printTicket(final String moviename,
        final String date, final String pnumber) {
        Show checkshow = getAShow(moviename, date);
        if (checkshow != null) {
            int flag = 0;
            for (int i = 0; i < allpatronscount; i++) {
                if (allpatrons[i].pnumber.equals(pnumber)) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println(pnumber + " " + moviename + " " + date);
            } else {
                System.out.println("Invalid");
            }
        } else {
            System.out.println("Invalid");
        }

    }
    /**.
     * Shows all.
     */
    public void showAll() {
        for (int i = 0; i < allshowscount; i++) {
            String st = allshows[i].moviename + "," + allshows[i].date + ",";
            String onlyseats = "[";
            for (int j = 0; j < allshows[i].seats.length; j++) {
                onlyseats += allshows[i].seats[j];
                if (j < allshows[i].seats.length - 1) {
                    onlyseats += ",";
                }
            }
            onlyseats += "]";
            st += onlyseats;
            System.out.println(st);
        }
    }
}

/**.
 * { item_description }
 */
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
                // System.out.println(Arrays.toString(tokens));
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
                       System.out.println(show.moviename + "," + show.date);
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

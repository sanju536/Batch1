public class Bowler {
    String name;
    int wickets;
    int matches;
    int balls_bowled;
    int runs_conceded;
    public Bowler() {
        this.name = "";
        this.wickets = 0;
        this.matches = 0;
        this.balls_bowled = 0;
        this.runs_conceded = 0;
    }
    public Bowler(String name,int wickets,int matches,int balls_bowled,int runs_conceded){
        this.name=name;
        this.wickets = wickets;
        this.matches = matches;
        this.balls_bowled = balls_bowled;
        this.runs_conceded = runs_conceded;
    }
    public void computeBowlingAverage(){
        if (wickets < 0 || matches < 0 ||balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
        } else if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
        }
        else{
            System.out.println("Name:"+name);
            double Bowling_avg= (double)runs_conceded/wickets;
            System.out.println("bowling_avg="+Bowling_avg);
            }

    }
    void showStatistics(){
        if (wickets < 0 || matches < 0 ||balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
        } else if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
        }
        else{
        System.out.println("Name="+name);
        System.out.println("wickets="+wickets);
        System.out.println("matches="+matches);
        System.out.println("balls_bowled="+balls_bowled);
        System.out.println("runs_conceded="+runs_conceded);
        }
    }
    void computeStrikeRate(){
        if (wickets < 0 || matches < 0 ||balls_bowled < 0 || runs_conceded < 0) {
            System.out.println("Error");
        } else if (matches == 0 && (runs_conceded > 0 || balls_bowled > 0)) {
            System.out.println("Error");
        }
        else{
            System.out.println("Name:"+name);
            double Strike= (double)runs_conceded/balls_bowled;
            System.out.printf("Strike_rate=%.8f\n",Strike);
        }
    }
    public static void main(String[] args) {
        Bowler bo=new Bowler();
        Bowler b=new Bowler("Sachin",10,5,750,463);
        b.computeBowlingAverage();
        b.showStatistics();
        b.computeStrikeRate();
    }

}


import java.util.Date;

public class Fixtures {

            private String Matches;
            private String Date;
            private String time;

//code all the other setters and getters and modify toString()

            public Fixtures(String Matches,String Date,String time) {  //No argument Constructor

                this.Matches = Matches;
                this.Date = Date;
                this.time = time;
            }

            public String getMatches() {
                return Matches;
            }
            public String getDate() {
                return Date;
            }
            public String getTime() {
               return time;
            }

            public void setMatches(String Matches) {
                this.Matches = Matches;
            }
            public void setDate(String Date) {
              this.Date = Date;
             }
            public void setTime(String Time) {
            this.time = time;
            }





    @Override

            public String toString() {
                return "Matches :" + Matches +
                      "\n" + "Date :" + Date +
                      "\n" + " Time :" + time ;
            }
}

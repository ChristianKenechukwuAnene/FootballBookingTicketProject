public class Fixtutes {

    public class SeasonFixtures {
        private String Matches;

        public SeasonFixtures(String Matches) {  //No argument Constructor
            this.Matches = Matches;
        }

        public String getMatches() {
            return Matches;
        }
        public void setMatches(String Matches) {
            this.Matches = Matches;
        }

        @Override
        public String toString() {
            return "Matches :" + Matches;

        }
    }
}

//Christian Anene
public class BookingD{
    private String fixture;
    private String name;
    private String email;
    private String block;
    private String row;
    private String seat;

    public  BookingD (String fixture,String name,String email, String block, String row, String seat ){              //No argument Constructor
        this.fixture = fixture;
        this.name = name;
        this.email = email;
        this.block = block;
        this.row = row;
        this.seat = seat;
    }

    public String getFixture() {
        return fixture;
    }
    public void setFixture(String fixture) {
        this.fixture = fixture;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getBlock() {
        return block;
    }
    public void setBlock(String block) {
        this.block = block;
    }
    public String getRow() {
        return row;
    }
    public void setRow(String row) {
        this.row = row;
    }
    public String getSeat() {
        return seat;
    }
    public void setSeat(String seat) {
        this.seat = seat;
    }
       @Override
       public String toString(){
        return  "Fixture :" + fixture +
                "\n" + "Name :" + name +
                "\n" + " Email :" + email +
                "\n" + "  Block :" + block +
                "\n" + " Row :" + row +
                "\n" + " Seat :" + seat;
       }
}
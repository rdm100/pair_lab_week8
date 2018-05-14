import db.DBGolfer;
import models.Golfer;

import java.util.List;

public class Runner {

    public static void main(String[] args) {
        Golfer golfer = new Golfer("Chris", "Marshall", 25);
        Golfer golfer2 = new Golfer("Craig", "Marshall", 25);
        Golfer golfer3 = new Golfer("Roberto", "Marshall", 25);
        DBGolfer.save(golfer);
        DBGolfer.save(golfer2);
        DBGolfer.save(golfer3);

        List<Golfer> golfers = DBGolfer.getGolfers();

        DBGolfer.delete(golfer2);

        Golfer foundGolfer = DBGolfer.find(golfer3.getId());

        golfer.setFirstName("dbwjkeahbfshjkwbfjhklbaeskjhvbaskhjdbv");

        DBGolfer.update(golfer);
    }
}

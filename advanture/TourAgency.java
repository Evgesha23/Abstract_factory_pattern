package advanture;

import advanture.Season.*;
import advanture.Tour.*;
import advanture.factories.*;

public class TourAgency {
    private Tour tour;
    private Season season;

    public TourAgency(WorkFactory factory) {
        tour = factory.chooseTour();
        season = factory.chooseSeason();
        if (tour instanceof Rest) season.game();
    }

    public void paint() {
        tour.paint();
        season.paint();
    }
}

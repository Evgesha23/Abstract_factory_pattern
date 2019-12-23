package advanture.factories;

import advanture.Season.Season;
import advanture.Tour.Tour;

public interface WorkFactory {
    Season chooseSeason();
    Tour chooseTour();
}

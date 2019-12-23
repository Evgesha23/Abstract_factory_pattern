package advanture.factories;

import advanture.Season.*;
import advanture.Tour.*;
//фабрика создания тура экскурсии (в витебск) зимой
public class TourAgencyFactoryVitebsk implements WorkFactory {
    @Override
    public Season chooseSeason() {
        return new Winter();
    }
    @Override
    public Tour chooseTour() {
        return new Excursion();
    }
}

package advanture.factories;

import advanture.Season.*;
import advanture.Tour.*;
//фабрика создания тура (из Минска вылет) для отдыха летом
public class TourAgencyFactoryMinsk implements WorkFactory {
    @Override
    public Season chooseSeason() {
        return new Summer();
    }
    @Override
    public Tour chooseTour() {
        return new Rest();
    }
}

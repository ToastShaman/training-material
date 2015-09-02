package example01;

import java.util.logging.Logger;

public class CircumferenceService {

    private final static Logger log = Logger.getLogger(CircumferenceService.class.getName());

    public static double PI = 22 / 7;

    /**
     * @param input
     * @param isRadius
     * @return
     */
    public void calCircum(double input, boolean isRadius, CircumferenceVO vo) {
        try {
            log.info("START calCircum()");
            log.info("input: "    + input);
            log.info("isRadius: " + isRadius);
            double _r = 0;
            double _l = -1;
            double _p = -1;
            if (isRadius) {
                log.info("Using radius formula");
                _r = PI * 2 * input;
//                } else if (isInCentimeter) {
//                    log.info("Using radius formula in centimeter");
//                    _l = -2; _p = -3;
//                    _r = PI * 2 * (input * 10);
            } else {
                log.info("Using diameter formula");
                _r = PI * 2 * (input / 2);
            }
            log.info("END calCircum()");
            vo.setRadius(input);
            vo.setCircumference(_r);
        } catch (NullPointerException e) {
            log.warning(e.getMessage());
            vo = new CircumferenceVO();
            vo.setRadius(null);
            vo.setCircumference(null);
        }
    }
}

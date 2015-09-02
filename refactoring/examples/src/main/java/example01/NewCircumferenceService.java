package example01;

import java.util.logging.Logger;

public class NewCircumferenceService extends CircumferenceService {

    private final static Logger log = Logger.getLogger(NewCircumferenceService.class.getName());

    /**
     * @param input
     * @param isRadius
     * @param vo
     */
    public void calCircum(long input, boolean isRadius, CircumferenceVO vo) {
        log.info("START calCircum()");
        log.info("input: "    + input);
        log.info("isRadius: " + isRadius);
        super.calCircum(input, isRadius, vo);
        log.info("END calCircum()");
    }

    public void calCircum(long input, boolean isRadius, CircumferenceVO vo, boolean callOldVersion) {
        if (callOldVersion)
            super.calCircum(input, isRadius, vo);
    }
}

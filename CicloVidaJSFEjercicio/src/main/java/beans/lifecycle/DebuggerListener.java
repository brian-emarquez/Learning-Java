package beans.lifecycle;

import java.util.logging.Logger;
import javax.faces.event.PhaseEvent;
import javax.faces.event.PhaseId;
import org.apache.logging.log4j.LogManager;

public class DebuggerListener implements javax.faces.event.PhaseListener {

    org.apache.logging.log4j.Logger log = LogManager.getRootLogger();
    
    @Override
    public void beforePhase(PhaseEvent pe) {
        if(log.isInfoEnabled()){
            log.info("Anrtes de la fase " + pe.getPhaseId().toString().toString() );
        }
    }

    /* Metodos abstractos*/
    @Override
    public void afterPhase(PhaseEvent pe) {
        if(log.isInfoEnabled()){
            log.info("Depsues de la fase " + pe.getPhaseId().toString());
        }
    }

    @Override
    public PhaseId getPhaseId() {
        return PhaseId.ANY_PHASE;
    }
}

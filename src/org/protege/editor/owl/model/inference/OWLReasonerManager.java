package org.protege.editor.owl.model.inference;

import java.util.Set;

import org.protege.editor.core.Disposable;
import org.semanticweb.owlapi.model.OWLOntologyManager;
import org.semanticweb.owlapi.reasoner.OWLReasoner;
import org.semanticweb.owlapi.reasoner.ReasonerProgressMonitor;


/**
 * Author: Matthew Horridge<br>
 * The University Of Manchester<br>
 * Medical Informatics Group<br>
 * Date: 19-Jun-2006<br><br>
 * <p/>
 * matthew.horridge@cs.man.ac.uk<br>
 * www.cs.man.ac.uk/~horridgm<br><br>
 * <p/>
 * The reasoner manager manages a "global" reaoner instance, but
 * also provides the ability to create new instances of the currently
 * selected reasoner.
 */
public interface OWLReasonerManager extends Disposable {


    public void setReasonerProgressMonitor(ReasonerProgressMonitor progressMonitor);


    /**
     * Gets the ID of the current reasoner.
     * @return A <code>String</code> representation of the current
     *         reasoner id.
     */
    public String getCurrentReasonerFactoryId();

    public ProtegeOWLReasonerFactory getCurrentReasonerFactory();

    public String getCurrentReasonerName();


    /**
     * Sets the current reasoner to be the reasoner specified by the
     * id.
     * @param id The reasoner id that specified the reasoner that should
     *           be set as the current reasoner.
     */
    public void setCurrentReasonerFactoryId(String id);


    /**
     * Gets the installed reasoner plugins.
     */
    public Set<ProtegeOWLReasonerFactory> getInstalledReasonerFactories();


    /**
     * Gets the current reasoner.
     */
    public OWLReasoner getCurrentReasoner();


    public void classifyAsynchronously();

    public void setReasonerExceptionHandler(OWLReasonerExceptionHandler handler);


    void killCurrentClassification();
}

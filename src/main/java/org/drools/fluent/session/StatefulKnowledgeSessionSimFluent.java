/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.fluent.session;

import org.drools.fluent.test.TestableFluent;
import org.drools.fluent.simulation.SimulationFluent;

import java.util.concurrent.TimeUnit;


public interface StatefulKnowledgeSessionSimFluent
        extends StatefulRuleSessionFluent<StatefulKnowledgeSessionSimFluent>,
        StatefulProcessSessionFluent<StatefulKnowledgeSessionSimFluent>,
        TestableFluent<StatefulKnowledgeSessionSimFluent> {

    StatefulKnowledgeSessionSimFluent newStep(long distanceMillis);
    StatefulKnowledgeSessionSimFluent newStep(long distanceMillis, TimeUnit timeUnit);
    StatefulKnowledgeSessionSimFluent newRelativeStep(long relativeDistance);
    StatefulKnowledgeSessionSimFluent newRelativeStep(long relativeDistance, TimeUnit timeUnit);

    SimulationFluent end(String context, String name);
    SimulationFluent end(String name);
    SimulationFluent end();
    
}

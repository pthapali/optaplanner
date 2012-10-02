/*
 * Copyright 2010 JBoss Inc
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

package org.drools.planner.core.localsearch.decider.forager;

import org.drools.planner.core.localsearch.scope.LocalSearchStepScope;
import org.drools.planner.core.localsearch.scope.LocalSolverMoveScope;
import org.drools.planner.core.localsearch.event.LocalSearchSolverPhaseLifecycleListener;

/**
 * A Forager collects the accepted moves and picks the next step from those for the Decider.
 * @see AbstractForager
 */
public interface Forager extends LocalSearchSolverPhaseLifecycleListener {

    boolean supportsNeverEndingMoveSelector();

    void addMove(LocalSolverMoveScope moveScope);

    boolean isQuitEarly();

    LocalSolverMoveScope pickMove(LocalSearchStepScope localSearchStepScope);

}

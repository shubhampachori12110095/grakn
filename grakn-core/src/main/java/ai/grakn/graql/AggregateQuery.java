/*
 * Grakn - A Distributed Semantic Database
 * Copyright (C) 2016-2018 Grakn Labs Limited
 *
 * Grakn is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * Grakn is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with Grakn. If not, see <http://www.gnu.org/licenses/gpl.txt>.
 */

package ai.grakn.graql;

import ai.grakn.GraknTx;
import ai.grakn.graql.admin.Answer;

/**
 * An aggregate query produced from a {@link Match}.
 *
 * @param <T> the type of the result of the aggregate query
 *
 * @author Felix Chapman
 */
public interface AggregateQuery<T> extends Query<T> {

    @Override
    AggregateQuery<T> withTx(GraknTx tx);

    /**
     * Get the {@link Match} that this {@link AggregateQuery} will operate on.
     */
    Match match();

    /**
     * Get the {@link Aggregate} that will be executed against the results of the {@link #match()}.
     */
    Aggregate<? super Answer, T> aggregate();
}

/*
 * Copyright (C) 2023 Katsute <https://github.com/Katsute>
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package dev.katsute.mal4j.property;

/**
 * Indicates that the object has a ranking.
 *
 * @since 1.0.0
 * @version 1.0.0
 * @author Katsute
 */
public interface Ranking {

    /**
     * The item's current ranking.
     *
     * @return ranking
     *
     * @see #getPreviousRank()
     * @since 1.0.0
     */
    Integer getRanking();

    /**
     * Returns the item's previous ranking.
     *
     * @return previous ranking
     *
     * @see #getRanking()
     * @since 1.0.0
     */
    Integer getPreviousRank();

}

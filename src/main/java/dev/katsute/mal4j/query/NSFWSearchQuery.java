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

package dev.katsute.mal4j.query;

/**
 * Indicates that the query accepts a NSFW parameter
 *
 * @param <T> this
 * @param <R> response
 *
 * @see NSFW
 * @since 1.0.0
 * @version 1.0.0
 * @author Katsute
 */
public abstract class NSFWSearchQuery<T extends NSFWSearchQuery<T,R>,R> extends SearchQuery<T,R> implements NSFW<T> {

    protected Boolean nsfw;

    NSFWSearchQuery(){ }

    @Override
    public final T includeNSFW(){
        return includeNSFW(true);
    }

    @SuppressWarnings("unchecked")
    @Override
    public final T includeNSFW(final boolean nsfw){
        this.nsfw = nsfw;
        return (T) this;
    }

}

/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.jpa.jooq;


import javax.annotation.Generated;

import org.jooq.example.jpa.jooq.tables.Actor;
import org.jooq.example.jpa.jooq.tables.Film;
import org.jooq.example.jpa.jooq.tables.FilmActor;
import org.jooq.example.jpa.jooq.tables.Language;


/**
 * Convenience access to all tables in PUBLIC
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Tables {

    /**
     * The table <code>PUBLIC.ACTOR</code>.
     */
    public static final Actor ACTOR = org.jooq.example.jpa.jooq.tables.Actor.ACTOR;

    /**
     * The table <code>PUBLIC.FILM</code>.
     */
    public static final Film FILM = org.jooq.example.jpa.jooq.tables.Film.FILM;

    /**
     * The table <code>PUBLIC.FILM_ACTOR</code>.
     */
    public static final FilmActor FILM_ACTOR = org.jooq.example.jpa.jooq.tables.FilmActor.FILM_ACTOR;

    /**
     * The table <code>PUBLIC.LANGUAGE</code>.
     */
    public static final Language LANGUAGE = org.jooq.example.jpa.jooq.tables.Language.LANGUAGE;
}

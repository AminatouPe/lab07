package it.unibo.inner.api;

/**
 *Questa interfaccia rappresenta un predicato.
 * Un predicato è una funzione che accetta un elemento e restituisce un valore booleano.
 * @param <T> il tipo dell'elemento da testare.
 */
public interface Predicate<T> {
    /**
     * Verifica l'elemento specificato.
     * @param elem l'elemento da testare.
     * @return true se l'elemento soddisfa il predicato, false altrimenti.
     */
    boolean test(T elem);
}

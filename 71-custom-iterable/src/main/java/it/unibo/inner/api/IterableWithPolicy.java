package it.unibo.inner.api;

/**
 * Questa interfaccia rappresenta una raccolta iterabile con una policy.
 * La policy viene utilizzata per filtrare gli elementi durante l'iterazione.
 */
public interface IterableWithPolicy<T> extends Iterable<T> {
    /**
     * Configura la policy utilizzata per filtrare gli elementi da iterare.
     * @param filter il predicato utilizzato per filtrare gli elementi nella raccolta durante l'iterazione.
     */
    void setIterationPolicy(Predicate<T> filter);
}

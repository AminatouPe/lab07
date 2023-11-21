# INSTRUCTIONS

**Assicurati che tutte le parti dell'esercizio siano corrette, non solo la fine.**

## Parte 1: iterabale senza policy

1. Implementare l'interfaccia `IterableWithPolicy<T>` tramite una classe generica con un costruttore che accetta un array di elementi `T`.
2. Lascia vuoto il metodo `setIterationPolicy` (per ora).
3. Implementare una classe interna che implementi l'interfaccia `Iterator<T>` in modo che esegua un'iterazione sugli elementi dell'array fornito al costruttore.
4. Implementa il metodo `iterator()` in modo che restituisca un'istanza della classe interna.
5. Testare l'implementazione eseguendo la classe "TestIterablePlain".

## Parte 2: iterabile con policy

1. Aggiungi un nuovo costruttore alla classe appena creata che accetta due argomenti: un array di elementi "T" e un "Predicato<T>" che verrà utilizzato per filtrare gli elementi durante l'iterazione.
2. Modificare il costruttore 1-ario in modo che chiami il costruttore 2-ario con un `Predicato<T>` che restituisca sempre `true`.
3. Implementare il metodo `setIterationPolicy` in modo che imposti il ​​`Predicate<T>` che verrà utilizzato per filtrare gli elementi durante l'iterazione.
4. Modificare l'implementazione della classe interna (l'implementazione `Iterator<T>`) in modo che utilizzi il `Predicate<T>` per filtrare gli elementi durante l'iterazione.
5. Testare l'implementazione eseguendo la classe "TestIterableWithPolicy".
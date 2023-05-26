package CodeChallages.FluxInReactor;

import reactor.core.publisher.Flux;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Flux<String> flux0 = Stage1.emptyFlux();
        Flux<String> flux1 = Stage1.fooBarFluxFromValues();
        Flux<String> flux2 = Stage1.fooBarFluxFromList();
        Flux<String> flux3 = Stage1.errorFlux();
        Flux<Long> flux4 = Stage1.counter();



        flux0.subscribe(
                value -> System.out.println("emptyFluxExample: " + value),
                error -> System.err.println("emptyFluxExample Error: " + error),
                () -> System.out.println("Completed emptyFluxExample! ")
        );

        flux1.subscribe(
                value -> System.out.println("fooBarFluxFromValuesExample: " + value),
                error -> System.err.println("fooBarFluxFromValuesExample Error: " + error),
                () -> System.out.println("Completed fooBarFluxFromValuesExample! ")
        );

        flux2.subscribe(
                value -> System.out.println("fooBarFluxFromListExample: " + value),
                error -> System.err.println("fooBarFluxFromListExample Error: " + error),
                () -> System.out.println("Completed fooBarFluxFromListExample! ")
        );

        flux3.subscribe(
                value -> System.out.println("errorFluxExample: " + value),
                error -> System.err.println("errorFluxExample Error: " + error),
                () -> System.out.println("Completed errorFluxExample! ")
        );

        flux4.subscribe(
                value -> System.out.println("counterExample: " + value),
                error -> System.err.println("counterExample Error: " + error),
                () -> System.out.println("Completed counterExample! ")
        );

        Thread.sleep(2000);





    }
}

package CodeChallages.MonoInReactor;

import reactor.core.publisher.Mono;

public class Main {

    public static void main(String[] args) {
        MonoExamples monoExamples = new MonoExamples();

        // Test emptyMono()
        Mono<String> emptyMono = monoExamples.emptyMono();
        emptyMono.subscribe(
                value -> System.out.println("emptyMono: " + value),
                error -> System.err.println("emptyMono Error: " + error),
                () -> System.out.println("emptyMono Completed")
        );

        // Test monoWithNoSignal()
        Mono<String> monoWithNoSignal = monoExamples.monoWithNoSignal();
        monoWithNoSignal.subscribe(
                value -> System.out.println("monoWithNoSignal: " + value),
                error -> System.err.println("monoWithNoSignal Error: " + error),
                () -> System.out.println("monoWithNoSignal Completed")
        );

        // Test fooMono()
        Mono<String> fooMono = monoExamples.fooMono();
        fooMono.subscribe(
                value -> System.out.println("fooMono: " + value),
                error -> System.err.println("fooMono Error: " + error),
                () -> System.out.println("fooMono Completed")
        );

        // Test errorMono()
        Mono<String> errorMono = monoExamples.errorMono();
        errorMono.subscribe(
                value -> System.out.println("errorMono: " + value),
                error -> System.err.println("errorMono Error: " + error),
                () -> System.out.println("errorMono Completed")
        );
    }
}

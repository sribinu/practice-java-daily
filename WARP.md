# WARP.md

This file provides guidance to WARP (warp.dev) when working with code in this repository.

## Project overview

This repository is a collection of small, self-contained Java practice programs grouped by topic. Each program is implemented as a standalone class with its own `main` method and, in some cases, helper static methods. There is no build tool (Maven/Gradle) or automated test framework configured; the code is meant to be compiled and run directly with the JDK or via an IDE.

### Source layout

- `src/Main.java`: IntelliJ's default template entrypoint; not wired to the topic-based packages and can generally be ignored unless you want a single launcher.
- `src/basics`: Very simple introductory programs (e.g., printing, arithmetic, user input). Classes are in the `basics` package.
- `src/datatypes`: Programs demonstrating primitive types, type casting, and basic operations; package `datatypes`.
- `src/operators`: Examples of arithmetic, logical, bitwise, comparison, and assignment operators; package `operators`.
- `src/loops`: Programs focusing on `for`/`while` loops and basic numeric algorithms; package `loops`.
- `src/control_statements`: Branching/decision-making programs (if/else, switch) and small numeric algorithms such as prime checks, Armstrong numbers, factorial, etc.; package `control_statements`.
- `src/recursion`: Recursive versions of some numeric algorithms (e.g., factorial, Fibonacci); package `recursion`.
- `src/pattern/star`: Star-pattern printing programs (pyramids, triangles, diamonds, Pascal triangles, etc.); package `pattern.star`.
- `src/pattern/star_pattern_programs.md`: Markdown descriptions of the various star pattern problems, including example outputs.

Common conventions across these packages:

- Each class is dedicated to a single question/problem and usually has a header comment describing metadata (program number, question, difficulty, created date, and sample output).
- The `main` method typically reads input via `Scanner` (for numeric tasks) or uses hard-coded values (for very simple programs), then prints a result or pattern to standard output.
- Where logic is reusable (e.g., prime checking), it is factored into `static` helper methods within the same class; there is no shared utilities package.

## Commands: compile and run

This project does not define any build scripts; use the JDK directly. From the repository root:

### Compile and run a single program

To compile a single class (e.g., `HelloJava` in the `basics` package) into an `out` directory and run it:

- Compile:
  - PowerShell:
    - `mkdir out -ErrorAction Ignore`
    - `javac -d out src\basics\HelloJava.java`
- Run:
  - `java -cp out basics.HelloJava`

You can substitute `basics.HelloJava` for any other fully qualified class name, e.g. `control_statements.PrimeCheck` or `pattern.star.Pyramid`, compiling the corresponding `.java` file first.

### Compile all Java sources (PowerShell)

To (re)compile all `.java` files under `src` into `out` using PowerShell:

- Ensure `out` exists:
  - `mkdir out -ErrorAction Ignore`
- Compile all sources:
  - `Get-ChildItem -Recurse -Filter *.java src | ForEach-Object { javac -d out $_.FullName }`

After compiling, run any program via its package-qualified class name with `java -cp out <package.ClassName>`.

## Tests and linting

- There are currently **no automated tests** (JUnit or otherwise) and no configured linter or formatter for Java in this repository.
- Validation of changes is typically done by recompiling affected classes and manually running the corresponding `main` methods.

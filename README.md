<div align="center">

# ⚡ Stack.Java — 0 to 100

**A linear, self-contained curriculum — 101 modules — from zero Java to intermediate/advanced.**

[![JDK](https://img.shields.io/badge/JDK-21_LTS-blue?style=flat-square&logo=openjdk&logoColor=white)](https://adoptium.net/)
[![Modules](https://img.shields.io/badge/Modules-101-success?style=flat-square)]()
[![License](https://img.shields.io/badge/License-MIT-lightgray?style=flat-square)](LICENSE)
[![Progress](https://img.shields.io/badge/Phases-14-orange?style=flat-square)]()
[![No Build Tools](https://img.shields.io/badge/No_Build_Tools-%E2%9C%93-red?style=flat-square)]()

---

</div>

## 📋 Overview

Stack.Java is a **strictly linear, zero-dependency curriculum** designed for developers who already know at least one programming language (Python, JavaScript, C, etc.) and want to go from **zero Java knowledge** to **intermediate/advanced Java proficiency**.

No build tools. No site generators. No fluff. Just **plain Markdown lessons**, **runnable code examples**, **practice exercises with solutions**, and a **quiz per module** — all requiring nothing more than a terminal and JDK 21.

> **Who this is for:** Developers who know programming basics but are new to Java. Explanations focus on what makes Java unique — static typing, JVM, checked exceptions, the collections framework — without re-teaching universal programming concepts.

---

## 🔧 Prerequisites

| Requirement | Details |
|---|---|
| **JDK 21 LTS** | Several modules cover records, sealed classes, and pattern matching — all require modern Java. [Download from Adoptium](https://adoptium.net/) or your package manager. |
| **Verify installation** | Run `java -version` — you should see version `21` or later. |
| **IDE (optional)** | IntelliJ IDEA Community Edition or VS Code with Java extensions recommended for syntax highlighting and navigation, but any text editor + terminal works. |

---

## 🚀 How to Use This Repo

Modules **must** be completed in strict order — each builds on the one before it.

### Per-Module Workflow

```
┌─────────────────────────────────────────────────────────────┐
│  ① Read the lesson     →   ② Run the examples               │
│                                                             │
│  ③ Do the exercises    →   ④ Check your work               │
│                                                             │
│  ⑤ Take the quiz       →   ⑥ Move to the next module       │
└─────────────────────────────────────────────────────────────┘
```

1. **Read** `README.md` — the lesson with theory, code walkthroughs, and a quiz.
2. **Run the examples** — navigate to `examples/`, compile and run each `.java` file.
3. **Do the exercises** — open `exercises/README.md` and attempt every problem.
4. **Check your work** — compare against the files in `solutions/`.
5. **Take the quiz** — at the bottom of each `README.md`, then check your answers.
6. **Repeat** for the next module.

### Compile & Run Any Example

```bash
cd module-X-topic-name/examples
javac ExampleName.java
java ExampleName
```

All examples and solutions use **no `package` declarations** (except the dedicated packages module), so they compile with a single `javac` command and run with a single `java` command.

---

## 📊 Curriculum Overview — 14 Phases, 101 Modules

| Phase | Modules | Focus |
|---|---|---|
| **1** | 00–03 | Introduction & Setup |
| **2** | 04–19 | Core Language Fundamentals |
| **3** | 20–38 | Object-Oriented Programming |
| **4** | 39–44 | Exception Handling & Generics |
| **5** | 45–53 | Collections Framework |
| **6** | 54–60 | Functional Java |
| **7** | 61–68 | I/O and Concurrency |
| **8** | 69–72 | Databases & Networking |
| **9** | 73–74 | Tooling & Testing |
| **10** | 75–80 | Design & Architecture |
| **11** | 81–86 | Modern Java Features |
| **12** | 87–91 | GUI Programming |
| **13** | 92–95 | Introduction to Spring |
| **14** | 96–100 | Professional Practices & Capstone |

---

## 📚 Full Table of Contents

### Phase 1 — Introduction & Setup <small>(Modules 0–3)</small>

| # | Module |
|---|---|
| 00 | [Introduction to Java — History, Philosophy, and Applications](module-000-introduction-to-java/) |
| 01 | [Setting Up Your Environment (JDK, JAVA_HOME, javac/java, IDE options)](module-001-setting-up-your-environment/) |
| 02 | [Your First Java Program (Hello World, anatomy of a class and main)](module-002-your-first-java-program/) |
| 03 | [Java Syntax Basics, Comments, and Program Structure](module-003-java-syntax-basics-comments-and-program-structure/) |

### Phase 2 — Core Language Fundamentals <small>(Modules 4–19)</small>

| # | Module |
|---|---|
| 04 | [Variables and Primitive Data Types](module-004-variables-and-primitive-data-types/) |
| 05 | [Type Casting and Conversion](module-005-type-casting-and-conversion/) |
| 06 | [Operators (Arithmetic, Relational, Logical, Bitwise, Assignment)](module-006-operators/) |
| 07 | [Reading Input from the Console (Scanner)](module-007-reading-input-from-the-console/) |
| 08 | [Strings and String Methods](module-008-strings-and-string-methods/) |
| 09 | [StringBuilder and StringBuffer](module-009-stringbuilder-and-stringbuffer/) |
| 10 | [Conditional Statements (if/else, switch)](module-010-conditional-statements/) |
| 11 | [Loops (for, while, do-while)](module-011-loops/) |
| 12 | [Enhanced for-loop, break, continue, and Labeled Loops](module-012-enhanced-for-loop-break-continue-and-labeled-loops/) |
| 13 | [Arrays (One-Dimensional)](module-013-arrays-one-dimensional/) |
| 14 | [Multidimensional Arrays](module-014-multidimensional-arrays/) |
| 15 | [The Arrays Utility Class](module-015-the-arrays-utility-class/) |
| 16 | [Methods — Declaration, Parameters, and Return Values](module-016-methods-declaration-parameters-and-return-values/) |
| 17 | [Method Overloading](module-017-method-overloading/) |
| 18 | [Variable Scope and an Intro to Stack vs Heap Memory](module-018-variable-scope-and-an-intro-to-stack-vs-heap-memory/) |
| 19 | [Recursion](module-019-recursion/) |

### Phase 3 — Object-Oriented Programming <small>(Modules 20–38)</small>

| # | Module |
|---|---|
| 20 | [Introduction to Object-Oriented Programming Concepts](module-020-introduction-to-object-oriented-programming-concepts/) |
| 21 | [Classes and Objects](module-021-classes-and-objects/) |
| 22 | [Constructors](module-022-constructors/) |
| 23 | [The `this` Keyword](module-023-the-this-keyword/) |
| 24 | [Access Modifiers (public, private, protected, default)](module-024-access-modifiers/) |
| 25 | [Encapsulation](module-025-encapsulation/) |
| 26 | [The `static` Keyword (fields, methods, blocks)](module-026-the-static-keyword/) |
| 27 | [Inheritance Basics](module-027-inheritance-basics/) |
| 28 | [The `super` Keyword and Method Overriding](module-028-the-super-keyword-and-method-overriding/) |
| 29 | [Polymorphism](module-029-polymorphism/) |
| 30 | [Abstract Classes](module-030-abstract-classes/) |
| 31 | [Interfaces](module-031-interfaces/) |
| 32 | [Interfaces vs Abstract Classes; Default and Static Interface Methods](module-032-interfaces-vs-abstract-classes-default-and-static-interface-methods/) |
| 33 | [Object Class Methods (equals, hashCode, toString)](module-033-object-class-methods/) |
| 34 | [Packages and Imports](module-034-packages-and-imports/) |
| 35 | [The `final` Keyword](module-035-the-final-keyword/) |
| 36 | [Enums](module-036-enums/) |
| 37 | [Nested and Inner Classes](module-037-nested-and-inner-classes/) |
| 38 | [Anonymous Classes](module-038-anonymous-classes/) |

### Phase 4 — Exception Handling & Generics <small>(Modules 39–44)</small>

| # | Module |
|---|---|
| 39 | [Exception Handling Basics (try/catch/finally)](module-039-exception-handling-basics/) |
| 40 | [Checked vs Unchecked Exceptions; throw and throws](module-040-checked-vs-unchecked-exceptions/) |
| 41 | [Custom Exceptions](module-041-custom-exceptions/) |
| 42 | [try-with-resources](module-042-try-with-resources/) |
| 43 | [Generics Basics](module-043-generics-basics/) |
| 44 | [Bounded Generics and Wildcards](module-044-bounded-generics-and-wildcards/) |

### Phase 5 — Collections Framework <small>(Modules 45–53)</small>

| # | Module |
|---|---|
| 45 | [Collections Framework Overview](module-045-collections-framework-overview/) |
| 46 | [The List Interface (ArrayList, LinkedList)](module-046-the-list-interface/) |
| 47 | [The Set Interface (HashSet, LinkedHashSet, TreeSet)](module-047-the-set-interface/) |
| 48 | [The Map Interface (HashMap, LinkedHashMap, TreeMap)](module-048-the-map-interface/) |
| 49 | [Queue and Deque](module-049-queue-and-deque/) |
| 50 | [Iterator, Comparable, and Comparator](module-050-iterator-comparable-and-comparator/) |
| 51 | [The Collections Utility Class](module-051-the-collections-utility-class/) |
| 52 | [Autoboxing, Unboxing, and Wrapper Classes](module-052-autoboxing-unboxing-and-wrapper-classes/) |
| 53 | [Immutability and the String Pool](module-053-immutability-and-the-string-pool/) |

### Phase 6 — Functional Java <small>(Modules 54–60)</small>

| # | Module |
|---|---|
| 54 | [Lambda Expressions](module-054-lambda-expressions/) |
| 55 | [Functional Interfaces](module-055-functional-interfaces/) |
| 56 | [Method References](module-056-method-references/) |
| 57 | [Streams API Basics](module-057-streams-api-basics/) |
| 58 | [Streams — Intermediate/Terminal Operations and Collectors](module-058-streams-intermediate-terminal-operations-and-collectors/) |
| 59 | [The Optional Class](module-059-the-optional-class/) |
| 60 | [The Date and Time API (java.time)](module-060-the-date-and-time-api/) |

### Phase 7 — I/O and Concurrency <small>(Modules 61–68)</small>

| # | Module |
|---|---|
| 61 | [File I/O Basics (File class, reading/writing files)](module-061-file-io-basics/) |
| 62 | [Java NIO Basics](module-062-java-nio-basics/) |
| 63 | [Serialization](module-063-serialization/) |
| 64 | [Multithreading Basics (Thread, Runnable)](module-064-multithreading-basics/) |
| 65 | [Thread Lifecycle and Synchronization](module-065-thread-lifecycle-and-synchronization/) |
| 66 | [Executors and Thread Pools](module-066-executors-and-thread-pools/) |
| 67 | [Concurrent Collections and Atomic Classes](module-067-concurrent-collections-and-atomic-classes/) |
| 68 | [CompletableFuture and Asynchronous Programming](module-068-completablefuture-and-asynchronous-programming/) |

### Phase 8 — Databases & Networking <small>(Modules 69–72)</small>

| # | Module |
|---|---|
| 69 | [JDBC Basics — Connecting to a Database](module-069-jdbc-basics-connecting-to-a-database/) |
| 70 | [JDBC CRUD Operations](module-070-jdbc-crud-operations/) |
| 71 | [Networking Basics (Sockets)](module-071-networking-basics/) |
| 72 | [The Java HTTP Client](module-072-the-java-http-client/) |

### Phase 9 — Tooling & Testing Concepts <small>(Modules 73–74)</small>

| # | Module |
|---|---|
| 73 | [Introduction to Build Tools (Maven and Gradle, Conceptual Overview)](module-073-introduction-to-build-tools/) |
| 74 | [Unit Testing Concepts with JUnit](module-074-unit-testing-concepts-with-junit/) |

### Phase 10 — Design & Architecture <small>(Modules 75–80)</small>

| # | Module |
|---|---|
| 75 | [Design Patterns I — Singleton and Factory](module-075-design-patterns-i-singleton-and-factory/) |
| 76 | [Design Patterns II — Builder and Observer](module-076-design-patterns-ii-builder-and-observer/) |
| 77 | [Design Patterns III — Strategy and Decorator](module-077-design-patterns-iii-strategy-and-decorator/) |
| 78 | [SOLID Principles](module-078-solid-principles/) |
| 79 | [The Java Memory Model and Garbage Collection](module-079-the-java-memory-model-and-garbage-collection/) |
| 80 | [JVM Internals — Class Loading and Bytecode](module-080-jvm-internals-class-loading-and-bytecode/) |

### Phase 11 — Modern Java Features <small>(Modules 81–86)</small>

| # | Module |
|---|---|
| 81 | [The Reflection API](module-081-the-reflection-api/) |
| 82 | [Annotations](module-082-annotations/) |
| 83 | [Records (Java 16+)](module-083-records/) |
| 84 | [Sealed Classes (Java 17+)](module-084-sealed-classes/) |
| 85 | [Pattern Matching (instanceof and switch expressions)](module-085-pattern-matching/) |
| 86 | [The Java Platform Module System (JPMS)](module-086-the-java-platform-module-system/) |

### Phase 12 — GUI Programming <small>(Modules 87–91)</small>

| # | Module |
|---|---|
| 87 | [Introduction to GUI Programming — Swing Basics](module-087-introduction-to-gui-programming-swing-basics/) |
| 88 | [Swing — Layouts and Event Handling](module-088-swing-layouts-and-event-handling/) |
| 89 | [JavaFX Basics](module-089-javafx-basics/) |
| 90 | [JavaFX — FXML and Styling](module-090-javafx-fxml-and-styling/) |
| 91 | [Mini Project: Building a Simple JavaFX Desktop App](module-091-mini-project-building-a-simple-javafx-desktop-app/) |

### Phase 13 — Introduction to Spring <small>(Modules 92–95)</small>

| # | Module |
|---|---|
| 92 | [Introduction to the Spring Framework and Dependency Injection](module-092-introduction-to-the-spring-framework-and-dependency-injection/) |
| 93 | [Spring Boot Basics — Setting Up a Project](module-093-spring-boot-basics-setting-up-a-project/) |
| 94 | [Spring Boot — Building REST APIs](module-094-spring-boot-building-rest-apis/) |
| 95 | [Spring Boot — Connecting to a Database with Spring Data JPA](module-095-spring-boot-connecting-to-a-database-with-spring-data-jpa/) |

### Phase 14 — Professional Practices & Capstone <small>(Modules 96–100)</small>

| # | Module |
|---|---|
| 96 | [Logging in Java (java.util.logging and the SLF4J Concept)](module-096-logging-in-java/) |
| 97 | [Best Practices and Clean Code in Java](module-097-best-practices-and-clean-code-in-java/) |
| 98 | [Debugging Techniques and Tools](module-098-debugging-techniques-and-tools/) |
| 99 | [Capstone Project Part 1 — Planning and Building a Console Application](module-099-capstone-part-1-planning-and-building-a-console-application/) |
| 100 | [Capstone Project Part 2 — Polishing the Capstone and Where to Go Next](module-100-capstone-part-2-final-project-and-next-steps/) |

---

## 🎯 What You'll Learn

| Area | Details |
|---|---|
| **Java Language** | Syntax, OOP, generics, enums, records, sealed classes, pattern matching |
| **Core APIs** | Collections, streams, lambdas, date/time, I/O, NIO, networking |
| **Concurrency** | Threads, executors, synchronized, `CompletableFuture`, concurrent collections |
| **Professional Tools** | JUnit testing, logging, build tools (conceptual), debugging, clean code |
| **GUI Programming** | Swing basics, JavaFX with FXML and styling |
| **Spring Boot** | DI, REST APIs, Spring Data JPA (introductory) |
| **JVM Internals** | Memory model, garbage collection, class loading, bytecode, reflection |
| **Design & Architecture** | Patterns (Singleton, Factory, Builder, Observer, Strategy, Decorator), SOLID principles |
| **Capstone Project** | Plan, build, and refine a full console application applying everything learned |

---

## 🏁 Where to Go After Module 100

Congratulations on completing all 101 modules. Here are logical next steps to continue your Java journey:

| Path | Description |
|---|---|
| **Kotlin** | A modern JVM language that interoperates seamlessly with Java; official language for Android development. |
| **Android Development** | Build mobile apps using Java or Kotlin with Android Studio. |
| **Spring Ecosystem** | Deep dive into Spring Cloud, Spring Security, Spring Reactive (WebFlux), and Spring Batch. |
| **Microservices** | Service discovery, API gateways, distributed tracing, Docker, and Kubernetes. |
| **Open Source Java** | Contribute to Spring Boot, Hibernate, Apache Kafka, Elasticsearch, or the OpenJDK itself. |
| **JVM Languages** | Explore Scala, Clojure, or Groovy to see different paradigms on the same runtime. |

---

<div align="center">

<sub>Built with ☕ and Markdown. Licensed under [MIT](LICENSE).</sub>

</div>
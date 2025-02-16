This Project is abput updating documentation for java learnings . 

Var Keyword introduced in java 10 , Its specs are
The var keyword in Java, introduced in Java 10, allows for local variable type inference. It means that the Java compiler automatically determines the type of the variable based on the assigned value. This makes the code cleaner, especially in cases where the type is obvious or can be inferred from the context.

Key Points About var:
Type Inference:

The type of the variable is inferred by the compiler from the right-hand side of the initialization expression.
The developer does not need to explicitly declare the type.
Usage:

var can only be used for local variables, meaning inside methods, constructors, or blocks.
It cannot be used for:
Fields (instance or static variables).
Parameters in method signatures.
Return types in methods.
Compiler’s Role:

The compiler determines the type of the variable at compile time, so var does not introduce any runtime overhead. The type is still fully known by the time the code runs.
The type must be determinable from the context (i.e., the right-hand side expression). For example, var x = "Hello" infers String, and var y = 42 infers int.

Advantages:

Conciseness: Reduces verbosity, especially in cases of complex generic types (e.g., List<String>).
Readability: It can improve readability when the type is evident from the context.
Refactoring: Makes code easier to refactor as it removes the need to update type declarations when the type changes.
Limitations:

You must initialize the variable when using var, as the compiler needs to infer the type based on the initialization.
It’s not possible to use var without an initializer (e.g., var x; would result in a compile-time error).
It can sometimes make the code harder to understand if the variable type is not obvious from the context.
This Project is abput updating documentation for java learnings . 

VAR : 
---------
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

Note 1 : We can seperate digits with _ to increase readability.

Note 2 : When an Integer overflows , it rolls to the minimum value and starts counting up. 

Note 3 : From Java 9 new Integer(24) is deprecated instead you can use Integer.valueOf(24)

Note 4 : Integerpool from -128 to 127 (if you are not creating new objects same reference is allocated)

BIG DECIMAL : 
---------------

In Java, the BigDecimal class is part of the java.math package and is used to represent numbers with a very large precision and scale, avoiding the issues of floating-point arithmetic (such as rounding errors) that can occur when using types like double or float. BigDecimal is especially useful when dealing with financial or monetary calculations, where precision is critical.

Key Features of BigDecimal:

Immutability:BigDecimal objects are immutable, meaning that any operation on a BigDecimal will return a new BigDecimal object without modifying the original.

Precision: It provides arbitrary precision, which allows for representing numbers with a very large number of digits.

Rounding Modes: BigDecimal supports various rounding modes like ROUND_HALF_UP, ROUND_HALF_DOWN, etc.

TRIM AND STRIP : 
------------------
1. trim() Method
   Definition: The trim() method removes leading and trailing spaces (characters with ASCII values 32) from a string.

Whitespace Considered: Only space characters (ASCII code 32) are considered as whitespace. It does not remove other Unicode whitespace characters (e.g., tabs, newlines, etc.).

Behavior: If the string only consists of whitespace characters, it will return an empty string. Otherwise, it returns a new string with the leading and trailing spaces removed.

2. strip() Method
   Definition: The strip() method was introduced in Java 11 and removes leading and trailing whitespace using the Unicode standard for whitespace (i.e., it removes all characters classified as whitespace by Unicode).

Whitespace Considered: strip() removes all Unicode whitespace characters, which includes characters like tabs, newlines, and other non-visible characters that are not considered by trim().

Behavior: Similar to trim(), it returns a new string with the leading and trailing whitespace removed. It can handle more types of whitespace beyond just ASCII space.

Key Differences:

Whitespace Type:
trim() only removes ASCII space (character with value 32).
strip() removes all Unicode whitespace characters, including spaces, tabs, newlines, and other whitespace defined by the Unicode standard.

Compatibility:
trim() has been available since the early versions of Java (Java 1.0).
strip() was introduced in Java 11 and is available only in newer Java versions.

Performance:
strip() uses a more generalized method (Unicode) for whitespace removal, so it may involve a bit more overhead than trim(), but for most use cases, the difference is negligible.


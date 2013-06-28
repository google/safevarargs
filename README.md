Safe Varargs
============

A Java language annotation used by code that intends to signal the
SafeVarargs feature in later virtual machines, while remaining compatible
with prior versions.  This should be used on the boot-strap classpath at
compile-time, and NOT included as a transitive dependency at runtime, as it
will be provided by the target environment, if the feature is available. If
the feature is not available, the annotation (and its lack of presence on
the classpath) will be ignored, per the Java language spec. 

Maven users will want to include this artifact in the maven-compiler-plugin's
boostrap configuration like so: 

```
example: TBA
```

Others will simply want to download the jar, and include it in their 
bootstrap class path by the means appropriate to their build environment.

Note - this should NOT be permitted to appear in the run-time classpath of 
your library or application, or it may conflict if the annotation is provided
by the virtual machine in which you run it.  Repeat: *do not include in your
application, nor in the transitive dependencies of your application.*

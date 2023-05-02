# example-nashorn-mingw
An example for using Nashorn JavaScript engine from Java in 2023.

Nashorn is a very lightweight but powerful script engine that supports all vanilla javascript features while allowing very useful runtime scripting interop between Java and JavaScript.

Nashorn Script Engine depends on:

asm-all(eg: `asm-all-5.2.jar`):

- https://repository.ow2.org/nexus/content/repositories/releases/org/ow2/asm/asm-all/5.2/
- https://repository.ow2.org/nexus/content/repositories/releases/org/ow2/asm/
- https://asm.ow2.io/

nashorn-core(eg `nashorn-core-15.4.jar`):

- https://central.sonatype.com/artifact/org.openjdk.nashorn/nashorn-core/15.4/versions

running:

`bash build.sh && bash run.sh`

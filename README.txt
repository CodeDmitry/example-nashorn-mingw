May 2, 2023
Nashorn Test

In this project, I want to demonstrate use of the
Nashorn script engine.

I have Helper.java which contains a class that I want
to use from the context of the script engine, and
I have Test.java which runs an internal script which
uses the Helper object, and returns an internal function
object, which will be called from the context of Java.

In turn, it illustrates use of Nashorn-generated objects
from Java context, and Java objects from the context of
Nashorn script engine.

Target platform: MinGW, but should still work with minor adjustments
on other platforms.

Running instructions:
    bash build.sh && bash run.sh
# **Singleton**

### Singleton is a creational design pattern that lets you ensure that a class has only one instance, while providing a global access point to this instance.

1. Use the Singleton pattern when a class in your program should have just a single instance available to all clients;
   for example, a single database object shared by different parts of the program.
2. Use the Singleton pattern when you need stricter control over global variables.

### Implementation

1. Eager init (Non Threat-Safe) ==> `Singleton.class`
2. Static Block (Non Threat-Safe) ==> `SingletonStaticBlock.class`
3. Lazy init (Non Threat-Safe) ==> `SingletonLazy.class`
4. Lazy init (Method Threat-Safe) ==> `MethodThreadSafeSingletonLazy.class`
5. Lazy Init (Double Check Locking Threat-Safe) ==> `DoubleCheckLockingSingleton.class`
6. InnerClass (Lazy Threat-Safe) ==> `InnerClassSingleton.class`

![](resource/structure-en.png)
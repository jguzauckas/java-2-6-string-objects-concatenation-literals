# `String` Objects: Concatenation, Literals, and More



---

## Creating `String` Objects

There are two ways to make `String` objects in Java, one of which we've been using since the beginning of the year: the **literal** value. By writing text inside of double quotes, Java interprets it automatically as a `String` object. Since `String` is a type, we can actually make variables to hold them by defining their type as `String`. Here is a quick example from the `NotesStringConstruct1.java` file:

```java
String hello = "Hello, World!";
```

In this example, the variable `hello` now represents the text `"Hello, World!"`, meaning we can use these variables now instead of writing out things in double quotes every time we need them.

The use of literals to make a `String` object is actually a shortcut, and it's important that we know the original method that this comes from. The original method still uses a `String` literal, but it incorporates the language we are more familiar with from our section on object constructors. Here is an example of the same `String` being made from the `NotesStringConstruct2.java` file:

```java
String hello = new String("Hello, World!");
```

Again, these two are considered equally viable ways to create `String` objects, and so often we will do it the first way since it is much faster.

---

## Immutability

`String` objects have a property called **immutability**, which means that once they have been made, they cannot be changed by any of their methods. This is curious though, as we will clearly be "editing" Strings in later parts of this section, so what is going on here?

Importantly in Java, when something is immutable, it doesn't actually prevent us from changing it. When we zoom in to the memory level, we can see that by changing a `String` object, it actually uses a different spot in memory to store the updated information and starts paying attention to that new spot in memory, forgetting about the old spot. If we compared this to our example of houses and addresses, this would be akin to instead of remodeling your current house, you build a duplicate house at a different address with the remodeling changes you want to make and start living there instead.

While often not entirely relevant to us, it is important to understand that `String` objects are immutable, and cannot be changed in their current position in memory.

---

## Concatenation

Our primary operation to combine two or more `String` objects is called **concatenation**. Concatenation takes two `String` objects and sticks them end-to-end to make one new larger `String` object. The symbol for concatenation in Java is the plus sign `+`, just like our addition symbol for numbers. Java is able to use the data types around a `+` to determine which implementation of `+` makes the most sense: if there is a `String`, it should be concatenation, whereas if there are only numbers, it should be addition.

Here is are three examples of concatenation from the `NotesConcat1.java` file:

```java
String var1 = "Hello";
String var2 = new String("World");
System.out.println(var1 + var2);

String var3 = "Hello ";
String var4 = var3 + "World!";

System.out.println("Yo " + "What's Up?");
```

We can see here three different uses of concatenation. First, we can concatenate two `String` objects in a print statement to print out one longer `String`, without necessarily having saved that information anywhere.

Second, we can see that we can define a new `String` object by concatenating any two `String` objects together, including one from a variable and a new `String` literal.

Third, we can see that you can just print concatenated `String` literals, no variables needed.

If you want to concatenate onto an existing `String` variable, we can use our compound assignment operator `+=` just like we could add to a value and save the new information. Here is an example of this from the `NotesConcat2.java` file:

```java
String var1 = "Hello ";
var1 += "World!";
System.out.println(var1);
```

In this file, `var1` starts with the value `"Hello "`, and then we concatenate `"World!"` onto it and save the value as the new String object (remember: immutable) `"Hello World!"`.

Concatenation opens up a lot of options for us to play around with and combine `String` objects in various forms.

---

## Concatenating Other Values

When we talked about adding `int` and `double` type numbers in Unit 1, we talked about how `double` is the dominant type, so if `double` was in an operation, the result was going to be a `double`, regardless of the presence of `int` type values. Turns out, we can draw a similar analogy with `String` concatenation: as soon as Java sees a `+` next to a String, there can be other primitive types around and they get converted to a `String` object to be concatenated. Here are two examples of this in action from the `NotesConcat3.java` file:

```java
System.out.println("I am " + 25 + " years old.");

int age = 25;
System.out.println("I am " + age + " years old.");
```

The two examples from this file both work exactly the same way. A primitive type involved in a concatenation is just turned into a `String` object to be used for the concatenation. We can do it with literal primitive values or with primitive variables. This allows us to construct smarter print statements that could say something about a value and print the value, as opposed to just printing the value.


---

## `String` Values in Classes

`String` objects are extremely useful in Java as they store a very unique type of information: pure text. We can (and very often do) incorporate this into classes. A great example would be the `Person` class we have been playing around with a lot, where we might want each `Person` to have a name! Here is a basic `Person` class that uses a `String` value:

```java
public class Person {
    private String name;
    private int age;

    public Person(){
        name = "";
        age = 0;
    }

    public Person(String n, int a){
        name = n;
        age = a;
    }

    public String getName(){
        return name;
    }

    public void setName(String n){
        name = n;
    }
    
    public int getAge(){
        return age;
    }

    public void setAge(int a){
        age = a;
    }

    public int numYearsUntil(int y){
        return y - age;
    }
}
```

We can combine a few of our skills from this section with this example from the `NotesPerson1.java` file:

```java
Person person1 = new Person("John", 25);
System.out.println(person1.getName() + " is " + person1.getAge() + " years old.");
```

This produces the following output:

```
John is 25 years old.
```

Notice how we can combine our use of methods to craft and print a full sentence, without hardcoding the values in the sentence. This is going to be something that is really useful!

---

## Assignment

Now that you have gone through the notes for this section, you can check out the `Try.md` and `Try.java` files to try a short assignment using this material.

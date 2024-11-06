# 🕹 Task: Create a Text-Based Adventure Game 🌟

In this task, you'll be designing and implementing a simple text-based adventure game that embodies creativity and object-oriented programming principles. Your game will involve navigating through different rooms, encountering monsters and nice people, and will be powered by data read from files. The challenge will enhance your understanding of reading and instantiating objects from file data, designing cohesive classes, and writing creative code.

### General Theme: 🧟‍♂️ Lost in the Maze of Encounters

Imagine wandering through a mysterious maze where each room could host a friendly face or a fearsome creature. You must navigate wisely to reach your destination and solve simple puzzles or make decisions that lead to victory or defeat.

## Learning Goals 🎯

1. **Using Data from Files to Instantiate Objects**
   - Understand file formats and parsing techniques.
   - Use file I/O to read and convert data into object attributes.
   - Handle exceptions and ensure data integrity.

2. **Designing Classes**
   - Define clear interfaces and responsibilities within classes.
   - Implement cohesive structures with appropriate fields and methods.
   - Utilize design patterns to enhance class design.

3. **Programming Creatively**
   - Explore diverse approaches to problem-solving.
   - Encourage experimentation and iterative refinement.
   - Incorporate user feedback and testing to improve usability.

---

## Exercise 1: Theoretical Foundations – File Formats 📜

**Objective:** Expand your understanding of file formats and parsing techniques. 

**Task:** 
- Research various file formats (like JSON, CSV, and plain text) used to store structured data.
- Describe how you would parse a simple flat file and extract the information needed to instantiate Java objects, considering the format you've researched.

**Questions:**
1. What are the key characteristics of the file format you've chosen?
2. Explain step by step how to parse data from this file format into Java objects.

> **Note:** You don't need to write code for this exercise, but a strong conceptual understanding is key.

---

## Exercise 2: Theoretical Foundations – Class Design Principles 📚

**Objective:** Deepen your understanding of designing effective Java classes.

**Task:**
- Review the concepts of encapsulation, cohesion, and coupling.
- Discuss the role of interfaces and abstract classes in class design.

**Questions:**
1. How do encapsulation, cohesion, and coupling contribute to robust class design?
2. Provide examples of when to use interfaces and when to use abstract classes in Java.

> **Note:** Explain concepts clearly, with real-world analogies if possible.

---

## Exercise 3: Implementing File-to-Object Instantiation 📂

**Objective:** Apply file I/O concepts to instantiate objects from file data.

**Task:** 
- Implement a Java method `parseDataFile(String filename)` that reads a text file and creates Room, Monster, or Person objects based on its contents.

**Steps:**
1. Choose a file format (e.g., CSV or JSON) for your data file.
2. Write a simple text file containing data for different entities (e.g., rooms, monsters, people).
3. Implement the method to read the file line by line, parse the data, and instantiate objects accordingly.

**Code Snippet Starter:**

```java
public void parseDataFile(String filename) {
    // Use BufferedReader to read file line by line.
    // For each line, determine if it describes a room, a monster or a person.
    // Instantiate and configure the corresponding object.
    // Handle potential exceptions gracefully.
}
```

> **Hint:** Use a class like `Scanner` or `BufferedReader` for reading files, and consider using a `switch` statement to handle different entity types.

---

## Exercise 4: Class Design for Game Components 🏗️

**Objective:** Design classes for the game elements, using principles of object-oriented programming.

**Task:**
- Design and implement classes for the entities in your game: `Room`, `Monster`, and `Person`.
- Your classes should include fields, constructors, and at least one method.

**Code Snippet Starter:**

```java
public class Room {
    private String name;
    private String description;

    public Room(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public void displayInfo() {
        System.out.println("You are in " + name + ". " + description);
    }
}

// Similar structure for Monster and Person
```

> **Tip:** Think about what makes each class unique—what fields and behaviors they might contain.

---

## Exercise 5: Creative Programming – Game Logic Design 🎮

**Objective:** Implement core game logic interactively and creatively.

**Task:**
- Create a method `playGame()` that serves as the main loop, allowing players to navigate rooms and encounter entities.

**Steps:**
1. Implement logic to handle player decisions and navigation.
2. Define interactions and outcomes for encounters with monsters and people.
3. Include winning and losing conditions.

**Code Snippet Starter:**

```java
public void playGame() {
    while (!gameOver) {
        // Display current room and possible actions.
        // Handle player input and decision-making.
        // Check winning or losing conditions.

        // If monster encountered, define fight or flee options.
    }
}
```

> **Hint:** Use a loop to repeatedly prompt the player for actions. Consider using a `Map` to store room connections for navigation.

---

## Exercise 6: Advanced Implementation – Adding Features and Documentation 📖

**Objective:** Enhance your game with additional features and Javadoc comments.

**Task:**
- Expand your game with at least two extra features (like items to collect, puzzles to solve, or skills to gain).
- Document your classes and methods using Javadoc.

**Features Ideas:**
- Add an inventory system for the player.
- Introduce a time limit or counter affecting gameplay.
- Include special rooms with unique challenges.

**Javadoc Example:**

```java
/**
 * Represents a room in the adventure game.
 * A room can be entered, contain items, and allow movement to other rooms.
 * 
 * @author [Your Name]
 */
public class Room {
    // Class implementation
}
```

> **Note:** Ensure your Javadoc is clear and informative, explaining the purpose and use of classes and methods.

---

These exercises will guide you through the comprehensive process of designing, implementing, and refining a Java-based text adventure game. Each task builds upon the previous, challenging your technical skills while encouraging creativity and thoughtful design. Happy coding, and may your adventure be daring! 🚀
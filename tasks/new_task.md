# 🎮 Adventure Game Development Task

## 🚀 Introduction

In this task, you will create a text-based adventure game where players navigate through various rooms, encountering characters and objects. Your primary goal is to exercise creative programming while mastering file I/O and class design in Java. You will leverage data from files to instantiate objects, design coherent class structures, and develop an engaging and interactive game experience. 

## 📚 Learning Goals

1. **Using Data from Files to Instantiate Objects**
   - Understanding file formats and parsing techniques for data extraction.
   - Using file I/O classes to read data and convert it into object attributes.
   - Handling exceptions and ensuring data integrity during object instantiation.

2. **Designing Classes**
   - Identifying class responsibilities and defining clear interfaces.
   - Implementing cohesive class structures with appropriate fields and methods.
   - Leveraging design patterns to solve common problems and enhance class design.

3. **Programming Creatively**
   - Exploring different approaches to problem-solving and algorithm design.
   - Encouraging experimentation and iteration to refine solutions.
   - Integrating user feedback and testing to improve program effectiveness and usability.

## 📝 Exercises

### Exercise 1: File Formats and Parsing Techniques

**Objective:** Describe different file formats that can be used to store game data and propose a suitable format for your game. Explain how you would parse this data in Java.

**Task:**
- List three different file formats (e.g., JSON, XML, CSV) and their advantages and disadvantages in the context of game data storage.
- Choose a file format for your game and justify your choice.
- Describe the steps required to parse this file and create game objects in Java. Illustrate with pseudocode if necessary.

### Exercise 2: Class Design Principles

**Objective:** Examine the principles of class design and apply them to the conceptual structure of your game.

**Task:**
- Identify three primary classes that will constitute the core of your game (e.g., `Room`, `Character`, `Game`).
- Outline the responsibilities of each class and their interactions.
- Create UML diagrams to visually represent the class structure and their relationships (UML diagrams can be hand-drawn or created using software like diagrams.net).

### Exercise 3: Implementing File-Based Room Creation

**Objective:** Develop a method to read and create room objects from a file.

**Task:**
- Write a method `loadRoomsFromFile(String filename)` in your `Game` class.
- The method should read room data from a file, instantiate `Room` objects, and store them in a collection.
- Ensure proper error handling and data validation.

**Code Snippet:**
```java
private void loadRoomsFromFile(String filename) {
    // Implement file reading logic
    // Parse each line to create Room objects
    // Store rooms in a collection
}
```

### Exercise 4: Designing Interactions with Characters

**Objective:** Extend your game by creating character interactions.

**Task:**
- Design a `Character` class with attributes like `name`, `description`, and `dialogue`.
- Write methods for interaction, such as `talkToCharacter(Character character)`, which displays dialogue and other interaction possibilities.
- Allow characters to provide clues or items necessary for game progression.

**Code Snippet:**
```java
public class Character {
    private String name;
    private String description;
    private String dialogue;

    public Character(String name, String description, String dialogue) {
        this.name = name;
        this.description = description;
        this.dialogue = dialogue;
    }

    public void talk() {
        System.out.println(dialogue);
    }
}
```

### Exercise 5: Building a Creative Game Experience

**Objective:** Develop a unique and engaging text-based game using your classes and methods.

**Task:**
- Combine all previous exercises to create a functional game where players explore rooms and interact with characters.
- Integrate game-ending conditions (e.g., winning by achieving objectives, losing by missing a vital action).
- Allow user input to guide the player's actions and decisions.

### Exercise 6: Documentation and Testing

**Objective:** Document your code and ensure it runs as expected.

**Task:**
- Use Javadoc to create comprehensive documentation for all classes and methods.
- Write a `README.md` file detailing your game's theme, how to play, and any special features.
- Thoroughly test your game logic, room transitions, and character interactions to ensure a seamless user experience.

## 🎯 Conclusion

Upon completing this task, you will have designed and implemented a captivating text-based adventure game. By doing so, you will have strengthened your abilities in file handling, class design, and creative problem solving. Enjoy crafting your adventure, and don't hesitate to let your creativity shine!
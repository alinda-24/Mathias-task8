![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-6samw7KhQld5ibbVkNnjxNz6.png?st=2024-11-06T07%3A01%3A55Z&se=2024-11-06T09%3A01%3A55Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-05T19%3A31%3A55Z&ske=2024-11-06T19%3A31%3A55Z&sks=b&skv=2024-08-04&sig=ET031OKNb2%2B5mDspQT1FaLebEWDB0Mk2oyLRyIg1mSk%3D)

## 🎮 Text Adventure Game: Encounters in the Mystic Maze

Welcome to this exciting programming task where you will create a text-based adventure game set in the Mystic Maze. Your journey involves exploring rooms, where you'll randomly encounter monsters or friendly villagers. This task will enhance your skills in reading data from files, designing object-oriented programs, and exercising your creativity in problem-solving.

### 🏆 Learning Goals

- **Using Data from Files to Instantiate Objects**: Learn how to parse data from files and use this data to create and initialize objects within your game.
- **Designing Classes**: Master the principles of designing well-structured classes, focusing on maintainability and scalability.
- **Programming Creatively**: Apply creative problem-solving to develop a unique and engaging game experience.

---

### 📚 The Learning Path

#### Exercise 1: Understanding File Formats and Data Parsing Techniques 📄

**Goal**: Grasp the basics of file formats and learn techniques for data extraction.

- **Task**: Research common file formats like CSV, JSON, and XML. Create a brief overview (half-page) of each format and describe their use cases in parsing data for applications. Focus on how you can use these formats to represent the game world (rooms and encounters).

**Example Concept**: 
- *CSV*: Useful for simple, structured data like the layout of rooms and character attributes.

#### Exercise 2: Class Design Principles and Interface Definition ⚙️

**Goal**: Understand the core principles behind class design and interface creation.

- **Task**: Write a short essay (1-2 paragraphs) explaining the single responsibility principle. Use examples relevant to game design, such as separating room functionality from character behavior.

**Key Concepts**:
- *Single Responsibility Principle*: Each class should have one reason to change, focusing on a singular responsibility.

---

### 🚀 Hands-On Adventures

#### Exercise 3: Creating Game Entities with File Data 📜

**Goal**: Implement object instantiation using file data.

- **Task**: Write a Java method `loadRoomsFromFile` to read room data from a CSV file, creating `Room` objects upon reading each line.

```java
public class Room {
    private String name;
    private String description;

    // Constructor and methods
}
```

**Instructions**:
1. Use Java's `BufferedReader` to read from a file.
2. Parse each line to extract room details.
3. Create a `Room` object for each line and store it in a `List<Room>`.

#### Exercise 4: Designing the Room and Encounter Classes 🏰

**Goal**: Develop cohesive and appropriately designed classes for your game.

- **Task**: Design the `Encounter` class, which can be a monster or a villager, using class design principles.

```java
public class Encounter {
    private String type; // e.g., "Monster" or "Villager"
    private String description;

    // Constructor and methods
}
```

**Instructions**:
1. Define `Encounter` responsibilities.
2. Implement polymorphism by considering differently behaved subclasses like `Monster` and `Villager`.

---

### 🎲 Challenge Quest

#### Exercise 5: Implementing Game Logic with Encounters 🎯

**Goal**: Use your designed classes to implement logic for encounters.

- **Task**: Within a `Game` class, write a method `processEncounter` that handles events when the player enters a room containing an encounter.

```java
public class Game {
    private Room currentRoom;

    public void processEncounter() {
        // Implement logic for different encounter types
    }
}
```

**Instructions**:
1. Use the `Encounter` object related to the current room.
2. Implement different outcomes based on the encounter type.

#### Exercise 6: Building and Iterating Your Game 🌟

**Goal**: Integrate all components and design a complete playable game.

- **Task**: Extend the game to include win/lose conditions and a simple user interface loop.

**Steps**:
1. Add a main loop allowing the player to navigate rooms.
2. Integrate room navigation and encounters seamlessly.
3. Provide feedback mechanisms (text-based UI) to guide the player through the game.

**Final Challenge**:
- Design a feedback mechanism to encourage player engagement.
- Iterate based on your testing and player feedback, documenting enhancements and challenges.

---

### 🎉 Completion and Beyond

Once you've crafted your Mystic Maze, ensure to test extensively and document your design choices and thought processes in a README file. Include sections on your file parsing strategy, class design rationales, and creative choices that set your game apart.

Happy coding, and may your journey through the Mystic Maze be both enlightening and enjoyable!
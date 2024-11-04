![Task Image](https://oaidalleapiprodscus.blob.core.windows.net/private/org-asPC5Skb6EoE1i324HhdGnV1/user-4VyHdJuNDsg3rdcmO7ghXoi2/img-HYUnxDZqVmYQki1lCWl5xmoQ.png?st=2024-11-04T16%3A02%3A28Z&se=2024-11-04T18%3A02%3A28Z&sp=r&sv=2024-08-04&sr=b&rscd=inline&rsct=image/png&skoid=d505667d-d6c1-4a0a-bac7-5c84a87759f8&sktid=a48cca56-e6da-484e-a814-9c849652bcb3&skt=2024-11-04T01%3A54%3A30Z&ske=2024-11-05T01%3A54%3A30Z&sks=b&skv=2024-08-04&sig=ENXB5eZK5nECb5CoIm5omrf5plJXhHFv8OQiThGBrCA%3D)

## 🌲 Survive the Wilderness: A Forest Survival Game 🌲

Welcome to an engaging adventure where you will create a simple yet captivating game set in a mysterious forest. Your challenge is to survive the wilderness by navigating through various terrains, encountering different animals, and making strategic decisions. This task aims to integrate file handling, class design, and creative programming concepts to build a dynamic game.

### Learning Goals

- **Using Data from Files to Instantiate Objects**
  - Understand file formats and parsing techniques for data extraction.
  - Use file I/O classes to read data and convert it into object attributes.
  - Handle exceptions and ensure data integrity during object instantiation.

- **Designing Classes**
  - Identify class responsibilities and define clear interfaces.
  - Implement cohesive class structures with appropriate fields and methods.
  - Leverage design patterns to solve common problems and enhance class design.

- **Programming Creatively**
  - Explore different approaches to problem-solving and algorithm design.
  - Encourage experimentation and iteration to refine solutions.
  - Integrate user feedback and testing to improve program effectiveness and usability.

### 📘 Exercise 1: Understanding File Formats and Parsing Techniques
*Exercise Type: Theoretical*

#### Goal:
Explore how data can be structured and parsed from files to instantiate objects dynamically.

#### Task:
- **Research:** Study the common file formats used in games for data storage, such as JSON, CSV, or custom text formats.
- **Explain:** Write a short essay (~300 words) on how you can use Java's `Scanner`, `BufferedReader`, or third-party libraries like Jackson or Gson to parse these files and instantiate objects based on the data.

### 📘 Exercise 2: Principles of Class Design
*Exercise Type: Theoretical*

#### Goal:
Understand how to structure a class effectively, focusing on responsibilities and interfaces.

#### Task:
- **Research:** Review the principles of good class design, including **Single Responsibility Principle** and **Encapsulation**.
- **Diagram:** Draw UML diagrams for a simple game (not implemented in code) that includes classes like `Player`, `Animal`, and `Forest`. Highlight relationships and data flow.

### 💻 Exercise 3: File I/O and Object Instantiation
*Exercise Type: Practical*

#### Goal:
Implement logic to read data from a file and instantiate game objects in Java.

#### Task:
- **Code:** Create a `ForestLoader` class with a method `loadForest(String filename)` that reads forest descriptions and animal attributes from a CSV file and creates `Forest` and `Animal` objects. Handle exceptions appropriately.
- **CSV File Sample:**
  ```plaintext
  Type,Name,Description
  Forest,Enchanted Woods,Lush with mystical flora and fauna
  Animal,Wolf,Fierce predator of the forest
  Animal,Deer,Gentle creature grazing peacefully
  ```

### 💻 Exercise 4: Designing the Game Classes
*Exercise Type: Practical*

#### Goal:
Design and implement the main classes for the game.

#### Task:
- **Implement:** Create the `Player`, `Animal`, and `Forest` classes. Ensure:
  - `Player` has attributes like `health` and `inventory`.
  - `Animal` can have methods `attack()` or `evade()`.
  - `Forest` comprises a collection of `Animal` objects.
- **Design:** Use appropriate access modifiers and encapsulate properties.

### 🔥 Exercise 5: Building a Functional Game Loop
*Exercise Type: Challenging*

#### Goal:
Develop a working game loop that integrates all components.

#### Task:
- **Game Loop:** Implement a main game loop in a `Game` class where the player can:
  - Enter different forest sections.
  - Encounter animals and choose to fight or evade.
  - Monitor health and game state (win/loss conditions).

### 🔥 Exercise 6: Enhancing the Game with Creativity
*Exercise Type: Challenging*

#### Goal:
Expand the game's features by applying creative programming techniques.

#### Task:
- **Experiment:** Add at least one new feature such as:
  - **Weather System:** Affect player visibility and animal behavior.
  - **Resource Gathering:** Let players collect items to craft survival tools.
  - **Event System:** Random wild events that influence game dynamics.
- **Iterate:** Collect feedback on your game, refine design, and improve user experience.

### Submission Guidelines

Ensure your project is structured and documented. Include:
- README with instructions on how to play the game.
- Javadoc comments for all public classes and methods.
- UML diagrams and essays from theoretical exercises in a `/docs` directory.

### Enjoy the Adventure! 🌲

You are now ready to embark on this adventurous coding task to develop a forest survival game. Remember, the journey is as exciting as the result. Happy coding!
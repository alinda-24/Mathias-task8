## 🎮 Pokemon-Themed Game Development Task

Welcome to the Pokemon-themed game development task! This project will guide you through the process of designing and implementing a simple text-based Pokemon game. Throughout this task, you'll apply your skills in using data from files to instantiate objects, designing classes, and programming creatively. Let's dive in!

### Learning Goals

- 🌐 **Using Data from Files to Instantiate Objects**
  - Understanding file formats and parsing techniques for data extraction.
  - Using file I/O classes to read data and convert it into object attributes.
  - Handling exceptions and ensuring data integrity during object instantiation.

- 💡 **Designing Classes**
  - Identifying class responsibilities and defining clear interfaces.
  - Implementing cohesive class structures with appropriate fields and methods.
  - Leveraging design patterns to solve common problems and enhance class design.

- 🎨 **Programming Creatively**
  - Exploring different approaches to problem-solving and algorithm design.
  - Encouraging experimentation and iteration to refine solutions.
  - Integrating user feedback and testing to improve program effectiveness and usability.

### 📝 Exercise 1: Understanding File Formats and Data Parsing

**Objective:** Gain a conceptual understanding of handling different file formats and parsing techniques.

1. **Research Question:** What are the common file formats used in data parsing (e.g., CSV, JSON)? Discuss the advantages and disadvantages of each.
   
2. **Parsing Methodologies:** Describe techniques for parsing data in Java. Consider how to handle errors or inconsistencies in data input.

### 🧠 Exercise 2: Class Design Principles

**Objective:** Deepen your understanding of effective class design.

1. **Class Design Conceptualization:** Explore the principles of Single Responsibility, Open/Closed, and Interface Segregation. Provide real-world examples of each.
   
2. **Application in Game Design:** Brainstorm how these principles can be applied to a Pokemon-themed game. What classes would you need? What interfaces might they implement?

### 🖥️ Exercise 3: File I/O and Object Instantiation

**Objective:** Implement a simple file reader to parse Pokemon data and instantiate Pokemon objects.

1. **File Structure:** Create a text file `pokemon_data.txt` with the following structure:
   ```
   Pokemon;Name;Type;HP;Attack;Defense
   Pokemon;Pikachu;Electric;35;55;40
   Pokemon;Charmander;Fire;39;52;43
   ```
   
2. **File Reader:** Implement a method `public List<Pokemon> loadPokemons(String filename)` to read the file and return a list of `Pokemon` objects. Handle potential I/O exceptions appropriately.

### 🏗️ Exercise 4: Designing Pokemon Classes

**Objective:** Define and implement classes using the principles learned.

1. **Pokemon Class:** Design a `Pokemon` class with fields for name, type, HP, attack, and defense. Ensure it adheres to the principles of clean class design.
   
2. **Battle System:** Think creatively about how these Pokemon might interact. Create a simple method within the Pokemon class, `public void battle(Pokemon opponent)`, which determines a winner based on simplified battle rules.

### ⚔️ Exercise 5: Advanced Game Functionality

**Objective:** Build upon previous exercises to create a more interactive game experience.

1. **Game World Setup:** Design a `GameWorld` class that reads from a file `game_world.txt` to instantiate and position Pokemon in different locations.
   
2. **Player Interaction:** Implement a `Player` class that can navigate through the game world, encountering and battling Pokemon.

### 🎯 Exercise 6: Full Game Integration and Testing

**Objective:** Develop a complete, interactive Pokemon game and test its functionality.

1. **Game Loop:** Design a main game loop in a `PokemonGame` class, allowing players to move through locations, encounter Pokemon, and initiate battles.
   
2. **User Feedback:** Create a simple text-based interface for players. Collect feedback from users and iterate on your design to improve functionality and usability.

### 📚 Submission Instructions

- Submit all your classes, `pokemon_data.txt`, and `game_world.txt` files in a zip folder.
- Include a `README.md` that explains your game design, how to run the game, and any additional features.

### 💡 Tips for Success

- Focus on writing clean, maintainable code.
- Think creatively and don't be afraid to try new ideas.
- Use comments and Javadoc effectively to document your code.
- Test your game thoroughly to ensure it works as expected.

By the end of this task, you'll have a foundational understanding of using file data to create dynamic objects, designing robust classes, and creating an engaging, creative game experience. Good luck, and have fun! 🎉
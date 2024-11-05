# 🎮 Create Your Own Pokémon-Themed Game

Welcome, aspiring Pokémon Trainer! In this project, you're tasked with creating a simple, text-based Pokémon-themed game. This will involve using file data to instantiate objects, designing classes, and programming creatively. Your journey will include several exercises designed to build your skills before you embark on your final quest: creating a new Pokémon adventure!

## Learning Goals 📘

- **Using Data from Files to Instantiate Objects:** Learn to read data from files, parse it for object creation, handle exceptions, and ensure data integrity.

- **Designing Classes:** Conceptualize and structure classes effectively, identifying responsibilities, defining interfaces, and leveraging design patterns for efficiency.

- **Programming Creatively:** Unleash your creativity by designing algorithms, experimenting with different solutions, integrating user feedback, and testing for improved usability.

## Exercises

### Exercise 1: Understanding File Formats and Parsing Techniques 🗂️

**Goal:** Understand how Pokémon data can be stored in files and parsed for use in a game.

**Task:**
- Research how data for Pokémon (like name, type, moves) can be stored in text files.
- Explain, in a short essay, how you would parse a CSV-like text file to retrieve Pokémon attributes. Consider how different string manipulation techniques can be applied.

**Hint:** Think about the structure of a CSV or JSON file and how each line or object can represent different aspects of a Pokémon or game state.

---

### Exercise 2: Designing Pokémon Classes 🏫

**Goal:** Design your own Pokémon class structure.

**Task:**
- Draw a class diagram for a Pokémon using UML (Unified Modeling Language).
- Document the responsibilities of each class and its attributes. Include classes for Pokémon, Moves, and possibly other entities like Trainers.

**Considerations:** Focus on what attributes a Pokémon class would need (name, type, level, moves) and how those interact with a Trainer or Game class.

---

### Exercise 3: Implementing Basic File I/O for Pokémon Data 🖥️

**Goal:** Implement file reading to create Pokémon objects from data files.

**Task:**
- Write a Java method `loadPokemonsFromFile(String filename)` that reads data from a file and creates Pokémon objects.
- Use appropriate file I/O classes to read the file. Ensure each Pokémon object is instantiated with attributes parsed from the file.

**Coding Tip:** Use `BufferedReader` and `String.split()` to parse lines, and handle any exceptions (like `IOException`) appropriately.

---

### Exercise 4: Building the Game World 🌍

**Goal:** Combine your class designs to start building a world for your Pokémon game.

**Task:**
- Create a `Game` class with a method `setupWorldFromFile(String filename)`.
- Use the file provided (`world.txt`) to read room and Pokémon data. Each room can have wild Pokémon to encounter.

**Hint:** Similar to how you've parsed Pokémon data, read room details and link them. Each room might have a Pokémon object based on its data from the file.

---

### Exercise 5: Developing Game Mechanics ⚔️

**Goal:** Implement engaging game mechanics to interact with Pokémon.

**Task:**
- Extend your `Game` class to allow a player to encounter and battle wild Pokémon.
- Implement methods for starting battles, choosing moves, and calculating damage.

**Step-by-Step Guide:**
1. Create methods `startBattle(Pokemon opponent)` and `useMove(String move)`.
2. Implement a basic damage calculation (consider Pokémon types and move effects).
3. Allow for win/lose conditions.

**Challenge:** Make the battle system interactive with basic input/output.

---

### Exercise 6: Enhancing Your Game with Creativity 🌟

**Goal:** Add your creative touch to finalize your Pokémon game.

**Task:**
- Add unique features to your game. Consider implementing items, skills, or even mini-storylines.
- Enhance user experience with creative text outputs and interactive choices.

**Ideas for Enhancement:**
- Introduce a leveling system for Pokémon.
- Incorporate a simple storyline or quest system.

**Important:** Ensure your game has a clear ending (win/lose conditions) and a user-friendly interface.

---

## Submission Guidelines 📥

- Ensure your code is well-documented with Javadoc comments where applicable.
- Include a map or diagram of your game world in the `docs` directory.
- Provide a README file detailing gameplay instructions, your game's theme, and any unique features you've implemented.
- Test your game thoroughly before submission to ensure a smooth gameplay experience.

---

Embrace creativity, let your inner game designer shine, and may your Pokémon adventure be memorable and fun. Ready, set, let the coding journey begin! 🚀
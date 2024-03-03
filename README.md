# Java-Binding_Unmarshaller
List players and a player cards in a GUI utilizing JAXB to unmarshal XML data representing Clash Royale player information and their respective cards. It consists of two main parts:

### Functionality

1. **Listing Players**: 
    - The `Controlador` class loads player data from the provided XML file (`clash.xml`) using JAXB and displays the names of the players.
    - The main class for this functionality is `P1UF4.java`.

2. **GUI for Player Card Stats**:
    - The program provides a GUI where you can input a player's name, and it will display their cards and respective stats.
    - The GUI is built using exported packages from NetBeans.
    - This functionality is divided into several classes including `PRÀCTICA31JABXBindingIUnmarshaller.java`.

      
## Features

- **List Players**: View a list of Clash Royale players stored in the system.
- **View Player Cards**: Search for specific players by name see his card collection.

## Screenshots

### 1. GUI without Listing Players

![GUI without Listing Players](images/WithoutListingPlayers.png.png)

- This screenshot shows the initial state of the GUI before listing any players.
- It features a clean interface with menu options for various actions.

### 2. Listing Players

![Listing Players](images/ListPlayers.png)

- After selecting the option to list players, the GUI updates to display the list of Clash Royale players.
- The screenshot includes a player list section  with scroll down.

### 3. Listing One Player's Cards

![Listing One Player's Cards](images/WithoutListingPlayers.png)

- When selecting a specific player, the GUI displays their card collection.
- The screenshot shows player card information, card collection, with scroll down.

## Dependencies

- Java Development Kit (JDK)
- JAXB API (Included in JDK)
- NetBeans (For GUI functionality)

## Usage
1. Clone the repository.
2. Open the project in NetBeans.
3. Run the respective classes (`P1UF4.java` for listing players, and GUI classes for player card stats).
4. Ensure the `clash.xml` file is present in the correct location.

## Structure
- `generated`: Contains JAXB-generated classes based on the XML schema.
- `pràctica.pkg3.pkg1.jabx.binding.i.unmarshaller`: Contains the main logic and entry point for the project.
- `clash.xml`: XML file containing Clash Royale player data.

## Running the Code
- Execute the relevant classes (`P1UF4` for listing players, and GUI classes for player card stats).
- Ensure the `clash.xml` file is present in the correct location.

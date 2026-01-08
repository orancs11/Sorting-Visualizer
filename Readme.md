# sorting-visualizer

A Java Swing application that visualizes standard sorting algorithms like Bubble Sort and Selection Sort. This tool allows you to watch the sorting process step-by-step or in real-time, helping to understand how these algorithms manipulate data.

## Features

*   **Algorithm Visualization**: Supports **Bubble Sort** and **Selection Sort**.
*   **Visual Feedback**: Displays the array as a series of bars, updating their positions as the sort progresses.
*   **Playback System**:
    *   **Record**: The application records every step of the sorting algorithm.
    *   **Replay**: Watch the recorded sorting process play back visually.
*   **Customizable**: Easily adjustable array size and meaningful separation of concerns (Logic vs. Interface).

## Getting Started

### Prerequisites

*   **Java Development Kit (JDK)**: Version 8 or higher.
*   **Maven**: For building and managing dependencies.

### Installation

1.  Clone the repository:
    ```bash
    git clone <repository-url>
    ```
2.  Navigate to the project directory:
    ```bash
    cd build-your-own-raytracer-java/main
    ```

### Usage
#### For now there is no need to use maven. Probably in later versions I will use additional libraries to make it more robust.

1.  Compile the project using Maven:
    ```bash
    mvn clean install
    ```
2.  Run the application:
    You can run the `Application.App` class directly from your IDE or via command line.
    
    The entry point is in `src/main/java/Application/App.java`.

    It initiates a random array, sorts it using Bubble Sort (by default), and then opens the visualization window to replay the sort.

## Project Structure

The codebase is organized into four main packages:

*   **`Application`**: Contains the `App` class, which is the entry point of the program. It orchestrates the setup of data, sorting, and visualization.
*   **`Interface`**: Handles the Graphical User Interface (GUI) using Java Swing.
    *   `SceneBuilder`: Main class for constructing the UI window.
    *   `BarPanel`: Custom panel for drawing the array bars.
*   **`Logic`**: Contains the core sorting algorithms and utility functions.
    *   `Sorter`: Implements `bubbleSort` and `selectionSort`, managing the sorting logic and recording steps.
    *   `Utilities`: Helper methods for array manipulation (creation, copying, swapping).
*   **`Model`**: Defines data models.
    *   `Recorder`: Stores history of array states during the sort for playback.

## Example

```java
// In Application/App.java:

// 1. Create a random array of 100 elements
int[] original = Utilities.createArray(100, true);

// 2. Sort the array and record the steps
Sorter sorter = new Sorter(original);
Recorder recorder = sorter.bubbleSort(); // key step

// 3. Visualize the result
SceneBuilder sceneBuilder = new SceneBuilder(1920, 1080);
sceneBuilder.display(original);
sceneBuilder.playRecord(recorder); // Plays back the recorded steps
```

## Contributing

Contributions are welcome! If you'd like to add more sorting algorithms (like Merge Sort or Quick Sort) or improve the UI:

1.  Fork the project.
2.  Create your feature branch (`git checkout -b feature/AmazingFeature`).
3.  Commit your changes (`git commit -m 'Add some AmazingFeature'`).
4.  Push to the branch (`git push origin feature/AmazingFeature`).
5.  Open a Pull Request.

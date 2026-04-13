# Intern Queue Sorter (Java)

## Overview
This project is a **console-based sorting program** written in Java.  
It allows users to input complaint priority levels and sorts them using either **Selection Sort** or **Bubble Sort**. The program then outputs the **lowest three priorities** to represent the intern queue.

## Features
- Parse user input of priorities (comma-separated integers)
- Choose sorting algorithm:
  - **Selection Sort** (default)
  - **Bubble Sort**
- Validate input format
- Ensure at least 3 priorities are provided
- Display the lowest three priorities after sorting

## File Structure
- `InputParser.java` → Parses comma-separated input into integer arrays
- `ComplaintService.java` → Provides logic to get the lowest three priorities
- `SelectionSort.java` → Implements selection sort algorithm
- `BubbleSort.java` → Implements bubble sort algorithm
- `SortStrategy.java` → Interface for sorting strategies
- `InternQueueSorter.java` → Main program with CLI options

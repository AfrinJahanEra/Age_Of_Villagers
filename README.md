# Age of Villagers – Village Creation System

## Overview
This project implements the village creation module of the game **Age of Villagers (AoV)** using object-oriented design principles and multiple design patterns. The system allows users to build villages composed of houses, trees, and water sources, each constructed from simple shapes. It also supports multiple operations such as cost calculation, resource estimation, and report generation on the same village structure.

The goal of this project is to demonstrate correct and practical usage of design patterns in Java.

---

## Features
- Village composed of multiple objects (House, Tree, Water Source)
- Objects built using simple shapes
- Multiple village combinations supported (e.g., Brick House + Mango Tree + Pool)
- Operations supported on the same structure:
  - Cost calculation
  - Resource estimation
  - Report generation
- Clean, extensible, and pattern-oriented design

---

## Design Patterns Used

### 1. Composite Pattern
Used to represent the hierarchical structure of the village.
- Village, House, Tree, and Water Source are composite objects
- Shapes are leaf objects
- Enables uniform treatment of individual shapes and grouped objects

Key classes:
- VillageComponent
- Shape
- CompositeObject

---

### 2. Factory Pattern
Used to centralize the creation of Shape objects.
- Encapsulates object creation logic
- Simplifies adding new shape types

Key class:
- ShapeFactory

---

### 3. Builder Pattern
Used to construct villages step by step with different combinations.
- Supports flexible village configurations
- Hides construction details from the client

Key class:
- VillageBuilder

---

### 4. Visitor Pattern
Used to perform multiple operations on the village structure without modifying its classes.
- Cost calculation
- Resource estimation
- Report generation

Key classes:
- Visitor
- CostVisitor
- ResourceVisitor
- ReportVisitor

---

## Project Structure
- VillageComponent: Common interface for all village elements
- Shape: Leaf component
- CompositeObject: Composite component
- ShapeFactory: Factory for creating shapes
- VillageBuilder: Builder for assembling villages
- Visitor and its implementations: Perform operations on the village
- Main: Demonstrates usage of the system

---

## How to Run
1. Compile all Java files.
2. Run the `Main` class.
3. The program will create multiple village combinations and display:
   - Total cost
   - Required resources
   - Generated report

---

## Conclusion
This project demonstrates how multiple design patterns can work together to solve a real-world design problem. The solution is modular, extensible, and fully satisfies the requirements of the Age of Villagers village creation scenario.

# Java Calculator

A simple desktop calculator built with Java Swing. This was my first Java project — built mostly on my own, with a little help from AI and a tutorial class.

## What It Does

- Add, subtract, multiply, and divide numbers
- Show numbers on a screen (display)
- Clear everything with **C**
- Remove the last digit with **D** (delete)

## How to Run

1. Open this folder in VS Code (with the Java extension installed).
2. Open `src/Calculator.java`.
3. Click **Run** above `main`, or run from the terminal:

```bash
javac src/Calculator.java -d bin
java -cp bin Calculator
```

The calculator window should open.

## Project Structure

```
PROJECT-IN-JAVA/
├── src/
│   ├── Calculator.java   ← Main app (the calculator)
│   └── App.java          ← Starter "Hello World" file (not used by the calculator)
├── bin/                  ← Compiled .class files (auto-generated)
└── README.md
```

> This project does not use custom Java **packages** (like `com.myapp.calculator`). All code lives in the default package inside `src/`. Below, "packages" means the **built-in Java libraries** we import.

---

## Packages We Use (Imports)

| Package | What it is for |
|---------|----------------|
| `java.awt` | Colors, fonts, and basic drawing (`Color`, `Font`) |
| `java.awt.event` | Handles button clicks (`ActionListener`, `ActionEvent`) |
| `javax.swing` | Builds the window and UI (`JFrame`, `JButton`, `JLabel`) |

### Why these matter

- **`javax.swing`** — Creates the window, buttons, and display label. Without it, there is no GUI.
- **`java.awt.event`** — When you click a button, Java calls `actionPerformed()`. `ActionListener` makes that possible.
- **`java.awt`** — Makes the calculator look nicer (gray display, white text, bigger font).

---

## Classes and Objects

### `Calculator` class

The heart of the app. It:

- Builds the window and all buttons in the **constructor** (`Calculator()`)
- Implements **`ActionListener`** so it can react to button clicks
- Runs from **`main()`** — creates a new `Calculator` and shows the window

### Important fields (variables)

| Name | Type | Purpose |
|------|------|---------|
| `jf` | `JFrame` | The main window |
| `displayLabel` | `JLabel` | Shows the number on screen (stored as **text**) |
| `sevenButton`, `plusButton`, etc. | `JButton` | Each button on the calculator |
| `oldValue` | `String` | Saves the first number before you press +, −, ×, or ÷ |
| `operator` | `String` | Remembers which operation (+, −, ×, ÷) you chose |
| `isOperatorClicked` | `boolean` | `true` after an operator — so the next digit starts a **new** number instead of adding to the old one |

### `App` class

A default VS Code starter file that prints `"Hello, World!"`. The calculator does **not** use this file. You can ignore it or delete it later.

---

## Why We Convert String to Float

The display (`JLabel`) only works with **text (String)**. When you press `7`, `1`, `.`, `5`, the code does:

```java
displayLabel.setText(displayLabel.getText() + "7");
```

So `"715"` is really the **string** `"715"`, not the number 715.

When you press **=**, we need to do **math**. Java cannot add two strings like `"10" + "5"` and get `15` — that would join them into `"105"`.

So we convert:

```java
float oldValueF = Float.parseFloat(oldValue);
float newValueF = Float.parseFloat(newValue);
result = oldValueF + newValueF;  // real math
displayLabel.setText(result + ""); // show result as text again
```

**In short:** store and show numbers as **String**, convert to **float** only when calculating, then show the result as **String** again.

We use **float** (not int) so decimals work — for example `3.14` or `10 / 4 = 2.5`.

---

## How the Delete Button Works

The **D** button removes the **last character** from the display — like backspace.

```java
String currentText = displayLabel.getText();
if (currentText.length() > 0) {
    displayLabel.setText(currentText.substring(0, currentText.length() - 1));
}
```

- **`substring(0, length - 1)`** — takes the text from the start up to (but not including) the last letter.
- Example: `"1234"` → `"123"`, `"12.5"` → `"12."`
- We check **`length() > 0`** so we do not crash on an empty display.

**Clear (C)** is different: it wipes the whole display with `setText("")`.

---

## How Calculation Flow Works

1. User types digits → text builds up on the display.
2. User presses `+`, `-`, `x`, or `/` → first number saved in `oldValue`, operator saved in `operator`.
3. User types second number.
4. User presses **=** → strings become floats, math runs, result shown.

---

## Tech Stack

- **Language:** Java
- **GUI:** Java Swing (`javax.swing`)
- **IDE:** Visual Studio Code + Java Extension Pack

## What I Learned

- Building a GUI with Swing (`JFrame`, `JButton`, `JLabel`)
- Handling events with `ActionListener`
- Storing UI data as strings and converting for math
- Basic layout with `setBounds()` (absolute positioning)

## Author

Cyclops — first Java project.

## License

This is a learning project. Feel free to use and modify it.

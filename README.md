Sudoku Solver (Java)
This project is a complete Sudoku Solver implemented in Java using backtracking and constraint checking. The solver uses recursion to fill a 9×9 grid by validating each placement according to Sudoku rules.

🧠 How It Works
The solver checks:
If placing a number in a row is valid
f placing a number in a column is valid
If placing a number in a 3×3 subgrid is valid
If the number fits all constraints, it is placed; otherwise, the algorithm backtracks and tries another number.

🔧 Features
Solves any valid 9×9 Sudoku puzzle
Uses recursion + backtracking
Validates rows, columns, and subgrids
Prints the completed Sudoku grid
Clean, modular, easy-to-understand code

📂 Project Structure
SudokuSolver.java
 ├── board[][]         // 9x9 Sudoku grid
 ├── isValid()         // checks if a number can be placed
 ├── solve()           // recursive backtracking solver
 ├── printBoard()      // prints solved grid
 └── main()            // runs the solver

🚀 How to Run
Clone the repository
Open the project in VS Code / IntelliJ / any IDE
Run SudokuSolver.java

📌 Tech Used
Java
Recursion
Backtracking
2D Arrays

📷 Output Example
Solved Sudoku:
5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9

📎 Future Improvements
Add GUI using Swing/JavaFX
Allow user-input Sudoku board
Add solver speed optimization

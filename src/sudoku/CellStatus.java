/**
 * ES234317-Algorithm and Data Structures
 * Semester Ganjil, 2023/2024
 * Group Capstone Project
 * Group #11
 * 1 - 5026221009 - Indriyani Alif Safitri
 * 2 - 5026221116 - Athaalla Rayya Genaro Iswandoko
 * 3 - 5026221127 - Mochammad Afandi Wirawan
 * 4 - 5026221197 - Hajid Alauddin Ramadhan
 */

package sudoku;
/**
 * An enumeration of constants to represent the status
 * of each cell.
 */
public enum CellStatus {
    GIVEN,         // clue, no need to guess
    TO_GUESS,      // need to guess - not attempted yet
    CORRECT_GUESS, // need to guess - correct guess
    WRONG_GUESS    // need to guess - wrong guess
    // The puzzle is solved if none of the cells have
    //  status of TO_GUESS or WRONG_GUESS
}
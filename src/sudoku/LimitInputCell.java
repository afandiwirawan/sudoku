/**
 * ES234317-Algorithm and Data Structures
 * Semester Ganjil, 2023/2024
 * Group Capstone Project
 * Group #10
 * 1 - 5026221009 - Indriyani Alif Safitri
 * 2 - 5026221116 - Athaalla Rayya Genaro Iswandoko
 * 3 - 5026221127 - Mochammad Afandi Wirawan
 * 4 - 5026221197 - Hajid Alauddin Ramadhan
 */

package sudoku;

import javax.swing.*;
import javax.swing.text.*;
import java.text.NumberFormat;

class LimitInputCell extends PlainDocument {
    private JFormattedTextField textField;
    private int limitNumber;

    LimitInputCell(int limitNumber) {
        super();
        this.limitNumber = limitNumber;
        this.textField = new JFormattedTextField(NumberFormat.getIntegerInstance());
        textField.setDocument(this); // Set document for the text field
    }

    @Override
    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {

        if (str == null) {
            return;
        }

        // Only allow digits
        if (str.matches("\\d+")) {
            if ((getLength() + str.length()) <= limitNumber) {
                super.insertString(offset, str, attr);
            }
        }
    }
}

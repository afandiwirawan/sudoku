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

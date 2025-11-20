import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Canvas {
protected char[][] canvas;

public Canvas() {
    this(10, 10);
}
// height = h width = w for the canvas 
public Canvas(int h, int w) {
     canvas = new char[h][w];

for (int r = 0; r < h; r++) {
    for (int c = 0; c < w; c++) {
         canvas[r][c] = ' '; 
            }
        }
    }
// method to paint something at its location 
public void paint(char ch, int row, int col) {
    if (row >= 0 && row < canvas.length && col >= 0 && col < canvas[0].length) {
        canvas[row][col] = ch;
        }
    }
// method to read what to do from the files and paint it on the canvas
public void paintByInstructions(File f) throws FileNotFoundException {
    Scanner sc = new Scanner(f);
    while (sc.hasNext()) {
        int row = sc.nextInt();
        int col = sc.nextInt();
        String s = sc.next();
        char ch = s.charAt(0);
        paint(ch, row, col);
        }
    sc.close();
    }
    // to string method for the canvas
public String toString() {
    String result = "";
        result += "=".repeat(canvas[0].length + 2) + "\n";

for (int r = 0; r < canvas.length; r++) {
    result += "|";
        for (int c = 0; c < canvas[0].length; c++) {
            result += canvas[r][c];  // want to put space if empty
        }
            result += "|\n";
    }
    result += "=".repeat(canvas[0].length + 2) + "\n";
    return result;
 }
}

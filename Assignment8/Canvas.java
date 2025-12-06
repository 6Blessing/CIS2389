import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Canvas {
   protected char[][] canvas;

    public Canvas() {
    this(10, 10);
    }

    public Canvas(int h, int w) {
    canvas = new char[h][w];
        for(int r = 0; r < h; r++){
         for(int c = 0; c < w; c++){
           canvas[r][c] = ' '; 
        }
      }
    }

    public void paint(char ch, int row, int col){
    if(row >= 0 && row < canvas.length &&
      col >= 0 && col < canvas[0].length){
         canvas[row][col] = ch;
        }
    }

    public void paintByInstructions(File f) throws FileNotFoundException {
      Scanner scan = new Scanner(f);
      while(scan.hasNext()){
         int r = scan.nextInt();
         int c = scan.nextInt();
         char ch = scan.next().charAt(0);
         paint(ch, r, c);
       }
        scan.close();
    }

    public String toString(){
      StringBuilder sb = new StringBuilder();

        //  top 
    sb.append("=".repeat(canvas[0].length + 2)).append("\n");

        // middle  
    for(int r = 0; r < canvas.length; r++){
      sb.append("|");
      for(int c = 0; c < canvas[0].length; c++){
       sb.append(canvas[r][c]);
            }
     sb.append("|").append("\n");
        }

        // bottom
     sb.append("=".repeat(canvas[0].length + 2));

     return sb.toString();
    }
    // flood fill
    public void fill(int r, int c, char ch){
    // if it goes otu of bounds
   if(r < 0 || r >= canvas.length || c < 0 || c >= canvas[0].length)
            return;

   // Has to be blank for the spaces
   if(canvas[r][c] != ' ')
     return;
     
   canvas[r][c] = ch;
   
   fill(r-1, c, ch);
   fill(r+1, c, ch);
   fill(r, c-1, ch);
   fill(r, c+1, ch);
    }
}
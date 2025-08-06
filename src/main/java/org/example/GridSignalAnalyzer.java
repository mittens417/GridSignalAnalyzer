package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class GridSignalAnalyzer {
    // Mission Data: The Scrambled Communications Grid
    static char[][] scrambledGrid = {
            {'C', 'H', 'A', 'R', 'L', 'I', 'E'},
            {'A', 'L', 'P', 'H', 'A'},
            {'T', 'A', 'N', 'G', 'O', '7'},
            {'B', 'R', 'A', 'V', 'O'}
    };
    public static void main(String[] args) {
        GridSignalAnalyzer analyzer = new GridSignalAnalyzer();

        System.out.println("--- PHASE 2: STANDARD FOR-LOOP MANEUVER ---");
        analyzer.analyzeWithForLoop();

        System.out.println("\n--- PHASE 3: ADVANCED FOR-EACH SWEEP ---");
        analyzer.analyzeWithForEachLoop();

        System.out.println("\n--- PHASE 4: HYBRID LOOP APPROACH ---");
        analyzer.analyzeWithHybridLoop();
    }
    public void analyzeWithForLoop(){
        for(int i = 0; i < scrambledGrid.length; i++) {
            for (int j = 0; j < scrambledGrid[i].length;j++){
                System.out.print(scrambledGrid[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void analyzeWithForEachLoop(){
        for(char[] rowArray:scrambledGrid) {
            System.out.println("Processing Row with Hash" + rowArray);
            for(char chars: rowArray) {
                System.out.println("→" + chars);
            }
            System.out.println();
        }
    }

    public void analyzeWithHybridLoop() {
        for(char[] innerArray:scrambledGrid) {
            for (int i = 0; i < innerArray.length; i++) {
                System.out.print(innerArray[i] + " ");

            }
            System.out.println();
        }
    }
}

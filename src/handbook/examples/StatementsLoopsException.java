package handbook.examples;

public class StatementsLoopsException {
    public void exampleIfOne(int i, int j) {
        if (i < j) {
            // Do your stuff
        }
    }

    public void exampleIfTwo(int i, int j) {
        if (i < j) {
            // Do your stuff
        } else {
            // Do your stuff
        }
    }

    public void exampleIfThree(int i, int j) {
        if (i < j) {
            // Do your stuff
        } else if (i == j) {
            // Do your stuff
        } else {
            // Do your stuff
        }
    }

    public void exampleWhile(int i) {
        while (i != 4) {
            // Do your stuff
            i++;
        }
    }

    public void exampleFor() {
        for (int inc = 0; inc < 4; inc++) {
            // Do your stuff
        }
    }

    public void exampleDo(int i) {
        do {
            // Do your stuff
            i++;
        } while (i != 4);
    }

    public void exampleSwitch(int j) {
        switch (j) {
            case 1:
                // Do your stuff
                break;
            case 2:
                // Do your stuff
                break;
            default:
                // Do your stuff
                break;
        }
    }

    public void exampleTryCatch() {
        try {
            //  What you want to try
        }
        catch(Exception e) {
            //  Code to handle error
        } finally {
            // Execute code after try catch
        }
    }
}

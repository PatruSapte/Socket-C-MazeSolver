
class Main{

    //args[0] == filename;
    public static void main(String args[])
    {
        String filename = args[0];
        if(MazeSolver.IsImage(filename))
        {
            Pixel wall = new Pixel(0,0,0);
            Pixel blank = new Pixel(255,255,255);
            Pixel start = new Pixel(255,0,0);
            Pixel end = new Pixel(0,0,255);
            ImageSolver solver = new ImageSolver(filename, blank, wall, start, end);

        }
        else 
        {
            Character wall = '#';
            Character blank = ' ';
            Character start = '^';
            Character end = '$';
            AsciiSolver solver = new AsciiSolver(filename, blank, wall, start, end);
        }

    }
}
